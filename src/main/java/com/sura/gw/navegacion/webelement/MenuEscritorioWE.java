package com.sura.gw.navegacion.webelement;

import net.serenitybdd.core.pages.WebElementFacadeImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public class MenuEscritorioWE extends WebElementFacadeImpl {
    public MenuEscritorioWE(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds) {
        super(driver, locator, implicitTimeoutInMilliseconds);
    }

    public void misActividades() {
        String xpathLinkMisActividades = ".//a[contains(.,'Mis Actividades')]";
        findBy(xpathLinkMisActividades).and().click();
    }

    public void misCuentas() {
        String xpathLinkMisCuentas = ".//a[contains(.,'Mis cuentas')]";
        findBy(xpathLinkMisCuentas).and().click();
    }

    public void misEnvios(){
        String xpathLinkMisEnvios = ".//a[contains(.,'Mis envíos')]";
        findBy(xpathLinkMisEnvios).and().click();
    }

    public void misRenovaciones(){
        String xpathLinkMisRenovaciones = ".//a[contains(.,'Mis renovaciones')]";
        findBy(xpathLinkMisRenovaciones).and().click();
    }

    public void misOtrasTransaccionesDePoliza(){
        String xpathLinkMisOtrasTransacciones = ".//a[contains(.,'Mis otras transacciones de póliza')]";
        findBy(xpathLinkMisOtrasTransacciones).and().click();
    }

    public void misColas(){
        String xpathLinkMisColas = ".//a[contains(.,'Mis colas')]";
        findBy(xpathLinkMisColas).and().click();
    }
}
