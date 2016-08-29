package com.sura.policycenter.selenium.pages;

import com.sura.commons.selenium.Commons;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class ExpedicionDePolizaPage extends PageObject{
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:ttlBar']")
    WebElementFacade tituloVentana;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:JobNumber-inputEl']")
    WebElementFacade campoNumeroEnvio;

    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab']")
    WebElementFacade menuPoliza;

    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab:PolicyTab_SubmissionNumberSearchItem-inputEl']")
    WebElementFacade menuNumeroCotizacion;

    @FindBy(id = "SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:IssuesPolicy-btnInnerEl")
    WebElementFacade botonExpedirPoliza;

    @FindBy(id = "PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:JobWizardToolbarButtonSet:BindPolicyChange-btnInnerEl")
    WebElementFacade botonExpedirPolizaPorCambio;

    @FindBy(xpath = ".//a[contains(.,'Aceptar')]")
    WebElementFacade botonAceptarMensaje;

    @FindBy(xpath = ".//a[contains(.,'Cancelar')]")
    WebElementFacade botonCancelarMensaje;

    @FindBy(id="TabBar:DesktopTab-btnInnerEl")
    WebElementFacade botonInicio;

    @FindBy(xpath = ".//td[contains(.,'¿Está seguro de que desea expedir esta póliza?')]")
    WebElementFacade mensajeConfirmacion;

    @FindBy(xpath = ".//*[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ViewJob-inputEl']")
    WebElementFacade campoNumeroCotizacion;

    @FindBy(xpath = ".//*[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ViewPolicy-inputEl']")
    WebElementFacade campoNumeroPoliza;

    @FindBy(xpath = ".//*[@id='JobComplete:JobCompleteScreen:JobCompleteDV:SubmissionManager-inputEl']")
    WebElementFacade campoAdministradorDeCotizaciones;

    @FindBy(xpath = ".//*[@id='JobComplete:JobCompleteScreen:JobCompleteDV:SubmitAnother-inputEl']")
    WebElementFacade campoCotizacionParaCuentaDiferente;

    @FindBy(xpath = ".//*[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ReturnToDesktop-inputEl']")
    WebElementFacade campoIrAlEscritorio;

    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab']")
    WebElementFacade botonEscritorio;

    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']/div")
    WebElementFacade mensajeRiesgos;

    @FindBy(xpath = ".//*[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ReturnToCollectivePolicy-inputEl']")
    WebElementFacade linkIrAPolizaColectiva;

    @FindBy(xpath = ".//img[@class='error_icon']")
    WebElementFacade iconoError;
    
    Commons commons = new Commons(getDriver());

    public ExpedicionDePolizaPage(WebDriver driver){
        super(driver);
    }

    public void irABuscarCotizacion(String cotizacion){
        waitFor(menuPoliza).waitUntilPresent();
        menuPoliza.click();
        waitForAnyTextToAppear("Cotización", "Buscar pólizas");
        waitFor(menuPoliza).waitUntilPresent();
        menuPoliza.click();
        menuPoliza.sendKeys(Keys.ARROW_DOWN);
        menuNumeroCotizacion.waitUntilPresent();
        commons.ingresarDato(menuNumeroCotizacion,cotizacion);
        menuNumeroCotizacion.sendKeys(Keys.ENTER);
        waitForTextToAppear("Cotización");
        waitForTextToAppear(cotizacion);
    }

    public void expedirPoliza() {
        waitFor(ExpectedConditions.visibilityOf(botonExpedirPoliza));
        waitFor(ExpectedConditions.elementToBeClickable(botonExpedirPoliza));
        botonExpedirPoliza.click();
    }


    public void expedirPolizaPorCambio() {
        waitFor(ExpectedConditions.visibilityOf(botonExpedirPolizaPorCambio));
        waitFor(ExpectedConditions.elementToBeClickable(botonExpedirPolizaPorCambio));
        botonExpedirPolizaPorCambio.click();
    }

    public void aceptarExpedirPoliza() {
        waitFor(ExpectedConditions.visibilityOf(botonAceptarMensaje));
        waitFor(ExpectedConditions.elementToBeClickable(botonAceptarMensaje));
        botonAceptarMensaje.click();
    }

    public void validarResumenDeLaPolizaExpedida(String infoCotizacion, String infoPoliza, String admorCotizacion,
                                                 String nuevaCotizacion, String escritorio) {
        waitForTextToAppear("Cotización Expedida", 30000);
        waitFor(campoNumeroCotizacion);
        MatcherAssert.assertThat(campoNumeroCotizacion.getText(), Is.is(Matchers.equalTo(infoCotizacion)));
        MatcherAssert.assertThat(campoNumeroPoliza.getText(), Is.is(Matchers.containsString(infoPoliza)));
        MatcherAssert.assertThat(campoAdministradorDeCotizaciones.getText(), Is.is(Matchers.equalTo(admorCotizacion)));
        MatcherAssert.assertThat(campoCotizacionParaCuentaDiferente.getText(), Is.is(Matchers.equalTo(nuevaCotizacion)));
        MatcherAssert.assertThat(campoIrAlEscritorio.getText(), Is.is(Matchers.equalTo(escritorio)));
        waitFor(ExpectedConditions.elementToBeClickable(botonEscritorio));
    }

    public void validarMensaje( String mensaje) {
        String[] mensajes = mensaje.split("\\^");
        Integer contadorMensajesOk = 0;
        Integer numeroMensajes = mensajes.length;
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(mensajeRiesgos).waitUntilPresent();
        List<WebElementFacade> mensajesRiesgos = findAll(".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']/div");
        for(int i = 0; i < numeroMensajes; i++) {
            for (WebElementFacade lista : mensajesRiesgos) {
                if(lista.getText().contains(mensajes[i])){
                    contadorMensajesOk++;
                    break;
                }
            }
        }
        MatcherAssert.assertThat(contadorMensajesOk.toString(), Is.is(Matchers.equalTo(numeroMensajes.toString())));
        MatcherAssert.assertThat(iconoError.isVisible(), Is.is(Matchers.equalTo(true)));
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
        this.volverAEscritorio();
    }

    public void volverAEscritorio() {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='TabBar:DesktopTab']")));
        waitFor(ExpectedConditions.elementToBeClickable(botonEscritorio));
        botonEscritorio.click();
        waitForTextToAppear("Mis actividades");
    }

    public void irAPolizaColectiva(){
        waitFor(linkIrAPolizaColectiva);
        linkIrAPolizaColectiva.click();
        waitForTextToAppear("Información de la póliza colectiva");
    }

    public void vuelveInicio() {
        waitFor(botonInicio);
        botonInicio.click();
    }
}
