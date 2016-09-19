package com.sura.gw.navegacion.webelement;

import net.serenitybdd.core.pages.WebElementFacadeImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public class MenuContactoWE extends WebElementFacadeImpl {

    public MenuContactoWE(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds) {
        super(driver, locator, implicitTimeoutInMilliseconds);
    }
    public enum Opcion {
        LINK_NUEVO_CONTACTO(".//a[contains(., 'Nuevo contacto')]"),
        LINK_BUSCAR(".//a[contains(., 'Buscar')]");

        private String elemento;
        Opcion(String opcion) {
            this.elemento = opcion;
        }
        public String xpath() {
            return elemento;
        }
    }

    public void nuevoContacto() {
        //
    }

    public void buscar() {
        findBy(Opcion.LINK_BUSCAR.xpath()).and().click();
    }

}
