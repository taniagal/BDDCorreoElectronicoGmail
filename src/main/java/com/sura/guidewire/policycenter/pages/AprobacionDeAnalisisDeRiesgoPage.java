package com.sura.guidewire.policycenter.pages;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
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
        setImplicitTimeout(WAIT_TIME_2, TimeUnit.SECONDS);
        if (!botonExpedirPoliza.isPresent()){
            clickElement(menuItemCotizacion);
        }
        resetImplicitTimeout();
        waitFor(botonExpedirPoliza);
        clickElement(botonExpedirPoliza);
        waitFor(botonAceptarMensaje);
        botonCancelarMensaje.shouldBeCurrentlyVisible();
        botonAceptarMensaje.click();
        botonBorrar.waitUntilPresent();
        clickElement(botonExpedirPoliza);
        waitFor(botonAceptarMensaje);
        botonAceptarMensaje.click();
        waitForAnyTextToAppear("Cotización Expedida","Cambio en la póliza Expedida");
    }
}
