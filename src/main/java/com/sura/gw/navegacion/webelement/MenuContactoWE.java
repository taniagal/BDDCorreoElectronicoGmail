package com.sura.gw.navegacion.webelement;

import net.serenitybdd.core.pages.WebElementFacadeImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public class MenuContactoWE extends WebElementFacadeImpl {

    public MenuContactoWE(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds) {
        super(driver, locator, implicitTimeoutInMilliseconds);
    }

    public void nuevoContacto() {
        String xpathLinkNuevoContacto = ".//a[contains(., 'Nuevo contacto')]";
        findBy(xpathLinkNuevoContacto).and().click();
    }

    public void buscar() {
        String xpathLinkBuscar = ".//a[contains(., 'Buscar')]";
        findBy(xpathLinkBuscar).and().click();
    }

}
