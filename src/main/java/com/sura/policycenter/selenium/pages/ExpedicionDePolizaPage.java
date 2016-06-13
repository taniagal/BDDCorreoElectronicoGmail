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

    @FindBy(xpath = "")
    WebElementFacade mensajeConfirmacion;

    @FindBy(xpath = ".//*[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ViewJob-inputEl']")
    WebElementFacade campoNumeroCotizacion;

    @FindBy(xpath = ".//*[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ViewPolicy-inputEl']")
    WebElementFacade campoNumeroPoliza;

    @FindBy(xpath = "")
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

    private void validarMensajeDeConfirmacion(String mensaje) {
        MatcherAssert.assertThat(mensajeConfirmacion.getText(), Is.is(Matchers.equalTo(mensaje)));
    }

    public void validarResumenDeLaPolizaExpedida(String numCotizacion, String poliza) {
        waitFor(ExpectedConditions.visibilityOf(campoNumeroCotizacion));
        waitFor(ExpectedConditions.visibilityOf(campoNumeroPoliza));
        MatcherAssert.assertThat(campoNumeroCotizacion.getText(), Is.is(Matchers.equalTo(numCotizacion)));
        MatcherAssert.assertThat(campoNumeroPoliza.getText(), Is.is(Matchers.equalTo(poliza)));
    }

    public void validarMensajeDeRiesgos(String mensaje) {
        waitFor(ExpectedConditions.visibilityOf(mensajeValidacionRiesgo));
        MatcherAssert.assertThat(mensajeValidacionRiesgo.getText(), Is.is(Matchers.equalTo(mensaje)));
    }
}
