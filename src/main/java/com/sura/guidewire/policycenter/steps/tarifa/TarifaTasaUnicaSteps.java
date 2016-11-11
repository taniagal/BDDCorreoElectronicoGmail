package com.sura.guidewire.policycenter.steps.tarifa;

import com.sura.guidewire.policycenter.pages.SeusLoginPage;
import com.sura.guidewire.policycenter.pages.AprobacionDeAnalisisDeRiesgoPage;
import com.sura.guidewire.policycenter.pages.tarifa.TarifaAutosPage;
import com.sura.guidewire.policycenter.pages.tarifa.TarifaTasaUnicaPage;
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
    boolean token = false;

    public TarifaTasaUnicaSteps(Pages pages){
        super(pages);
    }

    @Step
    public void irAInformacionDePoliza(){
        vehiculoPage.clickSiguiente();
    }

    @Step
    public void verificarElementosExportacion() {
        tasaUnicaPage.verificarElementosExportacion();
    }

    @Step
    public void verificarElementosImportacion() {
        tasaUnicaPage.verificarElementosImportacion();
    }

    @Step
    public void agregarVehiculo(ExamplesTable datosVehiculo) {
        if (token) {
            vehiculoPage.irAVehiculos();
            vehiculoPage.agregarVehiculo(datosVehiculo);
        }
    }

    @Step
    public void expedirPoliza() {
        if (token) {
            analisisDeRiesgoPage.expedirPoliza();
        }
    }

    @Step
    public void irAInformacionDePolizaExpedida() {
        if (token) {
            tasaUnicaPage.irAInformacionDePoliza();
        }
    }

    @Step
    public void seleciconarCoberturas(ExamplesTable coberturas) {
        if (token) {
            vehiculoPage.clickSiguiente();
            vehiculoPage.clickLinkDescartarCambios();
            tarifaAutosPage.seleccionarCoberturas(coberturas);
            tarifaAutosPage.seleccionarCoberturas1(coberturas);
            tarifaAutosPage.seleccionarCoberturasDeDanios(coberturas);
            tarifaAutosPage.cotizar();
        }
    }

    @Step
    public void verificarEstadoDelEnvio(String cotizacion) {
        token = tasaUnicaPage.verificarEstadoDelEnvio(cotizacion);
    }

    @Step
    public void ingresoAPolicyCenter(){
        String pais = "Colombia";
        String usuario = "pedrvevi";
        String contrasenia = "pedrvevi";
        seus.open();
        seus.login(pais,usuario, contrasenia);
    }

    @Step
    public void cambiarInfromacionDePoliza(String valorAsegurado) {
        tasaUnicaPage.comenzarCambioDePoliza();
        tasaUnicaPage.cambiarValorAsegurado(valorAsegurado);
    }

    @Step
    public void cambiarInfromacionDelAsegurado(String primerNombre, String segundoNombre, String estadoCivil) {
        tasaUnicaPage.comenzarCambioDePoliza();
        tasaUnicaPage.cambiarDatosDelAsegurado(primerNombre,segundoNombre,estadoCivil);
    }

    @Step
    public void verificarNoCambioDeTarifa() {
        tasaUnicaPage.verificarTarifacionSinCambio();
    }

    @Step
    public void verificarCambioDeTarifa() {
        tasaUnicaPage.verificarCambioDeTarifa();
    }

    @Step
    public void renovarPoliza() {
        tasaUnicaPage.comenzarRenovacionDePoliza();
        tasaUnicaPage.renovarPoliza();
    }

    @Step
    public void verificarRenovacionTarifa() {
        tasaUnicaPage.verificarTarifaRenovacionSinCambio();
    }
}
