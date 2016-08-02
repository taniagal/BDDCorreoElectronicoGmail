package com.sura.gw.policy.contactos.definiciones;

import com.sura.gw.navegacion.steps.GuidewireLoginSteps;
import com.sura.gw.policy.cuenta.steps.CuentaSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.StepInterceptor;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.jbehave.core.annotations.*;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ConsultaDeContactosAsociadosACuentaBasico {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    @Steps
    GuidewireLoginSteps login;

    @Steps
    CuentaSteps cuenta;

    @Managed
    public WebDriver driver;


    private String numCuenta;

    @Given("existe una cuenta $numCuenta")
    public void existeUnaCuentaConContactosAsociados(@Named("numCuenta") String numCuenta) {
        this.numCuenta = numCuenta;
        LOGGER.info("ConsultaDeContactosAsociadosACuentaPorFiltrosDefinitions.existeUnaCuentaConContactosAsociados");
    }

    @Given("existe contactos asociados a la cuenta")
    public void existeContactosAsociadosAUnaCuenta() {
        LOGGER.info("ConsultaDeContactosAsociadosACuentaPorFiltrosDefinitions.existeContactosAsociadosAUnaCuenta");
    }

    @When("busque la cuenta")
    public void buscarCuentaPorNumeroDeCuenta() {

        cuenta.consultarCuentaPorNumeroDeCuenta(numCuenta);
        LOGGER.info("ConsultaDeContactosAsociadosACuentaPorFiltrosDefinitions.cuandoBusqueCuentaExistenteNumero");

    }

    @When("desee visualizar los contactos asociados a la cuenta")
    public void deseeVisualizarLosContactosAsociadosALaCuenta() {
        cuenta.verContactosAsociados();
        LOGGER.info("ConsultaDeContactosAsociadosACuentaPorFiltrosDefinitions.deseeVisualizarLosContactosAsociadosALaCuenta");
    }

    @Then("debo ver contactos asociados a esta cuenta")
    public void deboVerContactosAsociadosAEstaCuenta() {
        assertThat(cuenta.obtenerContactosAsociadosWO().existenContactosAsociados(), is(equalTo(Boolean.TRUE)));
        LOGGER.info("ConsultaDeContactosAsociadosACuentaPorFiltrosDefinitions.deboVerContactosAsociadosAEstaCuenta");
    }


    @Given("que he ingresado a PolicyCenter como usuario $rolUsuario")
    public void accesoAPolicyCenter(@Named("rolUsuario") String rolUsuario) {
        cuenta.login(driver, rolUsuario);
        LOGGER.info("IngresoAPolicyCenterDefinitions.dadoQueAccedoAPolicyCenterConRol");

    }

    /**
     * AFTER SCENARY
     */
    @AfterScenario

    public void finalizarEscenario(){
        SerenityWebdriverManager.inThisTestThread().closeCurrentDriver();
        LOGGER.info("ConsultaDeContactosAsociadosACuentaPorFiltrosDefinitions.finalizarEscenario");
    }

}
