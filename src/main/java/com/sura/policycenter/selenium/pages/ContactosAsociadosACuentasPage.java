package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import com.sura.serinitybdd.util.GwNavegacionUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.*;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by jorgsape on 2016/05/04.
 */
public class ContactosAsociadosACuentasPage extends Guidewire {
    private static String MSG_ASSERT_MENU_BTN_CREAR_NUEVO_CONTACTO = "Elementos del menú encontrados";
    @FindBy(xpath = ".//td[@id='AccountFile:MenuLinks:AccountFile_AccountFile_Contacts']/div")
    private WebElementFacade linkAccountFileAccountFileContacts;
    @FindBy(xpath = ".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountContactDetailCardTab']")
    private WebElementFacade tabDetalleContactos;
    @FindBy(xpath = ".//div[2]/div/a[2]/span/span/span")
    private WebElementFacade tabRolesFunciones;
    @FindBy(xpath = ".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AddressesCardTab-btnInnerEl']")
    private WebElementFacade tabDirecciones;
    @FindBy(xpath = ".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:JobsCardTab-btnInnerEl']")
    private WebElementFacade tabTransaccionesAsociadas;
    @FindBy(xpath = ".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:PoliciesCardTab-btnInnerEl']")
    private WebElementFacade tabPolizasAsociadas;
    @FindBy(xpath = ".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:0']")
    private WebElementFacade lblTitulo;

    /*
    * Informacion tab detalle de contacto
    * */
    @FindBy(xpath = ".//label[contains(@id,'ContactsScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:EmailAddress1-labelEl')]")
    private WebElementFacade lblEmail;

    @FindBy(xpath = ".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountContactDV:OfficialIDInputSet:DocumentType-labelCell']")
    private WebElementFacade lblTipoDocumento;
    @FindBy(xpath = ".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountContactDV:OfficialIDInputSet:OfficialIDDV_Input-labelEl']")
    private WebElementFacade lblNumeroDocumento;
    @FindBy(xpath = ".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Name-labelEl']")
    private WebElementFacade lblRazonSocial;
    @FindBy(xpath = ".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:CommercialName-labelEl']")
    private WebElementFacade lblNombreComercial;
    @FindBy(xpath = ".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:FirstName-labelEl']")
    private WebElementFacade lblNombre;
    @FindBy(xpath = ".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:MiddleName-labelEl']")
    private WebElementFacade lblSegundoNombre;
    @FindBy(xpath = ".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:LastName-labelEl']")
    private WebElementFacade lblApellido;
    @FindBy(xpath = ".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:Particle-labelEl']")
    private WebElementFacade lblSegundoApellido;
    @FindBy(xpath = ".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-labelCell']")
    private WebElementFacade lblDireccion;
    @FindBy(xpath = ".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:WorkPhone:GlobalPhoneInputSet:PhoneDisplay-labelEl']")
    private WebElementFacade lblTelefono;


    @FindBy(xpath = ".//a[contains(.,'Crear nuevo contacto')]")
    private WebElementFacade btnCrearNuevoContacto;

    public ContactosAsociadosACuentasPage(WebDriver driver) {
        super(driver);
    }

    public void consultarContactos() {
        linkAccountFileAccountFileContacts.waitUntilClickable();
        linkAccountFileAccountFileContacts.click();
    }


    public void existeEncabezadoDeTabla(ExamplesTable encabezados, String keyElement, String xPathElementos) {
        List<WebElementFacade> listEncabezados = withTimeoutOf(1, SECONDS).findAll(xPathElementos);

        int countCoincidencias = 0;
        for (Map<String, String> enc : encabezados.getRows()) {
            if (enc.containsKey(keyElement)) {

                for (WebElement encabezad : listEncabezados) {
                    if (encabezad.getText().equals(enc.get(keyElement).toString())) {
                        countCoincidencias++;
                        break;
                    }
                }
            }

        }


        assertThat("Se encontraron los encabezados esperados", countCoincidencias == encabezados.getRowCount());


    }

    public List<WebElementFacade> getListaContactos() {
        List<WebElementFacade> contactos = withTimeoutOf(1, SECONDS).findAll(".//div[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV']/div/div/table/tbody/tr");
        return contactos;
    }

    public List<WebElementFacade> getListaRolesFunciones() {
        List<WebElementFacade> rolesFunciones = withTimeoutOf(1, SECONDS).findAll(".//div[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV']/div/div/table/tbody/tr");
        return rolesFunciones;
    }

    public List<WebElementFacade> getListaDirecciones() {
        List<WebElementFacade> direcciones = withTimeoutOf(1, SECONDS).findAll(".//div[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AddressesPanelSet_ref']/table/tbody/tr");
        return direcciones;
    }

    public void selecionarContacto(String posicion) {
        List<WebElementFacade> contactos = getListaContactos();
        contactos.get(Integer.parseInt(posicion)).click();
        waitABit(1000);
    }

    public void seleccionarTabDetalleContacto() {
        tabDetalleContactos.waitUntilClickable();
        tabDetalleContactos.click();
    }

    public void seleccionarTabRolesFunciones() {
        tabRolesFunciones.waitUntilClickable();
        tabRolesFunciones.click();
    }

    public void seleccionarTabDirecciones() {
        tabDirecciones.waitUntilClickable();
        tabDirecciones.click();
    }

    public void seleccionarTabTransaccionesAsociadas() {
        tabTransaccionesAsociadas.waitUntilClickable();
        tabTransaccionesAsociadas.click();
    }

    public void seleccionarTabPolizasAsociadas() {
        tabPolizasAsociadas.waitUntilClickable();
        tabPolizasAsociadas.click();
    }

    public void verificarListaContactoNoEsNulo() {
        List<WebElementFacade> contactos = getListaContactos();
        assertThat("La cuenta debe tener contactos de tipo persona juridica o natural", contactos.size() > 0);
    }

    public void verificarDetalleContactoNoEsNulo() {

        assertThat("El campo tipo de documento es obligatorio", lblTipoDocumento.isPresent());
        assertThat("El campo numero de documento es obligatorio", lblNumeroDocumento.isPresent());

        if ("PERSONAL".equals(lblTitulo.getText().toUpperCase())) {
            assertThat("El campo nombre es obligatorio", lblNombre.isPresent());
            assertThat("El campo segundo nombre es obligatorio", lblSegundoNombre.isPresent());
            assertThat("El campo apellido es obligatorio", lblApellido.isPresent());
            assertThat("El campo segundo apellido es obligatorio", lblSegundoApellido.isPresent());
        } else {
            assertThat("El campo razon social es obligatorio", lblRazonSocial.isPresent());
            assertThat("El campo nombre comercial es obligatorio", lblNombreComercial.isPresent());

        }
        assertThat("El campo direccion es obligatorio", lblDireccion.isPresent());
        assertThat("El campo telefono es obligatorio", lblTelefono.isPresent());
        //assertThat("El campo email es obligatorio", lblEmail.isPresent());
    }

    public void verificarRolesFuncionesNoEsNulo() {
        List<WebElementFacade> rolesFunciones = getListaRolesFunciones();
        assertThat("El contacto debe tener roles o funciones asignados", rolesFunciones.size() > 0);
        waitABit(1000);
    }

    public void verificarDireccioneNoEsNulo() {
        List<WebElementFacade> direcciones = getListaDirecciones();
        assertThat("El contacto debe tener direcciones asignados", direcciones.size() > 0);
        waitABit(1000);
    }



    public void existeOpcionesPorSubMenu(ExamplesTable opcionesPorRol, Boolean darClick) throws Exception {
        assertThat(MSG_ASSERT_MENU_BTN_CREAR_NUEVO_CONTACTO, GwNavegacionUtil.existenOpcionesPorMenuHastaSegundoNivel(getDriver(), Keys.RIGHT,"LINK",opcionesPorRol, darClick));
    }


    public void esContactoAsociado() throws Exception {
        NuevoAseguradoNombradoPage nuevoAseguradoNombradoPage = new NuevoAseguradoNombradoPage(getDriver());
        //if (nuevoAseguradoNombradoPage.asociarNuevoAseguradoNombradoACuenta()){
            for (WebElementFacade contacto : getListaContactos()){
                System.out.printf("");
            }
        //}

        //assertThat();

    }


    public void clicCrearNuevoContacto() {
        this.btnCrearNuevoContacto.click();
    }


}
