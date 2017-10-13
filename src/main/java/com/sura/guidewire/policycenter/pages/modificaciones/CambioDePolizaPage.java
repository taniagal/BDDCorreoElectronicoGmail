package com.sura.guidewire.policycenter.pages.modificaciones;


import com.sura.guidewire.policycenter.pages.commons.NuevaCotizacionPage;
import com.sura.guidewire.policycenter.resources.PageUtil;
import com.sura.guidewire.policycenter.utils.Parametros;
import com.sura.guidewire.policycenter.utils.Utils;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class CambioDePolizaPage extends PageUtil {
    protected static final String LABELCONSTANTE = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:FloatType_Ext-inputEl']";
    @FindBy(xpath = ".//*[@id='SubmissionWizard:Next-btnInnerEl']")
    WebElementFacade botonSiguiente;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:Next']")
    WebElementFacade botonSiguientePolyceChange;
    @FindBy(xpath = ".//span[contains(.,'Aceptar')]")
    WebElementFacade botonAceptarPopup;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:EditPolicy']")
    WebElementFacade botonEditarTransaccionDePoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:RIPolicyFieldsInputSet:Facultative-inputEl']")
    WebElementFacade checkBoxFronting;
    @FindBy(xpath = ".//*[@id='PolicyFile_PolicyInfo:PolicyFile_PolicyInfoScreen:PolicyFile_PolicyInfoDV:AccountInfoInputSet:InsuredInputSet:RIPolicyFieldsInputSet:reaseguroEspecial-inputEl']")
    WebElementFacade campoReaseguroEspecial;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:EffectiveDate-inputEl']")
    WebElementFacade campoTxtFechaInicioDeVigencia;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:TermType-inputEl']")
    WebElementFacade comboBoxTipoPlazo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:ExpirationDate-inputEl']")
    WebElementFacade campoTxtFechaFinDeVigencia;
    @FindBy(xpath = ".//span[@id='PolicyFile:PolicyFileMenuActions-btnInnerEl']")
    WebElementFacade menuAcciones;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:PolicyInfo']/div")
    WebElementFacade menuItemInformacionDePoliza;
    @FindBy(xpath = ".//label[@class='x-component g-msg-warning x-component-default']")
    WebElementFacade mensajeAdvertencia;
    @FindBy(xpath = ".//*[@id='PolicyFile:PolicyFileAcceleratedMenuActions:PolicyMenuItemSet:PolicyMenuItemSet_PolicyInfo']")
    WebElementFacade menuItemInformacionDePolizaExp;
    @FindBy(xpath = ".//*[@id='StartPolicyChange:StartPolicyChangeScreen:ttlBar']")
    WebElementFacade lblinicioCambioPoliza;
    @FindBy(xpath = ".//span[contains(@id,'PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_NewWorkOrder:PolicyFileMenuActions_ChangePolicy-textEl')]")
    WebElementFacade opcionCambiarPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:RIPolicyFieldsInputSet:reaseguroEspecial_true-inputEl']")
    WebElementFacade radioBotonReaseguroEspeciaSi;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:CPBuildings']")
    WebElementFacade opcionEdificioYubicaciones;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:AccesoriosValue_DV-inputEl']")
    WebElementFacade txtAccesorios;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:AccesoriosEspValue_DV-inputEl']")
    WebElementFacade txtAccesoriosEspeciales;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:StatedValue_DV-inputEl']")
    WebElementFacade txtValorAsegurado;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:transportFuel_true-inputEl']")
    WebElementFacade checkBoxCombustible;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Year_DV-inputEl']")
    WebElementFacade txtModelo;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:facecoldaCode_DV-inputEl']")
    WebElementFacade txtFasecolda;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:2:RateModifier-inputEl']")
    WebElementFacade txtBonificacionComercial;
    @FindBy(xpath = ".//*[@id='StartPolicyChange:StartPolicyChangeScreen:NewPolicyChange-btnInnerEl']")
    WebElementFacade btnSiguienteModificacionPoliza;



    public CambioDePolizaPage(WebDriver driver) {
        super(driver);
    }


    public void irAMenuAcciones() {
        esperarHasta(TIEMPO_1000);
        menuAcciones.waitUntilClickable().click();
    }

    public void cambiarPoliza() {
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(opcionCambiarPoliza).waitUntilPresent();
        opcionCambiarPoliza.click();
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(lblinicioCambioPoliza).waitUntilPresent();
    }

    public void esReaseguroEspecial(String reaseguro) {
        campoReaseguroEspecial.waitUntilPresent();
        MatcherAssert.assertThat(campoReaseguroEspecial.getText(), Is.is(Matchers.equalTo(reaseguro)));
    }

    public void validarMensaje(String mensaje) {
        verificarMensaje(mensajeAdvertencia, mensaje);
    }

    public void seleccionarInformacionPoliza() {
        waitFor(menuItemInformacionDePolizaExp).waitUntilPresent().click();
    }

    public void validarMensajeNoHayReaseguro() {
        MatcherAssert.assertThat("Mensaje en reaseguro NO debe ser visible", !mensajeAdvertencia.isVisible());
    }

    public void ingresarReaseguroEspecial() {
        irAInformacionDePoliza();
        radioBotonReaseguroEspeciaSi.waitUntilPresent().click();
        checkBoxFronting.waitUntilPresent().click();
        clickearElemento(botonSiguiente);
    }

    public void irAInformacionDePoliza() {
        menuItemInformacionDePoliza.waitUntilPresent();
        clickearElemento(menuItemInformacionDePoliza);
    }

    public void irAMenuEdificiosYUbicaciones() {
        opcionEdificioYubicaciones.waitUntilPresent();
        esperarObjetoClikeableServidorWe(opcionEdificioYubicaciones);
    }

    public void cambiarFechaDeVigencia(String dias) {
        NuevaCotizacionPage nuevaCotizacionPage = new NuevaCotizacionPage(getDriver());
        botonEditarTransaccionDePoliza.waitUntilVisible().click();
        botonAceptarPopup.waitUntilClickable().click();
        irAInformacionDePoliza();
        String fecha = Utils.sumarDiasALaFechaActual(Integer.parseInt(dias));
        campoTxtFechaInicioDeVigencia.waitUntilPresent().clear();
        campoTxtFechaInicioDeVigencia.sendKeys(fecha);
        clickearElemento(comboBoxTipoPlazo);
        try {
            withTimeoutOf(TIEMPO_5, TimeUnit.SECONDS).waitFor(ExpectedConditions.textToBePresentInElement(campoTxtFechaFinDeVigencia, fecha.substring(0, TIEMPO_5)));
        } catch (TimeoutException e) {
            LOGGER.info("TimeoutException " + e);
        }
    }

    public void ingresarAEdificionYUbicacionesPolyceChange() {
        botonSiguientePolyceChange.waitUntilPresent();
        clickearElemento(botonSiguientePolyceChange);

    }

    //TOOO VERIFICA
    public void validarMercanciaFlotante(Parametros parametros) {
        WebElementFacade grupoMensajes = findBy(LABELCONSTANTE);
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(grupoMensajes).shouldBePresent();
        MatcherAssert.assertThat(grupoMensajes.getText(), Matchers.containsString(parametros.getTipo()));

    }

    public void modificarDatosvehiculo(ExamplesTable datos) {
        Map<String,String> datosVehiculo=datos.getRow(0);
        ingresarDato(txtAccesorios,datosVehiculo.get("valorAccesorios"));
        ingresarDato(txtAccesoriosEspeciales,datosVehiculo.get("valorAccesoriosEspeciales"));
        txtValorAsegurado.clear();
        ingresarDato(txtValorAsegurado,datosVehiculo.get("valorAsegurado"));
        if(datosVehiculo.get("transporteCombustible").equals("Si")){
        checkBoxCombustible.click();
        }

    }

    public void cambioVehiculo(ExamplesTable cambiosVehiculo) {
        Map<String,String> cambioVehiculo=cambiosVehiculo.getRow(0);
        txtFasecolda.clear();
        esperarHasta(4000);
        ingresarDato(txtFasecolda,cambioVehiculo.get("fasecolda"));
        esperarHasta(4000);
        seleccionarItem(txtModelo,cambioVehiculo.get("modelo"));
        esperarHasta(2000);
        txtBonificacionComercial.clear();
        txtBonificacionComercial.click();
        ingresarDato(txtBonificacionComercial,cambioVehiculo.get("bonificacionComercial"));
        esperarHasta(2000);
    }

    public void presionarOpcionSiguiente() {
    clickearElemento(btnSiguienteModificacionPoliza);
    }
}
