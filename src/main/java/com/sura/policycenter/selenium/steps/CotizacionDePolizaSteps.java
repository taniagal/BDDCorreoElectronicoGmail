package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.CotizacionDePolizaPage;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class CotizacionDePolizaSteps extends ScenarioSteps  {

    private CotizacionDePolizaPage cotizacionDePolizaPage = new CotizacionDePolizaPage(getDriver());

    public CotizacionDePolizaSteps(Pages pages){
        super(pages);
    }

    public void verDetalleCotizacion() {
        cotizacionDePolizaPage.verDetalleCotizacion();
    }

    public void validarInformacionCotizacion(ExamplesTable informacionCotizacion) {
        cotizacionDePolizaPage.validarInformacionCotizacion(informacionCotizacion);
    }

    public void validarDireccion(String direccion) {
        cotizacionDePolizaPage.validarDireccion(direccion);
    }
}
