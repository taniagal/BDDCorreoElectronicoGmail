package com.sura.gw.policy.poliza.definitions;


import com.sura.gw.navegacion.definitions.IngresoAPolicyCenterDefinitions;
import com.sura.gw.navegacion.steps.GuidewireSteps;
import com.sura.gw.policy.poliza.steps.PolizaSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.StepInterceptor;
import org.hamcrest.MatcherAssert;
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


public class Poliza {

    @Managed
    public WebDriver driver;

    @Steps
    PolizaSteps polizaSteps;

    @Steps
    IngresoAPolicyCenterDefinitions guidewireLogin;

    @Steps
    GuidewireSteps guidewire;

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);


    public Boolean esperoVerNumeroDeSubscripcionEnEnvio(String numeroSubscripcion) {
        return polizaSteps.esperoVerNumeroDeSubscripcionEnEnvio(numeroSubscripcion);
    }
/*
    @Given("que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>")
    public void dadoQueEstoyEnLaInformacionDeLaPolizaConNumeroDeSubscripcionQueDeseoCambiar(@Named("numSubscripcion") String numSubscripcion) {
        LOGGER.info("Poliza.dadoQueEstoyEnLaInformacionDeLaPolizaConNumeroDeSubscripcionQueDeseoCambiar");

        // TODO: 27/07/2016 Capturar el rol desde el gherkin en i am Asesor
        guidewireLogin.dadoQueAccedoAPolicyCenterConRol("Asesor");

        guidewire.ir_a_navegacion_superior()
                .desplegar_menu_poliza().consultar_numero_de_subscripcion(numSubscripcion);

        MatcherAssert.assertThat(esperoVerNumeroDeSubscripcionEnEnvio(numSubscripcion), Is.is(Matchers.equalTo(true)));


    }*/

    @Then("espero ver mensajes de advertencia indicandome que sobrepase los limites de valores para el valor del articulo")
    public void esperoVerMensajesDeAdvertenciaIndicandomeQueSobrepaseLosLimitesDeValoresParaElValorDelArticulo() {
        entoncesValidarValoresDeSublimitesYValorAseguradoParaElValorDelArticulo();
        LOGGER.info("Poliza.esperoVerMensajesDeAdvertenciaIndicandomeQueSobrepaseLosLimitesDeValoresParaElValorDelArticulo");
    }

    public void entoncesValidarValoresDeSublimitesYValorAseguradoParaElValorDelArticulo() {

        MatcherAssert.assertThat(polizaSteps.espacioDeTrabajo(),
                Matchers.hasItems("EL valor Asegurado de la cobertura Danos materiales NO debe ser mayor al valor asegurable del Artículo Edificio"
                ));

        MatcherAssert.assertThat(polizaSteps.espacioDeTrabajo(),
                Matchers.hasItems("El valor de \"Sublimite para traslados temporales de maquinaria y equipo\" debe ser menor al valor asegurado de la cobertura \"Danos materiales\"."
                ));

        MatcherAssert.assertThat(polizaSteps.espacioDeTrabajo(),
                Matchers.hasItems("El valor de \"Sublimite para combustion espontanea de mercancias a granel\" debe ser menor al valor asegurado de la cobertura \"Danos materiales\"."
                ));
    }


    @Given("que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>")
    public void dadoQueEstoyEnResumenDeLaPolizaMRCConNumeroDePoliza(@Named("numPoliza") String numPoliza, @Named("rolUsuario") String rolUsuario) {

        guidewireLogin.dadoQueAccedoAPolicyCenterConRol(rolUsuario);

        guidewire.ir_a_navegacion_superior()
                .desplegar_menu_poliza().consultar_numero_de_poliza(numPoliza);

        LOGGER.info("Poliza.dadoQueEstoyEnResumenDeLaPolizaMRCConNumeroDePoliza");
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

    // TODO: 04/08/2016 Esto va para la definicion de informacion de la poliza
    @Then("espero ver inhabilitado para modificacion los siguientes $campos")
    public void esperoVerInhabilitadoParaModificacionLosSiguientesCampos(ExamplesTable campos) {

        // TODO: 26/07/2016 implementar forma recurrente de reportar varios asserterror en el reporte
        for (Map<String, String> fila : campos.getRows()) {
            String campo = fila.get("CAMPOS");
            MatcherAssert.assertThat("ELEMENTO ".concat(campo).concat(" NO CUMPLE CON EL CRITERIO DE BLOQUEO"), polizaSteps.elementoEsEditable(campo), Is.is(Matchers.equalTo(false)));
        }

        LOGGER.info("Poliza.esperoVerInhabilitadoParaModificacionLosSiguientesCampos");
    }
}
