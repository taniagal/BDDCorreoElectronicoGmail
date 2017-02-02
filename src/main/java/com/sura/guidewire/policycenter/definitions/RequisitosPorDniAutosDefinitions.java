package com.sura.guidewire.policycenter.definitions;

import com.google.inject.name.Named;
import com.sura.guidewire.policycenter.steps.RequisitosPorDniAutosSteps;
import com.sura.guidewire.policycenter.steps.commons.NuevaCotizacionSteps;
import com.sura.guidewire.policycenter.steps.cuenta.CuentaNuevaSteps;
import net.thucydides.core.annotations.Steps;
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

    @When("agrege un beneficiario <tipoDocumento> <numeroDocumento><tipoBeneficiario>")
    public void ingresarBeneficiario(@Named("tipoDocumento") String tipoDocumento, @Named("numeroDocumento") String numeroDocumento, @Named("tipoBeneficiario") String tipoBeneficiario) {
        requisitosPorDniAutosSteps.agregarBeneficiarioAutos(tipoDocumento, numeroDocumento, tipoBeneficiario);
    }

    @When("ingrese los datos del vehiculo en expedicion: $datosVehiculo")
    public void agregarVehiculo(ExamplesTable datosVehiculo) {
        requisitosPorDniAutosSteps.agregarVehiculo(datosVehiculo);
    }

    @When("cambie la fecha de inicio de vigencia en cancelacion <fecha>")
    public void cambiarFechaCancelacion(@Named("fecha") String fecha) {
        requisitosPorDniAutosSteps.cambiarFechaCancelacion(fecha);
    }

    @When("vaya a la opcion requisitos")
    public void irARequisitos() {
        requisitosPorDniAutosSteps.irARequisitos();
    }

    @Then("debe salir el nombre de los usuarios que requieren requisitos $mensaje")
    public void validarDniRequisitos(ExamplesTable mensajes) {
        requisitosPorDniAutosSteps.validarDniRequisitos(mensajes);
    }

    @Then("debo ver un mensaje indicando requisitos pendientes $mensaje")
    public void validarMensajeRequisitosPendientes(ExamplesTable mensaje) {
        requisitosPorDniAutosSteps.validarMensajeRequsiitosPendientes(mensaje);
    }

    @When("acepto la expedicion de poliza")
    public void cotizarYExpedirPoliza() {
        requisitosPorDniAutosSteps.clicBotonExpedicion();
    }

    @When("agregue una oficina <oficina>")
    public void agregarOficina(@Named("oficina")String oficina) {
    }

    @Given("estoy cotizando una poliza de mrc con documento: $datosCotizacion")
    public void nuevaPolizaMrcConCuentaYDocumento(ExamplesTable datosCotizacion) {
        cuentaNuevaSteps.crearCuentaNuevaConDocumento(datosCotizacion);
        nuevaCotizacionSteps.nuevaCotizacionenCuenta();
        requisitosPorDniAutosSteps.agregarOficina();
        nuevaCotizacionSteps.seleccionarProductoDesdeCuenta(datosCotizacion);
    }


}
