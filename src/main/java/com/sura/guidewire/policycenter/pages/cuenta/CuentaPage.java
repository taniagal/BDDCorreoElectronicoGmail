package com.sura.guidewire.policycenter.pages.cuenta;

import com.sura.guidewire.policycenter.resources.PageUtil;
import com.sura.guidewire.policycenter.utils.Utils;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class CuentaPage extends PageUtil {
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
    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:Update-btnInnerEl']")
    private WebElementFacade botonActualizarCoincidente;
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
    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Sura_City-inputEl']")
    private WebElementFacade comboBoxCiudad;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:EditAccount-btnInnerEl']")
    private WebElementFacade botonEditarCuenta;
    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:GlobalContactNameInputSet:CommercialName-inputEl']")
    private WebElementFacade campoTxtNombreComercial;
    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:Phone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl']")
    private WebElementFacade campoTxtTelefonoOficina;
    @FindBy(xpath = ".//*[@id='DuplicateContactsPopup:DuplicateContactsScreen:ResultsLV:0:Select']")
    private WebElementFacade linkElegir;
    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:BasicPersonInfo:CreateNewContactInputSet:EmailAddress1-inputEl']")
    private WebElementFacade txtCorreoElectronico;
    @FindBy(xpath = ".//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:CellPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl']")
    private WebElementFacade txtNumeroCelular;

    private final String CORREOELECTRONICO = "sura@sura.com.co";
    private final String NUMEROCELULAR = "3113794264";

    public CuentaPage(WebDriver driver) {
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

    public void agregarDireccion(ExamplesTable datos) {
        Map<String, String> dato = datos.getRow(0);
        campoTxtDireccionNuevaCuentaPersonal.sendKeys(dato.get("direccion"));
        seleccionarItem(comboBoxDepartamento, dato.get("departamento"));
        esperarPorValor(comboBoxDepartamento, dato.get("departamento"));
        seleccionarItem(comboBoxCiudad, dato.get("ciudad"));
        esperarPorValor(comboBoxCiudad, dato.get("ciudad"));
        seleccionarItem(comboBoxTipoDireccionNuevaCuentaPersonal, dato.get("tipo_direccion"));
        esperarPorValor(comboBoxTipoDireccionNuevaCuentaPersonal, dato.get("tipo_direccion"));
        agregarTelefonoCelularYCorreo();
    }

    public void agregarTelefonoCelularYCorreo() {
        txtCorreoElectronico.click();
        txtCorreoElectronico.sendKeys(CORREOELECTRONICO);
        txtNumeroCelular.waitUntilClickable();
        txtNumeroCelular.click();
        txtNumeroCelular.sendKeys(NUMEROCELULAR);
    }


    public void agregarOrganizacion(String nombreOrganizacion, String agente) {
        waitFor(botonAgregarOrganizacion).click();
        esperarHasta(TIEMPO_500);
        campoTxtNombreDeOrganizacion.sendKeys(nombreOrganizacion);
        botonBuscarOrganizacion.click();
        botonSeleccionarOrganizacion.click();
        esperarHasta(TIEMPO_500);
        comboBoxCodigoAgente.waitUntilPresent();
        seleccionarItem(comboBoxCodigoAgente, agente);
    }

    public void agregarNombrecomercial(String nombreComercial) {
        campoTxtNombreComercial.sendKeys(nombreComercial);
    }


    public void agregarTelefonoOficina(String telefonoOficina) {
        campoTxtTelefonoOficina.sendKeys(telefonoOficina);
    }


    public void actualizar() {
        botonActualizar.click();
        esperarHasta(TIEMPO_1000);
        setImplicitTimeout(TIEMPO_1, TimeUnit.SECONDS);
        if (linkElegir.isPresent()) {
            linkElegir.click();
            withTimeoutOf(TIEMPO_10, TimeUnit.SECONDS).waitFor(botonActualizarCoincidente);
            if ("".equals(campoTxtDocumentoNuevaCuenta.getValue())) {
                campoTxtDocumentoNuevaCuenta.sendKeys(Utils.cedulaRandom());
            }
            clickearElemento(botonActualizarCoincidente);
        }
        resetImplicitTimeout();
    }

    public void buscarPersona(String nombre, String persona) {
        waitFor(campoTxtNombreCompania).shouldBePresent();
        campoTxtNombreCompania.sendKeys(nombre);
        botonBuscar.click();
        if ("Compania".equals(persona)) {
            botonCrearCuentaNueva.click();
            botonNuevaCuentaCompania.click();
        } else {
            botonCrearCuentaNueva.click();
            botonNuevaCuentaPersonal.click();
        }
        esperarHasta(TIEMPO_1000);
    }

    public void verificarMensaje(String mensaje) {
        verificarMensaje(divMensaje, mensaje);
    }

    public void verificarCuentaNumero(String nombreCuenta) {
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(botonEditarCuenta).shouldBePresent();
        MatcherAssert.assertThat("Falló la creación de la cuenta", labelCuentaNumero.containsText(nombreCuenta));
    }

    public void verificarEstadoDeMensaje(String mensaje) {
        withTimeoutOf(TIEMPO_10, TimeUnit.SECONDS).waitFor(divMensaje).shouldContainText(mensaje);
        MatcherAssert.assertThat("El mensaje erroneo sigue apareciendo", !divMensaje.containsText(mensaje));
    }
}
