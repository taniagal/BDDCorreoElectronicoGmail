package com.sura.guidewire.policycenter.pages;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public class AprobacionDeAnalisisDeRiesgoPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='SubmissionWizard:RiskAnalysis']/div")
    private WebElementFacade menuAnalisisDeRiesgo;
    @FindBy(xpath = "//a[contains(.,'Aprobación especial')]")
    private WebElementFacade botonAprobacionEspecial;
    @FindBy(xpath = "//span[contains(.,'Aceptar')]")
    private WebElementFacade botonAceptarMensaje;
    @FindBy(xpath = ".//*[@id='RiskApprovalDetailsPopup:Update-btnInnerEl']")
    private WebElementFacade botonAceptarAprobacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:IssuesPolicy-btnInnerEl']")
    private WebElementFacade botonExpedirPoliza;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:WebMessageWorksheet_ClearButton']")
    private WebElementFacade botonBorrar;

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
        waitFor(botonExpedirPoliza);
        botonExpedirPoliza.click();
        waitFor(botonAceptarMensaje);
        botonAceptarMensaje.click();
        botonBorrar.waitUntilPresent().click();
        botonBorrar.waitUntilNotVisible();
        botonExpedirPoliza.click();
        waitFor(botonAceptarMensaje);
        botonAceptarMensaje.click();
        waitForTextToAppear("Cotización Expedida", WAIT_TIME_30000);
    }
}
