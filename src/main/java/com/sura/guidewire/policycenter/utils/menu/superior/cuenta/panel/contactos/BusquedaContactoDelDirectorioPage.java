package com.sura.guidewire.policycenter.utils.menu.superior.cuenta.panel.contactos;

import com.sura.guidewire.policycenter.utils.PageUtil;
import java.util.List;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BusquedaContactoDelDirectorioPage extends PageUtil {

    @FindBy(xpath = ".//input[contains(@id,'ContactSearchPopup:ContactSearchScreen:DocumentType-inputEl')]")
    private WebElementFacade cboTipoContacto;
    @FindBy(xpath = ".//input[@id='ContactSearchPopup:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    private WebElementFacade txtPrimerNombre;
    @FindBy(xpath = ".//input[@id='ContactSearchPopup:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:LastName-inputEl']")
    private WebElementFacade txtPrimerApellido;
    @FindBy(xpath = ".//a[@id='ContactSearchPopup:ContactSearchScreen:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade btnBuscar;

    protected static final int POSICION_2 = 2;


    public BusquedaContactoDelDirectorioPage(WebDriver driver) {
        super(driver);
    }

    @SuppressWarnings("SameParameterValue")
    public Boolean buscarContacto(String tipoContacto, String nombre, String apellido) {
        Boolean esBuscado = Boolean.FALSE;
        cboTipoContacto.click();
        WebElementFacade optCboTipoContacto = findBy(".//li[contains(.,'" + tipoContacto + "')]");
        optCboTipoContacto.click();
        waitUntil(WAIT_TIME_1000);
        txtPrimerNombre.type(nombre);
        txtPrimerApellido.type(apellido);
        btnBuscar.click();
        esBuscado = selecionarContacto(esBuscado, "1234567891");
        return esBuscado;
    }

    @SuppressWarnings("SameParameterValue")
    private Boolean selecionarContacto(Boolean esBuscado, String numDocumento) {
        Boolean buscado = esBuscado;
        List<WebElementFacade> listaContactos = findAll(".//*[@id='ContactSearchPopup:ContactSearchScreen:ContactSearchResultsLV-body']/div/table/tbody/tr");
        if (!listaContactos.isEmpty()) {
            for (WebElementFacade contacto : listaContactos){
                if (numDocumento.equals(contacto.getText().split("\n")[POSICION_2].toString())){
                    WebElementFacade linkSeleccionar =  contacto.then(By.xpath(".//a[@id='ContactSearchPopup:ContactSearchScreen:ContactSearchResultsLV:0:_Select']"));
                    linkSeleccionar.click();
                    break;
                }
            }
            buscado = true;
        }
        return buscado;
    }
}
