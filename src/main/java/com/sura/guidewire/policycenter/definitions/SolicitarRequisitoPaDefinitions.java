package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.SolicitarRequisitoPaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;

public class SolicitarRequisitoPaDefinitions {

    @Steps
    SolicitarRequisitoPaSteps solicitarRequisitoPaSteps;

    @Then("se debe habilitar la opcion de requisitos, con el fin de visualizar los requisitos requeridos")
    public void validarOpcionHabilitada(){
        solicitarRequisitoPaSteps.validar_Que_Se_Habilite_La_Opcion_Solicitar_Requisitos();
    }
}
