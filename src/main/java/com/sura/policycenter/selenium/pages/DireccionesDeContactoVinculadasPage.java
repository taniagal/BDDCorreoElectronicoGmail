package com.sura.policycenter.selenium.pages;

import com.google.common.base.Function;
import com.sura.guidewire.selenium.Guidewire;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class DireccionesDeContactoVinculadasPage extends PageObject {

    Guidewire guidewire = new Guidewire(getDriver());

    @FindBy(xpath = ".//*[@id='TabBar:SearchTab-btnInnerEl']")
    private WebElementFacade btnBuscar;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_AccountSearch']")
    private WebElementFacade btnCuentas;
    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:AccountNumber-inputEl']")
    private WebElementFacade txtNumeroCuenta;
    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade btnBuscarCuenta;
    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchResultsLV:0:AccountNumber']")
    private WebElementFacade grdNumeroCuenta;
    @FindBy(xpath = ".//*[@id='AccountFile:MenuLinks:AccountFile_AccountFile_Contacts']/div")
    private WebElementFacade mnuContactos;
    @FindBy(xpath = ".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV:7:Name']")
    private WebElementFacade grdContacto1;
    @FindBy(xpath = ".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV:2:Name']")
    private WebElementFacade grdContacto2;
    @FindBy(xpath = ".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV:6:Name']")
    private WebElementFacade grdContacto3;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:LinkAddressMenuMenuIcon']/img")
    private WebElementFacade btnAsociarDireccion;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail-arrowEl']")
    private WebElementFacade btnSeleccionar;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail:PrimaryAddress-textEl']")
    private WebElementFacade direccionContacto;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:Update-btnInnerEl']")
    private WebElementFacade btnActualizar;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:EditAddress']")
    private WebElementFacade btnEditarDireccion;
    @FindBy(xpath = ".//*[@id='LinkedAddressEditPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']")
    private WebElementFacade txtPais;
    @FindBy(xpath = ".//*[@id='LinkedAddressEditPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    private WebElementFacade txtDepartamento;
    @FindBy(xpath = ".//*[@id='LinkedAddressEditPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City_Ext-inputEl']")
    private WebElementFacade txtCiudad;
    @FindBy(xpath = ".//*[@id='LinkedAddressEditPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    private WebElementFacade txtDireccion;
    @FindBy(xpath = ".//*[@id='LinkedAddressEditPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl']")
    private WebElementFacade txtCodigoPostal;
    @FindBy(xpath = ".//*[@id='LinkedAddressEditPopup:AddressType-inputEl']")
    private WebElementFacade txtTipoDireccion;
    @FindBy(xpath = ".//*[@id='LinkedAddressEditPopup:AddressDescription-inputEl']")
    private WebElementFacade txtDescripcion;
    @FindBy(xpath = ".//*[@id='LinkedAddressEditPopup:UpdateAllButton-btnInnerEl']")
    private WebElementFacade btnActualizarDireccionesLigadas;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']")
    private WebElementFacade txtPaisContacto;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    private WebElementFacade txtDepartamentoContacto;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City_Ext-inputEl']")
    private WebElementFacade txtCiudadContacto;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    private WebElementFacade txtDireccionContacto;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-bodyEl']")
    private WebElementFacade txtCodigoPostalContacto;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressType-inputEl']")
    private WebElementFacade txtTipoDireccionContacto;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressDescription-bodyEl']")
    private WebElementFacade txtDescripcionContacto;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:Cancel-btnInnerEl']")
    private WebElementFacade btnCancelar;
    @FindBy(xpath = ".//*[@id='LinkedAddressEditPopup:LinkedAddressContactsLV-body']")
    private WebElementFacade tabla;
    @FindBy(xpath = ".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV-body']")
    private WebElementFacade tablaContactos;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    private WebElementFacade campoDireccionDetalleDirecciones;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    private WebElementFacade campoDireccionDetalle;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:Update-btnInnerEl']")
    private WebElementFacade botonActualizarContacto;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AddressesCardTab-btnInnerEl']")
    private WebElementFacade pestanaDirecciones;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:__crumb__']")
    private WebElementFacade linkVolverAContacto;
    @FindBy(xpath = "//span[contains(.,'Aceptar')]")
    private WebElementFacade botonAceptarMensaje;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']")
    private WebElementFacade campoPaisDetalle;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:Cancel-btnInnerEl']")
    private WebElementFacade botonCancelarContacto;
    @FindBy(xpath = ".//*[@id='LinkedAddressEditPopup:Cancel-btnInnerEl']")
    private WebElementFacade botonCancelarDetalle;

    public DireccionesDeContactoVinculadasPage(WebDriver driver) {
        super(driver);
    }


    public void buscarCuenta(String numeroCuenta) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(btnBuscar).waitUntilPresent();
        guidewire.waitUntil(2000);
        btnBuscar.click();
        btnCuentas = esperarElemento(".//*[@id='Search:MenuLinks:Search_AccountSearch']");
        btnCuentas.click();
        txtNumeroCuenta = esperarElemento(".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:AccountNumber-inputEl']");
        txtNumeroCuenta.sendKeys(numeroCuenta);
        btnBuscarCuenta = esperarElemento(".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']");
        btnBuscarCuenta.click();
        grdNumeroCuenta = esperarElemento(".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchResultsLV:0:AccountNumber']");
        grdNumeroCuenta.click();
        mnuContactos = esperarElemento(".//*[@id='AccountFile:MenuLinks:AccountFile_AccountFile_Contacts']/div");
        mnuContactos.click();
    }

    public void vincularDirecciones(String nombreContactoUno, String nombreContactoDos) {
        vincularDireccionAContacto(nombreContactoUno);
        vincularDireccionAContacto(nombreContactoDos);
        this.irAEditarDireccion(nombreContactoDos);
    }

    private void irAEditarDireccion(String nombreContactoDos) {
        this.seleccionarUnContacto(nombreContactoDos);
        WebElementFacade btnAsociarDireccion = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:LinkAddressMenuMenuIcon']/img");
        btnAsociarDireccion.click();
        btnEditarDireccion.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilPresent().click();
    }

    public void vincularDireccionAContacto(String nombreContacto) {
        Actions accion = new Actions(getDriver());
        seleccionarUnContacto(nombreContacto);
        WebElementFacade botonLaMismaDireccionQue = esperarElemento(".//img[@src='images/app/drop_button.png']");
        botonLaMismaDireccionQue.click();
        WebElementFacade menuContactoTitular = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail']");
        accion.moveToElement(menuContactoTitular).release(menuContactoTitular).build().perform();
        WebElementFacade menuContactoDireccionPrincipal = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail:PrimaryAddress']");
        accion.moveToElement(menuContactoDireccionPrincipal).release(menuContactoDireccionPrincipal).click().build().perform();
        WebElementFacade mensajeDireccionVinculada = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkedAddressWarningMessage']");
        WebElementFacade botonActualizar = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:Update-btnInnerEl']");
        botonActualizar.click();
    }

    public void validarInformacion(ExamplesTable resultadoModificacionDireccion) {
        txtPais.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilPresent();
        Map<String, String> exampleTable = resultadoModificacionDireccion.getRows().get(0);
        MatcherAssert.assertThat(this.txtPais.getValue(), Is.is(Matchers.equalTo(exampleTable.get("pais"))));
        MatcherAssert.assertThat(this.txtDepartamento.getValue(), Is.is(Matchers.equalTo(exampleTable.get("departamento"))));
        MatcherAssert.assertThat(this.txtCiudad.getValue(), Is.is(Matchers.equalTo(exampleTable.get("ciudad"))));
        MatcherAssert.assertThat(this.txtDireccion.getValue(), Is.is(Matchers.equalTo(exampleTable.get("direccion"))));
        MatcherAssert.assertThat(this.txtTipoDireccion.getValue(), Matchers.containsString(exampleTable.get("tipoDeDireccion")));
        MatcherAssert.assertThat(this.txtDescripcion.getValue(), Matchers.containsString(exampleTable.get("descripcion")));
    }

    public void filtrarPorInfoObligatoria() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(txtDescripcion).waitUntilPresent();
        txtDescripcion.clear();
        btnActualizarDireccionesLigadas.click();
    }

    public void seleccionarContacto() {
        seleccionarUnContacto("OSCAR GOMEZ");
        btnAsociarDireccion = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:LinkAddressMenuMenuIcon']/img");
        btnAsociarDireccion.click();
        btnEditarDireccion = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:EditAddress']");
        btnEditarDireccion.click();
    }

    public void validarInformacionContacto(ExamplesTable resultadoModificacionDireccion) {
        txtPaisContacto = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']");
        this.txtDireccionContacto.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilPresent();
        Map<String, String> exampleTable = resultadoModificacionDireccion.getRows().get(0);
        String paisContacto = this.txtPaisContacto.getText();
        String departamentoContacto = this.txtDepartamentoContacto.getText();
        String ciudadContacto = this.txtCiudadContacto.getText();
        String direccionContacto = this.txtDireccionContacto.getText();
        String tipoDireccionContacto = this.txtTipoDireccionContacto.getText();
        String descripcionContacto = this.txtDescripcionContacto.getText();

        WebElementFacade btnCancelar = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:Cancel-btnInnerEl']");
        btnCancelar.click();
        MatcherAssert.assertThat(paisContacto, Is.is(Matchers.equalTo(exampleTable.get("pais"))));
        MatcherAssert.assertThat(departamentoContacto, Is.is(Matchers.equalTo(exampleTable.get("departamento"))));
        MatcherAssert.assertThat(ciudadContacto, Is.is(Matchers.equalTo(exampleTable.get("ciudad"))));
        MatcherAssert.assertThat(direccionContacto, Is.is(Matchers.equalTo(exampleTable.get("direccion"))));
        MatcherAssert.assertThat(tipoDireccionContacto, Matchers.containsString(exampleTable.get("tipoDeDireccion")));
        MatcherAssert.assertThat(descripcionContacto, Matchers.containsString(exampleTable.get("descripcion")));
    }

    public void validarInfoContactosAsociadosADireccion(ExamplesTable contactosDireccionVinculada) {
        Map<String, String> contactosVinculados = contactosDireccionVinculada.getRows().get(0);
        List<WebElement> allRows = tabla.findElements(By.tagName("tr"));
        List<WebElement> cells;
        for (int i = 0; i < contactosVinculados.size() - 1; i++) {
            cells = allRows.get(i).findElements(By.tagName("td"));
            contactosVinculados = contactosDireccionVinculada.getRows().get(i);
            MatcherAssert.assertThat(cells.get(0).getText(), Is.is(Matchers.equalTo(contactosVinculados.get("nombre"))));
            MatcherAssert.assertThat(cells.get(1).getText(), Is.is(Matchers.equalTo(contactosVinculados.get("primaria"))));
            MatcherAssert.assertThat(cells.get(2).getText().replace(" ", ""), Is.is(Matchers.equalTo(contactosVinculados.get("telefono"))));
            MatcherAssert.assertThat(cells.get(3).getText(), Is.is(Matchers.notNullValue()));
        }
        WebElementFacade botonCancelarDetalles = esperarElemento(".//*[@id='LinkedAddressEditPopup:Cancel-btnInnerEl']");
        botonCancelarDetalles.click();
        linkVolverAContacto.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilPresent().click();
        botonAceptarMensaje.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilPresent().click();
    }

    public void editarDireccion(String direccion) {
        WebElementFacade campoDireccionDetalle = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']");
        campoDireccionDetalle.clear();
        campoDireccionDetalle.sendKeys(direccion);
        botonActualizarContacto.click();
    }

    public void editarDireccionEnPestaniaDirecciones(String direccion) {
        WebElementFacade pestanaDirecciones = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AddressesCardTab-btnInnerEl']");
        pestanaDirecciones.click();
        campoDireccionDetalleDirecciones.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilPresent().clear();
        campoDireccionDetalleDirecciones.sendKeys(direccion);
        botonActualizarContacto.click();
    }

    public void seleccionarUnContacto(String nombreContacto) {
        WebElementFacade contactoAEditar = esperarElemento(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV:" + encontrarContacto(nombreContacto).toString() + ":Name']");
        contactoAEditar.click();
    }

    public void validarLongitudDelCampoDireccion(String direccionOk) {
        this.seleccionarUnContacto("RICARDO GIRALDO");
        WebElementFacade campoDireccionDetalle = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']");
        Integer longitudCampo = campoDireccionDetalle.getValue().length();
        linkVolverAContacto.click();
        botonAceptarMensaje.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilPresent().click();
        waitForTextToAppear("Contactos de archivo de cuenta", 10000);
        MatcherAssert.assertThat(longitudCampo.toString(), Is.is(Matchers.equalTo(direccionOk)));
    }

    public void editarDireccionCampoPais(String pais) {
        WebElementFacade campoPais = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']");
        campoPais.clear();
        campoPais.sendKeys(pais);
        campoPais.sendKeys(Keys.ENTER);
    }

    public void validarElCampoDepartamento(String departamento) {
        int intentos = 0;
        WebElementFacade campoDepartamento = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']");

        while (intentos < 3) {
            try {
                if (campoDepartamento.getAttribute("value").equals(departamento)) {
                    MatcherAssert.assertThat(campoDepartamento.getValue(), Is.is(Matchers.equalTo(departamento)));
                    break;
                }
            } catch (StaleElementReferenceException elemento) {

            }
            intentos++;
        }
    }

    public void validarElCampoCiudad(String ciudad) {
        int intentos = 0;
        WebElementFacade campoCiudad = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City_Ext-inputEl']");

        while (intentos < 3) {
            try {
                if (campoCiudad.getAttribute("value").equals(ciudad)) {
                    MatcherAssert.assertThat(campoCiudad.getValue(), Is.is(Matchers.equalTo(ciudad)));
                    break;
                } else {
                    guidewire.waitUntil(1000);
                }
            } catch (StaleElementReferenceException elemento) {

            }
            intentos++;
        }
        WebElementFacade botonCancelar = findBy(".//*[@id='EditAccountContactPopup:ContactDetailScreen:Cancel-btnInnerEl']");
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(botonCancelar).waitUntilPresent().click();
        waitForTextToAppear("Contactos de archivo de cuenta", 10000);
    }

    public void validarDireccionEstandarizada(String direccionEstandarizada, String nombreContacto) {
        this.seleccionarUnContacto(nombreContacto);
        WebElementFacade campoDireccionContacto = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']");
        String getCampoDireccionContacto = campoDireccionContacto.getValue();
        linkVolverAContacto.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilPresent().click();
        botonAceptarMensaje.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilPresent().click();
        MatcherAssert.assertThat(getCampoDireccionContacto, Is.is(Matchers.equalTo(direccionEstandarizada)));
    }

    public void validarDireccionVinculada(String direccionVinculada, String nombreContacto) {
        this.seleccionarUnContacto(nombreContacto);
        WebElementFacade campoDireccionContacto = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']");
        MatcherAssert.assertThat(campoDireccionContacto.getText(), Is.is(Matchers.equalTo(direccionVinculada)));
        WebElementFacade botonCancelar = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:Cancel']");
        botonCancelar.click();
        WebElementFacade titulo = esperarElemento(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:ttlBar']");
    }

    public void seleccionarContactoAEditar(String nombreContacto) {
        this.seleccionarUnContacto(nombreContacto);
    }

    public void seleccionarEditarDireccionVinculada() {
        WebElementFacade botonCambiarA = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:LinkAddressMenuMenuIcon']/img");
        botonCambiarA.click();
        WebElementFacade botonEditarDireccionVinculada = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:EditAddress']");
        botonEditarDireccionVinculada.click();
    }

    public void editarDireccionVinculadaDelContacto(String direccion) {
        txtDireccion.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilPresent();
        txtDireccion.clear();
        txtDireccion.sendKeys(direccion);
        btnActualizarDireccionesLigadas.click();
        WebElementFacade botonActualizar = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:Update-btnInnerEl']");
        botonActualizar.click();
    }

    public void editarDireccionYDesligar(String direccion) {
        txtDireccion.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilPresent();
        txtDireccion.clear();
        txtDireccion.sendKeys(direccion);
        WebElementFacade botonActualizarDesligar = esperarElemento(".//*[@id='LinkedAddressEditPopup:UpdateAndUnlinkButton']");
        botonActualizarDesligar.click();
        btnActualizar.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilPresent().click();
    }

    public void validarDireccionDesvinculada(ExamplesTable contactosDireccionDesvinculada) {
        Map<String, String> contactosDesvinculados = contactosDireccionDesvinculada.getRows().get(0);
        this.validarDireccionEstandarizada(contactosDesvinculados.get("direccionDesligada"), contactosDesvinculados.get("contactoDesligado"));
        for (int i = 1; i < contactosDireccionDesvinculada.getRowCount(); i++) {
            contactosDesvinculados = contactosDireccionDesvinculada.getRows().get(i);
            this.validarDireccionVinculada(contactosDesvinculados.get("direccionDesligada"), contactosDesvinculados.get("contactoDesligado"));
        }
    }

    public Integer encontrarContacto(String nombreContacto) {
        tablaContactos = esperarElemento(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV-body']");
        Integer filaBoton = 0;
        List<WebElement> filas = tablaContactos.findElements(By.tagName("tr"));
        for (WebElement row : filas) {
            List<WebElement> columna = row.findElements(By.tagName("td"));
            if (columna.get(2).getText().equals(nombreContacto)) {
                return filaBoton;
            }
            filaBoton++;
        }
        return filaBoton;
    }


    public void seleccionarCrearContactoSecundarioPersonaNatural() {
        Actions accion = new Actions(getDriver());
        WebElementFacade botonCrearNuevoContacto = esperarElemento(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton-btnInnerEl']");
        botonCrearNuevoContacto.click();
        WebElementFacade opcionContactoSecundario = esperarElemento(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton:3:roleType']");
        accion.moveToElement(opcionContactoSecundario).release(opcionContactoSecundario).build().perform();
        WebElementFacade opcionNuevoContactoPersonaNatural = esperarElemento(".//span[contains(@id,'AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton:3:roleType:0:contactType-textEl')]");
        accion.moveToElement(opcionNuevoContactoPersonaNatural).release(opcionNuevoContactoPersonaNatural).click().build().perform();
    }

    public void desplegarListaDeContactosParaAsignarLaDireccion() {
        WebElementFacade botonLaMismaDireccionQue = esperarElemento(".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:LinkAddressMenuMenuIcon']/img");
        botonLaMismaDireccionQue.click();
    }

    public void validarContactosAsociados(ExamplesTable contactosAsociados) {
        Map<String, String> contactos;
        List<WebElementFacade> elementosContactosAsociados = findAll(".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:LinkAddressMenuMenuIcon-fieldMenu']");

        for (int i = 0; i < contactosAsociados.getRowCount(); i++) {
            contactos = contactosAsociados.getRows().get(i);
            if(elementosContactosAsociados.get(0).getText().contains(contactos.get("contactosAsociados"))){
                MatcherAssert.assertThat(elementosContactosAsociados.get(0).getText(), Matchers.containsString(contactos.get("contactosAsociados")));
            }
        }

        WebElementFacade menuContactoTitular = esperarElemento(".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail']");
        menuContactoTitular.click();
        WebElementFacade menuContactoDireccionPrincipal = esperarElemento(".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail:PrimaryAddress']");
        menuContactoDireccionPrincipal.click();
        WebElementFacade mensajeDireccionVinculada = esperarElemento(".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkedAddressWarningMessage']");
    }

    public void validarAsociacionDeDireccionAContactoSecundario(ExamplesTable direccionAsociada) {
        Map<String, String> direccionContacto = direccionAsociada.getRows().get(0);
        WebElementFacade campoPais = esperarElemento(".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']");
        WebElementFacade campoDepartamento = findBy(".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']");
        WebElementFacade campoCiudad = findBy(".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City_Ext-inputEl']");
        WebElementFacade campoDireccion = findBy(".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']");
        WebElementFacade campoTipoDireccion = findBy(".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressType-inputEl']");
        WebElementFacade campoDescripcion = findBy(".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressDescription-inputEl']");
        MatcherAssert.assertThat(campoPais.getText(), Is.is(Matchers.equalTo(direccionContacto.get("pais"))));
        MatcherAssert.assertThat(campoDepartamento.getText(), Is.is(Matchers.equalTo(direccionContacto.get("departamento"))));
        MatcherAssert.assertThat(campoCiudad.getText(), Is.is(Matchers.equalTo(direccionContacto.get("ciudad"))));
        MatcherAssert.assertThat(campoDireccion.getText(), Is.is(Matchers.equalTo(direccionContacto.get("direccion"))));
        MatcherAssert.assertThat(campoTipoDireccion.getText(), Is.is(Matchers.equalTo(direccionContacto.get("tipoDireccion"))));
        MatcherAssert.assertThat(campoDescripcion.getText(), Is.is(Matchers.equalTo(direccionContacto.get("descripcion"))));
    }


    public void validarEtiquetasDeLaVentana(String titulo, String botonLigagas, String botonDesligar) {
        WebElementFacade tituloDeVentana = esperarElemento(".//*[@id='LinkedAddressEditPopup:ttlBar']");
        WebElementFacade botonActualizarLigadas = esperarElemento(".//*[@id='LinkedAddressEditPopup:UpdateAllButton-btnInnerEl']");
        WebElementFacade botonActualizarDesligar = findBy(".//*[@id='LinkedAddressEditPopup:UpdateAndUnlinkButton-btnInnerEl']");
        WebElementFacade tituloEdicionDirecciones = findBy(".//*[@id='LinkedAddressEditPopup:EditAddress']");
        WebElementFacade botonCancelarEdidion = findBy(".//*[@id='LinkedAddressEditPopup:Cancel-btnInnerEl']");

        MatcherAssert.assertThat(tituloDeVentana.getText(), Is.is(Matchers.equalTo(titulo)));
        MatcherAssert.assertThat(tituloEdicionDirecciones.getText(), Is.is(Matchers.equalTo(titulo)));
        MatcherAssert.assertThat(botonActualizarLigadas.getText(), Is.is(Matchers.equalTo(botonLigagas)));
        MatcherAssert.assertThat(botonActualizarDesligar.getText(), Is.is(Matchers.equalTo(botonDesligar)));
        botonCancelarEdidion.click();

        WebElementFacade botonCancelarDetalle = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:Cancel-btnInnerEl']");
        botonCancelarDetalle.click();

        WebElementFacade pestaniaDirecciones = esperarElemento(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AddressesCardTab-btnInnerEl']");
        pestaniaDirecciones.click();

        WebElementFacade tituloPanelPestaniaDirecciones = esperarElemento(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AddressesPanelSet:0']");
        MatcherAssert.assertThat(tituloPanelPestaniaDirecciones.getText(), Is.is(Matchers.equalTo(titulo)));
    }

    public void editarDireccionSinEstandarizar(String direccionSinEstandarizar) {
        WebElementFacade campoDireccionDetalle = findBy(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']");
        campoDireccionDetalle.withTimeoutOf(15, TimeUnit.SECONDS).waitUntilPresent();
        campoDireccionDetalle.clear();
        campoDireccionDetalle.sendKeys(direccionSinEstandarizar);
        botonActualizarContacto.click();
    }

    public WebElementFacade esperarElemento(final String xpath) {
        Wait<WebDriver> espera = new FluentWait<WebDriver>(getDriver())
                .withTimeout(20, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class, StaleElementReferenceException.class);

        WebElementFacade elemento = espera.until(new Function<WebDriver, WebElementFacade>() {
            public WebElementFacade apply(WebDriver driver) {
                return findBy(xpath);
            }
        });

        return elemento;
    }
}
