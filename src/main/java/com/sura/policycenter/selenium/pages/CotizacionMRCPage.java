package com.sura.policycenter.selenium.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class CotizacionMRCPage extends PageObject {

    private final Actions act = new Actions(getDriver());

    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab-btnWrap']")
    private WebElementFacade menuPoliza;
    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab:PolicyTab_SubmissionNumberSearchItem-inputEl']")
    private WebElementFacade buscarCotizacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:ttlBar']")
    private WebElementFacade tituloPagina;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:JobNumber-labelEl']")
    private WebElementFacade labelNumeroCotizacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:PolicyPeriod-labelEl']")
    private WebElementFacade labelVigenciaPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:Insured-labelEl']")
    private WebElementFacade labelTomador;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:DocumentType-labelEl']")
    private WebElementFacade labelTipoDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:DocumentNumber-labelEl']")
    private WebElementFacade labelNumeroDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:PolicyAddress:PolicyAddressDisplayInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-labelEl']")
    private WebElementFacade labelDireccion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:PolicyAddress:PolicyAddressDisplayInputSet:AddressType-labelEl']")
    private WebElementFacade labelTipoDireccion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:PolicyAddress:PolicyAddressDisplayInputSet:AddressDescription-labelEl']")
    private WebElementFacade labelDescripcionDireccion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:UWCompany-labelEl']")
    private WebElementFacade labelEmpresaAseguradora;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:TotalPremium-labelEl']")
    private WebElementFacade labelPrimaTotal;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:Taxes-labelEl']")
    private WebElementFacade labelImpuestos;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:TotalCost-labelEl']")
    private WebElementFacade labelCostoTotal;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:JobNumber-inputEl']")
    private WebElementFacade campoNumeroCotizacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:PolicyPeriod-inputEl']")
    private WebElementFacade campoVigenciaPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:Insured-inputEl']")
    private WebElementFacade campoTomador;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:DocumentType-inputEl']")
    private WebElementFacade campoTipoDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:DocumentNumber-inputEl']")
    private WebElementFacade campoNumeroDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:PolicyAddress:PolicyAddressDisplayInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-inputEl']")
    private WebElementFacade campoDireccion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:PolicyAddress:PolicyAddressDisplayInputSet:AddressType-inputEl']")
    private WebElementFacade campoTipoDireccion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:PolicyAddress:PolicyAddressDisplayInputSet:AddressDescription-inputEl']")
    private WebElementFacade campoDescripcionDireccion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:UWCompany-inputEl']")
    private WebElementFacade campoEmpresaAseguradora;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:TotalPremium-inputEl']")
    private WebElementFacade campoPrimaTotal;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:Taxes-inputEl']")
    private WebElementFacade campoImpuestos;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:TotalCost-inputEl']")
    private WebElementFacade campoCostoTotal;

    public CotizacionMRCPage(WebDriver driver){
        super(driver);
    }

    public void irABuscarCotizacion(String cotizacion) {
        withTimeoutOf(15,TimeUnit.SECONDS).waitFor(menuPoliza).shouldBePresent();
        menuPoliza.click();
        menuPoliza.click();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        buscarCotizacion.typeAndEnter(cotizacion);
    }

    public void verDetalleCotizacion() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(tituloPagina).shouldBePresent();
        MatcherAssert.assertThat(tituloPagina.getText(), Is.is(Matchers.equalTo("Cotización")));
    }

    public void validarInformacionCotizacion(Map<String, String> labelsCotizacionPoliza, ExamplesTable informacionCotizacion) {
        withTimeoutOf(10,TimeUnit.SECONDS).waitFor(labelNumeroCotizacion).shouldBeVisible();
        Map<String, String> datosCotizacion;
        MatcherAssert.assertThat(labelNumeroCotizacion.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("numeroCotizacion"))));
        MatcherAssert.assertThat(labelVigenciaPoliza.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("vigenciaPoliza"))));
        MatcherAssert.assertThat(labelTomador.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("tomador"))));
        MatcherAssert.assertThat(labelTipoDocumento.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("tipoDocumento"))));
        MatcherAssert.assertThat(labelNumeroDocumento.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("numeroDocumento"))));
        MatcherAssert.assertThat(labelDireccion.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("direccion"))));
        MatcherAssert.assertThat(labelTipoDireccion.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("tipoDireccion"))));
        MatcherAssert.assertThat(labelDescripcionDireccion.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("descripcionDireccion"))));
        MatcherAssert.assertThat(labelEmpresaAseguradora.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("empresaAseguradora"))));
        MatcherAssert.assertThat(labelPrimaTotal.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("primaTotal"))));
        MatcherAssert.assertThat(labelImpuestos.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("impuestos"))));
        MatcherAssert.assertThat(labelCostoTotal.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("costoTotal"))));

        if (campoNumeroCotizacion.getText().equals(informacionCotizacion.getRows().get(0).get("numeroCotizacion"))) {
            datosCotizacion = informacionCotizacion.getRows().get(0);
        }
        else{
            datosCotizacion = informacionCotizacion.getRows().get(1);
        }
        MatcherAssert.assertThat(campoNumeroCotizacion.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("numeroCotizacion"))));
        MatcherAssert.assertThat(campoVigenciaPoliza.getText(), Is.is(Matchers.notNullValue()));
        MatcherAssert.assertThat(campoTomador.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("tomador"))));
        MatcherAssert.assertThat(campoTipoDocumento.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("tipoDocumento"))));
        MatcherAssert.assertThat(campoNumeroDocumento.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("numeroDocumento"))));
        MatcherAssert.assertThat(campoDireccion.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("direccion"))));
        MatcherAssert.assertThat(campoTipoDireccion.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("tipoDireccion"))));
        MatcherAssert.assertThat(campoDescripcionDireccion.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("descripcionDireccion"))));
        MatcherAssert.assertThat(campoEmpresaAseguradora.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("empresaAseguradora"))));
        MatcherAssert.assertThat(campoPrimaTotal.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("prima"))));
        MatcherAssert.assertThat(campoImpuestos.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("impuestos"))));
        MatcherAssert.assertThat(campoCostoTotal.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("total"))));
    }
}
