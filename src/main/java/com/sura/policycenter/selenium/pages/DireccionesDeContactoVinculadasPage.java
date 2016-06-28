package com.sura.policycenter.selenium.pages;
import java.util.Map;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class DireccionesDeContactoVinculadasPage extends PageObject {

    private final Actions act = new Actions(getDriver());
    public DireccionesDeContactoVinculadasPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath=".//*[@id='TabBar:SearchTab-btnInnerEl']")
    private WebElementFacade btnBuscar;
    @FindBy(id="Search:MenuLinks:Search_AccountSearch")
    private WebElementFacade btnCuentas;
    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:AccountNumber-inputEl']")
    private WebElementFacade txtNumeroCuenta;
    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade btnBuscarCuenta;
    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchResultsLV:0:AccountNumber']")
    private WebElementFacade grdNumeroCuenta;
    @FindBy(xpath=".//*[@id='AccountFile:MenuLinks:AccountFile_AccountFile_Contacts']/div")
    private WebElementFacade mnuContactos;
    @FindBy(xpath=".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV:7:Name']")
    private WebElementFacade grdContacto1;
    @FindBy(xpath=".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV:2:Name']")
    private WebElementFacade grdContacto2;
    @FindBy(xpath=".//*[@id='AccountFile_Contacts:AccountFile_ContactsScreen:AccountContactsLV:6:Name']")
    private WebElementFacade grdContacto3;
    @FindBy(xpath=".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:LinkAddressMenuMenuIcon']/img")
    private WebElementFacade btnAsociarDireccion;
    @FindBy(xpath=".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail-arrowEl']")
    private WebElementFacade btnSeleccionar;
    @FindBy(xpath=".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:0:contactDetail:PrimaryAddress-textEl']")
    private WebElementFacade direccionContacto;
    @FindBy(xpath=".//*[@id='EditAccountContactPopup:ContactDetailScreen:Update-btnInnerEl']")
    private WebElementFacade btnActualizar;
    @FindBy(xpath=".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:LinkedAddressInputSet:LinkAddressMenu:EditAddress']")
    private WebElementFacade btnEditarDireccion;
    @FindBy(xpath=".//*[@id='LinkedAddressEditPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']")
    private WebElementFacade txtPais;
    @FindBy(xpath=".//*[@id='LinkedAddressEditPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    private WebElementFacade txtDepartamento;
    @FindBy(xpath=".//*[@id='LinkedAddressEditPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City_Ext-inputEl']")
    private WebElementFacade txtCiudad;
    @FindBy(xpath=".//*[@id='LinkedAddressEditPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    private WebElementFacade txtDireccion;
    @FindBy(xpath=".//*[@id='LinkedAddressEditPopup:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl']")
    private WebElementFacade txtCodigoPostal;
    @FindBy(xpath=".//*[@id='LinkedAddressEditPopup:AddressType-inputEl']")
    private WebElementFacade txtTipoDireccion;
    @FindBy(xpath=".//*[@id='LinkedAddressEditPopup:AddressDescription-inputEl']")
    private WebElementFacade txtDescripcion;
    @FindBy(xpath=".//*[@id='LinkedAddressEditPopup:UpdateAllButton-btnInnerEl']")
    private WebElementFacade btnActualizarDireccionesLigadas;
    @FindBy(xpath=".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']")
    private WebElementFacade txtPaisContacto;
    @FindBy(xpath=".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    private WebElementFacade txtDepartamentoContacto;
    @FindBy(xpath=".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City_Ext-inputEl']")
    private WebElementFacade txtCiudadContacto;
    @FindBy(xpath=".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    private WebElementFacade txtDireccionContacto;
    @FindBy(xpath=".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-bodyEl']")
    private WebElementFacade txtCodigoPostalContacto;
    @FindBy(xpath=".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressType-inputEl']")
    private WebElementFacade txtTipoDireccionContacto;
    @FindBy(xpath=".//*[@id='EditAccountContactPopup:ContactDetailScreen:AccountContactCV:AccountContactDV:AddressDescription-bodyEl']")
    private WebElementFacade txtDescripcionContacto;


    public void buscarCuenta(String numeroCuenta) {
        btnBuscar.click();
        btnCuentas.click();
        txtNumeroCuenta.sendKeys(numeroCuenta);
        btnBuscarCuenta.click();
        grdNumeroCuenta.click();
        mnuContactos.click();
    }

    public void vincularDirecciones() {
        waitForTextToAppear("Contactos de archivo de cuenta");
        //contacto 1: speedy glass
        vincularDireccionAContacto(grdContacto1);
        waitForTextToAppear("Contactos de archivo de cuenta");
        //contacto 2: carlos peralta
        vincularDireccionAContacto(grdContacto2);
        waitForTextToAppear("Contactos de archivo de cuenta");
        irAEditarDireccion();
    }

    private void irAEditarDireccion() {
        grdContacto2.click();
        btnAsociarDireccion.click();
        waitABit(2000);
        btnEditarDireccion.click();
        waitABit(3000);
    }

    public void vincularDireccionAContacto(WebElementFacade contacto) {
        contacto.click();
        Actions actions = new Actions(getDriver());
        btnAsociarDireccion.waitUntilPresent().click();
        waitABit(300);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitABit(300);
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitABit(300);
        actions.sendKeys(Keys.ENTER).build().perform();
        waitABit(1000);
        btnActualizar.click();
        contacto.waitUntilPresent();
    }

    public void validarInformacion(ExamplesTable resultadoModificacionDireccion) {
        waitABit(1000);
        Map<String, String> exampleTable = resultadoModificacionDireccion.getRows().get(0);
        MatcherAssert.assertThat(this.txtPais.getValue(), Is.is(Matchers.equalTo(exampleTable.get("pais"))));
        MatcherAssert.assertThat(this.txtDepartamento.getValue(), Is.is(Matchers.equalTo(exampleTable.get("departamento"))));
        MatcherAssert.assertThat(this.txtCiudad.getValue(), Is.is(Matchers.equalTo(exampleTable.get("ciudad"))));
        MatcherAssert.assertThat(this.txtDireccion.getValue(), Is.is(Matchers.equalTo(exampleTable.get("direccion"))));
        MatcherAssert.assertThat(this.txtCodigoPostal.getValue(), Is.is(Matchers.equalTo(exampleTable.get("codigoPostal"))));
        MatcherAssert.assertThat(this.txtTipoDireccion.getValue(), Matchers.containsString(exampleTable.get("tipoDeDireccion")));
        MatcherAssert.assertThat(this.txtDescripcion.getValue(), Matchers.containsString(exampleTable.get("descripcion")));
    }

    public void filtrarPorInfoObligatoria() {
        txtCodigoPostal.clear();
        txtDescripcion.clear();
        btnActualizarDireccionesLigadas.click();
    }

    public void seleccionarContacto() {
        grdContacto3.click();
        btnAsociarDireccion.click();
        btnEditarDireccion.click();
    }

    public void validarInformacionContacto(ExamplesTable resultadoModificacionDireccion) {
        waitABit(1000);

        try {
            this.txtCodigoPostalContacto.waitUntilPresent();
            Map<String, String> exampleTable = resultadoModificacionDireccion.getRows().get(0);

            MatcherAssert.assertThat(this.txtPaisContacto.getText(), Is.is(Matchers.equalTo(exampleTable.get("pais"))));
            MatcherAssert.assertThat(this.txtDepartamentoContacto.getText(), Is.is(Matchers.equalTo(exampleTable.get("departamento"))));
            MatcherAssert.assertThat(this.txtCiudadContacto.getText(), Is.is(Matchers.equalTo(exampleTable.get("ciudad"))));
            MatcherAssert.assertThat(this.txtDireccionContacto.getText(), Is.is(Matchers.equalTo(exampleTable.get("direccion"))));
            JOptionPane.showMessageDialog(null, this.txtCodigoPostalContacto.isPresent());
            MatcherAssert.assertThat(this.txtCodigoPostalContacto.getText(), Is.is(Matchers.equalTo(exampleTable.get("codigoPostal"))));
            MatcherAssert.assertThat(this.txtTipoDireccionContacto.getText(), Matchers.containsString(exampleTable.get("tipoDeDireccion")));
            MatcherAssert.assertThat(this.txtDescripcionContacto.getText(), Matchers.containsString(exampleTable.get("descripcion")));

        }catch (StaleElementReferenceException elemento){
            elemento.printStackTrace();
        }
    }
}
