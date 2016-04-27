package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

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


    public void seleccionarTipoDocumento (String tipoDocumento){
     this.tipoDocumento.type(tipoDocumento);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.tipoDireccion.click();
    }

    public void ingresarDireccion(String direccion){
        this.direccion.type(direccion);
        this.direccion.click();
    }

    public void actualizar(){
        wait_for_the_element_to_be_clickable(this.actualizar);
        this.actualizar.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //assert(this.nombreContact.getText().toString(), "BRAYAN");
        Assert.assertEquals(this.nombreContact.getText().toString(), "BRAYAN");


    }

    public void wait_for_the_element_to_be_clickable(WebElementFacade element) {
        new WebDriverWait(getDriver(), 60).ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.elementToBeClickable((element)));
    }
}
