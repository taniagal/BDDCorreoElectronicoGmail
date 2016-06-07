package com.sura.policycenter.selenium.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class CotizacionDePolizaPage extends PageObject{

    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:ttlBar']")
    private WebElementFacade tituloDePagina;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:JobNumber-inputEl']")
    private WebElementFacade campoNumeroDeCotizacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:PolicyPeriod-inputEl']")
    private WebElementFacade campoVigenciaDePoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:Insured-inputEl']")
    private WebElementFacade campoTomador;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:ID:OfficialIDInputSet:DocumentType-inputEl']")
    private WebElementFacade campoTipoDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:ID:OfficialIDInputSet:OfficialIDDV_Input-inputEl']")
    private WebElementFacade campoNumeroDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:PolicyAddress:PolicyAddressDisplayInputSet:Address-inputEl']")
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
    private WebElementFacade campoImpuestosYCargos;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:TotalCost-inputEl']")
    private WebElementFacade campoCostoTotal;


    public CotizacionDePolizaPage(WebDriver driver){
        super(driver);
    }

    public void verDetalleCotizacion() {
        waitFor(tituloDePagina).shouldBeVisible();
        MatcherAssert.assertThat(tituloDePagina.getText(), Is.is(Matchers.equalTo("Cotización")));
    }

    public void validarInformacionCotizacion(ExamplesTable informacionCotizacion) {
        waitFor(campoNumeroDeCotizacion).shouldBeVisible();
        Map<String, String> datosCotizacion;
        if (campoNumeroDeCotizacion.getText().equals(informacionCotizacion.getRows().get(0).get("numeroCotizacion"))) {
            datosCotizacion = informacionCotizacion.getRows().get(0);
        }
        else{
            datosCotizacion = informacionCotizacion.getRows().get(1);
        }
        MatcherAssert.assertThat(campoNumeroDeCotizacion.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("numeroCotizacion"))));
        MatcherAssert.assertThat(campoTomador.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("tomador"))));
        MatcherAssert.assertThat(campoTipoDocumento.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("tipoDocumento"))));
        MatcherAssert.assertThat(campoNumeroDocumento.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("numeroDocumento"))));
        MatcherAssert.assertThat(campoDireccion.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("direccion"))));
        MatcherAssert.assertThat(campoTipoDireccion.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("tipoDireccion"))));
        MatcherAssert.assertThat(campoDescripcionDireccion.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("descripcionDireccion"))));
        MatcherAssert.assertThat(campoEmpresaAseguradora.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("empresaAseguradora"))));
        MatcherAssert.assertThat(campoPrimaTotal.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("prima"))));
        MatcherAssert.assertThat(campoImpuestosYCargos.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("impuestos"))));
        MatcherAssert.assertThat(campoCostoTotal.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("total"))));
        MatcherAssert.assertThat(campoVigenciaDePoliza.getText(), Is.is(Matchers.notNullValue()));
    }

    public void validarDireccion(String direccion) {
        MatcherAssert.assertThat(campoDireccion.getText(), Is.is(Matchers.equalTo(direccion)));
    }
}
