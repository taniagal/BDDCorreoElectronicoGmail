package com.sura.guidewire.policycenter.pages.contacto;

import com.sura.guidewire.policycenter.resources.PageUtil;
import com.sura.guidewire.policycenter.utils.constantes.EnumContacto;

import java.util.List;
import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class NuevoContactoPage extends PageUtil {

    @FindBy(xpath = ".//*[@id, 'ContactDV:OfficialIDInputSet:DocumentType-inputEl']")
    private WebElementFacade tipoDocumento;
    @FindBy(xpath = ".//*[contains(@id, 'ContactDV:OfficialIDInputSet:OfficialIDDV_Input-inputEl')]")
    private WebElementFacade numeroDocumento;
    @FindBy(xpath = ".//*[contains(@id, 'ContactNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl')]")
    private WebElementFacade primerNombre;
    @FindBy(xpath = ".//*[contains(@id, 'ContactNameInputSet:GlobalPersonNameInputSet:MiddleName-inputEl')]")
    private WebElementFacade campoSegundoNombre;
    @FindBy(xpath = ".//*[contains(@id, 'ContactNameInputSet:GlobalPersonNameInputSet:LastName-inputEl')]")
    private WebElementFacade primerApellido;
    @FindBy(xpath = ".//*[contains(@id, ':ContactNameInputSet:GlobalPersonNameInputSet:Particle-inputEl')]")
    private WebElementFacade campoSegundoApellido;
    @FindBy(xpath = ".//*[contains(@id, 'ContactDV:AddressType-inputEl')]")
    private WebElementFacade tipoDireccion;
    @FindBy(xpath = ".//*[contains(@id, 'ContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl')]")
    private WebElementFacade direccion;
    @FindBy(xpath = ".//*[contains(@id, 'Update-btnInnerEl')]")
    private WebElementFacade botonActualizar;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    private WebElementFacade nombreContact;
    @FindBy(xpath = ".//*[contains(@id, 'ContactDV:ContactNameInputSet:GlobalContactNameInputSet:Name-inputEl')]")
    private WebElementFacade razonSocial;
    @FindBy(xpath = ".//*[contains(@id, 'ContactDV:ContactNameInputSet:GlobalContactNameInputSet:CommercialName-inputEl')]")
    private WebElementFacade nombreComercial;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Name-inputEl']")
    private WebElementFacade desRazonSocial;
    @FindBy(xpath = ".//*[@id='NewContact:_msgs']/div")
    private WebElementFacade contactoExistente;
    @FindBy(xpath = ".//*[contains(@id, 'ContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:PrimaryPhone-inputEl')]")
    private WebElementFacade tipoTelefono;
    @FindBy(xpath = ".//*[contains(@id, 'ContactDV:ContactNameInputSet:WorkPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl')]")
    private WebElementFacade telefonoTrabajo;
    @FindBy(xpath = ".//*[contains(@id, 'ContactDV:ContactNameInputSet:HomePhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl')]")
    private WebElementFacade telefonoResidencia;
    @FindBy(xpath = ".//*[contains(@id, 'ContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl')]")
    private WebElementFacade comboBoxDepartamento;
    @FindBy(xpath = ".//*[contains(@id, 'ContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Sura_City-inputEl')]")
    private WebElementFacade comboBoxCiudad;
    @FindBy(xpath = ".//*[contains(@id, 'ContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:DateOfBirth-inputEl')]")
    private WebElementFacade fechaDeNacimiento;

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

    public void seleccionarTipoDireccion(String tipoDireccion) {
        seleccionarItem(this.tipoDireccion, tipoDireccion);
    }


    public void ingresarDireccionDepartamenteYCiudad(String direccion, String departamento, String ciudad) {
        this.direccion.sendKeys(direccion);
        seleccionarItem(comboBoxDepartamento, departamento);
        esperarPorValor(comboBoxDepartamento, departamento);
        esperarHasta(TIEMPO_2000);
        seleccionarItem(comboBoxCiudad, ciudad);
        esperarPorValor(comboBoxCiudad, ciudad);
    }

    public void actualizarPersonaNatural(String primerNombre) {
        this.actualizar();
        nombreContact.waitUntilPresent();
        MatcherAssert.assertThat(nombreContact.getText(), Matchers.containsString(primerNombre));
    }

    private void actualizar() {
        clickearElemento(botonActualizar);
        esperarHasta(TIEMPO_1000);
    }

    public void ingresarTelefonoFijo(String tipoTelefono, String numeroTelefono) {
        if (esTelefonoFijo(tipoTelefono)) {
            ingresarTelefono(tipoTelefono, numeroTelefono);
        }
    }

    private void ingresarTelefono(String tipoTelefono, String numeroTelefono) {
        if ("Trabajo".equals(tipoTelefono)) {
            this.tipoTelefono.type(tipoTelefono);
            esperarHasta(TIEMPO_1000);
            this.tipoTelefono.click();
            this.telefonoTrabajo.type(numeroTelefono);
        } else if ("Vivienda".equals(tipoTelefono)) {
            this.tipoTelefono.type(tipoTelefono);
            esperarHasta(TIEMPO_1000);
            this.tipoTelefono.click();
            this.telefonoResidencia.type(numeroTelefono);
        }

    }

    /**
     * Escenario nuevo contacto persona juridica
     *
     * @param razonSocial
     */
    public void ingresarRazonSocial(String razonSocial) {
        this.razonSocial.type(razonSocial);
    }

    public void actualizarJuridica(String razonSocial) {
        this.botonActualizar.waitUntilClickable();
        this.botonActualizar.click();
        esperarHasta(TIEMPO_2000);
        desRazonSocial.waitUntilPresent();
        MatcherAssert.assertThat(this.desRazonSocial.getText(), Matchers.containsString(razonSocial));

    }

    public void verificarContactoExistente() {
        clickearElemento(botonActualizar);
        esperarHasta(TIEMPO_1000);
        MatcherAssert.assertThat(this.contactoExistente.getText(), Matchers.containsString("Ya existe un contacto con el mismo número de identificación"));
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
            List<WebElementFacade> tabs = withTimeoutOf(TIEMPO_1, TimeUnit.SECONDS).findAll(".//*[@id='NewContact:_msgs']//div");
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

    public boolean validarCamposEditablesDeEdicionDeContacto() {
        boolean editables = false;
        if ("NIT".equals(tipoDocumento.getText())) {
            if (super.esCampoEditable(tipoDocumento) && super.esCampoEditable(numeroDocumento)) {
                editables = true;
            }
        } else {
            if (super.esCampoEditable(tipoDocumento) && super.esCampoEditable(numeroDocumento) && super.esCampoEditable(fechaDeNacimiento)) {
                editables = true;
            }
        }
        return editables;
    }

    public void ingresarFechaDeNacimiento(String fecha) {
        fechaDeNacimiento.sendKeys(fecha);
    }

    public void ingresarSegundoNombreYSegundoApellido(String segundoNombre, String segundoApellido) {
        campoSegundoNombre.sendKeys(segundoNombre);
        campoSegundoApellido.sendKeys(segundoApellido);
    }
}
