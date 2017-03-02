package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class ExpedicionDePolizaPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:ttlBar']")
    WebElementFacade tituloVentana;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:JobNumber-inputEl']")
    WebElementFacade campoNumeroEnvio;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:WebMessageWorksheet_ClearButton-btnInnerEl']")
    WebElementFacade botonBorrar;
    @FindBy(xpath = "//a[contains(.,'Expedir póliza') and contains(@id,'JobWizardToolbarButtonSet:IssuesPolicy')]")
    WebElementFacade botonExpedirPoliza;
    @FindBy(id = "PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:JobWizardToolbarButtonSet:BindPolicyChange-btnInnerEl")
    WebElementFacade botonExpedirPolizaPorCambio;
    @FindBy(xpath = ".//a[contains(.,'Aceptar')]")
    WebElementFacade botonAceptarMensaje;
    @FindBy(xpath = ".//*[contains(@id,'WebMessageWorksheet:WebMessageWorksheetScreen') and contains(.,'Existen requisitos pendientes')]")
    WebElementFacade mensajeRequisitosPendientes;
    @FindBy(xpath = ".//a[contains(.,'Cancelar')]")
    WebElementFacade botonCancelarMensaje;
    @FindBy(xpath = ".//td[contains(.,'¿Está seguro de que desea expedir esta póliza?')]")
    WebElementFacade mensajeConfirmacion;
    @FindBy(xpath = ".//*[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ViewJob-inputEl']")
    WebElementFacade campoNumeroCotizacion;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab']")
    WebElementFacade botonEscritorio;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']/div")
    WebElementFacade mensajeRiesgos;
    @FindBy(xpath = ".//img[@class='error_icon']")
    WebElementFacade iconoError;


    public ExpedicionDePolizaPage(WebDriver driver) {
        super(driver);
    }

    public void expedirPoliza() {
        botonExpedirPoliza.waitUntilPresent();
        try {
            clickearElemento(botonExpedirPoliza);
        } catch (StaleElementReferenceException e) {
            LOGGER.info("StaleElementReferenceException " + e);
            esperarHasta(TIEMPO_2000);
            clickearElemento(botonExpedirPoliza);
        }
    }

    public void expedirPolizaPorCambio() {
        waitFor(ExpectedConditions.visibilityOf(botonExpedirPolizaPorCambio));
        waitFor(ExpectedConditions.elementToBeClickable(botonExpedirPolizaPorCambio));
        botonExpedirPolizaPorCambio.click();
    }

    public void aceptarExpedirPoliza() {
        waitFor(ExpectedConditions.visibilityOf(botonAceptarMensaje));
        waitFor(ExpectedConditions.elementToBeClickable(botonAceptarMensaje));
        botonAceptarMensaje.click();
    }

    public void aceptarExpedirPolizaConRequisitosPendientes() {
        this.aceptarExpedirPoliza();
        this.aceptarMensajeRequisitosPendientes();
    }

    public void aceptarMensajeRequisitosPendientes() {
        if (mensajeRequisitosPendientes.isVisible()) {
            botonBorrar.click();
            esperarHasta(TIEMPO_3000);
            botonExpedirPoliza.click();
            esperarHasta(TIEMPO_3000);
            botonAceptarMensaje.click();
            waitForTextToAppear("Cotización Expedida");
        }
    }

    public void validarResumenDeLaPolizaExpedida(String infoCotizacion) {
        withTimeoutOf(TIEMPO_30, TimeUnit.SECONDS).waitFor(campoNumeroCotizacion);
        MatcherAssert.assertThat(campoNumeroCotizacion.getText(), Is.is(Matchers.equalTo(infoCotizacion)));
    }

    public void ingresarVerCotizacion() {
        waitFor(campoNumeroCotizacion);
        campoNumeroCotizacion.click();
        waitForTextToAppear("Cotización");
    }

    public void validarMensaje(String mensaje) {
        String[] mensajes = mensaje.split("\\^");
        Integer contadorMensajesOk = 0;
        Integer numeroMensajes = mensajes.length;
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(mensajeRiesgos).waitUntilPresent();
        List<WebElementFacade> mensajesRiesgos = findAll(".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']/div");
        for (int i = 0; i < numeroMensajes; i++) {
            for (WebElementFacade lista : mensajesRiesgos) {
                if (lista.getText().contains(mensajes[i])) {
                    contadorMensajesOk++;
                    break;
                }
            }
        }
        MatcherAssert.assertThat(contadorMensajesOk.toString(), Is.is(Matchers.equalTo(numeroMensajes.toString())));
        MatcherAssert.assertThat(iconoError.isVisible(), Is.is(Matchers.equalTo(true)));
    }

    public void cancelarExpedicionDeLaPoliza(String mensaje) {
        waitFor(ExpectedConditions.visibilityOf(botonCancelarMensaje));
        waitFor(ExpectedConditions.elementToBeClickable(botonCancelarMensaje));
        MatcherAssert.assertThat(mensajeConfirmacion.getText(), Is.is(Matchers.equalTo(mensaje)));
        botonCancelarMensaje.click();
    }

    public void validarCancelacionDeExpedicionDePoliza() {
        tituloVentana.shouldBeVisible();
        campoNumeroEnvio.shouldBeVisible();
        this.volverAEscritorio();
    }

    public void volverAEscritorio() {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='TabBar:DesktopTab']")));
        waitFor(ExpectedConditions.elementToBeClickable(botonEscritorio));
        botonEscritorio.click();
        waitForTextToAppear("Mis actividades");
    }

    public void validarMensajeRequisitos(String requisitos) {
        waitForTextToAppear(requisitos, TIEMPO_30000);
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(botonBorrar).click();
        botonBorrar.waitUntilNotVisible();
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(botonExpedirPoliza).click();
        withTimeoutOf(TIEMPO_10, TimeUnit.SECONDS).waitFor(botonAceptarMensaje).click();
    }
}