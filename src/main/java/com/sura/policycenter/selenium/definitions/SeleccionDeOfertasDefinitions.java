package com.sura.policycenter.selenium.definitions;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class SeleccionDeOfertasDefinitions {

    @Given("inicio una nueva cotizacion")
    public void iniciarCotizacion() {
        // PENDING
    }

    @When("seleccione la linea de negocio de <linea>")
    public void seleccionarLineaDeNegocio(@Named("linea") String linea) {
        // PENDING
    }

    @Then("no debe mostrar el menu vertical <menu>")
    public void validarVisibilidadMenu(@Named("menu") String menu) {
        // PENDING
    }

    @Then("no debe mostrar la pantalla <pantalla>")
    public void validarVisibilidadPantalla(@Named("pantalla") String pantalla) {
        // PENDING
    }
}
