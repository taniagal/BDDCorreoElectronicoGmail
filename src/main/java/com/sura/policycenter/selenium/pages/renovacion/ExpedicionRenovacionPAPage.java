package com.sura.policycenter.selenium.pages.renovacion;

import com.sura.commons.selenium.Commons;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ExpedicionRenovacionPAPage extends Commons{

    private final Actions act = new Actions(getDriver());

    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:ttlBar']")
    private WebElementFacade labelCotizacion;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions-btnWrap']")
    private WebElementFacade botonOpcionesCompromiso;
    @FindBy(xpath = ".//*[@id='RenewalWizard:PostQuoteWizardStepSet:RenewalWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions:IssueNow']")
    private WebElementFacade itemEmitirAhora;
    @FindBy(xpath = ".//span/div/table/tbody/tr/td[2]/div")
    private WebElementFacade mensajeAdvertenciaRenovacion;
    @FindBy(xpath = ".//*[@id='JobComplete:JobCompleteScreen:ttlBar']")
    private WebElementFacade labelRenovacionExpedida;
    @FindBy(xpath = ".//*[@id='JobComplete:JobCompleteScreen:Message']")
    private WebElementFacade mensajeRenovacionRealizada;

    public ExpedicionRenovacionPAPage(WebDriver driver){ super(driver);}

    public void emitirRenovacion() {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(labelCotizacion).shouldBeVisible();
        botonOpcionesCompromiso.click();
        withTimeoutOf(10,TimeUnit.SECONDS).waitFor(itemEmitirAhora).shouldBeVisible();
        itemEmitirAhora.click();
    }

    public void validarMensajeAdvertencia(ExamplesTable mensaje) {
        Map<String, String> mensajeAdvertencia = mensaje.getRows().get(0);
        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(mensajeAdvertenciaRenovacion).shouldBeVisible();
        MatcherAssert.assertThat(mensajeAdvertenciaRenovacion.getText(), Is.is(Matchers.equalTo(mensajeAdvertencia.get("mensaje"))));
        act.sendKeys(Keys.TAB).build().perform();
        act.sendKeys(Keys.ENTER).build().perform();
    }

    public void mostrarResumenRenovacion() {
        act.sendKeys(Keys.ENTER).build().perform();
        withTimeoutOf(30,TimeUnit.SECONDS).waitFor(labelRenovacionExpedida).shouldBeVisible();

    }

    public void validarMensajeRenovacionRealizada(String mensaje) {
        MatcherAssert.assertThat(mensajeRenovacionRealizada.getText(), Is.is(Matchers.equalTo(mensaje)));
    }
}
