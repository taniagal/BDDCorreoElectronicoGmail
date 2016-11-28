package com.sura.guidewire.policycenter.pages.renovacion;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ReglasRenovacionDosPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='RenewalWizard:Next-btnInnerEl']")
    WebElementFacade btnSiguinete;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:ttlBar']")
    WebElementFacade lblAsegurado;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:JobWizardToolbarButtonSet:EditPolicy-btnInnerEl']")
    WebElementFacade btnEditarTransaccion;
    @FindBy(xpath = ".//*[@id='button-1005-btnInnerEl']")
    WebElementFacade btnAceptarEditarTransaccion;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:JobWizardToolbarButtonSet:RenewalQuote-btnInnerEl']")
    WebElementFacade btnCotizar;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:JobWizardToolbarButtonSet:CloseOptions-btnInnerEl']")
    WebElementFacade btnOpcionDeCierre;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:JobWizardToolbarButtonSet:CloseOptions:Withdraw']")
    WebElementFacade btnRetirarTransaccion;
    @FindBy(xpath = ".//*[@id='button-1005-btnInnerEl']")
    WebElementFacade btnAceptarRetirarTransaccion;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:StatedValue_DV-inputEl']")
    WebElementFacade txtValorAsegurado;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:AccesoriosValue_DV-inputEl']")
    WebElementFacade txtvalorAccesorios;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:AccesoriosEspValue_DV-inputEl']")
    WebElementFacade txtvalorAccesoriosEspe;
    @FindBy(id = "RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:_msgs")
    WebElementFacade lblMensajes;

    private static final int CONSTANTE_8 = 8;
    private static final double CONSTANTE_02 = 0.2;


    public ReglasRenovacionDosPage(WebDriver driver) {
        super(driver);
    }

    /*
    *El metodo contiene los waitUntil debido que espera un refresh en la pantalla para la aparicion de un botón
    */
    public void clicHastaVehiculo() {
        waitUntil(WAIT_TIME_1000);
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(btnSiguinete).waitUntilClickable();
        btnSiguinete.click();
        waitUntil(WAIT_TIME_1000);
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(lblAsegurado).waitUntilPresent();
        waitUntil(WAIT_TIME_1000);
        btnSiguinete.click();
    }

    public void editarTransaccion() {
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(btnEditarTransaccion).waitUntilClickable();
        btnEditarTransaccion.click();
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(btnAceptarEditarTransaccion).waitUntilClickable();
        btnAceptarEditarTransaccion.click();
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(btnCotizar).waitUntilClickable();
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(lblMensajes).waitUntilPresent();
    }

    public void ingresaValorMayorVeintePorciento() {
        waitUntil(WAIT_TIME_1000);
        int valorDeLabel = Integer.parseInt(txtValorAsegurado.getValue().substring(0, CONSTANTE_8));
        int valorTotalAccesorio = 1 + logicaExtraeOSumaPorcentaje(valorDeLabel, CONSTANTE_02);
        txtvalorAccesorios.clear();
        txtvalorAccesorios.click();
        txtvalorAccesorios.sendKeys(Integer.toString(valorTotalAccesorio));
        txtValorAsegurado.click();
    }

    public void ingresaValorAccesoriosEspeciales() {
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(txtvalorAccesoriosEspe).waitUntilClickable();
        int valorTotalAccesorioEsp = 1 + Integer.parseInt(txtValorAsegurado.getValue().substring(0, CONSTANTE_8));
        txtvalorAccesoriosEspe.clear();
        clickElement(txtvalorAccesoriosEspe);
        txtvalorAccesoriosEspe.sendKeys(Integer.toString(valorTotalAccesorioEsp));
        btnSiguinete.click();
    }

    public int logicaExtraeOSumaPorcentaje(int valorCalcular, double porcentaje) {
        return (int) (valorCalcular * porcentaje);
    }

    public void validacionMensajeValores(String mensaje){
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(lblMensajes).waitUntilPresent();
        waitUntil(WAIT_TIME_1000);
        MatcherAssert.assertThat("No aparecio mensaje de alerta", lblMensajes.getText().contains(mensaje));
    }

    public void cerrarTransaccion() {
        btnOpcionDeCierre.click();
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(btnRetirarTransaccion).waitUntilPresent();
        btnRetirarTransaccion.click();
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(btnRetirarTransaccion).waitUntilPresent();
        btnAceptarRetirarTransaccion.click();
    }

}
