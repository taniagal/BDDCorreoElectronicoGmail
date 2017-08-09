package com.sura.guidewire.policycenter.pages.renovacion;

import com.sura.guidewire.policycenter.resources.PageUtil;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

public class RenovacionDeseoFinanciacionPaPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:FundedPolicyInputSet:FundedPolicyQuotaNumber-inputEl']")
    private WebElementFacade comboBoxNumeroDeCuotas;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']")
    private WebElementFacade grupoMensajesValidacion;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:_msgs']")
    private WebElementFacade mensajeValidacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:PolicyInfo']")
    private WebElementFacade menuItemInformacionDePoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:FundedPolicyInputSet:QuestionFundedPolicy_true-inputEl']")
    private WebElementFacade radioBotonDeseaFinanciarLaPolizaSi;
    @org.openqa.selenium.support.FindBy(xpath = ".//*[@id='button-1005-btnInnerEl']")
    private WebElementFacade btnAceptar;


    public RenovacionDeseoFinanciacionPaPage(WebDriver driver) {
        super(driver);
    }

    public void seleccionarDeseoFinanciacionSi() {
        WebElementFacade deseoFinanciacionSi = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:PolicyInfoInputSet:FundedPolicyInputSet:QuestionFundedPolicy_true-inputEl']");
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(deseoFinanciacionSi).click();
        WebElementFacade numeroCuotas = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:PolicyInfoInputSet:FundedPolicyInputSet:FundedPolicyQuotaNumber-inputEl']");
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(numeroCuotas).clear();
        numeroCuotas.typeAndTab("12");
    }

    public void seleccionarOpcionSiguiente() {
        WebElementFacade botonSiguiente = findBy(".//*[@id='RenewalWizard:Next-btnInnerEl']");
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(botonSiguiente).click();
    }

    public void validarMensajeDeseoFinanciacion(ExamplesTable mensaje) {
        Map<String, String> mensajeFinanciacion = mensaje.getRows().get(0);
        verificarMensaje(mensajeValidacion, mensajeFinanciacion.get("mensaje"));
    }

    public void irARevisionDePoliza() {
        WebElementFacade revisionPoliza = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:PolicyReview']/div");
        clickearElemento(revisionPoliza);
        WebElementFacade labelRevisionPoliza = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_DifferencesScreen:ttlBar']");
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(labelRevisionPoliza).shouldBeVisible();
    }

    public void cotizarRenovacionPoliza() {
        WebElementFacade cotizarRenovacion = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_DifferencesScreen:JobWizardToolbarButtonSet:RenewalQuote-btnInnerEl']");
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(cotizarRenovacion).click();
    }

    public void validarMensajeFinanciacionCotizacionRenovacion(ExamplesTable mensaje) {
        verificarMensajes(grupoMensajesValidacion, mensaje);
    }

    public void validarNumeroDeCuotas(ExamplesTable numeroCuotas) {
        Map<String, String> cuotas = numeroCuotas.getRows().get(0);
        WebElementFacade campoNumeroCuotas = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:PolicyInfoInputSet:FundedPolicyInputSet:FundedPolicyQuotaNumber-inputEl']");
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(campoNumeroCuotas).click();
        WebElementFacade cuota11 = findBy(".//li[contains(.,'11')]");
        WebElementFacade cuota12 = findBy(".//li[contains(.,'12')]");
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(cuota11).shouldBeCurrentlyVisible();
        MatcherAssert.assertThat(cuota11.getText(), Matchers.is(Matchers.equalTo(cuotas.get("cuota11"))));
        MatcherAssert.assertThat(cuota12.getText(), Matchers.is(Matchers.equalTo(cuotas.get("cuota12"))));
    }

    public void validarValorYNumeroDeCuotas(ExamplesTable detalleCotizacion) {
        Map<String, String> detalle = detalleCotizacion.getRows().get(0);
        WebElementFacade valorCuota = findBy(".//td[2]/div/table/tbody/tr/td/div/table/tbody/tr/td[2]/div/div[2]/div/table/tbody/tr/td[2]/div");
        WebElementFacade numeroCuotas = findBy(".//td[2]/div/table/tbody/tr/td/div/table/tbody/tr/td[2]/div/div[2]/div/table/tbody/tr[2]/td[2]/div");
        MatcherAssert.assertThat(valorCuota.getText(), Matchers.containsString(detalle.get("valorCuota")));
        MatcherAssert.assertThat(numeroCuotas.getText(), Matchers.containsString(detalle.get("numeroCuota")));
    }

    public void expedirPolizaRenovacion() {
        WebElementFacade botonOpcionesCompromiso = findBy(".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions-btnInnerEl']");
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(botonOpcionesCompromiso).click();
        WebElementFacade botonEmitir = findBy(".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions:IssueNow-textEl']");
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(botonEmitir).click();
        waitForTextToAppear("¿Está seguro de que desea emitir la renovación de la póliza?");
        esperarObjetoClikeableServidorWe(btnAceptar);
    }

    public void marcarDeseodeFinanciacion() {
        menuItemInformacionDePoliza.waitUntilPresent().click();
        radioBotonDeseaFinanciarLaPolizaSi.waitUntilPresent().click();
        comboBoxNumeroDeCuotas.waitUntilPresent();
        seleccionarItem(comboBoxNumeroDeCuotas, "12");
    }
}