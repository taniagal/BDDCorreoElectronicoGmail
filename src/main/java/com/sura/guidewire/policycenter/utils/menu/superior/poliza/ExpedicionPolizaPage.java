package com.sura.guidewire.policycenter.utils.menu.superior.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ExpedicionPolizaPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:AdditionalNamedInsuredsDV:NamedInsuredInputSet:NamedInsuredsLV_tb:AddContactsButton-btnInnerEl']")
    WebElementFacade btnAgrega;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:AdditionalNamedInsuredsDV:NamedInsuredInputSet:NamedInsuredsLV_tb:AddContactsButton:AddFromSearch-itemEl']")
    WebElementFacade list;

    public ExpedicionPolizaPage(WebDriver driver) {
        super(driver);
    }
}
