package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.InspeccionVehiculoPage;
import com.sura.guidewire.policycenter.pages.tarifacion.TarifaAutosPage;
import com.sura.guidewire.policycenter.pages.ValidacionesInformacionDeVehiculoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class InspeccionVehiculoSteps extends ScenarioSteps {

    ValidacionesInformacionDeVehiculoPage vehiculoPage =  new ValidacionesInformacionDeVehiculoPage(getDriver());
    InspeccionVehiculoPage inspeccionVehiculoPage = new InspeccionVehiculoPage(getDriver());
    TarifaAutosPage tarifaAutosPage = new TarifaAutosPage(getDriver());

    public InspeccionVehiculoSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void validarVigenciaDeLaPlaca(String placa) {
        inspeccionVehiculoPage.validarVigenciaPlaca(placa);
    }

    @Step
    public void validarInformacionDelVehiculo(ExamplesTable datosVehiculo) {
        inspeccionVehiculoPage.validarDatosVehiculo(datosVehiculo);
    }

    @Step
    public void validarValorAseguradoDelVehiculo(String valorAsegurado) {
        inspeccionVehiculoPage.validarValorAsegurado(valorAsegurado);
    }

    @Step
    public void crearVehiculo() {
        vehiculoPage.crearVehiculo();
        tarifaAutosPage.relacionarAsegurado();
        inspeccionVehiculoPage.chekear0km();
    }

    @Step
    public void permitirExpedirPoliza() {
        inspeccionVehiculoPage.expedirPoliza();
    }

    @Step
    public void validarInformacionDeLaPlaca(String placa) {
        inspeccionVehiculoPage.validarVehiculoSinInspeccion(placa);
    }

    @Step
    public void mostrarMensajeDeBloqueoDeExpedicion(String mensaje) {
        inspeccionVehiculoPage.validarMensajeBloqueo(mensaje);
    }

    @Step
    public void generarUW(String mensaje) {
        inspeccionVehiculoPage.generarUW(mensaje);
    }

    @Step
    public void validarCotizacionExpedida() {
        inspeccionVehiculoPage.validarCotizacionExpedida();
    }
}
