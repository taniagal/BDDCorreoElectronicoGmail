package com.sura.policycenter.selenium.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

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

    public void buscarCuenta(String numeroCuenta) {
        btnBuscar.click();
        btnCuentas.click();
        txtNumeroCuenta.sendKeys(numeroCuenta);
        btnBuscarCuenta.click();
        grdNumeroCuenta.click();
        mnuContactos.click();
    }

    public void vincularDirecciones() {
        vincularDireccionAContacto(grdContacto1);
        vincularDireccionAContacto(grdContacto2);
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
        waitABit(2000);
        btnAsociarDireccion.click();
        waitABit(2000);
        btnSeleccionar.click();
        waitABit(2000);
        direccionContacto.click();
        waitABit(2000);
        btnActualizar.click();
        waitABit(3000);
    }

    public void validarInformacion(ExamplesTable resultadoFiltroActividades) {
        waitABit(1000);
        Map<String, String> exampleTable = resultadoFiltroActividades.getRows().get(0);
        MatcherAssert.assertThat(this.txtPais.getText(), Is.is(Matchers.equalTo(exampleTable.get("pais"))));
        MatcherAssert.assertThat(this.txtDepartamento.getText(), Is.is(Matchers.equalTo(exampleTable.get("departamento"))));
        MatcherAssert.assertThat(this.txtCiudad.getText(), Is.is(Matchers.equalTo(exampleTable.get("ciudad"))));
        MatcherAssert.assertThat(this.txtDireccion.getText(), Is.is(Matchers.equalTo(exampleTable.get("direccion"))));
        MatcherAssert.assertThat(this.txtCodigoPostal.getText(), Is.is(Matchers.equalTo(exampleTable.get("codigoPostal"))));
        MatcherAssert.assertThat(this.txtTipoDireccion.getText(), Matchers.containsString(exampleTable.get("tipoDeDireccion")));
        MatcherAssert.assertThat(this.txtDescripcion.getText(), Matchers.containsString(exampleTable.get("descripcion")));
    }

}
