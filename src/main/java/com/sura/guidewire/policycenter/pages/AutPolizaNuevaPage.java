package com.sura.guidewire.policycenter.pages;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class AutPolizaNuevaPage extends PageUtil{
    @FindBy(xpath = ".//*[@id='SubmissionWizard:JobWizardToolsMenuWizardStepSet:WorkplanScreen:JobWizardWorkplanPanelSet:JobWizardWorkplanLV-body']//table//tr")
    public String tblFilasreglas;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:JobWizardToolsMenuWizardStepSet:WorkplanScreen:JobWizardWorkplanPanelSet:JobWizardWorkplanLV-body']//table//td")
    public String tblColumnasReglas;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:JobWizardToolsMenuWizardStepSet:WorkplanScreen:JobWizardWorkplanPanelSet:JobWizardWorkplanLV-body']//table//tr//td")
    public String tblColumnasFilasReglas;

    public AutPolizaNuevaPage(WebDriver driver){
        super(driver);
    }

  
}
