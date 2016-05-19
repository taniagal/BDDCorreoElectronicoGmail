package com.sura.policycenter.selenium.pages.menu.superior.cuenta.panel.contactos;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by johan.beltran on 18/05/2016.
 */
public class BusquedaContactoDelDirectorioPage extends Guidewire {

    @FindBy(xpath = ".//input[contains(@id,'ContactSearchPopup:ContactSearchScreen:DocumentType-inputEl')]")
    WebElementFacade cboTipoContacto;
    @FindBy(xpath = ".//input[@id='ContactSearchPopup:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    WebElementFacade txtPrimerNombre;
    @FindBy(xpath = ".//input[@id='ContactSearchPopup:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:LastName-inputEl']")
    WebElementFacade txtPrimerApellido;
    @FindBy(xpath = ".//a[@id='ContactSearchPopup:ContactSearchScreen:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade btnBuscar;


    public BusquedaContactoDelDirectorioPage(WebDriver driver) {
        super(driver);
    }

    public Boolean buscarContacto(String tipoContacto, String nombre, String apellido) {
        Boolean esBuscado = Boolean.FALSE;
        try {


            cboTipoContacto.click();

            WebElementFacade optCboTipoContacto = findBy(".//li[contains(.,'" + tipoContacto + "')]");
            optCboTipoContacto.click();
            waitABit(1000);
            txtPrimerNombre.type(nombre);
            txtPrimerApellido.type(apellido);
            btnBuscar.click();

            esBuscado = selecionarContacto(esBuscado, "1234567891");
        }catch (Exception e){
            return esBuscado;
        }

        return esBuscado;
    }

    private Boolean selecionarContacto(Boolean esBuscado, String numDocumento) {
        List<WebElementFacade> listaContactos = findAll(".//*[@id='ContactSearchPopup:ContactSearchScreen:ContactSearchResultsLV-body']/div/table/tbody/tr");
        if (!listaContactos.isEmpty()) {
            for (WebElementFacade contacto : listaContactos){
                if (numDocumento.equals(contacto.getText().split("\n")[2].toString())){
                    WebElementFacade linkSeleccionar =  contacto.then(By.xpath(".//a[@id='ContactSearchPopup:ContactSearchScreen:ContactSearchResultsLV:0:_Select']"));
                    linkSeleccionar.click();
                    break;
                }
            }
            esBuscado = Boolean.TRUE;
        }
        return esBuscado;
    }
}
