package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class GeneracionUwIssueRiesgosConsultablesPaPage extends PageUtil {

    @FindBy(xpath = ".//*[contains(@id, 'Wizard:Job_RiskAnalysisScreen:RiskAnalysisCV:RiskEvaluationPanelSet:0-body')]")
    private WebElementFacade grupoUWIssues;
    @FindBy(xpath = ".//span[contains(text(), 'Análisis de riesgo') and contains(@class, 'x-tree-node-text')]")
    private WebElementFacade analisisDeRiesgo;
    @FindBy(xpath = ".//*[contains(text(), 'Análisis de riesgo') and contains(@id, 'Job_RiskAnalysisScreen')]")
    private WebElementFacade labelAnalisisDeRiesgo;

    public GeneracionUwIssueRiesgosConsultablesPaPage(WebDriver driver) {
        super(driver);
    }

    public void irAAnalisisDeRiesgo() {
        WebElementFacade resultadosValidacion = findBy(".//*[@id='wsTabBar:wsTab_0-btnInnerEl']");
        withTimeoutOf(WAIT_TIME_20, TimeUnit.SECONDS).waitFor(resultadosValidacion).shouldBeVisible();
        waitUntil(WAIT_TIME_3000);
        withTimeoutOf(WAIT_TIME_20, TimeUnit.SECONDS).waitFor(analisisDeRiesgo).click();
        withTimeoutOf(WAIT_TIME_30000, TimeUnit.SECONDS).waitFor(labelAnalisisDeRiesgo).shouldBePresent();
    }

    public void validarGeneracionUWIssue(ExamplesTable mensajesBloqueo) {
        Map<String, String> bloqueoUW;
        grupoUWIssues.waitUntilPresent().waitUntilVisible();
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
