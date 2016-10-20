package com.sura.policycenter.selenium.pages.renovacion;


import com.sura.commons.selenium.Commons;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ReglasRenovacionDosPage extends PageObject {

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

    Commons cm = new Commons(getDriver());

    public ReglasRenovacionDosPage(WebDriver driver) {
        super(driver);
    }

    /*
    *El metodo contiene los waitUntil debido que espera un refresh en la pantalla para la aparicion de un botón
    */
    public void clicHastaVehiculo() {
        cm.waitUntil(1000);
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(btnSiguinete).waitUntilClickable();
        btnSiguinete.click();
        cm.waitUntil(1000);
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(lblAsegurado).waitUntilPresent();
        cm.waitUntil(1000);
        btnSiguinete.click();
    }

    public void editarTransaccion() {
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(btnEditarTransaccion).waitUntilClickable();
        btnEditarTransaccion.click();
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(btnAceptarEditarTransaccion).waitUntilClickable();
        btnAceptarEditarTransaccion.click();
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(btnCotizar).waitUntilClickable();
    }

    public void ingresaValorMayorVeintePorciento() {
        cm.waitUntil(1000);
        int valorDeLabel = Integer.parseInt(txtValorAsegurado.getValue().substring(0, 8));
        int valorTotalAccesorio = 1 + logicaExtraeOSumaPorcentaje(valorDeLabel, 0.2);
        txtvalorAccesorios.clear();
        txtvalorAccesorios.click();
        txtvalorAccesorios.sendKeys(Integer.toString(valorTotalAccesorio));
        txtValorAsegurado.click();
    }

    public void ingresaValorAccesoriosEspeciales() {
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(txtvalorAccesoriosEspe).waitUntilClickable();
        int valorTotalAccesorioEsp = 1 + Integer.parseInt(txtValorAsegurado.getValue().substring(0, 8));
        txtvalorAccesoriosEspe.clear();
        txtvalorAccesoriosEspe.click();
        txtvalorAccesoriosEspe.sendKeys(Integer.toString(valorTotalAccesorioEsp));
        btnSiguinete.click();
    }

    public int logicaExtraeOSumaPorcentaje(int valorCalcular, double porcentaje) {
        int numeroConPorcentaje = (int) (valorCalcular * porcentaje);
        return numeroConPorcentaje;
    }

    public void validacionMensajeValores(String mensaje){
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(lblMensajes).waitUntilPresent();
        cm.waitUntil(1000);
        MatcherAssert.assertThat("No aparecio mensaje de alerta", lblMensajes.getText().contains(mensaje));
    }

    public void cerrarTransaccion() {
        btnOpcionDeCierre.click();
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(btnRetirarTransaccion).waitUntilPresent();
        btnRetirarTransaccion.click();
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(btnRetirarTransaccion).waitUntilPresent();
        btnAceptarRetirarTransaccion.click();
    }

}
