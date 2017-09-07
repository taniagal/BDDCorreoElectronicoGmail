package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.commons.NuevaCotizacionPage;
import com.sura.guidewire.policycenter.pages.poliza.SolicitarRequisitoPaPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

public class SolicitarRequisitoPaSteps extends ScenarioSteps {

    @Page
    private SolicitarRequisitoPaPage solicitarRequisitoPa;
    @Page
    private NuevaCotizacionPage nuevaCotizacionPage;

    @Step
    public void validarQueSeMuestreMensajeDeAdvertencia(ExamplesTable mensaje) {
        solicitarRequisitoPa.validarAdvertenciaRequisitos(mensaje);
    }

    @Step
    public void validarQueExistanRequisitosPendientes() {
        solicitarRequisitoPa.validarRequisitos();
    }

    @Step
    public void llenarInfoPoliza() {
        nuevaCotizacionPage.llenarInfoPoliza();
    }

    @Step
    public void validarQueSeMuestreMensajeDeBloqueo(ExamplesTable mensajeB) {
        solicitarRequisitoPa.validarMensajeBloqueante(mensajeB);
    }
}
