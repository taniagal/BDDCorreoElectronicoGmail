package com.sura.guidewire.policycenter.steps.cancelacion;


import com.sura.guidewire.policycenter.pages.cancelacion.CotizacionDeCancelacionPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.fluentlenium.core.annotation.Page;

public class CotizacionDeCancelacionSteps extends ScenarioSteps {

    @Page
    CotizacionDeCancelacionPage cotizacionDeCancelacionPage;

    @Step
    public void llenar_formulario_cancelacion() {
        cotizacionDeCancelacionPage.ingresaDatosFormulario();
    }

    @Step
    public void validar_campos_en_formulario_de_cancelacion() {
        cotizacionDeCancelacionPage.validacionesCamposPoliza();
    }
}
