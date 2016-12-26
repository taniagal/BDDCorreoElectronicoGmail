
package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class ModificacionCotizacionDePolizaPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:ttlBar']")
    private WebElementFacade tituloDePagina;
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
    @FindBy(xpath = ".//td[2]/div/div[2]/div/table")
    private WebElementFacade tablaCoberturas;
    @FindBy(xpath = ".//td[@id='PolicyChangeWizard:LOBWizardStepGroup:PALine']/div/span")
    private WebElementFacade botonCoberturasPA;
    @FindBy(xpath = ".//td[@id='PolicyChangeWizard:ViewQuote']/div")
    private WebElementFacade botonCotizacion;

    public ModificacionCotizacionDePolizaPage(WebDriver driver) {
        super(driver);
    }

    public void verDetalleCotizacion() {
        waitForTextToAppear("Cotización", WAIT_TIME_5000);
        setImplicitTimeout(WAIT_TIME_2, TimeUnit.SECONDS);
        if (tituloDePagina.isPresent()) {
            waitForTextToAppear(tituloDePagina.getText(), WAIT_TIME_2000);
            MatcherAssert.assertThat(tituloDePagina.getText(), Is.is(Matchers.equalTo("Cotización")));
        }
        resetImplicitTimeout();
    }

    public void validarInformacionCotizacion(Map<String, String> infoCotizacionPoliza, ExamplesTable informacionCotizacion) {
        withTimeoutOf(WAIT_TIME_20, TimeUnit.SECONDS).waitFor(campoNumeroDeCotizacion).waitUntilPresent();
        Map<String, String> datosCotizacion = informacionCotizacion.getRows().get(0);
        MatcherAssert.assertThat(campoTomador.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("tomador"))));
        MatcherAssert.assertThat(campoTipoDocumento.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("tipoDocumento"))));
        MatcherAssert.assertThat(campoNumeroDocumento.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("numeroDocumento"))));
        MatcherAssert.assertThat(campoDireccion.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("direccion"))));
        MatcherAssert.assertThat(campoTipoDireccion.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("tipoDireccion"))));
        MatcherAssert.assertThat(campoDescripcionDireccion.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("descripcionDireccion"))));
        MatcherAssert.assertThat(campoVigenciaDePoliza.getText(), Is.is(Matchers.notNullValue()));
    }

    public void validarDireccionTomador(String direccion) {
        waitFor(campoDireccion).waitUntilPresent();
        MatcherAssert.assertThat(campoDireccion.getText(), Is.is(Matchers.equalTo(direccion)));
    }

    public void validarTerminoCobertura() {
        waitFor(tablaCoberturas).shouldBeVisible();
        List<WebElement> allRows = tablaCoberturas.findElements(By.tagName("tr"));
        waitUntil(WAIT_TIME_1000);
        String validacion = null;
        Map<String, String> terminoCoberturas = new HashMap<>();
        try {
            int i = 0;
            for (WebElement row : allRows) {
                List<WebElement> cells = row.findElements(By.tagName("td"));
                String terminoCob = cells.get(1).getText();
                if (!"-".equals(terminoCob)) {
                    i++;
                    terminoCoberturas.put("dato" + i, terminoCob);
                }
            }
            waitFor(botonCoberturasPA).shouldBeVisible();
            botonCoberturasPA.click();
            waitForTextToAppear("Coberturas de auto personal", WAIT_TIME_1000);
            for (int j = 1; j <= i; j++) {
                WebElementFacade coberturaAuto = findBy(".//div[contains(.,'" + terminoCoberturas.get("dato" + j) + "')]");
                waitFor(coberturaAuto).shouldBeVisible();
                MatcherAssert.assertThat(coberturaAuto.getText(), Is.is(Matchers.notNullValue()));
            }
            waitFor(botonCotizacion).shouldBeVisible();
            botonCotizacion.click();
            waitForTextToAppear("Cotización", WAIT_TIME_1000);
        } catch (Exception e) {
            LOGGER.error("This is error", e);
            validacion = e.getMessage();
        }
        MatcherAssert.assertThat(validacion, Is.is(Matchers.equalTo(null)));
    }
}
