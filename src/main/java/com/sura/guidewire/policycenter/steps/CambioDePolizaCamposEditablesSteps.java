package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.CambioDePolizaCamposEditablesPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

public class CambioDePolizaCamposEditablesSteps extends ScenarioSteps {
    @Page
    CambioDePolizaCamposEditablesPage cambioDePolizaCamposEditablesPage;

    @Step
    public void cambiarPlanVehicular(String plan) {
        cambioDePolizaCamposEditablesPage.cambiarPlanVehicular(plan);

    }

    public void agregarTransporteDeCombustible() {
        cambioDePolizaCamposEditablesPage.agregarTransporteCombustible();
    }
}
