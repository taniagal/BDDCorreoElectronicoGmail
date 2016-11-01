package com.sura.guidewire.policycenter.pages;


import com.sura.guidewire.policycenter.util.PageUtil;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ValidacionesInformacionDeVehiculoPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:PersonalVehicles']/div")
    private WebElementFacade menuItemVehiculos;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel_tb:Add-btnInnerEl']")
    private WebElementFacade botonCrearVehiculo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:Next-btnInnerEl']")
    private WebElementFacade botonSiguiente;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:Prev-btnInnerEl']")
    public WebElementFacade botonVolver;
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
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:4:RateModifier-inputEl']")
    private WebElementFacade campoTxtDescuento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:5:RateModifier-inputEl']")
    private WebElementFacade campoTxtRecargo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:VehiculeZone-bodyEl']")
    private WebElementFacade campoTxtzona;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver-btnInnerEl']")
    private WebElementFacade botonRelacionarAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver:0:Driver-textEl']")
    private WebElementFacade botonAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:vehicleKm_false-inputEl']")
    private WebElementFacade campoVehiculoCeroKm;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:plan_DV-inputEl']")
    private WebElementFacade comboBoxPlan;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV:0:tipoDocument']")
    private WebElementFacade nitAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesLV-body']")
    private WebElementFacade tablaVehiculo;
    @FindBy(xpath = ".//a[contains(.,'Descartar cambios no guardados')]")
    private WebElementFacade linkDescartarCambios;

    protected static final int WAIT_TIME_28000 = 28000;

    public ValidacionesInformacionDeVehiculoPage(WebDriver driver) {
        super(driver);
    }

    public void irAVehiculos() {
        waitFor(menuItemVehiculos).shouldBePresent();
        waitUntil(WAIT_TIME_2000);
        menuItemVehiculos.click();
    }

    public void crearVehiculo() {
        botonCrearVehiculo.waitUntilPresent().click();
        campoTxtPlaca.waitUntilPresent();
    }

    public void agregarPlaca(String placa) {
        campoTxtPlaca.sendKeys(placa);
        campoTxtchasis.click();
        waitForTextToAppear(placa, WAIT_TIME_28000);
    }

    public void clickSiguiente() {
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(botonSiguiente).click();
    }

    public void clickLinkDescartarCambios(){
        setImplicitTimeout(WAIT_TIME_1, TimeUnit.SECONDS);
        if (linkDescartarCambios.isPresent()) {
            linkDescartarCambios.click();
            botonSiguiente.click();
        }
        resetImplicitTimeout();
    }
    public void clickVolver() {
        botonVolver.click();
        waitFor(campoTxtchasis).shouldBePresent();
    }

    public void agregarVehiculo(ExamplesTable datosVehiculo) {
        try {
            campoVehiculoCeroKm.click();
            Map<String, String> vehiculo = datosVehiculo.getRow(0);
            waitUntil(WAIT_TIME_3000);
            selectItem(comboBoxPlan, vehiculo.get("plan"));
            if (!"random".equals(vehiculo.get("placa"))) {
                ingresarDato(campoTxtPlaca, vehiculo.get("placa"));
            } else {
                campoTxtPlaca.clear();
                campoTxtPlaca.sendKeys("QWE" + (int) Math.floor(Math.random() * (100 - 999) + 999));
            }
            waitUntil(WAIT_TIME_1000);
            comboBoxVehiculoServicio.click();
            withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(tablaVehiculo).shouldContainText(campoTxtPlaca.getText());
            waitUntil(WAIT_TIME_2000);
            selectItem(comboBoxModelo, vehiculo.get("modelo"));
            withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(ExpectedConditions.textToBePresentInElement(tablaVehiculo, vehiculo.get("modelo")));
            waitUntil(WAIT_TIME_2000);
            ingresarDato(campoTxtCodigoFasecolda, vehiculo.get("codigo_fasecolda"));
            campoTxtPlaca.click();
            waitUntil(WAIT_TIME_2000);
            withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(ExpectedConditions.textToBePresentInElementValue(campoTxtValorAsegurado, vehiculo.get("valor_asegurado")));
            waitUntil(WAIT_TIME_2000);
            selectItem(comboBoxCiudadCirculacion, vehiculo.get("ciudad_circulacion"));
            waitForComboValue(comboBoxCiudadCirculacion, vehiculo.get("ciudad_circulacion"));
            waitUntil(WAIT_TIME_1000);
            waitFor(ExpectedConditions.textToBePresentInElement(campoTxtzona, vehiculo.get("zona")));
            selectItem(comboBoxVehiculoServicio, vehiculo.get("vehiculo_servicio"));
        if (!"null".equals(vehiculo.get("descuento"))) {
            campoTxtDescuento.sendKeys(vehiculo.get("descuento"));
            campoTxtRecargo.sendKeys(vehiculo.get("recargo"));
        }

        if (!"null".equals(vehiculo.get("motor"))) {
            campoTxtMotor.clear();
            campoTxtMotor.sendKeys(vehiculo.get("motor"));
            campoTxtchasis.clear();
            campoTxtchasis.sendKeys(vehiculo.get("chasis"));
        }

        MatcherAssert.assertThat("Error en el servicio de fasecolda", campoTxtValorAsegurado.getValue().contains(vehiculo.get("valor_asegurado")));
        }catch (Exception  e){
            e.printStackTrace();
        }
    }

    public void agregarCodigoFasecolda(String codigo) {
        waitFor(botonCrearVehiculo).click();
        comboBoxModelo.waitUntilPresent();
        selectItem(comboBoxModelo, "2015");
        waitForTextToAppear("2015");
        campoTxtCodigoFasecolda.sendKeys(codigo);
        campoTxtPlaca.click();
        waitUntil(WAIT_TIME_2000);
    }

    public void verificarMensajes(ExamplesTable mensajes) {
        verificarMensajes(divMensaje, mensajes);
    }

    public void verificarEstadoDelCampoCodigo() {
        MatcherAssert.assertThat("Error, no se validó el codigo fasecolda.", "".equals(campoTxtCodigoFasecolda.getValue()));
    }

    public void relacionarAseguradoDelVehiculo(String asegurado) {
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(botonRelacionarAsegurado).waitUntilClickable();
        botonRelacionarAsegurado.click();
        waitFor(botonAsegurado);
        botonAsegurado.click();
        withTimeoutOf(WAIT_TIME_20, TimeUnit.SECONDS).waitFor(nitAsegurado).shouldBePresent();
        waitUntil(WAIT_TIME_3000);
    }

    public void validarAvanceSiguientePagina() {
        waitUntil(WAIT_TIME_1000);
        WebElementFacade labelTituloCoberturasAuto = findBy(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:ttlBar']");
        withTimeoutOf(WAIT_TIME_20, TimeUnit.SECONDS).waitFor(labelTituloCoberturasAuto).shouldBePresent();
        MatcherAssert.assertThat(labelTituloCoberturasAuto.getText(), Is.is(Matchers.equalTo("Coberturas de auto personal")));
        waitUntil(WAIT_TIME_1000);
    }
}
