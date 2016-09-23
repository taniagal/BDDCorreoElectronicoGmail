package com.sura.policycenter.selenium.definitions;

import com.google.inject.name.Named;
import com.sura.policycenter.selenium.steps.CotizacionMRCSteps;
import com.sura.policycenter.selenium.steps.CotizacionRenovacionPaValidacionesSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;

public class CotizacionRenovacionPaValidacionesDefinitions {

    @Steps
    CotizacionMRCSteps cotizacionMRCSteps;

    @Steps
    CotizacionRenovacionPaValidacionesSteps cotizacionRenovacionPaValidacionesSteps;

    @Given("estoy cotizando la renovacion de la poliza <cotizacion>")
    public void ingresarARenovacionDeCotizacion(@Named("cotizacion") String cotizacion){
        cotizacionMRCSteps.ir_A_Buscar_Cotizacion_Poliza(cotizacion);
    }

    @When("cotice con algunas de las figuras que som Riesgo consultable bloqueante")
    public void validarFigurasRiesgoConsultable(){
        cotizacionRenovacionPaValidacionesSteps.seleccionar_Opcion_Cotizar();
    }
}
