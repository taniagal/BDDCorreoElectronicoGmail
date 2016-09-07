package com.sura.policycenter.selenium.definitions;


import com.sura.policycenter.selenium.steps.InicioRenovacionPolizaPaSteps;
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
        inicioRenovacionPolizaPaSteps.navegar_barra_superior(poliza);
    }

    @When("quiera realizar esta renovacion")
    public void whenQuieraRealizarEstaRenovacion() {
        inicioRenovacionPolizaPaSteps.navegar_por_renovacion();
    }

    @Then("se deben mostrar un mensaje <mensaje>")
    public void thenSeDebenMostrarUnMensajemensaje(@Named("mensaje") String mensaje) {
        inicioRenovacionPolizaPaSteps.validacion_de_mensaje_en_pantalla(mensaje);
    }

    @Then("se cancela el proceso de renovacion")
    public void thenSeCancelaElProcesoDeRenovacion() {
        inicioRenovacionPolizaPaSteps.cancela_operacion_de_renovacion();
    }

    @When("quiera aceptar esta renovacion")
    public void whenQuieraAceptarEstaRenovacion() {
        inicioRenovacionPolizaPaSteps.aceptar_operacion_de_renovacion();
    }

    @Then("se debe validar los datos del tomador: $datosTomador")
    public void validaDatosDeTomador(ExamplesTable datosTomador) {
        inicioRenovacionPolizaPaSteps.validacion_en_pantalla_tomador(datosTomador);
    }

    @Then("validar campos informativos de asegurado: $datosAsegurado")
    public void validaDatosDeAsegurado(ExamplesTable datosAsegurado) {
       inicioRenovacionPolizaPaSteps.validacion_en_pantalla_asegurado(datosAsegurado);
    }

    @Then("validar campos informativos de vehiculo: $datosVehiculo")
    public void validaDatosDeVehiculo(ExamplesTable datosVehiculo) {
        inicioRenovacionPolizaPaSteps.validacion_en_pantalla_vehiculo(datosVehiculo);
    }


}
