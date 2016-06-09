package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.CotizacionPADetallePage;
import com.sura.policycenter.selenium.pages.InicioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.Map;

public class CotizacionPADetalleSteps extends ScenarioSteps {

    CotizacionPADetallePage cotizacionPADetallePage = new CotizacionPADetallePage(getDriver());

    public CotizacionPADetalleSteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    @Step
    public void irABuscarSubPoliza(String cotizacion) {
        inicioPage().irABuscarSubPoliza(cotizacion);
    }

    @Step
    public void verDetalleCotizacion() {
        cotizacionPADetallePage.verDetalleCotizacion();
    }

    @Step
    public void validarInformacionDetalleCotizacion(Map<String, String> infoDetalleCotizacion) {
        cotizacionPADetallePage.validarInformacionDetalleCotizacion(infoDetalleCotizacion);
    }

    @Step
    public void validarTerminoCobertura() {
        cotizacionPADetallePage.validarTerminoCobertura();
    }
}