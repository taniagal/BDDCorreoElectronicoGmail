package com.sura.policycenter.selenium.definitions;


import com.sura.policycenter.selenium.steps.ProcesoDeCancelacionSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class ProcesoDeCancelacionDefinitions {

    @Steps
    ProcesoDeCancelacionSteps procesoDeCancelacionSteps;

    @When("se empiece la cancelacion")
    public void whenSeEmpieceLaCancelacion() {
        procesoDeCancelacionSteps.iniciarProcesoCancelacion();
    }

    @Then("se debe mostrar un <mensaje> de advertencia en el formulario")
    public void thenSeDebeMostrarUnmensajeDeAdvertenciaEnElFormulario(@Named("mensaje")String mensaje) {
        procesoDeCancelacionSteps.validar_mensaje_en_pantalla_aprobacion(mensaje);
    }

    @Then("debe permitir realizar la cancelacion")
    public void thenDebePermitirRealizarLaCancelacion() {
        procesoDeCancelacionSteps.realiza_cancelacion_con_autorizacion();
    }

    @Then("debe generar la autorizacion")
    public void thenDebeGenerarUnaAutorizacion() {
        procesoDeCancelacionSteps.valida_autorizacion_en_formulario();
    }

    /*
    * Escenario II
    */

    @Then("debe permitir programar la cancelacion")
    public void thenDebePermitirProgramarLaCancelacion() {
        procesoDeCancelacionSteps.inicia_la_programacion_en_poliza();
    }

    @Then("debe mostrar una ventana con un <mensaje> de autorizacion")
    public void thenDebeMostrarUnaVentanaConUnmensajeDeAutorizacion(@Named("mensaje")String mensaje) {
        procesoDeCancelacionSteps.valida_mensaje_en_pantanlla_programar_cancelacion(mensaje);
    }

}
