package com.sura.policycenter.selenium.pages;

import com.sura.commons.selenium.Commons;
import com.sura.policycenter.constantes.EnumContacto;
import java.util.List;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class NuevoContactoPage extends Commons {

    @FindBy(xpath = ".//*[@id='NewContact:ContactPanelSet:ContactCV:ContactDV:OfficialIDInputSet:DocumentType-inputEl']")
    private WebElementFacade tipoDocumento;
    @FindBy(xpath = ".//*[@id='NewContact:ContactPanelSet:ContactCV:ContactDV:OfficialIDInputSet:OfficialIDDV_Input-inputEl']")
    private WebElementFacade numeroDocumento;
    @FindBy(xpath = ".//*[@id='NewContact:ContactPanelSet:ContactCV:ContactDV:ContactNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    private WebElementFacade primerNombre;
    @FindBy(xpath = ".//*[@id='NewContact:ContactPanelSet:ContactCV:ContactDV:ContactNameInputSet:GlobalPersonNameInputSet:LastName-inputEl']")
    private WebElementFacade primerApellido;
    @FindBy(xpath = ".//*[@id='NewContact:ContactPanelSet:ContactCV:ContactDV:AddressType-inputEl']")
    private WebElementFacade tipoDireccion;
    @FindBy(xpath = ".//*[@id='NewContact:ContactPanelSet:ContactCV:ContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    private WebElementFacade direccion;
    @FindBy(xpath = ".//*[@id='NewContact:ForceDupCheckUpdate-btnInnerEl']")
    private WebElementFacade botonActualizar;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    private WebElementFacade nombreContact;
    @FindBy(xpath = ".//*[@id='NewContact:ContactPanelSet:ContactCV:ContactDV:ContactNameInputSet:GlobalContactNameInputSet:Name-inputEl']")
    private WebElementFacade razonSocial;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Name-inputEl']")
    private WebElementFacade desRazonSocial;
    @FindBy(xpath = ".//*[@id='NewContact:_msgs']/div")
    private WebElementFacade contactoExistente;
    @FindBy(xpath = ".//*[@id='NewContact:ContactPanelSet:ContactCV:ContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:PrimaryPhone-inputEl']")
    private WebElementFacade tipoTelefono;
    @FindBy(xpath = ".//*[@id='NewContact:ContactPanelSet:ContactCV:ContactDV:ContactNameInputSet:WorkPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl']")
    private WebElementFacade telefonoTrabajo;
    @FindBy(xpath = ".//*[@id='NewContact:ContactPanelSet:ContactCV:ContactDV:ContactNameInputSet:HomePhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl']")
    private WebElementFacade telefonoResidencia;
    @FindBy(xpath = ".//*[@id='NewContact:ContactPanelSet:ContactCV:ContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    private WebElementFacade comboBoxDepartamento;
    @FindBy(xpath = ".//*[@id='NewContact:ContactPanelSet:ContactCV:ContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Sura_City-inputEl']")
    private WebElementFacade comboBoxCiudad;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    private WebElementFacade comboBoxDepartamento2;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Sura_City-inputEl']")
    private WebElementFacade comboBoxCiudad2;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressType-inputEl']")
    private WebElementFacade tipoDireccion2;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    private WebElementFacade direccion2;

    public NuevoContactoPage(WebDriver driver) {
        super(driver);
    }

    public void seleccionarTipoDocumento(String tipoDocumento) {
        this.tipoDocumento.waitUntilPresent();
        this.tipoDocumento.clear();
        this.tipoDocumento.sendKeys(tipoDocumento);
        this.tipoDocumento.sendKeys(Keys.ENTER);
    }

    public void ingresarNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento.type(numeroDocumento);
    }

    public void ingresarPrimerNombre(String primerNombre) {
        this.primerNombre.type(primerNombre);
    }

    public void ingresarPrimerApellido(String primerApellido) {
        this.primerApellido.type(primerApellido);
    }

    public void seleccionarTipoDireccion(String tipoDireccion) {selectItem(this.tipoDireccion,tipoDireccion);
    }


    public void ingresarDireccionDepartamenteYCiudad(String direccion, String departamento, String ciudad) {
        this.direccion.sendKeys(direccion);
        selectItem(comboBoxDepartamento,departamento);
        waitABit(4000);
        selectItem(comboBoxCiudad,ciudad);
        waitABit(1500);
    }

    public void ingresarDireccion2(String direccion, String departamento, String ciudad, String tipoDireccion) {
        waitABit(2000);
        direccion2.sendKeys(direccion);
        selectItem(comboBoxDepartamento2,departamento);
        waitABit(4000);
        selectItem(comboBoxCiudad2,ciudad);
        waitABit(2000);
        selectItem(tipoDireccion2,tipoDireccion);
        waitABit(1500);
    }

    public void actualizarPersonaNatural(String primerNombre) {
        this.botonActualizar.waitUntilClickable();
        this.botonActualizar.click();
        waitABit(2000);
        nombreContact.waitUntilPresent();
        MatcherAssert.assertThat(this.nombreContact.getText(), Matchers.containsString(primerNombre));
    }

    private void actualizar() {
        this.botonActualizar.waitUntilClickable();
        this.botonActualizar.click();
        waitABit(1000);
    }

    public void ingresarTelefonoFijo(String tipoTelefono, String numeroTelefono) {
        if (esTelefonoFijo(tipoTelefono)) {
            ingresarTelefono(tipoTelefono, numeroTelefono);
        }
    }

    private void ingresarTelefono(String tipoTelefono, String numeroTelefono) {
        if ("Trabajo".equals(tipoTelefono)) {
            this.tipoTelefono.type(tipoTelefono);
            waitABit(1000);
            this.tipoTelefono.click();
            this.telefonoTrabajo.type(numeroTelefono);
        } else if ("Vivienda".equals(tipoTelefono)) {
            this.tipoTelefono.type(tipoTelefono);
            waitABit(1000);
            this.tipoTelefono.click();
            this.telefonoResidencia.type(numeroTelefono);
        }

    }

    /**
     * Escenario nuevo contacto persona juridica
     * @param razonSocial
     */
    public void ingresarRazonSocial(String razonSocial) {
        this.razonSocial.type(razonSocial);
    }

    public void actualizarJuridica(String razonSocial) {
        this.botonActualizar.waitUntilClickable();
        this.botonActualizar.click();
        waitABit(2000);
        desRazonSocial.waitUntilPresent();
        MatcherAssert.assertThat(this.desRazonSocial.getText().toString(), Matchers.containsString(razonSocial));

    }

    public void verificarContactoExistente() {
        this.botonActualizar.waitUntilClickable();
        this.botonActualizar.click();
        waitABit(1000);
        MatcherAssert.assertThat(this.contactoExistente.getText().toString(), Matchers.containsString("Ya existe un contacto con el mismo número de identificación"));
    }

    private Boolean esTelefonoFijo(String tipoTelefono) {
        if ("Trabajo".equals(tipoTelefono) || "Vivienda".equals(tipoTelefono)) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /**
     * Escenario campo pais, departamento y ciudad obligatorio
     */
    public void validarCampoPaisDepartamentoYCiudad() {
        if (esTelefonoFijo(this.tipoTelefono.getValue())) {
            actualizar();
            List<WebElementFacade> tabs = withTimeoutOf(1, TimeUnit.SECONDS).findAll(".//*[@id='NewContact:_msgs']//div");
            EnumContacto mensajeRequerido = null;
            boolean flag;
            for (WebElementFacade div : tabs) {
                String textoRequerido = div.getText();
                flag = false;
                if (textoRequerido.toLowerCase().contains(EnumContacto.CIUDAD.name().toLowerCase())) {
                    mensajeRequerido = EnumContacto.CIUDAD;
                    flag = true;
                }
                if (textoRequerido.toLowerCase().contains(EnumContacto.DEPARTAMENTO.name().toLowerCase())) {

                    mensajeRequerido = EnumContacto.DEPARTAMENTO;
                    flag = true;
                }
                if (flag) {
                    MatcherAssert.assertThat(textoRequerido, Matchers.containsString(mensajeRequerido.getMensajeRequerido()));
                }
            }
        }

    }

    public void btnActualizarPersonaNatural() {
        botonActualizar.click();
    }
}
