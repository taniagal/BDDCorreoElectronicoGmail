package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Pending;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.isIn;

public class BusquedaContactoPage extends Guidewire {

    @FindBy(xpath=".//*[@id='TabBar:ContactTab']")
    WebElementFacade contactMenu;

    @FindBy(xpath=".//*[@id='TabBar:ContactTab:Search']")
    WebElementFacade buscarContact;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:ContactType-inputEl']")
    WebElementFacade tipoContact;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    WebElementFacade txtNombre;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:LastName-inputEl']")
    WebElementFacade txtApellido;

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

    @FindBy(xpath="//li[2]")
    WebElementFacade itmNIT;

    @FindBy(xpath="//input[@id='ContactSearch:ContactSearchScreen:DocumentType-inputEl']")
    WebElementFacade txtTipoDoc;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:identificationNumber-inputEl']")
    WebElementFacade txtNumDoc;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalContactNameInputSet:CommercialName-inputEl']")
    WebElementFacade txtNombreComercial;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    WebElementFacade nombreContact;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:LastName-inputEl']")
    WebElementFacade apellidoContact;

    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:ContactSearchResultsLV:0:Name']")
    WebElementFacade selectContact;

    @FindBy(xpath="//div[3]/div/table/tbody/tr/td[2]/div")
    WebElementFacade colTipoId;

    @FindBy(xpath="//td[3]/div")
    WebElementFacade colNumId;

    @FindBy(xpath="//td[4]/div")
    WebElementFacade colNombreCcial;

    @FindBy(xpath="//td[5]/div")
    WebElementFacade colRazonSocial;

    @FindBy(xpath="//td[6]/div")
    WebElementFacade colDireccion;

    @FindBy(xpath="//div[3]/div/table")
    WebElementFacade table;

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

    public void buscarContactoPersonaSinVerDetalle(String tipoDoc, String nombre, String apellido) {
        tipoContact.type("Personal");
        tipoContact.sendKeys(Keys.ENTER);
        txtTipoDoc.type(tipoDoc);
        nombreContact.type(nombre);
        apellidoContact.type(apellido);
    }

    public void buscarContacto(String tipoContacto, String nombre, String apellido){
        tipoContact.type(tipoContacto);
        tipoContact.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (tipoContacto.equals("Personal")){
            nombreContact.type(nombre);
            apellidoContact.type(apellido);
        }else{
            nombreEmpresaContact.type(nombre);
        }

        botonBuscar.click();
    }

    public void buscarContactoPersona(String primerNombre, String primerApellido){
        tipoContact.type("Personal");
        tipoContact.sendKeys(Keys.ENTER);
        txtNombre.type(primerNombre);
        txtApellido.type(primerApellido);
        botonBuscar.click();
        selectContact.click();
    }

    public void buscarContactoPorTipoYNroIdentificacion(String tipoIdentificacion, String numeroIdentificacion){
        tipoContact.type("Personal");
        tipoContact.sendKeys(Keys.ENTER);
    }

    public void consultarPersonaJuridaPorRazonSocial(String tipoDoc, String razonSocial){

        txtTipoDoc.type(tipoDoc);
        txtTipoDoc.sendKeys(Keys.ENTER);
        txtRazonSocial.type(razonSocial);
        botonBuscar.waitUntilEnabled();
        botonBuscar.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    //TODO
    @Pending
    public void verInformacionPersonaJuridica(){
        //PENDING
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
            Thread.sleep(2000);
            assertThat(msjValidacionCampos.getText().toString(),is(equalTo(msjVal)));

        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    public void consultarContactoNumDoc(String tipoDoc, String numDoc) {

        /*lstTipoDoc.waitUntilEnabled();
        lstTipoDoc.click();
        itmNinguno.waitUntilEnabled();
        itmNinguno.click();*/
        txtTipoDoc.type(tipoDoc);
        txtNumDoc.type(numDoc);
        botonBuscar.waitUntilEnabled();
        botonBuscar.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    public void consultarContactoTipoDoc(String tipoDoc) {

        /*lstTipoDoc.waitUntilEnabled();
        lstTipoDoc.click();
        itmNIT.waitUntilEnabled();
        itmNIT.click();*/
        txtTipoDoc.type(tipoDoc);
        botonBuscar.waitUntilEnabled();
        botonBuscar.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    public void consultarPersonaJuridicaTipoNumDoc(String numDoc) {

        itmNIT.waitUntilEnabled();
        itmNIT.click();
        txtNumDoc.type(numDoc);
        botonBuscar.waitUntilEnabled();
        botonBuscar.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    public void verInfoPersonaJuridica() {
        try {

            assertThat(colTipoId.getText().toString(), is(not(equalTo(null))));
            assertThat(colNumId.getText().toString(), is(not(equalTo(null))));
            assertThat(colNombreCcial.getText().toString(), is(not(equalTo(null))));
            assertThat(colRazonSocial.getText().toString(), is(not(equalTo(null))));
            assertThat(colDireccion.getText().toString(), is(not(equalTo(null))));
            //assertThat(colTelefono.getText().toString(), is(not(equalTo(null))));
            //assertThat(colEmail.getText().toString(), is(not(equalTo(null))));
            //assertThat(colExternal.getText().toString(), is(not(equalTo(null))));*/
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //TODO: Falta Mapear Elementos de la tabla de resultados
    public void verInfoPersonaNatural() {
        try {

            /*assertThat(colTipoId.getText().toString(), is(not(equalTo(null))));
            assertThat(colNumId.getText().toString(), is(not(equalTo(null))));
            assertThat(colPrimerNom.getText().toString(), is(not(equalTo(null))));
            assertThat(colSegundoNom.getText().toString(), is(not(equalTo(null))));
            assertThat(colPrimerApel.getText().toString(), is(not(equalTo(null))));
            assertThat(colSegundoApel.getText().toString(), is(not(equalTo(null))));
            assertThat(colDireccion.getText().toString(), is(not(equalTo(null))));
            assertThat(colTelefono.getText().toString(), is(not(equalTo(null))));
            assertThat(colEmail.getText().toString(), is(not(equalTo(null))));
            assertThat(colExternal.getText().toString(), is(not(equalTo(null))));*/
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void consultarContactoTipoNumDoc(String tipoDoc, String numDoc) {

        txtTipoDoc.type(tipoDoc);
        txtTipoDoc.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        txtNumDoc.type(numDoc);
        botonBuscar.waitUntilEnabled();
        botonBuscar.click();
    }

    public void consultarContactoPorNombresYApellidos(String tipoDoc, String nombre, String apellido) {
        txtTipoDoc.type(tipoDoc);
        txtTipoDoc.sendKeys(Keys.ENTER);
        txtNombre.type(nombre);
        txtApellido.type(apellido);
        botonBuscar.waitUntilEnabled();
        botonBuscar.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    public void consultarContactoNombreComercial(String tipoDoc, String nombreComercial) {
        txtTipoDoc.type(tipoDoc);
        txtTipoDoc.sendKeys(Keys.ENTER);
        txtNombreComercial.type(nombreComercial);
        botonBuscar.waitUntilEnabled();
        botonBuscar.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    public void buscarContacto(String tipoContacto, String nombre, String apellido, String numero){
        tipoContact.type(tipoContacto);
        tipoContact.sendKeys(Keys.ENTER);
        int parada = Integer.parseInt(numero);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (tipoContacto.equals("Personal")){
            nombreContact.type(nombre);
            apellidoContact.type(apellido);
        }else{
            nombreEmpresaContact.type(nombre);
        }
        botonBuscar.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

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
}