package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.menu.opciones.cuenta.OpcionesCotizacionPADetallePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.Map;

public class CotizacionPADetalleSteps extends ScenarioSteps {

    OpcionesCotizacionPADetallePage opcionesCotizacionPADetallePage = new OpcionesCotizacionPADetallePage(getDriver());

    @Step
    public void validarInformacionDetalleCotizacion(Map<String, String> infoDetalleCotizacion) {
        opcionesCotizacionPADetallePage.validarInformacionDetalleCotizacion(infoDetalleCotizacion);
    }
}