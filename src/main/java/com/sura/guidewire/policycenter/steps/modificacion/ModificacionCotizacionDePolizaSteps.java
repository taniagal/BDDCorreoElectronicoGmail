package com.sura.guidewire.policycenter.steps.modificacion;

import com.sura.guidewire.policycenter.pages.modificaciones.ModificacionCotizacionDePolizaPage;
import com.sura.guidewire.policycenter.pages.poliza.CotizacionPADetallePage;
import com.sura.guidewire.policycenter.pages.tarifacion.TarifaTasaUnicaPage;

import java.util.Map;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;


public class ModificacionCotizacionDePolizaSteps extends ScenarioSteps {

    @Page
    ModificacionCotizacionDePolizaPage cotizacionDePolizaPage;
    @Page
    CotizacionPADetallePage cotizacionPADetalle;

    @Page
    TarifaTasaUnicaPage tasaUnicaPage;

    public ModificacionCotizacionDePolizaSteps(Pages pages){
        super(pages);
    }

    @Step
    public void verDetalleCotizacion() {
        cotizacionDePolizaPage.verDetalleCotizacion();
    }

    @Step
    public void comenzarCambioDePoliza() {
        tasaUnicaPage.nuevoCambioDePoliza();
    }

    @Step
    public void validarInformacionCotizacion(Map<String, String> infoCotizacionPoliza, ExamplesTable informacionCotizacion) {
        cotizacionDePolizaPage.validarInformacionCotizacion(infoCotizacionPoliza, informacionCotizacion);
    }

    @Step
    public void validarDireccionTomador(String direccion) {
        cotizacionDePolizaPage.validarDireccionTomador(direccion);
    }

    public void validarTerminoCobertura() {
        cotizacionPADetalle.validarTerminoCobertura();
    }
}
