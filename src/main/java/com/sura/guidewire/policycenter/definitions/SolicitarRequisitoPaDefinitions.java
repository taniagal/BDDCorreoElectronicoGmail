package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.SolicitarRequisitoPaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class SolicitarRequisitoPaDefinitions {

    @Steps
    SolicitarRequisitoPaSteps solicitarRequisitoPaSteps;

    @When("existan requisitos pendientes")
    public void validarRequisitos(){
        solicitarRequisitoPaSteps.validar_Que_Existan_Requisitos_Pendientes();
    }

    @Then("se debe habilitar la opcion de requisitos, con el fin de visualizar los requisitos requeridos")
    public void validarOpcionHabilitada(){
        solicitarRequisitoPaSteps.validar_Que_Se_Habilite_La_Opcion_Solicitar_Requisitos();
    }

    @Then("se debe mostrar un mensaje de advertencia $mensaje")
    public void validarMensajeAdvertencia(ExamplesTable mensaje){
        solicitarRequisitoPaSteps.validar_Que_Se_Muestre_Mensaje_De_Advertencia(mensaje);
    }
}
