package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import com.sura.serenitybdd.util.GwNavegacionUtil;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static org.hamcrest.Matchers.containsString;

public class ContactosAsociadosACuentasPage extends Guidewire {

    private static final String ASSERTMENUCREARNUEVOCONTACTO = "Elementos del menú encontrados";
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
    @FindBy(xpath = ".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:removeContact-btnInnerEl']")
    private WebElementFacade btnEliminar;
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
        List<WebElementFacade> listEncabezados = withTimeoutOf(1, TimeUnit.SECONDS).findAll(xPathElementos);
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
        MatcherAssert.assertThat("Se encontraron los encabezados esperados", countCoincidencias == encabezados.getRowCount());
    }

    private List<WebElementFacade> getListaContactos() {
        List<WebElementFacade> contactos;
        contactos = withTimeoutOf(1, TimeUnit.SECONDS).findAll(".//div[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV']/div/div/table/tbody/tr");
        return contactos;
    }

    private List<WebElementFacade> getListaRolesFunciones() {
        List<WebElementFacade> rolesFunciones;
        rolesFunciones = withTimeoutOf(1, TimeUnit.SECONDS).findAll(".//div[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV']/div/div/table/tbody/tr");
        return rolesFunciones;
    }

    private List<WebElementFacade> getListaDirecciones() {
        List<WebElementFacade> direcciones;
        direcciones = withTimeoutOf(1, TimeUnit.SECONDS).findAll(".//div[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AddressesPanelSet_ref']/table/tbody/tr");
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
        MatcherAssert.assertThat("La cuenta debe tener contactos de tipo persona juridica o natural", !contactos.isEmpty());
    }

    public void verificarDetalleContactoNoEsNulo() {

        MatcherAssert.assertThat("El campo tipo de documento es obligatorio", lblTipoDocumento.isPresent());
        MatcherAssert.assertThat("El campo numero de documento es obligatorio", lblNumeroDocumento.isPresent());
        if ("PERSONAL".equalsIgnoreCase(lblTitulo.getText())) {
            MatcherAssert.assertThat("El campo nombre es obligatorio", lblNombre.isPresent());
            MatcherAssert.assertThat("El campo segundo nombre es obligatorio", lblSegundoNombre.isPresent());
            MatcherAssert.assertThat("El campo apellido es obligatorio", lblApellido.isPresent());
            MatcherAssert.assertThat("El campo segundo apellido es obligatorio", lblSegundoApellido.isPresent());
        } else {
            MatcherAssert.assertThat("El campo razon social es obligatorio", lblRazonSocial.isPresent());
            MatcherAssert.assertThat("El campo nombre comercial es obligatorio", lblNombreComercial.isPresent());

        }
        MatcherAssert.assertThat("El campo direccion es obligatorio", lblDireccion.isPresent());
        MatcherAssert.assertThat("El campo telefono es obligatorio", lblTelefono.isPresent());
        MatcherAssert.assertThat("El campo email es obligatorio", lblEmail.isPresent());
    }

    public void verificarRolesFuncionesNoEsNulo() {
        List<WebElementFacade> rolesFunciones = getListaRolesFunciones();
        MatcherAssert.assertThat("El contacto debe tener roles o funciones asignados", !rolesFunciones.isEmpty());
        waitABit(1000);
    }

    public void verificarDireccioneNoEsNulo() {
        List<WebElementFacade> direcciones = getListaDirecciones();
        MatcherAssert.assertThat("El contacto debe tener direcciones asignados", !direcciones.isEmpty());
        waitABit(1000);
    }

    public void existeOpcionesPorSubMenu(ExamplesTable opcionesPorRol, Boolean darClick) throws Exception {
        MatcherAssert.assertThat(ASSERTMENUCREARNUEVOCONTACTO, GwNavegacionUtil.existenOpcionesPorMenuHastaSegundoNivel(getDriver(), Keys.RIGHT, "LINK", opcionesPorRol, darClick));
    }

    public Boolean esContactoAsociado(String nombreContacto) throws Exception {
        Boolean esAsociado = Boolean.FALSE;
        for (WebElementFacade contacto : getListaContactos()) {
            if (((WebElementFacade) contacto).getText().split("\n")[1].toString().equals(nombreContacto)) {
                esAsociado = Boolean.TRUE;
                break;
            }
        }
        MatcherAssert.assertThat("El contacto se asocio a la cuenta exitosamente", esAsociado);
        return esAsociado;
    }

    @SuppressWarnings({"SameParameterValue", "UnusedReturnValue"})
    public Boolean validarOcurrenciaDeMensajeDeAplicacion(String idXpathDivMensajes, String mensajesApp){
        Boolean existeOcurrencia = Boolean.FALSE;
        String mensajeMostrado="";
        List<WebElementFacade> divsMensajes = withTimeoutOf(1, TimeUnit.SECONDS).findAll(idXpathDivMensajes);
        for (WebElementFacade div : divsMensajes) {
            mensajeMostrado = div.getText();
            if (mensajeMostrado.toLowerCase().contains(mensajesApp.toLowerCase())) {
                existeOcurrencia = Boolean.TRUE;
                break;
            }
        }
        if (existeOcurrencia) {
            MatcherAssert.assertThat(mensajeMostrado, containsString(mensajesApp));
        }
        return existeOcurrencia;
    }

    public void clicCrearNuevoContacto() {
        this.btnCrearNuevoContacto.click();
    }

    public void ElimnarContactoAsociado(String nombreContacto) {

        List<WebElementFacade> checkBoxes = withTimeoutOf(1, TimeUnit.SECONDS)
                .findAll("//img[contains(@class,'x-grid-checkcolumn')]");
        int cont = 0;
        for (WebElementFacade contacto : getListaContactos()) {
            cont += 1;
            if (((WebElementFacade) contacto).getText().split("\n")[1].toString().equals(nombreContacto)) {
                for (int i = 0 ; i < checkBoxes.size(); i++){
                    if (i == cont){
                        checkBoxes.get(cont-1).click();
                        btnEliminar.click();
                    }
                }
            }
        }
    }

    public void contactoEliminado(String contactoEliminado) {
        boolean noExiste = true;
        for (WebElementFacade contacto : getListaContactos()) {
            if (((WebElementFacade) contacto).getText().split("\n")[1].toString().equals(contactoEliminado)) {
                noExiste = false;
            }
        }
        MatcherAssert.assertThat("No existe el contacto",noExiste);
    }

}
