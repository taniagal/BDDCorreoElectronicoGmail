package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.SeusLoginPage;
import com.sura.guidewire.policycenter.pages.AprobacionDeAnalisisDeRiesgoPage;
import com.sura.guidewire.policycenter.pages.TarifaAutosPage;
import com.sura.guidewire.policycenter.pages.TarifaTasaUnicaPage;
import com.sura.guidewire.policycenter.pages.ValidacionesInformacionDeVehiculoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class TarifaTasaUnicaSteps extends ScenarioSteps{
    ValidacionesInformacionDeVehiculoPage vehiculoPage =  new ValidacionesInformacionDeVehiculoPage(getDriver());
    TarifaTasaUnicaPage tasaUnicaPage = new TarifaTasaUnicaPage(getDriver());
    AprobacionDeAnalisisDeRiesgoPage analisisDeRiesgoPage = new AprobacionDeAnalisisDeRiesgoPage(getDriver());
    TarifaAutosPage tarifaAutosPage = new TarifaAutosPage(getDriver());
    SeusLoginPage seus = new SeusLoginPage(getDriver());
    int token = 0;

    public TarifaTasaUnicaSteps(Pages pages){
        super(pages);
    }

    @Step
    public void ir_a_informacion_de_poliza(){
        vehiculoPage.clickSiguiente();
    }

    @Step
    public void verificar_elementos_exportacion() {
        tasaUnicaPage.verificarElementosExportacion();
    }

    @Step
    public void verificar_elementos_importacion() {
        tasaUnicaPage.verificarElementosImportacion();
    }

    @Step
    public void agregar_vehiculo(ExamplesTable datosVehiculo) {
        if (token == 0) {
            vehiculoPage.irAVehiculos();
            vehiculoPage.agregarVehiculo(datosVehiculo);
        }
    }

    @Step
    public void expedir_poliza() {
        if (token == 0) {
            analisisDeRiesgoPage.expedirPoliza();
        }
    }

    @Step
    public void ir_a_informacion_de_poliza_expedida() {
        if (token == 0) {
            tasaUnicaPage.irAInformacionDePoliza();
        }
    }

    @Step
    public void seleciconar_coberturas(ExamplesTable coberturas) {
        if (token == 0) {
            vehiculoPage.clickSiguiente();
            tarifaAutosPage.setCoberturas(coberturas);
            tarifaAutosPage.seleccionarCoberturas(coberturas);
            tarifaAutosPage.seleccionarCoberturasDeDanios(coberturas);
            tarifaAutosPage.cambiarTipoPlazo();
            tarifaAutosPage.cotizar();
        }
    }

    @Step
    public void verificar_estado_del_envio(String cotizacion) {
        token = tasaUnicaPage.verificarEstadoDelEnvio(cotizacion);
    }

    @Step
    public void ingreso_a_policyCenter(){
        String pais = "Colombia";
        String usuario = "pedrvevi";
        String contrasenia = "pedrvevi";
        seus.open();
        seus.login(pais,usuario, contrasenia);
    }

    @Step
    public void cambiar_infromacion_de_poliza(String valorAsegurado) {
        tasaUnicaPage.comenzarCambioDePoliza();
        tasaUnicaPage.cambiarValorAsegurado(valorAsegurado);
    }

    @Step
    public void cambiar_infromacion_del_asegurado(String primerNombre, String segundoNombre, String estadoCivil) {
        tasaUnicaPage.comenzarCambioDePoliza();
        tasaUnicaPage.cambiarDatosDelAsegurado(primerNombre,segundoNombre,estadoCivil);
    }

    @Step
    public void verificar_no_cambio_de_tarifa() {
        tasaUnicaPage.verificarTarifacionSinCambio();
    }

    @Step
    public void verificar_cambio_de_tarifa() {
        tasaUnicaPage.verificarCambioDeTarifa();
    }

    @Step
    public void renovar_poliza() {
        tasaUnicaPage.comenzarRenovacionDePoliza();
        tasaUnicaPage.renovarPoliza();
    }

    @Step
    public void verificar_renovacion_tarifa() {
        tasaUnicaPage.verificarTarifaRenovacionSinCambio();
    }
}
