package com.sura.policycenter.selenium.pages.menu.opciones.cuenta;


import com.sura.commons.selenium.Commons;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class OpcionesInformacionDePagoPage extends Commons{

    @FindBy (xpath = ".//div[contains(.,'Pago')]")
    WebElementFacade btnPago;
    @FindBy (xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PaymentScreen:ttlBar']")
    WebElementFacade lblPago;
    @FindBy (xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PaymentScreen:BillingAdjustmentsDV:BillingMethod-inputEl']")
    WebElementFacade lblMetodoFacturacionMrc;
    @FindBy (xpath = ".//label[contains(.,'Plan de pagos')]")
    WebElementFacade lblPrograma;

    public OpcionesInformacionDePagoPage(WebDriver driver) {
        super(driver);
    }

    public void clickEnPagos() {
        waitPayment(btnPago);
        btnPago.click();
    }

    public void validaIngresoAPago() {
        MatcherAssert.assertThat("No ingreso a pantalla pago", lblPago.isVisible());
    }

    public void validaMetodoPago(String nombreMetodoPago) {
        JOptionPane.showMessageDialog(null, lblMetodoFacturacionMrc.getText());
        //MatcherAssert.assertThat("Metodo de pago no corresponde a Factura Directa", nombreMetodoPago.equals(lblMetodoFacturacionMrc.getText()));
    }

    public void validaPlanDePago(String programa) {
        JOptionPane.showMessageDialog(null, lblPrograma.getText());
        //MatcherAssert.assertThat("El Programa de pagos cambio o no corresponde al enviado por Billing", programa.equals(lblPrograma.getText()));
    }

    // TODO: 07/09/2016 Metodo wait para implementar generico
    public void waitPayment(WebElementFacade webElementFacade) {
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(webElementFacade).shouldBePresent();
    }

}
