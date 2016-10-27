package com.sura.guidewire.policycenter.definitions.contactos;

import com.sura.guidewire.policycenter.util.navegacion.steps.GuidewireLoginSteps;
import com.sura.guidewire.policycenter.steps.cuentas.CuentaSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.StepInterceptor;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;


public class ConsultaDeContactosAsociadosACuentaBasico {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    @Steps
    GuidewireLoginSteps login;

    @Steps
    CuentaSteps cuenta;

    @Managed
    public WebDriver driver;



    private String numCuenta;

    @Given("existe una cuentas $numCuenta")
    public void existeUnaCuentaConContactosAsociados(@Named("numCuenta") String numCuenta) {
        this.numCuenta = numCuenta;
        LOGGER.info("ConsultaDeContactosAsociadosACuentaPorFiltrosDefinitions.existeUnaCuentaConContactosAsociados");
    }

    @Given("existe contactos asociados a la cuentas")
    public void existeContactosAsociadosAUnaCuenta() {
        LOGGER.info("ConsultaDeContactosAsociadosACuentaPorFiltrosDefinitions.existeContactosAsociadosAUnaCuenta");
    }

    @When("busque la cuentas")
    public void buscarCuentaPorNumeroDeCuenta() {

        cuenta.consultarCuentaPorNumeroDeCuenta(numCuenta);
        LOGGER.info("ConsultaDeContactosAsociadosACuentaPorFiltrosDefinitions.cuandoBusqueCuentaExistenteNumero");

    }

    @When("desee visualizar los contactos asociados a la cuentas")
    public void deseeVisualizarLosContactosAsociadosALaCuenta() {
        cuenta.verContactosAsociados();
        LOGGER.info("ConsultaDeContactosAsociadosACuentaPorFiltrosDefinitions.deseeVisualizarLosContactosAsociadosALaCuenta");
    }

    @Then("debo ver contactos asociados a esta cuentas")
    public void deboVerContactosAsociadosAEstaCuenta() {
        MatcherAssert.assertThat(cuenta.obtenerContactosAsociadosWO().existenContactosAsociados(), Is.is(CoreMatchers.equalTo(Boolean.TRUE)));
        LOGGER.info("ConsultaDeContactosAsociadosACuentaPorFiltrosDefinitions.deboVerContactosAsociadosAEstaCuenta");
    }


    @Given("que he ingresado a PolicyCenter como usuario $rolUsuario")
    public void accesoAPolicyCenter(@Named("rolUsuario") String rolUsuario) {
        cuenta.login(driver, rolUsuario);
        LOGGER.info("IngresoAPolicyCenterDefinitions.dadoQueAccedoAPolicyCenterConRol");

    }



}
