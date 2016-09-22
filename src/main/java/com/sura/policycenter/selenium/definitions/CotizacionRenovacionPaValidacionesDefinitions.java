package com.sura.policycenter.selenium.definitions;

import com.google.inject.name.Named;
import com.sura.policycenter.selenium.steps.CotizacionMRCSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;

public class CotizacionRenovacionPaValidacionesDefinitions {

    @Steps
    CotizacionMRCSteps cotizacionMRCSteps;

    @Given("estoy cotizando la renovacion de la poliza <cotizacion>")
    public void ingresarARenovacionDeCotizacion(@Named("cotizacion") String cotizacion){
        cotizacionMRCSteps.ir_A_Buscar_Cotizacion_Poliza(cotizacion);
    }


}
