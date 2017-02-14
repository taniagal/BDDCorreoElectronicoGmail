package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.ImpresionReimpresionSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class ImpresionReimpresionDefinitions {
    @Steps
    ImpresionReimpresionSteps impresionReimpresionSteps;

    @When("vaya a la opcion transacciones de poliza")
    public void irATransaccionesDePoliza() {
        impresionReimpresionSteps.irATransaccionesDePoliza();
    }

    @Then("debe aparecer el boton reimprimir")
    public void validarBotonReimprimir() {
        impresionReimpresionSteps.validarBotonReimpresion();
    }

    @When("seleccione las transacciones de esa poliza")
    public void seleccionarTransaccionesDeCuenta() {
        impresionReimpresionSteps.seleccionarTransaccionesDeCuenta();


    }
    @When("expida la renovacion")
    public void expedirRenovacionPoliza() {
        impresionReimpresionSteps.expedirRenovacionPoliza();


    }


}
