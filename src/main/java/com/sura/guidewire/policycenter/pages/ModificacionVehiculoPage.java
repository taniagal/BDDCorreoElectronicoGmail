package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.util.Commons;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ModificacionVehiculoPage extends Commons{

    @FindBy(xpath=".//*[@id='PolicyChangeWizard:Next-btnInnerEl']")
    private WebElementFacade botonSiguiente;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:city-inputEl']")
    private WebElementFacade campoCiudadCirculacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:VehiculeZone-inputEl']")
    private WebElementFacade campoTxtzona;

    public ModificacionVehiculoPage(WebDriver driver) {
        super(driver);
    }

    public void irAModificarVehiculo() {
        WebElementFacade tituloInformacionPoliza = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:ttlBar']");
        waitFor(tituloInformacionPoliza).shouldBePresent();
        waitFor(botonSiguiente).click();
        WebElementFacade tituloAsegurados = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:ttlBar']");
        waitFor(tituloAsegurados).shouldBePresent();
        waitFor(botonSiguiente).click();
    }

    public void digitarFasecoldaYModelo(String numeroFasecolda, String modelo) {
        WebElementFacade modeloVehiculo = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Year_DV-inputEl']");
        waitFor(modeloVehiculo).typeAndTab(modelo);
        waitUntil(2000);
        WebElementFacade fasecolda = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:facecoldaCode_DV-inputEl']");
        waitFor(fasecolda).typeAndTab(numeroFasecolda);
        waitUntil(2000);
        waitFor(campoCiudadCirculacion).typeAndTab("MEDELLIN");
        waitUntil(2000);
        WebElementFacade tipoServicio = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:service_DV-inputEl']");
        waitFor(tipoServicio).typeAndTab("Particular");
        waitUntil(2000);
    }

    public void mostrarDatosVehiculo(String claseVehiculo, String marca, String linea) {
        WebElementFacade campoClaseVehiculo = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Type_DV-inputEl']");
        MatcherAssert.assertThat("Error en el valor de la clase de vehiculo",campoClaseVehiculo.getText(), Is.is(Matchers.equalTo(claseVehiculo)));
        WebElementFacade campoMarca = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Make_DV-inputEl']");
        MatcherAssert.assertThat("Error en el valor de la marca",campoMarca.containsText(marca));
        WebElementFacade campoLinea = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Model_DV-inputEl']");
        MatcherAssert.assertThat("Error en el valor de la linea",campoLinea.containsText(linea));
        waitUntil(1000);
    }

    public void registrarZonaCirculacion(String ciudadCirculacion) {
        waitUntil(3000);
        waitFor(campoCiudadCirculacion).typeAndTab(ciudadCirculacion);
        waitFor(ExpectedConditions.textToBePresentInElement(campoTxtzona,"11"));
        waitFor(botonSiguiente).click();
        waitUntil(3000);
    }

    public void validarZonaCirculacion(String mensaje) {
        WebElementFacade grupoMensajes = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:_msgs']");
        verificarMensaje(grupoMensajes, mensaje);
    }
}
