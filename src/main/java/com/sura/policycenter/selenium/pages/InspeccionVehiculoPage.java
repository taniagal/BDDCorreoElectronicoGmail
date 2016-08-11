package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
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

public class InspeccionVehiculoPage extends Guidewire {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(InspeccionVehiculoPage.class);

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

    public InspeccionVehiculoPage(WebDriver driver){
        super(driver);
    }

    public void validarVigenciaPlaca(String placa) {
        WebElementFacade campoPlaca = findBy(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicensePlate_DV-inputEl']");
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(campoPlaca).shouldBePresent();
        campoPlaca.type(placa);
        waitUntil(1000);
    }

    public void validarFechaCancelacionOExclusion() {
    }

    public void validarDatosVehiculo(ExamplesTable datosVehiculo) {
        //Map<String, String> informacionVehiculo;

        for (Map<String,String> row : datosVehiculo.getRows()){
            String modelo = row.get("modelo");
            String fasecolda = row.get("codigoFasecolda");
            String motor = row.get("motor");
            String chasis = row.get("chasis");
            String valorAccesorios = row.get("valorAccesorios");
            String valorAccesoriosEspeciales = row.get("valorAccesoriosEspeciales");
            WebElementFacade camModelo = findBy(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Year_DV-inputEl']");
            MatcherAssert.assertThat(camModelo.getText(), Is.is(Matchers.equalTo(modelo)));
            WebElementFacade camFasecolda = findBy(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:facecoldaCode_DV-inputEl']");
            MatcherAssert.assertThat(camFasecolda.getText(), Is.is(Matchers.equalTo(fasecolda)));
            WebElementFacade camMotor = findBy(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Engine_DV-inputEl']");
            MatcherAssert.assertThat(camMotor.getText(), Is.is(Matchers.equalTo(motor)));
            WebElementFacade camChasis = findBy(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:chasisl_DV-inputEl']");
            MatcherAssert.assertThat(camChasis.getText(), Is.is(Matchers.equalTo(chasis)));
            WebElementFacade camValorAccesorios = findBy(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:AccesoriosValue_DV-inputEl']");
            MatcherAssert.assertThat(camValorAccesorios.getText(), Is.is(Matchers.equalTo(valorAccesorios)));
            WebElementFacade camValorAccesoriosEspeciales = findBy(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:AccesoriosEspValue_DV-inputEl']");
            MatcherAssert.assertThat(camValorAccesoriosEspeciales.getText(), Is.is(Matchers.equalTo(valorAccesoriosEspeciales)));
        }

        /*
        if (campoModelo.getText().equals(datosVehiculo.getRows().get(0).get("modelo"))) {
            informacionVehiculo = datosVehiculo.getRows().get(0);
        }else{
            informacionVehiculo = datosVehiculo.getRows().get(1);
        }
        MatcherAssert.assertThat(campoModelo.getText(), Is.is(Matchers.equalTo(informacionVehiculo.get("modelo"))));
        MatcherAssert.assertThat(campoFasecolda.getText(), Is.is(Matchers.equalTo(informacionVehiculo.get("codigoFasecolda"))));
        MatcherAssert.assertThat(campoMotor.getText(), Is.is(Matchers.equalTo(informacionVehiculo.get("motor"))));
        MatcherAssert.assertThat(campoChasis.getText(), Is.is(Matchers.equalTo(informacionVehiculo.get("chasis"))));
        MatcherAssert.assertThat(campoValorAccesorios.getText(), Is.is(Matchers.equalTo(informacionVehiculo.get("valorAccesorios"))));
        MatcherAssert.assertThat(campoValorAccesoriosEspeciales.getText(), Is.is(Matchers.equalTo(informacionVehiculo.get("valorAccesoriosEspeciales"))));
        */
    }

    public void validarValorAsegurado(String valorAsegurado) {
        String validacion = null;
        WebElementFacade campoValorAsegurado = findBy(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:StatedValue_DV-inputEl']");
        try{
            MatcherAssert.assertThat(campoValorAsegurado.getText(),Is.is(Matchers.equalTo(valorAsegurado)));
        }catch (Exception e){
            LOGGER.error(validacion, e);
            validacion = e.getMessage();
        }
    }
}
