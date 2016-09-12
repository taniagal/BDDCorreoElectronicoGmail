package com.sura.policycenter.selenium.pages;

import com.sura.commons.selenium.Commons;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class CalculoBonificacionPage extends Commons{
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:4:RateModifier-inputEl']")
    public WebElementFacade campoTxtBonificacionTecnica;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:5:RateModifier-inputEl']")
    public WebElementFacade campoTxtBonificacionComercial;


    public CalculoBonificacionPage(WebDriver driver){
        super(driver);
    }

    public void verificarBonoTecnico(String bono){
        withTimeoutOf(28, TimeUnit.SECONDS).waitFor(ExpectedConditions.textToBePresentInElementValue(campoTxtBonificacionTecnica,bono));
        MatcherAssert.assertThat("Error en el valor de la bonificación, was "+campoTxtBonificacionTecnica.getValue(), campoTxtBonificacionTecnica.getValue().contains(bono));
    }

    public void verificarBonoComercial(String bono){
        waitFor(ExpectedConditions.textToBePresentInElementValue(campoTxtBonificacionComercial,bono));
        MatcherAssert.assertThat("Error en el valor de la bonificación, was "+campoTxtBonificacionComercial.getValue(), campoTxtBonificacionComercial.getValue().contains(bono));
    }
}
