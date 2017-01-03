package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.GuidewireLoginSteps;
import com.sura.guidewire.policycenter.steps.SolicitarRequisitoPaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;


public class SolicitarRequisitoPaDefinitions {

    @Steps
    SolicitarRequisitoPaSteps solicitarRequisitoPaSteps;

    @Steps
    GuidewireLoginSteps guidewireLoginSteps;

    @When("existan requisitos pendientes")
    public void validarRequisitos(){
        solicitarRequisitoPaSteps.validarQueExistanRequisitosPendientes();
    }

    @Then("se debe habilitar la opcion de requisitos, con el fin de visualizar los requisitos requeridos")
    public void validarOpcionHabilitada(){
        solicitarRequisitoPaSteps.validarQueSeHabiliteLaOpcionSolicitarRequisitos();
    }

    @Then("se debe mostrar un mensaje de advertencia $mensaje")
    public void validarMensajeAdvertencia(ExamplesTable mensaje){
        solicitarRequisitoPaSteps.validarQueSeMuestreMensajeDeAdvertencia(mensaje);
    }

    @Then("se debe mostrar un mensaje bloqueante $mensajeB")
    public void validarMensajeBloqueante(ExamplesTable mensajeB){
        solicitarRequisitoPaSteps.validar_que_se_muestre_mensaje_de_bloqueo(mensajeB);
    }

    @Then("voy a validar el requisito en la aplicacion con el usuario <usuario> y contrasenia <contrasenia>")
    public void irAValidarElRequisito(@Named("usuario")String usuario, @Named("contrasenia") String contrasenia){
        solicitarRequisitoPaSteps.clicEnElBotonRequisitos();
        guidewireLoginSteps.logearse_a_policycenter_como_su(usuario, contrasenia, "Colombia");
    }

    @Then("debo ver el requisito con el estado correspondiente con la fecha del dia de hoy $requisito")
    public void validarElRequisito(ExamplesTable requisito){
        solicitarRequisitoPaSteps.validarElRequisito(requisito);
    }
}
