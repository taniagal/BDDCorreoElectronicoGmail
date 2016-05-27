package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.SeusLoginPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

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
        mnuLateralCuenta.click();
        assertThat(nombreContactoCuenta.getText(), containsString(nombre));
        assertThat(direccionContactoCuenta.getText(), containsString(direccion));
        assertThat(telContactoCuenta.getText(), containsString(telefono));
        assertThat(emailContactoCuenta.getText(), containsString(email));
        assertThat(rolesContactoCuenta.getText(), containsString(rol));
    }

    public void validarMensaje(String mensaje) {
        mnuLateralCuenta.waitUntilClickable();
        mnuLateralCuenta.click();
        assertThat(msjCuentaNoEncontrada.getText(), containsString(mensaje));
    }
}
