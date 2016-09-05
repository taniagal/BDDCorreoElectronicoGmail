package com.sura.policycenter.selenium.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;

public class CotizacionRenovacionPASteps {
    @Steps
    CotizacionMRCSteps cotizacionMRCSteps;

    @Given("se ha realizado la renovacion de la cotizacion <cotizacion>")
    public void buscarCotizacion(@Named("cotizacion") String cotizacion){
        cotizacionMRCSteps.ir_A_Buscar_Cotizacion_Poliza(cotizacion);
    }

}
