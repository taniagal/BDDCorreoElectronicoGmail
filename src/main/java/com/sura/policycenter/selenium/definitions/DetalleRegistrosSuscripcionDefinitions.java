package com.sura.policycenter.selenium.definitions;

import com.google.inject.name.Named;
import com.sura.policycenter.selenium.pages.InicioPage;
import com.sura.policycenter.selenium.steps.DetalleRegistrosSuscripcionSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;

public class DetalleRegistrosSuscripcionDefinitions {

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    @Steps
    DetalleRegistrosSuscripcionSteps detalleRegistrosSuscripcionSteps;

    @Given("busco una cuenta existente como <numeroCuenta>")
    public void buscarCuenta(@Named("numeroCuenta") String numeroCuenta) {
        inicioPage().irACuentaBuscar(numeroCuenta);
    }

    @When("busque el de detalle de los registros de suscripcion")
    public void buscarRegistrosDeSucripcion() {
        detalleRegistrosSuscripcionSteps.buscarRegistrosDeSucripcion();
    }

    @Then("debo ver la siguiente informacion")
    public void verDetalleRegistrosDeSuscripcion() {
        // PENDING
    }

}
