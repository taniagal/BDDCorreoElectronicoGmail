package com.sura.policycenter.selenium.pages.menu.opciones.cuenta;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class OpcionesCotizacionPADetallePage extends Guidewire {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(OpcionesCotizacionPADetallePage.class);

    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:1']")
    private WebElementFacade labelVehiculo;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:LicensePlate-labelEl']")
    private WebElementFacade labelPlaca;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:LicensePlate-inputEl']")
    private WebElementFacade inputPlaca;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:FasecoldaCode-labelEl']")
    private WebElementFacade labelCodigoFasecolda;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:FasecoldaCode-inputEl']")
    private WebElementFacade inputCodigoFasecolda;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:Make-labelEl']")
    private WebElementFacade labelMarca;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:Make-inputEl']")
    private WebElementFacade inputMarca;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:Year-labelEl']")
    private WebElementFacade labelModelo;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:Year-inputEl']")
    private WebElementFacade inputModelo;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:Line-labelEl']")
    private WebElementFacade labelLinea;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:Line-inputEl']")
    private WebElementFacade inputLinea;

    @FindBy(xpath = ".//td[2]/div/div/div/div/div/div/span")
    private WebElementFacade labelDescripcionCobertura;

    @FindBy(xpath = ".//div/div/div[2]/div/span")
    private WebElementFacade labelValorTerminoCobertura;

    @FindBy(xpath = ".//div[7]/div/span")
    private WebElementFacade labelPrima;

    @FindBy(xpath = ".//tfoot/tr/td/div")
    private WebElementFacade labelSubtotal;

    @FindBy(xpath = ".//div[2]/div/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/table/tbody/tr/td/div/table/tbody/tr/td/div/table/tbody/tr/td[2]/div/div[2]/div/table/tbody/tr/td/div")
    private WebElementFacade labelSubtotalPrimas;

    @FindBy(xpath = ".//div[2]/div/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/table/tbody/tr/td/div/table/tbody/tr/td/div/table/tbody/tr/td[2]/div/div[2]/div/table/tbody/tr[2]/td/div")
    private WebElementFacade labelImpuesto;

    public OpcionesCotizacionPADetallePage(WebDriver driver) {
        super(driver);
    }

    public static void validarInformacionDetalleCotizacion(Map<String, String> infoDetalleCotizacion) {
        String validacion = null;
        try{
            MatcherAssert.assertThat(labelVehiculo.getText(), Is.is(Matchers.equalTo(infoDetalleCotizacion.get"labelVehiculo")));
        }catch (Exception e){
            LOGGER.error(validacion, e);
            validacion = e.getMessage();
        }

        MatcherAssert.assertThat(validacion, Is.is(Matchers.equalTo(null)));
    }
}
