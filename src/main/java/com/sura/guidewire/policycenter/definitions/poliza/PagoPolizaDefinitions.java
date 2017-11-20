package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.poliza.PagoPolizaSteps;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by juanzaag on 28/11/2016.
 */
public class PagoPolizaDefinitions {

    @Steps
    PagoPolizaSteps pagoPolizaSteps;


    @When("ingrese a la opcion de pago")
    @Then("ingrese a la opcion de pago")
    public void cuandoIngreseALAOpcionDePago() {
        pagoPolizaSteps.ingresar_a_la_opcion_de_pago();
    }

    @Then("ningun campo puede ser editable en pago")
    public void entoncesNingunCampoPuedeSerEditable() {
        pagoPolizaSteps.validarCamposNoEditablesEnPagoDePoliza();
    }
}