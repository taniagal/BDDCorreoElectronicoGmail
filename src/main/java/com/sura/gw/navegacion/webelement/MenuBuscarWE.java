package com.sura.gw.navegacion.webelement;

import net.serenitybdd.core.pages.WebElementFacadeImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public class MenuBuscarWE extends WebElementFacadeImpl {

    public MenuBuscarWE(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds) {
        super(driver, locator, implicitTimeoutInMilliseconds);
    }

    public enum Opcion {
        LINK_POLIZAS(".//a[contains(., 'Pólizas')]"),
        LINK_CUENTAS(".//a[contains(., 'Cuentas')]"),
        LINK_CODIGO_DE_AGENTE(".//a[contains(., 'Código de agente')]"),
        LINK_ACTIVIDADES(".//a[contains(., 'Actividades')]"),
        LINK_CONTACTOS(".//a[contains(., 'Contactos')]");

        private String elemento;
        Opcion(String opcion) {
            this.elemento = opcion;
        }
        public String xpath() {
            return elemento;
        }
    }

    public void polizas() {
        findBy(Opcion.LINK_POLIZAS.xpath()).and().click();
    }

    public void cuentas() {
        findBy(Opcion.LINK_CUENTAS.xpath()).and().click();
    }

    public void codigoDeAgente() {
        findBy(Opcion.LINK_CODIGO_DE_AGENTE.xpath()).and().click();
    }

    public void actividades() {
        findBy(Opcion.LINK_ACTIVIDADES.xpath()).and().click();
    }

    public void contactos() {
        findBy(Opcion.LINK_CONTACTOS.xpath()).and().click();
    }

}
