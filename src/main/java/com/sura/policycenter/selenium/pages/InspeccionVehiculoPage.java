package com.sura.policycenter.selenium.pages;

import com.sura.commons.selenium.Commons;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.LoggerFactory;


public class InspeccionVehiculoPage extends Commons {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(InspeccionVehiculoPage.class);

    Actions act = new Actions(getDriver());

    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicensePlate_DV-inputEl']")
    private WebElementFacade campoPlaca;
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
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:StatedValue_DV-inputEl']")
    private WebElementFacade campoValorAsegurado;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:vehicleKm_false-inputEl']")
    private WebElementFacade radioButtonCeroKmNo;
    @FindBy(xpath=".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:IssuesPolicy-btnInnerEl']")
    private WebElementFacade botonExpedirPoliza;
    @FindBy(xpath=".//*[@id='JobComplete:JobCompleteScreen:ttlBar']")
    private WebElementFacade labelCotizacionExpedida;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:LicensePlate-inputEl']")
    private WebElementFacade labelPlaca;
    @FindBy(xpath = ".//*[@id='UWBlockProgressIssuesPopup:IssuesScreen:ApproveDV:0:ShortDescriptionAndSize-inputEl']")
    private WebElementFacade mensajeBloqueoExpedicion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:RiskAnalysis']/div")
    private WebElementFacade menuAnalisisRiesgo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:RiskEvaluationPanelSet:1:UWIssueRowSet:ShortDescription']")
    private WebElementFacade registroBloqueoInspeccion;

    public InspeccionVehiculoPage(WebDriver driver){
        super(driver);
    }

    public void chekear0km() {
        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(radioButtonCeroKmNo).click();
        waitUntil(1000);
    }

    public void validarVigenciaPlaca(String placa) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(campoPlaca).shouldBePresent();
        campoPlaca.typeAndTab(placa);
        waitForTextToAppear(placa,28000);
        campoNumeroVehiculo.click();
    }

    public void validarDatosVehiculo(ExamplesTable datosVehiculo) {
        waitUntil(1500);
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
        waitUntil(1000);
        String validacion = null;
        try{
            MatcherAssert.assertThat(campoValorAsegurado.getTextValue(),Is.is(Matchers.equalTo(valorAsegurado)));
        }catch (Exception e){
            LOGGER.error(validacion, e);
            validacion = e.getMessage();
        }
    }

    public void expedirPoliza() {
        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(botonExpedirPoliza).shouldBeVisible();
        botonExpedirPoliza.click();
        waitUntil(1000);
        act.sendKeys(Keys.ENTER).build().perform();
        waitUntil(3000);
    }

    public void validarVehiculoSinInspeccion(String placa) {
    withTimeoutOf(20,TimeUnit.SECONDS).waitFor(labelPlaca).shouldBeVisible();
        MatcherAssert.assertThat(labelPlaca.getText(),Is.is(Matchers.equalTo(placa)));
    }

    public void validarMensajeBloqueo(String mensaje) {
        MatcherAssert.assertThat(mensajeBloqueoExpedicion.getText(),Is.is(Matchers.equalTo(mensaje)));
    }

    public void generarUW(String mensaje) {
        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(menuAnalisisRiesgo).click();
        waitUntil(2500);
        MatcherAssert.assertThat(registroBloqueoInspeccion.getText(),Is.is(Matchers.equalTo(mensaje)));
    }

    public void validarCotizacionExpedida() {
        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(labelCotizacionExpedida).shouldBeVisible();
        MatcherAssert.assertThat(labelCotizacionExpedida.getText(),Is.is(Matchers.equalTo("Cotización Expedida")));
    }
}
