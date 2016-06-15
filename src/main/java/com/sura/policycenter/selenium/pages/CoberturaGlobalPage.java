package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import com.sura.policycenter.selenium.steps.CoberturaGlobalSteps;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;


public class CoberturaGlobalPage extends Guidewire {
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:CPBlanket']/div")
    private WebElementFacade divCoberturaGlobal;

    public CoberturaGlobalPage(WebDriver driver){
        super(driver);
    }

    public void irACoberturasGlobales(){
        divCoberturaGlobal.click();
    }

}
