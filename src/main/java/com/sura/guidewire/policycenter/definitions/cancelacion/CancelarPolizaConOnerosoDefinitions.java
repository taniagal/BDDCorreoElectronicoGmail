package com.sura.guidewire.policycenter.definitions.cancelacion;

import com.sura.guidewire.policycenter.steps.cancelacion.CancelacionPolizaConBeneficiarioOnerosoSteps;
import com.sura.guidewire.policycenter.steps.poliza.PolizaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.model.ExamplesTable;

public class CancelarPolizaConOnerosoDefinitions {

    @Steps
    CancelacionPolizaConBeneficiarioOnerosoSteps cancelacionPolizaConBeneficiarioOnerosoSteps;

    @Steps
    PolizaSteps polizaSteps;


    @Then("se debe mostrar mensaje de advertencia al cancelar poliza $mensaje")
    public void validarMensajeAdvertenciaCancelacion(ExamplesTable mensaje) {
        cancelacionPolizaConBeneficiarioOnerosoSteps.validarMensajeAdvertenciaCancelacionPoliza(mensaje);
    }

    @Then("se debe visualizar mensaje de advertencia al cancelar poliza por opciones de compromiso $mensajeCancelar")
    public void validarMensajeAdvertenciaCancelacionCompromiso(ExamplesTable mensajeCancelar){
        polizaSteps.seleccionarOpcionCompromiso();
        polizaSteps.seleccionarOpcionCancelarAhora();
        polizaSteps.confirmarCancelacion();
        cancelacionPolizaConBeneficiarioOnerosoSteps.validarMensajeCompromisoCancelacion(mensajeCancelar);
    }
}
