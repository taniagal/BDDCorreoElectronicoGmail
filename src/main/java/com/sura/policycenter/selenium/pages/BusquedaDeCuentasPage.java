package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class BusquedaDeCuentasPage extends Guidewire {

    @FindBy(xpath=".//*[@id='TabBar:SearchTab']")
    private WebElementFacade mnuBuscar;

    @FindBy(xpath=" .//*[@id='TabBar:SearchTab:Search_AccountSearch']")
    private WebElementFacade mnuBuscarCuenta;

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


    public BusquedaDeCuentasPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarABuscarCuentas() {
            Actions act = new Actions(getDriver());
            mnuBuscar.waitUntilClickable();
            mnuBuscar.click();
            mnuBuscar.waitUntilClickable();
            waitABit(1000);
            mnuBuscar.click();
            act.sendKeys(Keys.ARROW_DOWN).build().perform();
            act.moveToElement(mnuBuscarCuenta).click().build().perform();
            waitABit(1000);
     }

    public void buscarCuentaPorNombreYApellido(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
        this.limpiarFormulario();
        waitABit(1000);
        txtPrimerNombre.sendKeys(primerNombre);
        txtSegundoNombre.sendKeys(segundoNombre);
        txtPrimerApellido.sendKeys(primerApellido);
        txtSegundoApellido.sendKeys(segundoApellido);
        btnBuscar.click();
    }

    private void limpiarFormulario(){
        txtTipoDocumento.clear();
        txtNumeroDocumento.clear();
        txtRazonSocial.clear();
        txtNombreComercial.clear();
        txtPrimerNombre.clear();
        txtSegundoNombre.clear();
        txtPrimerApellido.clear();
        txtSegundoApellido.clear();
    }

    public void buscarCuentaPorIdentificacion(String tipoDocumento, String numeroDocumento) {
        this.limpiarFormulario();
        waitABit(1000);
        txtTipoDocumento.sendKeys(tipoDocumento);
        txtTipoDocumento.sendKeys(Keys.ENTER);
        txtNumeroDocumento.sendKeys(numeroDocumento);
        btnBuscar.click();
    }

    public void mostrarInformacionDeLaCuenta(String numeroCuenta, String nombre, String direccion) {
        assertThat(this.grdNumeroCuenta.getText(), containsString(numeroCuenta));
        assertThat(this.grdNombre.getText(), containsString(nombre));
        assertThat(this.grdDireccion.getText(), containsString(direccion));
    }

    public void validarMensaje(String mensaje) {
        msjMensajeInformativo.waitUntilVisible();
        assertThat(this.msjMensajeInformativo.getText(), containsString(mensaje));
    }

    private void validarCheckNoSeleccionado(WebElementFacade elemento){
        if(elemento.isSelected()){
            assertThat("Check seleccionado", containsString("Check no seleccionado"));
        }else assertThat("Check no seleccionado", containsString("Check no seleccionado"));
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
        assertThat(this.lblNumeroCuenta.getText(), containsString("Número de cuenta"));
        assertThat(this.lblTipoDocumento.getText(), containsString("Tipo documento"));
        assertThat(this.lblNumeroDocumento.getText(), containsString("Número documento"));
        assertThat(this.lblPrimerNombre.getText(), containsString("Primer nombre"));
        assertThat(this.lblSegundoNombre.getText(), containsString("Segundo nombre"));
        assertThat(this.lblPrimerApellido.getText(), containsString("Primer apellido"));
        assertThat(this.lblSegundoApellido.getText(), containsString("Segundo apellido"));
        assertThat(this.lblPrimerNombreExacto.getText(), containsString("El primer nombre es una coincidencia exacta"));
        assertThat(this.lblPrimerApellidoExacto.getText(), containsString("El primer apellido es una coincidencia exacta"));
        assertThat(this.lblRazonSocial.getText(), containsString("Razón social"));
        assertThat(this.lblNombreComercialExacto.getText(), containsString("Razón social es una coincidencia exacta"));
        assertThat(this.lblNombreComercial.getText(), containsString("Nombre comercial"));
    }

    public void buscarCuentaPorRazonSocial(String razonSocial) {
        this.limpiarFormulario();
        waitABit(1000);
        txtRazonSocial.sendKeys(razonSocial);
        btnBuscar.click();
    }

    public void seleccionarTipoIdentificacion(String tipoDocumento){
        txtTipoDocumento.waitUntilVisible();
        this.limpiarFormulario();
        txtTipoDocumento.sendKeys(tipoDocumento);
        txtTipoDocumento.sendKeys(Keys.ENTER);
    }

    public void buscarCuentaPorNombreComercial(String nombreComercial) {
        this.limpiarFormulario();
        waitABit(1000);
        txtNombreComercial.sendKeys(nombreComercial);
        btnBuscar.click();
    }

    public void seleccionarImprimir() {
        waitABit(1000);
        btnImprimir.click();
    }

    public void validarOpcionesDeImprimir(String imprimir, String exportar, String exportarPersonalizado) {
        espera(rbtnImprimir, 4);
        this.rbtnExportar.shouldBeVisible();
        this.rbtnImprimir.shouldBeVisible();
        this.rbtnExportarPersonalizado.shouldBeVisible();
        assertThat(this.lblImprimir.getText(), containsString(imprimir));
        assertThat(this.lblExportar.getText(), containsString(exportar));
        assertThat(this.lblExportarPersonalizado.getText(), containsString(exportarPersonalizado));
        btnVolverBuscarCuentas.click();
    }

    public void ingresarRazonSocialYPrimerNombre(String razonSocial, String primerNombre) {
        this.limpiarFormulario();
        waitABit(1000);
        this.txtRazonSocial.sendKeys(razonSocial);
        this.txtPrimerNombre.sendKeys(primerNombre);
        btnBuscar.click();
    }

    public void ingresarNombreComercialYPrimerNombre(String nombreComercial, String primerNombre) {
        this.limpiarFormulario();
        waitABit(1000);
        this.txtNombreComercial.sendKeys(nombreComercial);
        this.txtPrimerNombre.sendKeys(primerNombre);
        btnBuscar.click();
    }

    public void ingresarRazonSocialYNombreComercial(String nombreComercial, String razonSocial) {
        this.limpiarFormulario();
        waitABit(1000);
        this.txtNombreComercial.sendKeys(nombreComercial);
        this.txtRazonSocial.sendKeys(razonSocial);
        btnBuscar.click();
    }
}
