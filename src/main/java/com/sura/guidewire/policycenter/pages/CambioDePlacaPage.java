package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Map;


public class CambioDePlacaPage extends PageUtil {

    public CambioDePlacaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:plateChange-inputEl']")
    private WebElementFacade itemCambiarPlaca;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicensePlate_DV-inputEl']")
    private WebElementFacade txtCambioDePlaca;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Year_DV-inputEl']")
    private WebElementFacade txtModelo;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:facecoldaCode_DV-inputEl']")
    private WebElementFacade txtCodigoFasecolda;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Type_DV-inputEl']")
    private WebElementFacade txtClaseVehiculo;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Make_DV-inputEl']")
    private WebElementFacade txtMarca;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Model_DV-inputEl']")
    private WebElementFacade txtLinea;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:city-inputEl']")
    private WebElementFacade txtCiudadDeCirculacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:VehiculeZone-bodyEl']")
    private WebElementFacade txtZona;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:service_DV-inputEl']")
    private WebElementFacade txtTipoServicio;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Engine_DV-inputEl']")
    private WebElementFacade txtMotor;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:chasisl_DV-inputEl']")
    private WebElementFacade txtChasis;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:StatedValue_DV-inputEl']")
    private WebElementFacade txtValorAsegurado;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicensePlate_DV-inputEl']")
    private WebElementFacade txtPlacaNueva;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:city-inputEl']")
    private WebElementFacade txtCiudad;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:Next-btnInnerEl']")
    private WebElementFacade botonSiguiente;
    @FindBy(xpath = ".//div[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:_msgs']/div")
    private WebElementFacade labelMensajePlacaExistente;
    @FindBy(xpath = ".//*[contains(text(), 'Exped') and contains(@id, 'QuoteScreen:JobWizardToolbarButtonSet')]")
    private WebElementFacade botonExpedirPoliza;
    @FindBy(xpath = ".//a[contains(.,'Aceptar')]")
    private WebElementFacade botonAceptarExpedicion;

    public void cambiarPlaca(String placa) {
        waitUntil(WAIT_TIME_2000);
        txtCambioDePlaca.clear();
        txtCambioDePlaca.sendKeys(placa);
        waitUntil(WAIT_TIME_2000);
    }

    public void clickCambiarPlaca() {
        waitUntil(WAIT_TIME_3000);
        itemCambiarPlaca.click();
    }

    public void datosPlacaAnterior(ExamplesTable datosPlaca) {
        Map<String, String> datos = datosPlaca.getRow(0);
        txtMotor.waitUntilPresent();
        MatcherAssert.assertThat("Error, el modelo fue modificado", txtModelo.getValue().equals(datos.get("modelo")));
        MatcherAssert.assertThat("Error, el codigoFasecolda fue modificado", txtCodigoFasecolda.getValue().equals(datos.get("codigoFasecolda")));
        MatcherAssert.assertThat("Error, la clase de vehiculo fue modificada", txtClaseVehiculo.getText().equals(datos.get("claseVehiculo")));
        MatcherAssert.assertThat("Error, la marca de vehiculo fue modificado", txtMarca.getValue().equals(datos.get("marca")));
        MatcherAssert.assertThat("Error, la ciudad de circulacion fue modificada", txtCiudadDeCirculacion.getValue().equals(datos.get("ciudadCirculacion")));
        MatcherAssert.assertThat("Error, la  zona fue modificada", txtZona.getText().equals(datos.get("zona")));
        MatcherAssert.assertThat("Error, el tipo de servicio fue modificada", txtTipoServicio.getValue().equals(datos.get("tipoServicio")));
        MatcherAssert.assertThat("Error, el motor fue modificada", txtMotor.getValue().equals(datos.get("motor")));
        MatcherAssert.assertThat("Error, el chasis  fue modificada", txtChasis.getValue().equals(datos.get("chasis")));

    }

    public void cambiarPlacaSegundaVez() {
        waitUntil(WAIT_TIME_3000);
        itemCambiarPlaca.click();
        waitUntil(WAIT_TIME_3000);
    }

    public void mostrarPlacaInicial(String placaInicial) {
        waitForTextToAppear(placaInicial);
        MatcherAssert.assertThat(txtCambioDePlaca.getText(), Is.is(Matchers.equalTo(placaInicial)));
    }

    public void ingresarPlacaVenezolana(String ciudad, String placaVenezolana) {
        waitUntil(WAIT_TIME_2000);
        txtPlacaNueva.clear();
        txtPlacaNueva.sendKeys(placaVenezolana);
        waitUntil(WAIT_TIME_2000);
        txtCiudad.clear();
        txtCiudad.sendKeys(ciudad);
        waitUntil(WAIT_TIME_2000);
        botonSiguiente.click();
    }

    public void cambiarPorPlacaExistente(String placaExistente) {
        int intentos = 0;
        while (intentos < 3) {
            waitUntil(WAIT_TIME_2000);
            System.out.println("ingreso a ciclo placa existente ");
            if ("".equals(txtCambioDePlaca.getText())) {
                System.out.println("ingreso a if ");
                txtCambioDePlaca.clear();
                txtCambioDePlaca.sendKeys(placaExistente);
                break;
            }
            intentos++;
        }
    }

    public void mensajePlacaExistente(String mensaje) {
        MatcherAssert.assertThat("Error, el modelo fue modificado", labelMensajePlacaExistente.getValue().equals("mensaje"));

    }

    public void clickItemCambiarPlaca() {
        Actions actions = new Actions(getDriver());
        int intentos = 0;
        while (intentos < 3) {
            waitUntil(WAIT_TIME_2000);
            if (!"0 -15px".equals(itemCambiarPlaca.getCssValue("background-position"))) {
                actions.click(itemCambiarPlaca).build().perform();
                System.out.println("seleccionado ");
            } else {
                break;
            }
            intentos++;
        }
        waitUntil(WAIT_TIME_2000);
    }

    public void expedirCambioPoliza() {
        botonExpedirPoliza.waitUntilPresent().click();
        botonAceptarExpedicion.waitUntilPresent().click();
        waitForTextToAppear("");
    }
}
