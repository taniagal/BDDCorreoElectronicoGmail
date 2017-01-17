package com.sura.guidewire.policycenter.utils.menu.opciones.cuenta;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class OpcionesInformacionDePagoPage extends PageUtil {

    @FindBy (xpath = "//td[@id='SubmissionWizard:BillingInfo']/div")
    WebElementFacade btnPago;
    @FindBy (xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PaymentScreen:ttlBar']")
    WebElementFacade lblPago;
    @FindBy (xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PaymentScreen:BillingAdjustmentsDV:BillingMethod-inputEl']")
    WebElementFacade lblMetodoFacturacionMrc;
    @FindBy (xpath = ".//label[contains(.,'Plan de pagos')]")
    WebElementFacade lblPrograma;
    @FindBy (xpath = ".//*[@id='TabBar:DesktopTab-btnInnerEl']")
    WebElementFacade btnInicio;


    public OpcionesInformacionDePagoPage(WebDriver driver) {
        super(driver);
    }

    public void clickEnPagos() {
        waitPayment(btnPago);
        esperarHasta(TIEMPO_2000);
        btnPago.click();
    }

    public void validaIngresoAPago() {
        MatcherAssert.assertThat("No ingreso a pantalla pago", lblPago.isVisible());
    }

    public void validaPago(String nombreMetodoPago) {
        MatcherAssert.assertThat("Metodo de pago no corresponde a Factura Directa", nombreMetodoPago.equals(lblMetodoFacturacionMrc.getText()));
    }

    public void validaPrograma(String programa){
        MatcherAssert.assertThat("El Programa de pagos cambio o no corresponde al enviado por Billing", programa.equals(lblPrograma.getText()));
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(btnInicio).waitUntilClickable();
    }

    // TODO: 07/09/2016 Metodo wait para implementar generico
    public void waitPayment(WebElementFacade webElementFacade) {
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(webElementFacade).shouldBePresent();
    }


}
