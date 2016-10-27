package com.sura.guidewire.policycenter.pages;


import com.sura.guidewire.policycenter.util.Commons;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.LoggerFactory;


public class CotizacionPADetallePage extends Commons {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(CotizacionPADetallePage.class);

    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:ttlBar']")
    private WebElementFacade tituloDePagina;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:1']")
    private WebElementFacade labelVehiculo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:LicensePlate-labelEl']")
    private WebElementFacade labelPlaca;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:FasecoldaCode-labelEl']")
    private WebElementFacade labelCodigoFasecolda;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:Make-labelEl']")
    private WebElementFacade labelMarca;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:Year-labelEl']")
    private WebElementFacade labelModelo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:Line-labelEl']")
    private WebElementFacade labelLinea;
    @FindBy(xpath = ".//td[2]/div/div/div/div/div/div/span")
    private WebElementFacade labelDescripcionCobertura;
    @FindBy(xpath = ".//div/div/div[2]/div/span")
    private WebElementFacade labelValorTerminoCobertura;
    @FindBy(xpath = ".//div[7]/div/span")
    private WebElementFacade labelPrima;
    @FindBy(xpath = ".//tfoot/tr/td/div")
    private WebElementFacade labelSubtotal;
    @FindBy(xpath = "//tr[3]/td/div/table/tbody/tr/td/div/table/tbody/tr/td/div/table/tbody/tr/td/div/table/tbody/tr/td[2]/div/div[2]/div/table/tbody/tr/td/div")
    private WebElementFacade labelSubtotalPrimas;
    @FindBy(id = "SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:Taxes-labelEl")
    private WebElementFacade labelImpuesto;
    @FindBy(xpath = "//td[@id='SubmissionWizard:LOBWizardStepGroup:PALine']/div")
    private WebElementFacade botonCoberturasPA;
    @FindBy(xpath = "//td[2]/div/div[2]/div/table")
    private WebElementFacade tablaCoberturas;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:ViewQuote']/div")
    private WebElementFacade botonCotizacion;

    public CotizacionPADetallePage(WebDriver driver) {
        super(driver);
    }

    public void verDetalleCotizacion() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(tituloDePagina).shouldBePresent();
        MatcherAssert.assertThat(tituloDePagina.getText(), Is.is(Matchers.equalTo("Cotización")));
    }

    public void validarInformacionDetalleCotizacion(Map<String, String> infoDetalleCotizacion) {
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
                if(!"-".equals(terminoCob)) {
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
}
