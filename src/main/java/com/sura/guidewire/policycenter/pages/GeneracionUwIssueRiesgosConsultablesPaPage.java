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

public class GeneracionUwIssueRiesgosConsultablesPaPage extends PageUtil{
    
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']")
    private WebElementFacade grupoUWIssues;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:RiskAnalysis']/div")
    private WebElementFacade analisisRiesgoExpedicion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:RiskAnalysis']/div/span")
    private WebElementFacade analisisRiesgoModificacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:RiskEvaluationPanelSet:0-body']")
    private WebElementFacade grupoUWIssuesModificacion;

    public GeneracionUwIssueRiesgosConsultablesPaPage(WebDriver driver){
        super(driver);
    }

    public void irAAnalisisDeRiesgo() {
        WebElementFacade resultadosValidacion = findBy(".//*[@id='wsTabBar:wsTab_0-btnInnerEl']");
        withTimeoutOf(WAIT_TIME_20,TimeUnit.SECONDS).waitFor(resultadosValidacion).shouldBeVisible();
        //WebElementFacade analisisRiesgoExpedicion = findBy(".//*[@id='SubmissionWizard:RiskAnalysis']/div");
        //WebElementFacade analisisRiesgoModificacion = findBy(".//*[@id='PolicyChangeWizard:RiskAnalysis']/div/span");
        //if(analisisRiesgoExpedicion.isCurrentlyVisible()){
        WebElementFacade botonBorrar = findBy(".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:WebMessageWorksheet_ClearButton-btnInnerEl']");
        withTimeoutOf(WAIT_TIME_5000,TimeUnit.SECONDS).waitFor(botonBorrar).click();
        if(analisisRiesgoExpedicion.isPresent()){
            withTimeoutOf(WAIT_TIME_20, TimeUnit.SECONDS).waitFor(analisisRiesgoExpedicion).click();
        } //else if(analisisRiesgoModificacion.isCurrentlyVisible()){
        else if(analisisRiesgoModificacion.isPresent()){
            withTimeoutOf(WAIT_TIME_20, TimeUnit.SECONDS).waitFor(analisisRiesgoModificacion).click();
        }
    }

    public void validarGeneracionUWIssue(ExamplesTable mensajesBloqueo){
        //verificarMensajes(grupoUWIssues, mensajesBloqueo);
        Map<String, String> bloqueoUW;
        //if(grupoUWIssues.isCurrentlyVisible()) {
        if(grupoUWIssues.isPresent()) {
            for (int i = 0; i < mensajesBloqueo.getRowCount(); i++) {
                bloqueoUW = mensajesBloqueo.getRows().get(i);
                MatcherAssert.assertThat(grupoUWIssues.getText(), Matchers.containsString(bloqueoUW.get("mensaje")));
            }
        } //else if(grupoUWIssuesModificacion.isCurrentlyVisible()){
        else if(grupoUWIssuesModificacion.isPresent()){
            for (int i = 0; i < mensajesBloqueo.getRowCount(); i++) {
                bloqueoUW = mensajesBloqueo.getRows().get(i);
                MatcherAssert.assertThat(grupoUWIssuesModificacion.getText(), Matchers.containsString(bloqueoUW.get("mensaje")));
            }
        }
    }

    public void aceptarExpedicionPoliza() {
        waitForTextToAppear("¿Está seguro de que desea expedir esta póliza?");
        actions.sendKeys(Keys.ENTER).build().perform();
    }
}
