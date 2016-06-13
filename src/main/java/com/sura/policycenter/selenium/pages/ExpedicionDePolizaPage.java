package com.sura.policycenter.selenium.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ExpedicionDePolizaPage extends PageObject{

    public ExpedicionDePolizaPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:ttlBar']")
    WebElementFacade tituloVentana;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:JobNumber-inputEl']")
    WebElementFacade campoNumeroEnvio;

    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab']")
    WebElementFacade menuPoliza;

    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab:PolicyTab_SubmissionNumberSearchItem-inputEl']")
    WebElementFacade menuNumeroCotizacion;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:IssuesPolicy']")
    WebElementFacade botonExpedirPoliza;

    @FindBy(linkText = "link=Aceptar")
    WebElementFacade botonAceptarMensaje;

    @FindBy(linkText = "link=Cancelar")
    WebElementFacade botonCancelarMensaje;

    @FindBy(xpath = ".//td[contains(.,'¿Está seguro de que desea expedir esta póliza?')]")
    WebElementFacade mensajeConfirmacion;

    @FindBy(xpath = ".//*[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ViewJob-inputEl']")
    WebElementFacade campoNumeroCotizacion;

    @FindBy(xpath = ".//*[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ViewPolicy-inputEl']")
    WebElementFacade campoNumeroPoliza;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:_msgs']/div")
    WebElementFacade mensajeValidacionRiesgo;


    public void irABuscarCotizacion(String cotizacion){
        menuPoliza.click();
        waitForAnyTextToAppear("Cotización", "Buscar pólizas");
        menuPoliza.click();
        menuPoliza.sendKeys(Keys.ARROW_DOWN);
        menuNumeroCotizacion.type(cotizacion);
        menuNumeroCotizacion.sendKeys(Keys.ENTER);
    }

    public void expedirPoliza() {
        waitFor(ExpectedConditions.visibilityOf(botonExpedirPoliza));
        waitFor(ExpectedConditions.elementToBeClickable(botonExpedirPoliza));
        botonExpedirPoliza.click();
    }

    public void aceptarExpedirPoliza() {
        waitFor(ExpectedConditions.visibilityOf(botonAceptarMensaje));
        waitFor(ExpectedConditions.elementToBeClickable(botonAceptarMensaje));
        botonAceptarMensaje.click();
    }

    public void validarResumenDeLaPolizaExpedida(String cotizacion, String poliza) {
        waitFor(ExpectedConditions.visibilityOf(campoNumeroCotizacion));
        waitFor(ExpectedConditions.visibilityOf(campoNumeroPoliza));
        MatcherAssert.assertThat(campoNumeroCotizacion.getText(), Is.is(Matchers.containsString(cotizacion)));
        MatcherAssert.assertThat(campoNumeroPoliza.getText(), Is.is(Matchers.containsString(poliza)));
    }

    public void validarMensajeDeRiesgos(String mensaje) {
        waitFor(ExpectedConditions.visibilityOf(mensajeValidacionRiesgo));
        MatcherAssert.assertThat(mensajeValidacionRiesgo.getText(), Is.is(Matchers.equalTo(mensaje)));
    }

    public void validarVariosMensajeDeRiesgos(String mensaje) {
        String mensajes[] = mensaje.split("\\^");
        if(mensajes.length > 1){
            for(Integer i = 0; i < mensajes.length; i++) {
                WebElementFacade mensajeRiesgo = findBy(".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:_msgs']/div["+i.toString()+"]");
                MatcherAssert.assertThat(mensajes[i], Is.is(Matchers.equalTo(mensajeRiesgo.getText())));
            }
        }
        else {
            waitFor(ExpectedConditions.visibilityOf(mensajeValidacionRiesgo));
            MatcherAssert.assertThat(mensajeValidacionRiesgo.getText(), Is.is(Matchers.equalTo(mensajes[0])));
        }
    }

    public void cancelarExpedicionDeLaPoliza(String mensaje) {
        waitFor(ExpectedConditions.visibilityOf(botonCancelarMensaje));
        waitFor(ExpectedConditions.elementToBeClickable(botonCancelarMensaje));
        MatcherAssert.assertThat(mensajeConfirmacion.getText(), Is.is(Matchers.equalTo(mensaje)));
        botonCancelarMensaje.click();
    }

    public void validarCancelacionDeExpedicionDePoliza() {
        tituloVentana.shouldBeVisible();
        campoNumeroEnvio.shouldBeVisible();
    }
}
