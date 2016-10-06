package com.sura.policycenter.selenium.definitions;

import com.google.inject.name.*;
import com.google.inject.name.Named;
import com.sura.policycenter.selenium.steps.CotizacionMRCSteps;
import com.sura.policycenter.selenium.steps.ExpedicionRenovacionPASteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;
import org.jbehave.core.model.ExamplesTable;

public class ExpedicionRenovacionPADefinitions {

    @Steps
    ExpedicionRenovacionPASteps expedicionRenovacionPASteps;

    @Steps
    CotizacionMRCSteps cotizacionMRCSteps;

    @Given("se esta cotizando una renovacion de poliza <cotizacion>")
    public void buscarCotizacion(@Named("cotizacion") String cotizacion){
        cotizacionMRCSteps.ir_A_Buscar_Cotizacion_Poliza(cotizacion);
    }

    @When("emita la renovacion")
    public void emitirRenovacion(){
        expedicionRenovacionPASteps.emitir_Renovacion();
    }

    @Then("se debe mostrar un mensaje que indique $mensaje")
    public void validarMensajeAdvertencia(ExamplesTable mensaje){
        expedicionRenovacionPASteps.validar_Mensaje_Advertencia_De_Renovacion(mensaje);
    }

}
