package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.ValidacionesInformacionDeVehiculoPage;
import com.sura.guidewire.policycenter.pages.commons.NuevaCotizacionPage;
import com.sura.guidewire.policycenter.pages.renovacion.RenovacionDeseoFinanciacionPaPage;
import com.sura.guidewire.policycenter.pages.tarifacion.TarifaTasaUnicaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

public class RenovacionDeseoFinanciacionPaSteps extends ScenarioSteps {

    @Page
    RenovacionDeseoFinanciacionPaPage renovacionDeseoFinanciacionPage;

    @Page
    TarifaTasaUnicaPage tasaUnicaPage;

    @Page
    ValidacionesInformacionDeVehiculoPage vehiculoPage;

    @Page
    NuevaCotizacionPage nuevaCotizacionPage;

    @Step
    public void seleccionarDeseoFinanciacionSi() {
        renovacionDeseoFinanciacionPage.seleccionarDeseoFinanciacionSi();
    }

    @Step
    public void seleccionarOpcionSiguiente() {
        renovacionDeseoFinanciacionPage.seleccionarOpcionSiguiente();
    }

    @Step
    public void validarQueSeMuestreMensajeDeseoFinanciacion(ExamplesTable mensaje) {
        renovacionDeseoFinanciacionPage.validarMensajeDeseoFinanciacion(mensaje);
    }

    @Step
    public void cotizarRenovacionDePoliza() {
        renovacionDeseoFinanciacionPage.cotizarRenovacionPoliza();
    }

    @Step
    public void irARevisionDePoliza() {
        renovacionDeseoFinanciacionPage.irARevisionDePoliza();
    }

    @Step
    public void validarMensajeFinanciacionAlCotizarRenovacion(ExamplesTable mensaje) {
        renovacionDeseoFinanciacionPage.validarMensajeFinanciacionCotizacionRenovacion(mensaje);
    }

    @Step
    public void validarQueSeMuestreNumeroDeCuotas(ExamplesTable numeroCuotas) {
        renovacionDeseoFinanciacionPage.validarNumeroDeCuotas(numeroCuotas);
    }

    @Step
    public void validarQueSeMuestreValorYNumeroDeCuotas(ExamplesTable detalleCotizacion) {
        renovacionDeseoFinanciacionPage.validarValorYNumeroDeCuotas(detalleCotizacion);
    }

    @Step
    public void expedirPolizaDeRenovacion() {
        renovacionDeseoFinanciacionPage.expedirPolizaRenovacion();
    }

    @Step
    public void marcarDeseoDeFinanciacion() {
        renovacionDeseoFinanciacionPage.marcarDeseodeFinanciacion();
        nuevaCotizacionPage.llenarInfoPoliza();
        vehiculoPage.clickSiguiente();
    }

    @Step
    public void comenzarRenovacion() {
        tasaUnicaPage.nuevaRenovacion();
        tasaUnicaPage.irAInformacionDePolizaRenovacion();
        tasaUnicaPage.editarTransaccion();
    }
}
