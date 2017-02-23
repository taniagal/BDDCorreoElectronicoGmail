package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.poliza.MenuAministracionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MenuAdministracionSteps extends ScenarioSteps {

    MenuAministracionPage menuAministracionPage;

    @Step
    public void irATraspasoDeCartera() {
        menuAministracionPage.irATraspasoDeCartera();
    }
}
