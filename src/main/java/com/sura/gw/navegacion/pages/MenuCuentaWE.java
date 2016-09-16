package com.sura.gw.navegacion.pages;

import net.serenitybdd.core.pages.WebElementFacadeImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public class MenuCuentaWE extends WebElementFacadeImpl {
    public MenuCuentaWE(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds) {
        super(driver, locator, implicitTimeoutInMilliseconds);
    }

    public enum Opcion {
        BTN_NUEVA_CUENTA("//a[contains(.,'Nueva cuenta')]"),
        TXT_NUMERO_DE_CUENTA("//input[contains(@id,'AccountNumberSearchItem-inputEl')]");

        private String elemento;
        Opcion(String opcion) {
            this.elemento = opcion;
        }
        public String xpath() {
            return elemento;
        }
    }

    public void nuevaCuenta() {
        findBy(Opcion.BTN_NUEVA_CUENTA.xpath()).and().click();
    }

    public void consultarNumeroDeCuenta(String numeroDeCuenta) {
        findBy(Opcion.TXT_NUMERO_DE_CUENTA.xpath()).and().typeAndEnter(numeroDeCuenta);
    }

}
