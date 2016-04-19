package com.sura.claims.selenium.definitions;

import com.sura.claims.selenium.steps.ClaimsSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;

public class ReclamacionDefinitons {
    @Steps
    ClaimsSteps cs;

    @Given ("abro la aplicacion")
    public void open(){
        cs.open();
    }

    @Given ("y me logeado en ClaimsCenter <usr> <pass>")
    public void login(@Named("usr") String user, @Named("Pass") String pass) {
        cs.login(user, pass);
    }

    @When("cuando ingrese a la pantalla de reclamacion")
    public void navegacion() {
        cs.navegacion();
    }

    @When("ingrese los datos necesarios <poliza>")
    public void crearReclamacion(@Named("npoliza") String npoliza) {
        cs.setReclamacion(npoliza);
    }

    @Then("deberia poder crear una reclamacion")
    public void logout(){
    }
}


