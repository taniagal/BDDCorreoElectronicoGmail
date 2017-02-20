package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.poliza.ValidacionesInformacionFacturacionSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.annotations.When;

public class validacionesInformacionFacturacionDefinitions {

    @Steps
    ValidacionesInformacionFacturacionSteps validacionesInformacionFacturacionSteps;


    @When("intente ingresar al modulo de facturacion")
    public void verificarInformacionVisualFacturacion(){
        validacionesInformacionFacturacionSteps.verificarInformacionVisual();
    }
}