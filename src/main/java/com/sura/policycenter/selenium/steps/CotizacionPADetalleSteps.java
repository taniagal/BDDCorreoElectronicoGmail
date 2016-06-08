package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.CotizacionPADetallePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.Map;

public class CotizacionPADetalleSteps extends ScenarioSteps {

    CotizacionPADetallePage cotizacionPADetallePage = new CotizacionPADetallePage(getDriver());

    @Step
    public void verDetalleCotizacion() {
        cotizacionPADetallePage.verDetalleCotizacion();
    }

    @Step
    public void validarInformacionDetalleCotizacion(Map<String, String> infoDetalleCotizacion) {
        cotizacionPADetallePage.validarInformacionDetalleCotizacion(infoDetalleCotizacion);
    }
}