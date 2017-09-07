package com.sura.guidewire.policycenter.definitions.contacto;

import com.sura.guidewire.policycenter.steps.cuenta.CuentaSteps;
import com.sura.guidewire.policycenter.utils.navegacion.steps.GuidewireLoginSteps;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;


public class ConsultaDeContactosAsociadosACuentaBasico {

    @Managed
    public WebDriver driver;
    @Steps
    GuidewireLoginSteps login;
    @Steps
    CuentaSteps cuenta;
    private String numCuenta;

    @Given("existe una cuenta $numCuenta")
    public void existeUnaCuentaConContactosAsociados(@Named("numCuenta") String numCuenta) {
        this.numCuenta = numCuenta;
    }

    @When("busque la cuenta")
    public void buscarCuentaPorNumeroDeCuenta() {
        cuenta.consultarCuentaPorNumeroDeCuenta(numCuenta);

    }

    @When("desee visualizar los contactos asociados a la cuenta")
    public void deseeVisualizarLosContactosAsociadosALaCuenta() {
        cuenta.verContactosAsociados();
    }

    @Then("debo ver contactos asociados a esta cuenta")
    public void deboVerContactosAsociadosAEstaCuenta() {
        MatcherAssert.assertThat(cuenta.obtenerContactosAsociadosWO().existenContactosAsociados(), Is.is(CoreMatchers.equalTo(Boolean.TRUE)));
    }


    @Given("que he ingresado a PolicyCenter")
    public void accesoAPolicyCenter() {
        //Empty Method
    }


}
