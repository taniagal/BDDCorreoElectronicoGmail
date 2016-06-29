package com.sura.policycenter.selenium.pages;


import com.sura.guidewire.selenium.Guidewire;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;


public class ValidacionesInformacionDeVehiculoPage extends Guidewire {
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:PersonalVehicles']/div")
    private WebElementFacade menuItemVehiculos;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel_tb:Add-btnInnerEl']")
    private WebElementFacade botonCrearVehiculo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicensePlate_DV-inputEl']")
    private WebElementFacade campoTxtPlaca;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Year_DV-inputEl']")
    private WebElementFacade comboBoxModelo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:_msgs']")
    private WebElementFacade divMensaje;


    public ValidacionesInformacionDeVehiculoPage(WebDriver driver) {
        super(driver);
    }

    public void irAVehiculos() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(menuItemVehiculos).shouldBePresent();
        menuItemVehiculos.click();
        botonCrearVehiculo.click();
        campoTxtPlaca.waitUntilPresent();
        botonCrearVehiculo.click();
    }

    public void verificarMensajes(ExamplesTable mensajes){
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(divMensaje).shouldBePresent();
        for(Map<String, String> mensaje: mensajes.getRows()){
            MatcherAssert.assertThat("Error en el mensaje "+mensaje.get("mensaje"), divMensaje.containsText(mensaje.get("mensaje")));
        }
    }
}
