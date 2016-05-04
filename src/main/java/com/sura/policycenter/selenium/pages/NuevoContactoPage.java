package com.sura.policycenter.selenium.pages;


import com.sura.guidewire.selenium.Guidewire;
import com.sura.policycenter.constantes.EnumContacto;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.hamcrest.MatcherAssert.assertThat;

import org.openqa.selenium.WebDriver;

import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.hamcrest.Matchers.containsString;

/**
 * Created by brayruru on 2016/04/27.
 */
public class NuevoContactoPage extends Guidewire {


    public NuevoContactoPage(WebDriver driver) {
        super(driver);
    }


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
    private WebElementFacade actualizar;

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

    @FindBy(xpath = ".//*[@id='NewContact:ContactPanelSet:ContactCV:ContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']")
    private WebElementFacade pais;

    @FindBy(xpath = ".//*[@id='NewContact:ContactPanelSet:ContactCV:ContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    private WebElementFacade departamento;

    @FindBy(xpath = ".//*[@id='NewContact:ContactPanelSet:ContactCV:ContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl']")
    private WebElementFacade ciudad;

    private WebElementFacade arregloDeMensajes;

    private Guidewire gw = new Guidewire(getDriver());


    public void seleccionarTipoDocumento(String tipoDocumento) {
        this.tipoDocumento.type(tipoDocumento);
        gw.threadWait(1000);
        this.tipoDocumento.click();
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
        this.tipoDireccion.type(tipoDireccion);
        gw.threadWait(1000);
        this.tipoDireccion.click();
    }

    public void ingresarDireccion(String direccion) {
        this.direccion.type(direccion);
        this.direccion.click();
    }

    public void actualizarPersonaNatural() {
        this.actualizar.waitUntilClickable();
        this.actualizar.click();

        gw.threadWait(1000);
        assertThat(this.nombreContact.getText(), containsString("BRAYAN"));

    }

    private void actualizar() {
        this.actualizar.waitUntilClickable();
        this.actualizar.click();
        gw.threadWait(1000);

    }

    public void ingresarTelefonoFijo(String tipoTelefono, String numeroTelefono) {
        if (esTelefonoFijo(tipoTelefono)) {
            ingresarTelefono(tipoTelefono, numeroTelefono);
        }
    }


    private void ingresarTelefono(String tipoTelefono, String numeroTelefono) {

        if ("Trabajo".equals(tipoTelefono)) {
            this.tipoTelefono.type(tipoTelefono);
            gw.threadWait(1000);
            this.tipoTelefono.click();
            this.telefonoTrabajo.type(numeroTelefono);
        } else if ("Vivienda".equals(tipoTelefono)) {
            this.tipoTelefono.type(tipoTelefono);
            gw.threadWait(1000);
            this.tipoTelefono.click();
            this.telefonoResidencia.type(numeroTelefono);
        } else {

        }


    }


    //ESCENARIO NUEVO CONTACTO PERSONA JURIDICA
    public void ingresarRazonSocial(String razonSocial) {
        this.razonSocial.type(razonSocial);
    }

    public void actualizarJuridica() {

        this.actualizar.waitUntilClickable();
        this.actualizar.click();
        gw.threadWait(1000);
        assertThat(this.desRazonSocial.getText().toString(), containsString("La Vaquita"));

    }

    public void verificarContactoExistente() {

        this.actualizar.waitUntilClickable();
        this.actualizar.click();
        gw.threadWait(1000);
        assertThat(this.contactoExistente.getText().toString(), containsString("Ya existe un contacto con el mismo número de identificación"));
    }

    private Boolean esTelefonoFijo(String tipoTelefono) {
        if ("Trabajo".equals(tipoTelefono) || "Vivienda".equals(tipoTelefono)) {
            return Boolean.TRUE;
        }

        return Boolean.FALSE;

    }

    //ESCENARIO CAMPO PAIS, DEPARTAMENTO Y CIUDAD OBLIGATORIO

    public void validarCampoPaisDepartamentoYCiudad() {

        if (esTelefonoFijo(this.tipoTelefono.getValue())) {
            actualizar();

            List<WebElementFacade> tabs = withTimeoutOf(1, SECONDS).findAll(".//*[@id='NewContact:_msgs']//div");

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
                    assertThat(textoRequerido, containsString(mensajeRequerido.getMensajeRequerido()));
                }

            }

        }

    }


}
