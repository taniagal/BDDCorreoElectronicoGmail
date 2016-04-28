package com.sura.claims.selenium.definitions;

import com.sura.claims.selenium.steps.ClaimsSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by jonamele on 20/04/2016.
 */
public class BuscaDefinition {

    @Steps
    ClaimsSteps cs;

    @Given("abro la aplicacion como super usuario")

    public void open(){
        cs.open();
    }

    @Given("me logeo en ClaimsCenter <usr> <pass>")
    public void login (@Named("usr") String user, @Named("pass") String pass) throws InterruptedException {
        cs.login(user, pass);
    }

    @When("cuando ingrese a la opcion de busqueda avanzada")
    public void navegacionBuscaAvanzada() throws InterruptedException {
        cs.navegacionBuscaAvanzada();
    }

    @When("ingrese los datos de poliza <npoliza>")
     public void buscaPoliza (@Named("npoliza") String poliza) {
        cs.buscaPolizaAvanzada(poliza);
        cs.asersionPoliza(poliza);
     }

    @Then("deberia buscar una reclamacion")
    public void logout(){
    }


}
