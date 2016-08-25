package com.sura.policycenter.selenium.pages;

import com.sura.commons.selenium.Commons;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ExpedirCambioDePolizaUWPEPSPage extends Commons{

    Actions act = new Actions(getDriver());

    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:DocumentType-inputEl']")
    private WebElementFacade campoTipoDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:DocumentNumber-inputEl']")
    private WebElementFacade campoNumeroDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:IssuesPolicy-btnInnerEl']")
    private WebElementFacade botonExpedirPoliza;
    @FindBy(xpath = ".//*[@id='UWBlockProgressIssuesPopup:IssuesScreen:PreQuoteIssueTitle']")
    private WebElementFacade tituloBloqueo;
    @FindBy(xpath = ".//*[@id='UWBlockProgressIssuesPopup:IssuesScreen:ApproveDV:0:ShortDescriptionAndSize-inputEl']")
    private WebElementFacade mensajePEPTomador;
    @FindBy(xpath = ".//*[@id='UWBlockProgressIssuesPopup:IssuesScreen:ApproveDV:1:ShortDescriptionAndSize-inputEl']")
    private WebElementFacade mensajePEPAsegurado;
    @FindBy(xpath = ".//*[@id='UWBlockProgressIssuesPopup:IssuesScreen:ApproveDV:2:ShortDescriptionAndSize-inputEl']")
    private WebElementFacade mensajePEPBeneficiario;

    public ExpedirCambioDePolizaUWPEPSPage(WebDriver driver){
        super(driver);
    }

    public void validarFigurasIgualDNI(String tipoDocumento, String numeroDocumento) {
        MatcherAssert.assertThat(campoTipoDocumento.getText(),Is.is(Matchers.equalTo(tipoDocumento)));
        MatcherAssert.assertThat(campoNumeroDocumento.getText(),Is.is(Matchers.equalTo(numeroDocumento)));
    }

    public void emitirPoliza() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(botonExpedirPoliza).click();
    }

    public void irAPantallaUW() {
        waitForTextToAppear("¿Está seguro de que desea expedir esta póliza?",5000);
        waitUntil(1000);
        act.sendKeys(Keys.ENTER).build().perform();
        waitUntil(1500);
    }

    public void verificarGeneracionUW() {
        withTimeoutOf(10,TimeUnit.SECONDS).waitFor(tituloBloqueo).shouldBePresent();
        MatcherAssert.assertThat(tituloBloqueo.getText(),Is.is(Matchers.equalTo("Asuntos que bloquean la expedición")));
    }

    public void validarMensajePEP(String mensaje) {

        if(mensajePEPTomador.isPresent()) {
            boolean validacionMensaje = mensajePEPTomador.getText().contains(mensaje)||
                                        mensajePEPAsegurado.getText().contains(mensaje)||
                                        mensajePEPBeneficiario.getText().contains(mensaje);
            MatcherAssert.assertThat(validacionMensaje, Is.is(Matchers.equalTo(true)));
        }

        /*if(mensajePEPTomador.isPresent()) {
            MatcherAssert.assertThat(mensajePEPTomador.getText(), Matchers.containsString(mensaje));
        }else if(mensajePEPAsegurado.isPresent()) {
            MatcherAssert.assertThat(mensajePEPAsegurado.getText(), Matchers.containsString(mensaje));
        }else if(mensajePEPBeneficiario.isPresent()) {
            MatcherAssert.assertThat(mensajePEPBeneficiario.getText(), Matchers.containsString(mensaje));
        }*/
    }

    public void validarConcatenacionMensaje(ExamplesTable texto) {
        Map<String, String> textoConcatenado = texto.getRows().get(0);
        if(mensajePEPTomador.isPresent()) {
            MatcherAssert.assertThat(mensajePEPTomador.getText(), Matchers.containsString(textoConcatenado.get("texto")));
        }else if(mensajePEPAsegurado.isPresent()) {
            MatcherAssert.assertThat(mensajePEPAsegurado.getText(), Matchers.containsString(textoConcatenado.get("texto")));
        }else if(mensajePEPBeneficiario.isPresent()) {
            MatcherAssert.assertThat(mensajePEPAsegurado.getText(), Matchers.containsString(textoConcatenado.get("texto")));
        }
    }
}