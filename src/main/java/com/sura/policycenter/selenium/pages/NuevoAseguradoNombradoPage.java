package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jorgsape on 2016/05/13.
 */
public class NuevoAseguradoNombradoPage extends Guidewire {

    @FindBy(xpath = ".//input[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    private WebElementFacade txtNombre;
    @FindBy(xpath = ".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:LastName-inputEl']")
    private WebElementFacade txtApellido;
    @FindBy(xpath = ".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    private WebElementFacade txtDireccion;
    @FindBy(xpath = ".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressType-inputEl']")
    private WebElementFacade cboTipoDireccion;

    @FindBy(xpath = ".//*[@id='NewAccountContactPopup:ContactDetailScreen:Update-btnInnerEl']")
    private WebElementFacade btnActualizar;

    ContactosAsociadosACuentasPage contactosAsociadosACuentasPage = new ContactosAsociadosACuentasPage(getDriver());

    public NuevoAseguradoNombradoPage(WebDriver driver) {
        super(driver);
    }

    public Boolean asociarNuevoAseguradoNombradoACuenta() {

        Boolean esAsociado;
        try {
            txtNombre.type("JOHAN");
            txtApellido.type("MUSTACHE");

            cboTipoDireccion.click();
            cboTipoDireccion.clear();
            cboTipoDireccion.sendKeys("Otros");
            cboTipoDireccion.click();
            txtDireccion.type("CL 45 - 56 A 109");

            btnActualizar.click();
            esAsociado = Boolean.TRUE;
        } catch (Exception e) {
            e.printStackTrace();
            esAsociado =  Boolean.FALSE;
        }

        return esAsociado;
    }
}
