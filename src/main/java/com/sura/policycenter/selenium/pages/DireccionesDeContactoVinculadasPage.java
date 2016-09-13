package com.sura.policycenter.selenium.pages;

import com.sura.commons.selenium.Commons;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.StepInterceptor;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DireccionesDeContactoVinculadasPage extends PageObject {

    Commons commons = new Commons(getDriver());

    @FindBy(xpath = ".//*[@id='TabBar:SearchTab-btnInnerEl']")
    private WebElementFacade btnBuscar;
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
    @FindBy(xpath = ".//*[@id='LinkedAddressEditPopup:AddressType-inputEl']")
    private WebElementFacade txtTipoDireccion;
    @FindBy(xpath = ".//*[@id='LinkedAddressEditPopup:AddressDescription-inputEl']")
    private WebElementFacade txtDescripcion;
    @FindBy(xpath = ".//*[@id='LinkedAddressEditPopup:UpdateAllButton-btnInnerEl']")
    private WebElementFacade btnActualizarDireccionesLigadas;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    private WebElementFacade txtDepartamentoContacto;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City_Ext-inputEl']")
    private WebElementFacade txtCiudadContacto;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    private WebElementFacade txtDireccionContacto;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressType-inputEl']")
    private WebElementFacade txtTipoDireccionContacto;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressDescription-bodyEl']")
    private WebElementFacade txtDescripcionContacto;
    @FindBy(xpath = ".//*[@id='LinkedAddressEditPopup:LinkedAddressContactsLV-body']")
    private WebElementFacade tabla;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    private WebElementFacade campoDireccionDetalleDirecciones;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:Update-btnInnerEl']")
    private WebElementFacade botonActualizarContacto;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:__crumb__']")
    private WebElementFacade linkVolverAContacto;
    @FindBy(xpath = "//span[contains(.,'Aceptar')]")
    private WebElementFacade botonAceptarMensaje;
    @FindBy(xpath = ".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkedAddressWarningMessage']")
    private WebElementFacade mensajeDireccionVinculada;
    @FindBy(xpath = ".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:ttlBar']")
    private WebElementFacade titulo;


    private static final Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);
    private String XPATH_DIRECCION_DETALLE = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']";
    private String BOTON_ASOCIAR_DIRECCION = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:LinkAddressMenuMenuIcon']/img";
    private String BOTON_CANCELAR = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:Cancel-btnInnerEl']";

    public DireccionesDeContactoVinculadasPage(WebDriver driver) {
        super(driver);
    }

    public void irALosContactosDeLaCuenta() {
        WebElementFacade mnuContactos = commons.esperarElemento(".//*[@id='AccountFile:MenuLinks:AccountFile_AccountFile_Contacts']/div");
        mnuContactos.click();
    }

    public void vincularDirecciones(String nombreContactoUno, String nombreContactoDos) {
        vincularDireccionAContacto(nombreContactoUno);
        vincularDireccionAContacto(nombreContactoDos);
        this.irAEditarDireccion(nombreContactoDos);
    }

    private void irAEditarDireccion(String nombreContactoDos) {
        this.seleccionarUnContacto(nombreContactoDos);
        WebElementFacade btnAsociarDireccion = commons.esperarElemento(BOTON_ASOCIAR_DIRECCION);
        btnAsociarDireccion.click();
        btnEditarDireccion.waitUntilPresent().click();
    }

    public void vincularDireccionAContacto(String nombreContacto) {
        Actions accion = new Actions(getDriver());
        seleccionarUnContacto(nombreContacto);
        WebElementFacade botonLaMismaDireccionQue = commons.esperarElemento(".//img[@src='images/app/drop_button.png']");
        botonLaMismaDireccionQue.click();
        WebElementFacade menuContactoTitular = commons.esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail']");
        accion.moveToElement(menuContactoTitular).release(menuContactoTitular).build().perform();
        WebElementFacade menuContactoDireccionPrincipal = commons.esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail:PrimaryAddress']");
        accion.moveToElement(menuContactoDireccionPrincipal).release(menuContactoDireccionPrincipal).click().build().perform();
        waitForTextToAppear("Esta dirección está vinculada a otras direcciones");
        WebElementFacade botonActualizar = commons.esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:Update-btnInnerEl']");
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
        WebElementFacade btnAsociarDireccion = commons.esperarElemento(BOTON_ASOCIAR_DIRECCION);
        btnAsociarDireccion.click();
        btnEditarDireccion = commons.esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:EditAddress']");
        btnEditarDireccion.click();
    }

    public void validarInformacionContacto(ExamplesTable resultadoModificacionDireccion) {
        WebElementFacade txtPaisContacto = commons.esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']");
        this.txtDireccionContacto.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilPresent();
        Map<String, String> exampleTable = resultadoModificacionDireccion.getRows().get(0);
        String paisContacto = txtPaisContacto.getText();
        String departamentoContacto = this.txtDepartamentoContacto.getText();
        String ciudadContacto = this.txtCiudadContacto.getText();
        String direccionContacto = this.txtDireccionContacto.getText();
        String tipoDireccionContacto = this.txtTipoDireccionContacto.getText();
        String descripcionContacto = this.txtDescripcionContacto.getText();

        WebElementFacade btnCancelar = commons.esperarElemento(BOTON_CANCELAR);
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
        WebElementFacade botonCancelarDetalles = commons.esperarElemento(".//*[@id='LinkedAddressEditPopup:Cancel-btnInnerEl']");
        botonCancelarDetalles.click();
        linkVolverAContacto.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilPresent().click();
        botonAceptarMensaje.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilPresent().click();
    }

    public void editarDireccion(String direccion) {
        WebElementFacade campoDireccionDetalle = commons.esperarElemento(XPATH_DIRECCION_DETALLE);
        campoDireccionDetalle.clear();
        campoDireccionDetalle.sendKeys(direccion);
        botonActualizarContacto.click();
    }

    public void editarDireccionEnPestaniaDirecciones(String direccion) {
        WebElementFacade pestanaDirecciones = commons.esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AddressesCardTab-btnInnerEl']");
        pestanaDirecciones.click();
        campoDireccionDetalleDirecciones.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilPresent().clear();
        campoDireccionDetalleDirecciones.sendKeys(direccion);
        botonActualizarContacto.click();
    }

    public void seleccionarUnContacto(String nombreContacto) {
        WebElementFacade contactoAEditar = commons.esperarElemento(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV:" + encontrarContacto(nombreContacto).toString() + ":Name']");
        contactoAEditar.click();
    }

    public void validarLongitudDelCampoDireccion(String direccionOk) {
        this.seleccionarUnContacto("RICARDO GIRALDO");
        WebElementFacade campoDireccionDetalle = commons.esperarElemento(XPATH_DIRECCION_DETALLE);
        Integer longitudCampo = campoDireccionDetalle.getValue().length();
        linkVolverAContacto.click();
        botonAceptarMensaje.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilPresent().click();
        waitForTextToAppear("Contactos de archivo de cuenta", 10000);
        MatcherAssert.assertThat(longitudCampo.toString(), Is.is(Matchers.equalTo(direccionOk)));
    }

    public void editarDireccionCampoPais(String pais) {
        WebElementFacade campoPais = commons.esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']");
        campoPais.clear();
        campoPais.sendKeys(pais);
        campoPais.sendKeys(Keys.ENTER);
    }

    public void validarElCampoDepartamento(String departamento) {
        int intentos = 0;
        WebElementFacade campoDepartamento = commons.esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']");

        while (intentos < 3) {
            try {
                if (campoDepartamento.getAttribute("value").equals(departamento)) {
                    MatcherAssert.assertThat(campoDepartamento.getValue(), Is.is(Matchers.equalTo(departamento)));
                    break;
                }
            } catch (StaleElementReferenceException elemento) {
                LOGGER.info("El elemento campo departamento no ha sido encontrado " + elemento);
            }
            intentos++;
        }
    }

    public void validarElCampoCiudad(String ciudad) {
        int intentos = 0;
        WebElementFacade campoCiudad = commons.esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City_Ext-inputEl']");

        while (intentos < 3) {
            try {
                if (campoCiudad.getAttribute("value").equals(ciudad)) {
                    MatcherAssert.assertThat(campoCiudad.getValue(), Is.is(Matchers.equalTo(ciudad)));
                    break;
                } else {
                    commons.waitUntil(1000);
                }
            } catch (StaleElementReferenceException elemento) {
                LOGGER.info("El elemento campo ciudad no ha sido encontrado " + elemento);
            }
            intentos++;
        }
        WebElementFacade botonCancelar = findBy(BOTON_CANCELAR);
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(botonCancelar).waitUntilPresent().click();
        waitForTextToAppear("Contactos de archivo de cuenta", 10000);
    }

    public void validarDireccionEstandarizada(String direccionEstandarizada, String nombreContacto) {
        this.seleccionarUnContacto(nombreContacto);
        WebElementFacade campoDireccionContacto = commons.esperarElemento(XPATH_DIRECCION_DETALLE);
        String getCampoDireccionContacto = campoDireccionContacto.getValue();
        linkVolverAContacto.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilPresent().click();
        botonAceptarMensaje.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilPresent().click();
        MatcherAssert.assertThat(getCampoDireccionContacto, Is.is(Matchers.equalTo(direccionEstandarizada)));
    }

    public void validarDireccionVinculada(String direccionVinculada, String nombreContacto) {
        this.seleccionarUnContacto(nombreContacto);
        WebElementFacade campoDireccionContacto = commons.esperarElemento(XPATH_DIRECCION_DETALLE);
        MatcherAssert.assertThat(campoDireccionContacto.getText(), Is.is(Matchers.equalTo(direccionVinculada)));
        WebElementFacade botonCancelar = commons.esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:Cancel']");
        botonCancelar.click();
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(titulo).waitUntilPresent();
    }

    public void seleccionarContactoAEditar(String nombreContacto) {
        this.seleccionarUnContacto(nombreContacto);
    }

    public void seleccionarEditarDireccionVinculada() {
        WebElementFacade botonCambiarA = commons.esperarElemento(BOTON_ASOCIAR_DIRECCION);
        botonCambiarA.click();
        WebElementFacade botonEditarDireccionVinculada = commons.esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:EditAddress']");
        botonEditarDireccionVinculada.click();
    }

    public void editarDireccionVinculadaDelContacto(String direccion) {
        this.escribirDireccion(direccion);
        btnActualizarDireccionesLigadas.click();
        WebElementFacade botonActualizar = commons.esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:Update-btnInnerEl']");
        botonActualizar.click();
    }

    public void editarDireccionYDesligar(String direccion) {
        this.escribirDireccion(direccion);
        WebElementFacade botonActualizarDesligar = commons.esperarElemento(".//*[@id='LinkedAddressEditPopup:UpdateAndUnlinkButton']");
        botonActualizarDesligar.click();
        btnActualizar.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilPresent().click();
    }

    public void escribirDireccion(String direccion){
        txtDireccion.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilPresent();
        txtDireccion.clear();
        txtDireccion.sendKeys(direccion);
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
        WebElementFacade tablaContactos = commons.esperarElemento(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV-body']");
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
        WebElementFacade botonCrearNuevoContacto = commons.esperarElemento(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton-btnInnerEl']");
        botonCrearNuevoContacto.click();
        WebElementFacade opcionContactoSecundario = commons.esperarElemento(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton:3:roleType']");
        accion.moveToElement(opcionContactoSecundario).release(opcionContactoSecundario).build().perform();
        WebElementFacade opcionNuevoContactoPersonaNatural = commons.esperarElemento(".//span[contains(@id,'AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton:3:roleType:0:contactType-textEl')]");
        accion.moveToElement(opcionNuevoContactoPersonaNatural).release(opcionNuevoContactoPersonaNatural).click().build().perform();
    }

    public void desplegarListaDeContactosParaAsignarLaDireccion() {
        WebElementFacade botonLaMismaDireccionQue = commons.esperarElemento(".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:LinkAddressMenuMenuIcon']/img");
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

        WebElementFacade menuContactoTitular = commons.esperarElemento(".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail']");
        menuContactoTitular.click();
        WebElementFacade menuContactoDireccionPrincipal = commons.esperarElemento(".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail:PrimaryAddress']");
        menuContactoDireccionPrincipal.click();
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(mensajeDireccionVinculada).waitUntilPresent();
    }

    public void validarAsociacionDeDireccionAContactoSecundario(ExamplesTable direccionAsociada) {
        Map<String, String> direccionContacto = direccionAsociada.getRows().get(0);
        WebElementFacade campoPais = commons.esperarElemento(".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']");
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
        WebElementFacade tituloDeVentana = commons.esperarElemento(".//*[@id='LinkedAddressEditPopup:ttlBar']");
        WebElementFacade botonActualizarLigadas = commons.esperarElemento(".//*[@id='LinkedAddressEditPopup:UpdateAllButton-btnInnerEl']");
        WebElementFacade botonActualizarDesligar = findBy(".//*[@id='LinkedAddressEditPopup:UpdateAndUnlinkButton-btnInnerEl']");
        WebElementFacade tituloEdicionDirecciones = findBy(".//*[@id='LinkedAddressEditPopup:EditAddress']");
        WebElementFacade botonCancelarEdidion = findBy(".//*[@id='LinkedAddressEditPopup:Cancel-btnInnerEl']");

        MatcherAssert.assertThat(tituloDeVentana.getText(), Is.is(Matchers.equalTo(titulo)));
        MatcherAssert.assertThat(tituloEdicionDirecciones.getText(), Is.is(Matchers.equalTo(titulo)));
        MatcherAssert.assertThat(botonActualizarLigadas.getText(), Is.is(Matchers.equalTo(botonLigagas)));
        MatcherAssert.assertThat(botonActualizarDesligar.getText(), Is.is(Matchers.equalTo(botonDesligar)));
        botonCancelarEdidion.click();

        WebElementFacade botonCancelarDetalle = commons.esperarElemento(BOTON_CANCELAR);
        botonCancelarDetalle.click();

        WebElementFacade pestaniaDirecciones = commons.esperarElemento(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AddressesCardTab-btnInnerEl']");
        pestaniaDirecciones.click();

        WebElementFacade tituloPanelPestaniaDirecciones = commons.esperarElemento(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AddressesPanelSet:0']");
        MatcherAssert.assertThat(tituloPanelPestaniaDirecciones.getText(), Is.is(Matchers.equalTo(titulo)));
    }

    public void editarDireccionSinEstandarizar(String direccionSinEstandarizar) {
        WebElementFacade campoDireccionDetalle = findBy(XPATH_DIRECCION_DETALLE);
        campoDireccionDetalle.withTimeoutOf(15, TimeUnit.SECONDS).waitUntilPresent();
        campoDireccionDetalle.clear();
        campoDireccionDetalle.sendKeys(direccionSinEstandarizar);
        botonActualizarContacto.click();
    }
}