package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.pages.InicioPage;
import com.sura.policycenter.selenium.steps.BusquedaDeOrganizacionSteps;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;

@SuppressWarnings("WeakerAccess")
public class BusquedaDeOrganizacionDefinitions {

    @Steps
    private BusquedaDeOrganizacionSteps busquedaDeOrganizacionSteps;

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    @Given("que me encuentro en la pantalla de organizaciones")
    public void givenQueMeEncuentroEnLaPantallaDeOrganizaciones() {
        inicioPage().irAAdminOrganizaciones();
    }

    @When("ingreso el campo razon social <organizacion>")
    public void whenIngresoElCampoRazonSocialorganizacion(String organizacion) {
        busquedaDeOrganizacionSteps.ingresarRazonSocial(organizacion);
    }

    @Then("me debe mostrar el registro asociado <organizacion>")
    public void thenMeDebeMostrarElRegistroAsociado(String organizacion) {
        busquedaDeOrganizacionSteps.validaOrganizacion(organizacion);
    }

}