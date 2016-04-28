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
    ClaimsSteps claimsteps;

    /**
     * Pasos Login
     */
    @Given("ingreso a la app")
    public void open(){
        claimsteps.open();
    }
    @When("ingrese <usr> y <pass>")
    public void login(@Named("usr") String usr, @Named("pass") String pass){
        claimsteps.login(usr,pass);
    }
    @Then("deberia ingresar a la applicacion <message>")
    public void assertion(@Named("message") String msn) {
        claimsteps.assertion(msn);
    }
    @When("cuando ingrese a la pantalla de reclamacion")
    public void getReclamacion() throws InterruptedException {
            claimsteps.navegacion();
    }
    @When("ingrese los datos necesarios <npoliza>")
    public void llenarFormulario(@Named("npoliza")String npoliza) {
        claimsteps.llenarReclamacion(npoliza);
    }
    @Then("deberia poder crear una reclamacion y ver el <mensaje>")
    public void terminarReclamacion(@Named("mensaje")String msn) {
        claimsteps.asercion(msn);
        claimsteps.logout();
    }
}
