package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.PolicySteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by jorghome on 16/03/2016.
 */
public class PolicyDefinitions {

    @Steps
    PolicySteps pcs;


    @Given("el usuario ingresa a la pagina de autenticacion de PolicyCenter")
    public void open() {
        pcs.open();
    }

    @When("el usuario ingresa username <usr> y password <pass>")
    public void login(@Named("usr") String user, @Named("pass") String password) {
        pcs.login(user, password);
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




