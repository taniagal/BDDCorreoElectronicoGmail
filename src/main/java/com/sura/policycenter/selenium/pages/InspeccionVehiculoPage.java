package com.sura.policycenter.selenium.pages;

import com.sura.commons.selenium.Commons;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.jbehave.core.steps.Parameters;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.TimeUnit;

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
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:PALine']/div")
    private WebElementFacade menuCoberturasAuto;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade campoLimiteRC;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:CoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade campoDeducibleRC;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkboxHurto;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl']")
    private WebElementFacade botonCotizar;
    @FindBy(xpath=".//*[@id='SubmissionWizard:ViewQuote']/div")
    private WebElementFacade menuCotizacion;
    @FindBy(xpath=".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:IssuesPolicy-btnInnerEl']")
    private WebElementFacade botonExpedirPoliza;
    @FindBy(xpath=".//*[@id='JobComplete:JobCompleteScreen:ttlBar']")
    private WebElementFacade labelCotizacionExpedida;
    @FindBy(xpath=".//*[@id='PolicyFile_Summary:Policy_SummaryScreen:Policy_Summary_DatesDV:PolicyPerEffDate-inputEl']")
    private WebElementFacade campoFechaInicioVigencia;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:LicensePlate-inputEl']")
    private WebElementFacade labelPlaca;
    @FindBy(xpath = ".//*[@id='UWBlockProgressIssuesPopup:IssuesScreen:ApproveDV:0:ShortDescriptionAndSize-inputEl']")
    private WebElementFacade mensajeBloqueoExpedicion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:RiskAnalysis']/div")
    private WebElementFacade menuAnalisisRiesgo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:RiskEvaluationPanelSet:1:UWIssueRowSet:ShortDescription']")
    private WebElementFacade registroBloqueoInspeccion;
    @FindBy(xpath = ".//*[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ViewPolicy-inputEl']")
    private WebElementFacade opcionVerPoliza;

    public InspeccionVehiculoPage(WebDriver driver){
        super(driver);
    }

    public void crearVehiculo() {
        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(botonCrearVehiculo).shouldBePresent();
        botonCrearVehiculo.click();
        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(radioButtonCeroKmNo).click();
        waitUntil(1000);
    }

    public void validarVigenciaPlaca(String placa) {
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
        //MatcherAssert.assertThat(labelCotizacionExpedida.getText(),Is.is(Matchers.equalTo("Cotización Expedida")));
        //waitUntil(1000);
    }

    public void validarFechaInspeccion(String fechaInspeccion) {
        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(opcionVerPoliza).click();
        waitUntil(2000);
        withTimeoutOf(30,TimeUnit.SECONDS).waitFor(campoFechaInicioVigencia).shouldBeVisible();
        MatcherAssert.assertThat(campoFechaInicioVigencia.getText(),Is.is(Matchers.equalTo(fechaInspeccion)));
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