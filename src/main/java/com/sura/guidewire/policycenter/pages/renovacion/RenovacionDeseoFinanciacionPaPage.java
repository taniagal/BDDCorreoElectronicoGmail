package com.sura.guidewire.policycenter.pages.renovacion;

import com.sura.guidewire.policycenter.pages.tarifacion.TarifaTasaUnicaPage;
import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class RenovacionDeseoFinanciacionPaPage extends PageUtil {

    Actions act = new Actions(getDriver());
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:_msgs']")
    private WebElementFacade mensajeValidacion;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']")
    private WebElementFacade grupoMensajesValidacion;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:_msgs']")
    private WebElementFacade mensajesAdvertencia;

    public RenovacionDeseoFinanciacionPaPage(WebDriver driver){
        super(driver);
    }

    public void seleccionarDeseoFinanciacionSi() {
        TarifaTasaUnicaPage tasaUnicaPage = new TarifaTasaUnicaPage(getDriver());
        tasaUnicaPage.llenarInfoPoliza();
        WebElementFacade deseoFinanciacionSi = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:PolicyInfoInputSet:FundedPolicyInputSet:QuestionFundedPolicy_true-inputEl']");
        withTimeoutOf(WAIT_TIME_20, TimeUnit.SECONDS).waitFor(deseoFinanciacionSi).click();
        WebElementFacade numeroCuotas = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:PolicyInfoInputSet:FundedPolicyInputSet:FundedPolicyQuotaNumber-inputEl']");
        withTimeoutOf(WAIT_TIME_20,TimeUnit.SECONDS).waitFor(numeroCuotas).clear();
        numeroCuotas.typeAndTab("12");
    }

    public void seleccionarOpcionSiguiente() {
        WebElementFacade botonSiguiente = findBy(".//*[@id='RenewalWizard:Next-btnInnerEl']");
        withTimeoutOf(WAIT_TIME_20,TimeUnit.SECONDS).waitFor(botonSiguiente).click();
    }

    public void validarMensajeDeseoFinanciacion(ExamplesTable mensaje) {
        Map<String, String> mensajeFinanciacion = mensaje.getRows().get(0);
        verificarMensaje(mensajeValidacion,mensajeFinanciacion.get("mensaje"));
    }

    public void irARevisionDePoliza(){
        WebElementFacade revisionPoliza = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:PolicyReview']/div");
        withTimeoutOf(WAIT_TIME_20,TimeUnit.SECONDS).waitFor(revisionPoliza).click();
        mensajesAdvertencia.waitUntilPresent();
        waitUntil(WAIT_TIME_1500);
        revisionPoliza.click();
        WebElementFacade labelRevisionPoliza = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_DifferencesScreen:ttlBar']");
        withTimeoutOf(WAIT_TIME_28,TimeUnit.SECONDS).waitFor(labelRevisionPoliza).shouldBeVisible();
    }

    public void cotizarRenovacionPoliza() {
        WebElementFacade cotizarRenovacion = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_DifferencesScreen:JobWizardToolbarButtonSet:RenewalQuote-btnInnerEl']");
        withTimeoutOf(WAIT_TIME_20,TimeUnit.SECONDS).waitFor(cotizarRenovacion).click();
    }

    public void validarMensajeFinanciacionCotizacionRenovacion(ExamplesTable mensaje) {
        Map<String, String> mensajeFinanciacion = mensaje.getRows().get(0);
        withTimeoutOf(WAIT_TIME_20,TimeUnit.SECONDS).waitFor(grupoMensajesValidacion).shouldBeCurrentlyVisible();
        MatcherAssert.assertThat(grupoMensajesValidacion.getTextValue(), Matchers.containsString(mensajeFinanciacion.get("mensaje")));
    }

    public void validarNumeroDeCuotas(ExamplesTable numeroCuotas) {
        Map<String, String> cuotas = numeroCuotas.getRows().get(0);
        WebElementFacade campoNumeroCuotas = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:PolicyInfoInputSet:FundedPolicyInputSet:FundedPolicyQuotaNumber-inputEl']");
        withTimeoutOf(WAIT_TIME_20,TimeUnit.SECONDS).waitFor(campoNumeroCuotas).click();
        WebElementFacade cuota11 = findBy(".//li[contains(.,'11')]");
        WebElementFacade cuota12 = findBy(".//li[contains(.,'12')]");
        withTimeoutOf(WAIT_TIME_28,TimeUnit.SECONDS).waitFor(cuota11).shouldBeCurrentlyVisible();
        MatcherAssert.assertThat(cuota11.getText(), Matchers.is(Matchers.equalTo(cuotas.get("cuota11"))));
        MatcherAssert.assertThat(cuota12.getText(), Matchers.is(Matchers.equalTo(cuotas.get("cuota12"))));
    }

    public void validarCotizacionConIntencionDeFinanciacion() {
        WebElementFacade labelCotizacion = findBy(".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:ttlBar']");
        withTimeoutOf(WAIT_TIME_28,TimeUnit.SECONDS).waitFor(labelCotizacion).shouldBeCurrentlyVisible();
        MatcherAssert.assertThat(labelCotizacion.getText(), Matchers.is(Matchers.equalTo("Cotización")));
    }

    public void validarValorYNumeroDeCuotas(ExamplesTable detalleCotizacion) {
        Map<String, String> detalle = detalleCotizacion.getRows().get(0);
        WebElementFacade valorCuota = findBy(".//td[2]/div/table/tbody/tr/td/div/table/tbody/tr/td[2]/div/div[2]/div/table/tbody/tr/td[2]/div");
        WebElementFacade numeroCuotas = findBy(".//td[2]/div/table/tbody/tr/td/div/table/tbody/tr/td[2]/div/div[2]/div/table/tbody/tr[2]/td[2]/div");
        MatcherAssert.assertThat(valorCuota.getText(),Matchers.containsString(detalle.get("valorCuota")));
        MatcherAssert.assertThat(numeroCuotas.getText(),Matchers.containsString(detalle.get("numeroCuota")));
    }

    public void expedirPolizaRenovacion() {
        WebElementFacade botonOpcionesCompromiso = findBy(".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions-btnInnerEl']");
        withTimeoutOf(WAIT_TIME_28,TimeUnit.SECONDS).waitFor(botonOpcionesCompromiso).click();
        WebElementFacade botonEmitir = findBy(".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions:IssueNow-textEl']");
        withTimeoutOf(WAIT_TIME_28,TimeUnit.SECONDS).waitFor(botonEmitir).click();
        waitForTextToAppear("¿Está seguro de que desea emitir la renovación de la póliza?");
        act.sendKeys(Keys.ENTER).build().perform();
    }
}