package com.sura.guidewire.policycenter.pages.cuenta;

import java.util.concurrent.TimeUnit;

import com.sura.guidewire.policycenter.pages.SeusLoginPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;



public class CuentasAsociadasAContactoPage extends SeusLoginPage {

    @FindBy(xpath="//td[@id='ContactFile:MenuLinks:ContactFile_ContactFile_Accounts']/div")
    private WebElementFacade mnuLateralCuenta;
    @FindBy(xpath="//div/table/tbody/tr/td[2]/div")
    private WebElementFacade nombreContactoCuenta;
    @FindBy(xpath="//td[3]/div")
    private WebElementFacade direccionContactoCuenta;
    @FindBy(xpath="//td[4]/div")
    private WebElementFacade telContactoCuenta;
    @FindBy(xpath="//td[5]/div")
    private WebElementFacade emailContactoCuenta;
    @FindBy(xpath="//td[6]/div")
    private WebElementFacade rolesContactoCuenta;
    @FindBy(xpath = ".//*[@id='ContactFile_Accounts:panelRefInfoMessage:InfoMessage_ExtDV:message']")
    private WebElementFacade msjCuentaNoEncontrada;

    public CuentasAsociadasAContactoPage(WebDriver driver) {
        super(driver);
    }

    public void validarCamposLista(String nombre, String direccion,
                                   String telefono, String email, String rol){
        withTimeoutOf(WAIT_TIME_15, TimeUnit.SECONDS).waitFor(mnuLateralCuenta).waitUntilPresent();
        mnuLateralCuenta.click();
        withTimeoutOf(WAIT_TIME_15, TimeUnit.SECONDS).waitFor(nombreContactoCuenta).waitUntilPresent();
        MatcherAssert.assertThat(nombreContactoCuenta.getText(), Matchers.containsString(nombre));
        MatcherAssert.assertThat(direccionContactoCuenta.getText(), Matchers.containsString(direccion));
        MatcherAssert.assertThat(telContactoCuenta.getText(), Matchers.containsString(telefono));
        MatcherAssert.assertThat(emailContactoCuenta.getText(), Matchers.containsString(email));
        MatcherAssert.assertThat(rolesContactoCuenta.getText(), Matchers.containsString(rol));
    }

    public void validarMensaje(String mensaje) {
        withTimeoutOf(WAIT_TIME_15, TimeUnit.SECONDS).waitFor(mnuLateralCuenta).waitUntilPresent();
        mnuLateralCuenta.click();
        withTimeoutOf(WAIT_TIME_15, TimeUnit.SECONDS).waitFor(msjCuentaNoEncontrada).waitUntilPresent();
        MatcherAssert.assertThat(msjCuentaNoEncontrada.getText(), Matchers.containsString(mensaje));
    }
}
