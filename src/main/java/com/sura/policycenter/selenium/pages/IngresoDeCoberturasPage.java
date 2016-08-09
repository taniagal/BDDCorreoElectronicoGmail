package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class IngresoDeCoberturasPage extends PageObject{

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade campoLimite;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:CoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade campoDeducible;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl']")
    private WebElementFacade botonCotizar;

    Guidewire guidewire = new Guidewire(getDriver());

    public IngresoDeCoberturasPage(WebDriver driver){
        super(driver);
    }

    public void ingresarLimite(){
        waitForTextToAppear("Cobertura");
        waitFor(campoLimite).click();
        campoLimite.sendKeys(Keys.ARROW_DOWN);
        campoLimite.sendKeys(Keys.ENTER);
    }

    public void ingresarDeducible(){
        campoDeducible.click();
        campoDeducible.sendKeys(Keys.ARROW_DOWN);
        campoDeducible.sendKeys(Keys.ENTER);
    }

    public void cotizar(){
        botonCotizar.click();
        guidewire.waitUntil(3000);
    }
}
