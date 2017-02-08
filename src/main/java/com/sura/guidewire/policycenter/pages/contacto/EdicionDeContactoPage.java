package com.sura.guidewire.policycenter.pages.contacto;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public class EdicionDeContactoPage extends PageUtil{

    @FindBy(xpath = "//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV_tb:Edit-btnInnerEl']")
    WebElementFacade botonEditarContacto;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV_tb:Cancel-btnInnerEl']")
    WebElementFacade botonCancelar;

    public EdicionDeContactoPage(WebDriver driver){
        super(driver);
    }

    public void clicEnElBotonEditarContacto(){
        botonEditarContacto.waitUntilPresent().click();
        botonCancelar.waitUntilVisible();
    }
}
