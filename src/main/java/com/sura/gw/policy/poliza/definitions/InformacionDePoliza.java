package com.sura.gw.policy.poliza.definitions;


import com.sura.gw.navegacion.definitions.IngresoAPolicyCenterDefinitions;
import com.sura.gw.navegacion.definitions.Navegacion;
import com.sura.gw.policy.poliza.steps.InformacionDePolizaSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.StepInterceptor;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;

import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

public class InformacionDePoliza {

    @Managed
    public WebDriver driver;

    @Steps
    InformacionDePolizaSteps informacionDePolizaSteps;

    @Steps
    IngresoAPolicyCenterDefinitions guidewire;

    @Steps
    Navegacion navegacion;

    @Steps
    InformacionDePoliza informacionDePoliza;


    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);


    public Boolean esperoVerNumeroDeSubscripcionEnEnvio(String numeroSubscripcion) {
        return informacionDePolizaSteps.esperoVerNumeroDeSubscripcionEnEnvio(numeroSubscripcion);
    }

    public void cuandoEditeInformacionDeLaPoliza() {
        informacionDePolizaSteps.seleccionar_boton_llamado_editar_transaccion_de_poliza();
    }

    public void cuandoDeseeIngresarArticuloAUnaUbicacion() {
        informacionDePolizaSteps.seleccionar_boton_agregar_articulo_a_una_ubicacion();
    }

    public void cuandoIntenteIngresarUnArticuloAUnaUbicacionParaComprobarValidacionesDeErrorDelArticulo() {
        informacionDePolizaSteps.seleccionar_check_del_articulo_a_agregar();
        informacionDePolizaSteps.seleccionar_check_de_cobertura_que_desea_aplicar();

        /*
        Se ingresa valor asegurado superior al valor del articulo a asegurar y se ingresa valores a sublimites
        que superen el valor asegurado con el fin de validar en el paso de comprobaciones que se verifiquen los limites
        de valores para valor asegurado y sublimites.
         */
        informacionDePolizaSteps.ingresar_valor_reconstruccion_del_articulo("10000");
        informacionDePolizaSteps.ingresar_valor_asegurado_danos_materiales("10001");
        informacionDePolizaSteps.ingresar_valor_sublimite_translados("10002");
        informacionDePolizaSteps.ingresar_valor_sublimite_para_combustion("10002");
        informacionDePolizaSteps.seleccionar_boton_aceptar_para_agregar_articulo();
    }

    @Given("que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>")
    public void dadoQueEstoyEnLaInformacionDeLaPolizaConNumeroDeSubscripcionQueDeseoCambiar(@Named("numSubscripcion") String numSubscripcion) {
        LOGGER.info("InformacionDePoliza.dadoQueEstoyEnLaInformacionDeLaPolizaConNumeroDeSubscripcionQueDeseoCambiar");

            // TODO: 27/07/2016 Capturar el rol desde el gherkin en i am Asesor
            guidewire.dadoQueAccedoAPolicyCenterConRol("Asesor");
            navegacion.cuandoSeleccioneOpcionDesplegableDeMenuSuperiorPoliza();
            navegacion.cuandoBusquePorNumeroDeSubscripcionDePoliza(numSubscripcion);

            assertThat(informacionDePoliza.esperoVerNumeroDeSubscripcionEnEnvio(numSubscripcion), is(equalTo(true)));



    }

    @When("cuando intente ingresar un articulo para una ubicacion para comprobar las validaciones de error del articulo")
    public void cuandoIntenteIngresarUnArticuloParaUnaUbicacionParaComprobarLasValidacionesDeErrorDelArticulo() {

        try {
            informacionDePoliza.cuandoEditeInformacionDeLaPoliza();
        } catch (Exception e) {
            LOGGER.info("BOTON EDITAR TRANSACCION NO ENCONTRADO");
        }

        informacionDePolizaSteps.seleccionar_opcion_edificios_y_ubicaciones();
        informacionDePoliza.cuandoDeseeIngresarArticuloAUnaUbicacion();
        informacionDePoliza.cuandoIntenteIngresarUnArticuloAUnaUbicacionParaComprobarValidacionesDeErrorDelArticulo();

        LOGGER.info("InformacionDePoliza.cuandoIntenteIngresarUnArticuloParaUnaUbicacionParaComprobarLasValidacionesDeErrorDelArticulo");
    }


    @Then("espero ver mensajes de advertencia indicandome que sobrepase los limites de valores para el valor del articulo")
    public void esperoVerMensajesDeAdvertenciaIndicandomeQueSobrepaseLosLimitesDeValoresParaElValorDelArticulo() {
        informacionDePoliza.entoncesValidarValoresDeSublimitesYValorAseguradoParaElValorDelArticulo();
        LOGGER.info("InformacionDePoliza.esperoVerMensajesDeAdvertenciaIndicandomeQueSobrepaseLosLimitesDeValoresParaElValorDelArticulo");
    }

    public void entoncesValidarValoresDeSublimitesYValorAseguradoParaElValorDelArticulo() {
        assertThat(informacionDePolizaSteps.espacioDeTrabajo(),
                hasItems("EL valor Asegurado de la cobertura Danos materiales NO debe ser mayor al valor asegurable del Artículo Edificio"
                ));

        assertThat(informacionDePolizaSteps.espacioDeTrabajo(),
                hasItems("El valor de \"Sublimite para traslados temporales de maquinaria y equipo\" debe ser menor al valor asegurado de la cobertura \"Danos materiales\"."
                ));

        assertThat(informacionDePolizaSteps.espacioDeTrabajo(),
                hasItems("El valor de \"Sublimite para combustion espontanea de mercancias a granel\" debe ser menor al valor asegurado de la cobertura \"Danos materiales\"."
                ));
    }


    @Given("que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza>")
    public void dadoQueEstoyEnResumenDeLaPolizaMRCConNumeroDePoliza(@Named("numPoliza") String numPoliza) {

        // TODO: 27/07/2016 Capturar el rol desde el gherkin en i am Asesor
        guidewire.dadoQueAccedoAPolicyCenterConRol("Asesor");
        navegacion.cuandoSeleccioneOpcionDesplegableDeMenuSuperiorPoliza();
        navegacion.cuandoBusquePorNumeroDeDePoliza(numPoliza);

        LOGGER.info("InformacionDePoliza.dadoQueEstoyEnResumenDeLaPolizaMRCConNumeroDePoliza");
    }

    @When("cuando intente cambiar informacion de la poliza MRC")
    public void cuandoIntenteCambiarInformacionDeLaPolizaMRC() {
        LOGGER.info("InformacionDePoliza.cuandoIntenteCambiarInformacionDeLaPolizaMRC");

            informacionDePolizaSteps.seleccionar_boton_acciones();
            informacionDePolizaSteps.seleccionar_opcion_cambiar_poliza();
            informacionDePolizaSteps.seleccionarBotonSiguienteParaIniciarCambioEnPoliza();
            informacionDePolizaSteps.seleccionar_opcion_informacion_de_poliza();
    }

    @Then("espero ver inhabilitado para modificacion los siguientes $campos")
    public void esperoVerInhabilitadoParaModificacionLosSiguientesCampos(ExamplesTable campos) {

        // TODO: 26/07/2016 implementar forma recurrente de reportar varios asserterror en el reporte
        for (Map<String, String> fila : campos.getRows()) {
            String campo = fila.get("CAMPOS");
            assertThat("ELEMENTO ".concat(campo).concat(" NO CUMPLE CON EL CRITERIO DE BLOQUEO"), informacionDePolizaSteps.elementoEsEditable(campo), is(equalTo(false)));
        }

        LOGGER.info("InformacionDePoliza.esperoVerInhabilitadoParaModificacionLosSiguientesCampos");
    }

    @When("cuando intente ingresar una ubicacion para comprobar las validaciones de riesgos consultables")
    public void cuandoIntenteIngresarUnaUbicacionParaComprobarLasValidacionesDeRiesgosConsultables() {
        LOGGER.info("InformacionDePoliza.cuandoIntenteIngresarUnaUbicacionParaComprobarLasValidacionesDeRiesgosConsultables");

            try {
                informacionDePoliza.cuandoEditeInformacionDeLaPoliza();
            } catch (Exception e) {
                LOGGER.info("BOTON EDITAR TRANSACCION NO ENCONTRADO");
            }

            informacionDePolizaSteps.seleccionar_opcion_edificios_y_ubicaciones();
            informacionDePolizaSteps.ingresar_nueva_ubicacion();
    }


    @Then("espero ver mensajes de advertencia indicandome la direccion es un riesgo consultable")
    public void entoncesEsperoVerMensajeDeAdvertenciaQueUbicacionEsRiesgoConsultable() {
        assertThat(informacionDePolizaSteps.espacioDeTrabajo(),
                contains("La dirección un riesgo no estandar y debe ser analizado por el Comité de Evaluación, por favor tramite el caso con el Gerente o Director Comercial."
                ));

    }



}
