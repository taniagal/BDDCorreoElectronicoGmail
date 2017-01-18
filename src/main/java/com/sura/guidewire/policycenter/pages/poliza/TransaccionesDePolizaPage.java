package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class TransaccionesDePolizaPage extends PageUtil{

    public TransaccionesDePolizaPage (WebDriver driver) {
        super(driver);
    }

    public void irATransaccionesDePoliza() {
        WebElementFacade menuTransaccionesPoliza = findBy(".//*[@id='PolicyFile:MenuLinks:PolicyFile_PolicyFile_Jobs']/div/span");
        esperarYClickearBoton(menuTransaccionesPoliza);
    }
}
