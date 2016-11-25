package com.sura.guidewire.policycenter;

import com.sura.guidewire.policycenter.steps.AnalisisDeRiesgoPaSteps;
import com.sura.guidewire.policycenter.steps.ExpedicionCambioDePolizaUWPEPSSteps;
import com.sura.guidewire.policycenter.steps.GeneracionUwIssueRiesgosConsultablesPaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class SolicitarSarlaftDefinitions {

    @Steps
    ExpedicionCambioDePolizaUWPEPSSteps expedicionCambioDePolizaUWPEPSSteps;

    @Steps
    GeneracionUwIssueRiesgosConsultablesPaSteps generacionUwIssueRiesgosConsultablesPaSteps;

    @Steps
    AnalisisDeRiesgoPaSteps analisisDeRiesgoPaSteps;

    @When("intente expedir la poliza cuyas figuras requieran Sarlaft")
    public void expedirPoliza(){
        expedicionCambioDePolizaUWPEPSSteps.emitir_poliza();
        analisisDeRiesgoPaSteps.aceptar_expedicion();
    }

    @Then("debo ver un UW issue que indique que se requiere diligenciar Sarlaft $mensaje")
    public void validarUWIssueSarlaft(ExamplesTable mensaje){
        generacionUwIssueRiesgosConsultablesPaSteps.validar_Que_Se_Genere_Uw_Issue(mensaje);
    }
}
