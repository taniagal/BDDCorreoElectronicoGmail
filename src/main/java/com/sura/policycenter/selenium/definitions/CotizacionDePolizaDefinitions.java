package com.sura.policycenter.selenium.definitions;


import com.google.inject.name.Named;
import com.sura.policycenter.selenium.pages.InicioPage;
import com.sura.policycenter.selenium.steps.CotizacionDePolizaSteps;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class CotizacionDePolizaDefinitions {

    private InicioPage inicioPage() {
        return ThucydidesWebDriverSupport.getPages().currentPageAt(InicioPage.class);
    }

    @Steps
    CotizacionDePolizaSteps cotizacionDePolizaSteps;

    @Given("he realizado la cotizacion <cotizacion>")
    public void irALaCotizacion(@Named("cotizacion") String cotizacion) {
        inicioPage().irABuscarSubPoliza(cotizacion);
    }

    @When("ingrese al detalle de la cotizacion")
    public void verDetalleCotizacion() {
       cotizacionDePolizaSteps.verDetalleCotizacion();
    }

    @Then("debo ver la siguiente informacion $informacionCotizacion")
    public void validarInformacionCotizacion(ExamplesTable informacionCotizacion) {
        cotizacionDePolizaSteps.validarInformacionCotizacion(informacionCotizacion);
    }
}
