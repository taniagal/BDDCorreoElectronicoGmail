package com.sura.policycenter.selenium.steps;
import com.sura.policycenter.selenium.pages.ModificacionCotizacionDePolizaPage;
import com.sura.policycenter.selenium.pages.ValidacionesCambioDePolizaVehiculosPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

public class ValidacionesCambioDePolizaVehiculosSteps extends ScenarioSteps  {

    private ValidacionesCambioDePolizaVehiculosPage validacionesCambioDePolizaVehiculosPage = new ValidacionesCambioDePolizaVehiculosPage(getDriver());

    private ModificacionCotizacionDePolizaPage cotizacionDePolizaPage = new ModificacionCotizacionDePolizaPage(getDriver());

    public ValidacionesCambioDePolizaVehiculosSteps(Pages pages){
        super(pages);
    }

    @Step
    public void verDetalleCotizacion() {
        cotizacionDePolizaPage.verDetalleCotizacion();
    }

    @Step
    public void emitirPoliza() {
        validacionesCambioDePolizaVehiculosPage.emitirPoliza();
    }

    @Step
    public void validarMensaje(String mensaje) {
        validacionesCambioDePolizaVehiculosPage.validarMensaje(mensaje);
    }
}
