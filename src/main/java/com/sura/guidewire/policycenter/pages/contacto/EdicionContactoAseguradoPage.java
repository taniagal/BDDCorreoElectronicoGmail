package com.sura.guidewire.policycenter.pages.contacto;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class EdicionContactoAseguradoPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:OfficialIDInputSet:DocumentType-inputEl']")
    WebElementFacade campoTipoDocumentoEdicion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:OfficialIDInputSet:OfficialIDDV_Input-inputEl']")
    WebElementFacade campoNumeroDocumentoEdicion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    WebElementFacade campoPrimerNombreEdicion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:LastName-inputEl']")
    WebElementFacade campoPrimerApellidoEdicion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']")
    WebElementFacade campoPaisEdicion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    WebElementFacade campoDepartamentoEdicion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Sura_City-inputEl']")
    WebElementFacade campoCiudadEdicion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    WebElementFacade campoDireccionEdicion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:AddressType-inputEl']")
    WebElementFacade campoTipoDireccionEdicion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalContactNameInputSet:Name-inputEl']")
    WebElementFacade campoRazonSocialEdicion;


    public EdicionContactoAseguradoPage(WebDriver driver) {
        super(driver);
    }

    public void editarDatosComunesDeContacto(Map<String, String> datosContacto) {
        campoTipoDocumentoEdicion.withTimeoutOf(TIEMPO_5, TimeUnit.SECONDS).waitUntilClickable().clear();
        campoTipoDocumentoEdicion.sendKeys(datosContacto.get("tipoId"));
        campoTipoDocumentoEdicion.sendKeys(Keys.ENTER);
        campoNumeroDocumentoEdicion.clear();
        campoNumeroDocumentoEdicion.sendKeys(datosContacto.get("numeroId"));
        campoPaisEdicion.clear();
        campoPaisEdicion.sendKeys(datosContacto.get("pais"));
        campoPaisEdicion.sendKeys(Keys.ENTER);
        esperarHasta(TIEMPO_3000);
        campoDepartamentoEdicion.withTimeoutOf(TIEMPO_5, TimeUnit.SECONDS).waitUntilClickable().clear();
        campoDepartamentoEdicion.sendKeys(datosContacto.get("departamento"));
        campoDepartamentoEdicion.sendKeys(Keys.ENTER);
        esperarHasta(TIEMPO_3000);
        campoCiudadEdicion.withTimeoutOf(TIEMPO_5, TimeUnit.SECONDS).waitUntilClickable().clear();
        campoCiudadEdicion.sendKeys(datosContacto.get("ciudad"));
        campoCiudadEdicion.sendKeys(Keys.ENTER);
        esperarHasta(TIEMPO_1000);
        campoDireccionEdicion.withTimeoutOf(TIEMPO_5, TimeUnit.SECONDS).waitUntilClickable().clear();
        campoDireccionEdicion.sendKeys(datosContacto.get("direccion"));
        esperarHasta(TIEMPO_1000);
        campoTipoDireccionEdicion.clear();
        campoTipoDireccionEdicion.sendKeys(datosContacto.get("tipoDireccion"));
        campoTipoDireccionEdicion.sendKeys(Keys.ENTER);
    }

    public void editarDatosNuevaPersonaNatural(ExamplesTable edicionPersonaNatural) {
        Map<String, String> datosNuevaPersona = edicionPersonaNatural.getRows().get(0);
        campoTipoDocumentoEdicion.shouldBeEnabled();
        campoNumeroDocumentoEdicion.shouldBeEnabled();
        campoPaisEdicion.shouldBeEnabled();
        campoDepartamentoEdicion.shouldBeEnabled();
        campoCiudadEdicion.shouldBeEnabled();
        campoDireccionEdicion.shouldBeEnabled();
        campoTipoDireccionEdicion.shouldBeEnabled();
        campoPrimerNombreEdicion.clear();
        campoPrimerNombreEdicion.sendKeys(datosNuevaPersona.get("primerNombre"));
        campoPrimerApellidoEdicion.clear();
        campoPrimerApellidoEdicion.sendKeys(datosNuevaPersona.get("primerApellido"));
    }

    public void editarDatosNuevaPersonaJuridica(ExamplesTable edicionPersonaJuridica) {
        Map<String, String> datosNuevaEmpresa = edicionPersonaJuridica.getRows().get(0);
        campoTipoDocumentoEdicion.shouldBeEnabled();
        campoRazonSocialEdicion.clear();
        campoRazonSocialEdicion.sendKeys(datosNuevaEmpresa.get("razonSocial"));

    }
}
