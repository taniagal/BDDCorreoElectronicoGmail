package com.sura.guidewire.policycenter.pages.contacto;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EdicionDeContactoPage extends PageUtil{

    @FindBy(xpath = "//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV_tb:Edit-btnInnerEl']")
    WebElementFacade botonEditarContacto;
    @FindBy(id = "ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV_tb:Edit-btnInnerEl")
    WebElementFacade campoMonedaPreferida;

    public EdicionDeContactoPage(WebDriver driver){
        super(driver);
    }

    public void clicEnElBotonEditarContacto(){
        botonEditarContacto.waitUntilPresent().click();
        waitFor(ExpectedConditions.attributeContains(campoMonedaPreferida, "text", ""));
    }
}
