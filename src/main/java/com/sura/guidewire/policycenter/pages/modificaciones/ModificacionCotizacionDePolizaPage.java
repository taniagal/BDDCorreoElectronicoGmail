
package com.sura.guidewire.policycenter.pages.modificaciones;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.concurrent.TimeUnit;


public class ModificacionCotizacionDePolizaPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:ttlBar']")
    private WebElementFacade tituloDePaginaModificacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:JobNumber-inputEl']")
    private WebElementFacade campoNumeroDeCotizacionModificacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:PolicyPeriod-inputEl']")
    private WebElementFacade campoVigenciaDePolizaModificacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:Insured-inputEl']")
    private WebElementFacade campoTomadorModificacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:DocumentType-inputEl']")
    private WebElementFacade campoTipoDocumentoModificacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:DocumentNumber-inputEl']")
    private WebElementFacade campoNumeroDocumentoModificacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:PolicyAddress:PolicyAddressDisplayInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-inputEl']")
    private WebElementFacade campoDireccionModificacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:PolicyAddress:PolicyAddressDisplayInputSet:AddressType-inputEl']")
    private WebElementFacade campoTipoDireccionModificacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:Quote_SummaryDV:PolicyAddress:PolicyAddressDisplayInputSet:AddressDescription-inputEl']")
    private WebElementFacade campoDescripcionDireccionModificacion;

    public ModificacionCotizacionDePolizaPage(WebDriver driver) {
        super(driver);
    }

    public void verDetalleCotizacion() {
        waitForTextToAppear("Cotización", TIEMPO_5000);
        setImplicitTimeout(TIEMPO_2, TimeUnit.SECONDS);
        if (tituloDePaginaModificacion.isPresent()) {
            waitForTextToAppear(tituloDePaginaModificacion.getText(), TIEMPO_2000);
            MatcherAssert.assertThat(tituloDePaginaModificacion.getText(), Is.is(Matchers.equalTo("Cotización")));
        }
        resetImplicitTimeout();
    }

    public void validarInformacionCotizacion(Map<String, String> infoCotizacionPoliza, ExamplesTable informacionCotizacion) {
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(campoNumeroDeCotizacionModificacion).waitUntilPresent();
        Map<String, String> datosCotizacion = informacionCotizacion.getRows().get(0);
        MatcherAssert.assertThat(campoTomadorModificacion.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("tomador"))));
        MatcherAssert.assertThat(campoTipoDocumentoModificacion.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("tipoDocumento"))));
        MatcherAssert.assertThat(campoNumeroDocumentoModificacion.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("numeroDocumento"))));
        MatcherAssert.assertThat(campoDireccionModificacion.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("direccion"))));
        MatcherAssert.assertThat(campoTipoDireccionModificacion.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("tipoDireccion"))));
        MatcherAssert.assertThat(campoDescripcionDireccionModificacion.getText(), Is.is(Matchers.equalTo(datosCotizacion.get("descripcionDireccion"))));
        MatcherAssert.assertThat(campoVigenciaDePolizaModificacion.getText(), Is.is(Matchers.notNullValue()));
    }

    public void validarDireccionTomador(String direccion) {
        waitFor(campoDireccionModificacion).waitUntilPresent();
        MatcherAssert.assertThat(campoDireccionModificacion.getText(), Is.is(Matchers.equalTo(direccion)));
    }
 }
