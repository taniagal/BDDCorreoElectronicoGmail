package com.sura.claims.selenium.definitions;

import com.sura.claims.selenium.steps.ClaimsSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by edwabuac on 15/04/2016.
 */
public class ClaimsDefinitions {
    @Steps
    ClaimsSteps cs;

    @Given("estoy en la pagina de autenticacion de ClaimsCenter")
    public void open() {
       cs.open();
    }

    @When("ingrese username <usr> y password <pass>")
    public void login(@Named("usr") String user, @Named("pass") String password) {
       cs.login(user,password);
    }

    @Then("deberia ingresar al sistema y ver el mensaje <message>")
    public void assertion(@Named("message") String msn) {
        cs.assertion(msn);
    }
}
