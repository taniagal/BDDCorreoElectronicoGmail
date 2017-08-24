package com.sura.guidewire.policycenter.steps.modificacion;

import com.sura.guidewire.policycenter.pages.modificaciones.ModificacionInformacionPolizaPAPage;
import com.sura.guidewire.policycenter.utils.navegacion.steps.GuidewireSteps;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;


public class ModificacionInformacionPolizaPASteps extends ScenarioSteps {

    private String numeroEnvioA = null;
    private String numeroEnvioB = null;
    private String numeroEnvioC = null;
    private String numeroEnvioD = null;

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
        Serenity.setSessionVariable("nroEnvioA".toLowerCase().trim()).to(numeroEnvioA);
    }

    @Step
    public void capturarNumeroPolizaB() {
        numeroEnvioB = modificacionInformacionPolizaPAPage.capturarNumeroPoliza();
        Serenity.setSessionVariable("nroEnvioB".toLowerCase().trim()).to(numeroEnvioB);
    }

    @Step
    public void capturarNumeroPolizaC() {
        numeroEnvioC = modificacionInformacionPolizaPAPage.capturarNumeroPoliza();
        Serenity.setSessionVariable("nroEnvioC".toLowerCase().trim()).to(numeroEnvioC);
    }

    @Step
    public void capturarNumeroPolizaD() {
        numeroEnvioD = modificacionInformacionPolizaPAPage.capturarNumeroPoliza();
        Serenity.setSessionVariable("nroEnvioD".toLowerCase().trim()).to(numeroEnvioD);
    }

    @Step
    public void consultarPolizaExpedidaA() {
        modificacionInformacionPolizaPAPage.ingresarPoliza(Serenity.sessionVariableCalled("nroEnvioA".toLowerCase().trim()));
    }

    @Step
    public void consultarPolizaExpedida1(){
        guidewire.irANavegacionSuperior().desplegarMenuPoliza().consultarNumeroDePoliza(Serenity.sessionVariableCalled("nroEnvioA".toLowerCase().trim()));
    }

    @Step
    public void consultarPolizaExpedida2(){
        guidewire.irANavegacionSuperior().desplegarMenuPoliza().consultarNumeroDePoliza(Serenity.sessionVariableCalled("nroEnvioB".toLowerCase().trim()));
    }

    @Step
    public void consultarPolizaExpedida3(){
        guidewire.irANavegacionSuperior().desplegarMenuPoliza().consultarNumeroDePoliza(Serenity.sessionVariableCalled("nroEnvioC".toLowerCase().trim()));
    }

    @Step
    public void consultarPolizaExpedida4(){
        guidewire.irANavegacionSuperior().desplegarMenuPoliza().consultarNumeroDePoliza(Serenity.sessionVariableCalled("nroEnvioA".toLowerCase().trim()));
    }

    @Step
    public void consultarPolizaExpedidaB() {
        modificacionInformacionPolizaPAPage.ingresarPoliza(Serenity.sessionVariableCalled("nroEnvioB".toLowerCase().trim()));
    }

    @Step
    public void ingresarAModificarPlacaEnPolizaExpedida() {
        modificacionInformacionPolizaPAPage.ingresarAModificarPlacaEnPolizaExpedida();
    }
}
