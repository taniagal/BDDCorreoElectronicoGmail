package com.sura.guidewire.policycenter.utils.navegacion.steps;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.openqa.selenium.Keys;

public class MenuPolizaSteps extends ScenarioSteps {

    protected static final int TIEMPO_2 = 2;

    @Step
    public void consultarNumeroDeSubscripcion(String numSubscripcion) {
        String xpathTxtNumeroSubscripcion = ".//input[contains(@name,'SubmissionNumberSearchItem')]";
        getDriver().findElement(By.xpath(xpathTxtNumeroSubscripcion));
        waitFor(TIEMPO_2).seconds();
        getDriver().findElement(By.xpath(xpathTxtNumeroSubscripcion)).sendKeys(numSubscripcion);
        getDriver().switchTo().activeElement().sendKeys(Keys.ENTER);
        waitFor(TIEMPO_2).seconds();
    }

    @Step
    public void consultarNumeroDePoliza(String numeroDePoliza) {
        String xpathTxtNumeroPoliza = ".//input[contains(@name,'PolicyRetrievalItem')]";
        getDriver().findElement(By.xpath(xpathTxtNumeroPoliza)).sendKeys(numeroDePoliza);
        getDriver().switchTo().activeElement().sendKeys(Keys.ENTER);
    }
}
