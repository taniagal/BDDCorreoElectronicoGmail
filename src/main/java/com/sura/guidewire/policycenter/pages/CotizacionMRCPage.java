package com.sura.guidewire.policycenter.pages;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class CotizacionMRCPage extends PageUtil {
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
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:SubmissionWizard_Quote_CumulativeCardTab-btnInnerEl']")
    private WebElementFacade tabPrimaPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:RatingOverrideButtonDV:RatingOverrideButtonDV:OverrideRating']")
    private WebElementFacade botonAnularClasificacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:Premiums']")
    private WebElementFacade labelPrimas;
    @FindBy(xpath = "//td/div/div/div/div/div/div")
    private WebElementFacade columnaDescripcion;
    @FindBy(xpath = "//div/div/div/div/div[3]/div")
    private WebElementFacade columnaMonto;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:OtherCharges']")
    private WebElementFacade labelOtrosCargos;
    @FindBy(xpath = "//tr[3]/td/div/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/div/div/div/div/div")
    private WebElementFacade columnaDescripcionCargos;
    @FindBy(xpath = "//tr[3]/td/div/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/div/div/div/div[2]/div")
    private WebElementFacade columnaEstadoCargos;
    @FindBy(xpath = "//tr[3]/td/div/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/div/div/div/div[3]/div")
    private WebElementFacade columnaMontoCargos;
    @FindBy(xpath = ".//*[@id='QuickJump-inputEl']")
    private WebElementFacade campoTxtBuscar;
    @FindBy(xpath = ".//*[@id='DesktopSubmissions:DesktopSubmissionsScreen:SubmissionSearch-inputEl']")
    private WebElementFacade campoTxtSubN;

    protected static final int WAIT_TIME_7000 = 7000;

    public CotizacionMRCPage(WebDriver driver){
        super(driver);
    }

    public void irABuscarCotizacion(String cotizacion) {
        campoTxtBuscar.waitUntilPresent().sendKeys("MySubmissions");
        campoTxtBuscar.sendKeys(Keys.ENTER);
        campoTxtSubN.waitUntilPresent().sendKeys(cotizacion);
        campoTxtSubN.sendKeys(Keys.ENTER);
    }

    public void ingresarACotizacion() {
        WebElementFacade botonInformacionPoliza = findBy(".//*[@id='SubmissionWizard:PolicyInfo']/div/span");
        WebElementFacade titulo = findBy(".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:ttlBar']");
        if(titulo.isCurrentlyVisible()){
            waitForTextToAppear("Información de póliza",WAIT_TIME_5000);
        }else{
            waitFor(botonInformacionPoliza).shouldBeVisible();
            botonInformacionPoliza.click();
        }
    }

    public void verDetalleCotizacion() {
        waitUntil(WAIT_TIME_2000);
        withTimeoutOf(WAIT_TIME_10, TimeUnit.SECONDS).waitFor(tituloPagina).shouldBePresent();
        MatcherAssert.assertThat(tituloPagina.getText(), Is.is(Matchers.equalTo("Cotización")));
    }

    public void validarInformacionCotizacion(Map<String, String> labelsCotizacionPoliza, ExamplesTable informacionCotizacion) {
        withTimeoutOf(WAIT_TIME_10,TimeUnit.SECONDS).waitFor(labelNumeroCotizacion).shouldBeVisible();
        Map<String, String> datosCotizacion;
        MatcherAssert.assertThat(labelNumeroCotizacion.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("numeroCotizacion"))));
        MatcherAssert.assertThat(labelVigenciaPoliza.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("vigenciaPoliza"))));
        MatcherAssert.assertThat(labelTomador.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("tomador"))));
        MatcherAssert.assertThat(labelTipoDocumento.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("tipoDocumento"))));
        MatcherAssert.assertThat(labelNumeroDocumento.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("numeroDocumento"))));
        MatcherAssert.assertThat(labelDireccion.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("direccion"))));
        MatcherAssert.assertThat(labelTipoDireccion.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("tipoDireccion"))));
        MatcherAssert.assertThat(labelDescripcionDireccion.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("descripcionDireccion"))));
        MatcherAssert.assertThat(labelPrimaTotal.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("primaTotal"))));
        MatcherAssert.assertThat(labelImpuestos.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("impuestos"))));
        MatcherAssert.assertThat(labelCostoTotal.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("costoTotal"))));

        if (campoNumeroCotizacion.getText().equals(informacionCotizacion.getRows().get(0).get("cotizacion"))) {
            datosCotizacion = informacionCotizacion.getRows().get(0);
        }else{
            datosCotizacion = informacionCotizacion.getRows().get(1);
        }
        MatcherAssert.assertThat(campoNumeroCotizacion.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("cotizacion"))));
        MatcherAssert.assertThat(campoVigenciaPoliza.getText(), Is.is(Matchers.notNullValue()));
        MatcherAssert.assertThat(campoTomador.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("tomador"))));
        MatcherAssert.assertThat(campoTipoDocumento.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("tipoDocumento"))));
        MatcherAssert.assertThat(campoNumeroDocumento.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("numeroDocumento"))));
        MatcherAssert.assertThat(campoDireccion.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("direccion"))));
        MatcherAssert.assertThat(campoTipoDireccion.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("tipoDireccion"))));
        MatcherAssert.assertThat(campoDescripcionDireccion.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("descripcionDireccion"))));
        MatcherAssert.assertThat(campoPrimaTotal.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("prima"))));
        MatcherAssert.assertThat(campoImpuestos.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("impuestos"))));
        MatcherAssert.assertThat(campoCostoTotal.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("total"))));
    }

    public void validarPrima(String primaTotal) {
        waitUntil(WAIT_TIME_7000);
        MatcherAssert.assertThat(campoPrimaTotal.getText(),Is.is(Matchers.equalTo(primaTotal)));
    }

    public void mostrarDetallePrima(Map<String, String> labelsCotizacionPoliza) {
        withTimeoutOf(WAIT_TIME_10, TimeUnit.SECONDS).waitFor(tabPrimaPoliza).shouldBeVisible();
        MatcherAssert.assertThat(tabPrimaPoliza.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("tabPrimaPoliza"))));
        MatcherAssert.assertThat(botonAnularClasificacion.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("botonAnularClasificacion"))));
        MatcherAssert.assertThat(columnaDescripcion.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("columnaDescripcion"))));
        MatcherAssert.assertThat(columnaMonto.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("columnaMonto"))));
        MatcherAssert.assertThat(labelOtrosCargos.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("otrosCargos"))));
    }

    public void validarBloqueoCotizacion(String mensaje) {
        WebElementFacade resultadosValidacion = withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).find(".//*[@id='wsTabBar:wsTab_0-btnInnerEl']");
        withTimeoutOf(WAIT_TIME_20, TimeUnit.SECONDS).waitFor(resultadosValidacion).shouldBeVisible();
        WebElementFacade tablaMensajes = findBy(".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']");
        waitUntil(WAIT_TIME_3000);
        MatcherAssert.assertThat(tablaMensajes.getText(),Matchers.containsString(mensaje));
        waitUntil(WAIT_TIME_5000);
    }

    public void validarTipoRiesgo() {
        waitUntil(WAIT_TIME_1500);
        WebElementFacade botonCotizar = findBy(".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl']");
        withTimeoutOf(WAIT_TIME_10,TimeUnit.SECONDS).waitFor(botonCotizar).shouldBePresent();
        botonCotizar.click();
        waitUntil(WAIT_TIME_5000);
    }
}