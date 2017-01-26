package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.OpcionesDeCierrePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

public class OpcionesDeCierreSteps extends ScenarioSteps {
    @Page
    OpcionesDeCierrePage opcionesDeCierrePage;

    @Step
    public void irAOpcionesDeCierre() {
        opcionesDeCierrePage.irAOpcionesDeCierre();
    }

    public void validarInformacionDeclinar(String razones) {
        opcionesDeCierrePage.validarRazonesDeclinar(razones);
    }
}
