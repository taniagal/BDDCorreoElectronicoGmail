package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.CotizacionPADetallePage;
import com.sura.guidewire.policycenter.pages.commons.InicioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;


public class CotizacionPADetalleSteps extends ScenarioSteps {

    CotizacionPADetallePage cotizacionPADetallePage = new CotizacionPADetallePage(getDriver());

    public CotizacionPADetalleSteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    @Step
    public void ir_A_Buscar_Cotizacion_Poliza(String cotizacion) {
        inicioPage().irABuscarSubPoliza(cotizacion);
    }

    @Step
    public void ver_Detalle_Cotizacion() {
        cotizacionPADetallePage.verDetalleCotizacion();
    }

    @Step
    public void validarTerminoCobertura() {
        cotizacionPADetallePage.validarTerminoCobertura();
    }
}