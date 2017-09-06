package com.sura.guidewire.policycenter.definitions.renovacion;

import com.google.inject.name.Named;
import com.sura.guidewire.policycenter.steps.poliza.CotizacionMRCSteps;
import com.sura.guidewire.policycenter.steps.renovacion.ModificacionRenovacionVehiculoSteps;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class ModificacionRenovacionVehiculoDefinitions {

    @Steps
    CotizacionMRCSteps cotizacionMRCSteps;

    @Steps
    ModificacionRenovacionVehiculoSteps modificacionRenovacionVehiculoSteps;

    @Given("estoy editando la renovacion de una poliza <cotizacion>")
    public void irAModificarRenovacionPoliza(@Named("cotizacion") String cotizacion){
        cotizacionMRCSteps.irABuscarCotizacionPoliza(cotizacion);

    }

    @When("estoy en la pantalla de Vehiculo")
    public void irAModificarVehiculo(){
        modificacionRenovacionVehiculoSteps.irAVehiculos();
        modificacionRenovacionVehiculoSteps.irAModificarVehiculo();
    }

    @When("intente modificar la informacion del Vehiculo")
    public void intentarModificarInformacionVehiculo(){
        modificacionRenovacionVehiculoSteps.irAVehiculos();
    }

    @Then("se deben poder modificar los campos: Ciudad de circulacion, Tipo de servicio, Motor,\n" +
            "Chasis, Bonificacion, Suavizacion, Recargo, Descuento, Valor Asegurado, Valor accesorios,\n" +
            "Valor accesorios especiales")
    public void validarEdicionCampos(){
        modificacionRenovacionVehiculoSteps.validarQueLosCamposSeanEditables();
    }

    @Then("no debo poder modificar los datos de: Placa, Relacion de asegurados en el caso de que solo exista un asegurado y \n" +
            "este ya esta relacionado, en el caso de que exista mas de un asegurado y ste no este  relacionado si es posible \n" +
            "relacionar el o los asegurados faltantes")
    public void validarCamposNoEditables(){
        modificacionRenovacionVehiculoSteps.validarQueLosCamposNoSePuedanModificar();
    }

    @Then("no debo poder interactuar con los vehiculos de la poliza")
    public void validarBotonesNoVisibles(){
        modificacionRenovacionVehiculoSteps.validarQueLosBotonesNoSonVisibles();
    }
}
