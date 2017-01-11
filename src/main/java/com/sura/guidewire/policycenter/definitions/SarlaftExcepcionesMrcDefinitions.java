package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.SarlaftExcepcionesMrcSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaTasaUnicaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class SarlaftExcepcionesMrcDefinitions {


    @Steps
    TarifaTasaUnicaSteps tasaUnicaSteps;

    @Then("expido la poliza y voy al archivo de poliza")
    public void expedirPolizaMrc() {
        tasaUnicaSteps.expedirPoliza();
        tasaUnicaSteps.irAArchivoDePolizaExpedida();
    }
}
