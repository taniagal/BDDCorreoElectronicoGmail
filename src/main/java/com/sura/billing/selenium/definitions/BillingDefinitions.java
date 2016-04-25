package com.sura.billing.selenium.definitions;

import com.sura.billing.selenium.steps.BillingSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by jorghome on 22/04/2016.
 */
public class BillingDefinitions {

    @Steps
    BillingSteps bcs;

    @Given("estoy en la pagina de autenticacion de BillingCenter")
    public void open() {
        bcs.open();
    }

    @When("ingrese username <usr> y password <pass>")
    public void login(@Named("usr") String user, @Named("pass") String password) {
        bcs.login(user, password);
    }

    @Then("deberia ingresar al sistema y ver el mensaje <message>")
    public void assertion(@Named("message") String msjResult) {
        bcs.assertion(msjResult);
    }

    @Then("el usuario deberia poder acceder a la administracion de dias festivos")
    public void admDiasFestivos() {
        bcs.admDiasFestivos();
    }

    @Then("el usuario deberia cerrar sesion")
    public void logout() {
        bcs.logout();
    }
}
