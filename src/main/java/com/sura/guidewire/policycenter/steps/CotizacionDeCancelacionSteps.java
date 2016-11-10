package com.sura.guidewire.policycenter.steps;


import com.sura.guidewire.policycenter.pages.CotizacionDeCancelacionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CotizacionDeCancelacionSteps extends ScenarioSteps {


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
