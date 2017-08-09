package com.sura.guidewire.policycenter.pages.poliza;


import com.google.common.base.Function;
import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import javax.annotation.Nullable;
import java.util.concurrent.TimeUnit;

public class AprobacionDeAnalisisDeRiesgoPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='SubmissionWizard:RiskAnalysis']/div")
    private WebElementFacade menuAnalisisDeRiesgo;
    @FindBy(xpath = "//a[contains(.,'Aprobación especial')]")
    private WebElementFacade botonAprobacionEspecial;
    @FindBy(xpath = "//span[contains(.,'Aceptar')]")
    private WebElementFacade botonAceptarMensaje;
    @FindBy(xpath = ".//*[@id='RiskApprovalDetailsPopup:Update-btnInnerEl']")
    private WebElementFacade botonAceptarAprobacion;
    @FindBy(xpath = ".//span[contains(.,'Expedir póliza')]")
    private WebElementFacade botonExpedirPoliza;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:WebMessageWorksheet_ClearButton']")
    private WebElementFacade botonBorrar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:ViewQuote']/div")
    private WebElementFacade menuItemCotizacion;
    @FindBy(xpath = ".//a[contains(.,'Cancelar')]")
    private WebElementFacade botonCancelarMensaje;

    public AprobacionDeAnalisisDeRiesgoPage(WebDriver driver) {
        super(driver);
    }

    public void aprobarAnalisisDeRiesgo() {
        menuAnalisisDeRiesgo.click();
        while (botonAprobacionEspecial.isPresent()) {
            waitForTextToAppear("Análisis de riesgo");
            waitFor(botonAprobacionEspecial).click();
            waitFor(botonAceptarMensaje).click();
            waitFor(botonAceptarAprobacion);
            botonAceptarAprobacion.click();
        }
    }

    public void expedirPoliza() {
        FluentWait fluentWait = new FluentWait(getDriver()).
                withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(250, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class);
        WebElement element = (WebElement) fluentWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver webDriver) {
                return getDriver().findElement(By.xpath(".//span[contains(.,'Expedir póliza')]"));
            }}
        );
                clickearElemento(botonExpedirPoliza);
                waitFor(botonAceptarMensaje);
                botonAceptarMensaje.click();
        waitForAnyTextToAppear("Cotización Expedida", "Cambio en la póliza Expedida", "Asuntos que bloquean la expedición");


    }


    public void expedirPolizaMRCFacultativo() {
        expedirPolizaMRC();
        setImplicitTimeout(TIEMPO_3, TimeUnit.SECONDS);
        if (botonExpedirPoliza.isVisible()){
            esperarObjetoClikeableServidorWe(botonExpedirPoliza);
            waitFor(botonAceptarMensaje);
            botonAceptarMensaje.click();
        }
        resetImplicitTimeout();
    }

    public void expedirPolizaMRC() {
        setImplicitTimeout(TIEMPO_3, TimeUnit.SECONDS);
        if (!botonExpedirPoliza.isPresent()) {
            esperarObjetoClikeableServidorWe(menuItemCotizacion);
        }
        while (botonBorrar.isVisible()) {
            esperarObjetoClikeableServidorWe(botonBorrar);
            esperarHasta(TIEMPO_2000);
        }
        esperarObjetoClikeableServidorWe(botonExpedirPoliza);
        waitFor(botonAceptarMensaje);
        botonAceptarMensaje.click();
        resetImplicitTimeout();
    }

    public void expedirPolizaUAT() {
        setImplicitTimeout(TIEMPO_40, TimeUnit.SECONDS);
        if (!botonExpedirPoliza.isPresent()) {
            clickearElemento(menuItemCotizacion);
        }
        resetImplicitTimeout();
        withTimeoutOf(TIEMPO_40, TimeUnit.SECONDS).waitFor(botonExpedirPoliza);
        clickearElemento(botonExpedirPoliza);
        waitFor(botonAceptarMensaje);
        botonAceptarMensaje.click();
        setImplicitTimeout(TIEMPO_20, TimeUnit.SECONDS);
        if (botonBorrar.isPresent()) {
            botonBorrar.click();
            withTimeoutOf(TIEMPO_30, TimeUnit.SECONDS).waitFor(botonExpedirPoliza);
            clickearElemento(botonExpedirPoliza);
            waitFor(botonAceptarMensaje);
            botonAceptarMensaje.click();

        }
        resetImplicitTimeout();
        waitForAnyTextToAppear("Cotización Expedida", "Cambio en la póliza Expedida", "Asuntos que bloquean la expedición");

    }
}