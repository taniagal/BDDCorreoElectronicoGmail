package com.sura.guidewire.policycenter.definitions;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class ImpresionReimpresionPaDefinitions {
    @Steps
    ImpresionReimpresionPaSteps impresionReimpresionPaSteps;

    @When("vaya a la opcion transacciones de poliza")
    public void irATransaccionesDePoliza() {
        impresionReimpresionPaSteps.irATransaccionesDePoliza();
    }

    @When("cuando de click al boton reimprimir")
    public void validarBotonReimprimir() {
        impresionReimpresionPaSteps.validarBotonReimpresion();
    }

    @When("expida la renovacion")
    public void expedirRenovacionPoliza() {
        impresionReimpresionPaSteps.expedirRenovacionPoliza();
    }

    @Then("me deben aparecer las opciones por las cuales puedo imprimir $opciones")
    public void validarOpcionesReimpresion(ExamplesTable opciones) {
        impresionReimpresionPaSteps.validarOpcionesReimprimir(opciones);
    }

    @Then("no se debe mostrar el boton reimpresion")
    public void validarNoPresenciaDeReimpresion() {
        impresionReimpresionPaSteps.validarNoPresenciaDeReimpresion();
    }

    @When("seleccione la opcion documento")
    public void seleccionarOpcionDeReimpresionDocumento() {
        impresionReimpresionPaSteps.SeleccionarOpcionDocumento();
    }

    @Then("deben seleccionarse todas las opciones de reimpresion")
    public void validarOpcionesReimpresion() {
        impresionReimpresionPaSteps.validarOpcionesSeleccionadas();
    }
}
