package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.ImpresionReimpresionSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class ImpresionReimpresionDefinitions {
    @Steps
    ImpresionReimpresionSteps impresionReimpresionSteps;

    @When("vaya a la opcion transacciones de poliza")
    public void irATransaccionesDePoliza() {
        impresionReimpresionSteps.irATransaccionesDePoliza();
    }

    @When("cuando de click al boton reimprimir")
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

    @When("me deben aparecer las opciones por las cuales puedo imprimir $opciones")
    public void validarOpcionesReimpresion(ExamplesTable opciones) {
        impresionReimpresionSteps.validarOpcionesReimprimir(opciones);
    }

}
