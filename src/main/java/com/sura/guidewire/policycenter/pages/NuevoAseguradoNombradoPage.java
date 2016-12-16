package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class NuevoAseguradoNombradoPage extends PageUtil {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(PageUtil.class);
    @FindBy(xpath = ".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:OfficialIDInputSet:DocumentType-inputEl']")
    private WebElementFacade cboTipoDocumento;
    @FindBy(xpath = ".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:OfficialIDInputSet:OfficialIDDV_Input-inputEl']")
    private WebElementFacade txtNumeroDocumento;
    @FindBy(xpath = ".//input[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    private WebElementFacade txtNombre;
    @FindBy(xpath = ".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:LastName-inputEl']")
    private WebElementFacade txtApellido;
    @FindBy(xpath = ".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    private WebElementFacade txtDireccion;
    @FindBy(xpath = ".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    private WebElementFacade cboDepartamento;
    @FindBy(xpath = "//input[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Sura_City-inputEl']")
    private WebElementFacade cboCiudad;
    @FindBy(xpath = ".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:WorkPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl']")
    private WebElementFacade txtTelefonoTrabajo;
    @FindBy(xpath = ".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressType-inputEl']")
    private WebElementFacade cboTipoDireccion;
    @FindBy(xpath = ".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AddressesCardTab-btnInnerEl']")
    private WebElementFacade tabDetalleDireccion;
    @FindBy(xpath = ".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDetailCardTab-btnInnerEl']")
    private WebElementFacade tabDetalleContacto;
    @FindBy(xpath = ".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AddressesPanelSet:AddressDetailDV:AddressType-inputEl']")
    private WebElementFacade cboDetalleTipoDireccion;
    @FindBy(xpath = ".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    private WebElementFacade cboDetalleDireccion;
    @FindBy(xpath = ".//*[@id='NewAccountContactPopup:ContactDetailScreen:ForceDupCheckUpdate']")
    private WebElementFacade btnActualizar;
    @FindBy(xpath = ".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton']")
    private WebElementFacade botonCrearcontacto;
    @FindBy(xpath = "//img[contains(@src,'images/app/drop_button.png')]")
    private WebElementFacade botonDireccionAsociada;
    @FindBy(xpath = ".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail:PrimaryAddress-textEl']")
    private WebElementFacade itemDireccionContactoAsociada;
    @FindBy(xpath = ".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton:0:roleType:0:contactType']")
    private WebElementFacade itemNuevaPersonaNatural;
    @FindBy(xpath = ".//*[@id='NewAccountContactPopup:ContactDetailScreen:Cancel']")
    private WebElementFacade botonCancelar;





    public NuevoAseguradoNombradoPage(WebDriver driver) {
        super(driver);
    }

    @SuppressWarnings("UnusedReturnValue")
    public Boolean asociarNuevoAseguradoNombradoACuenta() {
        Boolean esAsociado;
        try {
            txtNumeroDocumento.type("11".concat(cedulaRandom()));
            txtNombre.type("JOHAN");
            txtApellido.type("MUSTACHE");
            txtTelefonoTrabajo.type("435-3434");
            tabDetalleDireccion.waitUntilClickable();
            tabDetalleDireccion.click();
            cboDetalleTipoDireccion.type("Otros");
            cboDetalleDireccion.click();
            cboDetalleDireccion.type("CL 45 - 56 A 109");
            tabDetalleContacto.waitUntilClickable();
            tabDetalleContacto.click();
            cboTipoDireccion.type("DIRECCION DE RESIDENCIA");
            cboTipoDireccion.sendKeys(Keys.ENTER);
            cboTipoDocumento.type("CEDULA DE CIUDADANIA");
            cboTipoDocumento.sendKeys(Keys.ENTER);
            cboDepartamento.type("ANTIOQUIA");
            cboDepartamento.sendKeys(Keys.ENTER);
            waitUntil(WAIT_TIME_3000);
            waitUntil(WAIT_TIME_1500);
            cboCiudad.type("MEDELLIN");
            cboCiudad.sendKeys(Keys.ENTER);
            waitUntil(WAIT_TIME_3000);
            txtDireccion.clear();
            waitUntil(WAIT_TIME_1000);
            txtDireccion.type("CL 45 - 56 A 109");
            waitUntil(WAIT_TIME_2000);
            clickActualizar();
            esAsociado = Boolean.TRUE;
        } catch (Exception e) {
            LOGGER.error("This is error : " + e);
            esAsociado = Boolean.FALSE;
        }
        return esAsociado;
    }

    public void verificarDireccionContacto() {
        botonDireccionAsociada.click();
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        itemDireccionContactoAsociada.waitUntilPresent();
        MatcherAssert.assertThat("Error: Campo de direccion contacto asociado vacia", !itemDireccionContactoAsociada.getText().equals("*<vacío>"));
        clickCancelar();
        botonCrearcontacto.waitUntilPresent();
    }

    public void clickActualizar() {
        btnActualizar.click();
        try {
            withTimeoutOf(WAIT_TIME_7, TimeUnit.SECONDS).waitFor(botonCrearcontacto).waitUntilPresent();
        } catch (TimeoutException e) {
            LOGGER.info("TimeoutException " + e);
            btnActualizar.click();
        }
    }


    public void clickCancelar() {
        botonCancelar.click();
        try {
            withTimeoutOf(WAIT_TIME_7, TimeUnit.SECONDS).waitFor(botonCrearcontacto).waitUntilPresent();
        } catch (TimeoutException e) {
            LOGGER.info("TimeoutException " + e);
            botonCancelar.click();
        }
    }
}
