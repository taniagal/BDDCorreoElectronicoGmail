package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class BusquedaContactoPage extends Guidewire {

    public BusquedaContactoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath=".//*[@id='TabBar:ContactTab']")
    WebElementFacade contactMenu;

    @FindBy(xpath=".//*[@id='TabBar:ContactTab:Search']")
    WebElementFacade buscarContact;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:ContactType-inputEl']")
    WebElementFacade tipoContact;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    WebElementFacade nombreContact;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:LastName-inputEl']")
    WebElementFacade apellidoContact;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade botonBuscar;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:ContactSearchResultsLV:0:Name']")
    WebElementFacade selectContact;



    public void buscarContacto()  {
        try{
        Actions act = new Actions(getDriver());
        contactMenu.click();
        Thread.sleep(1000);
        contactMenu.click();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.moveToElement(buscarContact).click().build().perform();
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    public void buscarContactoPersona(){
        tipoContact.type("Personal");
        tipoContact.sendKeys(Keys.ENTER);
        nombreContact.type("Ray");
        apellidoContact.type("Newton");
        botonBuscar.click();
        selectContact.click();
    }

    public void buscarContactoPersona(String nombre, String apellido){
        tipoContact.type("Personal");
        tipoContact.sendKeys(Keys.ENTER);
        nombreContact.type(nombre);
        apellidoContact.type(apellido);
        botonBuscar.click();
        selectContact.click();
    }

}
