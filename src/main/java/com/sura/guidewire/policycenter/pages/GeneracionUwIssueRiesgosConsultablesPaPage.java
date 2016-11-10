package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.util.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class GeneracionUwIssueRiesgosConsultablesPaPage extends PageUtil{
    public GeneracionUwIssueRiesgosConsultablesPaPage(WebDriver driver){
        super(driver);
    }

    public void irAAnalisisDeRiesgo() {
        WebElementFacade resultadosValidacion = findBy(".//*[@id='wsTabBar:wsTab_0-btnInnerEl']");
        withTimeoutOf(WAIT_TIME_20,TimeUnit.SECONDS).waitFor(resultadosValidacion).shouldBeVisible();
        WebElementFacade analisisRiesgo = findBy(".//*[@id='SubmissionWizard:RiskAnalysis']/div");
        withTimeoutOf(WAIT_TIME_20, TimeUnit.SECONDS).waitFor(analisisRiesgo).click();
    }

    public void validarGeneracionUWIssue(ExamplesTable mensajesBloqueo){
        WebElementFacade grupoUWIssues = findBy(".//*[@id='SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:RiskEvaluationPanelSet:0-body']");
        withTimeoutOf(WAIT_TIME_20,TimeUnit.SECONDS).waitFor(grupoUWIssues).shouldBeVisible();
        Map<String, String> bloqueoUW;
        for (int i = 0; i < mensajesBloqueo.getRowCount(); i++) {
            bloqueoUW = mensajesBloqueo.getRows().get(i);
            MatcherAssert.assertThat(grupoUWIssues.getText(), Matchers.containsString(bloqueoUW.get("mensaje")));
        }
    }

    public void aceptarExpedicionPoliza() {
        waitForTextToAppear("¿Está seguro de que desea expedir esta póliza?");
        actions.sendKeys(Keys.ENTER).build().perform();
    }
}
