package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.CotizacionMRCPage;
import java.util.Map;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;


public class CotizacionMRCSteps extends ScenarioSteps {

    private final CotizacionMRCPage cotizacionMRCPage = new CotizacionMRCPage(getDriver());

    public CotizacionMRCSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void irABuscarCotizacionPoliza(String cotizacion) {
        cotizacionMRCPage.irABuscarCotizacion(cotizacion);
    }

    @Step
    public void verDetalleCotizacion() {
        cotizacionMRCPage.verDetalleCotizacion();
    }

    @Step
    public void validarInformacionCotizacion(Map<String, String> labelsCotizacionPoliza, ExamplesTable informacionCotizacion) {
        cotizacionMRCPage.validarInformacionCotizacion(labelsCotizacionPoliza, informacionCotizacion);
    }

    @Step
    public void validarPrima(String primaTotal) {
        cotizacionMRCPage.validarPrima(primaTotal);
    }

    @Step
    public void mostrarDetallePrimaPorRiesgo(Map<String, String> labelsCotizacionPoliza) {
        cotizacionMRCPage.mostrarDetallePrima(labelsCotizacionPoliza);
    }

    @Step
    public void validarBloqueoCotizacion(String mensaje) {
        cotizacionMRCPage.validarBloqueoCotizacion(mensaje);
    }

    @Step
    public void ingresarACotizacion() {
        cotizacionMRCPage.ingresarACotizacion();
    }

    @Step
    public void validarTipoRiesgo() {
        cotizacionMRCPage.validarTipoRiesgo();
    }
}