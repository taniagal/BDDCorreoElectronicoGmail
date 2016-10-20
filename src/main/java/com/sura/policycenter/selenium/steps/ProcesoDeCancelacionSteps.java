package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.ProcesoDeCancelacionPage;
import com.sura.policycenter.selenium.pages.renovacion.ReglasRenovacionDosPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ProcesoDeCancelacionSteps extends ScenarioSteps {

    ProcesoDeCancelacionPage procesoDeCancelacionPage;

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
}
