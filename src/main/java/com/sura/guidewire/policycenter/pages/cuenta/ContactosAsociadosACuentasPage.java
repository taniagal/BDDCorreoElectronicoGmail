package com.sura.guidewire.policycenter.pages.cuenta;

import com.sura.guidewire.policycenter.resources.PageUtil;
import com.sura.guidewire.policycenter.utils.GwNavegacionUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ContactosAsociadosACuentasPage extends PageUtil {

    private static final String ASSERTMENUCREARNUEVOCONTACTO = "Elementos del menú encontrados";
    @FindBy(xpath = ".//*[@id='AccountFile:MenuLinks:AccountFile_AccountFile_Contacts']/div")
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
    @FindBy(xpath = ".//label[contains(@id,'AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:EmailAddress1-labelEl')]")
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
    @FindBy(xpath = ".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton']")
    private WebElementFacade btnCrearNuevoContacto;

    int combos = 0;
    public ContactosAsociadosACuentasPage(WebDriver driver) {
        super(driver);
    }

    public void consultarContactos() {
        waitFor(linkAccountFileAccountFileContacts);
        linkAccountFileAccountFileContacts.click();
    }

    public void existeEncabezadoDeTabla(ExamplesTable encabezados, String keyElement, String xPathElementos) {
        List<WebElementFacade> listEncabezados = withTimeoutOf(WAIT_TIME_15, TimeUnit.SECONDS).findAll(xPathElementos);
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
        contactos = withTimeoutOf(WAIT_TIME_15, TimeUnit.SECONDS).findAll(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV-body']/*/table/tbody/tr/td[3]");
        return contactos;
    }

    private List<WebElementFacade> getListaRolesFunciones() {
        List<WebElementFacade> rolesFunciones;
        rolesFunciones = withTimeoutOf(WAIT_TIME_15, TimeUnit.SECONDS).findAll(".//div[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV']/div/div/table/tbody/tr");
        return rolesFunciones;
    }

    private List<WebElementFacade> getListaDirecciones() {
        List<WebElementFacade> direcciones;
        direcciones = withTimeoutOf(WAIT_TIME_15, TimeUnit.SECONDS).findAll(".//div[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AddressesPanelSet_ref']/table/tbody/tr");
        return direcciones;
    }

    public void selecionarContacto(String posicion) {
        List<WebElementFacade> contactos = getListaContactos();
        contactos.get(Integer.parseInt(posicion)).click();
        waitUntil(WAIT_TIME_1000);
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
        waitUntil(WAIT_TIME_1000);
    }

    public void verificarDireccioneNoEsNulo() {
        List<WebElementFacade> direcciones = getListaDirecciones();
        MatcherAssert.assertThat("El contacto debe tener direcciones asignados", !direcciones.isEmpty());
        waitUntil(WAIT_TIME_1000);
    }

    public void existeOpcionesPorSubMenu(ExamplesTable opcionesPorRol, Boolean darClick) {
        MatcherAssert.assertThat(ASSERTMENUCREARNUEVOCONTACTO, GwNavegacionUtil.existenOpcionesPorMenuHastaSegundoNivel(getDriver(), Keys.RIGHT, "LINK", opcionesPorRol, darClick));
    }

    public Boolean esContactoAsociado(String nombreContacto) {
        Boolean esAsociado = Boolean.FALSE;
        for (WebElementFacade contacto : getListaContactos()) {
            if (contacto.getText().equals(nombreContacto)) {
                esAsociado = Boolean.TRUE;
                break;
            }
        }
        MatcherAssert.assertThat("El contacto se asocio a la cuenta exitosamente", esAsociado);
        return esAsociado;
    }

    @SuppressWarnings({"SameParameterValue", "UnusedReturnValue"})
    public Boolean validarOcurrenciaDeMensajeDeAplicacion(String idXpathDivMensajes, String mensajesApp) {
        Boolean existeOcurrencia = Boolean.FALSE;
        String mensajeMostrado = "";
        List<WebElementFacade> divsMensajes = withTimeoutOf(WAIT_TIME_1, TimeUnit.SECONDS).findAll(idXpathDivMensajes);
        for (WebElementFacade div : divsMensajes) {
            mensajeMostrado = div.getText();
            if (mensajeMostrado.toLowerCase().contains(mensajesApp.toLowerCase())) {
                existeOcurrencia = Boolean.TRUE;
                break;
            }
        }
        if (existeOcurrencia) {
            MatcherAssert.assertThat(mensajeMostrado, Matchers.containsString(mensajesApp));
        }
        return existeOcurrencia;
    }

    public void clicCrearNuevoContacto() {
        btnCrearNuevoContacto.click();
    }

    public void ElimnarContactoAsociado(String nombreContacto) {
        waitUntil(WAIT_TIME_2000);
        List<WebElementFacade> checkBoxes = withTimeoutOf(WAIT_TIME_10, TimeUnit.SECONDS)
                .findAll(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV-body']/*/table/tbody/tr/td[1]");
        combos = checkBoxes.size();
        int i = 0;
        for (WebElementFacade contacto : getListaContactos()) {
            if (contacto.getText().equals(nombreContacto)) {
                checkBoxes.get(i).click();
                btnEliminar.click();
                waitUntil(WAIT_TIME_1000);
                break;
            }
            i++;
        }
    }

    public void contactoEliminado(String contactoEliminado) {
        waitForTextToDisappear(contactoEliminado);
        int tablaSinDato = getLista(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV-body']/*/table/tbody/tr/td[1]").size();
        MatcherAssert.assertThat("No se borró el contacto", tablaSinDato < combos);
    }

}
