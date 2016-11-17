package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.utils.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.WebDriver;


public class CambioEnExpedicionDePolizaPage extends PageUtil{
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:JobWizardToolbarButtonSet:BindPolicyChange']")
    WebElementFacade botonExpedirPoliza;

    @FindBy(xpath = ".//a[contains(.,'Aceptar')]")
    WebElementFacade botonAceptarMensaje;

    @FindBy(xpath = ".//a[contains(.,'Cancelar')]")
    WebElementFacade botonCancelarMensaje;

    @FindBy(xpath = ".//label[@id='JobComplete:JobCompleteScreen:Message']")
    WebElementFacade campoInformacionCambio;

    @FindBy(xpath = ".//div[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ViewPolicy-inputEl']")
    WebElementFacade campoVerPoliza;

    @FindBy(xpath = ".//div[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ReturnToDesktop-inputEl']")
    WebElementFacade campoIrAlEscritorio;

    public CambioEnExpedicionDePolizaPage(WebDriver driver){
        super(driver);
    }

    public void expedirPoliza() {
        botonExpedirPoliza.waitUntilPresent();
        botonExpedirPoliza.click();
    }

    public void aceptarExpedirPoliza() {
        botonAceptarMensaje.waitUntilVisible();
        botonAceptarMensaje.click();
        waitUntil(WAIT_TIME_1000);
    }

    public void validarResumenDeLaPolizaExpedida(String infoCambio, String infoPoliza, String escritorio) {
        campoInformacionCambio.waitUntilPresent();
        MatcherAssert.assertThat(campoInformacionCambio.getText(), Is.is(Matchers.equalTo(infoCambio)));
        MatcherAssert.assertThat(campoVerPoliza.getText(), Is.is(Matchers.containsString(infoPoliza)));
        MatcherAssert.assertThat(campoIrAlEscritorio.getText(), Is.is(Matchers.equalTo(escritorio)));
    }


    public void cancelarExpedirPoliza() {
        botonCancelarMensaje.waitUntilVisible();
        botonCancelarMensaje.click();
    }
}
