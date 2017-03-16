package com.sura.guidewire.policycenter.steps.tarifacion;

import com.sura.guidewire.policycenter.pages.poliza.AprobacionDeAnalisisDeRiesgoPage;
import com.sura.guidewire.policycenter.pages.poliza.DisponibilidadDetalleProductoPage;
import com.sura.guidewire.policycenter.pages.commons.NuevaCotizacionPage;
import com.sura.guidewire.policycenter.pages.tarifacion.TarifaAutosPage;
import com.sura.guidewire.policycenter.pages.tarifacion.TarifaTasaUnicaPage;
import com.sura.guidewire.policycenter.pages.poliza.ValidacionesInformacionDeVehiculoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class TarifaTasaUnicaSteps extends ScenarioSteps {
    ValidacionesInformacionDeVehiculoPage vehiculoPage = new ValidacionesInformacionDeVehiculoPage(getDriver());
    TarifaTasaUnicaPage tasaUnicaPage = new TarifaTasaUnicaPage(getDriver());
    AprobacionDeAnalisisDeRiesgoPage analisisDeRiesgoPage = new AprobacionDeAnalisisDeRiesgoPage(getDriver());
    TarifaAutosPage tarifaAutosPage = new TarifaAutosPage(getDriver());
    NuevaCotizacionPage nuevaCotizacionPage = new NuevaCotizacionPage(getDriver());
    DisponibilidadDetalleProductoPage disponibilidadDetalleProductoPage;
    int token = 1;

    public TarifaTasaUnicaSteps(Pages pages) {
        super(pages);
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
        if (token == 1) {
            nuevaCotizacionPage.llenarInfoPoliza();
            vehiculoPage.irAVehiculos();
            vehiculoPage.agregarVehiculo(datosVehiculo);
        }
    }

    @Step
    public void expedirPoliza() {
        if (token == 1) {
            analisisDeRiesgoPage.expedirPoliza();
        }
    }

    @Step
    public void irAInformacionDePolizaExpedida() {
        if (token == 1) {
            tasaUnicaPage.irAInformacionDePoliza();
        }
    }

    @Step
    public void irAArchivoDePolizaExpedida() {
        if (token == 1) {
            tasaUnicaPage.irAArchivoDePoliza();
        }
    }

    @Step
    public void seleciconarCoberturas(ExamplesTable coberturas) {
        if (token == 1) {
            vehiculoPage.clickSiguiente();
            vehiculoPage.clickLinkDescartarCambios();
            tarifaAutosPage.seleccionarCoberturasBasica(coberturas);
            tarifaAutosPage.seleccionarCoberturas1(coberturas);
            tarifaAutosPage.seleccionarCoberturasDanios(coberturas);
            tarifaAutosPage.seleccionarCoberturasDanios1(coberturas);
            tarifaAutosPage.cotizar();
        }
    }

    @Step
    public void verificarEstadoDelEnvio(String cotizacion) {
        token = tasaUnicaPage.verificarEstadoDelEnvio(cotizacion);
    }

    @Step
    public void cambiarInfromacionDePoliza(String valorAsegurado) {
        tasaUnicaPage.comenzarCambioDePolizaConValorDecotizacion();
        tasaUnicaPage.cambiarValorAsegurado(valorAsegurado);
    }

    @Step
    public void cambiarInfromacionDelAsegurado(String primerNombre, String segundoNombre, String estadoCivil) {
        tasaUnicaPage.comenzarCambioDePolizaConValorDecotizacion();
        tasaUnicaPage.cambiarDatosDelAsegurado(primerNombre, segundoNombre, estadoCivil);
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

    @Step
    public void validarTasaUnicaEnPolizaColectivaPrincipal() {
        tasaUnicaPage.validarTasaUnicaEnPolizaColectivaPrincipal();
    }

    @Step
    public void validarLaCargaDelArchivoDeTasaUnicaEnPolizaRiesgo() {
        disponibilidadDetalleProductoPage.verInformacionDePoliza();
        tasaUnicaPage.validarLaCargaDelArchivoDeTasaUnicaEnPolizaRiesgo();
    }

    @Step
    public void validarElValorDeLaPrimaYElIvaParaLaPolizaRiesgo(ExamplesTable primaRiesgo) {
        tasaUnicaPage.validarElValorDeLaPrimaYElIvaParaLaPolizaRiesgo(primaRiesgo);
    }
}