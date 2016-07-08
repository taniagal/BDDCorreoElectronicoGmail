package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.CotizacionMRCPage;
import com.sura.policycenter.selenium.pages.InicioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

public class CotizacionMRCSteps extends ScenarioSteps {

    private CotizacionMRCPage cotizacionMRCPage = new CotizacionMRCPage(getDriver());

    public CotizacionMRCSteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    @Step
    public void ir_A_Buscar_Cotizacion_Poliza(String cotizacion) {
        cotizacionMRCPage.irABuscarCotizacion(cotizacion);
    }

    @Step
    public void ver_Detalle_Cotizacion() {
        cotizacionMRCPage.verDetalleCotizacion();
    }

    public void validar_Informacion_Cotizacion(Map<String, String> labelsCotizacionPoliza, ExamplesTable informacionCotizacion) {
        cotizacionMRCPage.validarInformacionCotizacion(labelsCotizacionPoliza,informacionCotizacion);
    }
}