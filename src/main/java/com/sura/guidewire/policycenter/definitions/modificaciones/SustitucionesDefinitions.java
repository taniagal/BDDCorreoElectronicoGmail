package com.sura.guidewire.policycenter.definitions.modificaciones;

import com.sura.guidewire.policycenter.steps.modificacion.SustitucionesSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class SustitucionesDefinitions {
    @Steps
    SustitucionesSteps sustitucionesSteps;

    @When("y realizo una modificación de una póliza de automoviles")
    public void sustitucionVehiculo() {
        sustitucionesSteps.sustitucionVehiculo();
    }

    @Then("verificar conservacion de informacion del vehiculo previamente eliminado $infoVehiculo")
    public void verificarInfoVehiculo(ExamplesTable infoVehiculo){
        sustitucionesSteps.verificarInfoVehiculo(infoVehiculo);
    }

    @Then("conservar Informacion del vehículo sustituido: $datosAgregarVehiculo")
    public void agregarVehiculoSustituto(ExamplesTable datosAgregarVehiculo) {
        sustitucionesSteps.agregarVehiculoSustituto(datosAgregarVehiculo);
    }

    @Then("conservar las coberturas del vehículo sustituido: $datosCoberturaVehiculo")
    public void verificarCoberturasVehiculoSustituto(ExamplesTable datosCoberturaVehiculo){
        sustitucionesSteps.verificarCoberturasVehiculoSustituto(datosCoberturaVehiculo);
    }
}
