package com.sura.guidewire.policycenter.pages.renovacion;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ExpedicionRenovacionPaValidacionesPage extends PageObject{

    Actions act = new Actions(getDriver());

    public ExpedicionRenovacionPaValidacionesPage(WebDriver driver){
        super(driver);
    }

    public void validarExpedicionDeRenovacion() {
        waitForTextToAppear("¿Está seguro de que desea emitir la renovación de la póliza?",20);
        act.sendKeys(Keys.ENTER).build().perform();
    }
}
