package com.sura.gw.navegacion.steps;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class MenuAdministracionSteps extends ScenarioSteps {

    private static final String XPATH_CONTENEDOR_SUBMENU_DESPLEGABLE = "//div[contains(@class, 'x-panel x-layer x-panel-default x-menu x-border-box')]";

    @Step
    public void consultar_numero_de_subscripcion(String numSubscripcion) {
        String xpathTxtNumeroSubscripcion = ".//input[contains(@name,'SubmissionNumberSearchItem')]";
        getDriver().findElement(By.xpath(xpathTxtNumeroSubscripcion));
        getDriver().switchTo().activeElement().sendKeys(Keys.ENTER);
    }

    @Step
    public void consultar_numero_de_poliza(String numeroDepoliza) {
        String xpathTxtNumeroDePoliza = ".//input[contains(@name,'PolicyRetrievalItem')]";
        getDriver().findElement(By.xpath(xpathTxtNumeroDePoliza));
        getDriver().switchTo().activeElement().sendKeys(Keys.ENTER);
    }

    @Step
    public void nueva_cotizacion(){
        String xpathBtnNuevaCotizacion = ".//a[contains(@id,'TabBar:PolicyTab:PolicyTab_NewSubmission-textEl')]";
        getDriver().findElement(By.xpath(xpathBtnNuevaCotizacion)).click();
    }
}
