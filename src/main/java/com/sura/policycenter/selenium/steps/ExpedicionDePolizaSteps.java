package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.ExpedicionDePolizaPage;
import net.thucydides.core.annotations.Step;
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
    public void validar_resumen_de_la_poliza_expedida(String numCotizacion, String poliza) {
        expedicionDePolizaPage.validarResumenDeLaPolizaExpedida(numCotizacion, poliza);
    }

    public void validar_mensaje_de_riesgos(String mensaje) {
        expedicionDePolizaPage.validarMensajeDeRiesgos(mensaje);
    }

    public void clic_en_cancelar_del_mensaje_de_confirmacion(String mensaje) {
        expedicionDePolizaPage.cancelarExpedicionDeLaPoliza(mensaje);
    }

    public void validar_que_vuelve_a_la_ventana_de_cotizacion() {
        expedicionDePolizaPage.validarCancelacionDeExpedicionDePoliza();
    }
}
