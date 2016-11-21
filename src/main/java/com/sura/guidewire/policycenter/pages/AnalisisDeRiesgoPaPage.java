package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class AnalisisDeRiesgoPaPage extends PageUtil{

    public AnalisisDeRiesgoPaPage(WebDriver driver) {
        super(driver);
    }

    public void aceptarExpedicion() {
        waitForTextToAppear("¿Está seguro de que desea expedir esta póliza?");
        Actions act = new Actions(getDriver());
        act.sendKeys(Keys.ENTER).build().perform();
        WebElementFacade mensajeRequisitos = findBy(".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']/div");
        withTimeoutOf(30,TimeUnit.SECONDS).waitFor(mensajeRequisitos).shouldBeVisible();
        if(mensajeRequisitos.isCurrentlyVisible()){
            WebElementFacade botonBorrar = findBy(".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:WebMessageWorksheet_ClearButton-btnInnerEl']");
            botonBorrar.click();
            waitUntil(WAIT_TIME_1500);
            WebElementFacade botonExpedir = findBy(".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:IssuesPolicy-btnInnerEl']");
            withTimeoutOf(30,TimeUnit.SECONDS).waitFor(botonExpedir).click();
            act.sendKeys(Keys.ENTER).build().perform();
        }
    }

    public void validarBloqueoExpedicion(ExamplesTable mensaje) {
        Map<String, String> mensajeBloqueo = mensaje.getRows().get(0);
        WebElementFacade labelBloqueo = findBy(".//*[@id='UWBlockProgressIssuesPopup:IssuesScreen:PreQuoteIssueTitle']");
        withTimeoutOf(40, TimeUnit.SECONDS).waitFor(labelBloqueo).shouldBeVisible();
        WebElementFacade grupoMensajes = findBy(".//*[@id='UWBlockProgressIssuesPopup:IssuesScreen:ApproveDV']");
        MatcherAssert.assertThat(grupoMensajes.getText(), Matchers.containsString(mensajeBloqueo.get("mensaje")));
    }

    public void validarGeneracionUWIssue(ExamplesTable uwissue) {
        Map<String, String> UWIssues = uwissue.getRows().get(0);
        WebElementFacade itemAnalisisRiesgo = findBy(".//*[@id='SubmissionWizard:RiskAnalysis']/div/span");
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(itemAnalisisRiesgo).click();
        WebElementFacade labelAnalisisRiesgo = findBy(".//*[@id='SubmissionWizard:Job_RiskAnalysisScreen:0']");
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(labelAnalisisRiesgo).shouldBeVisible();
        WebElementFacade grupoUWIssues = findBy(".//*[@id='SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:RiskEvaluationPanelSet:0-body']");
        MatcherAssert.assertThat(grupoUWIssues.getText(), Matchers.containsString(UWIssues.get("UWIssue")));
    }
}
