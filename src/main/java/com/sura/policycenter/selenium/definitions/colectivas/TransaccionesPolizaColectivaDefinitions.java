package com.sura.policycenter.selenium.definitions.colectivas;


import com.sura.policycenter.selenium.steps.colectivas.TransaccionesPolizaColectivaSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

public class TransaccionesPolizaColectivaDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    TransaccionesPolizaColectivaSteps transaccionesPolizaColectivaSteps;

    @When("seleccione la opcion del menu transacciones de tipo de poliza individual")
    public void seleccionarLaOpcionTransaccionesPolizaIndividual(){
        transaccionesPolizaColectivaSteps.seleccionarLaOpcionTransaccionesPolizaIndividual();
    }

    @When("de clic en el numero de poliza de transacciones poliza colectiva")
    public void darClicEnElNumeroDePoliza(){
        transaccionesPolizaColectivaSteps.darClicEnElNumeroDePoliza();
    }

    @Then("debo ver las opciones para transacciones de poliza colectiva e individual")
    public void validarOpcionesDelMenuParaPolizaColectivaEIndividual(){
        transaccionesPolizaColectivaSteps.validarOpcionesDelMenuParaPolizaColectivaEIndividual();
    }

    @Then("debo ver las transacciones de poliza colectiva: $transacciones")
    public void validarTransaccionesDePolizaColectiva(ExamplesTable transacciones){
        transaccionesPolizaColectivaSteps.validarTransaccionesDePolizaColectiva(transacciones);
    }

    @Then("debo ver las transacciones de poliza individual")
    public void validarTransaccionesDePolizaIndividual(){
        transaccionesPolizaColectivaSteps.validarTransaccionesDePolizaIndividual();
    }
}
