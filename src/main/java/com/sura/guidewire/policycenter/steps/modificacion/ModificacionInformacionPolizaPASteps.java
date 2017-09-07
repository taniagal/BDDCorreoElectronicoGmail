package com.sura.guidewire.policycenter.steps.modificacion;

import com.sura.guidewire.policycenter.pages.modificaciones.ModificacionInformacionPolizaPAPage;
import com.sura.guidewire.policycenter.utils.navegacion.steps.GuidewireSteps;

import java.util.Map;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;


public class ModificacionInformacionPolizaPASteps extends ScenarioSteps {
    protected static final String NROENVIOB = "nroEnvioB";
    protected static final String NROENVIOA = "nroEnvioA";
    @Page
    ModificacionInformacionPolizaPAPage modificacionInformacionPolizaPa;

    @Steps
    GuidewireSteps guidewire;


    public ModificacionInformacionPolizaPASteps(Pages pages) {
        super(pages);
    }

    @Step
    public void ingresarPoliza(String numeroPoliza) {
        modificacionInformacionPolizaPa.ingresarPoliza(numeroPoliza);
    }

    @Step
    public void irAModificarInformacionPoliza() {
        modificacionInformacionPolizaPa.irAModificarInformacionPoliza();
    }

    @Step
    public void validarInformacionPoliza(Map<String, String> labelsInformacionPoliza, ExamplesTable informacionPoliza) {
        modificacionInformacionPolizaPa.validarInformacionPoliza(labelsInformacionPoliza, informacionPoliza);
    }

    @Step
    public void adicionarSegundoTomador(String tipoDocumento, String numeroDocumento) {
        modificacionInformacionPolizaPa.adicionarSegundoTomador(tipoDocumento, numeroDocumento);
    }

    @Step
    public void validarRegistroSegundoTomador(Map<String, String> datosSegundoTomador) {
        modificacionInformacionPolizaPa.validarRegistroSegundoTomador(datosSegundoTomador);
    }

    @Step
    public void validarTomadorRiesgo() {
        modificacionInformacionPolizaPa.validarTomadorRiesgo();
    }

    @Step
    public void validarBloqueoSegundoTomador(String mensaje) {
        modificacionInformacionPolizaPa.validarBloqueoSegundoTomador(mensaje);
    }

    @Step
    public void validarRestriccionEdicionTomador() {
        modificacionInformacionPolizaPa.validarRestriccionEdicionTomador();
    }

    @Step
    public void presionarBotonSiguiente() {
        modificacionInformacionPolizaPa.presionarBotonSiguiente();
    }

    @Step
    public void validarMensajeWarningTomador(String mensaje) {
        modificacionInformacionPolizaPa.validarMensajeWarningTomador(mensaje);
    }

    @Step
    public void validarMensajeWarningAsegurado(String mensaje) {
        modificacionInformacionPolizaPa.validarMensajeWarningAsegurado(mensaje);
    }

    @Step
    public void permitirContinuarCotizacion() {
        modificacionInformacionPolizaPa.permitirContinuarCotizacion();
    }

    @Step
    public void irAOpcionAsegurados() {
        modificacionInformacionPolizaPa.irAOpcionAsegurados();
    }

    @Step
    public void adicionarAsegurado(String tipoDocumento, String numeroDocumento) {
        modificacionInformacionPolizaPa.adicionarAsegurado(tipoDocumento, numeroDocumento);
    }

    @Step
    public void irAOpcionVehiculos() {
        modificacionInformacionPolizaPa.irAOpcionVehiculos();
    }

    @Step
    public void validarContinuacionDeCotizacion(String encabezado, String xpathEncabezado) {
        modificacionInformacionPolizaPa.validarContinuacionDeCotizacion(encabezado, xpathEncabezado);
    }

    @Step
    public void capturarNumeroPolizaA() {
        modificacionInformacionPolizaPa.capturarNumeroPoliza();
        Serenity.setSessionVariable(NROENVIOA.toLowerCase().trim()).to(modificacionInformacionPolizaPa.capturarNumeroPoliza());
    }

    @Step
    public void capturarNumeroPolizaB() {
        modificacionInformacionPolizaPa.capturarNumeroPoliza();
        Serenity.setSessionVariable(NROENVIOB.toLowerCase().trim()).to(modificacionInformacionPolizaPa.capturarNumeroPoliza());
    }

    @Step
    public void capturarNumeroPolizaC() {
        modificacionInformacionPolizaPa.capturarNumeroPoliza();
        Serenity.setSessionVariable("nroEnvioC".toLowerCase().trim()).to(modificacionInformacionPolizaPa.capturarNumeroPoliza());
    }

    @Step
    public void capturarNumeroPolizaD() {
        modificacionInformacionPolizaPa.capturarNumeroPoliza();
        Serenity.setSessionVariable("nroEnvioD".toLowerCase().trim()).to(modificacionInformacionPolizaPa.capturarNumeroPoliza());
    }

    @Step
    public void consultarPolizaExpedidaA() {
        modificacionInformacionPolizaPa.ingresarPoliza(Serenity.sessionVariableCalled(NROENVIOA.toLowerCase().trim()));
    }

    @Step
    public void consultarPolizaExpedida1() {
        guidewire.irANavegacionSuperior().desplegarMenuPoliza().consultarNumeroDePoliza(Serenity.sessionVariableCalled("nroEnvioA".toLowerCase().trim()));
    }

    @Step
    public void consultarPolizaExpedida2() {
        guidewire.irANavegacionSuperior().desplegarMenuPoliza().consultarNumeroDePoliza(Serenity.sessionVariableCalled("nroEnvioB".toLowerCase().trim()));
    }

    @Step
    public void consultarPolizaExpedida3() {
        guidewire.irANavegacionSuperior().desplegarMenuPoliza().consultarNumeroDePoliza(Serenity.sessionVariableCalled("nroEnvioC".toLowerCase().trim()));
    }

    @Step
    public void consultarPolizaExpedida4() {
        guidewire.irANavegacionSuperior().desplegarMenuPoliza().consultarNumeroDePoliza(Serenity.sessionVariableCalled(NROENVIOA.toLowerCase().trim()));
    }

    @Step
    public void consultarPolizaExpedidaB() {
        modificacionInformacionPolizaPa.ingresarPoliza(Serenity.sessionVariableCalled(NROENVIOB.toLowerCase().trim()));
    }

    @Step
    public void ingresarAModificarPlacaEnPolizaExpedida() {
        modificacionInformacionPolizaPa.ingresarAModificarPlacaEnPolizaExpedida();
    }
}
