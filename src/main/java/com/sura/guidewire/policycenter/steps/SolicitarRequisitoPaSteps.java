package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.SolicitarRequisitoPaPage;
import com.sura.guidewire.policycenter.pages.commons.NuevaCotizacionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

public class SolicitarRequisitoPaSteps extends ScenarioSteps{

    private SolicitarRequisitoPaPage solicitarRequisitoPa;
    private NuevaCotizacionPage nuevaCotizacionPage;

    @Step
    public void validarQueSeHabiliteLaOpcionSolicitarRequisitos() {
        solicitarRequisitoPa.validarOpcionHabilitada();
    }

    @Step
    public void validarQueSeMuestreMensajeDeAdvertencia(ExamplesTable mensaje){
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
    public void validar_que_se_muestre_mensaje_de_bloqueo(ExamplesTable mensajeB) {
        solicitarRequisitoPa.validarMensajeBloqueante(mensajeB);
    }
}
