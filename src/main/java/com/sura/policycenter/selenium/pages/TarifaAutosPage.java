package com.sura.policycenter.selenium.pages;

import com.sura.commons.selenium.Commons;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Map;
import java.util.concurrent.TimeUnit;


public class TarifaAutosPage extends Commons {
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver-btnInnerEl']")
    private WebElementFacade botonAgregarAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl']")
    private WebElementFacade botonCotizar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:RatingOverrideButtonDV:RatingOverrideButtonDV:ViewWorksheet']")
    private WebElementFacade botonMostrarHojaDeCalculo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver-btnInnerEl']")
    private WebElementFacade botonRelacionarAsegurado;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:WebMessageWorksheet_ClearButton']")
    private WebElementFacade botonBorrar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxDaniosCarro;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxHurto;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:0:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxAsistencia;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:2:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxGrua;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:1:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxTaller;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAccidentesDetailDV:0:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxAccidentes;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PACentroServiciosDetailDV:0:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxCentroDeServicios;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:3:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxTallerMovil;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:4:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxConductorElegido;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PACarroDeReemplazoDetailDV:0:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxCarroDeReemplazo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAGastosDetailDV:0:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxGastosTaspaso;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAGastosDetailDV:1:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxGAstosDeParqueadero;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:CoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxDeducible;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    private WebElementFacade campoTxtNombre;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxLimite;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:1:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxAbogado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxPerdidaTotalHurto;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxPerdidaParcialHurto;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:3:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxGastosDeTransporte;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxAsistencia;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:1:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxTaller;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:2:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxGrua;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAccidentesDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxAccidentes;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PACentroServiciosDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxCentroDeServicios;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxPerdidaTotalDaniosDeducible;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxPerdidaParcialDaniosDeducible;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:3:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxGastosDeTransporteCarro;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PACarroDeReemplazoDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxPerdidaParcial;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PACarroDeReemplazoDetailDV:0:CoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxPerdidaTotal;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:4:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxConductorElegido;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:TermType-inputEl']")
    private WebElementFacade comboBoxTipoPlazo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAGastosDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxGastosTraspaso;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAGastosDetailDV:1:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxgastosDeParqueadero;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV:0:numDocument']")
    private WebElementFacade itemdocNum;
    @FindBy(id = "SubmissionWizard:ViewQuote")
    private WebElementFacade menuItemCotizacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:PADrivers']")
    private WebElementFacade meniItemAsegurados;
    @FindBy(id = "SubmissionWizard:PolicyInfo")
    private WebElementFacade meniItemInformacionDePoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddExistingContact:1:UnassignedDriver-textEl']")
    private WebElementFacade navItemAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddExistingContact-textEl']")
    private WebElementFacade navItemContastosDeLaCuenta;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver:0:Driver']")
    private WebElementFacade navItemAseguradoR;
    private static final String TABLAXPATH = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:costLV-body']/*/table/tbody/tr[";


    public TarifaAutosPage(WebDriver driver) {
        super(driver);
    }


    public void cambiarTipoPlazo() {
        meniItemInformacionDePoliza.click();
        comboBoxTipoPlazo.waitUntilPresent().clear();
        selectItem(comboBoxTipoPlazo, "6 meses");
        waitForComboValue(comboBoxTipoPlazo, "6 meses");
    }


    public void cotizar() {
        botonCotizar.click();
        withTimeoutOf(28, TimeUnit.SECONDS).waitFor(botonMostrarHojaDeCalculo).shouldBePresent();
        waitUntil(500);
        menuItemCotizacion.waitUntilPresent().click();
    }


    public void desMarcarCoberturas() {
        checkBoxHurto.click();
    }


    public void relacionarAsegurado() {
        botonRelacionarAsegurado.click();
        navItemAseguradoR.click();
        itemdocNum.waitUntilPresent();
    }


    public void setAsegurados() {
        withTimeoutOf(28, TimeUnit.SECONDS).waitFor(meniItemAsegurados).waitUntilPresent().click();
        Actions actions = new Actions(getDriver());
        withTimeoutOf(28, TimeUnit.SECONDS).waitFor(botonAgregarAsegurado).waitUntilPresent().click();
        actions.moveToElement(navItemContastosDeLaCuenta).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        navItemAsegurado.click();
        campoTxtNombre.waitUntilPresent();
    }


    public void setCoberturas(ExamplesTable datosCoberturas) {
        Map<String, String> dato = datosCoberturas.getRow(0);
        botonBorrar.waitUntilPresent().click();
        botonBorrar.waitUntilNotVisible();
        waitUntil(1500);
        comboBoxLimite.waitUntilPresent();
        comboBoxLimite.clear();
        waitUntil(500);
        comboBoxLimite.sendKeys(dato.get("limite"));
        comboBoxLimite.sendKeys(Keys.ENTER);
        waitUntil(800);
        selectItem(comboBoxDeducible, dato.get("deducible"));
        selectItem(comboBoxAbogado, dato.get("abogado"));
    }


    public void seleccionarCoberturas(ExamplesTable coberturas) {
        Map<String, String> dato = coberturas.getRow(0);
        selectItem(comboBoxPerdidaTotalHurto, dato.get("PTH"));
        selectItem(comboBoxPerdidaParcialHurto, dato.get("PPH"));
        selectItem(comboBoxGastosDeTransporte, dato.get("GTH"));
        checkBoxAccidentes.click();
        selectItem(comboBoxAccidentes, dato.get("AC"));
        //checkBoxAsistencia.click();
        //selectItem(comboBoxAsistencia, dato.get("AS"));
        checkBoxDaniosCarro.click();
        selectItem(comboBoxPerdidaTotalDaniosDeducible, dato.get("PTD"));
        selectItem(comboBoxPerdidaParcialDaniosDeducible, dato.get("PPD"));
        selectItem(comboBoxGastosDeTransporteCarro, dato.get("GT"));
        checkBoxGastosTaspaso.click();
        selectItem(comboBoxGastosTraspaso, dato.get("GTR"));
        checkBoxGAstosDeParqueadero.click();
        selectItem(comboBoxgastosDeParqueadero, dato.get("GP"));
    }


    public void seleccionarCoberturas2(ExamplesTable coberturas) {
        Map<String, String> dato = coberturas.getRow(0);
        checkBoxTaller.click();
        selectItem(comboBoxTaller, dato.get("Taller"));
        checkBoxGrua.click();
        selectItem(comboBoxGrua, dato.get("Grua"));
        checkBoxCentroDeServicios.click();
        selectItem(comboBoxCentroDeServicios, dato.get("CS"));
        checkBoxCarroDeReemplazo.click();
        selectItem(comboBoxPerdidaParcial, dato.get("PP"));
        selectItem(comboBoxPerdidaTotal, dato.get("PT"));
    }


    public void seleccionarCoberturas3(ExamplesTable coberturas) {
        Map<String, String> dato = coberturas.getRow(0);
        checkBoxTallerMovil.click();
        checkBoxConductorElegido.click();
        selectItem(comboBoxConductorElegido, dato.get("CE"));
    }


    public void verificarTarifacion(String valor) {
        WebElementFacade tablaDescripcion = findBy(TABLAXPATH + "1]/td[3]");
        MatcherAssert.assertThat("Error en el valor de la tarifacion Expected: " + valor + " But was: " + tablaDescripcion.getText(), tablaDescripcion.containsText(valor));
    }


    public void verificarTarifacionPorCoberturas(ExamplesTable valores) {
        for (Map<String, String> valor : valores.getRows()) {
            WebElementFacade tablaDescripcion = findBy(TABLAXPATH + valor.get("fila") + "]/td[3]");
            WebElementFacade cobertura = findBy(TABLAXPATH + valor.get("fila") + "]/td[1]");
            MatcherAssert.assertThat("Error en el valor de la cobertura '" + valor.get("fila") + " - " +
                            cobertura.getText() + "' de la tarifacion Expected: " + valor + " But was: " + tablaDescripcion.getText(), tablaDescripcion.containsText(valor.get("valor")));
        }
    }
}
