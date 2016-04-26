package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.SeusLoginPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ContactAssociatedAccount extends SeusLoginPage {

    @FindBy(xpath="//td[@id='ContactFile:MenuLinks:ContactFile_ContactFile_Accounts']/div")
    WebElementFacade mnuLateralCuenta;

    @FindBy(xpath="//div/table/tbody/tr/td[2]/div")
    WebElementFacade nombreContactoCuenta;

    @FindBy(xpath="//td[3]/div")
    WebElementFacade direccionContactoCuenta;

    @FindBy(xpath="//td[4]/div")
    WebElementFacade telContactoCuenta;

    @FindBy(xpath="//td[5]/div")
    WebElementFacade emailContactoCuenta;

    @FindBy(xpath="//td[6]/div")
    WebElementFacade rolesContactoCuenta;

    @FindBy(xpath = ".//*[@id='ContactFile_Accounts:panelRefInfoMessage:InfoMessage_ExtDV:message']")
    WebElementFacade msjCuentaNoEncontrada;

    public ContactAssociatedAccount(WebDriver driver) {
        super(driver);
    }

    public void assertCamposLista(String nombre, String direccion,
                                  String telefono, String email, String rol){
        mnuLateralCuenta.click();
        assertThat(nombreContactoCuenta.getText().toString(), containsString(nombre));
        assertThat(direccionContactoCuenta.getText().toString(), containsString(direccion));
        assertThat(telContactoCuenta.getText().toString(), containsString(telefono));
        assertThat(emailContactoCuenta.getText().toString(), containsString(email));
        assertThat(rolesContactoCuenta.getText().toString(), containsString(rol));
    }

    public void validarMensaje(String mensaje) {
        mnuLateralCuenta.click();
        assertThat(msjCuentaNoEncontrada.getText().toString(), containsString(mensaje));
    }
}
