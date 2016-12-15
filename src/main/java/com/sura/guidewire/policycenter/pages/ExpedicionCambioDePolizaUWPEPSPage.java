package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Map;
import java.util.concurrent.TimeUnit;


public class ExpedicionCambioDePolizaUWPEPSPage extends PageUtil {

    Actions act = new Actions(getDriver());

    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab-btnWrap']")
    private WebElementFacade menuPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:DocumentType-inputEl']")
    private WebElementFacade campoTipoDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:DocumentNumber-inputEl']")
    private WebElementFacade campoNumeroDocumento;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:DocumentType-inputEl']")
    private WebElementFacade campoTipoDocumentoModificacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:DocumentNumber-inputEl']")
    private WebElementFacade campoNumeroDocumentoModificacion;
    @FindBy(xpath = ".//*[contains(text(), 'Exped') and contains(@id, 'QuoteScreen:JobWizardToolbarButtonSet')]")
    private WebElementFacade botonExpedirPoliza;
    @FindBy(xpath = ".//*[@id='UWBlockProgressIssuesPopup:IssuesScreen:PreQuoteIssueTitle']")
    private WebElementFacade tituloBloqueo;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']")
    private WebElementFacade grupoMensajes;
    @FindBy(xpath = ".//*[@id='button-1005-btnInnerEl']")
    private WebElementFacade btnAceptar;

    public ExpedicionCambioDePolizaUWPEPSPage(WebDriver driver) {
        super(driver);
    }

    public void validarFigurasIgualDNI(String tipoDocumento, String numeroDocumento) {
        waitUntil(WAIT_TIME_1500);
        if (campoTipoDocumento.isCurrentlyVisible()) {
            withTimeoutOf(WAIT_TIME_20, TimeUnit.SECONDS).waitFor(campoTipoDocumento).shouldBeVisible();
            MatcherAssert.assertThat(campoTipoDocumento.getText(), Is.is(Matchers.equalTo(tipoDocumento)));
            MatcherAssert.assertThat(campoNumeroDocumento.getText(), Is.is(Matchers.equalTo(numeroDocumento)));
        } else if (campoTipoDocumentoModificacion.isCurrentlyVisible()) {
            withTimeoutOf(WAIT_TIME_20, TimeUnit.SECONDS).waitFor(campoTipoDocumentoModificacion).shouldBeVisible();
            MatcherAssert.assertThat(campoTipoDocumentoModificacion.getText(), Is.is(Matchers.equalTo(tipoDocumento)));
            MatcherAssert.assertThat(campoNumeroDocumentoModificacion.getText(), Is.is(Matchers.equalTo(numeroDocumento)));
        }
    }

    public void emitirPoliza() {
        waitUntil(WAIT_TIME_3000);
        withTimeoutOf(WAIT_TIME_20, TimeUnit.SECONDS).waitFor(botonExpedirPoliza).click();
    }

    public void aceptarExpedir() {
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(btnAceptar).waitUntilClickable();
        btnAceptar.click();
    }

    public void verificarGeneracionUW() {
        withTimeoutOf(WAIT_TIME_20, TimeUnit.SECONDS).waitFor(tituloBloqueo).shouldBePresent();
        MatcherAssert.assertThat(tituloBloqueo.getText(), Is.is(Matchers.equalTo("Asuntos que bloquean la expedición")));
    }

    public void validarMensajePEP(String mensaje) {
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(grupoMensajes).shouldBeVisible();
        try {
            MatcherAssert.assertThat(grupoMensajes.getText(), Matchers.containsString(mensaje));
        } catch (StaleElementReferenceException e) {
            LOGGER.info("StaleElement" + e);
            waitUntil(WAIT_TIME_2000);
            MatcherAssert.assertThat(grupoMensajes.getText(), Matchers.containsString(mensaje));
        }
    	withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).
    	waitFor(menuPoliza).
    	waitUntilClickable();
    }

    public void validarConcatenacionMensaje(ExamplesTable texto) {
        Map<String, String> textoConcatenado = texto.getRows().get(0);
        MatcherAssert.assertThat(grupoMensajes.getText(), Matchers.containsString(textoConcatenado.get("texto")));
    }
}
