package com.sura.policycenter.selenium.pages;

import com.sura.commons.selenium.Commons;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ModificadoresDeTarifaPage extends Commons{
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:6:RateModifier-inputEl']")
    public WebElementFacade campoTxtBonificacionTecnica;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:2:RateModifier-inputEl']")
    public WebElementFacade campoTxtBonificacionComercial;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:3:RateModifier-inputEl']")
    public WebElementFacade campoTxtDescuento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:4:RateModifier-inputEl']")
    public WebElementFacade campoTxtRecargo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:5:RateModifier-inputEl']")
    public WebElementFacade campoTxtSuavizacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:1:TypeKeyModifier-inputEl']")
    public WebElementFacade comboBoxDescuentoDipositivo;



    public ModificadoresDeTarifaPage(WebDriver driver){
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

    public void agregarModificadores(ExamplesTable valores) {
        Map<String,String> valor = valores.getRow(0);
        selectItem(comboBoxDescuentoDipositivo,valor.get("descientoD"));
        campoTxtBonificacionComercial.sendKeys(valor.get("bonificacionC"));
        campoTxtDescuento.sendKeys(valor.get("descuento"));
        campoTxtRecargo.sendKeys(valor.get("recargo"));
        campoTxtSuavizacion.sendKeys(valor.get("suavizacion"));
        campoTxtBonificacionTecnica.sendKeys(valor.get("bonificacionT"));
    }
}
