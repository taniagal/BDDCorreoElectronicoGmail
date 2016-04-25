package com.sura.claims.selenium.definitions;

import com.sura.claims.selenium.steps.ClaimsSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by edwabuac on 19/04/2016.
 */
public class ReclamacionDefinitions {

    @Steps
    ClaimsSteps cs;

    @Given("abro la aplicacion")
    public void givenAbroLaAplicacion() {
        cs.open();
    }

    @Given("y me logeado en ClaimsCenter <usr> <pass>")
    public void login(@Named("usr") String usr,@Named("pass") String pass) {
    cs.login(usr, pass);
    }

    @When("cuando ingrese a la pantalla de reclamacion")
    public void getReclamacion() throws InterruptedException {
        try {
            cs.navegacion();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("ingrese los datos necesarios <npoliza>")
    public void llenarFormulario(@Named("npoliza")String npoliza) {
        cs.setReclamacion(npoliza);
    }

    @Then("deberia poder crear una reclamacion y ver el <mensaje>")
    public void terminarReclamacion(@Named("mensaje")String msn) {
        cs.asercion(msn);
        cs.logout();
    }


}
