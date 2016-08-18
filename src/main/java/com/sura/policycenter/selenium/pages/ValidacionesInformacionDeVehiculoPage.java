package com.sura.policycenter.selenium.pages;


import com.sura.commons.selenium.Commons;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;



public class ValidacionesInformacionDeVehiculoPage extends Commons {
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:PersonalVehicles']/div")
    private WebElementFacade menuItemVehiculos;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel_tb:Add-btnInnerEl']")
    private WebElementFacade botonCrearVehiculo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:Next-btnInnerEl']")
    private WebElementFacade botonSiguiente;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:Prev-btnInnerEl']")
    private WebElementFacade botonVolver;
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
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:totalInsured_DV-inputEl']")
    private WebElementFacade labelValorAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:4:RateModifier-inputEl']")
    private WebElementFacade campoTxtDescuento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:5:RateModifier-inputEl']")
    private WebElementFacade campoTxtRecargo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver-btnWrap']")
    private WebElementFacade botonRelacionarAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver:0:Driver-textEl']")
    private WebElementFacade botonAsegurado;




    public ValidacionesInformacionDeVehiculoPage(WebDriver driver) {
        super(driver);
    }

    public void irAVehiculos() {
        waitFor(menuItemVehiculos).shouldBePresent();
        menuItemVehiculos.click();
    }

    public void crearVehiculo() {
        campoTxtPlaca.waitUntilPresent();
        botonCrearVehiculo.click();
    }

    public void clickSiguiente() {
        withTimeoutOf(28, TimeUnit.SECONDS).waitFor(botonSiguiente).click();
    }

    public void volver(){
        botonVolver.click();
        waitFor(campoTxtchasis).shouldBePresent();
    }

    public void agregarVehiculo(ExamplesTable datosVehiculo) {
        waitFor(botonCrearVehiculo).click();
        Map<String, String> vehiculo = datosVehiculo.getRow(0);
        waitFor(campoTxtPlaca).shouldBePresent();
        campoTxtPlaca.sendKeys(vehiculo.get("placa"));
        comboBoxModelo.click();
        waitUntil(2500);
        comboBoxModelo.sendKeys(vehiculo.get("modelo"));
        comboBoxModelo.sendKeys(Keys.ENTER);
        waitForTextToAppear(vehiculo.get("modelo"));
        ingresarDato(campoTxtCodigoFasecolda,vehiculo.get("codigo_fasecolda"));
        waitUntil(2000);
        campoTxtPlaca.click();
        try {
            waitForTextToAppear(vehiculo.get("valor_asegurado"));
        }catch (TimeoutException e){
            e.printStackTrace();
        }
        MatcherAssert.assertThat("Error en el servicio de fasecolda", labelValorAsegurado.containsText(vehiculo.get("valor_asegurado")));
        selectItem(comboBoxCiudadCirculacion, vehiculo.get("ciudad_circulacion"));
        waitUntil(4000);
        waitForAbsenceOf("//li");
        selectItem(comboBoxVehiculoServicio, vehiculo.get("vehiculo_servicio"));
        if(!"null".equals(vehiculo.get("descuento"))){
            campoTxtDescuento.sendKeys(vehiculo.get("descuento"));
            campoTxtRecargo.sendKeys(vehiculo.get("recargo"));
        }
        if (!"null".equals(vehiculo.get("motor"))) {
            campoTxtMotor.sendKeys(vehiculo.get("motor"));
            campoTxtchasis.sendKeys(vehiculo.get("chasis"));
        }
    }

    public void agregarCodigoFasecolda(String codigo) {
        waitFor(botonCrearVehiculo).click();
        campoTxtCodigoFasecolda.waitUntilPresent().sendKeys(codigo);
        campoTxtPlaca.click();
        waitUntil(2000);
    }

    public void verificarMensajes(ExamplesTable mensajes) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(divMensaje).shouldBePresent();
        for (Map<String, String> mensaje : mensajes.getRows()) {
            MatcherAssert.assertThat("Error: en la validacion del mensaje " + mensaje.get("mensaje"), divMensaje.containsText(mensaje.get("mensaje")));
        }
    }

    public void verificarEstadoDelCampoCodigo() {
        MatcherAssert.assertThat("Error, no se validó el codigo fasecolda.", "".equals(campoTxtCodigoFasecolda.getValue()));
    }

    public void relacionarAseguradoDelVehiculo(String asegurado){
        waitFor(botonRelacionarAsegurado).click();
        waitFor(botonAsegurado);
        botonAsegurado.click();
        waitForTextToAppear(asegurado);
        waitUntil(3000);
    }
}
