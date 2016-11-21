package com.sura.guidewire.policycenter.pages;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class CancelacionPolizaClaimsPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='StartCancellation:StartCancellationScreen:CancelPolicyDV:Reason-inputEl']")
    WebElementFacade lstMotivo;
    @FindBy(xpath = ".//*[@id='StartCancellation:StartCancellationScreen:CancelPolicyDV:ReasonDescription-inputEl']")
    WebElementFacade txtDescripcionMotivo;
    @FindBy(xpath = ".//*[@id='StartCancellation:StartCancellationScreen:NewCancellation-btnInnerEl']")
    WebElementFacade btnIniciaCancelacion;
    @FindBy(xpath = ".//*[@id='StartCancellation:StartCancellationScreen:NewCancellation-btnInnerEl']")
    WebElementFacade btnCancelarTransaccion;
    @FindBy(xpath = ".//*[@id='StartCancellation:StartCancellationScreen:WarningMessageCancellationClaims']")
    WebElementFacade lblMensajeClaims;
    @FindBy(xpath = ".//*[@id='CancellationWizard:CancellationWizard_QuoteScreen:ttlBar']")
    WebElementFacade lblConfirmacionDeInicioCancelacion;


    public CancelacionPolizaClaimsPage(WebDriver driver) {
        super(driver);
    }

    public void ingresaMotivoCancelacion(String motivo) {
        lstMotivo.clear();
        lstMotivo.click();
        lstMotivo.sendKeys(motivo);
        txtDescripcionMotivo.click();
        waitUntil(WAIT_TIME_1500);
        txtDescripcionMotivo.sendKeys(motivo);
        txtDescripcionMotivo.sendKeys(Keys.ENTER);
    }

    public void validaInicioCancelacion() {
        MatcherAssert.assertThat("No inicio la cancelacion, error", lblConfirmacionDeInicioCancelacion.isVisible());
    }

    public void cancelarTransaccion() {
        withTimeoutOf(WAIT_TIME_20, TimeUnit.SECONDS).waitFor(btnCancelarTransaccion).waitUntilClickable();
        btnCancelarTransaccion.click();
    }

    public void validaMensajeNoCancelacionMotivoClaims(String mensaje) {
        MatcherAssert.assertThat("Se esperaba mensaje del servicio de Claims", lblMensajeClaims.containsText(mensaje));
    }
}
