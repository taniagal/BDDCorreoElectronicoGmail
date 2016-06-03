package com.sura.policycenter.selenium.definitions;


import com.sura.policycenter.selenium.steps.CotizacionDePolizaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class CotizacionPolizaDefinitions {

    @Steps
    CotizacionDePolizaSteps cotizacionDePolizaSteps;

    @Given("he realizado la cotizacion <cotizacion>")
    public void givenHeRealizadoLaCotizacioncotizacion() {
        // PENDING
    }

    @When("ingrese al detalle de la cotizacion")
    public void whenIngreseAlDetalleDeLaCotizacion() {
        // PENDING
    }

    @Then("debo ver la siguiente informacion $informacionCotizaciion")
    public void validarInformacionCotizacion(ExamplesTable informacionCotizaciion) {
        // PENDING
    }
}
