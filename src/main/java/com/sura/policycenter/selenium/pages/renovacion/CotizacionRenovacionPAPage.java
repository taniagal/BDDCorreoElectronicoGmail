package com.sura.policycenter.selenium.pages.renovacion;

import com.sura.commons.selenium.Commons;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

public class CotizacionRenovacionPAPage extends Commons{

    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:LicensePlate-inputEl']")
    private WebElementFacade campoPlaca;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:FasecoldaCode-inputEl']")
    private WebElementFacade campoFasecolda;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:Make-inputEl']")
    private WebElementFacade campoMarca;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:Year-inputEl']")
    private WebElementFacade campoModelo;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:RatingCumulDetailsPanelSet:0:0:Line-inputEl']")
    private WebElementFacade campoLinea;

    public CotizacionRenovacionPAPage (WebDriver driver){
        super(driver);
    }

    public void validarDetalleCotizacion(ExamplesTable detalleCotizacion) {
        Map<String, String> cotizacion = detalleCotizacion.getRows().get(0);
        MatcherAssert.assertThat(campoPlaca.getText(), Matchers.containsString(cotizacion.get("placa")));
        MatcherAssert.assertThat(campoModelo.getText(), Matchers.containsString(cotizacion.get("modelo")));
        MatcherAssert.assertThat(campoFasecolda.getText(), Matchers.containsString(cotizacion.get("codigoFasecolda")));
        MatcherAssert.assertThat(campoMarca.getText(), Matchers.containsString(cotizacion.get("marca")));
        MatcherAssert.assertThat(campoLinea.getText(), Matchers.containsString(cotizacion.get("linea")));
    }

    public void validarDetallePorCobertura(ExamplesTable detalleCobertura) {

    }
}
