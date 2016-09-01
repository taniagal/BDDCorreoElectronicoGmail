package com.sura.policycenter.selenium.pages.menu.opciones.poliza;


import com.sura.commons.selenium.Commons;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import javax.swing.*;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class InicioRenovacionPolizaPaPage extends Commons {


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


    Commons commons = new Commons(getDriver());

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
        commons.ingresarDato(menuNumeropoliza, cotizacion);
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
    }

    public void clickBotonSiguinete() {
        btnSiguiente.click();
    }

    public void validaMensajeEnPantalla(String mensaje) {
        MatcherAssert.assertThat("El mensaje en pantalla no cumple con la info", lblMensajeEnPantalla.getText().equals(mensaje));
    }

    public void validacionesPantallaFormularios(ExamplesTable datosTomador) {

        Map<String, String> datos = datosTomador.getRow(0);
        if (datos.get("rol").equals("tomador")) {
           /* MatcherAssert.assertThat("cedula del tomador no valida", datoCedeulaTomador.getText().equals(datos.get("cedulaTomador")));
            MatcherAssert.assertThat("el nombre del tomador no es valido", datoNombre.getText().equals(datos.get("nombre")));
            MatcherAssert.assertThat("el nombre de oficina de radicacion", datoOficinaDeRadicacion.getText().equals(datos.get("oficinaRadicacion")));
            MatcherAssert.assertThat("el nombre de agente", datoAgente.getText().equals(datos.get("codAgente")));*/
            clickBotonSiguinete();
        }else
        if (datos.get("rol").equals("asegurado")) {
           /* MatcherAssert.assertThat("cedula del Asegurado no valida", datoCedulaAsegurado.getText().equals(datos.get("cedulaAsegurado")));
            MatcherAssert.assertThat("primer nombre no valido", datoPrimerNombreAsegurado.getText().equals(datos.get("pNombre")));
            MatcherAssert.assertThat("primer apellido no valido", datoPrimerApellidoAsegurado.getText().equals(datos.get("pApellido")));*/
            clickBotonSiguinete();
        }else
        if (datos.get("rol").equals("vehiculo")) {
            JOptionPane.showMessageDialog(null, "ok");
        }

    }
}
