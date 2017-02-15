package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.poliza.ResumenDePolizaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class ResumenDePolizaDefinitions {

    @Steps
    private ResumenDePolizaSteps resumenDePolizaSteps;


    @When("visualizo el resumen de la poliza")
    public void visualizarPoliza() {
        resumenDePolizaSteps.visualizacionPoliza();
    }

    @Then("verifico que se encuentren los siguientes datos $datos")
    public void verificarCamposResumen(ExamplesTable datos) {
        resumenDePolizaSteps.verificacionDeCamposResumen(datos);
    }


    @Then("verifico los datos de coseguro $datos")
    public void verificarDatosCoaseguro(ExamplesTable datos) {
        resumenDePolizaSteps.verificarCamposCoaseguro(datos);
    }

}
