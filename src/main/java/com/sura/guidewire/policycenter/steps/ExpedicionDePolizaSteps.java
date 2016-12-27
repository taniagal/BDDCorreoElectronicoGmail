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
    public void clicEnExpedirPoliza() {
        expedicionDePolizaPage.expedirPoliza();
    }
    @Step
    public void clicEnVerCotizacion(){
        expedicionDePolizaPage.ingresarVerCotizacion();
    }

    @Step
    public void clicEnAceptarDelMensajeDeConfirmacion() {
        expedicionDePolizaPage.aceptarExpedirPoliza();
    }

    @Step
    public void validarResumenDeLaPolizaExpedida(String infoCotizacion, String infoPoliza, String admorCotizacion,
                                                 String nuevaCotizacion, String escritorio) {
        expedicionDePolizaPage.validarResumenDeLaPolizaExpedida(infoCotizacion, infoPoliza, admorCotizacion,
                nuevaCotizacion, escritorio);
    }

    @Step
    public void clicEnCancelarDelMensajeDeConfirmacion(String mensaje) {
        expedicionDePolizaPage.cancelarExpedicionDeLaPoliza(mensaje);
    }

    @Step
    public void validar_mensaje(String mensaje) {
        panelSurEspacioDeTrabajoPage.abrirPanelInferior();
        panelSurEspacioDeTrabajoPage.validarMensaje(mensaje);
    }

    @Step
    public void validar_mensaje_direccion(String mensaje) {
        panelSurEspacioDeTrabajoPage.abrirPanelInferior();
        panelSurEspacioDeTrabajoPage.validarMensajeDireccion(mensaje);
    }

    @Step
    public void validar_que_vuelve_a_la_ventana_de_cotizacion() {
        expedicionDePolizaPage.validarCancelacionDeExpedicionDePoliza();
    }

    public void clic_en_expedir_poliza_por_cambio() {
        expedicionDePolizaPage.expedirPolizaPorCambio();
    }

    @Step
    public void validarMensajeRequisitos(String requisitos) {
        expedicionDePolizaPage.validarMensajeRequisitos(requisitos);
    }

    @Step
    public void clicEnAceptarDelMensajeDeConfirmacionYRequisitos() {
        expedicionDePolizaPage.aceptarExpedirPolizaConRequisitosPendientes();
    }

    @Step
    public void continuarExpedicionConRequisitos() {
        expedicionDePolizaPage.aceptarMensajeRequisitosPendientes();
    }
}
