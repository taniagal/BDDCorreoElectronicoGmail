package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * Created by criscaor on 2016/04/25.
 */
public class CuentaPage extends Guidewire{
    Guidewire gw = new Guidewire(getDriver());

    public CuentaPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath=".//*[@id='TabBar:AccountTab-btnWrap']")
    WebElementFacade mnuCuenta;

    @FindBy(xpath = ".//*[@id='TabBar:AccountTab:AccountTab_NewAccount-textEl']")
    WebElementFacade mnuNuevaCuenta;

    @FindBy(xpath = ".//*[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalContactNameInputSet:Name-inputEl']")
    WebElementFacade txtNombreCompania;

    @FindBy(xpath = ".//*[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade btnBuscar;

    @FindBy(xpath = ".//*[@id='NewAccount:NewAccountScreen:NewAccountButton']")
    WebElementFacade btnCrearCuentaNueva;

    @FindBy(xpath = ".//*[@id='NewAccount:NewAccountScreen:NewAccountButton:NewAccount_Person-textEl']")
    WebElementFacade btnNuevaCuentaPersonal;

    @FindBy(xpath = ".//*[@id='NewAccount:NewAccountScreen:NewAccountButton:NewAccount_Company-textEl']")
    WebElementFacade btnNuevaCuentaCompania;

    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    WebElementFacade txtNombreNuevaCuentaPersonal;

    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:GlobalContactNameInputSet:Name-inputEl']")
    WebElementFacade txtNombreNuevaPersonaJuridica;

    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:GlobalPersonNameInputSet:LastName-inputEl']")
    WebElementFacade txtApellidoNuevaCuentaPersonal;

    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    WebElementFacade txtDireccionNuevaCuentaPersonal;

    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl']")
    WebElementFacade txtCiudadNuevaCuentaPersonal;

    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    WebElementFacade cboEstadoNuevaCuentaPersonal;

    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl']")
    WebElementFacade txtCodigoPostalNuevaCuentaPersonal;

    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressType-inputEl']")
    WebElementFacade cboTipoDireccionNuevaCuentaPersonal;

    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:OfficialIDInputSet:OfficialIDDV_Input-inputEl']")
    WebElementFacade txtDocumentoNuevaCuentaPersonal;

    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:ProducerSelectionInputSet:Producer:SelectOrganization']")
    WebElementFacade btnAgregarOrganizacion;

    @FindBy(xpath = ".//*[@id='OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:GlobalContactNameInputSet:Name-inputEl']")
    WebElementFacade txtNombreDeOrganizacion;

    @FindBy(xpath = ".//*[@id='OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade btnBuscarOrganizacion;

    @FindBy(xpath = ".//*[@id='OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchResultsLV:0:_Select']")
    WebElementFacade btnSeleccionarOrganizacion;

    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:Update-btnInnerEl']")
    WebElementFacade btnActualizar;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:ttlBar']")
    WebElementFacade lblResumenCuenta;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:Name-inputEl']")
    WebElementFacade lblNombreDeCuenta;


    public void navNuevaCuenta(){
        Actions act = gw.deployMenu(mnuCuenta);
        mnuNuevaCuenta.waitUntilPresent();
        mnuNuevaCuenta.waitUntilClickable();
        act.moveToElement(mnuNuevaCuenta).click().build().perform();
    }

    public void buscarPersona(String nombre){
        txtNombreCompania.sendKeys(nombre);
        btnBuscar.click();
        dormilon();
    }

    public void crearCuentaNuevaPersona(String tipoDocumento, String documento, String primerNombre,
                                        String primerApellido, String tipoDireccion, String direccion,
                                        String ciudad, String estado, String codigoPostal,
                                        String nombreOrganizacion){
        btnCrearCuentaNueva.click();
        btnNuevaCuentaPersonal.click();
        btnAgregarOrganizacion.click();
        txtNombreDeOrganizacion.sendKeys(nombreOrganizacion);
        btnBuscarOrganizacion.click();
        btnSeleccionarOrganizacion.click();
        txtNombreNuevaCuentaPersonal.sendKeys(primerNombre);
        txtApellidoNuevaCuentaPersonal.sendKeys(primerApellido);
        txtDireccionNuevaCuentaPersonal.sendKeys(direccion);
        txtCiudadNuevaCuentaPersonal.sendKeys(ciudad);
        dormilon();
        cboEstadoNuevaCuentaPersonal.click();
        dormilon();
        cboEstadoNuevaCuentaPersonal.sendKeys(estado);
        cboTipoDireccionNuevaCuentaPersonal.click();
        dormilon();
        cboTipoDireccionNuevaCuentaPersonal.sendKeys(tipoDireccion);
        cboTipoDireccionNuevaCuentaPersonal.sendKeys(Keys.ENTER);
        txtCodigoPostalNuevaCuentaPersonal.sendKeys(codigoPostal);
        btnActualizar.click();
    }

    public void assertCrearCuenta(String resumenCuenta, String nombreCuenta){
        System.out.println(lblResumenCuenta.containsText(resumenCuenta)+" <---------> "+  lblNombreDeCuenta.containsText(nombreCuenta));
        lblResumenCuenta.containsText(resumenCuenta);
        lblNombreDeCuenta.containsText(nombreCuenta);

    }


    private void dormilon() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void crearCuentaNuevaPersonaJuridica(String tipoDocumento, String documento, String nombreEmpresa,
                                                String tipoDireccion, String direccion, String ciudad, String estado,
                                                String codigoPostal, String nombreOrganizacion) {
        btnCrearCuentaNueva.click();
        btnNuevaCuentaCompania.waitUntilPresent();
        btnNuevaCuentaCompania.click();
        btnAgregarOrganizacion.waitUntilPresent();
        btnAgregarOrganizacion.click();
        txtNombreDeOrganizacion.waitUntilPresent();
        txtNombreDeOrganizacion.sendKeys(nombreOrganizacion);
        btnBuscarOrganizacion.click();
        btnSeleccionarOrganizacion.waitUntilPresent();
        btnSeleccionarOrganizacion.click();
        txtDireccionNuevaCuentaPersonal.sendKeys(direccion);
        txtCiudadNuevaCuentaPersonal.sendKeys(ciudad);
        txtNombreNuevaPersonaJuridica.waitUntilPresent();
        txtNombreNuevaPersonaJuridica.clear();
        txtNombreNuevaPersonaJuridica.sendKeys(nombreEmpresa);
        dormilon();
        //cboEstadoNuevaCuentaPersonal.waitUntilPresent();
        cboEstadoNuevaCuentaPersonal.click();
        dormilon();
        //cboEstadoNuevaCuentaPersonal.waitUntilPresent();
        cboEstadoNuevaCuentaPersonal.sendKeys(estado);
        cboTipoDireccionNuevaCuentaPersonal.click();
        dormilon();
        //cboTipoDireccionNuevaCuentaPersonal.waitUntilPresent();
        cboTipoDireccionNuevaCuentaPersonal.sendKeys(tipoDireccion);
        cboTipoDireccionNuevaCuentaPersonal.sendKeys(Keys.ENTER);
        txtCodigoPostalNuevaCuentaPersonal.sendKeys(codigoPostal);
        btnActualizar.click();
    }
}
