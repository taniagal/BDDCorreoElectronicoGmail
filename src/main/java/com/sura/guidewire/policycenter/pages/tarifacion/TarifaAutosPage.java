package com.sura.guidewire.policycenter.pages.tarifacion;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.StepInterceptor;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.TimeUnit;


public class TarifaAutosPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver-btnInnerEl']")
    private WebElementFacade botonAgregarAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:JobWizardToolbarButtonSet:QuoteOrReview']")
    private WebElementFacade botonCotizar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:RatingOverrideButtonDV:RatingOverrideButtonDV:ViewWorksheet']")
    private WebElementFacade botonMostrarHojaDeCalculo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver-btnInnerEl']")
    private WebElementFacade botonRelacionarAsegurado;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:WebMessageWorksheet_ClearButton']")
    private WebElementFacade botonBorrar;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade botonBuscar;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:ContactSearchResultsLV:0:_Select']")
    private WebElementFacade botonSeleccionar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    private WebElementFacade campoTxtNombre;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:identificationNumber-inputEl']")
    private WebElementFacade campoTxtNumeroDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:_checkbox']")
    private WebElementFacade checkBoxDaniosCarro;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:_checkbox']")
    private WebElementFacade checkBoxHurto;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAccidentesDetailDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:_checkbox']")
    private WebElementFacade checkBoxAccidentes;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:_checkbox']")
    private WebElementFacade checkBoxTaller;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:1:SuraPACoverageInputSet:CovPatternSubmitInputGroup:_checkbox']")
    private WebElementFacade checkBoxGrua;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:2:SuraPACoverageInputSet:CovPatternSubmitInputGroup:_checkbox']")
    private WebElementFacade checkBoxTallerMovil;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:3:SuraPACoverageInputSet:CovPatternSubmitInputGroup:_checkbox']")
    private WebElementFacade checkBoxConductorElegido;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PACentroServiciosDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxCentroDeServicios;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PACarroDeReemplazoDetailDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:_checkbox']")
    private WebElementFacade checkBoxCarroDeReemplazo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAGastosDetailDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:_checkbox']")
    private WebElementFacade checkBoxGastosTaspaso;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAGastosDetailDV:1:SuraPACoverageInputSet:CovPatternSubmitInputGroup:_checkbox']")
    private WebElementFacade checkBoxGAstosDeParqueadero;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:1:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxDeducible;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:0:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxLimite;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:1:SuraPACoverageInputSet:CovPatternInputGroup:0:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxAbogado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:0:SuraPACovTermInputSet:SubmitOptionTermInput-inputEl']")
    private WebElementFacade comboBoxPerdidaTotalHurto;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:1:SuraPACovTermInputSet:SubmitOptionTermInput-inputEl']")
    private WebElementFacade comboBoxPerdidaParcialHurto;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:2:SuraPACovTermInputSet:SubmitOptionTermInput-inputEl']")
    private WebElementFacade comboBoxGastosDeTransporteHurto;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAccidentesDetailDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:0:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxAccidentes;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PALlavesDetailDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:0:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxPerdidaDeLlaves;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:0:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxTaller;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:1:SuraPACoverageInputSet:CovPatternSubmitInputGroup:0:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxGrua;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:2:SuraPACoverageInputSet:CovPatternSubmitInputGroup:0:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxTallerMovil;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PACentroServiciosDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:0:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxCentroDeServicios;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:0:SuraPACovTermInputSet:SubmitOptionTermInput-inputEl']")
    private WebElementFacade comboBoxPerdidaTotalDaniosDeducible;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:1:SuraPACovTermInputSet:SubmitOptionTermInput-inputEl']")
    private WebElementFacade comboBoxPerdidaParcialDaniosDeducible;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:2:SuraPACovTermInputSet:SubmitOptionTermInput-inputEl']")
    private WebElementFacade comboBoxGastosDeTransporteCarro;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PACarroDeReemplazoDetailDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:1:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxCarroDeReemplazoPerdidaTotal;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:3:SuraPACoverageInputSet:CovPatternSubmitInputGroup:0:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxConductorElegido;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAGastosDetailDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:0:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxGastosTraspaso;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAGastosDetailDV:1:SuraPACoverageInputSet:CovPatternSubmitInputGroup:0:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxgastosDeParqueadero;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:DocumentType-inputEl']")
    private WebElementFacade comboBoxTipoDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV:0:numDocument']")
    private WebElementFacade itemdocNum;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:3:SuraPACovTermInputSet:SubmitOptionTermInput-labelEl']")
    private WebElementFacade labelGatosTransporte;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:3:SuraPACovTermInputSet:SubmitOptionTermInput-labelEl']")
    private WebElementFacade labelGatosTransporteCarro;
    @FindBy(id = "SubmissionWizard:ViewQuote")
    private WebElementFacade menuItemCotizacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:PADrivers']")
    private WebElementFacade meniItemAsegurados;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddFromSearch']")
    private WebElementFacade menuItemDelDireciotio;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver:0:Driver']")
    private WebElementFacade menuItemAseguradoR;


    private static final String TABLAXPATH = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:costLV-body']/*/table/tbody/tr[";
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    public TarifaAutosPage(WebDriver driver) {
        super(driver);
    }


    public void desMarcarCoberturaHurto() {
        checkBoxHurto.click();
        comboBoxPerdidaTotalHurto.waitUntilNotVisible();
        checkBoxDaniosCarro.click();
        comboBoxPerdidaTotalDaniosDeducible.waitUntilNotVisible();
    }


    public void cotizar() {
        botonCotizar.click();
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(botonMostrarHojaDeCalculo).shouldBePresent();
        waitUntil(WAIT_TIME_500);
        menuItemCotizacion.waitUntilPresent().click();
    }


    public void relacionarAsegurado() {
        botonRelacionarAsegurado.waitUntilPresent();
        botonRelacionarAsegurado.click();
        menuItemAseguradoR.click();
        itemdocNum.waitUntilPresent();
    }


    public void seleccionarAsegurado(String tipoDocumento, String documento) {
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(meniItemAsegurados).waitUntilPresent().click();
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(botonAgregarAsegurado).waitUntilPresent().click();
        menuItemDelDireciotio.waitUntilPresent().click();
        comboBoxTipoDocumento.waitUntilPresent().clear();
        waitUntil(WAIT_TIME_300);
        comboBoxTipoDocumento.sendKeys(tipoDocumento);
        comboBoxTipoDocumento.sendKeys(Keys.ENTER);
        waitUntil(WAIT_TIME_800);
        botonBuscar.waitUntilPresent();
        campoTxtNumeroDocumento.sendKeys(documento);
        botonBuscar.click();
        botonSeleccionar.waitUntilPresent().click();
        campoTxtNombre.waitUntilPresent();
    }


    public void seleccionarCoberturas(ExamplesTable datosCoberturas) {
        Map<String, String> dato = datosCoberturas.getRow(0);
        setImplicitTimeout(WAIT_TIME_10, TimeUnit.SECONDS);
        if (botonBorrar.isPresent()) {
            botonBorrar.waitUntilPresent().click();
            botonBorrar.waitUntilNotVisible();
        }
        resetImplicitTimeout();
        comboBoxLimite.waitUntilPresent();
        waitUntil(WAIT_TIME_1500);
        comboBoxLimite.clear();
        waitUntil(WAIT_TIME_500);
        comboBoxLimite.sendKeys(dato.get("limite"));
        comboBoxLimite.sendKeys(Keys.ENTER);
        waitUntil(WAIT_TIME_800);
        selectItem(comboBoxDeducible, dato.get("deducible"));
        selectItem(comboBoxAbogado, dato.get("abogado"));
        selectItem(comboBoxPerdidaDeLlaves, dato.get("PLlaves"));
    }


    public void seleccionarCoberturas1(ExamplesTable coberturas) {
        Map<String, String> dato = coberturas.getRow(0);
        selectItem(comboBoxPerdidaTotalHurto, dato.get("PTH"));
        labelGatosTransporte.waitUntilPresent();
        selectItem(comboBoxPerdidaParcialHurto, dato.get("PPH"));
        selectItem(comboBoxGastosDeTransporteHurto, dato.get("GTH"));
        waitForComboValue(comboBoxGastosDeTransporteHurto, dato.get("GTH"));
        clickElement(checkBoxAccidentes);
        selectItem(comboBoxAccidentes, dato.get("AC"));
        checkBoxGastosTaspaso.click();
        selectItem(comboBoxGastosTraspaso, dato.get("GTR"));
        checkBoxGAstosDeParqueadero.click();
        selectItem(comboBoxgastosDeParqueadero, dato.get("GP"));
    }


    public void seleccionarCoberturasDeDanios(ExamplesTable coberturas) {
        Map<String, String> dato = coberturas.getRow(0);
        selectItem(comboBoxPerdidaTotalDaniosDeducible, dato.get("PTD"));
        if (!comboBoxGastosDeTransporteCarro.isPresent()) {
            labelGatosTransporteCarro.waitUntilPresent();
        }
        selectItem(comboBoxPerdidaParcialDaniosDeducible, dato.get("PPD"));
        selectItem(comboBoxGastosDeTransporteCarro, dato.get("GT"));
        waitForComboValue(comboBoxGastosDeTransporteCarro, dato.get("GT"));
    }


    public void seleccionarCoberturas2(ExamplesTable coberturas) {
        Map<String, String> dato = coberturas.getRow(0);
        clickElement(checkBoxTaller);
        selectItem(comboBoxTaller, dato.get("Taller"));
        checkBoxGrua.click();
        selectItem(comboBoxGrua, dato.get("Grua"));
        checkBoxTallerMovil.click();
        selectItem(comboBoxTallerMovil, dato.get("TM"));
        checkBoxCentroDeServicios.click();
        selectItem(comboBoxCentroDeServicios, dato.get("CS"));
        checkBoxCarroDeReemplazo.click();
        selectItem(comboBoxCarroDeReemplazoPerdidaTotal, dato.get("PT"));
    }


    public void seleccionarCoberturas3(ExamplesTable coberturas) {
        Map<String, String> dato = coberturas.getRow(0);
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
            LOGGER.info(valor.get("valor") + " | " + tablaDescripcion.getText());
        }

        for (Map<String, String> valor : valores.getRows()) {
            WebElementFacade tablaDescripcion = findBy(TABLAXPATH + valor.get("fila") + "]/td[3]");
            WebElementFacade cobertura = findBy(TABLAXPATH + valor.get("fila") + "]/td[1]");
            MatcherAssert.assertThat("Error en el valor de la cobertura '" + valor.get("fila") + " - " +
                    cobertura.getText() + "' de la tarifacion Expected: " + valor + " But was: " + tablaDescripcion.getText(), tablaDescripcion.containsText(valor.get("valor")));
        }
    }
}
