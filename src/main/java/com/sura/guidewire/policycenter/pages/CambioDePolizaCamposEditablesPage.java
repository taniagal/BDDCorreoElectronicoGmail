package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public class CambioDePolizaCamposEditablesPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:plan_DV-inputEl']")
    private WebElementFacade txtPlanVehicular;

    public CambioDePolizaCamposEditablesPage(WebDriver driver) {
        super(driver);
    }

    public void cambiarPlanVehicular(String plan) {
        ingresarDato(txtPlanVehicular,plan);
    }

    public void agregarTransporteCombustible() {

    }
}
