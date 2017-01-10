package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.GeneracionUwIssueRiesgosConsultablesPaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class GeneracionUwIssueRiesgosConsultablesPaSteps extends ScenarioSteps{

    private GeneracionUwIssueRiesgosConsultablesPaPage generacionUwIssueRiesgosConsultablesPa;

    @Step
    public void ir_A_Analisis_De_Riesgo() {
        generacionUwIssueRiesgosConsultablesPa.irAAnalisisDeRiesgo();
    }

    @Step
    public void validar_Que_Se_Genere_Uw_Issue(ExamplesTable mensaje) {
        generacionUwIssueRiesgosConsultablesPa.validarGeneracionUWIssue(mensaje);
    }

    @Step
    public void aceptar_Expedicion_Poliza() {
        generacionUwIssueRiesgosConsultablesPa.aceptarExpedicionPoliza();
    }

    public void validarMensajeBloqueanteSarlaft(ExamplesTable mensaje) {
        generacionUwIssueRiesgosConsultablesPa.validarGeneracionMensajeBloqueante(mensaje);
    }
}
