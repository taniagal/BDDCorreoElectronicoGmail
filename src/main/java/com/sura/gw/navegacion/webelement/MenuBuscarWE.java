package com.sura.gw.navegacion.webelement;

import net.serenitybdd.core.pages.WebElementFacadeImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public class MenuBuscarWE extends WebElementFacadeImpl {

    public MenuBuscarWE(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds) {
        super(driver, locator, implicitTimeoutInMilliseconds);
    }

    public void polizas() {
        String xpathLinkPolizas = ".//a[contains(., 'Pólizas')]";
        findBy(xpathLinkPolizas).and().click();
    }

    public void cuentas() {
        String xpathLinkCuentas = ".//a[contains(., 'Cuentas')]";
        findBy(xpathLinkCuentas).and().click();
    }

    public void codigoDeAgente() {
        String xpathLinkCodigoAgente = ".//a[contains(., 'Código de agente')]";
        findBy(xpathLinkCodigoAgente).and().click();
    }

    public void actividades() {
        String xpathLinkActividades = ".//a[contains(., 'Actividades')]";
        findBy(xpathLinkActividades).and().click();
    }

    public void contactos() {
        String xpathLinkContactos = ".//a[contains(., 'Contactos')]";
        findBy(xpathLinkContactos).and().click();
    }

}
