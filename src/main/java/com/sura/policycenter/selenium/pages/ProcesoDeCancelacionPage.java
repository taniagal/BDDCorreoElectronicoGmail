package com.sura.policycenter.selenium.pages;

import com.sura.commons.selenium.Commons;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class ProcesoDeCancelacionPage extends PageObject {

    @FindBy(xpath = ".//*[@id='StartCancellation:StartCancellationScreen:NewCancellation']")
    WebElementFacade btnIniciaCancelacion;
    @FindBy(xpath = ".//*[@id='CancellationWizard:CancellationWizard_QuoteScreen:WarningsPanelSet:0:PanelSet:Warning']")
    WebElementFacade lblMensaje;
    @FindBy(xpath = ".//*[@id='CancellationWizard:CancellationWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions-btnWrap']")
    WebElementFacade btnOpcionesDeCompromiso;
    @FindBy(xpath = ".//*[@id='CancellationWizard:CancellationWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions:CancelNow']")
    WebElementFacade btnCancelarAhora;
    @FindBy(xpath = ".//*[@id='button-1005-btnInnerEl']")
    WebElementFacade btnAceptarAhora;
    @FindBy(xpath = ".//*[@id='UWBlockProgressIssuesPopup:IssuesScreen:DetailsButton-btnInnerEl']")
    WebElementFacade btnDetalle;
    @FindBy(xpath = ".//*[@id='CancellationWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:RiskEvaluationPanelSet:1:UWIssueRowSet:ShortDescription']")
    WebElementFacade linkAutorizacion;
    @FindBy(xpath = ".//*[@id='CancellationWizard:Job_RiskAnalysisScreen:JobWizardToolbarButtonSet:CloseOptions-btnInnerEl']")
    WebElementFacade btnOpcionDeCierre;
    @FindBy(xpath = ".//*[@id='CancellationWizard:Job_RiskAnalysisScreen:JobWizardToolbarButtonSet:CloseOptions:WithdrawJob']")
    WebElementFacade btnRetirarTransaccion;

    public ProcesoDeCancelacionPage(WebDriver drive) {
        super(drive);
    }

    Commons cm = new Commons(getDriver());
    InicioCancelacionPage iniCancelacion = new InicioCancelacionPage(getDriver());

    public void iniciarProcesoCancelacion() {
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(btnIniciaCancelacion).waitUntilClickable();
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(btnIniciaCancelacion).shouldBeEnabled();
        btnIniciaCancelacion.click();
    }

    public void validaMensajeAprobacion(String mensaje) {
        MatcherAssert.assertThat("Mensaje no corresponde al solicitado", lblMensaje.getText().contains(mensaje));
    }

    public void cancelacioConAutorizacion() {
        btnOpcionesDeCompromiso.click();
        btnCancelarAhora.click();
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(btnAceptarAhora).waitUntilClickable();
        btnAceptarAhora.click();
    }

    public void validaAutorizacionEnFormulario() {
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(btnDetalle).waitUntilClickable();
        btnDetalle.click();
        cm.waitUntil(1000);
        MatcherAssert.assertThat("Autorizacion no presente, verificar", linkAutorizacion.isVisible());
    }

    public void cerrarTransaccionEnValidacion() {
        btnOpcionDeCierre.click();
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(btnRetirarTransaccion).waitUntilPresent();
        btnRetirarTransaccion.click();
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(btnAceptarAhora).waitUntilPresent();
        btnAceptarAhora.click();
        JOptionPane.showMessageDialog(null, "goliamos");
    }
}
