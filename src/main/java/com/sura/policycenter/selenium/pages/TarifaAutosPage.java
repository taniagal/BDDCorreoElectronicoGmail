package com.sura.policycenter.selenium.pages;

import com.sura.commons.selenium.Commons;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

public class TarifaAutosPage extends Commons{
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAPolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:SalesOrganizationType-inputEl']")
    private WebElementFacade comboBoxOrganizacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAPolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:ChannelType-inputEl']")
    private WebElementFacade comboBoxCanal;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAPolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PAPolicyType-inputEl']")
    private WebElementFacade comboBoxTipoPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver-btnInnerEl']")
    private WebElementFacade botonAgregarAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddExistingContact:1:UnassignedDriver-textEl']")
    private WebElementFacade navItemAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddExistingContact-textEl']")
    private WebElementFacade navItemContastosDeLaCuenta;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    private WebElementFacade campoTxtNombre;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxLimite;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:CoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxDeducible;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxPerdidaTotalHurto;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxPerdidaParcialHurto;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxPerdidaParcialHurtoFranquisia;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:CoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxGastosDeTransporte;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver-btnInnerEl']")
    private WebElementFacade botonRelacionarAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver:0:Driver']")
    private WebElementFacade navItemAseguradoR;


    public TarifaAutosPage(WebDriver driver){
        super(driver);
    }

    public void setInformacionDePoliza(ExamplesTable datosPoliza) {
        Map<String, String> dato = datosPoliza.getRow(0);
        selectItem(comboBoxOrganizacion, dato.get("organizacion"));
        waitUntil(2500);
        selectItem(comboBoxCanal, dato.get("canal"));
        waitUntil(2500);
        selectItem(comboBoxTipoPoliza,dato.get("tipo_poliza"));
        waitUntil(2500);
    }


    public void setAsegurados() {
        Actions actions = new Actions(getDriver());
        botonAgregarAsegurado.click();
        actions.moveToElement(navItemContastosDeLaCuenta).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        navItemAsegurado.click();
        campoTxtNombre.waitUntilPresent();
    }

    public void relacionarAsegurado(){
        botonRelacionarAsegurado.click();
        waitUntil(200);
        navItemAseguradoR.click();
    }

    public void setCoberturas(ExamplesTable datosPoliza) {
        comboBoxLimite.sendKeys();
        comboBoxDeducible.sendKeys();
        comboBoxPerdidaTotalHurto.sendKeys();
        comboBoxPerdidaParcialHurto.sendKeys();
        comboBoxPerdidaParcialHurtoFranquisia.sendKeys();
    }
}
