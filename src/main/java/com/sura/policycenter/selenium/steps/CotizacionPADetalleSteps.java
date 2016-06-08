package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.menu.opciones.cuenta.OpcionesCotizacionPADetallePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.Map;

public class CotizacionPADetalleSteps extends ScenarioSteps {

    @Step
    public static void validarInformacionDetalleCotizacion(Map<String, String> infoDetalleCotizacion) {
        OpcionesCotizacionPADetallePage.validarInformacionDetalleCotizacion(infoDetalleCotizacion);
    }
}
