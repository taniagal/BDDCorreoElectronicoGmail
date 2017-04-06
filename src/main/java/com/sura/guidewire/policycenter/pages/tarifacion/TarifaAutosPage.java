package com.sura.guidewire.policycenter.pages.tarifacion;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.Map;
import java.util.concurrent.TimeUnit;


public class TarifaAutosPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver-btnInnerEl']")
    private WebElementFacade botonAgregarAsegurado;
    @FindBy(xpath = ".//a[contains(.,'Cotizar')]")
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
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:AgreedCommission-inputEl']")
    private WebElementFacade campoTxtComisionPactada;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:TotalPremium-inputEl']")
    private WebElementFacade campoPrimaTotal;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:Taxes-inputEl']")
    private WebElementFacade campoIva;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:TotalCost-inputEl']")
    private WebElementFacade campoCostoTotal;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:identificationNumber-inputEl']")
    private WebElementFacade campoTxtNumeroDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxDaniosCarro;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxHurto;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAccidentesDetailDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:_checkbox']")
    private WebElementFacade checkBoxAccidentes;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:0:SuraPACoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxAsistencia;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:_checkbox']")
    private WebElementFacade checkBoxTaller;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:1:SuraPACoverageInputSet:CovPatternInputGroup:_checkbox']")
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
    @FindBy(xpath = ".//*[contains(@id, 'Wizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:1:SuraPACovTermInputSet:OptionTermInput-inputEl')]")
    private WebElementFacade comboBoxDeducible;
    @FindBy(xpath = ".//*[contains(@id, 'Wizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:0:SuraPACovTermInputSet:OptionTermInput-inputEl')]")
    private WebElementFacade comboBoxLimite;
    @FindBy(xpath = ".//*[contains(@id, 'Wizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:1:SuraPACoverageInputSet:CovPatternInputGroup:0:SuraPACovTermInputSet:OptionTermInput-inputEl')]")
    private WebElementFacade comboBoxAbogado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:0:SuraPACovTermInputSet:SubmitOptionTermInput-inputEl']")
    private WebElementFacade comboBoxPerdidaTotalHurto;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:1:SuraPACovTermInputSet:SubmitOptionTermInput-inputEl']")
    private WebElementFacade comboBoxPerdidaParcialHurto;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:2:SuraPACovTermInputSet:SubmitOptionTermInput-inputEl']")
    private WebElementFacade comboBoxGastosDeTransporteHurto;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAccidentesDetailDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:0:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxAccidentes;
    @FindBy(xpath = ".//*[contains(@id,'Wizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PALlavesDetailDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:0:SuraPACovTermInputSet:OptionTermInput-inputEl')]")
    private WebElementFacade comboBoxPerdidaDeLlaves;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:0:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxTaller;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:1:SuraPACoverageInputSet:CovPatternInputGroup:0:SuraPACovTermInputSet:SubmitOptionTermInput-inputEl']")
    private WebElementFacade comboBoxGrua;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:2:SuraPACoverageInputSet:CovPatternSubmitInputGroup:0:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxTallerMovil;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PACentroServiciosDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:0:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxCentroDeServicios;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:0:SuraPACovTermInputSet:SubmitOptionTermInput-inputEl']")
    private WebElementFacade comboBoxPerdidaTotalDaniosDeducible;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:1:SuraPACovTermInputSet:SubmitOptionTermInput-inputEl']")
    private WebElementFacade comboBoxPerdidaParcialDaniosDeducible;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:3:SuraPACovTermInputSet:SubmitOptionTermInput-inputEl']")
    private WebElementFacade comboBoxGastosDeTransporteDanos;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:4:SuraPACovTermInputSet:SubmitOptionTermInput-inputEl']")
    private WebElementFacade comboBoxGastosDeTransporteDanos1;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:2:SuraPACovTermInputSet:SubmitOptionTermInput-inputEl']")
    private WebElementFacade comboBoxGastosDeTransporteCarro;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PACarroDeReemplazoDetailDV:0:SuraPACoverageInputSet:CovPatternSubmitInputGroup:0:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxCarroDeReemplazoPerdidaParcial;
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
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAAsistenciaDV:0:SuraPACoverageInputSet:CovPatternInputGroup:0:SuraPACovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxAsistencia;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:0_header_hd-textEl']")
    private WebElementFacade headerEnvio;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV:0:numDocument']")
    private WebElementFacade itemdocNum;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:3:SuraPACovTermInputSet:SubmitOptionTermInput-inputEl']")
    private WebElementFacade labelGatosTransporte;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PADanosAlCarroGrpDetailDV:0:SuraPACoverageInputSet:CovPatternInputGroup:3:SuraPACovTermInputSet:SubmitOptionTermInput-labelEl']")
    private WebElementFacade labelGatosTransporteCarro;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:PADrivers']")
    private WebElementFacade menuItemAsegurados;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddFromSearch']")
    private WebElementFacade menuItemDelDireciotio;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver:0:Driver']")
    private WebElementFacade menuItemAseguradoR;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:StandardCommissionCB_true-inputEl']")
    private WebElementFacade radioBotonComisionPactadaSi;

    private static final String TABLAXPATH = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:costLV-body']/*/table/tbody/tr[";
    private static final String STALE_ELEMENT_REFERENCE_EXCEPTION = "StaleElementReferenceException ";

    public TarifaAutosPage(WebDriver driver) {
        super(driver);
    }


    public void marcarCoberturaAccidentes(String hurto) {
        seleccionarItem(comboBoxPerdidaTotalHurto, hurto);
        clickearElemento(checkBoxAccidentes);
    }

    public void desMarcarCoberturas() {
        clickearElemento(checkBoxHurto);
        comboBoxPerdidaTotalHurto.waitUntilNotVisible();
        checkBoxDaniosCarro.click();
        comboBoxPerdidaTotalDaniosDeducible.waitUntilNotVisible();
    }

    public void cotizar() {
        intentarCotizar();
        waitForTextToAppear("Cotización");
    }

    public void intentarCotizar() {
        try {
            clickearElemento(botonCotizar);
        } catch (ElementNotVisibleException e) {
            LOGGER.info("ElementNotVisibleException " + e);
            esperarHasta(TIEMPO_2000);
            clickearElemento(botonCotizar);
        }
    }

    public void relacionarAsegurado() {
        botonRelacionarAsegurado.waitUntilPresent();
        botonRelacionarAsegurado.click();
        menuItemAseguradoR.click();
        itemdocNum.waitUntilPresent();
    }

    public void agregarAsegurado(String tipoDocumento, String documento) {
        esCambioDePoliza();
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(menuItemAsegurados).waitUntilPresent();
        clickearElemento(menuItemAsegurados);
        setImplicitTimeout(TIEMPO_2, TimeUnit.SECONDS);
        if ($(".message").isPresent()) {
            clickearElemento(menuItemAsegurados);
        }
        resetImplicitTimeout();
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(botonAgregarAsegurado).waitUntilPresent().click();
        menuItemDelDireciotio.waitUntilPresent().click();
        seleccionarAsegurado(tipoDocumento, documento);
        campoTxtNombre.waitUntilPresent();
    }

    public void esCambioDePoliza() {
        setImplicitTimeout(0, TimeUnit.SECONDS);
        if (headerEnvio.isPresent()) {
            menuItemAsegurados = $(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PADrivers']");
            botonAgregarAsegurado = $(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver']");
            menuItemDelDireciotio = $(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddFromSearch']");
            campoTxtNombre = $(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl']");
        }
        resetImplicitTimeout();
    }

    public void seleccionarAsegurado(String tipoDocumento, String documento) {
        comboBoxTipoDocumento.waitUntilPresent().clear();
        esperarHasta(TIEMPO_300);
        comboBoxTipoDocumento.sendKeys(tipoDocumento);
        comboBoxTipoDocumento.sendKeys(Keys.ENTER);
        esperarHasta(TIEMPO_800);
        try {
            botonBuscar.waitUntilPresent();
            ingresarDato(campoTxtNumeroDocumento, documento);
        } catch (StaleElementReferenceException e) {
            LOGGER.info(STALE_ELEMENT_REFERENCE_EXCEPTION + e);
            esperarHasta(TIEMPO_2000);
            ingresarDato(campoTxtNumeroDocumento, documento);
        } catch (ElementNotVisibleException f) {
            LOGGER.info(STALE_ELEMENT_REFERENCE_EXCEPTION + f);
            esperarHasta(TIEMPO_2000);
            ingresarDato(campoTxtNumeroDocumento, documento);
        }
        clickearElemento(botonBuscar);
        seleccionarAseguradoEncontrado(documento);
    }

    public void seleccionarAseguradoEncontrado(String documento) {
        setImplicitTimeout(TIEMPO_10, TimeUnit.SECONDS);
        if (botonSeleccionar.isPresent()) {
            botonSeleccionar.click();
        } else {
            resetImplicitTimeout();
            campoTxtNumeroDocumento.sendKeys(documento);
            clickearElemento(botonBuscar);
            botonSeleccionar.click();
        }
        resetImplicitTimeout();
    }

    public void seleccionarCoberturasBasica(ExamplesTable datosCoberturas) {
        Map<String, String> dato = datosCoberturas.getRow(0);
        seleccionarCoberturasRC(datosCoberturas);
        if (!dato.get("abogado").isEmpty() && !comboBoxAbogado.getValue().equals(dato.get("abogado"))) {
            seleccionarItem(comboBoxAbogado, dato.get("abogado"));
        }
    }

    public void seleccionarCoberturasRC(ExamplesTable datosCoberturas) {
        Map<String, String> dato = datosCoberturas.getRow(0);
        esperarPorPantallaCoberturas();
        seleccionarItem(comboBoxLimite, dato.get("limite"));
        seleccionarItem(comboBoxDeducible, dato.get("deducible"));
        setImplicitTimeout(TIEMPO_2, TimeUnit.SECONDS);
        if (comboBoxAsistencia.isVisible() && !dato.get("AS").isEmpty()) {
            seleccionarCoberturaAsistencia(dato.get("AS"));
        }
        resetImplicitTimeout();
    }

    public void esperarPorPantallaCoberturas() {
        waitForTextToAppear("Coberturas");
        comboBoxLimite.waitUntilVisible();
        clickearElemento(comboBoxLimite);
        setImplicitTimeout(0, TimeUnit.SECONDS);
        if (botonBorrar.isPresent()) {
            clickearElemento(botonBorrar);
            botonBorrar.waitUntilNotVisible();
        }
        resetImplicitTimeout();
    }

    public void seleccionarPerdidaDeLlaves(String llaves) {
        if (!llaves.isEmpty() && !llaves.equals(comboBoxPerdidaDeLlaves.getValue())) {
            seleccionarItem(comboBoxPerdidaDeLlaves, llaves);
        }
    }


    public void seleccionarCoberturas1(ExamplesTable coberturas) {
        Map<String, String> dato = coberturas.getRow(0);
        seleccionarCoberturasHurto(coberturas);
        seleccionarCoberturasHurto2(coberturas);
        setImplicitTimeout(TIEMPO_1, TimeUnit.SECONDS);
        if (comboBoxAccidentes.isVisible()) {
            seleccionarItem(comboBoxAccidentes, dato.get("AC"));
        } else {
            seleccionarCobertura(checkBoxAccidentes, comboBoxAccidentes, dato.get("AC"));
        }
        if (comboBoxGastosTraspaso.isVisible()) {
            seleccionarItem(comboBoxGastosTraspaso, dato.get("GTR"));
        } else {
            seleccionarCobertura(checkBoxGastosTaspaso, comboBoxGastosTraspaso, dato.get("GTR"));
        }
        if (comboBoxgastosDeParqueadero.isVisible()) {
            seleccionarItem(comboBoxgastosDeParqueadero, dato.get("GP"));
        } else {
            seleccionarCobertura(checkBoxGAstosDeParqueadero, comboBoxgastosDeParqueadero, dato.get("GP"));
        }
        resetImplicitTimeout();
    }

    public void seleccionarCoberturasHurto(ExamplesTable coberturas) {
        Map<String, String> dato = coberturas.getRow(0);
        seleccionarItem(comboBoxPerdidaTotalHurto, dato.get("PTH"));
        try {
            withTimeoutOf(TIEMPO_1, TimeUnit.SECONDS).waitFor(labelGatosTransporte);
        } catch (StaleElementReferenceException e) {
            LOGGER.info(STALE_ELEMENT_REFERENCE_EXCEPTION + e);
            labelGatosTransporte.waitUntilPresent();
        } catch (TimeoutException f) {
            LOGGER.info("TimeoutException " + f);
        }
    }

    public void seleccionarCoberturaHurtoTotal(ExamplesTable coberturas) {
        Map<String, String> dato = coberturas.getRow(0);
        seleccionarItem(comboBoxPerdidaTotalHurto, dato.get("PTH"));
        seleccionarItem(comboBoxPerdidaParcialHurto, dato.get("PPH"));
        seleccionarItem(labelGatosTransporte, dato.get("GTH"));
    }

    public void seleccionarCoberturaDanoTotal(ExamplesTable coberturas) {
        Map<String, String> dato = coberturas.getRow(0);
        seleccionarItem(comboBoxPerdidaTotalDaniosDeducible, dato.get("PTD"));
        seleccionarItem(comboBoxPerdidaParcialDaniosDeducible, dato.get("PPD"));
        seleccionarItem(comboBoxGastosDeTransporteCarro, dato.get("GTD"));
    }

    public void seleccionarCoberturasHurto1(ExamplesTable coberturas) {
        Map<String, String> dato = coberturas.getRow(0);
        seleccionarItem(comboBoxPerdidaParcialHurto, dato.get("PPH"));
        seleccionarItem(comboBoxGastosDeTransporteHurto, dato.get("GTH"));
        esperarPorValor(comboBoxGastosDeTransporteHurto, dato.get("GTH"));
        seleccionarPerdidaDeLlaves(dato.get("PLlaves"));
    }

    public void seleccionarCoberturasHurto2(ExamplesTable coberturas) {
        Map<String, String> dato = coberturas.getRow(0);
        seleccionarItem(labelGatosTransporte, dato.get("GTH"));
        seleccionarPerdidaDeLlaves(dato.get("PLlaves"));
    }


    public void seleccionarCoberturasDanios(ExamplesTable coberturas) {
        Map<String, String> dato = coberturas.getRow(0);
        seleccionarItem(comboBoxPerdidaTotalDaniosDeducible, dato.get("PTD"));
        try {
            if (!comboBoxGastosDeTransporteCarro.isPresent()) {
                labelGatosTransporteCarro.waitUntilPresent();
            }
        } catch (StaleElementReferenceException e) {
            LOGGER.info(STALE_ELEMENT_REFERENCE_EXCEPTION, e);
            esperarHasta(TIEMPO_2000);
            if (!comboBoxGastosDeTransporteCarro.isPresent()) {
                labelGatosTransporteCarro.waitUntilPresent();
            }
        }
    }

    public void seleccionarCoberturasDanios1(ExamplesTable coberturas) {
        Map<String, String> dato = coberturas.getRow(0);
        seleccionarItem(comboBoxPerdidaParcialDaniosDeducible, dato.get("PPD"));
        seleccionarItem(comboBoxGastosDeTransporteCarro, dato.get("GT"));
        seleccionarPerdidaDeLlaves(dato.get("PLlaves"));
    }

    public void seleccionarCoberturasDanios2(ExamplesTable coberturas) {
        Map<String, String> dato = coberturas.getRow(0);
        seleccionarItem(comboBoxPerdidaParcialDaniosDeducible, dato.get("PPD"));
        seleccionarItem(comboBoxGastosDeTransporteDanos, dato.get("GT"));
        seleccionarPerdidaDeLlaves(dato.get("PLlaves"));
    }


    public void seleccionarCoberturas2(ExamplesTable coberturas) {
        Map<String, String> dato = coberturas.getRow(0);
        seleccionarCobertura(checkBoxTaller, comboBoxTaller, dato.get("Taller"));
        seleccionarCobertura(checkBoxGrua, comboBoxGrua, dato.get("Grua"));
        seleccionarCobertura(checkBoxTallerMovil, comboBoxTallerMovil, dato.get("TM"));
        seleccionarCobertura(checkBoxCentroDeServicios, comboBoxCentroDeServicios, dato.get("CS"));
        setImplicitTimeout(TIEMPO_3, TimeUnit.SECONDS);
        if (comboBoxCarroDeReemplazoPerdidaTotal.isVisible()) {
            seleccionarItem(comboBoxCarroDeReemplazoPerdidaTotal, dato.get("CRPT"));
        } else {
            seleccionarCobertura(checkBoxCarroDeReemplazo, comboBoxCarroDeReemplazoPerdidaTotal, dato.get("CRPT"));
        }
        resetImplicitTimeout();
    }


    public void seleccionarCoberturas3(ExamplesTable coberturas) {
        Map<String, String> dato = coberturas.getRow(0);
        seleccionarCobertura(checkBoxConductorElegido, comboBoxConductorElegido, dato.get("CE"));
    }


    public void verificarTarifacion(String valor) {
        WebElementFacade tablaDescripcion = findBy(TABLAXPATH + "1]/td[3]");
        String tarifa = tablaDescripcion.getText().substring(CONSTANTE_1, tablaDescripcion.getText().length() - CONSTANTE_6);
        MatcherAssert.assertThat("Error en el valor de la tarifacion Expected: " + valor + " But was: " +
                tarifa, tarifa.equals(valor));
    }

    public void seleccionarCoberturasCorbeta(ExamplesTable coberturas) {
        Map<String, String> dato = coberturas.getRow(0);
        seleccionarItem(comboBoxPerdidaTotalHurto, dato.get("PTH"));
        seleccionarItem(comboBoxPerdidaTotalDaniosDeducible, dato.get("PTD"));
        setImplicitTimeout(TIEMPO_2, TimeUnit.SECONDS);
        if (!"null".equals(dato.get("AC"))) {
            if (comboBoxAccidentes.isVisible()) {
                seleccionarItem(comboBoxAccidentes, dato.get("AC"));
            } else {
                seleccionarCobertura(checkBoxAccidentes, comboBoxAccidentes, dato.get("AC"));
            }
            seleccionarCoberturaAsistencia(dato.get("AS"));
        } else {
            if (comboBoxAccidentes.isVisible()) {
                clickearElemento(checkBoxAccidentes);
            }
            if (comboBoxAsistencia.isVisible()) {
                clickearElemento(checkBoxAsistencia);
            }
        }
        resetImplicitTimeout();
    }

    public void verificarTarifacionTotal(String primaTotal, String iva, String costoTotal) {
        campoPrimaTotal.waitUntilPresent();
        String substringPrima = campoPrimaTotal.getText().substring(CONSTANTE_1, campoPrimaTotal.getText().length() - CONSTANTE_6);
        String substringIva = campoIva.getText().substring(CONSTANTE_1, campoIva.getText().length() - CONSTANTE_6);
        String substringCostoTotal = campoCostoTotal.getText().substring(CONSTANTE_1, campoCostoTotal.getText().length() - CONSTANTE_6);
        MatcherAssert.assertThat("Error en el valor de la prima, expected: " + primaTotal + " but was: " +
                substringPrima, substringPrima.equals(primaTotal));
        MatcherAssert.assertThat("Error en el valor del iva, expected: " + iva + " but was: " +
                substringIva, substringIva.equals(iva));
        MatcherAssert.assertThat("Error en el valor del costo total, expected: " + costoTotal + " but was: " +
                substringCostoTotal, substringCostoTotal.equals(costoTotal));
    }

    public void verificarCoberturasVehiculoSustituto(ExamplesTable datosCoberturaVehiculo) {
        Map<String, String> coberturaVehiculo = datosCoberturaVehiculo.getRow(0);
        MatcherAssert.assertThat("Error, el campo valor Limite es Incorrecto", comboBoxLimite.getValue(), Is.is(Matchers.equalTo(coberturaVehiculo.get("limite"))));
        MatcherAssert.assertThat("Error, el campo Deducible es Incorrecto", comboBoxDeducible.getValue(), Is.is(Matchers.equalTo(coberturaVehiculo.get("deducible"))));
        MatcherAssert.assertThat("Error, el campo Abogado es Incorrecto", comboBoxAbogado.getValue(), Is.is(Matchers.equalTo(coberturaVehiculo.get("abogado"))));
    }

    public void verificarDependenciaDeCobertura() {
        MatcherAssert.assertThat("Error, la cobertura de accidentes al conductor no se encuentra presente.", comboBoxAccidentes.isPresent());
    }

    public void seleccionarCobertura(WebElementFacade checkBox, WebElementFacade comboBox, String dato) {
        clickearElemento(checkBox);
        seleccionarItem(comboBox, dato);
    }

    public void ingresarComisionPactada(String valor) {
        radioBotonComisionPactadaSi.click();
        campoTxtComisionPactada.waitUntilPresent().sendKeys(valor);
    }

    public void seleccionarAsistenciaYCarroDeReemplazo(ExamplesTable coberturas) {
        Map<String, String> dato = coberturas.getRow(0);
        seleccionarCoberturaAsistencia(dato.get("AS"));
        seleccionarCoberturaCarroDeReemplazo(dato.get("CRPT"), dato.get("CRPP"));
    }

    public void verificarTarifacionPrima(String primaTotal) {
        campoPrimaTotal.waitUntilPresent();
        String prima = campoPrimaTotal.getText().substring(CONSTANTE_1, campoPrimaTotal.getText().length() - CONSTANTE_6);
        MatcherAssert.assertThat("Error en el valor de la prima, expected: " + primaTotal + " but was: " +
                prima, prima.equals(primaTotal));
    }

    public void marcarOpcionDanos(String danos) {
        seleccionarItem(comboBoxPerdidaTotalHurto, OPCION_SIN_VALOR);
        seleccionarItem(comboBoxPerdidaTotalDaniosDeducible, danos);
        clickearElemento(checkBoxAccidentes);
    }

    public void seleccionarCoberturaAsistencia(String asistencia) {
        setImplicitTimeout(TIEMPO_3, TimeUnit.SECONDS);
        if (comboBoxAsistencia.isVisible()) {
            seleccionarItem(comboBoxAsistencia, asistencia);
        } else {
            seleccionarCobertura(checkBoxAsistencia, comboBoxAsistencia, asistencia);
        }
        resetImplicitTimeout();
    }

    public void seleccionarCoberturaCarroDeReemplazo(String carroReemplazoPerdidaTotal, String carroReemplazoPerdidaParcial) {
        setImplicitTimeout(TIEMPO_3, TimeUnit.SECONDS);
        if (comboBoxCarroDeReemplazoPerdidaTotal.isVisible()) {
            seleccionarItem(comboBoxCarroDeReemplazoPerdidaTotal, carroReemplazoPerdidaTotal);
            seleccionarItem(comboBoxCarroDeReemplazoPerdidaParcial, carroReemplazoPerdidaParcial);
        } else {
            seleccionarCobertura(checkBoxCarroDeReemplazo, comboBoxCarroDeReemplazoPerdidaTotal, carroReemplazoPerdidaTotal);
            seleccionarItem(comboBoxCarroDeReemplazoPerdidaParcial, carroReemplazoPerdidaParcial);
        }
        resetImplicitTimeout();
    }
}
