package com.sura.policycenter.selenium.pages;

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

    @FindBy(xpath = ".//a[contains(.,'Aceptar')]")
    WebElementFacade botonAceptarMensaje;

    @FindBy(xpath = ".//a[contains(.,'Cancelar')]")
    WebElementFacade botonCancelarMensaje;

    @FindBy(xpath = ".//td[contains(.,'¿Está seguro de que desea expedir esta póliza?')]")
    WebElementFacade mensajeConfirmacion;

    @FindBy(xpath = ".//*[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ViewJob-inputEl']")
    WebElementFacade campoNumeroCotizacion;

    @FindBy(xpath = ".//*[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ViewPolicy-inputEl']")
    WebElementFacade campoNumeroPoliza;

    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab']")
    WebElementFacade botonEscritorio;


    public void irABuscarCotizacion(String cotizacion){
        waitFor(ExpectedConditions.elementToBeClickable(menuPoliza));
        menuPoliza.click();
        waitForAnyTextToAppear("Cotización", "Buscar pólizas");
        waitFor(ExpectedConditions.elementToBeClickable(menuPoliza));
        menuPoliza.click();
        menuPoliza.sendKeys(Keys.ARROW_DOWN);
        waitFor(ExpectedConditions.visibilityOf(menuNumeroCotizacion));
        waitABit(1000);
        enter(cotizacion).into(menuNumeroCotizacion);
        menuNumeroCotizacion.sendKeys(Keys.ENTER);
        waitForTextToAppear("Cotización");
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
        String mensajes[] = mensaje.split("\\^");
        Integer contadorMensajesOk = 0;
        Integer numeroMensajes = mensajes.length;
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']/div")));
        List<WebElementFacade> mensajesRiesgos = findAll(".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']/div");
        for(int i = 0; i < numeroMensajes; i++) {
            System.out.println(mensajes[i]);
            for (WebElementFacade lista : mensajesRiesgos) {
                if(lista.getText().equals(mensajes[i])){
                    contadorMensajesOk++;
                    break;
                }
            }
        }
        MatcherAssert.assertThat(contadorMensajesOk.toString(), Is.is(Matchers.equalTo(numeroMensajes.toString())));
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
}
