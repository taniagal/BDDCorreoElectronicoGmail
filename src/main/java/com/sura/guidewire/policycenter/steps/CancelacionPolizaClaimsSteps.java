package com.sura.guidewire.policycenter.steps;


import com.sura.guidewire.policycenter.pages.CancelacionPolizaClaimsPage;
import com.sura.guidewire.policycenter.pages.CotizacionDeCancelacionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CancelacionPolizaClaimsSteps extends ScenarioSteps {

    CancelacionPolizaClaimsPage cancelacionPolizaClaimsPage;
    CotizacionDeCancelacionPage cotizacionDeCancelacionPage;

    @Step
    public void ingresar_motivo_de_cancelacion(String motivo) {
        cancelacionPolizaClaimsPage.ingresaMotivoCancelacion(motivo);
    }

    @Step
    public void valida_se_inicie_la_cancelacion() {
        cancelacionPolizaClaimsPage.validaInicioCancelacion();
        cotizacionDeCancelacionPage.cerrarTransaccionPoliza();
    }

    @Step
    public void iniciar_cancelacion() {
        cancelacionPolizaClaimsPage.cancelarTransaccion();
    }

    @Step
    public void valida_mensaje_inicio_cancelacion(String mensaje) {
        cancelacionPolizaClaimsPage.validaMensajeNoCancelacionMotivoClaims(mensaje);
    }
}
