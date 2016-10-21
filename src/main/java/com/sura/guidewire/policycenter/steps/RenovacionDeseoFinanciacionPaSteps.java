package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.renovacion.RenovacionDeseoFinanciacionPaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class RenovacionDeseoFinanciacionPaSteps extends ScenarioSteps{

    RenovacionDeseoFinanciacionPaPage renovacionDeseoFinanciacionPage;

    @Step
    public void seleccionar_Deseo_Financiacion_Si() {
        renovacionDeseoFinanciacionPage.seleccionarDeseoFinanciacionSi();
    }

    @Step
    public void seleccionar_Opcion_Siguiente() {
        renovacionDeseoFinanciacionPage.seleccionarOpcionSiguiente();
    }

    @Step
    public void validar_Que_Se_Muestre_Mensaje_Deseo_Financiacion(ExamplesTable mensaje) {
        renovacionDeseoFinanciacionPage.validarMensajeDeseoFinanciacion(mensaje);
    }

    @Step
    public void cotizar_Renovacion_De_Poliza() {
        renovacionDeseoFinanciacionPage.cotizarRenovacionPoliza();
    }

    @Step
    public void ir_A_Revision_De_Poliza() {
        renovacionDeseoFinanciacionPage.irARevisionDePoliza();
    }

    @Step
    public void validar_Mensaje_Financiacion_Al_Cotizar_Renovacion(ExamplesTable mensaje) {
        renovacionDeseoFinanciacionPage.validarMensajeFinanciacionCotizacionRenovacion(mensaje);
    }

    @Step
    public void validar_Que_Se_Muestre_Numero_De_Cuotas(ExamplesTable numeroCuotas) {
        renovacionDeseoFinanciacionPage.validarNumeroDeCuotas(numeroCuotas);
    }

    @Step
    public void validar_Que_La_Cotizacion_Tenga_Intencion_De_Financiacion() {
        renovacionDeseoFinanciacionPage.validarCotizacionConIntencionDeFinanciacion();
    }

    @Step
    public void validar_Que_Se_Muestre_Valor_Y_Numero_De_Cuotas(ExamplesTable detalleCotizacion) {
        renovacionDeseoFinanciacionPage.validarValorYNumeroDeCuotas(detalleCotizacion);
    }

    @Step
    public void expedir_Poliza_De_Renovacion() {
        renovacionDeseoFinanciacionPage.expedirPolizaRenovacion();
    }
}
