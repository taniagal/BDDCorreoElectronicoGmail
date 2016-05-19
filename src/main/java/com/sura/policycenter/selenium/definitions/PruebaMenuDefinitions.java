package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.PruebaMenuSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by jorghome on 04/05/2016.
 */
public class PruebaMenuDefinitions {

    @Steps
    PruebaMenuSteps pms;

    //@WithTag("prueba:menu")

    @Given("ingreso a la pagina de autenticacion de PolicyCenter")
    public void open() {
        pms.open();

    }

    @When("ingreso username <usr> y password <pass>")
    public void login(@Named("usr") String user, @Named("pass") String password) {
        pms.login(user, password);
    }

    @Then("deberia ver la pagina de inicio correspondiente a su rol <message>")
    public void assertion(@Named("message") String msjResult) {
        pms.assertion(msjResult);
    }

    @Then("deberia navegar por todos los menu")
    public void nuevoContactoPersona() throws InterruptedException {
        pms.pruebaNavegacion();
    }

    @Then("deberia cerrar sesion")
    public void logout() {
        pms.logout();
    }
}
