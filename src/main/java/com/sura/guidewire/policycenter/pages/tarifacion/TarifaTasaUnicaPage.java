package com.sura.guidewire.policycenter.pages.tarifacion;


import com.sura.guidewire.policycenter.resources.PageUtil;
import com.sura.guidewire.policycenter.utils.Utils;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Map;
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
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:JobWizardToolbarButtonSet:EditPolicy-btnInnerEl']")
    private WebElementFacade botonEditarTransaccionDePolizaInfo;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:JobWizardToolbarButtonSet:EditPolicy']")
    private WebElementFacade botonEditarTransaccionDePolizaAsegurado;
    @FindBy(xpath = ".//*[@id='ExcelImportFilePopup:ImportButton']")
    private WebElementFacade botonImportar;
    @FindBy(xpath = ".//span[contains(.,'Aceptar')]")
    private WebElementFacade botonAceptar;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:JobWizardToolbarButtonSet:QuoteOrReview']")
    private WebElementFacade botonCotizar;
    @FindBy(xpath = ".//*[@id='RenewalWizard:Next-btnInnerEl']")
    private WebElementFacade botonSiguiente;
    @FindBy(xpath = ".//*[@id='RenewalWizard:Prev-btnEl']")
    private WebElementFacade botonVolver;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:JobWizardToolbarButtonSet:RenewalQuote']")
    private WebElementFacade botonCotizarRenovacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:JobWizardToolbarButtonSet:QuoteOrReview']")
    private WebElementFacade botonCotizarAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:Spreadsheet:Export-textEl']")
    private WebElementFacade menuItemExportar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:Spreadsheet:Import-textEl']")
    private WebElementFacade menuItemImportar;
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
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:PolicyInfo']/div")
    private WebElementFacade menuItemInformacionDePolizaRenovacion;
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
    @FindBy(xpath = ".//*[@id='StartPolicyChange:StartPolicyChangeScreen:StartPolicyChangeDV:EffectiveDate_date-inputEl']")
    private WebElementFacade campoTxtFechaDeInicioDeVigencia;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:MaritalStatus-inputEl']")
    private WebElementFacade comboBoxEstadoCivil;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:PolicyInfoInputSet:specialRate_ext-inputEl']")
    private WebElementFacade checkBoxTasaUnica;
    @FindBy(xpath = ".//*[@id='ExcelExportPopup:__crumb__']")
    private WebElementFacade linkVonverAVehiculos;
    @FindBy(css = ".x-table-layout-cell")
    private WebElementFacade filaExaminar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:0_header']")
    private WebElementFacade headerEnvio;
    @FindBy(xpath = ".//*[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ViewJob-inputEl']")
    private WebElementFacade linkVerCotizacion;
    @FindBy(xpath = ".//*[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ViewPolicy-inputEl']")
    private WebElementFacade linkVerPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:TotalPremium-inputEl']")
    private WebElementFacade labelPrimaTotalCotizacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:TotalPremium-inputEl']")
    private WebElementFacade labelPrimaTotalCambio;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:Quote_SummaryDV:TotalPremium-inputEl']")
    private WebElementFacade labelPrimaTotalRenovacion;
    @FindBy(xpath = ".//a[contains(.,'Descartar cambios no guardados')]")
    private WebElementFacade linkDescartarCambios;
    @FindBy(xpath = ".//*[@id='StartPolicyChange:StartPolicyChangeScreen:StartPolicyChangeDV:sustitutionPA_true-inputEl']")
    private WebElementFacade radioBotonEsSustitucionSi;

    public static final String MSJVALIDARELEMENTOS = "No estan presentes los elementos:";
    private static final int WAIT_TIME_7000 = 7000;
    private static final int DOS = 2;
    private static final int TREINTA_Y_TRES = 33;
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

    public int verificarEstadoDelEnvio(String cotizacion) {
        int val = 1;
        waitFor(ExpectedConditions.textToBePresentInElement(headerEnvio, cotizacion));
        if (headerEnvio.containsText("Expedida")) {
            val = 0;
        } else if (headerEnvio.containsText("Cotizado")) {
            val = DOS;
        }
        return val;
    }

    public void comenzarCambioDePolizaConValorDecotizacion() {
        menuiItemCotizacion.waitUntilPresent().click();
        guardarMontoPorCoberturas();
        menuAccionesEnvio.waitUntilPresent().click();
        menuItemArchivoDePoliza.waitUntilPresent().click();
        nuevoCambioDePoliza();
    }

    public void nuevoCambioDePoliza() {
        clickAccionesYCambiarPoliza();
        botonSiguienteCambioDePoliza.waitUntilPresent().click();
    }

    public void clickAccionesYCambiarPoliza() {
        menuAccionesPoliza.waitUntilPresent().click();
        menuItemCambiarPoliza.waitUntilPresent().click();
    }

    public void cambiarFechaDeVigencia(){
        clickAccionesYCambiarPoliza();
        campoTxtFechaDeInicioDeVigencia.waitUntilPresent().clear();
        campoTxtFechaDeInicioDeVigencia.sendKeys(Utils.sumarDiasALaFechaActual(TREINTA_Y_TRES));
        botonSiguienteCambioDePoliza.click();
    }

    public void comenzarSustitucion() {
        clickAccionesYCambiarPoliza();
        radioBotonEsSustitucionSi.waitUntilPresent();
        clickElement(radioBotonEsSustitucionSi);
        clickElement(botonSiguienteCambioDePoliza);
    }

    public void cambiarValorAsegurado(String valorAsegurado) {
        menuItemVehiculos.waitUntilPresent().click();
        isMessagePresent(menuItemVehiculos);
        campoTxtValorasegurado.waitUntilPresent().clear();
        campoTxtValorasegurado.sendKeys(valorAsegurado);
        botonCotizar.click();
    }

    public void cambiarDatosDelAsegurado(String primerNombre, String segundoNombre, String estadoCivil) {
        menuiItemAsegurados.waitUntilPresent().click();
        isMessagePresent(menuiItemAsegurados);
        campoTxtNombre.waitUntilPresent().clear();
        campoTxtNombre.sendKeys(primerNombre);
        campoTxtSegundoNombre.sendKeys(segundoNombre);
        selectItem(comboBoxEstadoCivil, estadoCivil);
        botonCotizarAsegurado.click();
    }

    public void isMessagePresent(WebElementFacade element) {
        setImplicitTimeout(WAIT_TIME_2, TimeUnit.SECONDS);
        if (findBy(".message").isPresent()) {
            element.click();
        }
        resetImplicitTimeout();
    }

    public void comenzarRenovacionDePoliza() {
        menuiItemCotizacion.waitUntilPresent().click();
        guardarMontoPorCoberturas();
        menuAccionesEnvio.waitUntilPresent().click();
        menuItemArchivoDePoliza.waitUntilPresent().click();
        nuevaRenovacion();
    }

    public void nuevaRenovacion() {
        menuAccionesPoliza.waitUntilPresent().click();
        menuItemRenovarPoliza.waitUntilPresent().click();
        botonAceptar.waitUntilPresent().click();
        botonHojaDeCalculoRenovacion.waitUntilPresent();
        waitUntil(WAIT_TIME_7000);
        clickElement(botonSiguiente);
        setImplicitTimeout(WAIT_TIME_3, TimeUnit.SECONDS);
        if (!botonEditarTransaccionDePolizaAsegurado.isPresent()) {
            clickElement(botonVolver);
            waitUntil(WAIT_TIME_5000);
            clickElement(botonSiguiente);
        }
        clickElement(botonVolver);
        resetImplicitTimeout();
        editarTransaccion();
    }

    public void irAInformacionDePolizaRenovacion() {
        menuItemInformacionDePolizaRenovacion.waitUntilPresent();
        clickElement(menuItemInformacionDePolizaRenovacion);
    }

    public void editarTransaccion() {
        botonEditarTransaccionDePolizaInfo.waitUntilPresent();
        clickElement(botonEditarTransaccionDePolizaInfo);
        botonAceptar.waitUntilPresent().click();
        botonEditarTransaccionDePolizaInfo.waitUntilNotVisible();
        descartarCambios();
    }

    public void renovarPoliza() {
        waitUntil(WAIT_TIME_1000);
        checkBoxTasaUnica.shouldBePresent();
        clickElement(botonCotizarRenovacion);
        descartarCambios();
    }

    public void descartarCambios() {
        setImplicitTimeout(WAIT_TIME_1, TimeUnit.SECONDS);
        if (linkDescartarCambios.isPresent()) {
            linkDescartarCambios.click();
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

    public void irAArchivoDePoliza() {
        linkVerPoliza.waitUntilPresent().click();
    }

    public void guardarMontoPorCoberturas() {
        primaTotal = labelPrimaTotalCotizacion.waitUntilPresent().getText();
    }

    public void validarTasaUnicaEnPolizaColectivaPrincipal() {
        WebElementFacade checkTasaUnica = findBy(".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:specialRate_ext-inputEl']");
        MatcherAssert.assertThat("0px -15px", Is.is(Matchers.equalTo(checkTasaUnica.getCssValue("background-position"))));
    }

    public void validarLaCargaDelArchivoDeTasaUnicaEnPolizaRiesgo() {
        WebElementFacade checkTasaUnica = findBy(".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:specialRate_ext-inputEl']");
        MatcherAssert.assertThat(checkTasaUnica.getText(), Is.is(Matchers.equalTo("Sí")));
    }

    public void validarElValorDeLaPrimaYElIvaParaLaPolizaRiesgo(ExamplesTable primaRiesgo) {
        Map<String, String> valoresPrimaRiesgo = primaRiesgo.getRow(0);
        WebElementFacade campoPrimaRiesgo = findBy(".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:5-body']/*/table/tbody/tr[1]/td[2]");
        WebElementFacade campoIvaPrimaRiesgo = findBy(".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:5-body']/*/table/tbody/tr[2]/td[2]");
        MatcherAssert.assertThat("El valor de la prima no es correcto ",campoPrimaRiesgo.getText(), Matchers.containsString(valoresPrimaRiesgo.get("primaT")));
        MatcherAssert.assertThat("El valor del iva no es correcto ", campoIvaPrimaRiesgo.getText(), Matchers.containsString(valoresPrimaRiesgo.get("iva")));
    }
}
