package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Map;


public class CambioDePlacaPage extends PageUtil {

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
    @FindBy(xpath = ".//li")
    private WebElementFacade txtCiudadCirculacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:Next-btnInnerEl']")
    private WebElementFacade botonSiguiente;
    @FindBy(xpath = ".//div[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:_msgs']/div")
    private WebElementFacade labelMensajePlacaExistente;
    @FindBy(xpath = ".//*[contains(text(), 'Exped') and contains(@id, 'QuoteScreen:JobWizardToolbarButtonSet')]")
    private WebElementFacade botonExpedirPoliza;
    @FindBy(xpath = ".//a[contains(.,'Aceptar')]")
    private WebElementFacade botonAceptarExpedicion;
    @FindBy(xpath = ".//div[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:_msgs']/div")
    private WebElementFacade tablaRequisito;
    @FindBy(xpath = ".//*[@id='wsTabBar:wsTab_0:panelId']")
    private WebElementFacade tablaRequisitos;
    @FindBy(xpath = ".//div[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']/div[2]")
    private WebElementFacade labelRequisitoPorPlacaExtrangera;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:Next-btnInnerEl']")
    private WebElementFacade botonSiguienteProducto;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel_tb:Add-btnInnerEl']")
    private WebElementFacade botonAgregarVehiculo;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:PolicyChangeWizard_QuoteScreen:JobWizardToolbarButtonSet:EditPolicy-btnInnerEl']")
    private WebElementFacade botonEditarCambioPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:EditPolicy-btnInnerEl']")
    private WebElementFacade botonEditarCambioPolizaExpedicion;
    @FindBy(xpath = ".//span[contains(.,'Aceptar')]")
    private WebElementFacade botonEditarCambioPolizaAceptar;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PersonalVehicles']/div/span")
    private WebElementFacade itemVehiculosModificacion;
    @FindBy(xpath = ".//div[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']/div")
    private WebElementFacade labelMensajePlacaRiesgoConsultable;
    @FindBy(xpath = ".//*[@id='wsTabBar:wsTab_0:panelId']")
    private WebElementFacade panelRequisitos;
    @FindBy(xpath = ".//*[@id='UWBlockProgressIssuesPopup:IssuesScreen:ApproveDV']")
    private WebElementFacade labelMensajePlacaExtranjeraCucuta;
    @FindBy(xpath = ".//*[@id='centerPanel']")
    private WebElementFacade tablaRequisitosAutorizacion;

    private static final int CONSTANTE_3 = 3;

    public CambioDePlacaPage(WebDriver driver) {
        super(driver);
    }


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
        waitUntil(WAIT_TIME_2000);
        MatcherAssert.assertThat(txtCambioDePlaca.getText(), Is.is(Matchers.equalTo(placaInicial)));
    }

    public void ingresarPlacaVenezolana(String placaVenezolana) {
        clickElement(itemCambiarPlaca);
        clickElement(itemCambiarPlaca);
        waitUntil(WAIT_TIME_2000);
        txtPlacaNueva.clear();
        txtPlacaNueva.sendKeys(placaVenezolana);
    }

    public void cambiarPorPlacaExistente(String placaExistente) {
        int intentos = 0;
        while (intentos < CONSTANTE_3) {
            waitUntil(WAIT_TIME_2000);
            if ("".equals(txtCambioDePlaca.getText())) {
                txtCambioDePlaca.clear();
                txtCambioDePlaca.sendKeys(placaExistente);
                break;
            }
            intentos++;
        }
    }

    public void mensajePlacaExistente(ExamplesTable mensaje) {
        botonSiguiente.click();
        Map<String, String> datos = mensaje.getRow(0);
        txtMotor.waitUntilPresent();
        MatcherAssert.assertThat("Error, mensaje no encontrado", labelMensajePlacaExistente.getText().equals(datos.get("mensaje")));
    }


    public void clickItemCambiarPlaca() {
        Actions actions = new Actions(getDriver());
        int intentos = 0;
        while (intentos < CONSTANTE_3) {
            waitUntil(WAIT_TIME_2000);
            if (!"0px -15px".equals(itemCambiarPlaca.getCssValue("background-position"))) {
                actions.click(itemCambiarPlaca).build().perform();
            } else {
                break;
            }
            intentos++;
        }
        waitUntil(WAIT_TIME_2000);
    }

    public void deseleccionarCheckBoxDePlaca() {
        Actions actions = new Actions(getDriver());
        int intentos = 0;
        while (intentos < CONSTANTE_3) {
            waitUntil(WAIT_TIME_2000);
            if ("0px -15px".equals(itemCambiarPlaca.getCssValue("background-position")) || "-15px -15px".equals(itemCambiarPlaca.getCssValue("background-position"))) {
                actions.click(itemCambiarPlaca).build().perform();
                waitUntil(WAIT_TIME_2000);
            } else {
                break;
            }
            intentos++;
        }
    }


    public void expedirCambioPoliza() {
        botonExpedirPoliza.waitUntilPresent().click();
        botonAceptarExpedicion.waitUntilPresent().click();
    }


    public void mensajeAutorizacion(ExamplesTable mensajeAutorizacion) {
        Map<String, String> datos = mensajeAutorizacion.getRow(0);
        tablaRequisitos.waitUntilPresent();
        MatcherAssert.assertThat("Error, mensaje no encontrado", labelRequisitoPorPlacaExtrangera.getText().equals(datos.get("mensajeAutorizacion")));

    }

    public void clickSiguiente() {
        waitUntil(WAIT_TIME_3000);
        botonSiguienteProducto.click();
        waitUntil(WAIT_TIME_3000);
    }

    public void clickAgregarVehiculo() {
        botonAgregarVehiculo.click();
        waitUntil(WAIT_TIME_3000);
    }

    public void editarCambioPoliza() {
        if (botonEditarCambioPoliza.isPresent()) {
            botonEditarCambioPoliza.click();
            waitUntil(WAIT_TIME_3000);
            botonEditarCambioPolizaAceptar.click();
            waitUntil(WAIT_TIME_3000);
        } else if (botonEditarCambioPolizaExpedicion.isPresent()) {
            botonEditarCambioPolizaExpedicion.click();
            waitUntil(WAIT_TIME_3000);
            botonEditarCambioPolizaAceptar.click();
            waitUntil(WAIT_TIME_3000);
        }
    }

    public void ingresarPlacaRiesgoConsultable(String placaRiesgoConsultable) {
        itemVehiculosModificacion.click();
        clickElement(itemCambiarPlaca);
        clickElement(itemCambiarPlaca);
        waitUntil(WAIT_TIME_2000);
        txtCambioDePlaca.clear();
        txtCambioDePlaca.sendKeys(placaRiesgoConsultable);

    }

    public void mensajePlacaRiesgoConsultable(ExamplesTable mensajePlacaRiesgoConsultable) {
        Map<String, String> datos = mensajePlacaRiesgoConsultable.getRow(0);
        panelRequisitos.waitUntilPresent();
        MatcherAssert.assertThat("Error, mensaje no encontrado", labelMensajePlacaRiesgoConsultable.getText().equals(datos.get("mensajePlacaRiesgoConsultable")));
    }

    public void ingresarPlacaExtranjera(String venezolana, String ciudad) {
        itemVehiculosModificacion.click();
        clickElement(itemCambiarPlaca);
        clickElement(itemCambiarPlaca);
        waitUntil(WAIT_TIME_2000);
        txtCambioDePlaca.clear();
        txtCambioDePlaca.sendKeys(venezolana);
        txtCiudad.clear();
        waitUntil(WAIT_TIME_3000);
        txtCiudad.sendKeys(ciudad);
        txtCiudadCirculacion.click();
    }

    public void mensajeDeAutorizacion(ExamplesTable mensajeDeAutorizacion) {
        Map<String, String> datos = mensajeDeAutorizacion.getRow(0);
        labelMensajePlacaExtranjeraCucuta.waitUntilPresent();
        MatcherAssert.assertThat("Error, mensaje no encontrado", labelMensajePlacaExtranjeraCucuta.getText().contains(datos.get("mensajeDeAutorizacion")));
        waitUntil(WAIT_TIME_3000);

    }
}
