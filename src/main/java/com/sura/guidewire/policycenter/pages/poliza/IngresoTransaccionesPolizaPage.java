package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class IngresoTransaccionesPolizaPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='PolicyFile:MenuLinks:PolicyFile_PolicyFile_Jobs']/div")
    private WebElementFacade menuTransacciones;


    public IngresoTransaccionesPolizaPage (WebDriver driver){
        super (driver);
    }

    public void ingresarMenuAccionesTransacciones(){
        menuTransacciones.waitUntilPresent();
        clickearElemento(menuTransacciones);
    }

    public void busquedaTransaccion(){

    }
}
