package com.sura.guidewire.policycenter.pages.cuenta;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;


public class CuentasAsociadasAContactoPage extends PageUtil {

    @FindBy(xpath = "//td[@id='ContactFile:MenuLinks:ContactFile_ContactFile_Accounts']/div")
    private WebElementFacade mnuLateralCuenta;
    @FindBy(xpath = ".//*[@id='ContactFile_Accounts:AssociatedAccountsLV-body']/*/table/tbody/tr/td[2]")
    private WebElementFacade nombreContactoCuenta;
    @FindBy(xpath = ".//*[@id='ContactFile_Accounts:AssociatedAccountsLV-body']/*/table/tbody/tr/td[3]")
    private WebElementFacade direccionContactoCuenta;
    @FindBy(xpath = ".//*[@id='ContactFile_Accounts:AssociatedAccountsLV-body']/*/table/tbody/tr/td[4]")
    private WebElementFacade telContactoCuenta;
    @FindBy(xpath = ".//*[@id='ContactFile_Accounts:AssociatedAccountsLV-body']/*/table/tbody/tr/td[5]")
    private WebElementFacade emailContactoCuenta;
    @FindBy(xpath = ".//*[@id='ContactFile_Accounts:AssociatedAccountsLV-body']/*/table/tbody/tr/td[6]")
    private WebElementFacade rolesContactoCuenta;
    @FindBy(xpath = ".//*[@id='ContactFile_Accounts:panelRefInfoMessage:InfoMessage_ExtDV:message']")
    private WebElementFacade msjCuentaNoEncontrada;

    public CuentasAsociadasAContactoPage(WebDriver driver) {
        super(driver);
    }

    public void validarCamposLista(String nombre, String direccion,
                                   String telefono, String email, String rol) {
        withTimeoutOf(TIEMPO_15, TimeUnit.SECONDS).waitFor(mnuLateralCuenta).waitUntilPresent();
        mnuLateralCuenta.click();
        withTimeoutOf(TIEMPO_15, TimeUnit.SECONDS).waitFor(nombreContactoCuenta).waitUntilPresent();
        esperarHasta(TIEMPO_2000);
        MatcherAssert.assertThat("Error, no se encontró el contacto " + nombre + " but was: " + nombreContactoCuenta.getText()
                , nombreContactoCuenta.containsText(nombre));
        MatcherAssert.assertThat("Error, no se encontró la direccion " + direccion, direccionContactoCuenta.containsText(direccion));
        MatcherAssert.assertThat("Error, no se encontró el telefono " + telefono, telContactoCuenta.containsText(telefono));
        MatcherAssert.assertThat("Error, no se encontró el email " + email, emailContactoCuenta.containsText(email));
        MatcherAssert.assertThat("Error, no se encontró el rol " + rol + " but was: " + rolesContactoCuenta.getText(),
                rolesContactoCuenta.containsText(rol));
    }

    public void validarMensaje(String mensaje) {
        withTimeoutOf(TIEMPO_15, TimeUnit.SECONDS).waitFor(mnuLateralCuenta).waitUntilPresent();
        mnuLateralCuenta.click();
        withTimeoutOf(TIEMPO_15, TimeUnit.SECONDS).waitFor(msjCuentaNoEncontrada).waitUntilPresent();
        MatcherAssert.assertThat(msjCuentaNoEncontrada.getText(), Matchers.containsString(mensaje));
    }
}
