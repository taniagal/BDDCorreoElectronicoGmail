package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.util.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Map;
import java.util.concurrent.TimeUnit;


public class ExpedicionCambioDePolizaUWPEPSPage extends PageObject{

    Actions act = new Actions(getDriver());

    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab-btnWrap']")
    private WebElementFacade menuPoliza;
    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab:PolicyTab_SubmissionNumberSearchItem-inputEl']")
    private WebElementFacade buscarCotizacion;
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
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']")
    private WebElementFacade grupoMensajes;
    @FindBy(xpath = ".//*[@id='button-1005-btnInnerEl']")
    private WebElementFacade btnAceptar;

    public ExpedicionCambioDePolizaUWPEPSPage(WebDriver driver){
        super(driver);
    }
    PageUtil cm = new PageUtil(getDriver());



    public void validarFigurasIgualDNI(String tipoDocumento, String numeroDocumento) {
        cm.waitUntil(1500);
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
        cm.waitUntil(2000);
        if(botonExpedirPoliza.isCurrentlyVisible()){
            withTimeoutOf(20, TimeUnit.SECONDS).waitFor(botonExpedirPoliza).click();
        }else if(botonExpedirPolizaModificacion.isCurrentlyVisible()){
            withTimeoutOf(20, TimeUnit.SECONDS).waitFor(botonExpedirPolizaModificacion).click();
        }
    }

   public void aceptarExpedir(){
       withTimeoutOf(30, TimeUnit.SECONDS).waitFor(btnAceptar).waitUntilClickable();
       btnAceptar.click();
   }

    public void verificarGeneracionUW() {
        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(tituloBloqueo).shouldBePresent();
        MatcherAssert.assertThat(tituloBloqueo.getText(),Is.is(Matchers.equalTo("Asuntos que bloquean la expedición")));
    }

    public void validarMensajePEP(String mensaje) {
        withTimeoutOf(40,TimeUnit.SECONDS).waitFor(grupoMensajes).shouldBeVisible();
        MatcherAssert.assertThat(grupoMensajes.getText(), Matchers.containsString(mensaje));
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(menuPoliza).waitUntilClickable();
    }

    public void validarConcatenacionMensaje(ExamplesTable texto) {
        Map<String, String> textoConcatenado = texto.getRows().get(0);
        MatcherAssert.assertThat(grupoMensajes.getText(), Matchers.containsString(textoConcatenado.get("texto")));
    }




}