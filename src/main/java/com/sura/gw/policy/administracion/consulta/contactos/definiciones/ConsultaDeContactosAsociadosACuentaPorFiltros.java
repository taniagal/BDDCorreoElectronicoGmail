package com.sura.gw.policy.administracion.consulta.contactos.definiciones;

import com.sura.gw.navegacion.steps.GuidewireLoginSteps;
import com.sura.gw.policy.administracion.consulta.cuenta.steps.CuentaSteps;
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


/**
 * @escenario: Consultar contactos asociados a una cuenta haciendo uso de los filtros rol y tipo persona
 */
public class ConsultaDeContactosAsociadosACuentaPorFiltros {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    @Steps
    GuidewireLoginSteps login;

    @Steps
    CuentaSteps cuenta;

    @Managed
    public WebDriver driver;

    private String numCuenta;
    private Boolean existeContactosAsociados;

/*
    @Given("consultare una cuenta $numCuenta que tiene contactos asociados con un usuario de acceso de rol $rolUsuario")
    @Composite(
            steps = {"Given existe una cuenta $numCuenta",
                    "Given existe contactos asociados a la cuenta",
                    "When ingrese a PolicyCenter y me loguee con un usuario de rol $rolUsuario",
                    "When busque la cuenta",
                    "Then debo ver contactos asociados a esta cuenta"
            }
    )
    public void composite_ConsultareUnaCuentaYTieneContactosAsociados(@Named("numCuenta") String numCuenta, @Named("rolUsuario") String rolUsuario) {
        this.numCuenta = numCuenta;
        LOGGER.info("ConsultaDeContactosAsociadosACuentaPorFiltrosDefinitions.composite_ConsultareUnaCuentaYTieneContactosAsociados");
    }*/


    @When("filtre los contactos asociados a una cuenta por el rol $filtro en el combo con valor $combo")
    @Alias("filtre los contactos asociados a una cuenta por el tipo de persona $filtro en el combo con valor $combo")
    public void filtreLosContactosAsociadosAEstaCuenta(@Named("filtro") String filtro, @Named("combo") String combo) {
        cuenta.contactosAsociados().filtrarContactosAsociados(filtro,combo);
        LOGGER.info("ConsultaDeContactosAsociadosACuentaPorFiltrosDefinitions.filtreLosContactosAsociadosAEstaCuenta");

    }

    @Then("debo ver contactos asociados a esta cuenta que cumplan con el filtro $filtro")
    public void deboVerContactosAsociadosAEstaCuentaConFiltros(@Named("filtro") String filtro) {
        assertThat(cuenta.contactosAsociados().existenContactosAsociados(), is(equalTo(Boolean.TRUE)));
        assertThat(cuenta.contactosAsociados().existenContactosAsociados(), is(equalTo(Boolean.TRUE)));
        LOGGER.info("ConsultaDeContactosAsociadosACuentaPorFiltrosDefinitions.deboVerContactosAsociadosAEstaCuentaConFiltros");
    }

    @Then("debo ver contactos asociados a esta cuenta que cumplan con el filtro <tipoPersona> y <rol>")
    public void deboVerContactosAsociadosAEstaCuentaConFiltros(@Named("tipoPersona") String filtroTipoPersona, @Named("rol") String filtroRol) {
        assertThat(cuenta.contactosAsociados().existenContactosAsociados(), is(equalTo(Boolean.TRUE)));
        LOGGER.info("ConsultaDeContactosAsociadosACuentaPorFiltrosDefinitions.deboVerContactosAsociadosAEstaCuentaConFiltros");
    }

    @When("ingrese a PolicyCenter y me loguee con un usuario de rol $rolUsuario")
    public void accesoAPolicyCenter(@Named("rolUsuario") String rolUsuario) {
        cuenta.login(driver, rolUsuario);
    }

/*
    @Then("debo ver contactos asociados a esta cuenta que cumplan con el rol <rol>")
    public void deboVerContactosAsociadosAEstaCuentaQueCumplaConElRol() {
    }

    @When("filtre los contactos asociados a una cuenta por el tipo de persona <tipoPersona>")
    public void filtreLosContactosAsociadosAUnaCuentaPorElTipoDePersona(String numCuenta) {
    }

    @Then("debo ver contactos asociados a esta cuenta que cumplan con el tipo de persona <tipoPersona>")
    public void deboVerContactosAsociadosAEstaCuentaQueCumplanConElTipoDePersona(String tipoPersona) {
    }


    @Then("debo ver contactos asociados a esta cuenta que cumplan con el tipo de persona <tipoPersona> y el rol <rol>")
    public void deboVerContactosAsociadosAEstaCuentaQueCumplanConElTipoDePersonaYElRol(String tipoPersona, String rol) {
    }*/

    /**
     * POST SCENARY
     */
    @AfterScenario
    public void finalizarEscenario(){
        SerenityWebdriverManager.inThisTestThread().closeCurrentDriver();
        LOGGER.info("ConsultaDeContactosAsociadosACuentaPorFiltrosDefinitions.finalizarEscenario");
    }

}
