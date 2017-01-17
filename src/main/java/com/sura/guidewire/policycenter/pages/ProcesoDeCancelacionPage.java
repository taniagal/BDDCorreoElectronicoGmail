package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ProcesoDeCancelacionPage extends PageUtil {

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
    @FindBy(xpath = ".//*[@id='CancellationWizard:CancellationWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions:SubmitCancellation']")
    WebElementFacade btnProgramarCancelacion;
    @FindBy(xpath = ".//*[@id='messagebox-1001-displayfield-inputEl']")
    WebElementFacade lblMensajeVentana;
    @FindBy(xpath = ".//*[@id='button-1008-btnInnerEl']")
    WebElementFacade btnCancelarVentana;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab-btnInnerEl']")
    WebElementFacade btnInicio;
    InicioCancelacionPage iniCancelacion = new InicioCancelacionPage(getDriver());

    public ProcesoDeCancelacionPage(WebDriver drive) {
        super(drive);
    }


    public void iniciarProcesoCancelacion() {
        esperarHasta(TIEMPO_1000);
        btnIniciaCancelacion.click();
    }

    public void validaMensajeAprobacion(String mensaje) {
        MatcherAssert.assertThat("Mensaje no corresponde al solicitado", lblMensaje.getText().contains(mensaje));
    }

    public void cancelacioConAutorizacion() {
        btnOpcionesDeCompromiso.click();
        btnCancelarAhora.click();
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(btnAceptarAhora).waitUntilClickable();
        btnAceptarAhora.click();
    }

    public void validaAutorizacionEnFormulario() {
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(btnDetalle).waitUntilClickable();
        btnDetalle.click();
        esperarHasta(TIEMPO_1000);
        MatcherAssert.assertThat("Autorizacion no presente, verificar", linkAutorizacion.isVisible());
    }

    public void cerrarTransaccionEnValidacion() {
        btnOpcionDeCierre.click();
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(btnRetirarTransaccion).waitUntilPresent();
        btnRetirarTransaccion.click();
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(btnAceptarAhora).waitUntilPresent();
        btnAceptarAhora.click();
        esperarHasta(TIEMPO_1000);
    }

    public void iniciaProgramacionDeCancelacion() {
        btnOpcionesDeCompromiso.click();
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(btnProgramarCancelacion).waitUntilClickable();
        btnProgramarCancelacion.click();
    }

    public void validaVentanaMensaje(String mensaje) {
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(lblMensajeVentana).waitUntilPresent();
        MatcherAssert.assertThat("Error, mensaje", lblMensajeVentana.getText().equals(mensaje));
        btnCancelarVentana.click();

    }
}
