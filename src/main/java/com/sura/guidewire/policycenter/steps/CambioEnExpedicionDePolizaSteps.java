package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.CambioEnExpedicionDePolizaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;


public class CambioEnExpedicionDePolizaSteps extends ScenarioSteps {

    private CambioEnExpedicionDePolizaPage cambioEnExpedicionDePolizaPage;

    public CambioEnExpedicionDePolizaSteps(Pages pages){
        super(pages);
    }

    @Step
    public void clicEnExpedirPoliza() {
        cambioEnExpedicionDePolizaPage.expedirPoliza();
    }

    @Step
    public void clicEnAceptarDelMensajeDeConfirmacion() {
        cambioEnExpedicionDePolizaPage.aceptarExpedirPoliza();
    }

    @Step
    public void validarResumenDeLaPolizaExpedida(String infoCambio, String infoPoliza, String escritorio) {
        cambioEnExpedicionDePolizaPage.validarResumenDeLaPolizaExpedida(infoCambio, infoPoliza, escritorio);
    }

    @Step
    public void clicEnCancelarDelMensajeDeConfirmacion() {
        cambioEnExpedicionDePolizaPage.cancelarExpedirPoliza();
    }
}
