package com.sura.guidewire.policycenter.pages.contacto;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class EdicionContactoAseguradoPage extends PageUtil{

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:OfficialIDInputSet:DocumentType-inputEl']")
    WebElementFacade campoTipoDocumento;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:OfficialIDInputSet:OfficialIDDV_Input-inputEl']")
    WebElementFacade campoNumeroDocumento;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    WebElementFacade campoPrimerNombre;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:LastName-inputEl']")
    WebElementFacade campoPrimerApellido;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']")
    WebElementFacade campoPais;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    WebElementFacade campoDepartamento;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Sura_City-inputEl']")
    WebElementFacade campoCiudad;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    WebElementFacade campoDireccion;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:AddressType-inputEl']")
    WebElementFacade campoTipoDireccion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalContactNameInputSet:Name-inputEl']")
    WebElementFacade campoRazonSocial;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:ContactCurrency:ContactCurrencyInputSet:PreferredSettlementCurrency-inputEl']")
    WebElementFacade campoMonedaPreferida;

    public EdicionContactoAseguradoPage(WebDriver driver){
        super(driver);
    }

    public void editarDatosComunesDeContacto(Map<String, String> datosContacto){
        campoTipoDocumento.withTimeoutOf(WAIT_TIME_5, TimeUnit.SECONDS).waitUntilClickable().clear();
        campoTipoDocumento.sendKeys(datosContacto.get("tipoId"));
        campoTipoDocumento.sendKeys(Keys.ENTER);
        campoNumeroDocumento.clear();
        campoNumeroDocumento.sendKeys(datosContacto.get("numeroId"));
        campoPais.clear();
        campoPais.sendKeys(datosContacto.get("pais"));
        campoPais.sendKeys(Keys.ENTER);
        waitUntil(WAIT_TIME_3000);
        campoDepartamento.withTimeoutOf(WAIT_TIME_5, TimeUnit.SECONDS).waitUntilClickable().clear();
        campoDepartamento.sendKeys(datosContacto.get("departamento"));
        campoDepartamento.sendKeys(Keys.ENTER);
        waitUntil(WAIT_TIME_3000);
        campoCiudad.withTimeoutOf(WAIT_TIME_5, TimeUnit.SECONDS).waitUntilClickable().clear();
        campoCiudad.sendKeys(datosContacto.get("ciudad"));
        campoCiudad.sendKeys(Keys.ENTER);
        waitUntil(WAIT_TIME_1000);
        campoDireccion.withTimeoutOf(WAIT_TIME_5, TimeUnit.SECONDS).waitUntilClickable().clear();
        campoDireccion.sendKeys(datosContacto.get("direccion"));
        waitUntil(WAIT_TIME_1000);
        campoTipoDireccion.clear();
        campoTipoDireccion.sendKeys(datosContacto.get("tipoDireccion"));
        campoTipoDireccion.sendKeys(Keys.ENTER);
    }

    public void editarDatosNuevaPersonaNatural(ExamplesTable edicionPersonaNatural) {
        Map<String, String> datosNuevaPersona = edicionPersonaNatural.getRows().get(0);
        campoTipoDocumento.shouldBeEnabled();
        campoNumeroDocumento.shouldBeEnabled();
        campoPais.shouldBeEnabled();
        campoDepartamento.shouldBeEnabled();
        campoCiudad.shouldBeEnabled();
        campoDireccion.shouldBeEnabled();
        campoTipoDireccion.shouldBeEnabled();
        campoPrimerNombre.clear();
        campoPrimerNombre.sendKeys(datosNuevaPersona.get("primerNombre"));
        campoPrimerApellido.clear();
        campoPrimerApellido.sendKeys(datosNuevaPersona.get("primerApellido"));
    }

    public void editarDatosNuevaPersonaJuridica(ExamplesTable edicionPersonaJuridica) {
        Map<String, String> datosNuevaEmpresa = edicionPersonaJuridica.getRows().get(0);
        campoTipoDocumento.shouldBeEnabled();
        campoRazonSocial.clear();
        campoRazonSocial.sendKeys(datosNuevaEmpresa.get("razonSocial"));
        campoMonedaPreferida.clear();
        campoMonedaPreferida.sendKeys(datosNuevaEmpresa.get("monedaPreferida"));
        campoMonedaPreferida.sendKeys(Keys.ENTER);
    }
}
