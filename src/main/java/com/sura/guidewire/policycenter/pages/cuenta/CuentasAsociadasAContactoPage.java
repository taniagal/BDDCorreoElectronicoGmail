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
    @FindBy(xpath = ".//*[@id='ContactFile_Accounts:panelRefInfoMessage:InfoMessage_ExtDV:message']")
    private WebElementFacade msjCuentaNoEncontrada;
    @FindBy(xpath = ".//*[@id='ContactFile_Accounts:AssociatedAccountsLV-body']")
    private WebElementFacade tablaResultados;

    public CuentasAsociadasAContactoPage(WebDriver driver) {
        super(driver);
    }

    public void validarCamposLista(String nombre, String direccion,
                                   String telefono, String email, String rol) {
        withTimeoutOf(TIEMPO_15, TimeUnit.SECONDS).waitFor(mnuLateralCuenta).waitUntilPresent();
        mnuLateralCuenta.click();
        withTimeoutOf(TIEMPO_15, TimeUnit.SECONDS).waitFor(nombreContactoCuenta).waitUntilPresent();
        waitForTextToAppear(nombre);
        MatcherAssert.assertThat("Error, no se encontró el contacto " + nombre, tablaResultados.containsText(nombre));
        MatcherAssert.assertThat("Error, no se encontró la direccion " + direccion, tablaResultados.containsText(direccion));
        MatcherAssert.assertThat("Error, no se encontró el telefono " + telefono, tablaResultados.containsText(telefono));
        MatcherAssert.assertThat("Error, no se encontró el email " + email, tablaResultados.containsText(email));
        MatcherAssert.assertThat("Error, no se encontró el rol " + rol, tablaResultados.containsText(rol));
    }

    public void validarMensaje(String mensaje) {
        withTimeoutOf(TIEMPO_15, TimeUnit.SECONDS).waitFor(mnuLateralCuenta).waitUntilPresent();
        mnuLateralCuenta.click();
        withTimeoutOf(TIEMPO_15, TimeUnit.SECONDS).waitFor(msjCuentaNoEncontrada).waitUntilPresent();
        MatcherAssert.assertThat(msjCuentaNoEncontrada.getText(), Matchers.containsString(mensaje));
    }
}
