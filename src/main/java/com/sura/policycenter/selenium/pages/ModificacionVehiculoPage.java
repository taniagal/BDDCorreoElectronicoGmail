package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ModificacionVehiculoPage extends Guidewire{

    @FindBy(xpath=".//*[@id='PolicyChangeWizard:Next-btnInnerEl']")
    private WebElementFacade botonSiguiente;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:city-inputEl']")
    private WebElementFacade campoCiudadCirculacion;

    public ModificacionVehiculoPage(WebDriver driver) {
        super(driver);
    }

    public void irAModificarVehiculo() {
        WebElementFacade tituloInformacionPoliza = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:ttlBar']");
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(tituloInformacionPoliza).shouldBePresent();
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(botonSiguiente).click();
        WebElementFacade tituloAsegurados = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:ttlBar']");
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(tituloAsegurados).shouldBePresent();
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(botonSiguiente).click();
    }

    public void digitarFasecoldaYModelo(String numeroFasecolda, String modelo) {
        WebElementFacade modeloVehiculo = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Year_DV-inputEl']");
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(modeloVehiculo).typeAndTab(modelo);
        waitUntil(2000);
        WebElementFacade fasecolda = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:facecoldaCode_DV-inputEl']");
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(fasecolda).typeAndTab(numeroFasecolda);
        waitUntil(2000);
        withTimeoutOf(10,TimeUnit.SECONDS).waitFor(campoCiudadCirculacion).typeAndTab("MEDELLIN");
        waitUntil(2000);
        WebElementFacade tipoServicio = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:service_DV-inputEl']");
        withTimeoutOf(10,TimeUnit.SECONDS).waitFor(tipoServicio).typeAndTab("Particular");
        waitUntil(2000);
    }

    public void mostrarDatosVehiculo(String claseVehiculo, String marca, String linea) {
        WebElementFacade campoClaseVehiculo = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Type_DV-inputEl']");
        MatcherAssert.assertThat(campoClaseVehiculo.getText(), Is.is(Matchers.equalTo(claseVehiculo)));
        WebElementFacade campoMarca = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Make_DV-inputEl']");
        MatcherAssert.assertThat(campoMarca.getText(), Is.is(Matchers.equalTo(marca)));
        WebElementFacade campoLinea = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Model_DV-inputEl']");
        MatcherAssert.assertThat(campoLinea.getText(), Is.is(Matchers.equalTo(linea)));
        waitUntil(1000);
    }

    public void registrarZonaCirculacion(String ciudadCirculacion) {
        waitUntil(2000);
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(campoCiudadCirculacion).typeAndTab(ciudadCirculacion);
        waitUntil(1000);
        withTimeoutOf(10,TimeUnit.SECONDS).waitFor(botonSiguiente).click();
        waitUntil(3000);
    }

    public void validarZonaCirculacion(String mensaje) {
        WebElementFacade grupoMensajes = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:_msgs']");
        MatcherAssert.assertThat(grupoMensajes.getText(), Matchers.containsString(mensaje));
    }
}