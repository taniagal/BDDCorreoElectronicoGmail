package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;

import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;


public class BusquedaDeCuentasPage extends Guidewire {

    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:IDType-labelEl']")
    private WebElementFacade lblTipoDocumento;
    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:IDNumber-labelEl']")
    private WebElementFacade lblNumeroDocumento;
    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:AccountNumber-labelEl']")
    private WebElementFacade lblNumeroCuenta;
    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:GlobalPersonNameInputSet:FirstName-labelEl']")
    private WebElementFacade lblPrimerNombre;
    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:GlobalPersonNameInputSet:MiddleName-labelEl']")
    private WebElementFacade lblSegundoNombre;
    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:GlobalPersonNameInputSet:LastName-labelEl']")
    private WebElementFacade lblPrimerApellido;
    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:GlobalPersonNameInputSet:Particle-labelEl']")
    private WebElementFacade lblSegundoApellido;
    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:GlobalContactNameInputSet:Name-labelEl']")
    private WebElementFacade lblRazonSocial;
    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:CommercialName-labelEl']")
    private WebElementFacade lblNombreComercial;
    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:FirstNameExact-labelEl']")
    private WebElementFacade lblPrimerNombreExacto;
    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:LastNameExact-labelEl']")
    private WebElementFacade lblPrimerApellidoExacto;
    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:CompanyNameExact-labelEl']")
    private WebElementFacade lblNombreComercialExacto;
    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:IDType-inputEl']")
    private WebElementFacade txtTipoDocumento;
    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:IDNumber-inputEl']")
    private WebElementFacade txtNumeroDocumento;
    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:AccountNumber-inputEl']")
    private WebElementFacade txtNumeroCuenta;
    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:GlobalPersonNameInputSet:FirstName-inputEl']")
    private WebElementFacade txtPrimerNombre;
    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:GlobalPersonNameInputSet:MiddleName-inputEl']")
    private WebElementFacade txtSegundoNombre;
    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:GlobalPersonNameInputSet:LastName-inputEl']")
    private WebElementFacade txtPrimerApellido;
    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:GlobalPersonNameInputSet:Particle-inputEl']")
    private WebElementFacade txtSegundoApellido;
    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:GlobalContactNameInputSet:Name-inputEl']")
    private WebElementFacade txtRazonSocial;
    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:CommercialName-inputEl']")
    private WebElementFacade txtNombreComercial;
    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:FirstNameExact-inputEl']")
    private WebElementFacade chkPrimerNombreExacto;
    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:LastNameExact-inputEl']")
    private WebElementFacade chkPrimerApellidoExacto;
    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:CompanyNameExact-inputEl']")
    private WebElementFacade chkNombreCompaniaExacto;
    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade btnBuscar;
    @FindBy(xpath="//div[4]/div/table/tbody/tr/td[2]/div")
    private WebElementFacade grdNumeroCuenta;
    @FindBy(xpath="//div[4]/div/table/tbody/tr/td[3]/div")
    private WebElementFacade grdNombre;
    @FindBy(xpath="//td[4]/div")
    private WebElementFacade grdDireccion;
    @FindBy(xpath="//*[@id='AccountSearch:AccountSearchScreen:_msgs']/div")
    private WebElementFacade msjMensajeInformativo;
    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchResultsLV_tb:PrintMe']")
    private WebElementFacade btnImprimir;
    @FindBy(xpath=".//*[@id='PrintOptionPopup:PrintOptionPopupScreen:PrintOptionDV:DoPrint-labelEl']")
    private WebElementFacade lblImprimir;
    @FindBy(xpath=".//*[@id='PrintOptionPopup:PrintOptionPopupScreen:PrintOptionDV:Export-labelEl']")
    private WebElementFacade lblExportar;
    @FindBy(xpath=".//*[@id='PrintOptionPopup:PrintOptionPopupScreen:PrintOptionDV:CustomExport-labelEl']")
    private WebElementFacade lblExportarPersonalizado;
    @FindBy(xpath=".//*[@id='PrintOptionPopup:PrintOptionPopupScreen:PrintOptionDV:PrintChoice_Choice-inputEl']")
    private WebElementFacade rbtnImprimir;
    @FindBy(xpath=".//*[@id='PrintOptionPopup:PrintOptionPopupScreen:PrintOptionDV:ExportChoice_Choice-inputEl']")
    private WebElementFacade rbtnExportar;
    @FindBy(xpath=".//*[@id='PrintOptionPopup:PrintOptionPopupScreen:PrintOptionDV:CustomExportChoice_Choice-inputEl']")
    private WebElementFacade rbtnExportarPersonalizado;
    @FindBy(xpath=".//*[@id='PrintOptionPopup:__crumb__']")
    private WebElementFacade btnVolverBuscarCuentas;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab']")
    private  WebElementFacade menuBuscar;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_AccountSearch']/div")
    private  WebElementFacade menuBuscarCuentas;
    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Reset']")
    private  WebElementFacade botonRestablecer;


    public BusquedaDeCuentasPage(WebDriver driver) {
        super(driver);
    }


    public void irABuscarCuentas() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(menuBuscar).waitUntilPresent().click();
        waitUntil(1500);
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(menuBuscarCuentas).waitUntilPresent();
        menuBuscarCuentas.click();
    }

    public void buscarCuentaPorNombreYApellido(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
        this.limpiarFormulario();
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(txtPrimerNombre).waitUntilPresent();
        txtPrimerNombre.sendKeys(primerNombre);
        txtSegundoNombre.sendKeys(segundoNombre);
        txtPrimerApellido.sendKeys(primerApellido);
        txtSegundoApellido.sendKeys(segundoApellido);
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(btnBuscar).waitUntilPresent();
        btnBuscar.click();
    }

    private void limpiarFormulario() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(botonRestablecer).waitUntilPresent();
        botonRestablecer.waitUntilPresent().click();
        waitUntil(2000);
    }

    public void buscarCuentaPorIdentificacion(String tipoDocumento, String numeroDocumento) {
        this.limpiarFormulario();
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(txtTipoDocumento).waitUntilPresent();
        txtTipoDocumento.clear();
        txtTipoDocumento.sendKeys(tipoDocumento);
        txtTipoDocumento.sendKeys(Keys.ENTER);
        txtNumeroDocumento.sendKeys(numeroDocumento);
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(btnBuscar).waitUntilPresent();
        btnBuscar.click();
    }

    public void mostrarInformacionDeLaCuenta(String numeroCuenta, String nombre, String direccion) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(this.grdNumeroCuenta).shouldBePresent();
        MatcherAssert.assertThat(this.grdNumeroCuenta.getText(), Matchers.containsString(numeroCuenta));
        MatcherAssert.assertThat(this.grdNombre.getText(), Matchers.containsString(nombre));
        MatcherAssert.assertThat(this.grdDireccion.getText(), Matchers.containsString(direccion));
    }

    public void validarMensaje(String mensaje) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(msjMensajeInformativo).waitUntilPresent();
        MatcherAssert.assertThat(this.msjMensajeInformativo.getText(), Matchers.containsString(mensaje));
    }

    private void validarCheckNoSeleccionado(WebElementFacade elemento){
        if(elemento.isSelected()){
            MatcherAssert.assertThat("Check seleccionado", Matchers.containsString("Check no seleccionado"));
        }else MatcherAssert.assertThat("Check no seleccionado", Matchers.containsString("Check no seleccionado"));
    }

    public void validarCamposDelFormulario() {
        this.txtNumeroDocumento.shouldBeVisible();
        this.txtTipoDocumento.shouldBeVisible();
        this.txtNumeroCuenta.shouldBeVisible();
        this.txtPrimerNombre.shouldBeVisible();
        this.txtSegundoNombre.shouldBeVisible();
        this.txtPrimerApellido.shouldBeVisible();
        this.txtSegundoApellido.shouldBeVisible();
        this.txtRazonSocial.shouldBeVisible();
        this.txtNombreComercial.shouldBeVisible();
        validarCheckNoSeleccionado(chkPrimerNombreExacto);
        validarCheckNoSeleccionado(chkPrimerApellidoExacto);
        validarCheckNoSeleccionado(chkNombreCompaniaExacto);
    }

    public void validarEtiquetasDelFormulario(){
        MatcherAssert.assertThat(this.lblNumeroCuenta.getText().toLowerCase(), Matchers.containsString("número de cuenta"));
        MatcherAssert.assertThat(this.lblTipoDocumento.getText().toLowerCase(), Matchers.containsString("tipo documento"));
        MatcherAssert.assertThat(this.lblNumeroDocumento.getText().toLowerCase(), Matchers.containsString("número documento"));
        MatcherAssert.assertThat(this.lblPrimerNombre.getText().toLowerCase(), Matchers.containsString("primer nombre"));
        MatcherAssert.assertThat(this.lblSegundoNombre.getText().toLowerCase(), Matchers.containsString("segundo nombre"));
        MatcherAssert.assertThat(this.lblPrimerApellido.getText().toLowerCase(), Matchers.containsString("primer apellido"));
        MatcherAssert.assertThat(this.lblSegundoApellido.getText().toLowerCase(), Matchers.containsString("segundo apellido"));
        MatcherAssert.assertThat(this.lblPrimerNombreExacto.getText().toLowerCase(), Matchers.containsString("el primer nombre es una coincidencia exacta"));
        MatcherAssert.assertThat(this.lblPrimerApellidoExacto.getText().toLowerCase(), Matchers.containsString("el primer apellido es una coincidencia exacta"));
        MatcherAssert.assertThat(this.lblRazonSocial.getText().toLowerCase(), Matchers.containsString("razón social"));
        MatcherAssert.assertThat(this.lblNombreComercialExacto.getText().toLowerCase(), Matchers.containsString("razón social es una coincidencia exacta"));
        MatcherAssert.assertThat(this.lblNombreComercial.getText().toLowerCase(), Matchers.containsString("nombre comercial"));
    }

    public void buscarCuentaPorRazonSocial(String razonSocial) {
        this.limpiarFormulario();
        txtRazonSocial.sendKeys(razonSocial);
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(btnBuscar).waitUntilPresent();
        btnBuscar.click();
    }

    public void seleccionarTipoIdentificacion(String tipoDocumento){
        txtTipoDocumento.waitUntilVisible();
        this.limpiarFormulario();
        txtTipoDocumento.clear();
        txtTipoDocumento.sendKeys(tipoDocumento);
        txtTipoDocumento.sendKeys(Keys.ENTER);
    }

    public void buscarCuentaPorNombreComercial(String nombreComercial) {
        this.limpiarFormulario();
        txtNombreComercial.sendKeys(nombreComercial);
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(btnBuscar).waitUntilPresent();
        btnBuscar.click();
    }

    public void seleccionarImprimir() {
        btnImprimir.waitUntilPresent().click();
    }

    public void validarOpcionesDeImprimir(String imprimir, String exportar, String exportarPersonalizado) {
        waitForTextToAppear("Opciones de impresión");
        this.rbtnExportar.shouldBeVisible();
        this.rbtnImprimir.shouldBeVisible();
        this.rbtnExportarPersonalizado.shouldBeVisible();
        MatcherAssert.assertThat(this.lblImprimir.getText(), Matchers.containsString(imprimir));
        MatcherAssert.assertThat(this.lblExportar.getText(), Matchers.containsString(exportar));
        MatcherAssert.assertThat(this.lblExportarPersonalizado.getText(), Matchers.containsString(exportarPersonalizado));
        btnVolverBuscarCuentas.click();
    }

    public void ingresarRazonSocialYPrimerNombre(String razonSocial, String primerNombre) {
        this.limpiarFormulario();
        this.txtRazonSocial.sendKeys(razonSocial);
        this.txtPrimerNombre.sendKeys(primerNombre);
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(btnBuscar).waitUntilPresent();
        btnBuscar.click();
    }

    public void ingresarNombreComercialYPrimerNombre(String nombreComercial, String primerNombre) {
        this.limpiarFormulario();
        this.txtNombreComercial.sendKeys(nombreComercial);
        this.txtPrimerNombre.sendKeys(primerNombre);
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(btnBuscar).waitUntilPresent();
        btnBuscar.click();
    }

    public void ingresarRazonSocialYNombreComercial(String nombreComercial, String razonSocial) {
        this.limpiarFormulario();
        this.txtNombreComercial.sendKeys(nombreComercial);
        this.txtRazonSocial.sendKeys(razonSocial);
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(btnBuscar).waitUntilPresent();
        btnBuscar.click();
    }

}
