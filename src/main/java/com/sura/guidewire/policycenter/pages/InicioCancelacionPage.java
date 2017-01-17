package com.sura.guidewire.policycenter.pages;


import com.sura.guidewire.policycenter.resources.PageUtil;
import com.sura.guidewire.policycenter.utils.GwNavegacionUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class InicioCancelacionPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='PolicyFile:PolicyFileMenuActions-btnInnerEl']")
    WebElementFacade btnAcciones;
    @FindBy(xpath = ".//*[@id='PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_NewWorkOrder:PolicyFileMenuActions_CancelPolicy']")
    WebElementFacade btnCancelarPoliza;
    @FindBy(xpath = ".//*[@id='StartCancellation:StartCancellationScreen:Cancel-btnInnerEl']")
    WebElementFacade btnCancelarTransaccion;
    @FindBy(xpath = ".//*[@id='StartCancellation:StartCancellationScreen:CancelPolicyDV:CancelDate_date-labelEl']")
    WebElementFacade lblFechaInicioCancelacion;
    @FindBy(xpath = ".//*[@id='StartCancellation:StartCancellationScreen:CancelPolicyDV:Reason-labelEl']")
    WebElementFacade lblMotivoCancelacion;
    @FindBy(xpath = ".//*[@id='StartCancellation:StartCancellationScreen:CancelPolicyDV:CalcMethod-labelEl']")
    WebElementFacade lblMetodoReembolsoCancelacion;
    @FindBy(id = "StartCancellation:StartCancellationScreen:WarningMessageCancellation")
    WebElementFacade lblMensaje;
    @FindBy(xpath = ".//*[@id='StartCancellation:StartCancellationScreen:CancelPolicyDV:Reason-inputEl']")
    WebElementFacade txtMotivo;
    @FindBy(xpath = ".//*[@id='StartCancellation:StartCancellationScreen:CancelPolicyDV:Reason-inputEl']")
    WebElementFacade txtLista;
    @FindBy(xpath = ".//*[@id='StartCancellation:StartCancellationScreen:CancelPolicyDV:CancelDate_date-inputEl']")
    WebElementFacade txtFechaVigenciaCancelacion;
    @FindBy(xpath = ".//*[@id='StartCancellation:StartCancellationScreen:CancelPolicyDV:ReasonDescription-inputEl']")
    WebElementFacade txtDescripMotivo;

    public InicioCancelacionPage(WebDriver driver) {
        super(driver);
    }

    public void inicioCancelacion() {
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(btnAcciones).waitUntilEnabled().waitUntilClickable();
        clickElement(btnAcciones);
        waitUntil(WAIT_TIME_3000);
        btnCancelarPoliza.waitUntilClickable().click();
    }

    public void ingresarFechaRetroactiva() {
        selectItem(txtMotivo, "Financiación cancelación por");
        waitUntil(WAIT_TIME_1000);
        try {
            clickElement(txtDescripMotivo);
        } catch (StaleElementReferenceException e) {
            LOGGER.info("StaleElementReferenceException " + e);
            waitUntil(WAIT_TIME_2000);
            clickElement(txtDescripMotivo);
        }
        txtDescripMotivo.sendKeys("Motivo de prueba");
        withTimeoutOf(WAIT_TIME_5, TimeUnit.SECONDS).waitFor(txtFechaVigenciaCancelacion);
        LocalDate fecha = calculaRetroactividad31Dias(txtFechaVigenciaCancelacion.getValue());
        txtFechaVigenciaCancelacion.clear();
        txtFechaVigenciaCancelacion.click();
        txtFechaVigenciaCancelacion.sendKeys(DateTimeFormat.forPattern("dd/MM/yyyy").print(fecha));
        txtDescripMotivo.click();
    }

    public void ingresarFechaEmisionAnticipada() {
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(txtMotivo).waitUntilClickable();
        String cadenaAux = "Financiación cancelación por";
        selectItem(txtMotivo, cadenaAux);
        waitUntil(WAIT_TIME_1000);
        withTimeoutOf(WAIT_TIME_5, TimeUnit.SECONDS).waitFor(txtFechaVigenciaCancelacion);
        String fecha = calculaEmisionAnticipada61Dias(txtFechaVigenciaCancelacion.getValue());
        txtFechaVigenciaCancelacion.clear();
        txtFechaVigenciaCancelacion.sendKeys(fecha);
        txtDescripMotivo.click();
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(lblMensaje).waitUntilPresent();
        txtDescripMotivo.sendKeys(cadenaAux);
    }

    public LocalDate calculaRetroactividad31Dias(String fecha) {
        return DateTimeFormat.forPattern("dd/MM/yyyy").parseDateTime(fecha).toLocalDate().minusDays(31);
    }

    public String calculaEmisionAnticipada61Dias(String fecha) {
        DateTimeFormatter formato = DateTimeFormat.forPattern("dd/MM/yyyy");
        DateTime fechaEnFormatoDate = formato.parseDateTime(fecha);
        return fechaEnFormatoDate.plusDays(61).toString(formato);
    }

    public void validaCamposEnPantalla() {
        MatcherAssert.assertThat("No aparece fecha de vigencia de cancelacion", "Fecha vigente de cancelación".equals(lblFechaInicioCancelacion.getText()));
        MatcherAssert.assertThat("No aparece el motivo de cancelacion", "Motivo".equals(lblMotivoCancelacion.getText()));
        MatcherAssert.assertThat("No aparece metodo de reembolso cancelacion", "Método de reembolso".equals(lblMetodoReembolsoCancelacion.getText()));
        MatcherAssert.assertThat("No aparece el boton Cancelar Transaccion", "Cancelar transacción".equals(btnCancelarTransaccion.getText()));
    }

    public void cancelaTransaccion() {
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(btnCancelarTransaccion).waitUntilClickable();
        btnCancelarTransaccion.click();
        waitUntil(WAIT_TIME_300);
    }

    public void validaMensajeEnPantalla(String mensaje) {
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(lblMensaje).waitUntilPresent();
        MatcherAssert.assertThat("Mensaje no corresponde al referenciado", lblMensaje.getText().contains(mensaje));
    }

    public void validaListaMotivoDiferenteBancolombia(ExamplesTable listaMotivo) {
        waitUntil(WAIT_TIME_800);
        txtLista.click();
        this.validarDatosDeLaLista(listaMotivo);
        btnCancelarTransaccion.click();
    }


    public void validarDatosDeLaLista(ExamplesTable listaMotivo) {
        List<WebElementFacade> elementoInstruccion;
        List<String> elementosRequeridos = GwNavegacionUtil.obtenerTablaDeEjemplosDeUnaColumna(listaMotivo);
        for (String tipo : elementosRequeridos) {
            elementoInstruccion = withTimeoutOf(WAIT_TIME_1, TimeUnit.SECONDS).findAll("//li[contains(.,'" + tipo + "')]");
            for (WebElementFacade lista : elementoInstruccion) {
                MatcherAssert.assertThat(tipo, Matchers.containsString(lista.getText()));
            }
        }
    }
}
