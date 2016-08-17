package com.sura.policycenter.selenium.pages;

import com.sura.commons.selenium.Commons;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.jbehave.core.steps.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class InspeccionVehiculoPage extends Commons {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(InspeccionVehiculoPage.class);

    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:VehicleNumber_DV-inputEl']")
    private WebElementFacade campoNumeroVehiculo;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Year_DV-inputEl']")
    private WebElementFacade campoModelo;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:facecoldaCode_DV-inputEl']")
    private WebElementFacade campoFasecolda;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Engine_DV-inputEl']")
    private WebElementFacade campoMotor;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:chasisl_DV-inputEl']")
    private WebElementFacade campoChasis;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:AccesoriosValue_DV-inputEl']")
    private WebElementFacade campoValorAccesorios;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:AccesoriosEspValue_DV-inputEl']")
    private WebElementFacade campoValorAccesoriosEspeciales;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel_tb:Add-btnInnerEl']")
    private WebElementFacade botonCrearVehiculo;

    public InspeccionVehiculoPage(WebDriver driver){
        super(driver);
    }

    public void crearVehiculo() {
        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(botonCrearVehiculo).shouldBePresent();
        botonCrearVehiculo.click();
        waitUntil(1000);
    }

    public void validarVigenciaPlaca(String placa) {
        WebElementFacade campoPlaca = findBy(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicensePlate_DV-inputEl']");
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(campoPlaca).shouldBePresent();
        campoPlaca.typeAndTab(placa);
        waitUntil(6000);
        withTimeoutOf(30,TimeUnit.SECONDS).waitFor(campoModelo).shouldBeVisible();
        campoNumeroVehiculo.click();
    }

    public void validarDatosVehiculo(ExamplesTable datosVehiculo) {

        for (Map<String,String> row : datosVehiculo.getRows()){
            String modelo = row.get("modelo");
            String fasecolda = row.get("codigoFasecolda");
            String motor = row.get("motor");
            String chasis = row.get("chasis");
            String valorAccesorios = row.get("valorAccesorios");
            String valorAccesoriosEspeciales = row.get("valorAccesoriosEspeciales");
            MatcherAssert.assertThat(campoModelo.getTextValue(), Is.is(Matchers.equalTo(modelo)));
            MatcherAssert.assertThat(campoFasecolda.getTextValue(), Is.is(Matchers.equalTo(fasecolda)));
            MatcherAssert.assertThat(campoMotor.getTextValue(), Is.is(Matchers.equalTo(motor)));
            MatcherAssert.assertThat(campoChasis.getTextValue(), Is.is(Matchers.equalTo(chasis)));
            MatcherAssert.assertThat(campoValorAccesorios.getTextValue(), Is.is(Matchers.equalTo(valorAccesorios)));
            MatcherAssert.assertThat(campoValorAccesoriosEspeciales.getTextValue(), Is.is(Matchers.equalTo(valorAccesoriosEspeciales)));
        }
    }

    public void validarValorAsegurado(String valorAsegurado) {
        String validacion = null;
        WebElementFacade campoValorAsegurado = findBy(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:StatedValue_DV-inputEl']");
        try{
            MatcherAssert.assertThat(campoValorAsegurado.getTextValue(),Is.is(Matchers.equalTo(valorAsegurado)));
        }catch (Exception e){
            LOGGER.error(validacion, e);
            validacion = e.getMessage();
        }
    }
}
