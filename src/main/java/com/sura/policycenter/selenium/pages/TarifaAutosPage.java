package com.sura.policycenter.selenium.pages;

import com.sura.commons.selenium.Commons;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;

public class TarifaAutosPage extends Commons {
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:SalesOrganizationType-inputEl']")
    private WebElementFacade comboBoxOrganizacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:ChannelType-inputEl']")
    private WebElementFacade comboBoxCanal;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PAPolicyType-inputEl']")
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
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver-btnInnerEl']")
    private WebElementFacade botonRelacionarAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver:0:Driver']")
    private WebElementFacade navItemAseguradoR;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV:0:numDocument']")
    private WebElementFacade itemdocNum;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:WebMessageWorksheet_ClearButton']")
    private WebElementFacade botonBorrar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxDaniosCarro;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxHurto;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:0:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxAsistencia;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:JobWizardToolbarButtonSet:QuoteOrReview']")
    private WebElementFacade botonCotizar;
    @FindBy(xpath = ".//*[@id='UWBlockProgressIssuesPopup:IssuesScreen:ApproveDV:0']")
    private WebElementFacade labelDetalles;
    @FindBy(id = "SubmissionWizard:ViewQuote")
    private WebElementFacade menuItemCotizacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:1:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxAbogado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxPerdidaTotalHurto;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxPerdidaParcialHurto;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:2:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxPerdidaParcialHurtoFranquisia;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:3:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxGastosDeTransporte;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxAsistencia;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:1:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxTaller;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:1:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxTaller;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:2:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxGrua;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:2:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxGrua;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAccidentesDetailDV:0:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxAccidentes;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAccidentesDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxAccidentes;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PACentroServiciosDetailDV:0:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxCentroDeServicios;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PACentroServiciosDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxCentroDeServicios;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxPerdidaTotalDaniosDeducible;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxPerdidaParcialDaniosDeducible;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:2:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxPerdidaParcialDaniosFranquicia;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:3:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxGastosDeTransporteCarro;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PACarroDeReemplazoDetailDV:0:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxCarroDeReemplazo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PACarroDeReemplazoDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxPerdidaParcial;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PACarroDeReemplazoDetailDV:0:CoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxPerdidaTotal;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:3:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxTallerMovil;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:3:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxTallerMovil;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:4:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxConductorElegido;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:4:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxConductorElegido;


    public TarifaAutosPage(WebDriver driver) {
        super(driver);
    }

    public void setInformacionDePoliza(ExamplesTable datosPoliza) {
        Map<String, String> dato = datosPoliza.getRow(0);
        selectItem(comboBoxOrganizacion, dato.get("organizacion"));
        waitUntil(1500);
        selectItem(comboBoxCanal, dato.get("canal"));
        waitUntil(1500);
        selectItem(comboBoxTipoPoliza, dato.get("tipo_poliza"));
        waitUntil(1500);
    }


    public void setAsegurados() {
        Actions actions = new Actions(getDriver());
        botonAgregarAsegurado.click();
        actions.moveToElement(navItemContastosDeLaCuenta).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        navItemAsegurado.click();
        campoTxtNombre.waitUntilPresent();
    }

    public void relacionarAsegurado() {
        botonRelacionarAsegurado.click();
        navItemAseguradoR.click();
        itemdocNum.waitUntilPresent();
    }

    public void setCoberturas(ExamplesTable datosCoberturas) {
        Map<String, String> dato = datosCoberturas.getRow(0);
        botonBorrar.click();
        waitUntil(1000);
        comboBoxLimite.clear();
        waitUntil(500);
        comboBoxLimite.sendKeys(dato.get("limite"));
        comboBoxLimite.sendKeys(Keys.ENTER);
        selectItem(comboBoxDeducible, dato.get("deducible"));
        selectItem(comboBoxAbogado, dato.get(("abogado")));
    }

    public void cotizar() {
        botonCotizar.click();
        botonBorrar.waitUntilPresent().click();
        waitFor(labelDetalles).shouldBePresent();
        waitUntil(500);
        menuItemCotizacion.click();
    }

    public void desMarcarCoberturas() {
        checkBoxDaniosCarro.click();
        checkBoxAsistencia.click();
        checkBoxHurto.click();
    }

    public void selectCoberturas(ExamplesTable coberturas) {
        Map<String, String> dato = coberturas.getRow(0);
        selectItem(comboBoxPerdidaTotalHurto,dato.get("PTH"));
        selectItem(comboBoxPerdidaParcialHurto,dato.get("PPH"));
        selectItem(comboBoxPerdidaParcialHurtoFranquisia,dato.get("PPHF"));
        selectItem(comboBoxGastosDeTransporte,dato.get("GTH"));
        checkBoxAccidentes.click();
        selectItem(comboBoxAccidentes,dato.get("AC"));
        selectItem(comboBoxAsistencia,dato.get("AS"));
        checkBoxTaller.click();
        selectItem(comboBoxTaller,dato.get("Taller"));
        checkBoxGrua.click();
        selectItem(comboBoxGrua,dato.get("Grua"));
        checkBoxCentroDeServicios.click();
        selectItem(comboBoxCentroDeServicios,dato.get("CS"));
        selectItem(comboBoxPerdidaTotalDaniosDeducible,dato.get("PTD"));
        selectItem(comboBoxPerdidaParcialDaniosDeducible,dato.get("PPD"));
        selectItem(comboBoxPerdidaParcialDaniosFranquicia,dato.get("PPDF"));
        selectItem(comboBoxGastosDeTransporteCarro,dato.get("GT"));
        checkBoxCarroDeReemplazo.click();
        selectItem(comboBoxPerdidaParcial,dato.get("PP"));
        selectItem(comboBoxPerdidaTotal,dato.get("PT"));
    }

    public void selectCoberturas2(ExamplesTable coberturas) {
        Map<String, String> dato = coberturas.getRow(0);
        checkBoxTallerMovil.click();
        selectItem(comboBoxTallerMovil,dato.get("TM"));
        checkBoxConductorElegido.click();
        selectItem(comboBoxConductorElegido,dato.get("CE"));
    }

    public void verificarTarifacion(String valor) {
        WebElementFacade tablaDescripcion = findBy(".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:costLV-body']/*/table/tbody/tr[1]/td[3]");
        MatcherAssert.assertThat("Error en el valor de la tarifacion", tablaDescripcion.containsText(valor));
    }


}
