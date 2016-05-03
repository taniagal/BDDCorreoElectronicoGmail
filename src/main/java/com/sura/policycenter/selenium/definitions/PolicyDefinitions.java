package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.PolicySteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class PolicyDefinitions {

    @Steps
    PolicySteps pcs;

    @Given("el usuario ingresa a la pagina de autenticacion de PolicyCenter")
    public void open() {
        pcs.open();

    }

    @Given("el usuario ingresa a la pagina de autenticacion de PolicyCenter - Seus")
    public void openSeus() {
        pcs.openSeus();
    }

    @When("el usuario ingresa username <usr> y password <pass>")
    public void login(@Named("usr") String user, @Named("pass") String password) {
        pcs.login(user, password);
    }

    @When("el usuario ingresa pais <country>, username <usr> y password <pass>")
    public void login(@Named("country") String country, @Named("usr") String user, @Named("pass") String password) {
        pcs.loginSeus(country ,user, password);
        pcs.elegirLenguaje();
    }

    @Then("el usuario deberia ver la pagina de inicio correspondiente a su rol <message>")
    public void assertion(@Named("message") String msjResult) {
        pcs.assertion(msjResult);
    }

    @Then("el usuario deberia poder acceder a nuevo contacto persona")
    public void nuevoContactoPersona() throws InterruptedException {
        pcs.nuevoContactoPersona();
    }

    @Then("el usuario deberia cerrar sesion")
    public void logout() {
        pcs.logout();
    }

}




