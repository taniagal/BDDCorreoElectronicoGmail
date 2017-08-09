package com.sura.guidewire.policycenter.definitions.renovacion;

import com.google.inject.name.Named;
import com.sura.guidewire.policycenter.steps.colectivas.PolizaPrincipalPaSteps;
import com.sura.guidewire.policycenter.steps.poliza.CotizacionMRCSteps;
import com.sura.guidewire.policycenter.steps.renovacion.ExpedicionRenovacionPASteps;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class ExpedicionRenovacionPADefinitions {

    @Steps
    ExpedicionRenovacionPASteps expedicionRenovacionPASteps;

    @Steps
    CotizacionMRCSteps cotizacionMRCSteps;

    @Steps
    PolizaPrincipalPaSteps polizaPrincipalPaSteps;

    @Given("se esta cotizando una renovacion de poliza <cotizacion>")
    public void buscarCotizacion(@Named("cotizacion") String cotizacion){
        cotizacionMRCSteps.irABuscarCotizacionPoliza(cotizacion);
    }

    @When("emita la renovacion")
    public void emitirRenovacion(){
        polizaPrincipalPaSteps.validarMenuOpcionFormulariosNoEsVisible();
        expedicionRenovacionPASteps.emitir_Renovacion();
    }

    @Then("se debe mostrar un mensaje que indique $mensaje")
    public void validarMensajeAdvertencia(ExamplesTable mensaje){
        expedicionRenovacionPASteps.validar_Mensaje_Advertencia_De_Renovacion(mensaje);
    }

}
