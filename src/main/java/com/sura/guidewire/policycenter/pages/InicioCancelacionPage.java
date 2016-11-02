package com.sura.guidewire.policycenter.pages;


import com.sura.guidewire.policycenter.util.PageUtil;
import com.sura.guidewire.policycenter.util.GwNavegacionUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class InicioCancelacionPage extends PageUtil{

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
        btnAcciones.click();
        btnCancelarPoliza.click();
    }

    public void ingresarFechaRetroactiva() {
        selectItem(txtMotivo, "Financiación cancelación por");
        waitUntil(WAIT_TIME_1000);
        txtDescripMotivo.click();
        txtDescripMotivo.sendKeys("Motivo de prueba");
        String fecha = calculaRetroactividad31Dias(txtFechaVigenciaCancelacion.getValue());
        txtFechaVigenciaCancelacion.clear();
        txtFechaVigenciaCancelacion.click();
        txtFechaVigenciaCancelacion.sendKeys(fecha);
        txtDescripMotivo.click();
    }

    public void ingresarFechaEmisionAnticipada() {
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(txtMotivo).waitUntilClickable();
        String cadenaAux = "Financiación cancelación por";
        selectItem(txtMotivo, cadenaAux);
        waitUntil(WAIT_TIME_1000);
        String fecha = calculaEmisionAnticipada61Dias(txtFechaVigenciaCancelacion.getValue());
        txtFechaVigenciaCancelacion.clear();
        txtFechaVigenciaCancelacion.click();
        txtFechaVigenciaCancelacion.sendKeys(fecha);
        txtDescripMotivo.click();
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(lblMensaje).waitUntilPresent();
        txtDescripMotivo.sendKeys(cadenaAux);
    }

    public String calculaRetroactividad31Dias(String fecha) {
        DateTimeFormatter formato = DateTimeFormat.forPattern("dd/MM/yyyy");
        DateTime fechaEnFormatoDate = formato.parseDateTime(fecha);
        return fechaEnFormatoDate.minusDays(31).toString(formato);
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

    public void validaListaMotivoDiferenteBancolombia(ExamplesTable listaMotivo) throws Exception {
        waitUntil(WAIT_TIME_800);
        txtLista.click();
        this.validarDatosDeLaLista(listaMotivo);
        btnCancelarTransaccion.click();
    }


    public void validarDatosDeLaLista(ExamplesTable listaMotivo) throws Exception{
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
