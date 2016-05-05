package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by jorgsape on 2016/05/04.
 */
public class ContactosAsociadosACuentasPage extends Guidewire {

    public ContactosAsociadosACuentasPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//td[@id='AccountFile:MenuLinks:AccountFile_AccountFile_Contacts']/div")
    private WebElementFacade linkAccountFileAccountFileContacts;

    @FindBy(xpath = ".//div[2]/div/a[2]/span/span/span")
    private WebElementFacade tabRolesFunciones;

    @FindBy(xpath = ".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AddressesCardTab-btnInnerEl']")
    private WebElementFacade tabRolesDirecciones;


    public void consultarContactos(){
        linkAccountFileAccountFileContacts.waitUntilClickable();
        linkAccountFileAccountFileContacts.click();
    }

    public List<WebElementFacade> getListaContactos(){
        List<WebElementFacade> contactos = withTimeoutOf(1, SECONDS).findAll(".//div[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV']/div/div/table/tbody/tr");
        return contactos;
    }

    public List<WebElementFacade> getListaRolesFunciones(){
        List<WebElementFacade> rolesFunciones = withTimeoutOf(1, SECONDS).findAll(".//div[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV']/div/div/table/tbody/tr");
        return rolesFunciones;
    }

    public List<WebElementFacade> getListaDirecciones(){
        List<WebElementFacade> direcciones = withTimeoutOf(1, SECONDS).findAll(".//div[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AddressesPanelSet_ref']/table/tbody/tr");
        return direcciones;
    }


    public void verificarDetalleContactoNoEsNulo() {
        List<WebElementFacade> contactos = getListaContactos();
        assertThat("La cuenta debe tener contactos de tipo persona juridica o natural", contactos.size()>0);
    }

    public void selecionarContacto(String posicion) {
        List<WebElementFacade> contactos = getListaContactos();
        contactos.get(Integer.parseInt(posicion)).click();
        threadWait(1000);
    }

    public void seleccionarTabRolesFunciones() {
        tabRolesFunciones.waitUntilClickable();
        tabRolesFunciones.click();
    }

    public void seleccionarTabDirecciones() {
        tabRolesDirecciones.waitUntilClickable();
        tabRolesDirecciones.click();
    }

    public void verificarRolesFuncionesNoEsNulo() {
        List<WebElementFacade> rolesFunciones = getListaRolesFunciones();
        assertThat("El contacto debe tener roles o funciones asignados", rolesFunciones.size()>0);
        threadWait(1000);
    }

    public void verificarDireccioneNoEsNulo() {
        List<WebElementFacade> direcciones = getListaDirecciones();
        assertThat("El contacto debe tener direcciones asignados", direcciones.size()>0);
        threadWait(1000);
    }


}
