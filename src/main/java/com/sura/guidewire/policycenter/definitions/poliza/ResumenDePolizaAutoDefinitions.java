package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.poliza.ResumenDePolizaAutoSteps;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class ResumenDePolizaAutoDefinitions {

    @Steps
    private ResumenDePolizaAutoSteps resumenDePolizaAutoSteps;

    @When("visualizo el resumen de la poliza")
    public void visualizarPoliza() {
        resumenDePolizaAutoSteps.visualizacionPoliza();
    }

    @When("se valida fecha de inicio de vigencia: $fecha")
    public void validoFechaInicioDeVigencia(String fecha) {
        resumenDePolizaAutoSteps.verificarFechaInicialVigencia(fecha);
    }

    @Then("verifico que se encuentren los siguientes datos $datos")
    public void verificarCamposResumen(ExamplesTable datos) {
        resumenDePolizaAutoSteps.verificacionDeCamposResumen(datos);
    }

    @Then("verifico los datos de coseguro $datos")
    public void verificarDatosCoaseguro(ExamplesTable datos) {
        resumenDePolizaAutoSteps.verificarCamposCoaseguro(datos);
    }

}
