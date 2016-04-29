package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by brayruru on 2016/04/27.
 */
public class NuevoContactoPage extends Guidewire{


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

    @FindBy(xpath =".//*[@id='NewContact:Update-btnInnerEl']")
    private WebElementFacade actualizar;

    @FindBy(xpath =".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    private WebElementFacade nombreContact;

    @FindBy(xpath =".//*[@id='NewContact:ContactPanelSet:ContactCV:ContactDV:ContactNameInputSet:GlobalContactNameInputSet:Name-inputEl']")
    private WebElementFacade razonSocial;

    @FindBy(xpath =".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Name-inputEl']")
    private WebElementFacade desRazonSocial;

    @FindBy(xpath =".//*[@id='NewContact:_msgs']/div")
    private WebElementFacade contactoExistente;
	
    @FindBy(xpath =".//*[@id='NewContact:ContactPanelSet:ContactCV:ContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:PrimaryPhone-inputEl']")
    private WebElementFacade tipoTelefono;

    @FindBy(xpath =".//*[@id='NewContact:ContactPanelSet:ContactCV:ContactDV:ContactNameInputSet:WorkPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl']")
    private WebElementFacade telefonoTrabajo;

    @FindBy(xpath =".//*[@id='NewContact:ContactPanelSet:ContactCV:ContactDV:ContactNameInputSet:HomePhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl']")
    private WebElementFacade telefonoResidencia;

    @FindBy(xpath =".//*[@id='NewContact:ContactPanelSet:ContactCV:ContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']")
    private WebElementFacade pais;

    @FindBy(xpath =".//*[@id='NewContact:ContactPanelSet:ContactCV:ContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    private WebElementFacade departamento;

    @FindBy(xpath =".//*[@id='NewContact:ContactPanelSet:ContactCV:ContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl']")
    private WebElementFacade ciudad;


    public void seleccionarTipoDocumento (String tipoDocumento){
     this.tipoDocumento.type(tipoDocumento);
        setImplicitTimeout(5, SECONDS);
        this.tipoDocumento.click();
    }

    public void ingresarNumeroDocumento( String numeroDocumento){
        this.numeroDocumento.type(numeroDocumento);
    }

    public void ingresarPrimerNombre( String primerNombre){
        this.primerNombre.type(primerNombre);
    }

    public void ingresarPrimerApellido( String primerApellido){
        this.primerApellido.type(primerApellido);
    }

    public void seleccionarTipoDireccion(String tipoDireccion){
        this.tipoDireccion.type(tipoDireccion);
        setImplicitTimeout(5, SECONDS);
        this.tipoDireccion.click();
    }

    public void ingresarDireccion(String direccion){
        this.direccion.type(direccion);
        this.direccion.click();
    }

    public void actualizar(){
        wait_for_the_element_to_be_clickable(this.actualizar);
        this.actualizar.click();

        setImplicitTimeout(5, SECONDS);
        Assert.assertEquals(this.nombreContact.getText().toString(), "BRAYAN");

    }

    public void ingresarTelefonoFijo(String tipoTelefono, String numeroTelefono){
        if (esTelefonoFijo(tipoTelefono)) {
            ingresarTelefono(tipoTelefono, numeroTelefono);
        }
    }


    public void ingresarTelefono(String tipoTelefono, String numeroTelefono) {

        if ("Trabajo".equals(tipoTelefono)) {
            this.tipoDocumento.type(tipoTelefono);
            setImplicitTimeout(2, SECONDS);
            this.tipoDocumento.click();
            this.telefonoTrabajo.type(numeroTelefono);
        } else if ("Vivienda".equals(tipoTelefono)) {
            this.tipoDocumento.type(tipoTelefono);
            setImplicitTimeout(2, SECONDS);
            this.tipoDocumento.click();
            this.telefonoResidencia.type(numeroTelefono);
        } else {

        }


    }


    //ESCENARIO NUEVO CONTACTO PERSONA JURIDICA
    public void ingresarRazonSocial( String razonSocial){
        this.razonSocial.type(razonSocial);
    }

    public void actualizarJuridica() {
        try {
            wait_for_the_element_to_be_clickable(this.actualizar);
            this.actualizar.click();
            Thread.sleep(3000);
            Assert.assertEquals(this.desRazonSocial.getText().toString(), "La Vaquita");
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    public void verificarContactoExistente() {
        try {
            wait_for_the_element_to_be_clickable(this.actualizar);
            this.actualizar.click();
            Thread.sleep(3000);
            Assert.assertEquals(this.contactoExistente.getText().toString(), "Ya existe un contacto con el mismo número de identificación");
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    public Boolean esTelefonoFijo(String tipoTelefono){
        if ("Trabajo".equals(tipoTelefono) || "Vivienda".equals(tipoTelefono)){
            return Boolean.TRUE;
        }

        return Boolean.FALSE;

    }

    public void wait_for_the_element_to_be_clickable(WebElementFacade element) {
        new WebDriverWait(getDriver(), 60).ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.elementToBeClickable((element)));
    }


}
