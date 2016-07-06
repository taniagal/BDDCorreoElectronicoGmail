package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.LoggerFactory;


import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class BusquedaContactoPage extends Guidewire {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(BusquedaContactoPage.class);
    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:ContactType-inputEl']")
    private WebElementFacade tipoContact;
    @FindBy(xpath = ".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalContactNameInputSet:Name-inputEl']")
    private WebElementFacade txtNombreEmpresa;
    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    private WebElementFacade txtNombre;
    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:LastName-inputEl']")
    private WebElementFacade txtApellido;
    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:MiddleName-inputEl']")
    private WebElementFacade txtSegNombre;
    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:Particle-inputEl']")
    private WebElementFacade txtSegApellido;
    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalContactNameInputSet:Name-inputEl']")
    private WebElementFacade nombreEmpresaContact;
    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade botonBuscar;
    @FindBy(xpath="//tr[3]/td/table/tbody/tr/td[2]/input\n")
    private WebElementFacade txtRazonSocial;
    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:ContactSearchResultsLV:_RecordCount']")
    private WebElementFacade msjSinRegistros;
    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:SearchWarningMessagePanelSet:SearchWarningMessage']")
    private WebElementFacade msjSinCriterios;
    @FindBy(xpath="//li[2]")
    private WebElementFacade itmNIT;
    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:DocumentType-inputEl']")
    private WebElementFacade txtTipoDoc;
    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:identificationNumber-inputEl']")
    private WebElementFacade txtNumDoc;
    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalContactNameInputSet:CommercialName-inputEl']")
    private WebElementFacade txtNombreComercial;
    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    private WebElementFacade nombreContact;
    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:LastName-inputEl']")
    private WebElementFacade apellidoContact;
    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:ContactSearchResultsLV:0:DocumentType']")
    private WebElementFacade selectContact;
    @FindBy(xpath="//div[3]/div/table")
    private WebElementFacade table;
    @FindBy(xpath=".//*[@id='Login:LoginScreen:LoginDV:submit-btnInnerEl']")
    private WebElementFacade submit;
    @FindBy(xpath=".//*[@id='Login:LoginScreen:LoginDV:username-inputEl']")
    private WebElementFacade txtusuario;
    @FindBy(xpath=".//*[@id='Login:LoginScreen:LoginDV:password-inputEl']")
    private WebElementFacade txtcontrasena;
    @FindBy(xpath=".//div/div/div[2]/div/span")
    private WebElementFacade lblTipoId;
    @FindBy(xpath=".//div/div/div[3]/div/span")
    private WebElementFacade lblNumId;
    @FindBy(xpath=".//div[4]/div/span")
    private WebElementFacade lblPrimNombre;
    @FindBy(xpath=".//div/div/div[5]/div/span")
    private WebElementFacade lblSegNombre;
    @FindBy(xpath=".//div[6]/div/span")
    private WebElementFacade lblPriApellido;
    @FindBy(xpath=".//div[7]/div/span")
    private WebElementFacade lblSegApellido;
    @FindBy(xpath=".//div[8]/div/span")
    private WebElementFacade lblNomComercial;
    @FindBy(xpath=".//div[9]/div/span")
    private WebElementFacade lblRazonSocial;
    @FindBy(xpath=".//div[10]/div/span")
    private WebElementFacade lblDireccion;
    @FindBy(xpath=".//div[11]/div/span")
    private WebElementFacade lblTelefono;
    @FindBy(xpath=".//div[12]/div/span")
    private WebElementFacade lblEmail;
    @FindBy(xpath=".//div[13]/div/span")
    private WebElementFacade lblExterna;
    @FindBy(xpath=".//td/div/table/tbody/tr/td/div/table/tbody/tr[3]/td", timeoutInSeconds ="10")
    private WebElementFacade divNombre;
    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:ContactSearchResultsLV:0:DocumentType']")
    private WebElementFacade primerElementoTabla;
    @FindBy(xpath="//td/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")
    private WebElementFacade botonTipoDoc;

    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:DocumentType-inputEl']")
    private WebElementFacade txtTipoDocDirectorioCotizacion;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:identificationNumber-inputEl']")
    private WebElementFacade txtNumDocDirectorioCotizacion;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade btnBuscarDirectorioCotizacion;

    public BusquedaContactoPage(WebDriver driver) {
        super(driver);
    }


    public void login(String usuario, String contrasena){
        txtusuario.type(usuario);
        txtcontrasena.type(contrasena);
        submit.click();
    }

    public void buscarContacto(String tipoContacto, String nombre, String apellido){
        tipoContact.waitUntilClickable();
        tipoContact.type(tipoContacto);
        tipoContact.sendKeys(Keys.ENTER);
        waitABit(1000);
        if ("Personal".equals(tipoContacto)){
            nombreContact.type(nombre);
            apellidoContact.type(apellido);
        }else{
            nombreEmpresaContact.type(nombre);
        }
        botonBuscar.click();
        selectContact.waitUntilPresent();
        selectContact.waitUntilVisible();
        selectContact.click();
    }

    public void buscarContactoPersonaSinVerDetalle(String tipoDoc, String nombre, String apellido) {
        tipoContact.type("Personal");
        tipoContact.sendKeys(Keys.ENTER);
        txtTipoDoc.type(tipoDoc);
        nombreContact.type(nombre);
        apellidoContact.type(apellido);
    }

	public void buscarContactoPersona(String nombre, String apellido){
        tipoContact.type("Personal");
        tipoContact.sendKeys(Keys.ENTER);
        nombreContact.type(nombre);
        apellidoContact.type(apellido);
        botonBuscar.click();
        selectContact.waitUntilPresent();
        selectContact.waitUntilVisible();
        selectContact.click();
    }

    public void consultarPersonaJuridaPorRazonSocial(String tipoDoc, String razonSocial){
        waitForTextToAppear("Búsqueda de contactos",2000);
        waitFor(txtTipoDoc).shouldBeVisible();
        txtTipoDoc.type(tipoDoc);
        txtTipoDoc.sendKeys(Keys.ENTER);
        waitFor(txtRazonSocial).shouldBeVisible();
        txtRazonSocial.type(razonSocial);
        waitFor(botonBuscar).shouldBeVisible();
        botonBuscar.click();
    }

    public void validarInformacionTipoId() {
        waitABit(1500);
        String msjSinReg = "No hay datos para mostrar";
        waitForTextToAppear(msjSinReg, 2000);
        assertThat(msjSinRegistros.getText(),is(equalTo(msjSinReg)));
    }

    public void validarMensaje(String msjVal) {
        waitForTextToAppear(msjVal, 2000);
        waitFor(msjSinCriterios).shouldBeVisible();
        assertThat(msjSinCriterios.getText(),is(equalTo(msjVal)));
    }

    public void consultarContactoNumDoc(String tipoDoc, String numDoc) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(txtTipoDoc).shouldBePresent();
        txtTipoDoc.clear();
        txtTipoDoc.sendKeys(tipoDoc);
        txtTipoDoc.sendKeys(Keys.ENTER);
        txtRazonSocial.waitUntilPresent();
        txtNumDoc.type(numDoc);
        botonBuscar.waitUntilEnabled();
        botonBuscar.click();
        espera(botonBuscar,2);
    }

    public void consultarContactoTipoDoc(String tipoDoc) {
        waitForTextToAppear("Búsqueda de contactos",2000);
        waitFor(txtTipoDoc).shouldBeVisible();
        txtTipoDoc.type(tipoDoc);
        waitFor(botonBuscar).shouldBeVisible();
        botonBuscar.click();
    }

    public void consultarPersonaJuridicaTipoNumDoc(String numDoc) {
        waitForTextToAppear("Búsqueda de contactos",2000);
        waitFor(itmNIT).shouldBeVisible();
        itmNIT.click();
        txtNumDoc.type(numDoc);
        waitFor(botonBuscar).shouldBeVisible();
        botonBuscar.click();
    }

    public void verInfoPersonaJuridica(String filtro) {
        String primerElemento = primerElementoTabla.getText();
        waitForTextToAppear(primerElemento,2000);
        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        waitABit(1000);

        try {

            for (WebElement row : allRows) {
                List<WebElement> cells = row.findElements(By.tagName("td"));
                boolean valido = cells.get(0).getText().equals(filtro) ||
                                 cells.get(1).getText().equals(filtro) ||
                                 cells.get(2).getText().equals(filtro) ||
                                 cells.get(3).getText().equals(filtro);
                assertTrue(valido);
            }

        }catch(Exception e) {
            LOGGER.error("This is error", e);
        }
    }

    public void verInfoPersonaNatural(String filtro1, String filtro2) {
        String primerElemento = primerElementoTabla.getText();
        waitForTextToAppear(primerElemento,2000);
        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if(!("").equals(filtro1)) {
                boolean valido1 = cells.get(0).getText().equals(filtro1) ||
                                  cells.get(1).getText().equals(filtro1) ||
                                  cells.get(2).getText().equals(filtro1) ||
                                  cells.get(3).getText().equals(filtro1) ||
                                  cells.get(4).getText().equals(filtro1) ||
                                  cells.get(5).getText().equals(filtro1);
                assertTrue(valido1);
            }
            if(!("").equals(filtro2)) {
                boolean valido2 = cells.get(0).getText().equals(filtro1) ||
                                  cells.get(1).getText().equals(filtro1) ||
                                  cells.get(2).getText().equals(filtro1) ||
                                  cells.get(3).getText().equals(filtro1) ||
                                  cells.get(4).getText().equals(filtro1) ||
                                  cells.get(5).getText().equals(filtro1);
                assertTrue(valido2);
            }
        }
    }

    public void consultarContactoTipoNumDoc(String tipoDoc, String numDoc) {
        waitForTextToAppear("Búsqueda de contactos",5000);
        if(!tipoDoc.equals("<ninguno>")) {
            waitFor(botonTipoDoc).shouldBeVisible();
            botonTipoDoc.click();
            WebElementFacade cbxTipoDoc = findBy(".//li[contains(.,'" + tipoDoc + "')]");
            waitForTextToAppear(tipoDoc, 2000);
            cbxTipoDoc.click();
            waitABit(1500);
            divNombre.waitUntilVisible();
            txtNumDoc.type(numDoc);
            botonBuscar.click();
        }else{
            txtNumDoc.type(numDoc);
            botonBuscar.click();
            waitForTextToAppear("La búsqueda no devolvió resultados.",2000);
        }
    }

    public void consultarContactoPorNombresYApellidos(String tipoDoc, String primerNombre,
                                                      String segundoNombre, String primerApellido,
                                                      String segundoApellido) {
        waitForTextToAppear("Búsqueda de contactos",3000);
        waitFor(txtTipoDoc).shouldBeVisible();
        txtTipoDoc.type(tipoDoc);
        txtTipoDoc.sendKeys(Keys.ENTER);
        if(!tipoDoc.equals("<ninguno>")) {
            String nombreElemento = divNombre.getText();
            waitForTextToAppear(nombreElemento, 3000);
            waitFor(txtNombre).shouldBeVisible();
            txtNombre.type(primerNombre);
            txtSegNombre.type(segundoNombre);
            waitFor(txtApellido).shouldBeVisible();
            txtApellido.type(primerApellido);
            txtSegApellido.type(segundoApellido);
            waitFor(botonBuscar).shouldBeVisible();
            botonBuscar.click();
        }else{
            waitFor(botonBuscar).shouldBeVisible();
            botonBuscar.click();
            waitForTextToAppear("La búsqueda no devolvió resultados", 2000);
        }

    }

    public void consultarContactoNombreComercial(String tipoDoc, String nombreComercial) {
        waitForTextToAppear("Búsqueda de contactos",2000);
        waitFor(txtTipoDoc).shouldBeVisible();
        txtTipoDoc.type(tipoDoc);
        txtTipoDoc.sendKeys(Keys.ENTER);
        waitFor(txtNombreComercial).shouldBeVisible();
        txtNombreComercial.type(nombreComercial);
        waitFor(botonBuscar).shouldBeVisible();
        botonBuscar.click();
    }

    public void buscarContacto(String tipoContacto, String nombre, String apellido, String numero){
        waitForTextToAppear("Búsqueda de contactos",2000);
        waitFor(txtTipoDoc).shouldBeVisible();
        txtTipoDoc.click();
        WebElementFacade cbxTipoDoc = findBy(".//li[contains(.,'"+tipoContacto+"')]");
        waitFor(cbxTipoDoc).shouldBeVisible();
        cbxTipoDoc.click();
        int parada = Integer.parseInt(numero);
        if (("CEDULA DE CIUDADANIA").equals(tipoContacto)){
            txtNombre.type(nombre);
            txtApellido.type(apellido);
        }else{
            txtRazonSocial.type(nombre);
        }
        waitFor(botonBuscar).shouldBeVisible();
        botonBuscar.click();

        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        WebElement selectedContact1 = null;

        for (int i = 0; i < parada && i < allRows.size(); i++) {
            WebElement row = allRows.get(i);
            List<WebElement> cells = row.findElements(By.tagName("td"));
            selectedContact1 = cells.get(1);
        }
        if (selectedContact1 != null){
            selectedContact1.click();
        }
    }

    public void buscarContactoEmpresa(String nombreEmpresa){
        tipoContact.type("Empresa");
        tipoContact.sendKeys(Keys.ENTER);
        waitABit(1000);
        txtNombreEmpresa.type(nombreEmpresa);
        botonBuscar.click();
        selectContact.waitUntilPresent();
        selectContact.waitUntilVisible();
        selectContact.click();
    }

    @SuppressWarnings("SameParameterValue")
    public void validarLongitudPersonaNatural(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido){

        boolean valido = primerNombre.length() < 2 || segundoNombre.length() < 2 || primerApellido.length() < 2 || segundoApellido.length() < 2;
        assertTrue(valido);
    }

    public void validarLongitudPersonaJuridica(String razonSocial, String nombreComercial) {
        boolean valido = razonSocial.length() < 4 || nombreComercial.length() < 4;
        assertTrue(valido);
    }

    public void validarLabelsPersonaNatural(Map<String, String> labelsContacto){
        try {
            Thread.sleep(2000);
            assertThat(lblTipoId.getText().toString(),is(equalTo(labelsContacto.get("tipoId"))));
            assertThat(lblNumId.getText().toString(),is(equalTo(labelsContacto.get("numId"))));
            assertThat(lblPrimNombre.getText().toString(),is(equalTo(labelsContacto.get("priNombre"))));
            assertThat(lblSegNombre.getText().toString(),is(equalTo(labelsContacto.get("segNombre"))));
            assertThat(lblPriApellido.getText().toString(),is(equalTo(labelsContacto.get("priApellido"))));
            assertThat(lblSegApellido.getText().toString(),is(equalTo(labelsContacto.get("segApellido"))));
            assertThat(lblDireccion.getText().toString(),is(equalTo(labelsContacto.get("direccion"))));
            assertThat(lblTelefono.getText().toString(),is(equalTo(labelsContacto.get("telefono"))));
            assertThat(lblEmail.getText().toString(),is(equalTo(labelsContacto.get("email"))));
            assertThat(lblExterna.getText().toString(),is(equalTo(labelsContacto.get("externa"))));
        } catch(InterruptedException e) {
            LOGGER.error("This is error", e);
        }
    }

    public void validarLabelsPersonaJuridica(Map<String, String> labelsContacto) {
        try {
            Thread.sleep(2000);
            assertThat(lblTipoId.getText().toString(), is(equalTo(labelsContacto.get("tipoId"))));
            assertThat(lblNumId.getText().toString(), is(equalTo(labelsContacto.get("numId"))));
            assertThat(lblNomComercial.getText().toString(), is(equalTo(labelsContacto.get("nomComercial"))));
            assertThat(lblRazonSocial.getText().toString(), is(equalTo(labelsContacto.get("razonSocial"))));
            assertThat(lblDireccion.getText().toString(), is(equalTo(labelsContacto.get("direccion"))));
            assertThat(lblTelefono.getText().toString(), is(equalTo(labelsContacto.get("telefono"))));
            assertThat(lblEmail.getText().toString(), is(equalTo(labelsContacto.get("email"))));
            assertThat(lblExterna.getText().toString(), is(equalTo(labelsContacto.get("externa"))));
        } catch (InterruptedException e) {
            LOGGER.error("This is error", e);
        }
    }

    public void seleccionarContacto() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(selectContact).shouldBePresent();
        selectContact.click();
    }

    public void consultarContactoPorTipoDocumentoCotizacion(String tipoId, String numeroId) {
        waitFor(txtTipoDocDirectorioCotizacion).clear();
        txtTipoDocDirectorioCotizacion.sendKeys(tipoId);
        txtTipoDocDirectorioCotizacion.sendKeys(Keys.ENTER);
        waitABit(1000);
        txtNumDocDirectorioCotizacion.sendKeys(numeroId);
        btnBuscarDirectorioCotizacion.click();
        waitForWithRefresh();
    }
}
