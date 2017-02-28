package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.poliza.GeneracionUwIssueRiesgosConsultablesPaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class GeneracionUwIssueRiesgosConsultablesPaSteps extends ScenarioSteps {

    private GeneracionUwIssueRiesgosConsultablesPaPage generacionUwIssueRiesgosConsultablesPa;

    @Step
    public void irAAnalisisDeRiesgo() {
        generacionUwIssueRiesgosConsultablesPa.irAAnalisisDeRiesgo();
    }

    @Step
    public void validarQueSeGenereUwIssue(ExamplesTable mensaje) {
        generacionUwIssueRiesgosConsultablesPa.validarGeneracionUWIssue(mensaje);
    }

    @Step
    public void aceptarExpedicionPoliza() {
        generacionUwIssueRiesgosConsultablesPa.aceptarExpedicionPoliza();
    }

    @Step
    public void validarMensajeBloqueanteSarlaft(ExamplesTable mensaje) {
        generacionUwIssueRiesgosConsultablesPa.validarGeneracionMensajeBloqueante(mensaje);
    }
}
