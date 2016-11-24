package com.sura.guidewire.policycenter.pages.renovacion;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ExpedicionRenovacionPaValidacionesPage extends PageUtil{

    Actions act = new Actions(getDriver());

    public ExpedicionRenovacionPaValidacionesPage(WebDriver driver){
        super(driver);
    }

    public void validarExpedicionDeRenovacion() {
        WebElementFacade botonAceptarPopup = findBy(".//span[contains(.,'Aceptar')]");
        botonAceptarPopup.waitUntilPresent().click();
    }
}
