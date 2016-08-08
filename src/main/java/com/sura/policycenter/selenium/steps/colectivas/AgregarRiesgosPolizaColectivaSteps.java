package com.sura.policycenter.selenium.steps.colectivas;

import com.sura.policycenter.selenium.pages.colectivas.AgregarRiesgosPolizaColectivaPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AgregarRiesgosPolizaColectivaSteps extends ScenarioSteps {

    AgregarRiesgosPolizaColectivaPages agregarRiesgosPolizaColectivaPages;

    @Step
    public void clicEnAgregarRiesgoInfoPoliza() {
        agregarRiesgosPolizaColectivaPages.clicEnAgregarRiesgoInfoPoliza();
    }

    @Step
    public void clicEnAgregarRiesgo() {
        agregarRiesgosPolizaColectivaPages.clicEnAgregarRiesgo();
    }
}
