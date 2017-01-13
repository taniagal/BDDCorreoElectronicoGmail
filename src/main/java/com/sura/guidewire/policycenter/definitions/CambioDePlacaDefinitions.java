package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.CambioDePlacaSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaAutosSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class CambioDePlacaDefinitions {
    @Steps
    CambioDePlacaSteps cambioDePlacaSteps;
    @Steps
    TarifaAutosSteps tarifaAutosSteps;

    @When("cuando cambie la placa <placa>")
    public void cambiarPlaca(@Named("placa") String placa) {
        cambioDePlacaSteps.clickCambiarPlaca();
        cambioDePlacaSteps.cambioDePlaca(placa);
    }

    @When("coloque una placa existente <placaExistente>")
    public void cambiarPlacaPorExistente(@Named("placaExistente") String placaExistente) {
        cambioDePlacaSteps.cambiarPorPlacaExistente(placaExistente);
    }

    @When("vuelva a cambiar la placa")
    public void cambiarPlacaNueva() {
        cambioDePlacaSteps.clickItemCambiarPlaca();
    }

    @When("debe salir un mensaje de advertencia $mensaje")
    public void mensajePlacaExistente(ExamplesTable mensaje) {
        cambioDePlacaSteps.mensajePlacaExistente(mensaje);
    }

    @When("quiera volver a cambiar la placa")
    public void cambiarPlaca() {
        cambioDePlacaSteps.cambioPlacaSegundaVez();
    }

    @When("se deben recargar los datos de la placa anterior: $datosPlaca")
    public void datosPlacaAnterior(ExamplesTable datosPlaca) {
        cambioDePlacaSteps.datosDePlacaAnterior(datosPlaca);
    }

    @When("se debe cargar la placa inicial <placaInicial>")
    public void placaAnterior(@Named("placaInicial") String placaInicial) {
        cambioDePlacaSteps.placaAnterior(placaInicial);
    }

    @When("cuando ingrese una placa venezolana <placaVenezolana>")
    public void placaVenezolana(@Named("placaVenezolana") String placaVenezolana) {
        cambioDePlacaSteps.placaVenezolana(placaVenezolana);
    }

    @When("vaya a vehiculos a ingresar una placa venezolana <venezolana> con circulacion en cucuta <ciudad>")
    public void placaAutorizacion(@Named("venezolana") String venezolana, @Named("ciudad") String ciudad) {
        cambioDePlacaSteps.ingresarPlacaExtranjera(venezolana, ciudad);
    }

    @When("expida el cambio de la poliza")
    public void expedirCambioPoliza() {
        cambioDePlacaSteps.expedirCambioPoliza();
    }

    @When("debe mostrar un mensaje solicitando autorizacion $mensajeAutorizacion")
    public void mensajeAutorizacion(ExamplesTable mensajeAutorizacion) {
        cambioDePlacaSteps.mensajeAutorizacion(mensajeAutorizacion);
    }

    @Then("debe mostrar un mensaje de autorizacion para expedir $mensajeDeAutorizacion")
    public void mensajeDeAutorizacion(ExamplesTable mensajeDeAutorizacion) {
        cambioDePlacaSteps.mensajeDeAutorizacion(mensajeDeAutorizacion);
    }

    @When("debe mostrar un mensaje de autorizacion $mensajePlacaRiesgoConsultable")
    public void mensajePlacaRiesgoConsultable(ExamplesTable mensajePlacaRiesgoConsultable) {
        cambioDePlacaSteps.mensajePlacaRiesgoConsultable(mensajePlacaRiesgoConsultable);
    }

    @When("cuando edite la transacion de la poliza")
    public void editarPoliza() {
        cambioDePlacaSteps.editarCambioDePoliza();
    }

    @Given("ingrese los datos del asegurado <tipo_documento> <documento>")
    public void agregarAsegurado(@Named("tipo_documento") String tipoDocumento, @Named("documento") String documento) {
        tarifaAutosSteps.agregarAsegurados(tipoDocumento, documento);
    }

    @When("vaya a vehiculos a ingresar una placa riesgo consultable <placaRiesgoConsultable>")
    public void placaRiesgoConsultableModificacion(@Named("placaRiesgoConsultable") String placaRiesgoConsultable) {
        cambioDePlacaSteps.placaRiesgoConsultable(placaRiesgoConsultable);
    }

    @Given("ingrese los datos del vehiculo: $datosVehiculo")
    public void agregarVehiculo(ExamplesTable datosVehiculo) {
        tarifaAutosSteps.agregarVehiculo(datosVehiculo);
    }
}
