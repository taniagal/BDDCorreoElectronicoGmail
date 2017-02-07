package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.CambioDePlacaSteps;
import com.sura.guidewire.policycenter.steps.CambioDePolizaCamposEditablesSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class CambioDePolizaCamposEditablesDefinitions {
    @Steps
    CambioDePolizaCamposEditablesSteps cambioDePolizaCamposEditablesSteps;
    @Steps
    CambioDePlacaSteps cambioDePlacaSteps;

    @When("cambie el plan del vehiculo <plan>")
    public void cambiarPlanVehiculo(@Named("plan") String plan) {
        cambioDePolizaCamposEditablesSteps.cambiarPlanVehicular(plan);

    }

    @When("And seleccione la opcion transporte de combustible")
    public void agregarTransporteDeCombustible() {
        cambioDePolizaCamposEditablesSteps.agregarTransporteDeCombustible();
    }

    @Then("expida el cambio de la poliza")
    public void expedirCambioPoliza() {
        cambioDePlacaSteps.expedirCambioPoliza();
    }
}
