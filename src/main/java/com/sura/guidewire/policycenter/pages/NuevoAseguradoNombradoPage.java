package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.util.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.LoggerFactory;

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
    @FindBy(xpath = ".//a[contains(.,'Actualizar')]")
    private WebElementFacade btnActualizar;

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
            btnActualizar.click();
            esAsociado = Boolean.TRUE;
        } catch (Exception e) {
            LOGGER.error("This is error : " + e);
            esAsociado =  Boolean.FALSE;
        }
        return esAsociado;
    }
}
