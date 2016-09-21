package com.sura.policycenter.selenium.pages;

import com.sura.commons.selenium.Commons;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class ExpedicionCambioDePolizaUWPEPSPage extends Commons{

    Actions act = new Actions(getDriver());

    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:DocumentType-inputEl']")
    private WebElementFacade campoTipoDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:DocumentNumber-inputEl']")
    private WebElementFacade campoNumeroDocumento;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:DocumentType-inputEl']")
    private WebElementFacade campoTipoDocumentoModificacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:DocumentNumber-inputEl']")
    private WebElementFacade campoNumeroDocumentoModificacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:IssuesPolicy-btnInnerEl']")
    private WebElementFacade botonExpedirPoliza;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:JobWizardToolbarButtonSet:BindPolicyChange-btnInnerEl']")
    private WebElementFacade botonExpedirPolizaModificacion;
    @FindBy(xpath = ".//*[@id='UWBlockProgressIssuesPopup:IssuesScreen:PreQuoteIssueTitle']")
    private WebElementFacade tituloBloqueo;
    @FindBy(xpath = ".//*[@id='UWBlockProgressIssuesPopup:IssuesScreen:ApproveDV']")
    private WebElementFacade grupoMensajes;

    public ExpedicionCambioDePolizaUWPEPSPage(WebDriver driver){
        super(driver);
    }

    public void validarFigurasIgualDNI(String tipoDocumento, String numeroDocumento) {
        waitUntil(1500);
        if(campoTipoDocumento.isCurrentlyVisible()) {
            withTimeoutOf(20,TimeUnit.SECONDS).waitFor(campoTipoDocumento).shouldBeVisible();
            MatcherAssert.assertThat(campoTipoDocumento.getText(), Is.is(Matchers.equalTo(tipoDocumento)));
            MatcherAssert.assertThat(campoNumeroDocumento.getText(), Is.is(Matchers.equalTo(numeroDocumento)));
        }else if(campoTipoDocumentoModificacion.isCurrentlyVisible()) {
            withTimeoutOf(20,TimeUnit.SECONDS).waitFor(campoTipoDocumentoModificacion).shouldBeVisible();
            MatcherAssert.assertThat(campoTipoDocumentoModificacion.getText(), Is.is(Matchers.equalTo(tipoDocumento)));
            MatcherAssert.assertThat(campoNumeroDocumentoModificacion.getText(), Is.is(Matchers.equalTo(numeroDocumento)));
        }
    }

    public void emitirPoliza() {
        waitUntil(2000);
        if(botonExpedirPoliza.isCurrentlyVisible()){
            withTimeoutOf(20, TimeUnit.SECONDS).waitFor(botonExpedirPoliza).click();
        }else if(botonExpedirPolizaModificacion.isCurrentlyVisible()){
            withTimeoutOf(20, TimeUnit.SECONDS).waitFor(botonExpedirPolizaModificacion).click();
        }
    }

    public void irAPantallaUW() {
        waitUntil(2500);
        act.sendKeys(Keys.ENTER).build().perform();
        waitUntil(2500);
    }

    public void verificarGeneracionUW() {
        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(tituloBloqueo).shouldBePresent();
        MatcherAssert.assertThat(tituloBloqueo.getText(),Is.is(Matchers.equalTo("Asuntos que bloquean la expedición")));
    }

    public void validarMensajePEP(String mensaje) {
        withTimeoutOf(40,TimeUnit.SECONDS).waitFor(grupoMensajes).shouldBeVisible();
        MatcherAssert.assertThat(grupoMensajes.getText(), Matchers.containsString(mensaje));
    }

    public void validarConcatenacionMensaje(ExamplesTable texto) {
        Map<String, String> textoConcatenado = texto.getRows().get(0);
        MatcherAssert.assertThat(grupoMensajes.getText(), Matchers.containsString(textoConcatenado.get("texto")));
    }
}