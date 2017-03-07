package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.concurrent.TimeUnit;


public class CotizacionMRCPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:ttlBar']")
    private WebElementFacade tituloPagina;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:TotalCost-inputEl']")
    private WebElementFacade campoCostoTotal;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:SubmissionWizard_Quote_CumulativeCardTab-btnInnerEl']")
    private WebElementFacade tabPrimaPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:RatingOverrideButtonDV:RatingOverrideButtonDV:OverrideRating']")
    private WebElementFacade botonAnularClasificacion;
    @FindBy(xpath = "//td/div/div/div/div/div/div")
    private WebElementFacade columnaDescripcion;
    @FindBy(xpath = "//div/div/div/div/div[3]/div")
    private WebElementFacade columnaMonto;
    @FindBy(xpath = ".//*[@id='QuickJump-inputEl']")
    private WebElementFacade campoTxtBuscar;
    @FindBy(xpath = ".//*[@id='DesktopSubmissions:DesktopSubmissionsScreen:SubmissionSearch-inputEl']")
    private WebElementFacade campoTxtSubN;

    protected static final int TIEMPO_7000 = 7000;
    CotizacionDePolizaPage cotizacionDePolizaPage;

    public CotizacionMRCPage(WebDriver driver) {
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
        if (titulo.isCurrentlyVisible()) {
            waitForTextToAppear("Información de póliza", TIEMPO_5000);
        } else {
            waitFor(botonInformacionPoliza).shouldBeVisible();
            botonInformacionPoliza.click();
        }
    }

    public void verDetalleCotizacion() {
        esperarHasta(TIEMPO_2000);
        withTimeoutOf(TIEMPO_10, TimeUnit.SECONDS).waitFor(tituloPagina).shouldBePresent();
        MatcherAssert.assertThat(tituloPagina.getText(), Is.is(Matchers.equalTo("Cotización")));
    }

    public void validarInformacionCotizacion(Map<String, String> labelsCotizacionPoliza, ExamplesTable informacionCotizacion) {
        waitFor(cotizacionDePolizaPage.labelNumeroCotizacion).shouldBeVisible();
        Map<String, String> datosCotizacion;
        MatcherAssert.assertThat(cotizacionDePolizaPage.labelNumeroCotizacion.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("numeroCotizacion"))));
        MatcherAssert.assertThat(cotizacionDePolizaPage.labelVigenciaPoliza.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("vigenciaPoliza"))));
        MatcherAssert.assertThat(cotizacionDePolizaPage.labelTomador.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("tomador"))));
        MatcherAssert.assertThat(cotizacionDePolizaPage.labelTipoDocumento.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("tipoDocumento"))));
        MatcherAssert.assertThat(cotizacionDePolizaPage.labelNumeroDocumento.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("numeroDocumento"))));
        MatcherAssert.assertThat(cotizacionDePolizaPage.labelDireccion.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("direccion"))));
        MatcherAssert.assertThat(cotizacionDePolizaPage.labelTipoDireccion.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("tipoDireccion"))));
        MatcherAssert.assertThat(cotizacionDePolizaPage.labelDescripcionDireccion.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("descripcionDireccion"))));
        MatcherAssert.assertThat(cotizacionDePolizaPage.labelPrimaTotal.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("primaTotal"))));
        MatcherAssert.assertThat(cotizacionDePolizaPage.labelImpuestos.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("impuestos"))));
        MatcherAssert.assertThat(cotizacionDePolizaPage.labelCostoTotal.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("costoTotal"))));
        datosCotizacion = informacionCotizacion.getRows().get(0);
        MatcherAssert.assertThat(cotizacionDePolizaPage.campoNumeroDeCotizacion.getText(), Is.is(Matchers.notNullValue()));
        MatcherAssert.assertThat(cotizacionDePolizaPage.campoVigenciaDePoliza.getText(), Is.is(Matchers.notNullValue()));
        MatcherAssert.assertThat(cotizacionDePolizaPage.campoTomador.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("tomador"))));
        MatcherAssert.assertThat(cotizacionDePolizaPage.campoTipoDocumento.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("tipoDocumento"))));
        MatcherAssert.assertThat(cotizacionDePolizaPage.campoNumeroDocumento.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("numeroDocumento"))));
        MatcherAssert.assertThat(cotizacionDePolizaPage.campoDireccion.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("direccion"))));
        MatcherAssert.assertThat(cotizacionDePolizaPage.campoTipoDireccion.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("tipoDireccion"))));
        MatcherAssert.assertThat(cotizacionDePolizaPage.campoDescripcionDireccion.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("descripcionDireccion"))));
        MatcherAssert.assertThat("Error en la tarifacion, fue $0,00", !cotizacionDePolizaPage.campoPrimaTotal.getText().contains("$0,00"));
        MatcherAssert.assertThat("Error en la tarifacion, fue $0,00", !cotizacionDePolizaPage.campoImpuestosYCargos.getText().contains("$0,00"));
        MatcherAssert.assertThat("Error en la tarifacion, fue $0,00", !campoCostoTotal.getText().contains("$0,00"));
    }

    public void validarPrima(String primaTotal) {
        esperarHasta(TIEMPO_7000);
        MatcherAssert.assertThat(cotizacionDePolizaPage.campoPrimaTotal.getText(), Is.is(Matchers.equalTo(primaTotal)));
    }

    public void mostrarDetallePrima(Map<String, String> labelsCotizacionPoliza) {
        withTimeoutOf(TIEMPO_10, TimeUnit.SECONDS).waitFor(tabPrimaPoliza).shouldBeVisible();
        MatcherAssert.assertThat(tabPrimaPoliza.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("tabPrimaPoliza"))));
        MatcherAssert.assertThat(botonAnularClasificacion.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("botonAnularClasificacion"))));
        MatcherAssert.assertThat(columnaDescripcion.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("columnaDescripcion"))));
        MatcherAssert.assertThat(columnaMonto.getText(), Is.is(Matchers.equalTo(labelsCotizacionPoliza.get("columnaMonto"))));
    }

    public void validarBloqueoCotizacion(String mensaje) {
        WebElementFacade resultadosValidacion = withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).find(".//*[@id='wsTabBar:wsTab_0-btnInnerEl']");
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(resultadosValidacion).shouldBeVisible();
        WebElementFacade tablaMensajes = findBy(".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']");
        MatcherAssert.assertThat(tablaMensajes.getText(), Matchers.containsString(mensaje));
    }

    public void validarBloqueoExclusividad(String mensaje) {
        waitForTextToAppear("Asuntos previos a la cotización");
        MatcherAssert.assertThat(findBy(".//*[@id='UWBlockProgressIssuesPopup:IssuesScreen:ApproveDV:0:ShortDescriptionAndSize-inputEl']").getText(), Matchers.containsString(mensaje));
    }

    public void validarMensajeUWAlExpedir(String mensaje) {
        waitForTextToAppear("Asuntos que bloquean la expedición");
        MatcherAssert.assertThat(findBy(".//*[@id='UWBlockProgressIssuesPopup:IssuesScreen:ApproveDV:0:ShortDescriptionAndSize-inputEl']").getText(), Matchers.containsString(mensaje));
    }

    public void validarTipoRiesgo() {
        esperarHasta(TIEMPO_1500);
        WebElementFacade botonCotizar = findBy(".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl']");
        withTimeoutOf(TIEMPO_10, TimeUnit.SECONDS).waitFor(botonCotizar).shouldBePresent();
        botonCotizar.click();
        esperarHasta(TIEMPO_5000);
    }
}