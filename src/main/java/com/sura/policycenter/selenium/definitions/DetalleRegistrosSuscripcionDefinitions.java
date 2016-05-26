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

    @Steps
    DetalleRegistrosSuscripcionSteps detalleRegistrosSuscripcionSteps;

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    @Given("busco una cuenta existente como <numeroCuenta>")
    public void buscarCuenta(@Named("numeroCuenta") String numeroCuenta) {
        inicioPage().irACuentaBuscar(numeroCuenta);
    }

    @When("busque el de detalle de los registros de suscripcion")
    public void buscarRegistrosDeSucripcion() {
        detalleRegistrosSuscripcionSteps.buscarRegistrosDeSucripcion();
    }

    @Then("debo ver la siguiente informacion producto <producto>, <nroEnvio>, <estado>, <nroPoliza>")
    public void verDetalleRegistrosDeSuscripcion(@Named("producto") String producto,
                                                 @Named("nroEnvio") String nroEnvio,
                                                 @Named("estado") String estado,
                                                 @Named("nroPoliza") String nroPoliza) {
        detalleRegistrosSuscripcionSteps.validarCamposDetalle(producto, nroEnvio, estado, nroPoliza);
    }

    @Then("debo ver el costo total <total> para las cotizaciones en estado cotizado")
    public void verTotal(@Named("total") String total) {
        detalleRegistrosSuscripcionSteps.validarTotal(total);
    }

    @Then("debo ver la sumatoria <suma> de todas las cotizaciones y renovaciones independiente de su estado")
    public void verSumaGrupo(@Named("suma") String suma) {
        detalleRegistrosSuscripcionSteps.validarSumaGrupo(suma);
    }

}
