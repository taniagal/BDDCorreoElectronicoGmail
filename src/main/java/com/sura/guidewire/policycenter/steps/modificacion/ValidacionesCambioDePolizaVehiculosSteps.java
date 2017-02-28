package com.sura.guidewire.policycenter.steps.modificacion;
import com.sura.guidewire.policycenter.pages.ModificacionCotizacionDePolizaPage;
import com.sura.guidewire.policycenter.pages.ValidacionesCambioDePolizaVehiculosPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class ValidacionesCambioDePolizaVehiculosSteps extends ScenarioSteps  {

    private final ValidacionesCambioDePolizaVehiculosPage validacionesCambioDePolizaVehiculosPage = new ValidacionesCambioDePolizaVehiculosPage(getDriver());

    private final ModificacionCotizacionDePolizaPage cotizacionDePolizaPage = new ModificacionCotizacionDePolizaPage(getDriver());

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
