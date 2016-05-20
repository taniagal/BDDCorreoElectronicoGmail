package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;


public class CuentaPage extends Guidewire{
    private final Guidewire gw = new Guidewire(getDriver());

    public CuentaPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath=".//*[@id='TabBar:AccountTab-btnWrap']")
    private WebElementFacade mnuCuenta;

    @FindBy(xpath = ".//*[@id='TabBar:AccountTab:AccountTab_NewAccount-textEl']")
    private WebElementFacade mnuNuevaCuenta;

    @FindBy(xpath = ".//*[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalContactNameInputSet:Name-inputEl']")
    private WebElementFacade txtNombreCompania;

    @FindBy(xpath = ".//*[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = ".//*[@id='NewAccount:NewAccountScreen:NewAccountButton']")
    private WebElementFacade btnCrearCuentaNueva;

    @FindBy(xpath = ".//*[@id='NewAccount:NewAccountScreen:NewAccountButton:NewAccount_Person-textEl']")
    private WebElementFacade btnNuevaCuentaPersonal;

    @FindBy(xpath = ".//*[@id='NewAccount:NewAccountScreen:NewAccountButton:NewAccount_Company-textEl']")
    private WebElementFacade btnNuevaCuentaCompania;

    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    private WebElementFacade txtNombreNuevaCuentaPersonal;

    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:GlobalContactNameInputSet:Name-inputEl']")
    private WebElementFacade txtNombreNuevaPersonaJuridica;

    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:GlobalPersonNameInputSet:LastName-inputEl']")
    private WebElementFacade txtApellidoNuevaCuentaPersonal;

    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    private WebElementFacade txtDireccionNuevaCuentaPersonal;

    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl']")
    private WebElementFacade txtCodigoPostalNuevaCuentaPersonal;

    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressType-inputEl']")
    private WebElementFacade cboTipoDireccionNuevaCuentaPersonal;

    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:OfficialIDInputSet:OfficialIDDV_Input-inputEl']")
    private WebElementFacade txtDocumentoNuevaCuenta;

    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:ProducerSelectionInputSet:Producer:SelectOrganization']")
    private WebElementFacade btnAgregarOrganizacion;

    @FindBy(xpath = ".//*[@id='OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:GlobalContactNameInputSet:Name-inputEl']")
    private WebElementFacade txtNombreDeOrganizacion;

    @FindBy(xpath = ".//*[@id='OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade btnBuscarOrganizacion;

    @FindBy(xpath = ".//*[@id='OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchResultsLV:0:_Select']")
    private WebElementFacade btnSeleccionarOrganizacion;

    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:Update-btnInnerEl']")
    private WebElementFacade btnActualizar;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:Name-inputEl']")
    private WebElementFacade lblNombreDeCuenta;

    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:OfficialIDInputSet:DocumentType-inputEl']")
    private WebElementFacade cboTipoDocumentoNuevaCuenta;

    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:BasicPersonInfo:CreateNewContactInputSet:DateOfBirth-inputEl']")
    private WebElementFacade txtFechaNacimiento;

    @FindBy(id = "CreateAccount:CreateAccountScreen:_msgs")
    private WebElementFacade divMensaje;

    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:ProducerSelectionInputSet:ProducerCode-inputEl']")
    private WebElementFacade cboCodigoAgente;

    public void navNuevaCuenta(){
        Actions act = gw.deployMenu(mnuCuenta);
        act.moveToElement(mnuNuevaCuenta).click().build().perform();
    }


    public void crearCuentaNuevaPersona(String tipoDocumento, String documento, String fechaNacimiento,
                                        String primerNombre, String primerApellido, String tipoDireccion,
                                        String direccion, String codigoPostal, String nombreOrganizacion, String agente){
        btnCrearCuentaNueva.click();
        btnNuevaCuentaPersonal.click();
        espera(btnAgregarOrganizacion,5);
        btnAgregarOrganizacion.click();
        txtNombreDeOrganizacion.sendKeys(nombreOrganizacion);
        btnBuscarOrganizacion.click();
        btnSeleccionarOrganizacion.click();
        waitABit(1000);
        selectItem(cboCodigoAgente,agente);
        espera(cboTipoDocumentoNuevaCuenta,15);
        cboTipoDocumentoNuevaCuenta.clear();
        cboTipoDocumentoNuevaCuenta.sendKeys(tipoDocumento);
        cboTipoDocumentoNuevaCuenta.sendKeys(Keys.ENTER);
        txtDocumentoNuevaCuenta.sendKeys(documento);
        txtFechaNacimiento.sendKeys(fechaNacimiento);
        txtNombreNuevaCuentaPersonal.sendKeys(primerNombre);
        txtApellidoNuevaCuentaPersonal.sendKeys(primerApellido);
        txtDireccionNuevaCuentaPersonal.sendKeys(direccion);
        selectItem(cboTipoDireccionNuevaCuentaPersonal, tipoDireccion);
        txtCodigoPostalNuevaCuentaPersonal.sendKeys(codigoPostal);
        btnActualizar.click();
        waitABit(1000);
    }

    public void crearCuentaNuevaPersonaJuridica(String tipoDocumento, String documento, String nombreEmpresa,
                                                String tipoDireccion, String direccion, String codigoPostal, String nombreOrganizacion, String agente) {
        btnCrearCuentaNueva.click();
        btnNuevaCuentaCompania.click();
        espera(btnAgregarOrganizacion,5);
        btnAgregarOrganizacion.click();
        txtNombreDeOrganizacion.sendKeys(nombreOrganizacion);
        btnBuscarOrganizacion.click();
        btnSeleccionarOrganizacion.click();
        waitABit(1000);
        selectItem(cboCodigoAgente,agente);
        espera(cboTipoDocumentoNuevaCuenta,15);
        cboTipoDocumentoNuevaCuenta.clear();
        cboTipoDocumentoNuevaCuenta.sendKeys(tipoDocumento);
        cboTipoDocumentoNuevaCuenta.sendKeys(Keys.ENTER);
        txtDocumentoNuevaCuenta.sendKeys(documento);
        txtDireccionNuevaCuentaPersonal.sendKeys(direccion);
        txtNombreNuevaPersonaJuridica.clear();
        txtNombreNuevaPersonaJuridica.sendKeys(nombreEmpresa);
        selectItem(cboTipoDireccionNuevaCuentaPersonal, tipoDireccion);
        txtCodigoPostalNuevaCuentaPersonal.sendKeys(codigoPostal);
        btnActualizar.click();
        waitABit(1000);
    }

    @SuppressWarnings("SameParameterValue")
    public void buscarPersona(String nombre){
        waitABit(1000);
        txtNombreCompania.sendKeys(nombre);
        btnBuscar.click();

    }

    public void assertCrearCuenta(String nombreCuenta){
        waitABit(1000);
        assertThat("Falló la creación de la cuenta", lblNombreDeCuenta.containsText(nombreCuenta));
    }

    public void assertPolicyCenterLogin(){
        assertThat("Falló verificar el logueo", mnuCuenta.isPresent());
    }

    public  void  assertVerificarMenor(String mensaje){
        waitABit(1000);
        assertThat("Falló verificar la edad", divMensaje.containsText(mensaje));
    }

    public  void  assertVerificarMensaje(String mensaje){
        waitABit(1000);
        assertThat("Falló el mensaje de documento registrado", divMensaje.containsText(mensaje));
    }

}
