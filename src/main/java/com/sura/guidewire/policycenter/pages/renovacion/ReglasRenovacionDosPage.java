package com.sura.guidewire.policycenter.pages.renovacion;


import com.sura.guidewire.policycenter.resources.PageUtil;

import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;

public class ReglasRenovacionDosPage extends PageUtil {

    private static int CONSTANTE_8 = 8;
    private static final double CONSTANTE_02 = 0.2;
    private static final String CONSTANTE_09 = "";
    @FindBy(xpath = ".//*[contains(@id,'Next-btnInnerEl')]")
    WebElementFacade btnSiguinete;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:PersonalVehicles']")
    WebElementFacade menuItemVehiculo;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:ttlBar']")
    WebElementFacade lblAsegurado;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:JobWizardToolbarButtonSet:EditPolicy-btnInnerEl']")
    WebElementFacade btnEditarTransaccion;
    @FindBy(xpath = ".//*[@id='button-1005-btnInnerEl']")
    WebElementFacade btnAceptarEditarTransaccion;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:JobWizardToolbarButtonSet:RenewalQuote-btnInnerEl']")
    WebElementFacade botonCotizar;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:JobWizardToolbarButtonSet:CloseOptions-btnInnerEl']")
    WebElementFacade btnOpcionDeCierre;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:JobWizardToolbarButtonSet:CloseOptions:Withdraw']")
    WebElementFacade btnRetirarTransaccion;
    @FindBy(xpath = ".//*[@id='button-1005-btnInnerEl']")
    WebElementFacade btnAceptarRetirarTransaccion;
    @FindBy(xpath = ".//*[contains(@id,'LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:StatedValue_DV-inputEl')]")
    WebElementFacade txtValorAsegurado;
    @FindBy(xpath = ".//*[contains(@id,'LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:AccesoriosValue_DV-inputEl')]")
    WebElementFacade txtvalorAccesorios;
    @FindBy(xpath = ".//*[contains(@id,'LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:AccesoriosEspValue_DV-inputEl')]")
    WebElementFacade txtValorAccesoriosEspe;
    @FindBy(xpath = ".//*[contains(@id,'LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:city-inputEl')]")
    WebElementFacade campoTxtCiudadDeCirculacion;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:_msgs']")
    WebElementFacade lblMensajes;
    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab']")
    private WebElementFacade menuPoliza;
    @FindBy(xpath = ".//div/span[contains(.,'Coberturas')]")
    private WebElementFacade mnuCoberturasAutoPersonal;


    public ReglasRenovacionDosPage(WebDriver driver) {
        super(driver);
    }

    /*
    *El metodo contiene los esperarHasta debido que espera un refresh en la pantalla para la aparicion de un botón
    */
    public void clicHastaVehiculo() {
        for (int i = 0; i < CONSTANTE_3; i++) {
            setImplicitTimeout(0, TimeUnit.SECONDS);
            if (!botonCotizar.isPresent()) {
                esperarHasta(TIEMPO_3000);
                clickearElemento(menuPoliza);
            }
            resetImplicitTimeout();
        }
        clickearElemento(menuItemVehiculo);
        setImplicitTimeout(TIEMPO_2, TimeUnit.SECONDS);
        if (findBy(".message").isVisible()) {
            clickearElemento(menuItemVehiculo);
        }
        resetImplicitTimeout();
    }

    public void editarTransaccion() {
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(btnEditarTransaccion).waitUntilClickable();
        btnEditarTransaccion.click();
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(btnAceptarEditarTransaccion).waitUntilClickable();
        btnAceptarEditarTransaccion.click();
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(botonCotizar).waitUntilClickable();
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(lblMensajes).waitUntilPresent();
    }

    public void ingresaValorMayorVeintePorciento() {
        CONSTANTE_9=txtValorAsegurado.getValue().length();
        esperarHasta(TIEMPO_1000);
        int valorDeLabel = Integer.parseInt(txtValorAsegurado.getValue().substring(0, CONSTANTE_9));
        int valorTotalAccesorio = 1 + logicaExtraeOSumaPorcentaje(valorDeLabel, CONSTANTE_02);
        txtvalorAccesorios.clear();
        txtvalorAccesorios.click();
        txtvalorAccesorios.sendKeys(Integer.toString(valorTotalAccesorio));
        txtValorAsegurado.click();
    }

    public void ingresaValorAccesoriosEspeciales() {
        CONSTANTE_8=txtValorAsegurado.getValue().length();
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(txtValorAccesoriosEspe).waitUntilClickable();
        int valorTotalAccesorioEsp = 1 + Integer.parseInt(txtValorAsegurado.getValue().substring(0, CONSTANTE_8));
        txtValorAccesoriosEspe.clear();
        clickearElemento(txtValorAccesoriosEspe);
        txtValorAccesoriosEspe.sendKeys(Integer.toString(valorTotalAccesorioEsp));
        if ("<ninguno>".equals(campoTxtCiudadDeCirculacion.getValue())) {
            seleccionarItem(campoTxtCiudadDeCirculacion, "MEDELLIN (ANTIOQUIA)");
        }
        clickearElemento(btnSiguinete);
        esperarYClickearBoton(mnuCoberturasAutoPersonal);

    }

    public int logicaExtraeOSumaPorcentaje(int valorCalcular, double porcentaje) {
        return (int) (valorCalcular * porcentaje);
    }

    public void validacionMensajeValores(String mensaje) {
        verificarMensaje(lblMensajes, mensaje);
    }

    public void cerrarTransaccion() {
        btnOpcionDeCierre.click();
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(btnRetirarTransaccion).waitUntilPresent();
        btnRetirarTransaccion.click();
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(btnRetirarTransaccion).waitUntilPresent();
        btnAceptarRetirarTransaccion.click();
    }

}
