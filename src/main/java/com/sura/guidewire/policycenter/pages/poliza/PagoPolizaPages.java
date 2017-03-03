package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import com.sura.guidewire.policycenter.utils.menu.opciones.cuenta.OpcionesInformacionPolizaMrcPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PagoPolizaPages extends PageUtil {
    @FindBy(xpath = ".//*[contains(@id,'BillingInfo')]")
    private WebElementFacade menuItemPago;
    private static String LBL_PAGO_POLIZA = ".//*[contains(@id,'SubmissionWizard:SubmissionWizard')]/td";
    OpcionesInformacionPolizaMrcPage opcionesInformacionPolizaMrcPage;

    public PagoPolizaPages(WebDriver driver) {
        super(driver);
    }

    public void validarcamposNoEditablesEnPagoDePoliza() {
        opcionesInformacionPolizaMrcPage.validarCamposNoEditables(LBL_PAGO_POLIZA);
    }

    public void ingresarALAOpcionDePagos() {
        esperarHasta(TIEMPO_2000);
        menuItemPago.waitUntilClickable().click();
        waitForTextToAppear("Pago");
    }

}
