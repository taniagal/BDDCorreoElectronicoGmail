package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.Map;


public class ExpedicionDePolizaRequisitosPendientesPage extends PageUtil {
    public ExpedicionDePolizaRequisitosPendientesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:AccesoriosValue_DV-inputEl']")
    private WebElementFacade campoTxtAccesorios;
    @FindBy(xpath = ".//*[@id='wsTabBar:wsTab_0:panelId']")
    private WebElementFacade tablaRequisitos;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel_tb:Add-btnInnerEl']")
    private WebElementFacade botonCrearVehiculo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver-btnWrap']")
    private WebElementFacade botonRelacionarAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver:0:Driver-textEl']")
    private WebElementFacade clikAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Imported_true-inputEl']")
    private WebElementFacade itemImportado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:showImported_false-inputEl']")
    private WebElementFacade itemImportadoPorTerceros;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestCardTab-btnInnerEl']")
    private WebElementFacade botonInteresAdicional;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestDetailsDV:AdditionalInterestLV_tb:AddContactsButton-btnWrap']")
    private WebElementFacade botonAgregarInteresAdicional;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestDetailsDV:AdditionalInterestLV_tb:AddContactsButton:AddOtherContact']")
    private WebElementFacade botonOtrosContactos;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestDetailsDV:AdditionalInterestLV_tb:AddContactsButton:AddOtherContact:6:acctContact-textEl']")
    private WebElementFacade botonContacto;
    @FindBy(xpath = ".//div[3]/div/table/tbody/tr/td[5]/div")
    private WebElementFacade txtTipoBeneficiario;
    @FindBy(xpath = ".//li")
    private WebElementFacade txtTipoBeneficiarioOneroso;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PersonalVehicles']/div")
    private WebElementFacade botonVehiculos;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:AccesoriosValue_DV-inputEl']")
    private WebElementFacade txtAccesoriosModificacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl']")
    private WebElementFacade botonCotizarModificacion;
    @FindBy(xpath = "")
    private WebElementFacade botonExpedirPolizaModificacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:city-inputEl']")
    private WebElementFacade txtciudadPolizaModificacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:vehicleKm_true-inputEl']")
    private WebElementFacade itemVehiculoCeroKilometros;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PersonalVehicles']/div/span")
    private WebElementFacade botonVehiculosModificacion;
    @FindBy(xpath = ".//li")
    private WebElementFacade botonCiudadModificacion;
    @FindBy(xpath = "..//*[@id='SubmissionWizard:SubmissionWizard_PreQualificationScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl']")
    private WebElementFacade botonCotizarSubmission;
    @FindBy(xpath = ".//*[@id=\"JobComplete:JobCompleteScreen:JobCompleteDV:ViewPolicy-inputEl\"]")
    private WebElementFacade clickArchivoDePoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:vehicleKm_false-inputEl']")
    private WebElementFacade itemNoImportadoPorTerceros;



    public void valorAccesorios(String accesorios) {
        waitUntil(WAIT_TIME_3000);
        campoTxtAccesorios.sendKeys(accesorios);
    }

    public void verMensajeBloqueante(ExamplesTable mensajesBloqueo) {
        Map<String, String> bloqueoUW;
        tablaRequisitos.waitUntilPresent().waitUntilVisible();
        for (int i = 0; i < mensajesBloqueo.getRowCount(); i++) {
            bloqueoUW = mensajesBloqueo.getRows().get(i);
            MatcherAssert.assertThat(tablaRequisitos.getText(), Matchers.containsString(bloqueoUW.get("mensaje")));
        }
    }

    public void clickRequisitosPendientes() {
        findBy(".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:RequestRequirement-btnInnerEl']").click();
        for(String winHandle : getDriver().getWindowHandles()){
            System.out.println("paginas " + getDriver().switchTo().window(winHandle));
        }
    }

    public void clickAgregarVehiculo() {
        waitFor(botonCrearVehiculo).waitUntilPresent();
        waitUntil(WAIT_TIME_2000);
        clickElement(botonCrearVehiculo);
        waitUntil(WAIT_TIME_3000);

    }

    public void relacionarAsegurado() {
        waitFor(botonRelacionarAsegurado).waitUntilPresent();
        waitUntil(WAIT_TIME_2000);
        clickElement(botonRelacionarAsegurado);
        clickElement(clikAsegurado);
    }

    public void vehiculoImportadoTerceros() {
        campoTxtAccesorios.clear();
        waitUntil(WAIT_TIME_2000);
        clickElement(itemImportado);
        waitUntil(WAIT_TIME_2000);
        clickElement(itemImportadoPorTerceros);
    }

    public void ingresarBeneficiarioOneroso() {
        itemNoImportadoPorTerceros.click();
        waitUntil(WAIT_TIME_3000);
        clickElement(botonInteresAdicional);
        waitUntil(WAIT_TIME_3000);
        clickElement(botonAgregarInteresAdicional);
        waitUntil(WAIT_TIME_2000);
        clickElement(botonOtrosContactos);
        waitUntil(WAIT_TIME_2000);
        clickElement(botonContacto);
        waitUntil(WAIT_TIME_2000);
        clickElement(txtTipoBeneficiario);
        waitUntil(WAIT_TIME_2000);
        clickElement(txtTipoBeneficiarioOneroso);


    }

    public void clickVehiculosModificacion() {
        waitUntil(WAIT_TIME_3000);
        botonVehiculosModificacion.click();
        waitUntil(WAIT_TIME_5000);
        botonVehiculosModificacion.click();
    }

    public void agregarAccesorios(String accesorios) {
        waitUntil(WAIT_TIME_3000);
        txtAccesoriosModificacion.clear();
        waitUntil(WAIT_TIME_2000);
        txtAccesoriosModificacion.sendKeys(accesorios);
        waitUntil(WAIT_TIME_3000);
    }

    public void cotizarModificacionPoliza() {
        waitUntil(WAIT_TIME_3000);
        botonCotizarModificacion.click();
    }

    public void clickExpedirPoliza() {
        waitUntil(WAIT_TIME_3000);

    }

    public void ingresarCiudadModificacion(String ciudad) {
        waitUntil(WAIT_TIME_3000);
        txtciudadPolizaModificacion.clear();
        txtciudadPolizaModificacion.sendKeys(ciudad);
        waitUntil(WAIT_TIME_1000);
        botonCiudadModificacion.click();
        waitUntil(WAIT_TIME_1000);
    }

    public void clickVehiculoCeroKilometros() {
        waitUntil(WAIT_TIME_3000);
        itemVehiculoCeroKilometros.click();

    }

    public void valirdarPresenciaCotizar() {
        waitUntil(WAIT_TIME_3000);
        if(botonCotizarSubmission.isPresent()){
            botonCotizarSubmission.click();
        }
        waitUntil(WAIT_TIME_3000);


    }

    public void clickArchivoDePoliza() {
        waitUntil(WAIT_TIME_3000);
        clickArchivoDePoliza.click();
        waitUntil(WAIT_TIME_3000);

    }

    public void seleccionarOpcionCeroKilometros() {
        itemVehiculoCeroKilometros.click();
    }
}

