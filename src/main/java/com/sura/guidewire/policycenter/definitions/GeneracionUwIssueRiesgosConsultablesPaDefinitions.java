package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.ExpedicionDePolizaSteps;
import com.sura.guidewire.policycenter.steps.GeneracionUwIssueRiesgosConsultablesPaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class GeneracionUwIssueRiesgosConsultablesPaDefinitions {

    @Steps
    GeneracionUwIssueRiesgosConsultablesPaSteps generacionUwIssueRiesgosConsultablesPaSteps;

    @Steps
    ExpedicionDePolizaSteps expedicionDePolizaSteps;

    @When("vaya a la opcion de analisis de riesgo")
    public void irAAnalisisDeRiesgo(){
        generacionUwIssueRiesgosConsultablesPaSteps.irAAnalisisDeRiesgo();
    }

    @When("las figuras asegurado, beneficiario, tomador y/o cuentahabiente sean riesgo consultable e intente expedir la poliza")
    public void expedirPoliza() {
        expedicionDePolizaSteps.clicEnExpedirPoliza();
        generacionUwIssueRiesgosConsultablesPaSteps.aceptarExpedicionPoliza();
    }

    @Then("debo ver un UW issue por cada figura que sea riesgo consultable bloqueante $mensaje")
    public void validarUWIssue(ExamplesTable mensaje){
        generacionUwIssueRiesgosConsultablesPaSteps.validarQueSeGenereUwIssue(mensaje);
    }
}