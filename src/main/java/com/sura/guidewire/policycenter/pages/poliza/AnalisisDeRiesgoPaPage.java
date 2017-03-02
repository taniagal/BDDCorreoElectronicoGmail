package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class AnalisisDeRiesgoPaPage extends PageUtil {

    @FindBy(xpath = ".//span[contains(.,'Aceptar')]")
    private WebElementFacade botonAceptarPopup;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:WebMessageWorksheet_ClearButton-btnInnerEl']")
    private WebElementFacade botonBorrar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:IssuesPolicy-btnInnerEl']")
    private WebElementFacade botonExpedirPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:RiskAnalysis']")
    private WebElementFacade analisiDeRiesgo;


    public AnalisisDeRiesgoPaPage(WebDriver driver) {
        super(driver);
    }

    public void aceptarExpedicion() {
        botonAceptarPopup.waitUntilPresent().click();
        botonAceptarPopup.waitUntilNotVisible();
    }

    public void validarBloqueoExpedicion(ExamplesTable mensaje) {
        Map<String, String> mensajeBloqueo = mensaje.getRows().get(0);
        WebElementFacade labelBloqueo = findBy(".//*[@id='UWBlockProgressIssuesPopup:IssuesScreen:PreQuoteIssueTitle']");
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(labelBloqueo).shouldBeVisible();
        WebElementFacade grupoMensajes = findBy(".//*[@id='UWBlockProgressIssuesPopup:IssuesScreen:ApproveDV']");
        MatcherAssert.assertThat(grupoMensajes.getText(), Matchers.containsString(mensajeBloqueo.get("mensaje")));
    }

    public void validarGeneracionUWIssue(ExamplesTable uwissue) {
        Map<String, String> uwissues = uwissue.getRows().get(0);
        WebElementFacade itemAnalisisRiesgo = findBy(".//*[@id='SubmissionWizard:RiskAnalysis']/div/span");
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(itemAnalisisRiesgo).click();
        WebElementFacade labelAnalisisRiesgo = findBy(".//*[@id='SubmissionWizard:Job_RiskAnalysisScreen:0']");
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(labelAnalisisRiesgo).shouldBeVisible();
        WebElementFacade grupoUWIssues = findBy(".//*[@id='SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:RiskEvaluationPanelSet:0-body']");
        MatcherAssert.assertThat(grupoUWIssues.getText(), Matchers.containsString(uwissues.get("UWIssue")));
    }

    public void ingresarAnalisisDeRiesgo(){
        clickearElemento(analisiDeRiesgo);
    }
}
