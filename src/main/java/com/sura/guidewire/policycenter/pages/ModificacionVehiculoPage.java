package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;


public class ModificacionVehiculoPage extends PageUtil {

    @FindBy(xpath=".//*[@id='PolicyChangeWizard:Next-btnInnerEl']")
    private WebElementFacade botonSiguiente;
    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:city-inputEl']")
    private WebElementFacade campoCiudadCirculacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:VehiculeZone-inputEl']")
    private WebElementFacade campoTxtzona;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:_msgs']")
    private WebElementFacade grupoMensajes;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:_msgs']/div")
    private WebElementFacade validacionVigencia;

    public ModificacionVehiculoPage(WebDriver driver) {
        super(driver);
    }

    public void irAModificarVehiculo() {
        WebElementFacade tituloInformacionPoliza = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:ttlBar']");
        waitFor(tituloInformacionPoliza).shouldBePresent();
        waitFor(botonSiguiente).click();
        setImplicitTimeout(TIEMPO_5, TimeUnit.SECONDS);
        if(validacionVigencia.isPresent()){
            waitFor(botonSiguiente).click();
        }
        resetImplicitTimeout();
        WebElementFacade tituloAsegurados = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:ttlBar']");
        waitFor(tituloAsegurados).shouldBePresent();
        waitFor(botonSiguiente).click();
    }

    public void digitarFasecoldaYModelo(String numeroFasecolda, String modelo) {
        WebElementFacade modeloVehiculo = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Year_DV-inputEl']");
        waitFor(modeloVehiculo).typeAndTab(modelo);
        esperarHasta(TIEMPO_2000);
        WebElementFacade fasecolda = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:facecoldaCode_DV-inputEl']");
        waitFor(fasecolda).typeAndTab(numeroFasecolda);
        esperarHasta(TIEMPO_2000);
        waitFor(campoCiudadCirculacion).typeAndTab("MEDELLIN");
        esperarHasta(TIEMPO_2000);
        WebElementFacade tipoServicio = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:service_DV-inputEl']");
        waitFor(tipoServicio).typeAndTab("Particular");
        esperarHasta(TIEMPO_2000);
    }

    public void mostrarDatosVehiculo(String claseVehiculo, String marca, String linea) {
        WebElementFacade campoClaseVehiculo = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Type_DV-inputEl']");
        MatcherAssert.assertThat("Error en el valor de la clase de vehiculo",campoClaseVehiculo.getText(), Is.is(Matchers.equalTo(claseVehiculo)));
        WebElementFacade campoMarca = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Make_DV-inputEl']");
        MatcherAssert.assertThat("Error en el valor de la marca",campoMarca.getValue().contains(marca));
        WebElementFacade campoLinea = findBy(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Model_DV-inputEl']");
        MatcherAssert.assertThat("Error en el valor de la linea",campoLinea.getValue().contains(linea));
        esperarHasta(TIEMPO_1000);
    }

    public void registrarZonaCirculacion(String ciudadCirculacion) {
        esperarHasta(TIEMPO_3000);
        waitFor(campoCiudadCirculacion).typeAndTab(ciudadCirculacion);
        try {
        waitFor(ExpectedConditions.textToBePresentInElement(campoTxtzona,"11"));
        }catch (TimeoutException e){
            LOGGER.info("TimeoutException at ModificacionVehiculoPage Page 71 " + e);
        }
        waitFor(botonSiguiente).click();
        esperarHasta(TIEMPO_3000);
    }

    public void validarZonaCirculacion(String mensaje) {
        verificarMensaje(grupoMensajes, mensaje);
    }
}
