package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.pages.renovacion.ReglasRenovacionDosPage;
import com.sura.guidewire.policycenter.util.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class CotizacionDeCancelacionPage extends PageObject {

    @FindBy(xpath = ".//*[@id='StartCancellation:StartCancellationScreen:NewCancellation-btnInnerEl']")
    WebElementFacade btnIniciarCancelacion;
    @FindBy(xpath = ".//*[@id='CancellationWizard:C ancellationWizard_QuoteScreen:ttlBar']")
    WebElementFacade lblConfirmacion;
    @FindBy(xpath = ".//*[@id='CancellationWizard:CancellationWizard_QuoteScreen:Quote_SummaryDV:JobNumber-inputEl']")
    WebElementFacade inputNumPoliza;
    @FindBy(xpath = ".//*[@id='CancellationWizard:CancellationWizard_QuoteScreen:Quote_SummaryDV:PolicyNumber-inputEl']")
    WebElementFacade inputNumCotizacion;
    @FindBy(xpath = ".//*[@id='CancellationWizard:CancellationWizard_QuoteScreen:Quote_SummaryDV:PolicyPeriod-inputEl']")
    WebElementFacade inputVigenciaPoliza;
    @FindBy(xpath = ".//*[@id='CancellationWizard:CancellationWizard_QuoteScreen:Quote_SummaryDV:PolicyPeriod-inputEl']")
    WebElementFacade inputTomador;
    @FindBy(xpath = ".//*[@id='CancellationWizard:CancellationWizard_QuoteScreen:Quote_SummaryDV:DocumentType-inputEl']")
    WebElementFacade inputTipoDocumento;
    @FindBy(xpath = ".//*[@id='CancellationWizard:CancellationWizard_QuoteScreen:Quote_SummaryDV:DocumentNumber-inputEl']")
    WebElementFacade inputNumDocumento;
    @FindBy(xpath = ".//*[@id='CancellationWizard:CancellationWizard_QuoteScreen:Quote_SummaryDV:transaction-inputEl']")
    WebElementFacade inputFechaVigenciaTransacc;
    @FindBy(xpath = ".//*[@id='CancellationWizard:CancellationWizard_QuoteScreen:Quote_SummaryDV:TotalPremium-inputEl']")
    WebElementFacade inputPrimaTotal;
    @FindBy(xpath = ".//*[@id='CancellationWizard:CancellationWizard_QuoteScreen:Quote_SummaryDV:Taxes-inputEl']")
    WebElementFacade inputImpuestoIva;
    @FindBy(xpath = ".//*[@id='CancellationWizard:CancellationWizard_QuoteScreen:Quote_SummaryDV:TotalCost-inputEl']")
    WebElementFacade inputCostoTotal;
    @FindBy(xpath = ".//*[@id='CancellationWizard:CancellationWizard_QuoteScreen:Quote_SummaryDV:TotalCost-inputEl']")
    WebElementFacade inputCambioDeCosto;
    @FindBy(xpath = ".//*[@id='CancellationWizard:CancellationWizard_QuoteScreen:JobWizardToolbarButtonSet:CloseOptions-btnInnerEl']")
    WebElementFacade btnOpcionDeCierre;
    @FindBy(xpath = ".//*[@id='CancellationWizard:CancellationWizard_QuoteScreen:JobWizardToolbarButtonSet:CloseOptions:WithdrawJob']")
    WebElementFacade btnRetirarTransaccion;
    @FindBy(xpath = ".//*[@id='button-1005-btnInnerEl']")
    WebElementFacade btnAceptarRetirarTransaccion;

    InicioCancelacionPage inicioCancelacionPage;
    ReglasRenovacionDosPage reglasRenovacionDosPage;
    PageUtil cm = new PageUtil(getDriver());

    public CotizacionDeCancelacionPage(WebDriver driver) {
        super(driver);
    }



    public void ingresaDatosFormulario() {
        cm.selectItem(inicioCancelacionPage.txtMotivo, "Por pérdida total");
        cm.waitUntil(1000);
        inicioCancelacionPage.txtDescripMotivo.click();
        inicioCancelacionPage.txtDescripMotivo.sendKeys("Motivo");
        btnIniciarCancelacion.click();
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(inputNumPoliza).waitUntilClickable();
    }

    public void validacionesCamposPoliza() {
        MatcherAssert.assertThat("Error, no se encuentra número de póliza", inputNumPoliza.isVisible());
        MatcherAssert.assertThat("Error, no se encuentra número de cotización", inputNumCotizacion.isVisible());
        MatcherAssert.assertThat("Error, no se encuentra vigencia de la póliza", inputVigenciaPoliza.isVisible());
        MatcherAssert.assertThat("Error, no se encuentra tomador", inputTomador.isVisible());
        MatcherAssert.assertThat("Error, no se encuentra tipo documento", inputTipoDocumento.isVisible());
        MatcherAssert.assertThat("Error, no se encuentra número documento", inputNumDocumento.isVisible());
        MatcherAssert.assertThat("Error, no se encuentra fecha de vigencia de la transacción", inputFechaVigenciaTransacc.isVisible());
        MatcherAssert.assertThat("Error, no se encuentra prima total", inputPrimaTotal.isVisible());
        MatcherAssert.assertThat("Error, no se encuentra impuestos", inputImpuestoIva.isVisible());
        MatcherAssert.assertThat("Error, no se encuentra costo total", inputCostoTotal.isVisible());
        MatcherAssert.assertThat("Error, no se encuentra cambio del costo", inputCambioDeCosto.isVisible());
        MatcherAssert.assertThat("El valor debe ser cero",  "$0".equals(inputCambioDeCosto.getText()));
        cerrarTransaccionPoliza();
    }

    public void cerrarTransaccionPoliza() {
        btnOpcionDeCierre.click();
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(btnRetirarTransaccion).waitUntilClickable();
        btnRetirarTransaccion.click();
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(btnAceptarRetirarTransaccion).waitUntilClickable();
        btnAceptarRetirarTransaccion.click();
        cm.waitUntil(1000);
    }


}
