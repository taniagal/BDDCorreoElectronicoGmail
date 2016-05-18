package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Created by jorgsape on 2016/05/13.
 */
public class NuevoAseguradoNombradoPage extends Guidewire {

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
    @FindBy(xpath = "//input[@name='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City_Ext']")
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


    @FindBy(xpath = ".//*[@id='NewAccountContactPopup:ContactDetailScreen:Update-btnInnerEl']")
    private WebElementFacade btnActualizar;

    ContactosAsociadosACuentasPage contactosAsociadosACuentasPage = new ContactosAsociadosACuentasPage(getDriver());

    public NuevoAseguradoNombradoPage(WebDriver driver) {
        super(driver);
    }

    public Boolean asociarNuevoAseguradoNombradoACuenta() {

        Boolean esAsociado;
        try {

            txtNumeroDocumento.type("123456789");
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
            cboTipoDireccion.type("Otros");
            cboTipoDocumento.type("CEDULA DE CIUDADANIA");
            cboDepartamento.type("Antioquia");
            txtApellido.setWindowFocus();

//            waitABit(1000);
//            WebElementFacade cbxDeptoList = findBy(".//input[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']");
//            waitABit(1000);
//            cbxDeptoList.click();
//            waitABit(1000);
//            WebElementFacade cbxDepto = findBy(".//li[contains(.,'Antioquia')]");
//            cbxDepto.click();
//            waitABit(1000);
            waitABit(3000);
            cboCiudad.clear();
            waitABit(3000);
            cboCiudad.type("Medellin");
            waitABit(3000);

//            waitABit(1000);
//            cboCiudad.click();
//            waitABit(1000);
//            WebElementFacade cbxTipoDoc = findBy(".//li[contains(.,'Medellin')]");
//            cbxTipoDoc.click();
//            waitABit(1000);


            txtDireccion.click();
            txtDireccion.type("CL 45 - 56 A 109");
            txtApellido.setWindowFocus();
            waitABit(3000);

            btnActualizar.waitUntilClickable();
            btnActualizar.click();


            esAsociado = Boolean.TRUE;
        } catch (Exception e) {
            e.printStackTrace();
            esAsociado =  Boolean.FALSE;
        }

        return esAsociado;
    }
}
