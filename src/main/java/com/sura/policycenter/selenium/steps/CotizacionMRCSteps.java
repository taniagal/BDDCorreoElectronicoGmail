package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.CotizacionMRCPage;
import com.sura.policycenter.selenium.pages.InicioPage;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class CotizacionMRCSteps extends ScenarioSteps {

    private CotizacionMRCPage cotizacionMRCPage = new CotizacionMRCPage(getDriver());

    public CotizacionMRCSteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    public void ir_A_Buscar_Cotizacion_Poliza(String cotizacion) {
        cotizacionMRCPage.irABuscarCotizacion(cotizacion);
    }
}