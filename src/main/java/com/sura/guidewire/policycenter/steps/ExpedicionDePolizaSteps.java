package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.CotizacionMRCPage;
import com.sura.guidewire.policycenter.pages.ExpedicionDePolizaPage;
import com.sura.guidewire.policycenter.pages.PanelSurEspacioDeTrabajoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class ExpedicionDePolizaSteps extends ScenarioSteps {

    ExpedicionDePolizaPage expedicionDePolizaPage;
    PanelSurEspacioDeTrabajoPage panelSurEspacioDeTrabajoPage;
    CotizacionMRCPage cotizacionMRCPage;


    @Step
    public void navegar_barra_superior(String cotizacion) {
        cotizacionMRCPage.irABuscarCotizacion(cotizacion);
    }

    @Step
    public void clic_en_expedir_poliza() {
        expedicionDePolizaPage.expedirPoliza();
    }
    @Step
    public void clic_en_ver_cotizacion(){
        expedicionDePolizaPage.ingresarVerCotizacion();
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
        panelSurEspacioDeTrabajoPage.abrirPanelInferior();
        panelSurEspacioDeTrabajoPage.validarMensaje(mensaje);
    }

    @Step
    public void validar_que_vuelve_a_la_ventana_de_cotizacion() {
        expedicionDePolizaPage.validarCancelacionDeExpedicionDePoliza();
    }

    public void clic_en_expedir_poliza_por_cambio() {
        expedicionDePolizaPage.expedirPolizaPorCambio();
    }

    @Step
    public void validarMensajeRequisitos() {
        expedicionDePolizaPage.validarMensajeRequisitos();
    }
}
