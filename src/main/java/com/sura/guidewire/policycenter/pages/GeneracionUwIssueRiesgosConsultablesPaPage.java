package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
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
    @FindBy(xpath = ".//*[@id='wsTabBar:wsTab_0-btnInnerEl']")
    private WebElementFacade resultadosValidacion;
    @FindBy(xpath = "//*[@id='wsTabBar:wsTab_0:panelId']")
    private WebElementFacade tablaRequisitos;

    public GeneracionUwIssueRiesgosConsultablesPaPage(WebDriver driver) {
        super(driver);
    }

    public void irAAnalisisDeRiesgo() {
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(resultadosValidacion);
        clickearElemento(analisisDeRiesgo);
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(labelAnalisisDeRiesgo);
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

    public void validarGeneracionMensajeBloqueante(ExamplesTable mensaje) {
        Map<String, String> datos = mensaje.getRow(0);
        try {
            tablaRequisitos.waitUntilPresent();
        } catch (StaleElementReferenceException e) {
            LOGGER.info("StaleElementReferenceException " + e);
            tablaRequisitos.waitUntilPresent();
        }
        MatcherAssert.assertThat("Error, mensaje no encontrado", tablaRequisitos.getText().contains(datos.get("mensaje")));
    }
}
