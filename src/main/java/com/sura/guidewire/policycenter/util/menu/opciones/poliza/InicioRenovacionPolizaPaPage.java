package com.sura.guidewire.policycenter.util.menu.opciones.poliza;


import com.sura.guidewire.policycenter.util.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.concurrent.TimeUnit;


public class InicioRenovacionPolizaPaPage extends PageUtil {


    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab']")
    WebElementFacade menuPoliza;
    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab:PolicyTab_PolicyRetrievalItem-inputEl']")
    WebElementFacade menuNumeropoliza;
    @FindBy(xpath = ".//*[@id='messagebox-1001-displayfield-inputEl']")
    WebElementFacade lblMensajeEnPantalla;
    @FindBy(xpath = ".//*[@id='PolicyFile:PolicyFileMenuActions-btnInnerEl']")
    WebElementFacade btnAcciones;
    @FindBy(xpath = ".//*[@id='PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_NewWorkOrder:PolicyFileMenuActions_RenewPolicy-textEl']")
    WebElementFacade btnRenovarPoliza;
    @FindBy(xpath = ".//*[@id='button-1008-btnInnerEl']")
    WebElementFacade btnCancelarRenovacion;
    @FindBy(xpath = ".//*[@id='button-1005-btnInnerEl']")
    WebElementFacade btnAceptarRenovacion;
    @FindBy(xpath = ".//*[@id='RenewalWizard:Next-btnInnerEl']")
    WebElementFacade btnSiguiente;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:AccountInfoInputSet:OfficialIDInputSet:OfficialIDDV_Input-inputEl']")
    WebElementFacade datoCedeulaTomador;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:Producer-inputEl']")
    WebElementFacade datoOficinaDeRadicacion;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:ProducerCode-inputEl']")
    WebElementFacade datoAgente;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:AccountInfoInputSet:Name-inputEl']")
    WebElementFacade datoNombre;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:OfficialIDInputSet:OfficialIDDV_Input-inputEl']")
    WebElementFacade datoCedulaAsegurado;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    WebElementFacade datoPrimerNombreAsegurado;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:LastName-inputEl']")
    WebElementFacade datoPrimerApellidoAsegurado;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicensePlate_DV-inputEl']")
    WebElementFacade datoPlaca;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Year_DV-inputEl']")
    WebElementFacade datoModelo;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:facecoldaCode_DV-inputEl']")
    WebElementFacade datoCodFasecolda;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Type_DV-inputEl']")
    WebElementFacade datoClaseVehiculo;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Make_DV-inputEl']")
    WebElementFacade datoMarca;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Model_DV-inputEl']")
    WebElementFacade datoLinea;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:VehiculeZone-inputEl']")
    WebElementFacade datoZona;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:service_DV-inputEl']")
    WebElementFacade datoTipoServicio;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Engine_DV-inputEl']")
    WebElementFacade datoMotor;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:chasisl_DV-inputEl']")
    WebElementFacade datoChasis;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:StatedValue_DV-inputEl']")
    WebElementFacade datoValorAsegura;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:JobWizardToolbarButtonSet:CloseOptions']")
    WebElementFacade btnOpcionDeCierre;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:JobWizardToolbarButtonSet:CloseOptions:Withdraw']")
    WebElementFacade btnRetiraTransaccion;
    @FindBy(xpath = ".//*[@id='button-1005-btnInnerEl']")
    WebElementFacade btnAceptarRetiraTransaccion;
    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab']")
    WebElementFacade btnPoliza;


    PageUtil pageUtil = new PageUtil(getDriver());

    public InicioRenovacionPolizaPaPage(WebDriver driver) {
        super(driver);
    }


    public void irABuscarCotizacion(String cotizacion) {
        waitFor(menuPoliza).waitUntilPresent();
        menuPoliza.click();
        waitForAnyTextToAppear("Cotización", "Buscar pólizas");
        waitFor(menuPoliza).waitUntilPresent();
        menuPoliza.click();
        menuPoliza.sendKeys(Keys.ARROW_DOWN);
        menuNumeropoliza.waitUntilPresent();
        pageUtil.ingresarDato(menuNumeropoliza, cotizacion);
        menuNumeropoliza.sendKeys(Keys.ENTER);
        waitForTextToAppear("Cotización");
        waitForTextToAppear(cotizacion);
    }

    public void irARenovacion() {
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(btnAcciones).waitUntilPresent();
        btnAcciones.click();
        btnRenovarPoliza.click();
    }

    public void cancelaOperacionRenovacion() {
        btnCancelarRenovacion.click();
    }

    public void aceptaOperacionRenovacion() {
        btnAceptarRenovacion.click();
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(btnSiguiente).waitUntilClickable();
    }

    public void clickBotonSiguiente() {
        btnSiguiente.click();
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(btnSiguiente).waitUntilClickable();
    }

    public void validaMensajeEnPantalla(String mensaje) {
        MatcherAssert.assertThat("El mensaje en pantalla no cumple con la info", lblMensajeEnPantalla.getText().equals(mensaje));
    }

    public void validacionesPantallaFormularios(ExamplesTable datosTomador) {
        Map<String, String> datos = datosTomador.getRow(0);
        if ("tomador".equals(datos.get("rol"))) {
            MatcherAssert.assertThat("cedula del tomador no valida", datoCedeulaTomador.getText().equals(datos.get("cedulaTomador")));
            MatcherAssert.assertThat("el nombre del tomador no es valido", datoNombre.getText().equals(datos.get("nombre")));
            MatcherAssert.assertThat("el nombre de oficina de radicacion", datoOficinaDeRadicacion.getText().equals(datos.get("oficinaRadicacion")));
            MatcherAssert.assertThat("el nombre de agente", datoAgente.getText().contains(datos.get("codAgente")));
            clickBotonSiguiente();
        } else if ("asegurado".equals(datos.get("rol"))) {
            MatcherAssert.assertThat("cedula del Asegurado no valida", datoCedulaAsegurado.getText().equals(datos.get("cedulaAsegurado")));
            MatcherAssert.assertThat("primer nombre no valido", datoPrimerNombreAsegurado.getText().equals(datos.get("pNombre")));
            MatcherAssert.assertThat("primer apellido no valido", datoPrimerApellidoAsegurado.getText().equals(datos.get("pApellido")));
            clickBotonSiguiente();
        } else if ("vehiculo".equals(datos.get("rol"))) {
            MatcherAssert.assertThat("placa no valida", datoPlaca.getText().equals(datos.get("placa")));
            MatcherAssert.assertThat("modelo no valido", datoModelo.getText().equals(datos.get("modelo")));
            MatcherAssert.assertThat("codFasecolda no valido", datoCodFasecolda.getText().equals(datos.get("codFasecolda")));
            MatcherAssert.assertThat("clase Vehiculo no valido", datoClaseVehiculo.getText().equals(datos.get("claseVehiculo")));
            MatcherAssert.assertThat("marca no valida", datoMarca.getText().equals(datos.get("marca")));
            MatcherAssert.assertThat("linea no valida", datoLinea.getText().equals(datos.get("linea")));
            MatcherAssert.assertThat("zona no valida", datoZona.getText().equals(datos.get("zona")));
            MatcherAssert.assertThat("tipo Servicio no valido", datoTipoServicio.getText().equals(datos.get("tipoServicio")));
            MatcherAssert.assertThat("motor no valido", datoMotor.getText().equals(datos.get("motor")));
            MatcherAssert.assertThat("chasis no valido", datoChasis.getText().equals(datos.get("chasis")));
            btnPoliza.click();
        }
    }

    public void retirarTransaccion() {

        withTimeoutOf(40, TimeUnit.SECONDS).waitFor(btnOpcionDeCierre).waitUntilClickable();
        btnOpcionDeCierre.click();
        withTimeoutOf(40, TimeUnit.SECONDS).waitFor(btnRetiraTransaccion).waitUntilClickable();
        btnRetiraTransaccion.click();
        withTimeoutOf(40, TimeUnit.SECONDS).waitFor(btnAceptarRetiraTransaccion).waitUntilClickable();
        btnAceptarRetiraTransaccion.click();
    }
}
