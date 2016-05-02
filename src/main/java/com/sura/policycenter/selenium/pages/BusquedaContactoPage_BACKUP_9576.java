package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isIn;

public class BusquedaContactoPage extends Guidewire {

    @FindBy(xpath=".//*[@id='TabBar:ContactTab']")
    WebElementFacade contactMenu;

    @FindBy(xpath=".//*[@id='TabBar:ContactTab:Search']")
    WebElementFacade buscarContact;

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

    public void accionarBuscarContacto()  {
        try{
            Actions act = new Actions(getDriver());
            contactMenu.click();
            Thread.sleep(1000);
            contactMenu.click();
            act.sendKeys(Keys.ARROW_DOWN).build().perform();
            act.moveToElement(buscarContact).click().build().perform();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void buscarContacto(String tipoContacto, String nombre, String apellido){
        tipoContact.type(tipoContacto);
        tipoContact.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (tipoContacto.equals("Personal")){
            nombreContact.type(nombre);
            apellidoContact.type(apellido);
        }else{
            nombreEmpresaContact.type(nombre);
        }
        botonBuscar.click();
        selectContact.click();
    }

<<<<<<< HEAD
    public void buscarContactoEmpresa(String nombreEmpresa){
        tipoContact.type("Empresa");
        tipoContact.sendKeys(Keys.ENTER);
=======
    public void buscarContacto(String tipoContacto, String nombre, String apellido, String numero){
        tipoContact.type(tipoContacto);
        tipoContact.sendKeys(Keys.ENTER);
        int parada = Integer.parseInt(numero);
>>>>>>> develop
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
<<<<<<< HEAD
        txtNombreEmpresa.type(nombreEmpresa);
        botonBuscar.click();
        selectContact.click();
    }


}
=======
        if (tipoContacto.equals("Personal")){
            nombreContact.type(nombre);
            apellidoContact.type(apellido);
        }else{
            nombreEmpresaContact.type(nombre);
        }
        botonBuscar.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

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
}
>>>>>>> develop
