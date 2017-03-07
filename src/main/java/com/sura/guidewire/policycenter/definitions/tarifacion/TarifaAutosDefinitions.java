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

    @When("agregue un nuevo valor asegurado <valor_asegurado>")
    public void agregarValorasegurado(@Named("valor_asegurado") String valorAsegurado) {
        tarifaAutosSteps.agregarValorAsegurado(valorAsegurado);
    }

    @When("ingrese la informacion del vehiculo: $datosVehiculo")
    public void agregarVehiculoConAcessorios(ExamplesTable datosVehiculo) {
        tarifaAutosSteps.agregarVehiculoDos(datosVehiculo);
    }

    @When("ingrese las coberturas: $coberturas")
    public void agregarcoberturas(ExamplesTable coberturas) {
        tarifaAutosSteps.agregarCoberturas(coberturas);
    }

    @When("ingrese las coberturas a $texto: $coberturas")
    public void agregarcoberturasCeroKilometros(ExamplesTable coberturas) {
        tarifaAutosSteps.agregarCoberturasRC(coberturas);
    }

    @When("ingrese a la pantalla de coberturas")
    public void irACoberturas() {
        tarifaAutosSteps.seleccionarBotonSiguiente();
    }

    @When("vaya a la pantalla de coberturas")
    public void seleccionarBotonSiguiente() {
        tarifaAutosSteps.seleccionarBotonSiguiente();
    }

    @When("seleccione todas las coberturas: $coberturas")
    public void agregarTodasLasCoberturas(ExamplesTable coberturas) {
        tarifaAutosSteps.seleciconarCoberturas(coberturas);
    }

    @When("seleccione todas las coberturas corbeta: $coberturas")
    public void agregarTodasLasCoberturasCorbeta(ExamplesTable coberturas) {
        tarifaAutosSteps.seleciconarCoberturasCorbeta(coberturas);
    }

    @When("seleccione todas las coberturas de comision pactada: $coberturas")
    public void agregarTodasLasCoberturasDeComisionPactada(ExamplesTable coberturas) {
        tarifaAutosSteps.seleccionarCoberturasComisionPactada(coberturas);
    }

    @When("ingrese la comision pactada en valor <valor>")
    public void ingresarComisionPactada(@Named("valor") String valor) {
        tarifaAutosSteps.ingresarComisionPactada(valor);
    }

    @Then("el resultado de la cotizacion debe ser <valor>")
    public void verificarResultado(@Named("valor") String valor) {
        tarifaAutosSteps.verificarTarifacion(valor);
    }

    @Then("el resultado de la tarifacion debe ser prima <prima> iva <iva> costo total <costo>")
    public void verificarResultadoTarifacionTotal(@Named("prima") String primaTotal, @Named("iva") String iva, @Named("costo") String costoTotal) {
        tarifaAutosSteps.verificarTarifacionTotal(primaTotal, iva, costoTotal);
    }

    @Then("debo poder ver la cobertura de accidentes al conductor sin dependencia de daños o hurto")
    public void verificarNoDependenciaDeCobertura() {
        tarifaAutosSteps.verificarNoDependenciaDeCobertura();
    }

    @Then("debo poder ver la cobertura de accidentes al conductor con dependencia de daños o hurto")
    public void verificarDependenciaDeCobertura() {
        tarifaAutosSteps.verificarDependenciaDeCobertura();
    }


    @When("seleccione todas las coberturas de comision: $coberturas")
    public void agregarTodasLasCoberturasDeComision(ExamplesTable coberturas) {
        tarifaAutosSteps.seleccionarCoberturasComision(coberturas);
    }

    @Then("el valor de la prima es <prima>")
    public void verificarResultadoPrima(@Named("prima") String primaTotal) {
        tarifaAutosSteps.verificarTarifacionPrima(primaTotal);
    }

}

