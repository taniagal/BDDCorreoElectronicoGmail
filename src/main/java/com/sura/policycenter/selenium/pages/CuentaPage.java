package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;

public class CuentaPage extends Guidewire{

    Actions actions = null;
    @FindBy(xpath=".//*[@id='TabBar:AccountTab-btnWrap']")
    private WebElementFacade menuCuenta;
    @FindBy(xpath = ".//*[@id='TabBar:AccountTab:AccountTab_NewAccount-textEl']")
    private WebElementFacade menuNuevaCuenta;
    @FindBy(xpath = ".//*[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalContactNameInputSet:Name-inputEl']")
    private WebElementFacade campoTxtNombreCompania;
    @FindBy(xpath = ".//*[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade botonBuscar;
    @FindBy(xpath = ".//*[@id='NewAccount:NewAccountScreen:NewAccountButton']")
    private WebElementFacade botonCrearCuentaNueva;
    @FindBy(xpath = ".//*[@id='NewAccount:NewAccountScreen:NewAccountButton:NewAccount_Person-textEl']")
    private WebElementFacade botonNuevaCuentaPersonal;
    @FindBy(xpath = ".//*[@id='NewAccount:NewAccountScreen:NewAccountButton:NewAccount_Company-textEl']")
    private WebElementFacade botonNuevaCuentaCompania;
    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    private WebElementFacade campoTxtNombreNuevaCuentaPersonal;
    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:GlobalContactNameInputSet:Name-inputEl']")
    private WebElementFacade campoTxtNombreNuevaPersonaJuridica;
    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:GlobalPersonNameInputSet:LastName-inputEl']")
    private WebElementFacade campoTxtApellidoNuevaCuentaPersonal;
    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    private WebElementFacade campoTxtDireccionNuevaCuentaPersonal;
    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressType-inputEl']")
    private WebElementFacade comboBoxTipoDireccionNuevaCuentaPersonal;
    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:OfficialIDInputSet:OfficialIDDV_Input-inputEl']")
    private WebElementFacade campoTxtDocumentoNuevaCuenta;
    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:ProducerSelectionInputSet:Producer:SelectOrganization']")
    private WebElementFacade botonAgregarOrganizacion;
    @FindBy(xpath = ".//*[@id='OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:GlobalContactNameInputSet:Name-inputEl']")
    private WebElementFacade campoTxtNombreDeOrganizacion;
    @FindBy(xpath = ".//*[@id='OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade botonBuscarOrganizacion;
    @FindBy(xpath = ".//*[@id='OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchResultsLV:0:_Select']")
    private WebElementFacade botonSeleccionarOrganizacion;
    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:ForceDupCheckUpdate-btnInnerEl']")
    private WebElementFacade botonActualizar;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    private WebElementFacade labelNombreDeCuenta;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileInfoBar:AccountName-btnInnerEl']")
    private WebElementFacade labelCuentaNumero;
    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:OfficialIDInputSet:DocumentType-inputEl']")
    private WebElementFacade comboBoxTipoDocumentoNuevaCuenta;
    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:BasicPersonInfo:CreateNewContactInputSet:DateOfBirth-inputEl']")
    private WebElementFacade campoTxtFechaNacimiento;
    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:_msgs']")
    private WebElementFacade divMensaje;
    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:ProducerSelectionInputSet:ProducerCode-inputEl']")
    private WebElementFacade comboBoxCodigoAgente;
    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    private WebElementFacade comboBoxDepartamento;
    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City_Ext-inputEl']")
    private WebElementFacade comboBoxCiudad;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:EditAccount-btnInnerEl']")
    private WebElementFacade botonEditarCuenta;

    public CuentaPage(WebDriver driver){
        super(driver);
    }

    public void agregarTipoDocumento(String tipoDocumento, String documento) {
        comboBoxTipoDocumentoNuevaCuenta.waitUntilPresent();
        comboBoxTipoDocumentoNuevaCuenta.clear();
        comboBoxTipoDocumentoNuevaCuenta.sendKeys(tipoDocumento);
        comboBoxTipoDocumentoNuevaCuenta.sendKeys(Keys.ENTER);
        campoTxtDocumentoNuevaCuenta.sendKeys(documento);
    }

    public void agregarNombres(String primerNombre, String primerApellido, String fechaNacimiento) {
        campoTxtFechaNacimiento.sendKeys(fechaNacimiento);
        campoTxtNombreNuevaCuentaPersonal.sendKeys(primerNombre);
        campoTxtApellidoNuevaCuentaPersonal.sendKeys(primerApellido);
    }

    public void agregarRazonsocial(String razonSocial) {
        campoTxtNombreNuevaPersonaJuridica.clear();
        campoTxtNombreNuevaPersonaJuridica.sendKeys(razonSocial);
    }

    public void agregarDireccion(String tipoDireccion, String direccion, String departamento, String ciudad) {
        campoTxtDireccionNuevaCuentaPersonal.sendKeys(direccion);
        selectItem(comboBoxDepartamento,departamento);
        waitUntil(3000);
        selectItem(comboBoxCiudad,ciudad);
        waitUntil(2000);
        selectItem(comboBoxTipoDireccionNuevaCuentaPersonal, tipoDireccion);
        waitUntil(1000);
    }

    public void agregarOrganizacion(String nombreOrganizacion, String agente) {
        espera(botonAgregarOrganizacion,5);
        botonAgregarOrganizacion.click();
        waitUntil(500);
        campoTxtNombreDeOrganizacion.sendKeys(nombreOrganizacion);
        botonBuscarOrganizacion.click();
        botonSeleccionarOrganizacion.click();
        waitUntil(500);
        selectItem(comboBoxCodigoAgente,agente);
    }

    public void actualizar(){
        botonActualizar.click();
        waitUntil(1000);
    }

    public void buscarPersona(String nombre, String persona){
        waitFor(campoTxtNombreCompania).shouldBePresent();
        campoTxtNombreCompania.sendKeys(nombre);
        botonBuscar.click();
        if("Compania".equals(persona)) {
            botonCrearCuentaNueva.click();
            botonNuevaCuentaCompania.click();
        }else {
            botonCrearCuentaNueva.click();
            botonNuevaCuentaPersonal.click();
        }
        waitUntil(1000);
    }

    public  void verificarMensaje(String mensaje){
        verificarMensaje(divMensaje,mensaje);
    }

    public void verificarCuentaNumero(String nombreCuenta) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(botonEditarCuenta).shouldBePresent();
        assertThat("Falló la creación de la cuenta",  labelCuentaNumero.containsText(nombreCuenta));
    }
}
