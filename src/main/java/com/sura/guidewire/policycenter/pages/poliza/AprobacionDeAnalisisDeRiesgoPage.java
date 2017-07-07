package com.sura.guidewire.policycenter.pages.poliza;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

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
        setImplicitTimeout(TIEMPO_5, TimeUnit.SECONDS);
        if (!botonExpedirPoliza.isPresent()) {
            withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(menuItemCotizacion);
            clickearElemento(menuItemCotizacion);
        }
        if (botonBorrar.isPresent() && !$(".message").containsText("2011 AUDI AVEO FAMILY")) {
            clickearElemento(botonBorrar);
            waitForTextToDisappear("2011 AUDI AVEO FAMILY");
        }
        resetImplicitTimeout();
        withTimeoutOf(TIEMPO_40, TimeUnit.SECONDS).waitFor(botonExpedirPoliza);
        clickearElemento(botonExpedirPoliza);
        waitFor(botonAceptarMensaje);
        botonAceptarMensaje.click();
        setImplicitTimeout(TIEMPO_5, TimeUnit.SECONDS);
        if (botonBorrar.isPresent() && !$(".message").containsText("2011 AUDI AVEO FAMILY")) {
            try {
                esperarHasta(TIEMPO_2000);
                clickearElemento(botonExpedirPoliza);
                waitFor(botonAceptarMensaje);
                botonAceptarMensaje.click();
            } catch (NoSuchElementException e) {
                LOGGER.info("NoSuchElementException " + e);
            }
        }
        resetImplicitTimeout();
        waitForAnyTextToAppear("Cotización Expedida", "Cambio en la póliza Expedida", "Asuntos que bloquean la expedición");
    }

    public void expedirPolizaMRC() {
        setImplicitTimeout(TIEMPO_5, TimeUnit.SECONDS);
        if (!botonExpedirPoliza.isPresent()) {
            esperarObjetoClikeableServidorWe(menuItemCotizacion);
        }
        if (botonBorrar.isPresent()) {
            clickearElemento(botonBorrar);
            esperarHasta(TIEMPO_2000);
        }
        esperarObjetoClikeableServidorWe(botonExpedirPoliza);
        waitFor(botonAceptarMensaje);
        botonAceptarMensaje.click();
        resetImplicitTimeout();
    }

    public void expedirPolizaUAT() {
        setImplicitTimeout(TIEMPO_20, TimeUnit.SECONDS);
        if (!botonExpedirPoliza.isPresent()) {
            clickearElemento(menuItemCotizacion);
        }
        resetImplicitTimeout();
        withTimeoutOf(TIEMPO_30, TimeUnit.SECONDS).waitFor(botonExpedirPoliza);
        clickearElemento(botonExpedirPoliza);
        waitFor(botonAceptarMensaje);
        botonAceptarMensaje.click();
        setImplicitTimeout(TIEMPO_20, TimeUnit.SECONDS);
        if (botonBorrar.isPresent()) {
            withTimeoutOf(TIEMPO_30, TimeUnit.SECONDS).waitFor(botonExpedirPoliza);
            clickearElemento(botonExpedirPoliza);
            waitFor(botonAceptarMensaje);
            botonAceptarMensaje.click();

        }
        resetImplicitTimeout();
        waitForAnyTextToAppear("Cotización Expedida", "Cambio en la póliza Expedida", "Asuntos que bloquean la expedición");

    }
}