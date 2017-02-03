package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.poliza.ProrrogaDePolizaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class ProrrogaDePolizaDefinitions {

    @Steps
    ProrrogaDePolizaSteps prorrogaDePolizaSteps;

    @When("se esta realizando una prorroga")
    public void validarProrroga(){
        prorrogaDePolizaSteps.validarProrroga();
    }

    @Then("se debe habilitar la fecha de fin de vigencia de la poliza")
    public void validarFechaFinVigencia(){
        prorrogaDePolizaSteps.validarFechaFinVigencia();
    }
}
