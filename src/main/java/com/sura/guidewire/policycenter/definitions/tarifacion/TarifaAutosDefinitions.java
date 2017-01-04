package com.sura.guidewire.policycenter.definitions.tarifacion;

import com.sura.guidewire.policycenter.steps.DetallesDeUbicacionSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaAutosSteps;
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


    @When("ingrese los datos del asegurado <tipo_documento> <documento>")
    public void agregarAsegurado(@Named("tipo_documento") String tipoDocumento, @Named("documento") String documento) {
        tarifaAutosSteps.agregarAsegurados(tipoDocumento, documento);
    }

    @When("ingrese los datos del vehiculo: $datosVehiculo")
    public void agregarVehiculo(ExamplesTable datosVehiculo) {
        tarifaAutosSteps.agregarVehiculo(datosVehiculo);
    }



    @When("ingrese las coberturas: $coberturas")
    public void agregarcoberturas(ExamplesTable coberturas) {
        tarifaAutosSteps.agregarCoberturas(coberturas);
    }
    @When("ingrese las coberturas a auto cero kilometros: $coberturas")
    public void agregarcoberturasCeroKilometros(ExamplesTable coberturas){
        tarifaAutosSteps.agregarCoberturasRC(coberturas);
    }

    @When("ingrese a la pantalla de coberturas")
    public void irACoberturas() {
        tarifaAutosSteps.seleccionarBotonSiguiente();
    }

    @When("vaya a la pantalla de coberturas")
    public void seleccionarBotonSiguiente(){
        tarifaAutosSteps.seleccionarBotonSiguiente();
    }

    @When("seleccione todas las coberturas: $coberturas")
    public void agregarTodasLasCoberturas(ExamplesTable coberturas) {
        tarifaAutosSteps.seleciconarCoberturas(coberturas);
    }

    @Then("el resultado de la cotizacion debe ser <valor>")
    public void verificarResultado(@Named("valor") String valor) {
        tarifaAutosSteps.verificarTarifacion(valor);
    }

    @Then("el resultado de la cotizacion en cada cobertura debe ser: $valor")
    public void verificarResultado(ExamplesTable valor) {
        tarifaAutosSteps.verificarTarifacionPorCoberturas(valor);
    }
}
