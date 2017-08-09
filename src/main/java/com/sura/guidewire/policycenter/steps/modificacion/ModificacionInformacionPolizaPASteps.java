package com.sura.guidewire.policycenter.steps.modificacion;

import com.sura.guidewire.policycenter.pages.modificaciones.ModificacionInformacionPolizaPAPage;
import com.sura.guidewire.policycenter.utils.navegacion.steps.GuidewireSteps;

import java.util.Map;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import org.jbehave.core.model.ExamplesTable;


public class ModificacionInformacionPolizaPASteps extends ScenarioSteps {

    private static String numeroEnvioA = null;
    private static String numeroEnvioB = null;
    private static String numeroEnvioC = null;
    private static String numeroEnvioD = null;

    @Steps
    GuidewireSteps guidewire;

    ModificacionInformacionPolizaPAPage modificacionInformacionPolizaPAPage = new ModificacionInformacionPolizaPAPage(getDriver());

    public ModificacionInformacionPolizaPASteps(Pages pages) {
        super(pages);
    }

    @Step
    public void ingresarPoliza(String numeroPoliza) {
        modificacionInformacionPolizaPAPage.ingresarPoliza(numeroPoliza);
    }

    @Step
    public void irAModificarInformacionPoliza() {
        modificacionInformacionPolizaPAPage.irAModificarInformacionPoliza();
    }

    @Step
    public void validarInformacionPoliza(Map<String, String> labelsInformacionPoliza, ExamplesTable informacionPoliza) {
        modificacionInformacionPolizaPAPage.validarInformacionPoliza(labelsInformacionPoliza, informacionPoliza);
    }

    @Step
    public void adicionarSegundoTomador(String tipoDocumento, String numeroDocumento) {
        modificacionInformacionPolizaPAPage.adicionarSegundoTomador(tipoDocumento, numeroDocumento);
    }

    @Step
    public void validarRegistroSegundoTomador(Map<String, String> datosSegundoTomador) {
        modificacionInformacionPolizaPAPage.validarRegistroSegundoTomador(datosSegundoTomador);
    }

    @Step
    public void validarTomadorRiesgo() {
        modificacionInformacionPolizaPAPage.validarTomadorRiesgo();
    }

    @Step
    public void validarBloqueoSegundoTomador(String mensaje) {
        modificacionInformacionPolizaPAPage.validarBloqueoSegundoTomador(mensaje);
    }

    @Step
    public void validarRestriccionEdicionTomador() {
        modificacionInformacionPolizaPAPage.validarRestriccionEdicionTomador();
    }

    @Step
    public void presionarBotonSiguiente() {
        modificacionInformacionPolizaPAPage.presionarBotonSiguiente();
    }

    @Step
    public void validarMensajeWarningTomador(String mensaje) {
        modificacionInformacionPolizaPAPage.validarMensajeWarningTomador(mensaje);
    }

    @Step
    public void validarMensajeWarningAsegurado(String mensaje) {
        modificacionInformacionPolizaPAPage.validarMensajeWarningAsegurado(mensaje);
    }

    @Step
    public void permitirContinuarCotizacion() {
        modificacionInformacionPolizaPAPage.permitirContinuarCotizacion();
    }

    @Step
    public void irAOpcionAsegurados() {
        modificacionInformacionPolizaPAPage.irAOpcionAsegurados();
    }

    @Step
    public void adicionarAsegurado(String tipoDocumento, String numeroDocumento) {
        modificacionInformacionPolizaPAPage.adicionarAsegurado(tipoDocumento, numeroDocumento);
    }

    @Step
    public void irAOpcionVehiculos() {
        modificacionInformacionPolizaPAPage.irAOpcionVehiculos();
    }

    @Step
    public void validarContinuacionDeCotizacion(String encabezado, String xpathEncabezado) {
        modificacionInformacionPolizaPAPage.validarContinuacionDeCotizacion(encabezado, xpathEncabezado);
    }

    @Step
    public void capturarNumeroPolizaA() {
        numeroEnvioA = modificacionInformacionPolizaPAPage.capturarNumeroPoliza();
    }

    @Step
    public void capturarNumeroPolizaB() {
        numeroEnvioB = modificacionInformacionPolizaPAPage.capturarNumeroPoliza();
    }

    @Step
    public void capturarNumeroPolizaC() {
        numeroEnvioC = modificacionInformacionPolizaPAPage.capturarNumeroPoliza();
    }

    @Step
    public void capturarNumeroPolizaD() {
        numeroEnvioD = modificacionInformacionPolizaPAPage.capturarNumeroPoliza();
    }

    @Step
    public void consultarPolizaExpedidaA() {
        modificacionInformacionPolizaPAPage.ingresarPoliza(numeroEnvioA);
    }

    @Step
    public void consultarPolizaExpedida1(){
        guidewire.irANavegacionSuperior().desplegarMenuPoliza().consultarNumeroDePoliza(numeroEnvioA);
    }

    @Step
    public void consultarPolizaExpedida2(){
        guidewire.irANavegacionSuperior().desplegarMenuPoliza().consultarNumeroDePoliza(numeroEnvioB);
    }

    @Step
    public void consultarPolizaExpedida3(){
        guidewire.irANavegacionSuperior().desplegarMenuPoliza().consultarNumeroDePoliza(numeroEnvioC);
    }

    @Step
    public void consultarPolizaExpedida4(){
        guidewire.irANavegacionSuperior().desplegarMenuPoliza().consultarNumeroDePoliza(numeroEnvioD);
    }

    @Step
    public void consultarPolizaExpedidaB() {
        modificacionInformacionPolizaPAPage.ingresarPoliza(numeroEnvioB);
    }

    @Step
    public void ingresarAModificarPlacaEnPolizaExpedida() {
        modificacionInformacionPolizaPAPage.ingresarAModificarPlacaEnPolizaExpedida();
    }
}
