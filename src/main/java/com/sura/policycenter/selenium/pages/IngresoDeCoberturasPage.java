package com.sura.policycenter.selenium.pages;

import com.sura.commons.selenium.Commons;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class IngresoDeCoberturasPage extends PageObject{

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade campoLimite;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:CoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade campoDeducible;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl']")
    private WebElementFacade botonCotizar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAHurtoAlCarroGrpDetailDV:0:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkHurto;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:RatingCumulDetailsPanelSet:RatingOverrideButtonDV:RatingOverrideButtonDV:ViewWorksheet']")
    private WebElementFacade botonMostrarHojaDeCalculo;


    Commons commons = new Commons(getDriver());

    public IngresoDeCoberturasPage(WebDriver driver){
        super(driver);
    }

    public void ingresarLimite(){
        waitForTextToAppear("Cobertura");
        commons.selectItem(campoLimite,"32.000.000");
    }

    public void ingresarDeducible(){
        commons.selectItem(campoDeducible,"0");
    }

    public void cotizar(){
        botonCotizar.click();
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(botonMostrarHojaDeCalculo).waitUntilPresent();
    }

    public void clickEnCheckHurto(){
        waitFor(checkHurto);
        if("0px -15px".equals(checkHurto.getCssValue("background-position"))){
            checkHurto.click();
        }
    }
}
