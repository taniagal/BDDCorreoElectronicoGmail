package com.sura.guidewire.policycenter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class AnalisisDeRiesgoPaPage extends PageObject{

    public AnalisisDeRiesgoPaPage (WebDriver driver){
        super(driver);
    }

    public void aceptarExpedicion() {
        waitForTextToAppear("¿Está seguro de que desea expedir esta póliza?");
        Actions act = new Actions(getDriver());
        act.sendKeys(Keys.ENTER).build().perform();
        //WebElementFacade botonAceptarExpedicion = findBy(".//div[7]/div[3]/div/div/a/span/span/span");
        //withTimeoutOf(30, TimeUnit.SECONDS).waitFor(botonAceptarExpedicion).click();
    }

    public void validarBloqueoExpedicion(ExamplesTable mensaje) {
        Map<String, String> mensajeBloqueo = mensaje.getRows().get(0);
        WebElementFacade labelBloqueo = findBy(".//*[@id='UWBlockProgressIssuesPopup:IssuesScreen:PreQuoteIssueTitle']");
        withTimeoutOf(40,TimeUnit.SECONDS).waitFor(labelBloqueo).shouldBeVisible();
        WebElementFacade grupoMensajes = findBy(".//*[@id='UWBlockProgressIssuesPopup:IssuesScreen:ApproveDV']");
        MatcherAssert.assertThat(grupoMensajes.getText(), Matchers.containsString(mensajeBloqueo.get("mensaje")));
    }

    public void validarGeneracionUWIssue(ExamplesTable UWIssue) {
        Map<String, String> UWIssues = UWIssue.getRows().get(0);
        WebElementFacade itemAnalisisRiesgo = findBy(".//*[@id='SubmissionWizard:RiskAnalysis']/div/span");
        withTimeoutOf(30,TimeUnit.SECONDS).waitFor(itemAnalisisRiesgo).click();
        WebElementFacade labelAnalisisRiesgo = findBy(".//*[@id='SubmissionWizard:Job_RiskAnalysisScreen:0']");
        withTimeoutOf(30,TimeUnit.SECONDS).waitFor(labelAnalisisRiesgo).shouldBeVisible();
        WebElementFacade grupoUWIssues = findBy(".//*[@id='SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:RiskEvaluationPanelSet:0-body']");
        MatcherAssert.assertThat(grupoUWIssues.getText(), Matchers.containsString(UWIssues.get("UWIssue")));
    }
}
