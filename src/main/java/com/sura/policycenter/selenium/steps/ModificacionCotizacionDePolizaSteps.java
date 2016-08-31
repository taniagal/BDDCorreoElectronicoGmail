package com.sura.policycenter.selenium.steps;
import com.sura.policycenter.selenium.pages.ModificacionCotizacionDePolizaPage;
import java.util.Map;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;


public class ModificacionCotizacionDePolizaSteps extends ScenarioSteps  {

    private final ModificacionCotizacionDePolizaPage cotizacionDePolizaPage = new ModificacionCotizacionDePolizaPage(getDriver());

    public ModificacionCotizacionDePolizaSteps(Pages pages){
        super(pages);
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
    public void validarDireccionTomador(String direccion) {
        cotizacionDePolizaPage.validarDireccionTomador(direccion);
    }

    @Step
    public void validarInformacionDetalleCotizacion(Map<String, String> infoDetalleCotizacion) {
        cotizacionDePolizaPage.validarInformacionDetalleCotizacion(infoDetalleCotizacion);
    }

    public void validarTerminoCobertura() {
        cotizacionDePolizaPage.validarTerminoCobertura();
    }

    public void validarDetallesCosto(Map<String, String> infoDetalleCotizacion) {
        cotizacionDePolizaPage.validarDetallesCosto(infoDetalleCotizacion);
    }
}
