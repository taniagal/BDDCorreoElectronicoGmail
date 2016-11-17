package com.sura.guidewire.policycenter.pages.contacto;

import com.sura.guidewire.policycenter.resources.PageUtil;

import java.util.List;
import java.util.Map;

import net.serenitybdd.core.annotations.findby.By;
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


public class DireccionesDeContactoVinculadasPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:Update-botonInnerEl']")
    private WebElementFacade botonActualizar;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:EditAddress']")
    private WebElementFacade botonEditarDireccion;
    @FindBy(xpath = ".//*[@id='LinkedAddressEditPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']")
    private WebElementFacade campoTxtPais;
    @FindBy(xpath = ".//*[@id='LinkedAddressEditPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    private WebElementFacade campoTxtDepartamento;
    @FindBy(xpath = ".//*[@id='LinkedAddressEditPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Sura_City-inputEl']")
    private WebElementFacade campoTxtCiudad;
    @FindBy(xpath = ".//*[@id='LinkedAddressEditPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    private WebElementFacade campoTxtDireccion;
    @FindBy(xpath = ".//*[@id='LinkedAddressEditPopup:AddressType-inputEl']")
    private WebElementFacade campoTxtTipoDireccion;
    @FindBy(xpath = ".//*[@id='LinkedAddressEditPopup:AddressDescription-inputEl']")
    private WebElementFacade campoTxtDescripcion;
    @FindBy(xpath = ".//*[@id='LinkedAddressEditPopup:UpdateAllButton-botonInnerEl']")
    private WebElementFacade botonActualizarDireccionesLigadas;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    private WebElementFacade campoTxtDepartamentoContacto;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Sura_City-inputEl']")
    private WebElementFacade campoTxtCiudadContacto;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    private WebElementFacade campoTxtDireccionContacto;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressType-inputEl']")
    private WebElementFacade campoTxtTipoDireccionContacto;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressDescription-bodyEl']")
    private WebElementFacade campoTxtDescripcionContacto;
    @FindBy(xpath = ".//*[@id='LinkedAddressEditPopup:LinkedAddressContactsLV-body']")
    private WebElementFacade tabla;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    private WebElementFacade campoDireccionDetalleDirecciones;
    @FindBy(xpath = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:Update-botonInnerEl']")
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
    private static final String XPATH_DIRECCION_DETALLE = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']";
    private static final String XPATH_BOTON_ASOCIAR_DIRECCION = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:LinkAddressMenuMenuIcon']/img";
    private static final String XPATH_BOTON_CANCELAR = ".//*[@id='EditAccountContactPopup:ContactDetailScreen:Cancel-botonInnerEl']";
    private static final String DEPARTAMENTO = "departamento";
    private static final String CIUDAD = "ciudad";
    private static final String DIRECCION = "direccion";
    private static final String DESCRIPCION = "descripcion";
    private static final String PAIS = "pais";
    private static final String TIPO_DIRECCION = "tipoDireccion";
    private static final int WAIT_TIME_10000 = 10000;
    private static final int CONSTANTE_3 = 3;
    private static final int CONSTANTE_2 = 2;


    public DireccionesDeContactoVinculadasPage(WebDriver driver) {
        super(driver);
    }

    public void irALosContactosDeLaCuenta() {
        WebElementFacade mnuContactos = esperarElemento(".//*[@id='AccountFile:MenuLinks:AccountFile_AccountFile_Contacts']/div");
        mnuContactos.click();
    }

    public void vincularDirecciones(String nombreContactoUno, String nombreContactoDos) {
        vincularDireccionAContacto(nombreContactoUno);
        vincularDireccionAContacto(nombreContactoDos);
        this.irAEditarDireccion(nombreContactoDos);
    }

    private void irAEditarDireccion(String nombreContactoDos) {
        this.seleccionarUnContacto(nombreContactoDos);
        WebElementFacade botonAsociarDireccion = esperarElemento(XPATH_BOTON_ASOCIAR_DIRECCION);
        botonAsociarDireccion.click();
        botonEditarDireccion.waitUntilPresent().click();
    }

    public void vincularDireccionAContacto(String nombreContacto) {
        Actions accion = new Actions(getDriver());
        seleccionarUnContacto(nombreContacto);
        WebElementFacade botonLaMismaDireccionQue = esperarElemento(".//img[@src='images/app/drop_button.png']");
        botonLaMismaDireccionQue.click();
        WebElementFacade menuContactoTitular = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail']");
        accion.moveToElement(menuContactoTitular).release(menuContactoTitular).build().perform();
        WebElementFacade menuContactoDireccionPrincipal = esperarElemento(".//*[@id='EditAccountPopup:EditAccountScreen:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail']");
        accion.moveToElement(menuContactoDireccionPrincipal).release(menuContactoDireccionPrincipal).click().build().perform();
        waitForTextToAppear("Esta dirección está vinculada a otras direcciones");
        botonActualizar.click();
    }

    public void validarInformacion(ExamplesTable resultadoModificacionDireccion) {
        waitFor(campoTxtPais).waitUntilPresent();
        Map<String, String> exampleTable = resultadoModificacionDireccion.getRows().get(0);
        MatcherAssert.assertThat(this.campoTxtPais.getValue(), Is.is(Matchers.equalTo(exampleTable.get(PAIS))));
        MatcherAssert.assertThat(this.campoTxtDepartamento.getValue(), Is.is(Matchers.equalTo(exampleTable.get(DEPARTAMENTO))));
        MatcherAssert.assertThat(this.campoTxtCiudad.getValue(), Is.is(Matchers.equalTo(exampleTable.get(CIUDAD))));
        MatcherAssert.assertThat(this.campoTxtDireccion.getValue(), Is.is(Matchers.equalTo(exampleTable.get(DIRECCION))));
        MatcherAssert.assertThat(this.campoTxtTipoDireccion.getValue(), Matchers.containsString(exampleTable.get("tipoDeDireccion")));
        MatcherAssert.assertThat(this.campoTxtDescripcion.getValue(), Matchers.containsString(exampleTable.get(DESCRIPCION)));
    }

    public void filtrarPorInfoObligatoria() {
        waitFor(campoTxtDescripcion).waitUntilPresent();
        campoTxtDescripcion.clear();
        botonActualizarDireccionesLigadas.click();
    }

    public void seleccionarContacto() {
        seleccionarUnContacto("OSCAR GOMEZ");
        WebElementFacade botonAsociarDireccion = esperarElemento(XPATH_BOTON_ASOCIAR_DIRECCION);
        botonAsociarDireccion.click();
        botonEditarDireccion = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:EditAddress']");
        botonEditarDireccion.click();
    }

    public void validarInformacionContacto(ExamplesTable resultadoModificacionDireccion) {
        WebElementFacade campoTxtPaisContacto = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']");
        this.waitFor(campoTxtDireccionContacto).waitUntilPresent();
        Map<String, String> exampleTable = resultadoModificacionDireccion.getRows().get(0);
        String paisContacto = campoTxtPaisContacto.getText();
        String departamentoContacto = this.campoTxtDepartamentoContacto.getText();
        String ciudadContacto = this.campoTxtCiudadContacto.getText();
        String direccionContacto = this.campoTxtDireccionContacto.getText();
        String tipoDireccionContacto = this.campoTxtTipoDireccionContacto.getText();
        String descripcionContacto = this.campoTxtDescripcionContacto.getText();
        this.clicEnBotonCancelar();
        MatcherAssert.assertThat(paisContacto, Is.is(Matchers.equalTo(exampleTable.get(PAIS))));
        MatcherAssert.assertThat(departamentoContacto, Is.is(Matchers.equalTo(exampleTable.get(DEPARTAMENTO))));
        MatcherAssert.assertThat(ciudadContacto, Is.is(Matchers.equalTo(exampleTable.get(CIUDAD))));
        MatcherAssert.assertThat(direccionContacto, Is.is(Matchers.equalTo(exampleTable.get(DIRECCION))));
        MatcherAssert.assertThat(tipoDireccionContacto, Matchers.containsString(exampleTable.get("tipoDeDireccion")));
        MatcherAssert.assertThat(descripcionContacto, Matchers.containsString(exampleTable.get(DESCRIPCION)));
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
            MatcherAssert.assertThat(cells.get(CONSTANTE_2).getText().replace(" ", ""), Is.is(Matchers.equalTo(contactosVinculados.get("telefono"))));
            MatcherAssert.assertThat(cells.get(CONSTANTE_3).getText(), Is.is(Matchers.notNullValue()));
        }
        WebElementFacade botonCancelarDetalles = esperarElemento(".//*[@id='LinkedAddressEditPopup:Cancel-botonInnerEl']");
        botonCancelarDetalles.click();
        waitFor(linkVolverAContacto).waitUntilPresent().click();
        waitFor(botonAceptarMensaje).waitUntilPresent().click();
    }

    public void editarDireccion(String direccion) {
        WebElementFacade campoDireccionDetalle = esperarElemento(XPATH_DIRECCION_DETALLE);
        campoDireccionDetalle.clear();
        campoDireccionDetalle.sendKeys(direccion);
        botonActualizarContacto.click();
    }

    public void editarDireccionEnPestaniaDirecciones(String direccion) {
        WebElementFacade pestanaDirecciones = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AddressesCardTab-botonInnerEl']");
        pestanaDirecciones.click();
        waitFor(campoDireccionDetalleDirecciones).waitUntilPresent().clear();
        waitFor(campoDireccionDetalleDirecciones).sendKeys(direccion);
        waitFor(botonActualizarContacto).click();
    }

    public void seleccionarUnContacto(String nombreContacto) {
        WebElementFacade contactoAEditar = esperarElemento(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV:" + encontrarContacto(nombreContacto).toString() + ":Name']");
        contactoAEditar.click();
    }

    public void validarLongitudDelCampoDireccion(String direccionOk) {
        this.seleccionarUnContacto("RICARDO GIRALDO");
        WebElementFacade campoDireccionDetalle = esperarElemento(XPATH_DIRECCION_DETALLE);
        Integer longitudCampo = campoDireccionDetalle.getValue().length();
        linkVolverAContacto.click();
        waitFor(botonAceptarMensaje).waitUntilPresent().click();
        waitForTextToAppear("Contactos de archivo de cuenta");
        MatcherAssert.assertThat(longitudCampo.toString(), Is.is(Matchers.equalTo(direccionOk)));
    }

    public void editarDireccionCampoPais(String pais) {
        WebElementFacade campoPais = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']");
        campoPais.clear();
        campoPais.sendKeys(pais);
        campoPais.sendKeys(Keys.ENTER);
    }

    public void validarElCampoDepartamento(String departamento) {
        WebElementFacade campoDepartamento = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']");
        this.ingresarDatoEnCombo(campoDepartamento, departamento);
    }

    public void validarElCampoCiudad(String ciudad) {
        WebElementFacade campoCiudad = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City_Ext-inputEl']");
        this.ingresarDatoEnCombo(campoCiudad, ciudad);

        this.clicEnBotonCancelar();
        waitForTextToAppear("Contactos de archivo de cuenta");
    }

    public void clicEnBotonCancelar(){
        WebElementFacade botonCancelar = esperarElemento(XPATH_BOTON_CANCELAR);
        waitFor(botonCancelar).click();
    }

    public void ingresarDatoEnCombo(WebElementFacade combo, String dato) {
        int intentos = 0;
        while (intentos < CONSTANTE_3) {
            try {
                if (combo.getAttribute("value").equals(dato)) {
                    MatcherAssert.assertThat(combo.getValue(), Is.is(Matchers.equalTo(dato)));
                    break;
                } else {
                    waitUntil(WAIT_TIME_1000);
                }
            } catch (StaleElementReferenceException elemento) {
                LOGGER.info("El elemento no ha sido encontrado " + elemento);
            }
            intentos++;
        }
        WebElementFacade botonCancelar = findBy(".//*[@id='EditAccountContactPopup:ContactDetailScreen:Cancel-botonInnerEl']");
        waitFor(botonCancelar).waitUntilPresent().click();
        waitForTextToAppear("Contactos de archivo de cuenta", WAIT_TIME_10000);
    }

    public void validarDireccionEstandarizada(String direccionEstandarizada, String nombreContacto) {
        this.seleccionarUnContacto(nombreContacto);
        WebElementFacade campoDireccionContacto = esperarElemento(XPATH_DIRECCION_DETALLE);
        String getCampoDireccionContacto = campoDireccionContacto.getValue();
        waitFor(linkVolverAContacto).waitUntilPresent().click();
        waitFor(botonAceptarMensaje).waitUntilPresent().click();
        MatcherAssert.assertThat(getCampoDireccionContacto, Is.is(Matchers.equalTo(direccionEstandarizada)));
    }

    public void validarDireccionVinculada(String direccionVinculada, String nombreContacto) {
        this.seleccionarUnContacto(nombreContacto);
        WebElementFacade campoDireccionContacto = esperarElemento(XPATH_DIRECCION_DETALLE);
        MatcherAssert.assertThat(campoDireccionContacto.getText(), Is.is(Matchers.equalTo(direccionVinculada)));
        WebElementFacade botonCancelar = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:Cancel']");
        botonCancelar.click();
        waitFor(titulo).waitUntilPresent();
    }

    public void seleccionarContactoAEditar(String nombreContacto) {
        this.seleccionarUnContacto(nombreContacto);
    }

    public void seleccionarEditarDireccionVinculada() {
        WebElementFacade botonCambiarA = esperarElemento(XPATH_BOTON_ASOCIAR_DIRECCION);
        botonCambiarA.click();
        WebElementFacade botonEditarDireccionVinculada = esperarElemento(".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:EditAddress']");
        botonEditarDireccionVinculada.click();
    }

    public void editarDireccionVinculadaDelContacto(String direccion) {
        this.escribirEnElCampo(direccion, campoTxtDireccion);
        botonActualizarDireccionesLigadas.click();
        botonActualizar.click();
    }

    public void editarDireccionYDesligar(String direccion) {
        this.escribirEnElCampo(direccion, campoTxtDireccion);
        WebElementFacade botonActualizarDesligar = esperarElemento(".//*[@id='LinkedAddressEditPopup:UpdateAndUnlinkButton']");
        botonActualizarDesligar.click();
        botonActualizar.waitUntilPresent().click();
    }

    public void escribirEnElCampo(String direccion, WebElementFacade campo) {
        waitFor(campo).waitUntilPresent();
        campo.clear();
        campo.sendKeys(direccion);
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
        WebElementFacade tablaContactos = esperarElemento(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV-body']");
        Integer filaBoton = 0;
        List<WebElement> filas = tablaContactos.findElements(By.tagName("tr"));
        for (WebElement row : filas) {
            List<WebElement> columna = row.findElements(By.tagName("td"));
            if (columna.get(CONSTANTE_2).getText().equals(nombreContacto)) {
                return filaBoton;
            }
            filaBoton++;
        }
        return filaBoton;
    }


    public void seleccionarCrearContactoSecundarioPersonaNatural() {
        Actions accion = new Actions(getDriver());
        WebElementFacade botonCrearNuevoContacto = esperarElemento(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV_tb:addContactButton-botonInnerEl']");
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
            if (elementosContactosAsociados.get(0).getText().contains(contactos.get("contactosAsociados"))) {
                MatcherAssert.assertThat(elementosContactosAsociados.get(0).getText(), Matchers.containsString(contactos.get("contactosAsociados")));
            }
        }

        WebElementFacade menuContactoTitular = esperarElemento(".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail']");
        menuContactoTitular.click();
        WebElementFacade menuContactoDireccionPrincipal = esperarElemento(".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail:PrimaryAddress']");
        menuContactoDireccionPrincipal.click();
        waitFor(mensajeDireccionVinculada).waitUntilPresent();
    }

    public void validarAsociacionDeDireccionAContactoSecundario(ExamplesTable direccionAsociada) {
        Map<String, String> direccionContacto = direccionAsociada.getRows().get(0);
        WebElementFacade campoPais = esperarElemento(".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']");
        WebElementFacade campoDepartamento = findBy(".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']");
        WebElementFacade campoCiudad = findBy(".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Sura_City-inputEl']");
        WebElementFacade campoDireccion = findBy(".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']");
        WebElementFacade campoTipoDireccion = findBy(".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressType-inputEl']");
        WebElementFacade campoDescripcion = findBy(".//*[@id='NewAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressDescription-inputEl']");
        MatcherAssert.assertThat(campoPais.getText(), Is.is(Matchers.equalTo(direccionContacto.get(PAIS))));
        MatcherAssert.assertThat(campoDepartamento.getText(), Is.is(Matchers.equalTo(direccionContacto.get(DEPARTAMENTO))));
        MatcherAssert.assertThat(campoCiudad.getText(), Is.is(Matchers.equalTo(direccionContacto.get(CIUDAD))));
        MatcherAssert.assertThat(campoDireccion.getText(), Is.is(Matchers.equalTo(direccionContacto.get(DIRECCION))));
        MatcherAssert.assertThat(campoTipoDireccion.getText(), Is.is(Matchers.equalTo(direccionContacto.get(TIPO_DIRECCION))));
        MatcherAssert.assertThat(campoDescripcion.getText(), Is.is(Matchers.equalTo(direccionContacto.get(DESCRIPCION))));
    }

    public void validarEtiquetasDeLaVentana(String titulo, String botonLigagas, String botonDesligar) {
        WebElementFacade tituloDeVentana = esperarElemento(".//*[@id='LinkedAddressEditPopup:ttlBar']");
        WebElementFacade botonActualizarLigadas = esperarElemento(".//*[@id='LinkedAddressEditPopup:UpdateAllButton-botonInnerEl']");
        WebElementFacade botonActualizarDesligar = findBy(".//*[@id='LinkedAddressEditPopup:UpdateAndUnlinkButton-botonInnerEl']");
        WebElementFacade tituloEdicionDirecciones = findBy(".//*[@id='LinkedAddressEditPopup:EditAddress']");
        WebElementFacade botonCancelarEdidion = findBy(".//*[@id='LinkedAddressEditPopup:Cancel-botonInnerEl']");

        MatcherAssert.assertThat(tituloDeVentana.getText(), Is.is(Matchers.equalTo(titulo)));
        MatcherAssert.assertThat(tituloEdicionDirecciones.getText(), Is.is(Matchers.equalTo(titulo)));
        MatcherAssert.assertThat(botonActualizarLigadas.getText(), Is.is(Matchers.equalTo(botonLigagas)));
        MatcherAssert.assertThat(botonActualizarDesligar.getText(), Is.is(Matchers.equalTo(botonDesligar)));
        botonCancelarEdidion.click();

        this.clicEnBotonCancelar();

        WebElementFacade pestaniaDirecciones = esperarElemento(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AddressesCardTab-botonInnerEl']");
        pestaniaDirecciones.click();

        WebElementFacade tituloPanelPestaniaDirecciones = esperarElemento(".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactCV:AddressesPanelSet:0']");
        MatcherAssert.assertThat(tituloPanelPestaniaDirecciones.getText(), Is.is(Matchers.equalTo(titulo)));
    }

    public void editarDireccionSinEstandarizar(String direccionSinEstandarizar) {
        WebElementFacade campoDireccionDetalle = findBy(XPATH_DIRECCION_DETALLE);
        this.escribirEnElCampo(direccionSinEstandarizar, campoDireccionDetalle);
        botonActualizarContacto.click();
    }
}
