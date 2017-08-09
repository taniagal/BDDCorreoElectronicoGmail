package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.modificacion.CambioEnExpedicionDePolizaSteps;
import com.sura.guidewire.policycenter.steps.modificacion.ExpedicionCambioDePolizaUWPEPSSteps;
import com.sura.guidewire.policycenter.steps.poliza.AnalisisDeRiesgoPaSteps;
import com.sura.guidewire.policycenter.steps.poliza.GeneracionUwIssueRiesgosConsultablesPaSteps;
import com.sura.guidewire.policycenter.steps.poliza.SolicitarRequisitoPaSteps;

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

    @Steps
    CambioEnExpedicionDePolizaSteps cambioEnExpedicionDePolizaSteps;

    @Steps
    SolicitarRequisitoPaSteps solicitarRequisitoPaSteps;


    @When("intente expedir la poliza cuyas figuras requieran Sarlaft")
    public void expedirPoliza(){
        expedicionCambioDePolizaUWPEPSSteps.emitir_poliza();
        analisisDeRiesgoPaSteps.aceptarExpedicion();
    }

    @When("ingrese la organizacion, canal y tipo de poliza")
    public void ingresarOrganizacion(){
        solicitarRequisitoPaSteps.llenarInfoPoliza();
    }

    @When("intente expedir la modificacion cuyas figuras requieran Sarlaft")
    public void modificarPoliza(){
        expedicionCambioDePolizaUWPEPSSteps.emitir_poliza();
        cambioEnExpedicionDePolizaSteps.clicEnAceptarDelMensajeDeConfirmacion();
    }
    @When("debe aparecer un mensaje bloqueante en la ventana de requisitos $mensaje")
    public void validarMensajeBloqueante(ExamplesTable mensaje){
        generacionUwIssueRiesgosConsultablesPaSteps.validarMensajeBloqueanteSarlaft(mensaje);
    }
    @Then("debo ver un UW issue que indique que se requiere diligenciar Sarlaft $mensaje")
    public void validarUWIssueSarlaft(ExamplesTable mensaje){
        generacionUwIssueRiesgosConsultablesPaSteps.validarQueSeGenereUwIssue(mensaje);
    }
}
