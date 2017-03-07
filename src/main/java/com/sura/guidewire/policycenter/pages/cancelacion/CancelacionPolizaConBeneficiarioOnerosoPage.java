package com.sura.guidewire.policycenter.pages.cancelacion;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public class CancelacionPolizaConBeneficiarioOnerosoPage extends PageUtil {

    @FindBy(xpath = "")
    WebElementFacade mensajeCancelar;


    public CancelacionPolizaConBeneficiarioOnerosoPage(WebDriver driver){
        super(driver);
    }


}
