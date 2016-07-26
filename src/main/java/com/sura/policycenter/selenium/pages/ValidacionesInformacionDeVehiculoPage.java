package com.sura.policycenter.selenium.pages;


import com.sura.guidewire.selenium.Guidewire;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

import javax.swing.*;

public class ValidacionesInformacionDeVehiculoPage extends Guidewire {
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:PersonalVehicles']/div")
    private WebElementFacade menuItemVehiculos;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel_tb:Add-btnInnerEl']")
    private WebElementFacade botonCrearVehiculo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:Next-btnInnerEl']")
    private WebElementFacade botonsiguiente;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicensePlate_DV-inputEl']")
    private WebElementFacade campoTxtPlaca;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Year_DV-inputEl']")
    private WebElementFacade comboBoxModelo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:_msgs']")
    private WebElementFacade divMensaje;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:facecoldaCode_DV-inputEl']")
    private WebElementFacade campoTxtCodigoFasecolda;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:service_DV-inputEl']")
    private WebElementFacade comboBoxVehiculoServicio;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:city-inputEl']")
    private WebElementFacade comboBoxCiudadCirculacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Engine_DV-inputEl']")
    private WebElementFacade campoTxtMotor;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:chasisl_DV-inputEl']")
    private WebElementFacade campoTxtchasis;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:StatedValue_DV-inputEl']")
    private WebElementFacade campoTxtValorAsegurado;



    public ValidacionesInformacionDeVehiculoPage(WebDriver driver) {
        super(driver);
    }

    public void irAVehiculos() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(menuItemVehiculos).shouldBePresent();
        menuItemVehiculos.click();
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(botonCrearVehiculo).click();
    }

    public void crearVehiculo(){
        campoTxtPlaca.waitUntilPresent();
        botonCrearVehiculo.click();
    }

    public void clickSiguiente(){
        botonsiguiente.click();
    }

    public void agregarVehiculo(ExamplesTable datosVehiculo){
        Map<String, String> vehiculo = datosVehiculo.getRow(0);
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(campoTxtPlaca).shouldBePresent();
        campoTxtPlaca.sendKeys(vehiculo.get("placa"));
        selectItem(comboBoxModelo,vehiculo.get("modelo"));
        waitUntil(3200);
        campoTxtCodigoFasecolda.sendKeys(vehiculo.get("codigo_fasecolda"));
        waitUntil(2000);
        campoTxtPlaca.click();
        waitUntil(3500);
        selectItem(comboBoxCiudadCirculacion,vehiculo.get("ciudad_circulacion"));
        waitUntil(2500);
        selectItem(comboBoxVehiculoServicio,vehiculo.get("vehiculo_servicio"));
        if(!"null".equals(vehiculo.get("motor"))){
        campoTxtMotor.sendKeys(vehiculo.get("motor"));
        campoTxtchasis.sendKeys(vehiculo.get("chasis"));
        }
        if(!"null".equals(vehiculo.get("valor_asegurado"))) {
            campoTxtValorAsegurado.clear();
            campoTxtValorAsegurado.sendKeys(vehiculo.get("valor_asegurado"));
        }
    }

    public void agregarCodigoFasecolda(String codigo) {
       campoTxtCodigoFasecolda.waitUntilPresent().sendKeys(codigo);
       campoTxtPlaca.click();
       waitUntil(1000);
    }

    public void verificarMensajes(ExamplesTable mensajes){
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(divMensaje).shouldBePresent();
        for(Map<String, String> mensaje: mensajes.getRows()){
            MatcherAssert.assertThat("Error: en la validacion del mensaje "+mensaje.get("mensaje"), divMensaje.containsText(mensaje.get("mensaje")));
        }
    }

    public void verificarEstadoDelCampoCodigo() {
        MatcherAssert.assertThat("Error, no se validó el codigo fasecolda.", "".equals(campoTxtCodigoFasecolda.getValue()));
    }
}
