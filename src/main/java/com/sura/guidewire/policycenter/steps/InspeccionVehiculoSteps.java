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
    public void validar_Vigencia_De_La_Placa(String placa) {
        inspeccionVehiculoPage.validarVigenciaPlaca(placa);
    }

    @Step
    public void validar_Informacion_Del_Vehiculo(ExamplesTable datosVehiculo) {
        inspeccionVehiculoPage.validarDatosVehiculo(datosVehiculo);
    }

    @Step
    public void validar_Valor_Asegurado_Del_Vehiculo(String valorAsegurado) {
        inspeccionVehiculoPage.validarValorAsegurado(valorAsegurado);
    }

    @Step
    public void crear_vehiculo() {
        vehiculoPage.crearVehiculo();
        tarifaAutosPage.relacionarAsegurado();
        inspeccionVehiculoPage.chekear0km();
    }

    @Step
    public void permitir_Expedir_Poliza() {
        inspeccionVehiculoPage.expedirPoliza();
    }

    @Step
    public void validar_Informacion_De_La_Placa(String placa) {
        inspeccionVehiculoPage.validarVehiculoSinInspeccion(placa);
    }

    @Step
    public void mostrar_Mensaje_De_Bloqueo_De_Expedicion(String mensaje) {
        inspeccionVehiculoPage.validarMensajeBloqueo(mensaje);
    }

    @Step
    public void generarUW(String mensaje) {
        inspeccionVehiculoPage.generarUW(mensaje);
    }

    @Step
    public void validar_Cotizacion_Expedida() {
        inspeccionVehiculoPage.validarCotizacionExpedida();
    }
}
