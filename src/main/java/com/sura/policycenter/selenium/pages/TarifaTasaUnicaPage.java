package com.sura.policycenter.selenium.pages;


import com.sura.commons.selenium.Commons;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class TarifaTasaUnicaPage extends Commons {
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:Spreadsheet-btnInnerEl']")
    private WebElementFacade botonHojaDeCalculo;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:Spreadsheet']")
    private WebElementFacade botonHojaDeCalculoRenovacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:Spreadsheet:Export-textEl']")
    private WebElementFacade menuItemExportar;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:Spreadsheet:Export']")
    private WebElementFacade menuItemExportarRenovacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:Spreadsheet:Import-textEl']")
    private WebElementFacade menuItemImportar;
    @FindBy(xpath = ".//*[@id='ExcelExportPopup:Export-inputEl']")
    private WebElementFacade comboBoxExportar;
    @FindBy(xpath = ".//*[@id='ExcelExportPopup:Format-inputEl']")
    private WebElementFacade comboBoxFormato;
    @FindBy(xpath = ".//*[@id='ExcelExportPopup:Language-inputEl']")
    private WebElementFacade comboBoxIdioma;
    @FindBy(xpath = ".//*[@id='ExcelExportPopup:Locale-inputEl']")
    private WebElementFacade comboBoxLocal;
    @FindBy(xpath = ".//*[@id='ExcelExportPopup:ExportAsynchronouslyButton']")
    private WebElementFacade botonExportarAHojaDeCalculo;
    @FindBy(xpath = ".//*[@id='ExcelExportPopup:__crumb__']")
    private WebElementFacade linkVonverAVehiculos;
    @FindBy(xpath = ".//*[@id='ExcelImportFilePopup:ImportButton']")
    private WebElementFacade botonImportar;
    @FindBy(css = ".x-table-layout-cell")
    private WebElementFacade trExaminar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:0_header']")
    private WebElementFacade headerEnvio;
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
    @FindBy(xpath = ".//*[@id='StartPolicyChange:StartPolicyChangeScreen:NewPolicyChange']")
    private WebElementFacade botonSiguienteCambioDePoliza;
    @FindBy(xpath = ".//span[contains(.,'Aceptar')]")
    private WebElementFacade botonAceptar;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PersonalVehicles']/div")
    private WebElementFacade menuItemVehiculos;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:StatedValue_DV-inputEl']")
    private WebElementFacade campoTxtValorasegurado;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:JobWizardToolbarButtonSet:QuoteOrReview']")
    private WebElementFacade botonCotizar;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:JobWizardToolbarButtonSet:RenewalQuote']")
    private WebElementFacade botonCotizarRenovacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:JobWizardToolbarButtonSet:QuoteOrReview']")
    private WebElementFacade botonCotizarAsegurado;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:costLV-body']")
    private WebElementFacade tablaMonto;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PADrivers']/div")
    private WebElementFacade menuiItemAsegurados;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:ViewQuote']/div")
    private WebElementFacade menuiItemCotizacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    private WebElementFacade campoTxtNombre;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:MiddleName-inputEl']")
    private WebElementFacade campoTxtSegundoNombre;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:MaritalStatus-inputEl']")
    private WebElementFacade comboBoxEstadoCivil;
    @FindBy(xpath = ".//*[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ViewJob-inputEl']")
    private WebElementFacade linkVerCotizacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:TotalPremium-inputEl']")
    private WebElementFacade labelPrimaTotalCotizacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:TotalPremium-inputEl']")
    private WebElementFacade labelPrimaTotalCambio;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:Quote_SummaryDV:TotalPremium-inputEl']")
    private WebElementFacade labelPrimaTotalRenovacion;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:JobWizardToolbarButtonSet:EditPolicyWorkflow']")
    private WebElementFacade botonEditarTransaccion;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:PolicyInfoInputSet:specialRate_ext-inputEl']")
    private WebElementFacade checkBoxTasaUnica;

    private static final String TABLAXPATH = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:costLV-body']/*/table/tbody/tr[";
    public static final String MSJVALIDARELEMENTOS = "No estan presentes los elementos:";
    String vecMontos[] = new String[8];
    String primaTotal = "";

    public TarifaTasaUnicaPage(WebDriver driver) {
        super(driver);
    }


    public void verificarElementosExportacion() {
        botonHojaDeCalculo.waitUntilPresent().click();
        menuItemExportar.waitUntilPresent().click();
        botonExportarAHojaDeCalculo.waitUntilPresent();
        StringBuilder notPresent = new StringBuilder(MSJVALIDARELEMENTOS);
        if (!comboBoxExportar.isPresent()) {
            notPresent.append(" combobox exportar,");
        }
        if (!comboBoxFormato.isPresent()) {
            notPresent.append(" combobox formato,");
        }
        if (!comboBoxLocal.isPresent()) {
            notPresent.append(" combobox local,");
        }
        if (!comboBoxIdioma.isPresent()) {
            notPresent.append(" combobox idioma,");
        }
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
        MatcherAssert.assertThat("No esta presente el boton examinar", trExaminar.containsText("Examinar..."));
    }


    public int verificarEstadoDelEnvio(String cotizacion) {
        waitFor(ExpectedConditions.textToBePresentInElement(headerEnvio, cotizacion));
        return (headerEnvio.containsText("Expedida")) ? 1 : 0;
    }

    public void comenzarCambioDePoliza() {
        menuiItemCotizacion.waitUntilPresent().click();
        guardarMontoPorCoberturas();
        menuAccionesEnvio.waitUntilPresent().click();
        menuItemArchivoDePoliza.waitUntilPresent().click();
        menuAccionesPoliza.waitUntilPresent().click();
        menuItemCambiarPoliza.waitUntilPresent().click();
        botonSiguienteCambioDePoliza.waitUntilPresent().click();
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
        for (int i = 0; i < 5; i++) {
            withTimeoutOf(20,TimeUnit.SECONDS).waitFor(botonHojaDeCalculoRenovacion).waitUntilPresent().click();
            menuItemExportarRenovacion.waitUntilPresent().click();
            waitUntil(2000);
            linkVonverAVehiculos.waitUntilPresent().click();
            setImplicitTimeout(1, TimeUnit.SECONDS);
            if (botonEditarTransaccion.isPresent()) {
                botonEditarTransaccion.waitUntilPresent().click();
                i = 5;
            }
            resetImplicitTimeout();
        }
    }


    public void renovarPoliza() {
        botonCotizarRenovacion.waitUntilPresent();
        waitUntil(1000);
        checkBoxTasaUnica.shouldBePresent();
        botonCotizarRenovacion.click();
    }

    public void verificarTarifacionSinCambio() {
        MatcherAssert.assertThat("Error, hubo un cambio en el valor de la tarifa durante el policy change, Expected: " +
                primaTotal + " but was: " + labelPrimaTotalCambio.getText(), primaTotal.equals(labelPrimaTotalCambio.getText()));
    }

    public void verificarTarifaRenovacionSinCambio() {
        labelPrimaTotalRenovacion.waitUntilPresent();
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

}
