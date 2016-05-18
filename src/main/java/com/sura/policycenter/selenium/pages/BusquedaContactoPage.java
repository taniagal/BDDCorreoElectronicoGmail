package com.sura.policycenter.selenium.pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.sura.guidewire.selenium.Guidewire;
import freemarker.ext.beans.HashAdapter;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.LoggerFactory;

import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.List;

public class BusquedaContactoPage extends Guidewire {

    @FindBy(xpath=".//*[@id='TabBar:ContactTab']")
    WebElementFacade contactMenu;

    @FindBy(xpath=".//*[@id='TabBar:ContactTab:Search']")
    WebElementFacade buscarContact;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:ContactType-inputEl']")
    WebElementFacade tipoContact;

    @FindBy(xpath = ".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalContactNameInputSet:Name-inputEl']")
    WebElementFacade txtNombreEmpresa;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    WebElementFacade txtNombre;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:LastName-inputEl']")
    WebElementFacade txtApellido;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:MiddleName-inputEl']")
    WebElementFacade txtSegNombre;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:Particle-inputEl']")
    WebElementFacade txtSegApellido;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalContactNameInputSet:Name-inputEl']")
    WebElementFacade nombreEmpresaContact;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade botonBuscar;

    @FindBy(xpath="//tr[3]/td/table/tbody/tr/td[2]/input\n")
    WebElementFacade txtRazonSocial;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:_msgs']/div")
    WebElementFacade msjValidacionCampos;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:ContactSearchResultsLV:_RecordCount']")
    WebElementFacade msjSinRegistros;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:SearchWarningMessagePanelSet:SearchWarningMessage']")
    WebElementFacade msjSinCriterios;

    @FindBy(xpath="//li[2]")
    WebElementFacade itmNIT;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:DocumentType-inputEl']")
    WebElementFacade txtTipoDoc;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:identificationNumber-inputEl']")
    WebElementFacade txtNumDoc;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalContactNameInputSet:CommercialName-inputEl']")
    WebElementFacade txtNombreComercial;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    WebElementFacade nombreContact;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:LastName-inputEl']")
    WebElementFacade apellidoContact;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:ContactSearchResultsLV:0:DocumentType']")
    WebElementFacade selectContact;

    @FindBy(xpath="//div[3]/div/table")
    WebElementFacade table;

    @FindBy(xpath=".//*[@id='Login:LoginScreen:LoginDV:submit-btnInnerEl']")
    WebElementFacade submit;

    @FindBy(xpath=".//*[@id='Login:LoginScreen:LoginDV:username-inputEl']")
    WebElementFacade txtusuario;

    @FindBy(xpath=".//*[@id='Login:LoginScreen:LoginDV:password-inputEl']")
    WebElementFacade txtcontrasena;

    @FindBy(xpath="//div/div/div[2]/div/span")
    WebElementFacade lblTipoId;

    @FindBy(xpath="//div/div/div[3]/div/span")
    WebElementFacade lblNumId;

    @FindBy(xpath="//div[4]/div/span")
    WebElementFacade lblPrimNombre;

    @FindBy(xpath="//div/div/div[5]/div/span")
    WebElementFacade lblSegNombre;

    @FindBy(xpath="//div[6]/div/span")
    WebElementFacade lblPriApellido;

    @FindBy(xpath="//div[7]/div/span")
    WebElementFacade lblSegApellido;

    @FindBy(xpath="//div[8]/div/span")
    WebElementFacade lblNomComercial;

    @FindBy(xpath="//div[9]/div/span")
    WebElementFacade lblRazonSocial;

    @FindBy(xpath="//div[10]/div/span")
    WebElementFacade lblDireccion;

    @FindBy(xpath="//div[11]/div/span")
    WebElementFacade lblTelefono;

    @FindBy(xpath="//div[12]/div/span")
    WebElementFacade lblEmail;

    @FindBy(xpath="//div[13]/div/span")
    WebElementFacade lblExterna;

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(BusquedaContactoPage.class);

    public void login(String usuario, String contrasena){
        txtusuario.type(usuario);
        txtcontrasena.type(contrasena);
        submit.click();
    }

    public BusquedaContactoPage(WebDriver driver) {
        super(driver);
    }

    public void accionarBuscarContacto()  {
        try{
            Actions act = new Actions(getDriver());
            contactMenu.click();
            Thread.sleep(1000);
            contactMenu.click();
            act.sendKeys(Keys.ARROW_DOWN).build().perform();
            act.moveToElement(buscarContact).click().build().perform();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void buscarContacto(String tipoContacto, String nombre, String apellido){
        tipoContact.type(tipoContacto);
        tipoContact.sendKeys(Keys.ENTER);
        waitABit(1000);
        if (tipoContacto.equals("Personal")){
            nombreContact.type(nombre);
            apellidoContact.type(apellido);
        }else{
            nombreEmpresaContact.type(nombre);
        }
        botonBuscar.click();
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
        selectContact.click();
    }

    public void consultarPersonaJuridaPorRazonSocial(String tipoDoc, String razonSocial){

        txtTipoDoc.type(tipoDoc);
        txtTipoDoc.sendKeys(Keys.ENTER);
        txtRazonSocial.type(razonSocial);
        botonBuscar.waitUntilEnabled();
        botonBuscar.click();
        espera(botonBuscar,2);
    }

    public void validarInformacionTipoId() {

        String msjSinReg = "No hay datos para mostrar";

        try {
            Thread.sleep(2000);
            assertThat(msjSinRegistros.getText().toString(),is(equalTo(msjSinReg)));

        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    public void validarMensaje(String msjVal) {

        try {
            espera(msjSinCriterios,3);
            assertThat(msjSinCriterios.getText(),is(equalTo(msjVal)));

        } catch(Exception e) {
            LOGGER.error("This is error", e);
        }
    }

    public void consultarContactoNumDoc(String tipoDoc, String numDoc) {

        txtTipoDoc.type(tipoDoc);
        txtNumDoc.type(numDoc);
        botonBuscar.waitUntilEnabled();
        botonBuscar.click();
        espera(botonBuscar,2);
    }

    public void consultarContactoTipoDoc(String tipoDoc) {

        txtTipoDoc.type(tipoDoc);
        botonBuscar.waitUntilEnabled();
        botonBuscar.click();
        espera(botonBuscar,2);
    }

    public void consultarPersonaJuridicaTipoNumDoc(String numDoc) {

        itmNIT.waitUntilEnabled();
        itmNIT.click();
        txtNumDoc.type(numDoc);
        botonBuscar.waitUntilEnabled();
        botonBuscar.click();
        espera(botonBuscar,2);
    }

    public void verInfoPersonaJuridica(String filtro) {
        List<WebElement> allRows = table.findElements(By.tagName("tr"));

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
        List<WebElement> allRows = table.findElements(By.tagName("tr"));

        try {

            for (WebElement row : allRows) {
                List<WebElement> cells = row.findElements(By.tagName("td"));
                if(filtro1!="") {
                    boolean valido1 = cells.get(0).getText().equals(filtro1) ||
                                      cells.get(1).getText().equals(filtro1) ||
                                      cells.get(2).getText().equals(filtro1) ||
                                      cells.get(3).getText().equals(filtro1) ||
                                      cells.get(4).getText().equals(filtro1) ||
                                      cells.get(5).getText().equals(filtro1);
                    assertTrue(valido1);
                }
                if(filtro2!="") {
                    boolean valido2 = cells.get(0).getText().equals(filtro1) ||
                                      cells.get(1).getText().equals(filtro1) ||
                                      cells.get(2).getText().equals(filtro1) ||
                                      cells.get(3).getText().equals(filtro1) ||
                                      cells.get(4).getText().equals(filtro1) ||
                                      cells.get(5).getText().equals(filtro1);
                    assertTrue(valido2);
                }
            }

        }catch(Exception e) {
            LOGGER.error("This is error", e);
        }
    }

    public void  consultarContactoTipoNumDoc(String tipoDoc, String numDoc) {

        txtTipoDoc.click();
        WebElementFacade cbxTipoDoc = findBy(".//li[contains(.,'"+tipoDoc+"')]");
        cbxTipoDoc.click();
        waitABit(1000);
        txtNumDoc.type(numDoc);

        waitABit(1000);
        botonBuscar.waitUntilClickable();
        botonBuscar.click();
    }

    public void consultarContactoPorNombresYApellidos(String tipoDoc, String primerNombre,
                                                      String segundoNombre, String primerApellido,
                                                      String segundoApellido) {
        txtTipoDoc.click();
        WebElementFacade cbxTipoDoc = findBy(".//li[contains(.,'"+tipoDoc+"')]");
        cbxTipoDoc.click();
        waitABit(1000);
        txtNombre.type(primerNombre);
        txtSegNombre.type(segundoNombre);
        waitABit(1000);
        txtApellido.type(primerApellido);
        txtSegApellido.type(segundoApellido);
        waitABit(1000);
        botonBuscar.waitUntilEnabled();
        botonBuscar.click();
        espera(botonBuscar,2);
    }

    public void consultarContactoNombreComercial(String tipoDoc, String nombreComercial) {
        txtTipoDoc.type(tipoDoc);
        txtTipoDoc.sendKeys(Keys.ENTER);
        txtNombreComercial.type(nombreComercial);
        botonBuscar.waitUntilEnabled();
        botonBuscar.click();
        espera(botonBuscar,2);
    }

    public void buscarContacto(String tipoContacto, String nombre, String apellido, String numero){

        txtTipoDoc.click();
        WebElementFacade cbxTipoDoc = findBy(".//li[contains(.,'"+tipoContacto+"')]");
        cbxTipoDoc.click();

        int parada = Integer.parseInt(numero);
        waitABit(1000);
        if (tipoContacto.equals("CEDULA DE CIUDADANIA")){
            txtNombre.type(nombre);
            txtApellido.type(apellido);
        }else{
            txtRazonSocial.type(nombre);
        }
        botonBuscar.click();
        waitABit(3000);

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
        selectContact.click();
    }

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
        } catch(Exception e) {
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
        } catch (Exception e) {
            LOGGER.error("This is error", e);
        }
    }

    public void seleccionarContacto() {
        selectContact.click();
    }
}
