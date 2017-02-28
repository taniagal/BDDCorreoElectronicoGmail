package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.poliza.InformacionPolizaWorkPlanSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class InformacionPolizaWorkPlanDefinitions {
    @Steps
    InformacionPolizaWorkPlanSteps informacionPolizaWorkPlanSteps;

    @When("ingese al plan del trabajo")
    public void ingresarPlanTrabajo() {
        informacionPolizaWorkPlanSteps.clickPlanTrabajo();
    }

    @When("me debe mostrar los siguientes campos: numeroPoliza, tomador, tipoDocumento, numeroDocumento")
    public void validarCampos() {
        informacionPolizaWorkPlanSteps.validarDatosTransaccion();
    }

    @When("cuando vea las actividades asociadas a ese tomador")
    public void buscarActividades() {
        informacionPolizaWorkPlanSteps.buscarActividades();
    }

    @Then("debe mostrar el menu de actividad")
    public void mostrarMenuDeActividades() {
        informacionPolizaWorkPlanSteps.menuActividades();
    }


}
