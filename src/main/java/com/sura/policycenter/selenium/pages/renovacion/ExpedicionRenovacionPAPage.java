package com.sura.policycenter.selenium.pages.renovacion;

import com.sura.commons.selenium.Commons;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ExpedicionRenovacionPAPage extends Commons{

    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:ttlBar']")
    private WebElementFacade labelCotizacion;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions-btnWrap']")
    private WebElementFacade botonOpcionesCompromiso;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions:IssueNow']")
    private WebElementFacade itemEmitirAhora;


    public ExpedicionRenovacionPAPage(WebDriver driver){ super(driver);}

    public void emitirRenovacion() {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(labelCotizacion).shouldBeVisible();
        botonOpcionesCompromiso.click();
        withTimeoutOf(10,TimeUnit.SECONDS).waitFor(itemEmitirAhora).shouldBeVisible();
        itemEmitirAhora.click();
    }

    public void validarMensajeAdvertencia(ExamplesTable mensaje) {
        Map<String, String> mensajeAdvertencia = mensaje.getRows().get(0);
    }
}
