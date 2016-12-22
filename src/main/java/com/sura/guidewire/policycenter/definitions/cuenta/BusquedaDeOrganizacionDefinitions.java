package com.sura.guidewire.policycenter.definitions.cuenta;

import com.sura.guidewire.policycenter.pages.commons.InicioPage;
import com.sura.guidewire.policycenter.steps.cuenta.BusquedaDeOrganizacionSteps;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;


@SuppressWarnings("WeakerAccess")
public class BusquedaDeOrganizacionDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    private BusquedaDeOrganizacionSteps busquedaDeOrganizacionSteps;


    @Given("que me encuentro en la pantalla de organizaciones")
    public void givenQueMeEncuentroEnLaPantallaDeOrganizaciones() {
        busquedaDeOrganizacionSteps.irABuscarOrganizaciones();
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