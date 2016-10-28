package com.sura.guidewire.policycenter.definitions.tarifa;

import com.sura.guidewire.policycenter.steps.DetallesDeUbicacionSteps;
import com.sura.guidewire.policycenter.steps.tarifa.TarifaAutosSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class TarifaAutosDefinitions {
    @Steps
    DetallesDeUbicacionSteps detallesDeUbicacionSteps;

    @Steps
    TarifaAutosSteps tarifaAutosSteps;


    @When("ingrese los datos del asegurado")
    public void agregarAsegurado() {
        tarifaAutosSteps.agregar_asegurados();
    }

    @When("ingrese los datos del vehiculo: $datosVehiculo")
    public void agregarVehiculo(ExamplesTable datosVehiculo) {
        tarifaAutosSteps.agregar_vehiculo(datosVehiculo);
    }

    @When("ingrese las coberturas: $coberturas")
    public void agregarcoberturas(ExamplesTable coberturas) {
        tarifaAutosSteps.agregar_coberturas(coberturas);
    }

    @When("seleccione todas las coberturas: $coberturas")
    public void agregarTodasLasCoberturas(ExamplesTable coberturas) {
        tarifaAutosSteps.seleciconar_coberturas(coberturas);
    }

    @Then("el resultado de la cotizacion debe ser <valor>")
    public void verificarResultado(@Named("valor")String valor){
        tarifaAutosSteps.verificar_tarifacion(valor);
    }

    @Then("el resultado de la cotizacion en cada cobertura debe ser: $valor")
    public void verificarResultado(ExamplesTable valor){
        tarifaAutosSteps.verificar_tarifacion_por_coberturas(valor);
    }
}
