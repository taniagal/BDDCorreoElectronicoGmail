package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.AnalisisDeRiesgoPaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class AnalisisDeRiesgoPaSteps extends ScenarioSteps{

    private AnalisisDeRiesgoPaPage analisisDeRiesgo;

    @Step
    public void aceptar_expedicion() {
        analisisDeRiesgo.aceptarExpedicion();
    }

    @Step
    public void validar_Que_Se_Genere_Bloqueo(ExamplesTable mensaje) {
        analisisDeRiesgo.validarBloqueoExpedicion(mensaje);
    }

    @Step
    public void validar_Que_Se_Genere_UWIssue(ExamplesTable UWIssue) {
        analisisDeRiesgo.validarGeneracionUWIssue(UWIssue);
    }
}
