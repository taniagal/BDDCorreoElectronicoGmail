package com.sura.claims.selenium.definitions;

import com.sura.claims.selenium.pages.InicioPage;
import com.sura.claims.selenium.steps.ClaimsSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;

@SuppressWarnings("WeakerAccess")
public class ReclamacionDefinitions {

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    @Steps
    private ClaimsSteps claimsteps;

    @Given("ingreso a la app")
    public void open(){
        claimsteps.open();
    }
    @When("ingrese <usr> y <pass>")
    public void login(@Named("usr") String usr, @Named("pass") String pass){
        claimsteps.login(usr,pass);
    }

    @When("cuando ingrese a la pantalla de reclamacion")
    public void navegaReclamacion() throws InterruptedException {
            inicioPage().irABuscarReclamacion();
    }
    @When("ingrese los datos necesarios <npoliza>")
    public void llenarFormulario(@Named("npoliza")String npoliza) {
        claimsteps.waitABit(19000);

    }


}
