package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.DetallesDeUbicacionSteps;
import com.sura.policycenter.selenium.steps.TarifaAutosSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class TarifaAutosDefinitions {
    @Steps
    DetallesDeUbicacionSteps detallesDeUbicacionSteps;

    @Steps
    TarifaAutosSteps tarifaAutosSteps;

    @Given("estoy cotizando una poliza para la cuenta <cuenta> y producto <producto>")
    public void agregarPoliza(@Named("cuenta") String cuenta) {
        //detallesDeUbicacionSteps.ir_a_nueva_poliza(cuenta);
    }

    @When("ingrese la informacion de la poliza: $datosPoliza")
    public void agregarDatosPoliza(ExamplesTable datosPoliza) {
        tarifaAutosSteps.agregar_informacion_de_poliza(datosPoliza);
    }

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

    @Then("el resultado de la cotizacion debe ser")
    public void verificarResultado(){
    }

}
