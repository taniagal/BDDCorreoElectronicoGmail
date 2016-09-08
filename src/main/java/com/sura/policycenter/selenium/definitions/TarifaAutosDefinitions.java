package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.DetallesDeUbicacionSteps;
import com.sura.policycenter.selenium.steps.TarifaAutosSteps;
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

    @When("ingrese la placa <placa> en la informacion del vehiculo")
    public void agregraPlaca(@Named("placa") String placa){
        tarifaAutosSteps.agregar_placa_y_asegurado(placa);
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

    @Then("se debe ver reflejada la bonificacion tecnica <bono> de esta placa")
    public void verificarBono(@Named("bono")String bono){
        tarifaAutosSteps.verificar_bono(bono);
    }

}
