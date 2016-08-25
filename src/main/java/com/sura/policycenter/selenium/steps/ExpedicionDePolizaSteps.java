package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.ExpedicionDePolizaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;


public class ExpedicionDePolizaSteps extends ScenarioSteps {

    ExpedicionDePolizaPage expedicionDePolizaPage;

    @Step
    public void navegar_barra_superior(String cotizacion) {
        expedicionDePolizaPage.irABuscarCotizacion(cotizacion);
    }

    @Step
    public void clic_en_expedir_poliza() {
        expedicionDePolizaPage.expedirPoliza();
    }

    @Step
    public void clic_en_aceptar_del_mensaje_de_confirmacion() {
        expedicionDePolizaPage.aceptarExpedirPoliza();
    }

    @Step
    public void validar_resumen_de_la_poliza_expedida(String infoCotizacion, String infoPoliza, String admorCotizacion,
                                                      String nuevaCotizacion, String escritorio) {
        expedicionDePolizaPage.validarResumenDeLaPolizaExpedida(infoCotizacion, infoPoliza, admorCotizacion,
                nuevaCotizacion, escritorio);
    }

    @Step
    public void clic_en_cancelar_del_mensaje_de_confirmacion(String mensaje) {
        expedicionDePolizaPage.cancelarExpedicionDeLaPoliza(mensaje);
    }

    @Step
    public void validar_mensaje(String mensaje) {
        expedicionDePolizaPage.validarMensaje(mensaje);
    }


    @Step
    public void validar_que_vuelve_a_la_ventana_de_cotizacion() {
        expedicionDePolizaPage.validarCancelacionDeExpedicionDePoliza();
    }
}
