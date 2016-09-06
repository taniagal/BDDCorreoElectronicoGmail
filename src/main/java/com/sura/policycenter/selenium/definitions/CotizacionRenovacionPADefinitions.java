package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.CotizacionMRCSteps;
import com.sura.policycenter.selenium.steps.CotizacionRenovacionPASteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.model.ExamplesTable;

public class CotizacionRenovacionPADefinitions {
    @Steps
    CotizacionMRCSteps cotizacionMRCSteps;

    @Steps
    CotizacionRenovacionPASteps cotizacionRenovacionPASteps;

    @Given("se ha realizado la renovacion de la cotizacion <cotizacion>")
    public void buscarCotizacion(@Named("cotizacion") String cotizacion){
        cotizacionMRCSteps.ir_A_Buscar_Cotizacion_Poliza(cotizacion);
    }

    @Then("se debe mostrar la informacion del detalle de cotizacion por riesgo, donde se muestre: $detalleCotizacion")
    public void validarDetalleCotizacion(ExamplesTable detalleCotizacion){
        cotizacionRenovacionPASteps.validar_Detalle_De_Cotizacion(detalleCotizacion);
    }

    @Then("en el detalle por coberturas mostrar: $detalleCobertura")
    public void validarDetallePorCobertura(ExamplesTable detalleCobertura){
        cotizacionRenovacionPASteps.validar_Detalle_Por_Cobertura(detalleCobertura);
    }
}
