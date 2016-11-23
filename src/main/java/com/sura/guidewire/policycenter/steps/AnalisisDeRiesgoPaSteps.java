package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.AnalisisDeRiesgoPaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class AnalisisDeRiesgoPaSteps extends ScenarioSteps{

    private AnalisisDeRiesgoPaPage analisisDeRiesgo;

    @Step
    public void aceptarExpedicion() {
        analisisDeRiesgo.aceptarExpedicion();
    }

    @Step
    public void validarQueSeGenereBloqueo(ExamplesTable mensaje) {
        analisisDeRiesgo.validarBloqueoExpedicion(mensaje);
    }

    @Step
    public void validarQueSeGenereUWIssue(ExamplesTable uwissue) {
        analisisDeRiesgo.validarGeneracionUWIssue(uwissue);
    }
}
