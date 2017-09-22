package com.sura.guidewire.policycenter.definitions.tarifacion;

import com.sura.guidewire.policycenter.steps.poliza.DetallesDeUbicacionSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaAutosSteps;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Alias;
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

    @When("quiera cambiar valor asegurado en la modificacion")
    public void cambiarValorAseguradoModificacion(@Named("valorAseguradoModificacion") String valorAseguradoModificacion) {
        tarifaAutosSteps.cambiarValorAseguradoModificacion(valorAseguradoModificacion);
    }

    @When("quiera capturar los valores de tarifa al expedir poliza")
    public void capturarValoresTarifa() {
        tarifaAutosSteps.capturarValoresTarifa();
    }

    @When("quiera capturar los valores de tarifa al modificar poliza")
    public void capturarValoresTarifaModificacion() {
        tarifaAutosSteps.capturarValoresTarifaModificacion();
    }

    @Then("se verifica la devolucion de la prima al cancelar poliza")
    public void verificarDevolucionPrima() {
        tarifaAutosSteps.verificarDevolucionPrima();
    }

    @When("ingrese la informacion del vehiculo: $datosVehiculo")
    public void agregarVehiculoConAcessorios(ExamplesTable datosVehiculo) {
        tarifaAutosSteps.agregarVehiculoDos(datosVehiculo);
    }

    @When("ingrese las coberturas: $coberturas")
    public void agregarCoberturas(ExamplesTable coberturas) {
        tarifaAutosSteps.agregarCoberturas(coberturas);
    }

    @When("ingrese las coberturas e intentar cotizar: $coberturas")
    public void agregarCoberturasYCotizar(ExamplesTable coberturas){
        tarifaAutosSteps.agregarCoberturasYCotizar(coberturas);
    }

    @When("ingrese las coberturas para la sustitucion: $coberturas")
    @Alias("ingrese las coberturas de RC, asistencia y hurto: $coberturas")
    public void agregarCoberturasSustitucion(ExamplesTable coberturas) {
        tarifaAutosSteps.agregarCoberturasSustitucion(coberturas);
    }

    @When("ingrese las coberturas de a la modificacion: $coberturas")
    public void ingresarCoberturasAModificacion(ExamplesTable coberturas) {
        tarifaAutosSteps.agregarCoberturasSustitucionModificacion(coberturas);
    }

    @When("ingrese las coberturas a $texto: $coberturas")
    public void agregarcoberturasCeroKilometros(ExamplesTable coberturas) {
        tarifaAutosSteps.agregarCoberturasRC(coberturas);
    }

    @When("ingrese las coberturas necesarias: $coberturas")
    public void agregarCoberturasNecesarias(ExamplesTable coberturas) {
        tarifaAutosSteps.agregarCoberturasNecesarias(coberturas);
    }

    @When("ingrese registros del vehiculo con interes adicional: $datosVehiculoOneroso")
    public void agregarVehiculoConInteres(ExamplesTable datosVehiculoOneroso) {
        tarifaAutosSteps.agregarVehiculoOneroso(datosVehiculoOneroso);
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

    @Then("debo poder ver la cobertura de accidentes al conductor con dependencia de daños <danos> o hurto <hurto>")
    public void verificarDependenciaDeCobertura(@Named("danos") String danos, @Named("hurto") String hurto) {
        tarifaAutosSteps.verificarDependenciaDeCobertura(danos, hurto);
    }

    @Then("el resultado de la cotizacion en las coberturas globales son: $coberturas")
    public void verificarCoberturasGlobales(ExamplesTable coberturas) {
        tarifaAutosSteps.verificarCoberturasGlobales(coberturas);
    }

    @When("seleccione todas las coberturas de comision: $coberturas")
    public void agregarTodasLasCoberturasDeComision(ExamplesTable coberturas) {
        tarifaAutosSteps.seleccionarCoberturasComision(coberturas);
    }

    @Then("el valor de la prima es <prima>")
    public void verificarResultadoPrima(@Named("prima") String primaTotal) {
        tarifaAutosSteps.verificarTarifacionPrima(primaTotal);
    }

    @When("agrego nuevamente coberturas rc : $coberturas")
    public void agregarDeducibleEnRc(ExamplesTable coberturas) {
        tarifaAutosSteps.seleccionarBotonSiguiente();
        tarifaAutosSteps.seleccionarBotonSiguiente();
        tarifaAutosSteps.seleccionarBotonSiguiente();
        tarifaAutosSteps.agregarCoberturasRC(coberturas);
    }

}