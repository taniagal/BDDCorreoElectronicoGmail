package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.poliza.MenuAdministracionSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.When;

public class MenuAdministracionDefinitions {

    @Steps
    MenuAdministracionSteps menuAdministracionSteps;

    @When("Ir al menu traspaso de cartera")
    public void irATraspasoDeCartera() {
        menuAdministracionSteps.irATraspasoDeCartera();
    }
}
