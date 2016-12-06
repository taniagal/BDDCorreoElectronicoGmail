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

    public GeneracionUwIssueRiesgosConsultablesPaPage(WebDriver driver){
        super(driver);
    }

    public void irAAnalisisDeRiesgo() {
        WebElementFacade resultadosValidacion = findBy(".//*[@id='wsTabBar:wsTab_0-btnInnerEl']");
        withTimeoutOf(WAIT_TIME_20,TimeUnit.SECONDS).waitFor(resultadosValidacion).shouldBeVisible();
        WebElementFacade analisisRiesgoExpedicion = findBy(".//*[@id='SubmissionWizard:RiskAnalysis']/div");
        WebElementFacade analisisRiesgoModificacion = findBy(".//*[@id='PolicyChangeWizard:RiskAnalysis']/div/span");
        if(analisisRiesgoExpedicion.isCurrentlyVisible()){
            withTimeoutOf(WAIT_TIME_20, TimeUnit.SECONDS).waitFor(analisisRiesgoExpedicion).click();
        } else if(analisisRiesgoModificacion.isCurrentlyVisible()){
            withTimeoutOf(WAIT_TIME_20, TimeUnit.SECONDS).waitFor(analisisRiesgoModificacion).click();
        }
    }

    public void validarGeneracionUWIssue(ExamplesTable mensajesBloqueo){
            verificarMensajes(grupoUWIssues, mensajesBloqueo);
    }

    public void aceptarExpedicionPoliza() {
        waitForTextToAppear("¿Está seguro de que desea expedir esta póliza?");
        actions.sendKeys(Keys.ENTER).build().perform();
    }
}
