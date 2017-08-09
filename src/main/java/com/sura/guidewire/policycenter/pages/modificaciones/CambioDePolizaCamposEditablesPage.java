package com.sura.guidewire.policycenter.pages.modificaciones;

import com.sura.guidewire.policycenter.resources.PageUtil;

import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;

public class CambioDePolizaCamposEditablesPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:plan_DV-inputEl']")
    private WebElementFacade txtPlanVehicular;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:transportFuel_true-inputEl']")
    private WebElementFacade checkBoxCombustible;
    @FindBy(xpath = ".//*[@id='UWBlockProgressIssuesPopup:IssuesScreen:ApproveDV:0:ShortDescriptionAndSize-inputEl']")
    private WebElementFacade labelMensajeCombustible;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:StatedValue_DV-inputEl']")
    private WebElementFacade txtValorAsegurado;
    @FindBy(xpath = "//span[contains(.,'Siguiente >')]")
    private WebElementFacade botonSiguienteModificacion;
    @FindBy(xpath = "//div[contains(.,'El valor asegurado del vehículo ($301.000.000,00)')]")
    private WebElementFacade labelMensajeValorAsegurado;
    @FindBy(xpath = "//li[contains(.,'Plan Autos Clásico')]")
    private WebElementFacade planAutosClasico;
    @FindBy(xpath = "//li[contains(.,'Plan Autos Básico')]")
    private WebElementFacade botonPlanAutosBasico;
    @FindBy(xpath = "//li[contains(.,'Plan Autos Clásico')]")
    private WebElementFacade botonPlanAutosClasico;


    public CambioDePolizaCamposEditablesPage(WebDriver driver) {
        super(driver);
    }

    public void cambiarPlanVehicular(String plan) {
        seleccionarItem(txtPlanVehicular, plan);
    }

    public void agregarTransporteCombustible() {
        checkBoxCombustible.click();
    }

    public String validarMensajeCombustible() {
        labelMensajeCombustible.waitUntilPresent();
        return labelMensajeCombustible.getText();
    }

    public void agregarValorAsegurado(String valor) {
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(txtValorAsegurado);
        ingresarDato(txtValorAsegurado, valor);
    }

    public String validarMensajeValorAsegurado() {
        if (labelMensajeValorAsegurado.isPresent()) {
            return labelMensajeValorAsegurado.getText();
        }
        return labelMensajeValorAsegurado.getText();
    }

    public void seleccionarOpcionSiguiente() {
        esperarYClickearBoton(botonSiguienteModificacion);
    }
}
