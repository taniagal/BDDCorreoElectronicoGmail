package com.sura.guidewire.policycenter.definitions.cancelacion;

import com.sura.guidewire.policycenter.steps.cancelacion.CancelacionPolizaConBeneficiarioOnerosoSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.model.ExamplesTable;

public class CancelacionPolizaConBeneficiarioOnerosoDefinitions {

    @Steps
    CancelacionPolizaConBeneficiarioOnerosoSteps cancelacionPolizaConBeneficiarioOnerosoSteps;


    @Then("se debe mostrar mensaje de advertencia al cancelar poliza $mensaje")
    public void validarMensajeAdvertenciaCancelacion(ExamplesTable mensaje) {
        CancelacionPolizaConBeneficiarioOnerosoSteps.validarMensajeAdvertenciaCancelacionPoliza(mensaje);
    }



}
