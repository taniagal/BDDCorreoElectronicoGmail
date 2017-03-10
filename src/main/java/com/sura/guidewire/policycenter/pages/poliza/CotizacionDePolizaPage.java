package com.sura.guidewire.policycenter.pages.poliza;

import com.google.common.base.Function;
import com.sura.guidewire.policycenter.resources.PageUtil;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class CotizacionDePolizaPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PreQualificationScreen:ttlBar']")
    private WebElementFacade titulo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:ttlBar']")
    private WebElementFacade tituloDePagina;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PreQualificationScreen:ttlBar']")
    private WebElementFacade tituloCalificacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:ttlBar']")
    private WebElementFacade tituloCotizacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:JobNumber-labelEl']")
    public WebElementFacade labelNumeroCotizacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:PolicyPeriod-labelEl']")
    public WebElementFacade labelVigenciaPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:Insured-labelEl']")
    public WebElementFacade labelTomador;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:DocumentType-labelEl']")
    public WebElementFacade labelTipoDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:DocumentNumber-labelEl']")
    public WebElementFacade labelNumeroDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:PolicyAddress:PolicyAddressDisplayInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-labelEl']")
    public WebElementFacade labelDireccion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:PolicyAddress:PolicyAddressDisplayInputSet:AddressType-labelEl']")
    public WebElementFacade labelTipoDireccion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:PolicyAddress:PolicyAddressDisplayInputSet:AddressDescription-labelEl']")
    public WebElementFacade labelDescripcionDireccion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:UWCompany-labelEl']")
    private WebElementFacade labelEmpresaAseguradora;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:TotalPremium-labelEl']")
    public WebElementFacade labelPrimaTotal;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:Taxes-labelEl']")
    public WebElementFacade labelImpuestos;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:TotalCost-labelEl']")
    public WebElementFacade labelCostoTotal;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:JobNumber-inputEl']")
    public WebElementFacade campoNumeroDeCotizacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:PolicyPeriod-inputEl']")
    public WebElementFacade campoVigenciaDePoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:Insured-inputEl']")
    public WebElementFacade campoTomador;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:DocumentType-inputEl']")
    public WebElementFacade campoTipoDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:DocumentNumber-inputEl']")
    public WebElementFacade campoNumeroDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:PolicyAddress:PolicyAddressDisplayInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-inputEl']")
    public WebElementFacade campoDireccion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:PolicyAddress:PolicyAddressDisplayInputSet:AddressType-inputEl']")
    public WebElementFacade campoTipoDireccion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:PolicyAddress:PolicyAddressDisplayInputSet:AddressDescription-inputEl']")
    public WebElementFacade campoDescripcionDireccion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:UWCompany-inputEl']")
    private WebElementFacade campoEmpresaAseguradora;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:TotalPremium-inputEl']")
    public WebElementFacade campoPrimaTotal;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:Taxes-inputEl']")
    public WebElementFacade campoImpuestosYCargos;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyReviewScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl']")
    private WebElementFacade botonCotizacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PreQualificationScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl']")
    private WebElementFacade botonCotizacionCalificacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:PolicyReview']/div/span")
    private WebElementFacade itemRevisionPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyReviewScreen:SubmissionWizard_ReviewSummaryDV:PrimaryNamedInsured-inputEl']")
    private WebElementFacade tomadorPrimario;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']")
    private WebElementFacade grupoMensajes;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:PreQualification']/div/span")
    private WebElementFacade botonCalificacion;
    @FindBy(xpath = ".//td[2]/div/table/tbody/tr/td/div/table/tbody/tr/td[2]/div/div[2]/div/table/tbody/tr/td/div")
    private WebElementFacade labelValorCuota;
    @FindBy(xpath = ".//td[2]/div/table/tbody/tr/td/div/table/tbody/tr/td[2]/div/div[2]/div/table/tbody/tr[2]/td/div")
    private WebElementFacade labelNumeroCuotas;
    @FindBy(xpath = "//td[2]/div/table/tbody/tr/td/div/table/tbody/tr/td[2]/div/div[2]/div/table/tbody/tr/td[2]/div")
    private WebElementFacade campoValorCuota;
    @FindBy(xpath = "//td[2]/div/table/tbody/tr/td/div/table/tbody/tr/td[2]/div/div[2]/div/table/tbody/tr[2]/td[2]/div")
    private WebElementFacade campoNumeroCuotas;

    private static final int CONSTANTE_5 = 5;
    private static final int TIEMPO_40000 = 40000;


    public CotizacionDePolizaPage(WebDriver driver){
        super(driver);
    }

    public void ingresarARevisionPoliza() {
        waitForTextToAppear("Revisión de póliza");
        itemRevisionPoliza.click();
    }

    public void ingresarACotizacion() {
        if(titulo.isCurrentlyVisible()){
            waitForTextToAppear("Calificación",TIEMPO_1000);
        }else if(tituloCotizacion.isCurrentlyVisible()){
            waitForTextToAppear("Cotización",TIEMPO_1000);
        }else if(!titulo.isCurrentlyVisible()){
            waitFor(botonCalificacion).shouldBeVisible();
            botonCalificacion.click();
        }
    }

    public void verDetalleCotizacion() {
        waitForTextToAppear("Calificación");
        esperarHasta(TIEMPO_1000);
        setImplicitTimeout(TIEMPO_2, TimeUnit.SECONDS);
        if(tituloDePagina.isPresent()){
            waitForTextToAppear(tituloDePagina.getText());
            MatcherAssert.assertThat(tituloDePagina.getText(), Is.is(Matchers.equalTo("Cotización")));
        }else if(tituloCalificacion.isPresent()){
            waitForTextToAppear(tituloCalificacion.getText());
            MatcherAssert.assertThat(tituloCalificacion.getText(), Is.is(Matchers.equalTo("Calificación")));
        }
        resetImplicitTimeout();
    }

    public void validarInformacionCotizacion(Map<String, String> infoCotizacionPoliza, ExamplesTable informacionCotizacion) {
        withTimeoutOf(TIEMPO_15,TimeUnit.SECONDS).waitFor(campoNumeroDeCotizacion).shouldBePresent();
        Map<String, String> datosCotizacion;
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
        }else{
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
        MatcherAssert.assertThat("Error en el valor de la prima, was "+campoPrimaTotal.getText()+" expected "+datosCotizacion.get("prima"),
                campoPrimaTotal.containsText(datosCotizacion.get("prima")));
        MatcherAssert.assertThat(campoImpuestosYCargos.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("impuestos"))));
        MatcherAssert.assertThat("Error en el valor de la prima, was "+campoPrimaTotal.getText()+" expected "+datosCotizacion.get("total"),
                campoPrimaTotal.containsText(datosCotizacion.get("total")));
        MatcherAssert.assertThat(campoVigenciaDePoliza.getText(), Is.is(Matchers.notNullValue()));
    }

    public void validarDireccion(String direccion) {
        MatcherAssert.assertThat(campoDireccion.getText(), Is.is(Matchers.equalTo(direccion)));
    }

    public void validarBloqueoCotizacion(String mensaje) {
        waitForTextToAppear("Resultados de validación",TIEMPO_40000);
        boolean validacionMensaje = grupoMensajes.getText().contains(mensaje);
        MatcherAssert.assertThat(validacionMensaje,Is.is(Matchers.equalTo(true)));
        WebElementFacade botonBorrar = findBy(".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:WebMessageWorksheet_ClearButton-btnInnerEl']");
        withTimeoutOf(TIEMPO_28,TimeUnit.SECONDS).waitFor(botonBorrar).click();
        esperarHasta(TIEMPO_2000);
    }

    public void validarTipoRiesgo() {
        setImplicitTimeout(TIEMPO_2,TimeUnit.SECONDS);
        if(tituloDePagina.isPresent()){
            waitFor(tituloDePagina).shouldBePresent();
        }else if(tituloCalificacion.isPresent()){
            waitFor(tituloCalificacion).shouldBePresent();
        }
        resetImplicitTimeout();
        waitFor(botonCotizacionCalificacion).shouldBePresent();
        botonCotizacionCalificacion.click();
    }

    public void validarDatosCotizacion(String asegurado, String placa) {
        waitForTextToAppear("Revisión de póliza", TIEMPO_1500);
        boolean validacion = tomadorPrimario.getText().equals(asegurado) && "placa".equals(placa);
        MatcherAssert.assertThat(validacion, Is.is(Matchers.equalTo(true)));
        waitFor(botonCotizacion).shouldBeVisible();
        botonCotizacion.click();
    }

    public void validarDireccionTomador(String direccion) {
        waitFor(campoDireccion).shouldBePresent();
        MatcherAssert.assertThat(campoDireccion.getText(), Is.is(Matchers.equalTo(direccion)));
    }

    public WebElementFacade esperarElemento(final String xpath) {
        Wait<WebDriver> espera = new FluentWait<WebDriver>(getDriver())
                .withTimeout(TIEMPO_28, TimeUnit.SECONDS)
                .pollingEvery(CONSTANTE_5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        return  espera.until(new Function<WebDriver, WebElementFacade>() {
            public WebElementFacade apply(WebDriver driver) {
                return findBy(xpath);
            }
        });
    }

    public void mostrarValorYCuotas(String valorCuota, String numeroCuotas) {
        withTimeoutOf(TIEMPO_20,TimeUnit.SECONDS).waitFor(labelValorCuota).shouldBeVisible();
        boolean validacion = labelValorCuota.isCurrentlyEnabled() && labelNumeroCuotas.isCurrentlyEnabled();
        MatcherAssert.assertThat(validacion, Is.is(Matchers.equalTo(true)));
        MatcherAssert.assertThat("Error en el valor de la cuota, expected '"+valorCuota+"' but was: "+campoValorCuota.getText(),campoValorCuota.getText().contains(valorCuota));
        MatcherAssert.assertThat(campoNumeroCuotas.getText(), Is.is(Matchers.equalTo(numeroCuotas)));
    }

    public void validarCargueCotizacion() {
        WebElementFacade labelCotizacion = findBy(".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:ttlBar']");
        withTimeoutOf(TIEMPO_28,TimeUnit.SECONDS).waitFor(labelCotizacion).shouldBeVisible();
        MatcherAssert.assertThat(labelCotizacion.getText(), Matchers.is(Matchers.equalTo("Cotización")));
    }
}