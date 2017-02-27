package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.poliza.ValidacionesInformacionFacturacionSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class validacionesInformacionFacturacionDefinitions {

    @Steps
    ValidacionesInformacionFacturacionSteps validacionesInformacionFacturacionSteps;


    @When("intente ingresar al modulo de facturacion")
    public void ingresarMenuFacturacion(){

        validacionesInformacionFacturacionSteps.ingresarMenuFacturacion();
    }

    @Then("se debe visualizar la informacion de facturacion de polizas")
    public void verificarInformacionDeFacturacion(){
        validacionesInformacionFacturacionSteps.verificarInformacionDeFacturacion();
    }
}