package com.sura.policycenter.selenium.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class IngresoNuevoContactoAseguradoPage extends PageObject{

    @FindBy(xpath = ".//*[@id='NewContactPopup:ContactPanelSet:ContactCV:ContactDV:OfficialIDInputSet:DocumentType-inputEl']")
    WebElementFacade campoTipoDocumento;

    @FindBy(xpath = ".//*[@id='NewContactPopup:ContactPanelSet:ContactCV:ContactDV:OfficialIDInputSet:OfficialIDDV_Input-inputEl']")
    WebElementFacade campoNumeroDocumento;

    @FindBy(xpath=".//*[@id='NewContactPopup:ContactPanelSet:ContactCV:ContactDV:ContactNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    WebElementFacade campoPrimerNombre;

    @FindBy(xpath=".//*[@id='NewContactPopup:ContactPanelSet:ContactCV:ContactDV:ContactNameInputSet:GlobalPersonNameInputSet:LastName-inputEl']")
    WebElementFacade campoPrimerApellido;

    @FindBy(xpath=".//*[@id='NewContactPopup:ContactPanelSet:ContactCV:ContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']")
    WebElementFacade campoPais;

    @FindBy(xpath=".//*[@id='NewContactPopup:ContactPanelSet:ContactCV:ContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    WebElementFacade campoDepartamento;

    @FindBy(xpath=".//*[@id='NewContactPopup:ContactPanelSet:ContactCV:ContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City_Ext-inputEl']")
    WebElementFacade campoCiudad;

    @FindBy(xpath=".//*[@id='NewContactPopup:ContactPanelSet:ContactCV:ContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    WebElementFacade campoDireccion;

    @FindBy(xpath=".//*[@id='NewContactPopup:ContactPanelSet:ContactCV:ContactDV:AddressType-inputEl']")
    WebElementFacade campoTipoDireccion;

    @FindBy(xpath = ".//*[@id='NewContactPopup:ContactPanelSet:ContactCV:ContactDV:ContactNameInputSet:GlobalContactNameInputSet:Name-inputEl']")
    WebElementFacade campoRazonSocial;

    @FindBy(xpath=".//*[@id='NewContactPopup:Update']")
    WebElementFacade botonAceptar;

    public IngresoNuevoContactoAseguradoPage(WebDriver driver){
        super(driver);
    }

    public void ingresarDatosComunesDeContacto(Map<String, String> datosContacto){
        waitFor(campoTipoDocumento).shouldBeVisible();
        campoTipoDocumento.clear();
        campoTipoDocumento.sendKeys(datosContacto.get("tipoId"));
        campoTipoDocumento.sendKeys(Keys.ENTER);
        campoNumeroDocumento.sendKeys(datosContacto.get("numeroId"));
        campoPais.clear();
        campoPais.sendKeys(datosContacto.get("pais"));
        campoPais.sendKeys(Keys.ENTER);
        waitABit(3000);
        campoDepartamento.clear();
        campoDepartamento.sendKeys(datosContacto.get("departamento"));
        campoDepartamento.sendKeys(Keys.ENTER);
        waitABit(3000);
        campoCiudad.withTimeoutOf(5, TimeUnit.SECONDS).waitUntilClickable().clear();
        campoCiudad.sendKeys(datosContacto.get("ciudad"));
        campoCiudad.sendKeys(Keys.ENTER);
        waitABit(2000);
        campoDireccion.withTimeoutOf(5, TimeUnit.SECONDS).waitUntilClickable().clear();
        campoDireccion.sendKeys(datosContacto.get("direccion"));
        waitABit(2000);
        campoTipoDireccion.clear();
        campoTipoDireccion.sendKeys(datosContacto.get("tipoDireccion"));
        campoTipoDireccion.sendKeys(Keys.ENTER);
    }

    public void ingresarDatosNuevaPersonaNatural(ExamplesTable datosPersonaNatural) {
        Map<String, String> datosNuevaPersona = datosPersonaNatural.getRows().get(0);
        this.ingresarDatosComunesDeContacto(datosNuevaPersona);
        campoPrimerNombre.sendKeys(datosNuevaPersona.get("primerNombre"));
        campoPrimerApellido.sendKeys(datosNuevaPersona.get("primerApellido"));
        waitABit(3000);
        botonAceptar.click();
    }

    public void ingresarDatosNuevaPersonaJuridica(ExamplesTable datosPersonaJuridica) {
        Map<String, String> datosNuevaEmpresa = datosPersonaJuridica.getRows().get(0);
        this.ingresarDatosComunesDeContacto(datosNuevaEmpresa);
        campoRazonSocial.sendKeys(datosNuevaEmpresa.get("razonSocial"));
        botonAceptar.click();
    }
}
