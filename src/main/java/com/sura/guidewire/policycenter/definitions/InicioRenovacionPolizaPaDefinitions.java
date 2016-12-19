package com.sura.guidewire.policycenter.definitions;


import com.sura.guidewire.policycenter.steps.InicioRenovacionPolizaPaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class InicioRenovacionPolizaPaDefinitions {


    @Steps
    InicioRenovacionPolizaPaSteps inicioRenovacionPolizaPaSteps;

    @Given("que es necesario renovar una <poliza> de autos")
    public void givenQueEsNecesarioRenovarUnapolizaDeAutos(@Named("poliza") String poliza) {
        inicioRenovacionPolizaPaSteps.navegarBarraSuperior(poliza);
    }

    @When("quiera realizar esta renovacion")
    public void whenQuieraRealizarEstaRenovacion() {
        inicioRenovacionPolizaPaSteps.navegarPorRenovacion();
    }

    @Then("se deben mostrar un mensaje <mensaje>")
    public void thenSeDebenMostrarUnMensajemensaje(@Named("mensaje") String mensaje) {
        inicioRenovacionPolizaPaSteps.validacionDeMensajeEnPantalla(mensaje);
    }

    @Then("se cancela el proceso de renovacion")
    public void thenSeCancelaElProcesoDeRenovacion() {
        inicioRenovacionPolizaPaSteps.cancelaOperacionDeRenovacion();
    }

    @When("quiera aceptar esta renovacion")
    public void whenQuieraAceptarEstaRenovacion() {
       inicioRenovacionPolizaPaSteps.aceptarOperacionDeRenovacion();
    }

    @Then("se debe validar los datos del tomador: $datosTomador")
    public void validaDatosDeTomador(ExamplesTable datosTomador) {
        inicioRenovacionPolizaPaSteps.validacionEnPantallaTomador(datosTomador);
    }

    @Then("validar campos informativos de asegurado: $datosAsegurado")
    public void validaDatosDeAsegurado(ExamplesTable datosAsegurado) {
       inicioRenovacionPolizaPaSteps.validacionEnPantallaAsegurado(datosAsegurado);
    }

    @Then("validar campos informativos de vehiculo: $datosVehiculo")
    public void validaDatosDeVehiculo(ExamplesTable datosVehiculo) {
        inicioRenovacionPolizaPaSteps.validacionEnPantallaVehiculo(datosVehiculo);
        inicioRenovacionPolizaPaSteps.opcionesDeCierre();
    }


}
