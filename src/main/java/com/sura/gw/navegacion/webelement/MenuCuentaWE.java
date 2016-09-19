package com.sura.gw.navegacion.webelement;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementFacadeImpl;
import org.openqa.selenium.WebDriver;

public class MenuCuentaWE {

    WebElementFacade webElement = null;

    public MenuCuentaWE(WebDriver driver, long implicitTimeoutInMilliseconds) {
        webElement = new WebElementFacadeImpl(driver, null, implicitTimeoutInMilliseconds);
    }

    public void nuevaCuenta() {
        String xpathBtnNuevaCuenta = "//a[contains(.,'Nueva cuenta')]";
        webElement.findBy(xpathBtnNuevaCuenta).and().click();
    }

    public void consultarNumeroDeCuenta(String numeroDeCuenta) {
        String xpathTxtNumeroDeCuenta = "//input[contains(@id,'AccountNumberSearchItem-inputEl')]";
        webElement.findBy(xpathTxtNumeroDeCuenta).and().typeAndEnter(numeroDeCuenta);
    }

}
