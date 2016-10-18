package com.sura.policycenter.selenium.pages;


import com.sura.commons.selenium.Commons;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.hamcrest.MatcherAssert;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class InicioCancelacionPage extends PageObject {


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
    @FindBy(xpath = ".//*[@id='StartCancellation:StartCancellationScreen:CancelPolicyDV:CancelDate_date-inputEl']")
    WebElementFacade txtFechaVigenciaCancelacion;
    @FindBy(xpath = ".//*[@id='StartCancellation:StartCancellationScreen:CancelPolicyDV:ReasonDescription-inputEl']")
    WebElementFacade txtDescripMotivo;

    Commons cm = new Commons(getDriver());

    public InicioCancelacionPage(WebDriver driver) {
        super(driver);
    }

    public void inicioCancelacion() {
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(btnAcciones).waitUntilClickable();
        btnAcciones.click();
        btnCancelarPoliza.click();
    }


    public void ingresarFechaRetroactiva() {
        cm.selectItem(txtMotivo, "Financiación cancelación por");
        cm.waitUntil(1000);
        String fecha = calculaRetroactividad31Dias(txtFechaVigenciaCancelacion.getValue());
        txtFechaVigenciaCancelacion.clear();
        txtFechaVigenciaCancelacion.click();
        txtFechaVigenciaCancelacion.sendKeys(fecha);
        txtDescripMotivo.click();
    }

    public void ingresarFechaEmisionAnticipada() {
        cm.selectItem(txtMotivo, "Financiación cancelación por");
        cm.waitUntil(1000);
        String fecha = calculaEmisionAnticipada61Dias(txtFechaVigenciaCancelacion.getValue());
        txtFechaVigenciaCancelacion.clear();
        txtFechaVigenciaCancelacion.click();
        txtFechaVigenciaCancelacion.sendKeys(fecha);
        txtDescripMotivo.click();
    }

    public String calculaRetroactividad31Dias(String fecha) {
        DateTimeFormatter formato = DateTimeFormat.forPattern("dd/MM/yyyy");
        DateTime fechaEnFormatoDate = formato.parseDateTime(fecha);
        String fechaEnFormatoString = fechaEnFormatoDate.minusDays(31).toString(formato);
        return fechaEnFormatoString;
    }

    public String calculaEmisionAnticipada61Dias(String fecha) {
        DateTimeFormatter formato = DateTimeFormat.forPattern("dd/MM/yyyy");
        DateTime fechaEnFormatoDate = formato.parseDateTime(fecha);
        String fechaEnFormatoString = fechaEnFormatoDate.minusDays(61).toString(formato);
        return fechaEnFormatoString;
    }

    public void validaCamposEnPantalla() {
        MatcherAssert.assertThat("No aparece fecha de vigencia de cancelacion", lblFechaInicioCancelacion.getText().equals("Fecha vigente de cancelación"));
        MatcherAssert.assertThat("No aparece el motivo de cancelacion", lblMotivoCancelacion.getText().equals("Motivo"));
        MatcherAssert.assertThat("No aparece metodo de reembolso cancelacion", lblMetodoReembolsoCancelacion.getText().equals("Método de reembolso"));
        MatcherAssert.assertThat("No aparece el boton Cancelar Transaccion", btnCancelarTransaccion.getText().equals("Cancelar transacción"));
    }

    public void cancelaTransaccion() {
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(btnCancelarTransaccion).waitUntilClickable();
        btnCancelarTransaccion.click();
    }


    public void validaMensajeEnPantalla(String mensaje) {
        MatcherAssert.assertThat("Mensaje no corresponde al referenciado", lblMensaje.getText().contains(mensaje));
    }
}
