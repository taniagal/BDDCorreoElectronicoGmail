package com.sura.gw.policy.poliza.definitions;


import com.sura.gw.navegacion.definitions.IngresoAPolicyCenterDefinitions;
import com.sura.gw.navegacion.steps.GuidewireSteps;
import com.sura.gw.policy.poliza.steps.InstruccionesPreviasARenovacionSteps;
import com.sura.gw.policy.poliza.steps.PolizaSteps;
import com.sura.gw.util.AssertUtil;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.StepInterceptor;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;

import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class Poliza {

    @Managed
    public WebDriver driver;

    @Steps
    PolizaSteps polizaSteps;

    @Steps
    IngresoAPolicyCenterDefinitions guidewireLogin;

    @Steps GuidewireSteps guidewire;
    @Steps InstruccionesPreviasARenovacionSteps instruccionesPreviasARenovacionSteps;

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);


    public Boolean esperoVerNumeroDeSubscripcionEnEnvio(String numeroSubscripcion) {
        return polizaSteps.esperoVerNumeroDeSubscripcionEnEnvio(numeroSubscripcion);
    }


    @Given("que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>")
    public void dadoQueEstoyEnResumenDeLaPolizaMRCConNumeroDePoliza(@Named("numPoliza") String numPoliza, @Named("rolUsuario") String rolUsuario) {

        if (SerenityWebdriverManager.inThisTestThread().hasAnInstantiatedDriver()) {
            SerenityWebdriverManager.inThisTestThread().resetCurrentDriver();
        }

        guidewireLogin.dadoQueAccedoAPolicyCenterConRol(rolUsuario);

        guidewire.ir_a_navegacion_superior()
                .desplegar_menu_poliza().consultar_numero_de_poliza(numPoliza);

        LOGGER.info("Poliza.dadoQueEstoyEnResumenDeLaPolizaMRCConNumeroDePoliza");
    }

    @Then("espero ver mensajes de advertencia indicandome que sobrepase los limites de valores para el valor del articulo")
    public void esperoVerMensajesDeAdvertenciaIndicandomeQueSobrepaseLosLimitesDeValoresParaElValorDelArticulo() {
        entoncesValidarValoresDeSublimitesYValorAseguradoParaElValorDelArticulo();
        LOGGER.info("Poliza.esperoVerMensajesDeAdvertenciaIndicandomeQueSobrepaseLosLimitesDeValoresParaElValorDelArticulo");
    }

    public void entoncesValidarValoresDeSublimitesYValorAseguradoParaElValorDelArticulo() {

        assertThat(polizaSteps.espacioDeTrabajo(),
                Matchers.hasItems("EL valor Asegurado de la cobertura Danos materiales NO debe ser mayor al valor asegurable del Artículo Edificio"
                ));

        assertThat(polizaSteps.espacioDeTrabajo(),
                Matchers.hasItems("El valor de \"Sublimite para traslados temporales de maquinaria y equipo\" debe ser menor al valor asegurado de la cobertura \"Danos materiales\"."
                ));

        assertThat(polizaSteps.espacioDeTrabajo(),
                Matchers.hasItems("El valor de \"Sublimite para combustion espontanea de mercancias a granel\" debe ser menor al valor asegurado de la cobertura \"Danos materiales\"."
                ));
    }



    @Given("que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>")
    public void dadoQueEstoyEnLaInformacionDeLaPolizaConNumeroDeSubscripcionQueDeseoCambiar(@Named("numSubscripcion") String numSubscripcion) {
        LOGGER.info("Poliza.dadoQueEstoyEnLaInformacionDeLaPolizaConNumeroDeSubscripcionQueDeseoCambiar");

        // TODO: 27/07/2016 Capturar el rol desde el gherkin en i am Asesor
        guidewireLogin.dadoQueAccedoAPolicyCenterConRol("Asesor");

        guidewire.ir_a_navegacion_superior()
                .desplegar_menu_poliza().consultar_numero_de_subscripcion(numSubscripcion);

        assertThat(esperoVerNumeroDeSubscripcionEnEnvio(numSubscripcion), Is.is(Matchers.equalTo(true)));


    }

    // TODO: 04/08/2016 Esto va para la definicion de informacion de la poliza
    @When("cuando intente cambiar informacion de la poliza MRC")
    public void cuandoIntenteCambiarInformacionDeLaPolizaMRC() {
        LOGGER.info("Poliza.cuandoIntenteCambiarInformacionDeLaPolizaMRC");

        polizaSteps.seleccionar_boton_acciones();
        polizaSteps.seleccionar_opcion_cambiar_poliza();
        polizaSteps.seleccionarBotonSiguienteParaIniciarCambioEnPoliza();
        polizaSteps.seleccionar_opcion_informacion_de_poliza();
    }

    @When("desee seleccionar instrucciones previas a la renovacion")
    public void cuandoDeseeSeleccionarInstruccionesPreviasALaRenovacion() {
        LOGGER.info("Poliza.cuandoDeseeRealizarInstruccionesPreviasALaRenovacion");
        polizaSteps.seleccionar_boton_acciones().
                seleccionar_instrucciones_previas_a_la_renovacion();

        instruccionesPreviasARenovacionSteps.seleccionar_boton_editar().
                desplegar_lista_instruccion();
    }

    @When("ingrese los motivos de cancelacion de la poliza fuente: $fuente, Motivo: $motivo, Descripción: $descripcion")
    public void cuandoIngreseLosMotivosDeCancelacion(String fuente, String motivo, String descripcion) {
        LOGGER.info("Poliza.cuandoIngreseLosMotivosDeCancelacion");
        polizaSteps.seleccionar_boton_acciones().seleccionar_cancelar_poliza();
        polizaSteps.ingresar_motivos_cancelacion(fuente, motivo, descripcion);
    }

    @When("realice la cancelacion de poliza")
    public void cuandoRealiceCancelacionDeLaPoliza() {
        LOGGER.info("Poliza.cuandoRealiceCancelacionDeLaPoliza");
        polizaSteps.iniciar_cancelacion_de_poliza();
        polizaSteps.seleccionar_opcion_compromiso();
        polizaSteps.seleccionar_opcion_cancelar_ahora();
        polizaSteps.confirmar_cancelacion();

    }

    @When("despliegue $opcion")
    public void cuandoDespliegue(String opcion) {
        LOGGER.info("Poliza.cuandoDespliegue");
        instruccionesPreviasARenovacionSteps.desplegar_lista_opcion(opcion);
    }

    @When("seleccione instruccion $instruccion previa a la renovacion")
    public void cuandoSeleccioneInstruccionPreviaALaRenovacion(String instruccion) {
        LOGGER.info("Poliza.cuandoSeleccioneInstruccionPreviaALaRenovacion");
        instruccionesPreviasARenovacionSteps.seleccionar_instruccion(instruccion);
    }

    // TODO: 04/08/2016 Esto va para la definicion de informacion de la poliza
    @Then("espero ver inhabilitado para modificacion los siguientes $campos")
    public void esperoVerInhabilitadoParaModificacionLosSiguientesCampos(ExamplesTable campos) {

        // TODO: 26/07/2016 implementar forma recurrente de reportar varios asserterror en el reporte
        for (Map<String, String> fila : campos.getRows()) {
            String campo = fila.get("CAMPOS");
            assertThat("ELEMENTO ".concat(campo).concat(" NO CUMPLE CON EL CRITERIO DE BLOQUEO"), polizaSteps.elementoEsEditable(campo), Is.is(Matchers.equalTo(false)));
        }

        LOGGER.info("Poliza.esperoVerInhabilitadoParaModificacionLosSiguientesCampos");
    }

    @Then("espero ver las opciones de instrucciones siguientes $instrucciones")
    public void esperoVerLasOpcionesDeInstruccionesSiguientes(ExamplesTable instrucciones) {
        LOGGER.info("Poliza.esperoVerLasOpcionesDeInstruccionesSiguientes");
        for (Map<String, String> fila : instrucciones.getRows()) {
            String instruccion = fila.get("INSTRUCCIONES");
            org.hamcrest.MatcherAssert.assertThat(instruccionesPreviasARenovacionSteps.instruccionesPreviasARenovacionPage.obtenerInstruccionesDisponibles(), AssertUtil.hasItemContainsString(instruccion));
        }
    }

    @Then("debe visualizarse las siguientes razones $razones")
    public void esperoVisualizarLasSiguientesRazones(ExamplesTable razones) {
        LOGGER.info("Poliza.esperoVerLasOpcionesDeInstruccionesSiguientes");
        for (Map<String, String> fila : razones.getRows()) {
            String razon = fila.get("RAZONES");
            org.hamcrest.MatcherAssert.assertThat(instruccionesPreviasARenovacionSteps.instruccionesPreviasARenovacionPage.obtenerListaRazonesDeRenovacion(), AssertUtil.hasItemContainsString(razon));
        }
    }
    @Then("la cancelacion de la poliza es correcta si se muestra el texto: $tituloDePagina")
    public void entoncesLaCancionDeLaPolizaEsCorrecta(String tituloDePagina) {
        LOGGER.info("Poliza.entoncesLaCancionDeLaPolizaEsCorrecta");
        assertThat(polizaSteps.obtenerTituloPagina(), equalTo(tituloDePagina));
    }

}
