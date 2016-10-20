package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.TarifaMRCSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;

public class TarifaMRCDefinitions {
    @Steps
    TarifaMRCSteps tarifaMRCSteps;

    @Then("debo poder ver el valor de la prima <prima> en la cotizacion")
    public void verificarTarifacion(@Named("prima")String prima){
        tarifaMRCSteps.verificar_tarifacion(prima);
    }
}
