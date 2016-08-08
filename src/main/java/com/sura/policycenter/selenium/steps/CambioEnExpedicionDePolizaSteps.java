package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.CambioEnExpedicionDePolizaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;


public class CambioEnExpedicionDePolizaSteps extends ScenarioSteps {

    private CambioEnExpedicionDePolizaPage cambioEnExpedicionDePolizaPage;

    public CambioEnExpedicionDePolizaSteps(Pages pages){
        super(pages);
    }

    @Step
    public void clic_en_expedir_poliza() {
        cambioEnExpedicionDePolizaPage.expedirPoliza();
    }

    @Step
    public void clic_en_aceptar_del_mensaje_de_confirmacion() {
        cambioEnExpedicionDePolizaPage.aceptarExpedirPoliza();
    }

    @Step
    public void validar_resumen_de_la_poliza_expedida(String infoCambio, String infoPoliza, String escritorio) {
        cambioEnExpedicionDePolizaPage.validarResumenDeLaPolizaExpedida(infoCambio, infoPoliza, escritorio);
    }

    @Step
    public void clic_en_cancelar_del_mensaje_de_confirmacion() {
        cambioEnExpedicionDePolizaPage.cancelarExpedirPoliza();
    }
}
