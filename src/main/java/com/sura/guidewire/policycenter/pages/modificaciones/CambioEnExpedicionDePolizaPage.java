package com.sura.guidewire.policycenter.pages.modificaciones;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class CambioEnExpedicionDePolizaPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:JobWizardToolbarButtonSet:BindPolicyChange']")
    WebElementFacade botonExpedirPoliza;
    @FindBy(xpath = ".//a[contains(.,'Aceptar')]")
    WebElementFacade botonAceptarMensaje;
    @FindBy(xpath = ".//label[@id='JobComplete:JobCompleteScreen:Message']")
    WebElementFacade campoInformacionCambio;
    @FindBy(xpath = ".//div[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ViewPolicy-inputEl']")
    WebElementFacade campoVerPoliza;
    @FindBy(xpath = ".//div[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ReturnToDesktop-inputEl']")
    WebElementFacade campoIrAlEscritorio;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']")
    WebElementFacade msjAdvertenciaCaja;

    public CambioEnExpedicionDePolizaPage(WebDriver driver) {
        super(driver);
    }

    public void expedirPoliza() {
        botonExpedirPoliza.waitUntilPresent();
        botonExpedirPoliza.click();
    }

    public void aceptarExpedirPoliza() {
        botonAceptarMensaje.waitUntilVisible();
        botonAceptarMensaje.click();
        esperarHasta(TIEMPO_1000);
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(msjAdvertenciaCaja).waitUntilVisible();
        botonExpedirPoliza.click();
        botonAceptarMensaje.click();
    }

    public void validarResumenDeLaPolizaExpedida(String infoCambio, String infoPoliza, String escritorio) {
        campoInformacionCambio.waitUntilPresent();
        verificarMensaje(campoInformacionCambio, infoCambio);
        verificarMensaje(campoVerPoliza, infoPoliza);
        verificarMensaje(campoIrAlEscritorio, escritorio);
    }
}
