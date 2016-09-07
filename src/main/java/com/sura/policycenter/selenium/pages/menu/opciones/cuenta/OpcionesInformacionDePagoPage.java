package com.sura.policycenter.selenium.pages.menu.opciones.cuenta;


import com.sura.commons.selenium.Commons;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class OpcionesInformacionDePagoPage extends Commons{

    @FindBy (xpath = ".//tr[10]/td/div/span")
    WebElementFacade btnPago;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PaymentScreen:ttlBar']")
    WebElementFacade lblPago;

    public OpcionesInformacionDePagoPage(WebDriver driver) {
        super(driver);
    }

    public void clickEnPagos() {
        waitPayment(btnPago);
        btnPago.click();
    }

    public void validaIngresoAPago() {
        MatcherAssert.assertThat("No ingreso a pantalla pago", !lblPago.isVisible());
    }

    // TODO: 07/09/2016 Metodo wait para implementar generico
    public void waitPayment(WebElementFacade webElementFacade) {
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(webElementFacade).shouldBePresent();
    }


}
