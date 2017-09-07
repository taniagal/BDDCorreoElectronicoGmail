package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.poliza.MenuAministracionPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

public class MenuAdministracionSteps extends ScenarioSteps {

    @Page
    MenuAministracionPage menuAministracionPage;

    @Step
    public void irATraspasoDeCartera() {
        menuAministracionPage.irATraspasoDeCartera();
    }
}
