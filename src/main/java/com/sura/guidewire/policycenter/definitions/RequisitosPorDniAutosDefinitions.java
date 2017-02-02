package com.sura.guidewire.policycenter.definitions;

import com.google.inject.name.Named;
import com.sura.guidewire.policycenter.steps.RequisitosPorDniAutosSteps;
import com.sura.guidewire.policycenter.steps.commons.NuevaCotizacionSteps;
import com.sura.guidewire.policycenter.steps.cuenta.CuentaNuevaSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaAutosSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class RequisitosPorDniAutosDefinitions {
    @Steps
    RequisitosPorDniAutosSteps requisitosPorDniAutosSteps;
    @Steps
    CuentaNuevaSteps cuentaNuevaSteps;
    @Steps
    NuevaCotizacionSteps nuevaCotizacionSteps;
    @Steps
    TarifaAutosSteps tarifaAutosSteps;

    @When("agrege un beneficiario <tipoDocumento> <numeroDocumento><tipoBeneficiario>")
    public void ingresarBeneficiario(@Named("tipoDocumento") String tipoDocumento, @Named("numeroDocumento") String numeroDocumento, @Named("tipoBeneficiario") String tipoBeneficiario) {
        requisitosPorDniAutosSteps.agregarBeneficiarioAutos(tipoDocumento, numeroDocumento, tipoBeneficiario);
    }

    @When("ingrese los datos del vehiculo en expedicion: $datosVehiculo")
    public void agregarVehiculo(ExamplesTable datosVehiculo) {
        requisitosPorDniAutosSteps.agregarVehiculo(datosVehiculo);
    }

    @When("vaya a la opcion requisitos")
    public void irARequisitos() {
        requisitosPorDniAutosSteps.irARequisitos();
    }

    @Then("debo ver un mensaje indicando requisitos pendientes $mensaje")
    public void validarMensajeRequisitosPendientes(ExamplesTable mensaje) {
        requisitosPorDniAutosSteps.validarMensajeRequsiitosPendientes(mensaje);
    }

    @When("acepto la expedicion de poliza")
    public void cotizarYExpedirPoliza() {
        requisitosPorDniAutosSteps.clicBotonExpedicion();
    }

    @Given("estoy cotizando una poliza de mrc: $datosCotizacion")
    @Alias("estoy cotizando una poliza de autos: $datosCotizacion")
    public void nuevaPolizaMrcConCuenta(ExamplesTable datosCotizacion) {
        cuentaNuevaSteps.crearCuentaNueva(datosCotizacion);
        nuevaCotizacionSteps.nuevaCotizacionenCuenta();
        nuevaCotizacionSteps.seleccionarProductoDesdeCuenta(datosCotizacion);
    }
}
