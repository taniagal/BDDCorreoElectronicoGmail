package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.EdificiosUbicacionesSteps;
import com.sura.guidewire.policycenter.steps.VisualizarCambiosEnPolizaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class VisualizarCambiosEnPolizaDefinitions {
    @Steps
    VisualizarCambiosEnPolizaSteps visualizarCambiosEnPolizaSteps;

    @Then("debe existir la comparacion entre datos de poliza existente y poliza nueva")
    public void comparacionPolizas() {
        visualizarCambiosEnPolizaSteps.comparacionDePolizas();
    }

    @When("cambie una cobertura <cobertura>")
    public void cambiarCobertura(@Named("cobertura") String cobertura) {
        visualizarCambiosEnPolizaSteps.cambiarCobertura(cobertura);
    }

    @When("vaya a la opcion asegurados")
    public void opcionAsegurados() {
        visualizarCambiosEnPolizaSteps.opcionAsegurados();
    }

    @When("cambie la ciudad de circulacion <ciudad>")
    public void cambiarCiudadCirculacion(@Named("ciudad") String ciudad) {
        visualizarCambiosEnPolizaSteps.cambiarCiudadCirculacion(ciudad);
    }
}
