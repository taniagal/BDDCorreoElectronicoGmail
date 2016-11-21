package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.ExpedicionCambioDePolizaUWPEPSSteps;
import com.sura.guidewire.policycenter.steps.AnalisisDeRiesgoPaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class AnalisisDeRiesgoPaDefinitions {

    @Steps
    ExpedicionCambioDePolizaUWPEPSSteps expedicionCambioDePolizaUWPEPSSteps;

    @Steps
    AnalisisDeRiesgoPaSteps analisisDeRiesgoPaSteps;

    @When("intente expedir una poliza con un valor asegurado del vehiculo superior al permitido")
    public void expedirPolizaValorAsegurado(){
        expedicionCambioDePolizaUWPEPSSteps.emitir_poliza();
        analisisDeRiesgoPaSteps.aceptar_expedicion();
    }

    @When("intente expedir una poliza con un valor de accesorios superior al permitido")
    public void expedirPolizaValorAccesorios(){
        expedicionCambioDePolizaUWPEPSSteps.emitir_poliza();
        analisisDeRiesgoPaSteps.aceptar_expedicion();
    }

    @When("intente expedir una poliza con un valor de accesorios especiales superior al permitido")
    public void expedirPolizaValorAccesoriosEspeciales(){
        expedicionCambioDePolizaUWPEPSSteps.emitir_poliza();
        analisisDeRiesgoPaSteps.aceptar_expedicion();
    }

    @Then("se debe generar un bloqueo en la poliza, mostrar el siguiente mensaje $mensaje")
    public void validarBloqueoExpedicion(ExamplesTable mensaje){
        analisisDeRiesgoPaSteps.validar_Que_Se_Genere_Bloqueo(mensaje);
    }

    @Then("generar un UW issue $UWIssue")
    public void validarGeneracionUWIssue(ExamplesTable uwissue){
        analisisDeRiesgoPaSteps.validar_Que_Se_Genere_UWIssue(uwissue);
    }
}
