package com.sura.guidewire.policycenter.steps.cancelacion;

import com.sura.guidewire.policycenter.pages.cancelacion.CotizacionDeCancelacionPage;
import com.sura.guidewire.policycenter.pages.cancelacion.ProcesoDeCancelacionPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.fluentlenium.core.annotation.Page;

public class ProcesoDeCancelacionSteps extends ScenarioSteps {

    @Page
    ProcesoDeCancelacionPage procesoDeCancelacionPage;
    @Page
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
    public void darClicBotonDetalle() {
        procesoDeCancelacionPage.darClicBotonDetalle();
    }

    @Step
    public void inicia_la_programacion_en_poliza() {
        procesoDeCancelacionPage.iniciaProgramacionDeCancelacion();
    }

    @Step
    public void valida_mensaje_en_pantanlla_programar_cancelacion(String mensaje) {
        procesoDeCancelacionPage.validaVentanaMensaje(mensaje);

    }

    @Step
    public void cerrar_cancelacion_opcion_retirar_transaccion() {
        cotizacionDeCancelacionPage.cerrarTransaccionPoliza();
    }
}
