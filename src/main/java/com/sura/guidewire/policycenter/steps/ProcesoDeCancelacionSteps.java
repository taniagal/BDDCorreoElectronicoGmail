package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.CotizacionDeCancelacionPage;
import com.sura.guidewire.policycenter.pages.ProcesoDeCancelacionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ProcesoDeCancelacionSteps extends ScenarioSteps {

    ProcesoDeCancelacionPage procesoDeCancelacionPage;
    CotizacionDeCancelacionPage cotizacionDeCancelacionPage;

    @Step
    public void iniciarProcesoCancelacion() {
        procesoDeCancelacionPage.iniciarProcesoCancelacion();
    }

    @Step
    public void validar_mensaje_en_pantalla_aprobacion(String mensaje) {
        procesoDeCancelacionPage.validaMensajeAprobacion(mensaje);
    }

    @Step
    public void realiza_cancelacion_con_autorizacion() {
        procesoDeCancelacionPage.cancelacioConAutorizacion();
    }

    @Step
    public void valida_autorizacion_en_formulario() {
        procesoDeCancelacionPage.validaAutorizacionEnFormulario();
        procesoDeCancelacionPage.cerrarTransaccionEnValidacion();
    }

    @Step
    public void inicia_la_programacion_en_poliza() {
        procesoDeCancelacionPage.iniciaProgramacionDeCancelacion();
    }

    @Step
    public void valida_mensaje_en_pantanlla_programar_cancelacion(String mensaje) {
        procesoDeCancelacionPage.validaVentanaMensaje(mensaje);
        cotizacionDeCancelacionPage.cerrarTransaccionPoliza();
    }
}
