package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.CotizacionDePolizaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

public class CotizacionDePolizaSteps extends ScenarioSteps  {

    private CotizacionDePolizaPage cotizacionDePolizaPage = new CotizacionDePolizaPage(getDriver());

    public CotizacionDePolizaSteps(Pages pages){
        super(pages);
    }

    @Step
    public void ingresarARevisionPoliza() {
        cotizacionDePolizaPage.ingresarARevisionPoliza();
    }

    @Step
    public void verDetalleCotizacion() {
        cotizacionDePolizaPage.verDetalleCotizacion();
    }

    @Step
    public void validarInformacionCotizacion(Map<String, String> infoCotizacionPoliza, ExamplesTable informacionCotizacion) {
        cotizacionDePolizaPage.validarInformacionCotizacion(infoCotizacionPoliza, informacionCotizacion);
    }

    @Step
    public void validarDireccion(String direccion) {
        cotizacionDePolizaPage.validarDireccion(direccion);
    }

    @Step
    public void validarTipoRiesgoCausalFinanciera() {
        cotizacionDePolizaPage.validarTipoRiesgoCausalFinanciera();
    }

    @Step
    public void validarBloqueoCotizacion(String mensaje) {
        cotizacionDePolizaPage.validarBloqueoCotizacion(mensaje);
    }

    @Step
    public void validarFigurasCotizacion() {
        cotizacionDePolizaPage.validarFigurasCotizacion();
    }
}
