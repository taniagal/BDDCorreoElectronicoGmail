package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.modificacion.ExpedicionCambioDePolizaUWPEPSSteps;
import com.sura.guidewire.policycenter.steps.poliza.AnalisisDeRiesgoPaSteps;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class AnalisisDeRiesgoPaDefinitions {

    @Steps
    ExpedicionCambioDePolizaUWPEPSSteps expedicionCambioDePolizaUWPEPSSteps;

    @Steps
    AnalisisDeRiesgoPaSteps analisisDeRiesgoPaSteps;

    @When("intente expedir una poliza con un valor asegurado del vehiculo, valor accesosios y accesorios especiales superior al permitido")
    public void expedirPolizaValorAsegurado(){
        expedicionCambioDePolizaUWPEPSSteps.emitir_poliza();
        analisisDeRiesgoPaSteps.aceptarExpedicion();
    }

    @When("ingrese a analisis de riesgo")
    public void ingreseAnalisisDeRiesgoDos(){
        analisisDeRiesgoPaSteps.ingresarAAnalisisDeRiesgo();
    }

    @Then("se debe generar un bloqueo en la poliza, mostrar el siguiente mensaje $mensaje")
    public void validarBloqueoExpedicion(ExamplesTable mensaje){
        analisisDeRiesgoPaSteps.validarQueSeGenereBloqueo(mensaje);
    }

    @Then("generar un UW issue $UWIssue")
    public void validarGeneracionUWIssue(ExamplesTable uwissue){
        analisisDeRiesgoPaSteps.validarQueSeGenereUWIssue(uwissue);
    }
    @Then("ingrese a analisis de riesgo")
    public void ingreseAnalisisDeRiesgo(){
        analisisDeRiesgoPaSteps.ingresarAAnalisisDeRiesgo();
    }

}
