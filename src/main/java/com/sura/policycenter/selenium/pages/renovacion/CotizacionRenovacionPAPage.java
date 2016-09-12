package com.sura.policycenter.selenium.pages.renovacion;

import com.sura.commons.selenium.Commons;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class CotizacionRenovacionPAPage extends Commons{

    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:ttlBar']")
    private WebElementFacade labelCotizacion;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:Quote_SummaryDV:PolicyNumber-inputEl']")
    private WebElementFacade campoNumeroPoliza;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:Quote_SummaryDV:JobNumber-inputEl']")
    private WebElementFacade campoNumeroRenovacion;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:Quote_SummaryDV:Insured-inputEl']")
    private WebElementFacade campoTomador;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:Quote_SummaryDV:DocumentType-inputEl']")
    private WebElementFacade campoTipoDocumento;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:Quote_SummaryDV:DocumentNumber-inputEl']")
    private WebElementFacade campoNumeroDocumento;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:Quote_SummaryDV:PolicyAddress:PolicyAddressDisplayInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-inputEl']")
    private WebElementFacade campoDireccion;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:Quote_SummaryDV:PolicyAddress:PolicyAddressDisplayInputSet:AddressType-inputEl']")
    private WebElementFacade campoTipoDireccion;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:Quote_SummaryDV:PolicyAddress:PolicyAddressDisplayInputSet:AddressDescription-inputEl']")
    private WebElementFacade campoDescripcionDireccion;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:Quote_SummaryDV:UWCompany-inputEl']")
    private WebElementFacade campoEmpresaAseguradora;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:Quote_SummaryDV:TotalPremium-inputEl']")
    private WebElementFacade campoPrimaTotal;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:Quote_SummaryDV:Taxes-inputEl']")
    private WebElementFacade campoImpuestos;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:Quote_SummaryDV:TotalCost-inputEl']")
    private WebElementFacade campoCostoTotal;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:LicensePlate-inputEl']")
    private WebElementFacade campoPlaca;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:FasecoldaCode-inputEl']")
    private WebElementFacade campoFasecolda;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:Make-inputEl']")
    private WebElementFacade campoMarca;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:Year-inputEl']")
    private WebElementFacade campoModelo;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:Line-inputEl']")
    private WebElementFacade campoLinea;
    @FindBy(xpath = ".//td[2]/div/div[2]/div/table/tbody/tr/td/div")
    private WebElementFacade campoCobertura;
    @FindBy(xpath = ".//tr[2]/td[2]/div")
    private WebElementFacade campoValorTermino;
    @FindBy(xpath = ".//tr[3]/td[2]/div")
    private WebElementFacade campoDeducible;
    @FindBy(xpath = ".//div[2]/div/table/tbody/tr/td[3]/div")
    private WebElementFacade campoPrima;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:costLV:VehicleSubTotal']")
    private WebElementFacade campoSubtotalSumaPrimas;
    @FindBy(xpath = "//tr[3]/td/div/table/tbody/tr/td/div/table/tbody/tr/td/div/table/tbody/tr/td/div/table/tbody/tr/td[2]/div/div[2]/div/table/tbody/tr/td[2]/div")
    private WebElementFacade campoSubtotalPrimas;

    public CotizacionRenovacionPAPage (WebDriver driver){
        super(driver);
    }

    public void verDetalleCotizacion() {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(labelCotizacion).shouldBeVisible();
        MatcherAssert.assertThat(labelCotizacion.getText(), Is.is(Matchers.equalTo("Cotización")));
    }

    public void validarDetalleCotizacion(ExamplesTable detalleCotizacion) {
        Map<String, String> cotizacion = detalleCotizacion.getRows().get(0);
        MatcherAssert.assertThat(campoPlaca.getText(), Matchers.containsString(cotizacion.get("placa")));
        MatcherAssert.assertThat(campoModelo.getText(), Matchers.containsString(cotizacion.get("modelo")));
        MatcherAssert.assertThat(campoFasecolda.getText(), Matchers.containsString(cotizacion.get("codigoFasecolda")));
        MatcherAssert.assertThat(campoMarca.getText(), Matchers.containsString(cotizacion.get("marca")));
        MatcherAssert.assertThat(campoLinea.getText(), Matchers.containsString(cotizacion.get("linea")));
    }

    public void validarDetallePorCobertura(ExamplesTable detalleCobertura) {
        Map<String, String> cobertura = detalleCobertura.getRows().get(0);
        MatcherAssert.assertThat(campoCobertura.getText(), Matchers.containsString(cobertura.get("cobertura")));
        MatcherAssert.assertThat(campoValorTermino.getText(), Matchers.containsString(cobertura.get("terminoCobertura")));
        MatcherAssert.assertThat(campoPrima.getText(), Matchers.containsString(cobertura.get("prima")));
        MatcherAssert.assertThat(campoSubtotalSumaPrimas.getText(), Matchers.containsString(cobertura.get("subtotal")));
        MatcherAssert.assertThat(campoSubtotalPrimas.getText(), Matchers.containsString(cobertura.get("subtotalPrimas")));
    }

    public void validarDireccionTomador(ExamplesTable direccion) {
        Map<String, String> direccionTomador = direccion.getRows().get(0);
        MatcherAssert.assertThat(campoDireccion.getText(), Is.is(Matchers.equalTo(direccionTomador.get("direccion"))));
    }

    public void validarValorTermino(ExamplesTable valorTermino) {
        Map<String, String> terminoCobertura = valorTermino.getRows().get(0);
        MatcherAssert.assertThat(campoValorTermino.getText(), Is.is(Matchers.equalTo(terminoCobertura.get("limite"))));
        MatcherAssert.assertThat(campoDeducible.getText(), Is.is(Matchers.equalTo(terminoCobertura.get("deducible"))));
    }

    public void validarInformacionGeneralRenovacion(ExamplesTable informacionGeneral) {
        Map<String, String> informacionRenovacion = informacionGeneral.getRows().get(0);
        MatcherAssert.assertThat(campoNumeroPoliza.getText(), Is.is(Matchers.equalTo(informacionRenovacion.get("numeroPoliza"))));
        MatcherAssert.assertThat(campoNumeroRenovacion.getText(), Is.is(Matchers.equalTo(informacionRenovacion.get("numeroRenovacion"))));
        MatcherAssert.assertThat(campoTomador.getText(), Is.is(Matchers.equalTo(informacionRenovacion.get("tomador"))));
        MatcherAssert.assertThat(campoTipoDocumento.getText(), Is.is(Matchers.equalTo(informacionRenovacion.get("tipoDocumento"))));
        MatcherAssert.assertThat(campoNumeroDocumento.getText(), Is.is(Matchers.equalTo(informacionRenovacion.get("numeroDocumento"))));
        MatcherAssert.assertThat(campoDireccion.getText(), Is.is(Matchers.equalTo(informacionRenovacion.get("direccion"))));
        MatcherAssert.assertThat(campoTipoDireccion.getText(), Is.is(Matchers.equalTo(informacionRenovacion.get("tipoDireccion"))));
        MatcherAssert.assertThat(campoDescripcionDireccion.getText(), Is.is(Matchers.equalTo(informacionRenovacion.get("descripcionDireccion"))));
        MatcherAssert.assertThat(campoEmpresaAseguradora.getText(), Is.is(Matchers.equalTo(informacionRenovacion.get("empresaAseguradora"))));
        MatcherAssert.assertThat(campoPrimaTotal.getText(), Is.is(Matchers.equalTo(informacionRenovacion.get("primaTotal"))));
        MatcherAssert.assertThat(campoImpuestos.getText(), Is.is(Matchers.equalTo(informacionRenovacion.get("impuestos"))));
        MatcherAssert.assertThat(campoCostoTotal.getText(), Is.is(Matchers.equalTo(informacionRenovacion.get("costoTotal"))));
    }
}