package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.AprobacionDeAnalisisDeRiesgoPage;
import com.sura.guidewire.policycenter.pages.CambioEnExpedicionDePolizaPage;
import com.sura.guidewire.policycenter.pages.tarifacion.TarifaTasaUnicaPage;
import com.sura.guidewire.policycenter.utils.menu.opciones.cuenta.OpcionesInformacionPolizaMrcPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;


public class CambioEnExpedicionDePolizaSteps extends ScenarioSteps {

    @Page
    CambioEnExpedicionDePolizaPage expedicionDePolizaPage;

    @Page
    TarifaTasaUnicaPage tasaUnicaPage;

    @Page
    OpcionesInformacionPolizaMrcPage polizaMrcPage;

    @Page
    AprobacionDeAnalisisDeRiesgoPage analisisDeRiesgoPage;

    public CambioEnExpedicionDePolizaSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void cotizarYExpedirCambioDePoliza() {
        tasaUnicaPage.nuevoCambioDePoliza();
        polizaMrcPage.seleccionarOpcionCotizar();
        analisisDeRiesgoPage.expedirPoliza();
    }

    @Step
    public void clicEnAceptarDelMensajeDeConfirmacion() {
        expedicionDePolizaPage.aceptarExpedirPoliza();
    }

    @Step
    public void validarResumenDeLaPolizaExpedida(String infoCambio, String infoPoliza, String escritorio) {
        expedicionDePolizaPage.validarResumenDeLaPolizaExpedida(infoCambio, infoPoliza, escritorio);
    }
}
