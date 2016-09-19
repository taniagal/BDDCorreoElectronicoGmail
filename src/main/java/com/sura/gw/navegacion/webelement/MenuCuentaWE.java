package com.sura.gw.navegacion.webelement;

import net.serenitybdd.core.pages.WebElementFacadeImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public class MenuCuentaWE extends WebElementFacadeImpl {
    public MenuCuentaWE(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds) {
        super(driver, locator, implicitTimeoutInMilliseconds);
    }

    public void nuevaCuenta() {
        String xpathBtnNuevaCuenta = "//a[contains(.,'Nueva cuenta')]";
        findBy(xpathBtnNuevaCuenta).and().click();
    }

    public void consultarNumeroDeCuenta(String numeroDeCuenta) {
        String xpathTxtNumeroDeCuenta = "//input[contains(@id,'AccountNumberSearchItem-inputEl')]";
        findBy(xpathTxtNumeroDeCuenta).and().typeAndEnter(numeroDeCuenta);
    }

}
