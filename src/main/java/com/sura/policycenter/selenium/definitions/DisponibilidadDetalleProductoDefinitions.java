package com.sura.policycenter.selenium.definitions;


import com.google.inject.name.Named;
import com.sura.policycenter.selenium.steps.DisponibilidadDetalleProductoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class DisponibilidadDetalleProductoDefinitions {

    @Steps
    DisponibilidadDetalleProductoSteps disponibilidadDetalleProductoSteps;

    @Given("Estoy expidiendo una poliza de autos")
    public void givenEstoyExpidiendoUnaPolizaDeAutos() {
        // PENDING
    }

    @Given("viendo Informacion de poliza")
    public void givenViendoInformacionDePoliza() {
        // PENDING
    }

    @When("seleccione Organizacion de ventas: <organizacion>")
    public void seleccionarOrganizacionDeVentas(@Named("organizacion") String organizacion) {
        // PENDING
    }

    @Then("tipo de canal ventas debe contener los valores $tipoCanal")
    public void validarTipoCanalVentas(ExamplesTable tipoCanal) {
        // PENDING
    }

}
