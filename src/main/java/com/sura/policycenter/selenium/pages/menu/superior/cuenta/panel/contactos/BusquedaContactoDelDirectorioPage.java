package com.sura.policycenter.selenium.pages.menu.superior.cuenta.panel.contactos;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class BusquedaContactoDelDirectorioPage extends Guidewire {

    @FindBy(xpath = ".//input[contains(@id,'ContactSearchPopup:ContactSearchScreen:DocumentType-inputEl')]")
    private WebElementFacade cboTipoContacto;
    @FindBy(xpath = ".//input[@id='ContactSearchPopup:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    private WebElementFacade txtPrimerNombre;
    @FindBy(xpath = ".//input[@id='ContactSearchPopup:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:LastName-inputEl']")
    private WebElementFacade txtPrimerApellido;
    @FindBy(xpath = ".//a[@id='ContactSearchPopup:ContactSearchScreen:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade btnBuscar;


    public BusquedaContactoDelDirectorioPage(WebDriver driver) {
        super(driver);
    }

    @SuppressWarnings("SameParameterValue")
    public Boolean buscarContacto(String tipoContacto, String nombre, String apellido) {
        Boolean esBuscado = Boolean.FALSE;


        cboTipoContacto.click();

        WebElementFacade optCboTipoContacto = findBy(".//li[contains(.,'" + tipoContacto + "')]");
        optCboTipoContacto.click();
        waitABit(1000);
        txtPrimerNombre.type(nombre);
        txtPrimerApellido.type(apellido);
        btnBuscar.click();

        esBuscado = selecionarContacto(esBuscado, "1234567891");

        return esBuscado;
    }

    @SuppressWarnings("SameParameterValue")
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
            esBuscado = true;
        }
        return esBuscado;
    }
}
