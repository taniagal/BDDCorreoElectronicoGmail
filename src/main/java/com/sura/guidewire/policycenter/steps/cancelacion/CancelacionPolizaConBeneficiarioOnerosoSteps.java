package com.sura.guidewire.policycenter.steps.cancelacion;

import com.sura.guidewire.policycenter.pages.cancelacion.CancelacionPolizaConBeneficiarioOnerosoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

public class CancelacionPolizaConBeneficiarioOnerosoSteps extends ScenarioSteps {

    @Page
    CancelacionPolizaConBeneficiarioOnerosoPage cancelacionPolizaConBeneficiarioOnerosoPage;

    @Step
    public void validarMensajeAdvertenciaCancelacionPoliza(ExamplesTable mensaje) {
        solicitarRequisitoPa.validarAdvertenciaRequisitos(mensaje);
    }

}
