package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BusquedaContactoPage extends Guidewire {
    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:ContactType-inputEl']")
    WebElementFacade tipoContact;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    WebElementFacade nombreContact;

    @FindBy(xpath = ".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalContactNameInputSet:Name-inputEl']")
    WebElementFacade txtNombreEmpresa;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:LastName-inputEl']")
    WebElementFacade apellidoContact;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalContactNameInputSet:Name-inputEl']")
    WebElementFacade nombreEmpresaContact;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade botonBuscar;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:ContactSearchResultsLV:0:Name']")
    WebElementFacade selectContact;

    @FindBy(xpath="//div[3]/div/table")
    WebElementFacade table;

    public BusquedaContactoPage(WebDriver driver) {
        super(driver);
    }

    public void buscarContacto(String tipoContacto, String nombre, String apellido){
        tipoContact.waitUntilClickable();
        tipoContact.type(tipoContacto);
        tipoContact.sendKeys(Keys.ENTER);
        waitABit(1000);
        if (tipoContacto.equals("Personal")){
            nombreContact.type(nombre);
            apellidoContact.type(apellido);
        }else{
            nombreEmpresaContact.type(nombre);
        }
        botonBuscar.click();
        selectContact.click();
    }

    public void buscarContacto(String tipoContacto, String nombre, String apellido, String numero){
        tipoContact.type(tipoContacto);
        tipoContact.sendKeys(Keys.ENTER);
        int parada = Integer.parseInt(numero);
        waitABit(1000);
        if (tipoContacto.equals("Personal")){
            nombreContact.type(nombre);
            apellidoContact.type(apellido);
        }else{
            nombreEmpresaContact.type(nombre);
        }
        botonBuscar.click();
        waitABit(3000);

        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        WebElement selectedContact1 = null;

        for (int i = 0; i < parada && i < allRows.size(); i++) {
            WebElement row = allRows.get(i);
            List<WebElement> cells = row.findElements(By.tagName("td"));
            selectedContact1 = cells.get(1);
        }
        if (selectedContact1 != null){
            selectedContact1.click();
        }
    }

    public void buscarContactoEmpresa(String nombreEmpresa){
        tipoContact.type("Empresa");
        tipoContact.sendKeys(Keys.ENTER);
        waitABit(1000);
        txtNombreEmpresa.type(nombreEmpresa);
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
