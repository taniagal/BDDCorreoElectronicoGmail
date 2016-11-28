package com.sura.guidewire.policycenter.pages.tarifacion;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class TarifaTasaUnicaPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:Spreadsheet-btnInnerEl']")
    private WebElementFacade botonHojaDeCalculo;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:Spreadsheet']")
    private WebElementFacade botonHojaDeCalculoRenovacion;
    @FindBy(xpath = ".//*[@id='ExcelExportPopup:ExportAsynchronouslyButton']")
    private WebElementFacade botonExportarAHojaDeCalculo;
    @FindBy(xpath = ".//*[@id='StartPolicyChange:StartPolicyChangeScreen:NewPolicyChange']")
    private WebElementFacade botonSiguienteCambioDePoliza;
    @FindBy(xpath = ".//*[@id='ExcelImportFilePopup:ImportButton']")
    private WebElementFacade botonImportar;
    @FindBy(xpath = ".//span[contains(.,'Aceptar')]")
    private WebElementFacade botonAceptar;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:JobWizardToolbarButtonSet:QuoteOrReview']")
    private WebElementFacade botonCotizar;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:JobWizardToolbarButtonSet:RenewalQuote']")
    private WebElementFacade botonCotizarRenovacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:JobWizardToolbarButtonSet:QuoteOrReview']")
    private WebElementFacade botonCotizarAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:Spreadsheet:Export-textEl']")
    private WebElementFacade menuItemExportar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:Spreadsheet:Import-textEl']")
    private WebElementFacade menuItemImportar;
    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab']")
    private WebElementFacade menuPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:WizardMenuActions']")
    private WebElementFacade menuAccionesEnvio;
    @FindBy(xpath = ".//*[@id='PolicyFile:PolicyFileMenuActions']")
    private WebElementFacade menuAccionesPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Goto:WizardMenuActions_ToPolicyFile']")
    private WebElementFacade menuItemArchivoDePoliza;
    @FindBy(xpath = ".//*[@id='PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_NewWorkOrder:PolicyFileMenuActions_ChangePolicy']")
    private WebElementFacade menuItemCambiarPoliza;
    @FindBy(xpath = ".//*[@id='PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_NewWorkOrder:PolicyFileMenuActions_RenewPolicy']")
    private WebElementFacade menuItemRenovarPoliza;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PersonalVehicles']/div")
    private WebElementFacade menuItemVehiculos;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PADrivers']/div")
    private WebElementFacade menuiItemAsegurados;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:ViewQuote']/div")
    private WebElementFacade menuiItemCotizacion;
    @FindBy(xpath = ".//*[@id='ExcelExportPopup:Export-inputEl']")
    private WebElementFacade comboBoxExportar;
    @FindBy(xpath = ".//*[@id='ExcelExportPopup:Format-inputEl']")
    private WebElementFacade comboBoxFormato;
    @FindBy(xpath = ".//*[@id='ExcelExportPopup:Language-inputEl']")
    private WebElementFacade comboBoxIdioma;
    @FindBy(xpath = ".//*[@id='ExcelExportPopup:Locale-inputEl']")
    private WebElementFacade comboBoxLocal;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:StatedValue_DV-inputEl']")
    private WebElementFacade campoTxtValorasegurado;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    private WebElementFacade campoTxtNombre;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:MiddleName-inputEl']")
    private WebElementFacade campoTxtSegundoNombre;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:MaritalStatus-inputEl']")
    private WebElementFacade comboBoxEstadoCivil;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:SalesOrganizationType-inputEl']")
    private WebElementFacade comboBoxOrganizacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:ChannelType-inputEl']")
    private WebElementFacade comboBoxCanal;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:PAPolicyType-inputEl']")
    private WebElementFacade comboBoxTipoPoliza;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:PolicyInfoInputSet:specialRate_ext-inputEl']")
    private WebElementFacade checkBoxTasaUnica;
    @FindBy(xpath = ".//*[@id='ExcelExportPopup:__crumb__']")
    private WebElementFacade linkVonverAVehiculos;
    @FindBy(css = ".x-table-layout-cell")
    private WebElementFacade filaExaminar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:0_header']")
    private WebElementFacade headerEnvio;
    @FindBy(xpath = ".//*[@id='RenewalWizard:0_header']")
    private WebElementFacade headerRenovacion;
    @FindBy(xpath = ".//*[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ViewJob-inputEl']")
    private WebElementFacade linkVerCotizacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:TotalPremium-inputEl']")
    private WebElementFacade labelPrimaTotalCotizacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:TotalPremium-inputEl']")
    private WebElementFacade labelPrimaTotalCambio;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:Quote_SummaryDV:TotalPremium-inputEl']")
    private WebElementFacade labelPrimaTotalRenovacion;
    @FindBy(xpath = ".//a[contains(.,'Descartar cambios no guardados')]")
    private WebElementFacade linkDescartarCambios;

    public static final String MSJVALIDARELEMENTOS = "No estan presentes los elementos:";
    private static final int CONSTANTE_3 = 3;
    String primaTotal = "";

    public TarifaTasaUnicaPage(WebDriver driver) {
        super(driver);
    }


    public void verificarElementosExportacion() {
        botonHojaDeCalculo.waitUntilPresent();
        clickElement(botonHojaDeCalculo);
        menuItemExportar.waitUntilPresent().click();
        botonExportarAHojaDeCalculo.waitUntilPresent();
        StringBuilder notPresent = new StringBuilder(MSJVALIDARELEMENTOS);
        notPresent = concatenarElementoNoPresente(comboBoxExportar, " combobox exportar,", notPresent);
        notPresent = concatenarElementoNoPresente(comboBoxFormato, " combobox formato,", notPresent);
        notPresent = concatenarElementoNoPresente(comboBoxLocal, " combobox local,", notPresent);
        notPresent = concatenarElementoNoPresente(comboBoxIdioma, " combobox idioma,", notPresent);
        String res = notPresent.toString();
        if (MSJVALIDARELEMENTOS.equals(res)) {
            res = notPresent.toString().substring(0, notPresent.toString().length() - 1);
        }
        MatcherAssert.assertThat(res, "No estan presentes los elementos".equals(res));
    }


    public void verificarElementosImportacion() {
        linkVonverAVehiculos.click();
        botonHojaDeCalculo.waitUntilPresent().click();
        menuItemImportar.waitUntilPresent().click();
        botonImportar.waitUntilPresent();
        MatcherAssert.assertThat("No esta presente el boton examinar", filaExaminar.containsText("Examinar..."));
    }


    public boolean verificarEstadoDelEnvio(String cotizacion) {
        boolean val = false;
        waitFor(ExpectedConditions.textToBePresentInElement(headerEnvio, cotizacion));
        val = (headerEnvio.containsText("Expedida")) ? false : true;
        return val;
    }

    public void comenzarCambioDePoliza() {
        menuiItemCotizacion.waitUntilPresent().click();
        guardarMontoPorCoberturas();
        menuAccionesEnvio.waitUntilPresent().click();
        menuItemArchivoDePoliza.waitUntilPresent().click();
        menuAccionesPoliza.waitUntilPresent().click();
        menuItemCambiarPoliza.waitUntilPresent().click();
        botonSiguienteCambioDePoliza.waitUntilPresent().click();
        llenarInfoPoliza();
    }

    public void cambiarValorAsegurado(String valorAsegurado) {
        menuItemVehiculos.waitUntilPresent().click();
        campoTxtValorasegurado.waitUntilPresent().clear();
        campoTxtValorasegurado.sendKeys(valorAsegurado);
        botonCotizar.click();
    }

    public void cambiarDatosDelAsegurado(String primerNombre, String segundoNombre, String estadoCivil) {
        menuiItemAsegurados.waitUntilPresent().click();
        campoTxtNombre.waitUntilPresent().clear();
        campoTxtNombre.sendKeys(primerNombre);
        campoTxtSegundoNombre.sendKeys(segundoNombre);
        selectItem(comboBoxEstadoCivil, estadoCivil);
        botonCotizarAsegurado.click();
    }


    public void comenzarRenovacionDePoliza() {
        menuiItemCotizacion.waitUntilPresent().click();
        guardarMontoPorCoberturas();
        menuAccionesEnvio.waitUntilPresent().click();
        menuItemArchivoDePoliza.waitUntilPresent().click();
        menuAccionesPoliza.waitUntilPresent().click();
        menuItemRenovarPoliza.waitUntilPresent().click();
        botonAceptar.waitUntilPresent().click();
        for (int i = 0; i < CONSTANTE_3; i++) {
            botonHojaDeCalculoRenovacion.waitUntilPresent();
            waitUntil(WAIT_TIME_3000);
            menuPoliza.click();
            setImplicitTimeout(WAIT_TIME_1, TimeUnit.SECONDS);
            if (botonCotizarRenovacion.isPresent()) {
                break;
            }
        }
    }


    public void renovarPoliza() {
        llenarInfoPoliza();
        botonCotizarRenovacion.waitUntilPresent();
        waitUntil(WAIT_TIME_1000);
        checkBoxTasaUnica.shouldBePresent();
        botonCotizarRenovacion.click();
        setImplicitTimeout(WAIT_TIME_1, TimeUnit.SECONDS);
        if (linkDescartarCambios.isPresent()) {
            linkDescartarCambios.click();
            botonCotizarRenovacion.click();
        }
        resetImplicitTimeout();
    }

    public void verificarTarifacionSinCambio() {
        MatcherAssert.assertThat("Error, hubo un cambio en el valor de la tarifa durante el policy change, Expected: " +
                primaTotal + " but was: " + labelPrimaTotalCambio.getText(), primaTotal.equals(labelPrimaTotalCambio.getText()));
    }

    public void verificarTarifaRenovacionSinCambio() {
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(labelPrimaTotalRenovacion).waitUntilPresent();
        MatcherAssert.assertThat("No hay tarifa en la renovacion", labelPrimaTotalRenovacion.containsText("00 (COP)"));
    }

    public void verificarCambioDeTarifa() {
        MatcherAssert.assertThat("Error, no hubo cambio en el valor de la tarifa durante el policy change", !primaTotal.equals(labelPrimaTotalCambio.getText()));
    }

    public void irAInformacionDePoliza() {
        linkVerCotizacion.waitUntilPresent().click();
    }

    public void guardarMontoPorCoberturas() {
        primaTotal = labelPrimaTotalCotizacion.waitUntilPresent().getText();
    }


    public void llenarInfoPoliza() {
        setImplicitTimeout(1, TimeUnit.SECONDS);
        if (headerRenovacion.isPresent()) {
            comboBoxOrganizacion = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:SalesOrganizationType-inputEl']");
            comboBoxCanal = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:ChannelType-inputEl']");
            comboBoxTipoPoliza = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:PAPolicyType-inputEl']");
        }
        resetImplicitTimeout();
        comboBoxOrganizacion.waitUntilPresent();
        if (!comboBoxOrganizacion.getValue().equals("Sura")) {
            selectItem(comboBoxOrganizacion, "Sura");
            waitForComboValue(comboBoxOrganizacion, "Sura");
            waitUntil(WAIT_TIME_1000);
            selectItem(comboBoxCanal, "Canal Tradicional");
            waitForComboValue(comboBoxCanal, "Canal Tradicional");
            try {
                waitUntil(WAIT_TIME_1000);
                selectItem(comboBoxTipoPoliza, "PPAutos");
            } catch (ElementNotVisibleException e) {
                LOGGER.info("ElementNotVisibleException " + e);
                waitUntil(WAIT_TIME_2000);
                selectItem(comboBoxTipoPoliza, "PPAutos");
            } catch (StaleElementReferenceException f) {
                LOGGER.info("StaleElementReferenceException " + f);
                waitUntil(WAIT_TIME_2000);
                selectItem(comboBoxTipoPoliza, "PPAutos");
            }
            waitForComboValue(comboBoxTipoPoliza, "PPAutos");
        }
    }
}
