package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.SeusLoginPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class BusquedaDeCuentasPage extends SeusLoginPage {


    @FindBy(xpath=".//*[@id='TabBar:SearchTab']")
    WebElementFacade mnuBuscar;

    @FindBy(xpath=" .//*[@id='TabBar:SearchTab:Search_AccountSearch']")
    WebElementFacade mnuBuscarCuenta;

    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:GlobalPersonNameInputSet:FirstName-inputEl']")
    WebElementFacade txtPrimerNombre;

    @FindBy(xpath=".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:GlobalPersonNameInputSet:LastName-inputEl']")
    WebElementFacade txtPrimerApellido;

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
        try{
            Actions act = new Actions(getDriver());
            mnuBuscar.click();
            Thread.sleep(1000);
            mnuBuscar.click();
            act.sendKeys(Keys.ARROW_DOWN).build().perform();
            act.moveToElement(mnuBuscarCuenta).click().build().perform();
            Thread.sleep(2000);
            } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void buscarCuentaPorNombreYApellido(String primerNombre, String primerApellido) {
        txtPrimerNombre.clear();
        txtPrimerApellido.clear();
        txtPrimerNombre.sendKeys(primerNombre);
        txtPrimerApellido.sendKeys(primerApellido);
        btnBuscar.click();
    }

    public void buscarCuentaPorIdentificacion(String tipoDocumento, String numeroDocumento) {
//        txtPrimerNombre.clear();
//        txtPrimerApellido.clear();
//        txtPrimerNombre.sendKeys(primerNombre);
//        txtPrimerApellido.sendKeys(primerApellido);
//        btnBuscar.click();
    }

    public void mostrarInformacionDeLaCuenta(String numeroCuenta, String nombre, String direccion) {
        assertThat(this.grdNumeroCuenta.getText(), containsString(numeroCuenta));
        assertThat(this.grdNombre.getText(), containsString(nombre));
        assertThat(this.grdDireccion.getText(), containsString(direccion));
    }

    public void validarMensaje(String mensaje) {
        assertThat(this.msjMensajeInformativo.getText(), containsString(mensaje));
    }
}