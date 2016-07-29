package com.sura.policycenter.selenium.pages;

import com.google.common.base.Function;
import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class ModificacionCotizacionDePolizaPage extends PageObject{

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(ModificacionCotizacionDePolizaPage.class);

    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:ttlBar']")
    private WebElementFacade tituloDePagina;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:PolicyNumber-labelEl']")
    private WebElementFacade labelNumeroPoliza;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:JobNumber-labelEl']")
    private WebElementFacade labelNumeroCotizacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:PolicyPeriod-labelEl']")
    private WebElementFacade labelVigenciaPoliza;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:Insured-labelEl']")
    private WebElementFacade labelTomador;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:DocumentType-labelEl']")
    private WebElementFacade labelTipoDocumento;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:DocumentNumber-labelEl']")
    private WebElementFacade labelNumeroDocumento;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:PolicyAddress:PolicyAddressDisplayInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-labelEl']")
    private WebElementFacade labelDireccion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:PolicyAddress:PolicyAddressDisplayInputSet:AddressType-labelEl']")
    private WebElementFacade labelTipoDireccion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:PolicyAddress:PolicyAddressDisplayInputSet:AddressDescription-labelEl']")
    private WebElementFacade labelDescripcionDireccion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:UWCompany-labelEl']")
    private WebElementFacade labelEmpresaAseguradora;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:TotalPremium-labelEl']")
    private WebElementFacade labelPrimaTotal;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:Taxes-labelEl']")
    private WebElementFacade labelImpuestos;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:TotalCost-labelEl']")
    private WebElementFacade labelCostoTotal;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:PolicyNumber-inputEl']")
    private WebElementFacade campoNumeroDePoliza;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:JobNumber-inputEl']")
    private WebElementFacade campoNumeroDeCotizacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:PolicyPeriod-inputEl']")
    private WebElementFacade campoVigenciaDePoliza;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:Insured-inputEl']")
    private WebElementFacade campoTomador;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:DocumentType-inputEl']")
    private WebElementFacade campoTipoDocumento;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:DocumentNumber-inputEl']")
    private WebElementFacade campoNumeroDocumento;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:PolicyAddress:PolicyAddressDisplayInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-inputEl']")
    private WebElementFacade campoDireccion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:PolicyAddress:PolicyAddressDisplayInputSet:AddressType-inputEl']")
    private WebElementFacade campoTipoDireccion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:PolicyAddress:PolicyAddressDisplayInputSet:AddressDescription-inputEl']")
    private WebElementFacade campoDescripcionDireccion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:UWCompany-inputEl']")
    private WebElementFacade campoEmpresaAseguradora;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:TotalPremium-inputEl']")
    private WebElementFacade campoPrimaTotal;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:Taxes-inputEl']")
    private WebElementFacade campoImpuestosYCargos;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:TotalCost-inputEl']")
    private WebElementFacade campoCostoTotal;

    @org.openqa.selenium.support.FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:1']")
    private WebElementFacade labelVehiculo;
    @org.openqa.selenium.support.FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:LicensePlate-labelEl']")
    private WebElementFacade labelPlaca;
    @org.openqa.selenium.support.FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:FasecoldaCode-labelEl']")
    private WebElementFacade labelCodigoFasecolda;
    @org.openqa.selenium.support.FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:FasecoldaCode-inputEl']")
    private WebElementFacade inputCodigoFasecolda;
    @org.openqa.selenium.support.FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:Make-labelEl']")
    private WebElementFacade labelMarca;
    @org.openqa.selenium.support.FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:Make-inputEl']")
    private WebElementFacade inputMarca;
    @org.openqa.selenium.support.FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:Year-labelEl']")
    private WebElementFacade labelModelo;
    @org.openqa.selenium.support.FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:Year-inputEl']")
    private WebElementFacade inputModelo;
    @org.openqa.selenium.support.FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:Line-labelEl']")
    private WebElementFacade labelLinea;
    @org.openqa.selenium.support.FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:Line-inputEl']")
    private WebElementFacade inputLinea;
    @org.openqa.selenium.support.FindBy(xpath = ".//td[2]/div/div/div/div/div/div/span")
    private WebElementFacade labelDescripcionCobertura;
    @org.openqa.selenium.support.FindBy(xpath = ".//div/div/div[2]/div/span")
    private WebElementFacade labelValorTerminoCobertura;
    @org.openqa.selenium.support.FindBy(xpath = ".//div[7]/div/span")
    private WebElementFacade labelPrima;
    @org.openqa.selenium.support.FindBy(xpath = ".//tfoot/tr/td/div")
    private WebElementFacade labelSubtotal;
    @org.openqa.selenium.support.FindBy(xpath = ".//div[2]/div/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/table/tbody/tr/td/div/table/tbody/tr/td/div/table/tbody/tr/td[2]/div/div[2]/div/table/tbody/tr/td/div")
    private WebElementFacade labelSubtotalPrimas;
    @org.openqa.selenium.support.FindBy(xpath = ".//div[2]/div/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/table/tbody/tr/td/div/table/tbody/tr/td/div/table/tbody/tr/td[2]/div/div[2]/div/table/tbody/tr[2]/td/div")
    private WebElementFacade labelImpuesto;
    @org.openqa.selenium.support.FindBy(xpath = ".//td[2]/div/div[2]/div/table")
    private WebElementFacade tablaCoberturas;
    @org.openqa.selenium.support.FindBy(xpath = ".//td[@id='PolicyChangeWizard:LOBWizardStepGroup:PALine']/div/span")
    private WebElementFacade botonCoberturasPA;
    @org.openqa.selenium.support.FindBy(xpath = ".//td[@id='PolicyChangeWizard:ViewQuote']/div")
    private WebElementFacade botonCotizacion;

    @org.openqa.selenium.support.FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:PolicyChangeWizard_Quote_TransactionCardTab-btnInnerEl']")
    private WebElementFacade botonDetalleCambioCosto;
    @org.openqa.selenium.support.FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:RatingTxDetailsPanelSet:0:2']")
    private WebElementFacade labelDCVehiculo;
    @org.openqa.selenium.support.FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:RatingTxDetailsPanelSet:0:LicensePlate-labelEl']")
    private WebElementFacade labelDCPlaca;
    @org.openqa.selenium.support.FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:RatingTxDetailsPanelSet:0:FasecoldaCode-labelEl']")
    private WebElementFacade labelDCCodigoFasecolda;
    @org.openqa.selenium.support.FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:RatingTxDetailsPanelSet:0:FasecoldaCode-inputEl']']")
    private WebElementFacade inputDCCodigoFasecolda;
    @org.openqa.selenium.support.FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:RatingTxDetailsPanelSet:0:Make-labelEl']")
    private WebElementFacade labelDCMarca;
    @org.openqa.selenium.support.FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:RatingTxDetailsPanelSet:0:Make-inputEl']")
    private WebElementFacade inputDCMarca;
    @org.openqa.selenium.support.FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:RatingTxDetailsPanelSet:0:Year-labelEl']")
    private WebElementFacade labelDCModelo;
    @org.openqa.selenium.support.FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:RatingTxDetailsPanelSet:0:Year-inputEl']")
    private WebElementFacade inputDCModelo;
    @org.openqa.selenium.support.FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:RatingTxDetailsPanelSet:0:Line-labelEl']")
    private WebElementFacade labelDCLinea;
    @org.openqa.selenium.support.FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:RatingTxDetailsPanelSet:0:Line-inputEl']")
    private WebElementFacade inputDCLinea;
    @org.openqa.selenium.support.FindBy(xpath = ".//td[2]/div/div/div/div/div/div/span")
    private WebElementFacade labelDCDescripcionCobertura;
    @org.openqa.selenium.support.FindBy(xpath = ".//div[6]/div/span")
    private WebElementFacade labelDCPrima;
    @org.openqa.selenium.support.FindBy(xpath = ".//tfoot/tr/td/div")
    private WebElementFacade labelDCSubtotal;
    @org.openqa.selenium.support.FindBy(xpath = ".//tr[4]/td/div/table/tbody/tr/td/div/table/tbody/tr/td/div/table/tbody/tr/td[2]/div/div[2]/div/table/tbody/tr/td/div")
    private WebElementFacade labelDCSubtotalPrimas;
    @org.openqa.selenium.support.FindBy(xpath = ".//tr[4]/td/div/table/tbody/tr/td/div/table/tbody/tr/td/div/table/tbody/tr/td[2]/div/div[2]/div/table/tbody/tr[2]/td/div")
    private WebElementFacade labelDCImpuesto;

    public ModificacionCotizacionDePolizaPage(WebDriver driver){
        super(driver);
    }

    public void verDetalleCotizacion() {
        waitForTextToAppear("Cotización",5000);
        setImplicitTimeout(2, TimeUnit.SECONDS);
        if(tituloDePagina.isPresent()){
            waitForTextToAppear(tituloDePagina.getText(),2000);
            MatcherAssert.assertThat(tituloDePagina.getText(), Is.is(Matchers.equalTo("Cotización")));
        }
        resetImplicitTimeout();
    }

    public void validarInformacionCotizacion(Map<String, String> infoCotizacionPoliza, ExamplesTable informacionCotizacion) {
        withTimeoutOf(15,TimeUnit.SECONDS).waitFor(campoNumeroDeCotizacion).shouldBePresent();
        Map<String, String> datosCotizacion;
        MatcherAssert.assertThat(labelNumeroPoliza.getText(), Is.is(Matchers.equalTo(infoCotizacionPoliza.get("numeroPoliza"))));
        MatcherAssert.assertThat(labelNumeroCotizacion.getText(), Is.is(Matchers.equalTo(infoCotizacionPoliza.get("numeroCotizacion"))));
        MatcherAssert.assertThat(labelVigenciaPoliza.getText(), Is.is(Matchers.equalTo(infoCotizacionPoliza.get("vigenciaPoliza"))));
        MatcherAssert.assertThat(labelTomador.getText(), Is.is(Matchers.equalTo(infoCotizacionPoliza.get("tomador"))));
        MatcherAssert.assertThat(labelTipoDocumento.getText(), Is.is(Matchers.equalTo(infoCotizacionPoliza.get("tipoDocumento"))));
        MatcherAssert.assertThat(labelNumeroDocumento.getText(), Is.is(Matchers.equalTo(infoCotizacionPoliza.get("numeroDocumento"))));
        MatcherAssert.assertThat(labelDireccion.getText(), Is.is(Matchers.equalTo(infoCotizacionPoliza.get("direccion"))));
        MatcherAssert.assertThat(labelTipoDireccion.getText(), Is.is(Matchers.equalTo(infoCotizacionPoliza.get("tipoDireccion"))));
        MatcherAssert.assertThat(labelDescripcionDireccion.getText(), Is.is(Matchers.equalTo(infoCotizacionPoliza.get("descripcionDireccion"))));
        MatcherAssert.assertThat(labelEmpresaAseguradora.getText(), Is.is(Matchers.equalTo(infoCotizacionPoliza.get("empresaAseguradora"))));
        MatcherAssert.assertThat(labelPrimaTotal.getText(), Is.is(Matchers.equalTo(infoCotizacionPoliza.get("primaTotal"))));
        MatcherAssert.assertThat(labelImpuestos.getText(), Is.is(Matchers.equalTo(infoCotizacionPoliza.get("impuestos"))));
        MatcherAssert.assertThat(labelCostoTotal.getText(), Is.is(Matchers.equalTo(infoCotizacionPoliza.get("costoTotal"))));

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

    public void validarInformacionDetalleCotizacion(Map<String, String> infoDetalleCotizacion) {
        String validacion = null;
        try{
            MatcherAssert.assertThat(labelVehiculo.getText(), Is.is(Matchers.equalTo(infoDetalleCotizacion.get("labelVehiculo"))));
            MatcherAssert.assertThat(labelPlaca.getText(), Is.is(Matchers.equalTo(infoDetalleCotizacion.get("placa"))));
            MatcherAssert.assertThat(labelCodigoFasecolda.getText(), Is.is(Matchers.equalTo(infoDetalleCotizacion.get("codigoFasecolda"))));
            MatcherAssert.assertThat(labelMarca.getText(), Is.is(Matchers.equalTo(infoDetalleCotizacion.get("marca"))));
            MatcherAssert.assertThat(labelModelo.getText(), Is.is(Matchers.equalTo(infoDetalleCotizacion.get("modelo"))));
            MatcherAssert.assertThat(labelLinea.getText(), Is.is(Matchers.equalTo(infoDetalleCotizacion.get("linea"))));
            MatcherAssert.assertThat(labelDescripcionCobertura.getText(), Is.is(Matchers.equalTo(infoDetalleCotizacion.get("descripcion"))));
            MatcherAssert.assertThat(labelValorTerminoCobertura.getText(), Is.is(Matchers.equalTo(infoDetalleCotizacion.get("valorTermino"))));
            MatcherAssert.assertThat(labelPrima.getText(), Is.is(Matchers.equalTo(infoDetalleCotizacion.get("prima"))));
            MatcherAssert.assertThat(labelSubtotal.getText(), Is.is(Matchers.equalTo(infoDetalleCotizacion.get("subtotal"))));
            MatcherAssert.assertThat(labelSubtotalPrimas.getText(), Is.is(Matchers.equalTo(infoDetalleCotizacion.get("subtotalPrimas"))));
            MatcherAssert.assertThat(labelImpuesto.getText(), Matchers.containsString(infoDetalleCotizacion.get("impuesto")));

        }catch (Exception e){
            LOGGER.error(validacion, e);
            validacion = e.getMessage();
        }

        MatcherAssert.assertThat(validacion, Is.is(Matchers.equalTo(null)));
    }

    public void validarDireccion(String direccion) {
        MatcherAssert.assertThat(campoDireccion.getText(), Is.is(Matchers.equalTo(direccion)));
    }

    public void validarDireccionTomador(String direccion) {
        withTimeoutOf(10,TimeUnit.SECONDS).waitFor(campoDireccion).shouldBePresent();
        MatcherAssert.assertThat(campoDireccion.getText(), Is.is(Matchers.equalTo(direccion)));
    }

    public void validarTerminoCobertura() {

        waitFor(tablaCoberturas).shouldBeVisible();
        List<WebElement> allRows = tablaCoberturas.findElements(By.tagName("tr"));
        waitABit(1000);
        String validacion = null;
        Map<String,String> coberturas = new HashMap<>();
        Map<String,String> terminoCoberturas = new HashMap<>();
        try {

            int i=0;
            for (WebElement row : allRows) {
                List<WebElement> cells = row.findElements(By.tagName("td"));
                String descCob = cells.get(0).getText();
                String terminoCob = cells.get(1).getText();
                if(!terminoCob.equals("-")) {
                    i++;
                    terminoCoberturas.put("dato" + i, terminoCob);
                }
            }

            waitFor(botonCoberturasPA).shouldBeVisible();
            botonCoberturasPA.click();
            waitForTextToAppear("Coberturas de auto personal",1000);

            for(int j=1; j<=i; j++){
                WebElementFacade coberturaAuto= findBy(".//div[contains(.,'"+terminoCoberturas.get("dato"+j)+"')]");
                waitFor(coberturaAuto).shouldBeVisible();
                MatcherAssert.assertThat(coberturaAuto.getText(), Is.is(Matchers.notNullValue()));
            }

            waitFor(botonCotizacion).shouldBeVisible();
            botonCotizacion.click();
            waitForTextToAppear("Cotización",1000);

        }catch(Exception e) {
            LOGGER.error("This is error", e);
            validacion = e.getMessage();
        }

        MatcherAssert.assertThat(validacion, Is.is(Matchers.equalTo(null)));
    }

    public void validarDetallesCosto(Map<String, String> infoDetalleCotizacion){

        String validacion = null;
        waitFor(botonDetalleCambioCosto).shouldBeVisible();
        botonDetalleCambioCosto.click();
        withTimeoutOf(10,TimeUnit.SECONDS).waitFor(botonDetalleCambioCosto).shouldBePresent();
        try{
            MatcherAssert.assertThat(labelDCVehiculo.getText(), Is.is(Matchers.equalTo(infoDetalleCotizacion.get("DC_labelVehiculo"))));
            MatcherAssert.assertThat(labelDCPlaca.getText(), Is.is(Matchers.equalTo(infoDetalleCotizacion.get("DC_placa"))));
            MatcherAssert.assertThat(labelDCCodigoFasecolda.getText(), Is.is(Matchers.equalTo(infoDetalleCotizacion.get("DC_codigoFasecolda"))));
            MatcherAssert.assertThat(labelDCMarca.getText(), Is.is(Matchers.equalTo(infoDetalleCotizacion.get("DC_marca"))));
            MatcherAssert.assertThat(labelDCModelo.getText(), Is.is(Matchers.equalTo(infoDetalleCotizacion.get("DC_modelo"))));
            MatcherAssert.assertThat(labelDCLinea.getText(), Is.is(Matchers.equalTo(infoDetalleCotizacion.get("DC_linea"))));
            MatcherAssert.assertThat(labelDCDescripcionCobertura.getText(), Is.is(Matchers.equalTo(infoDetalleCotizacion.get("DC_descripcion"))));
            MatcherAssert.assertThat(labelDCPrima.getText(), Is.is(Matchers.equalTo(infoDetalleCotizacion.get("DC_prima"))));
            MatcherAssert.assertThat(labelDCSubtotal.getText(), Is.is(Matchers.equalTo(infoDetalleCotizacion.get("DC_subtotal"))));
            MatcherAssert.assertThat(labelDCSubtotalPrimas.getText(), Is.is(Matchers.equalTo(infoDetalleCotizacion.get("DC_subtotalPrimas"))));
            MatcherAssert.assertThat(labelDCImpuesto.getText(), Matchers.containsString(infoDetalleCotizacion.get("DC_impuesto")));
        }catch (Exception e){
            LOGGER.error(validacion, e);
            validacion = e.getMessage();
        }

        MatcherAssert.assertThat(validacion, Is.is(Matchers.equalTo(null)));
    }

    public WebElementFacade esperarElemento(final String xpath) {
        Wait<WebDriver> espera = new FluentWait<WebDriver>(getDriver())
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        return  espera.until(new Function<WebDriver, WebElementFacade>() {
            public WebElementFacade apply(WebDriver driver) {
                return findBy(xpath);
            }
        });
    }
}
