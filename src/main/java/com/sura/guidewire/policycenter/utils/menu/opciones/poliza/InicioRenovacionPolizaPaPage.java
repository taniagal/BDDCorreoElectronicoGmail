package com.sura.guidewire.policycenter.utils.menu.opciones.poliza;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.concurrent.TimeUnit;


public class InicioRenovacionPolizaPaPage extends PageUtil {
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
    WebElementFacade botonSiguiente;
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
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:JobWizardToolbarButtonSet:RenewalQuote-btnInnerEl']")
    WebElementFacade botonCotizaeV;
    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab']")
    WebElementFacade btnPoliza;

    public InicioRenovacionPolizaPaPage(WebDriver driver) {
        super(driver);
    }

    public void irARenovacion() {
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(btnAcciones).waitUntilPresent();
        clickearElemento(btnAcciones);
        clickearElemento(btnRenovarPoliza);
    }

    public void cancelaOperacionRenovacion() {
        btnCancelarRenovacion.click();
    }

    public void aceptaOperacionRenovacion() {
        btnAceptarRenovacion.click();
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(botonSiguiente).waitUntilClickable();
    }

    public void validaMensajeEnPantalla(String mensaje) {
        MatcherAssert.assertThat("El mensaje en pantalla no cumple con la info", lblMensajeEnPantalla.getText().equals(mensaje));
    }

    public void validacionesPantallaFormularios(ExamplesTable datosTomador) {
        esperarHasta(TIEMPO_1000);
        Map<String, String> datos = datosTomador.getRow(0);
        if ("tomador".equals(datos.get("rol"))) {
            MatcherAssert.assertThat("cedula del tomador no valida", datoCedeulaTomador.getText().equals(datos.get("cedulaTomador")));
            MatcherAssert.assertThat("el nombre del tomador no es valido", datoNombre.getText().equals(datos.get("nombre")));
            MatcherAssert.assertThat("el nombre de oficina de radicacion", datoOficinaDeRadicacion.getValue().equals(datos.get("oficinaRadicacion")));
            MatcherAssert.assertThat("el nombre de agente", datoAgente.getValue().contains(datos.get("codAgente")));
            clickearElemento(botonSiguiente);
        } else if ("asegurado".equals(datos.get("rol"))) {
            setImplicitTimeout(TIEMPO_2, TimeUnit.SECONDS);
            if (findBy(".message").isPresent()) {
                clickearElemento(botonSiguiente);
            }
            resetImplicitTimeout();
            MatcherAssert.assertThat("cedula del Asegurado no valida", datoCedulaAsegurado.getText().equals(datos.get("cedulaAsegurado")));
            MatcherAssert.assertThat("primer nombre no valido", datoPrimerNombreAsegurado.getValue().equals(datos.get("pNombre")));
            MatcherAssert.assertThat("primer apellido no valido", datoPrimerApellidoAsegurado.getValue().equals(datos.get("pApellido")));
            clickearElemento(botonSiguiente);
        } else if ("vehiculo".equals(datos.get("rol"))) {
            botonCotizaeV.waitUntilPresent();
            MatcherAssert.assertThat("modelo no valido", datoModelo.getValue().equals(datos.get("modelo")));
            MatcherAssert.assertThat("codFasecolda no valido", datoCodFasecolda.getValue().equals(datos.get("codFasecolda")));
            MatcherAssert.assertThat("clase Vehiculo no valido", datoClaseVehiculo.getText().equals(datos.get("claseVehiculo")));
            MatcherAssert.assertThat("marca no valida", datoMarca.getText().equals(datos.get("marca")));
            MatcherAssert.assertThat("linea no valida", datoLinea.getText().equals(datos.get("linea")));
            MatcherAssert.assertThat("zona no valida", datoZona.getText().equals(datos.get("zona")));
            MatcherAssert.assertThat("tipo Servicio no valido", datoTipoServicio.getValue().equals(datos.get("tipoServicio")));
            MatcherAssert.assertThat("motor no valido", datoMotor.getValue().equals(datos.get("motor")));
            MatcherAssert.assertThat("chasis no valido", datoChasis.getValue().equals(datos.get("chasis")));
            btnPoliza.click();
        }
    }

    public void retirarTransaccion() {
        clickearElemento(btnOpcionDeCierre);
        clickearElemento(btnRetiraTransaccion);
        clickearElemento(btnAceptarRetiraTransaccion);
    }
}
