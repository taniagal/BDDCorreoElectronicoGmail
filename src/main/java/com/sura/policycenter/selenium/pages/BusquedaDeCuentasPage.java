package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class BusquedaDeCuentasPage extends Guidewire {

    @FindBy(xpath=".//*[@id='TabBar:SearchTab']")
    WebElementFacade mnuBuscar;

    @FindBy(xpath=" .//*[@id='TabBar:SearchTab:Search_AccountSearch']")
    WebElementFacade mnuBuscarCuenta;

    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:IDType-labelEl']")
    WebElementFacade lblTipoDocumento;

    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:IDNumber-labelEl']")
    WebElementFacade lblNumeroDocumento;

    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:AccountNumber-labelEl']")
    WebElementFacade lblNumeroCuenta;

    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:GlobalPersonNameInputSet:FirstName-labelEl']")
    WebElementFacade lblPrimerNombre;

    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:GlobalPersonNameInputSet:MiddleName-labelEl']")
    WebElementFacade lblSegundoNombre;

    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:GlobalPersonNameInputSet:LastName-labelEl']")
    WebElementFacade lblPrimerApellido;

    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:GlobalPersonNameInputSet:Particle-labelEl']")
    WebElementFacade lblSegundoApellido;

    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:GlobalContactNameInputSet:Name-labelEl']")
    WebElementFacade lblRazonSocial;

    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:CommercialName-labelEl']")
    WebElementFacade lblNombreComercial;

    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:FirstNameExact-labelEl']")
    WebElementFacade lblPrimerNombreExacto;

    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:LastNameExact-labelEl']")
    WebElementFacade lblPrimerApellidoExacto;

    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:CompanyNameExact-labelEl']")
    WebElementFacade lblNombreComercialExacto;

    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:IDType-inputEl']")
    WebElementFacade txtTipoDocumento;

    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:IDNumber-inputEl']")
    WebElementFacade txtNumeroDocumento;

    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:AccountNumber-inputEl']")
    WebElementFacade txtNumeroCuenta;

    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:GlobalPersonNameInputSet:FirstName-inputEl']")
    WebElementFacade txtPrimerNombre;

    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:GlobalPersonNameInputSet:MiddleName-inputEl']")
    WebElementFacade txtSegundoNombre;

    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:GlobalPersonNameInputSet:LastName-inputEl']")
    WebElementFacade txtPrimerApellido;

    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:GlobalPersonNameInputSet:Particle-inputEl']")
    WebElementFacade txtSegundoApellido;

    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:GlobalContactNameInputSet:Name-inputEl']")
    WebElementFacade txtRazonSocial;

    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:CommercialName-inputEl']")
    WebElementFacade txtNombreComercial;

    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:FirstNameExact-inputEl']")
    WebElementFacade chkPrimerNombreExacto;

    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:LastNameExact-inputEl']")
    WebElementFacade chkPrimerApellidoExacto;

    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:CompanyNameExact-inputEl']")
    WebElementFacade chkNombreCompaniaExacto;

    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade btnBuscar;

    @FindBy(xpath="//div[4]/div/table/tbody/tr/td[2]/div")
    WebElementFacade grdNumeroCuenta;

    @FindBy(xpath="//div[4]/div/table/tbody/tr/td[3]/div")
    WebElementFacade grdNombre;

    @FindBy(xpath="//td[4]/div")
    WebElementFacade grdDireccion;

    @FindBy(xpath="//*[@id='AccountSearch:AccountSearchScreen:_msgs']/div")
    WebElementFacade msjMensajeInformativo;

    public BusquedaDeCuentasPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarABuscarCuentas() {
            Actions act = new Actions(getDriver());
            espera(mnuBuscar, 5);
            mnuBuscar.waitUntilClickable();
            mnuBuscar.click();
            threadWait(1000);
            mnuBuscar.click();
            act.sendKeys(Keys.ARROW_DOWN).build().perform();
            act.moveToElement(mnuBuscarCuenta).click().build().perform();
            threadWait(2000);
     }

    public void buscarCuentaPorNombreYApellido(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
        txtTipoDocumento.clear();
        txtNumeroDocumento.clear();
        txtPrimerNombre.clear();
        txtSegundoNombre.clear();
        txtPrimerApellido.clear();
        txtSegundoApellido.clear();
        txtPrimerNombre.sendKeys(primerNombre);
        txtSegundoNombre.sendKeys(segundoNombre);
        txtPrimerApellido.sendKeys(primerApellido);
        txtSegundoApellido.sendKeys(segundoApellido);
        btnBuscar.click();
    }

    public void buscarCuentaPorIdentificacion(String tipoDocumento, String numeroDocumento) {
        txtPrimerNombre.clear();
        txtPrimerApellido.clear();
        txtSegundoNombre.clear();
        txtSegundoApellido.clear();
        txtTipoDocumento.clear();
        txtNumeroDocumento.clear();
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
        espera(msjMensajeInformativo, 2);
        assertThat(this.msjMensajeInformativo.getText(), containsString(mensaje));
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
        if(chkPrimerNombreExacto.isSelected()){
            assertThat("Check Primer Nombre Exacto Seleccionado", containsString("Check Primer Nombre Exacto No Seleccionado"));
        }else assertThat("Check Primer Nombre Exacto No Seleccionado", containsString("Check Primer Nombre Exacto No Seleccionado"));
        if(chkPrimerApellidoExacto.isSelected()){
            assertThat("Check Primer Nombre Exacto Seleccionado", containsString("Check Primer Nombre Exacto No Seleccionado"));
        }else assertThat("Check Primer Nombre Exacto No Seleccionado", containsString("Check Primer Nombre Exacto No Seleccionado"));
        if(chkNombreCompaniaExacto.isSelected()){
            assertThat("Check Primer Nombre Exacto Seleccionado", containsString("Check Primer Nombre Exacto No Seleccionado"));
        }else assertThat("Check Primer Nombre Exacto No Seleccionado", containsString("Check Primer Nombre Exacto No Seleccionado"));
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
        assertThat(this.lblNombreComercialExacto.getText(), containsString("Razón social coincide exactamente"));
        assertThat(this.lblNombreComercial.getText(), containsString("Nombre comercial"));
    }

    public void buscarCuentaPorRazonSocial(String razonSocial) {
        txtTipoDocumento.clear();
        txtNumeroDocumento.clear();
        txtPrimerNombre.clear();
        txtPrimerApellido.clear();
        txtNombreComercial.clear();
        txtRazonSocial.clear();
        txtRazonSocial.sendKeys(razonSocial);
        btnBuscar.click();
    }

    public void seleccionarTipoIdentificacion(String tipoDocumento){
        txtTipoDocumento.clear();
        txtTipoDocumento.sendKeys(tipoDocumento);
        txtTipoDocumento.sendKeys(Keys.ENTER);
    }

    public void buscarCuentaPorNombreComercial(String nombreComercial) {
        txtTipoDocumento.clear();
        txtNumeroDocumento.clear();
        txtPrimerNombre.clear();
        txtPrimerApellido.clear();
        txtRazonSocial.clear();
        txtNombreComercial.clear();
        txtNombreComercial.sendKeys(nombreComercial);
        btnBuscar.click();
    }
}