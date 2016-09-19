package com.sura.gw.navegacion.webelement;

import net.serenitybdd.core.pages.WebElementFacadeImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public class MenuEscritorioWE extends WebElementFacadeImpl {
    public MenuEscritorioWE(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds) {
        super(driver, locator, implicitTimeoutInMilliseconds);
    }

    public enum Opcion {
        LINK_MIS_ACTIVIDADES(".//a[contains(.,'Mis Actividades"),
        LINK_MIS_CUENTAS(".//a[contains(.,'Mis cuentas"),
        LINK_MIS_ENVIOS(".//a[contains(.,'Mis envíos"),
        LINK_MIS_RENOVACIONES(".//a[contains(.,'Mis renovaciones"),
        LINK_MIS_OTRAS_TRANSACCIONES_DE_POLIZA("Mis otras transacciones de póliza"),
        LINK_MIS_COLAS(".//a[contains(.,'Mis colas");

        private String elemento;
        Opcion(String opcion) {
            this.elemento = opcion;
        }
        public String xpath() {
            return elemento;
        }
    }

    public void misActividades() {
        findBy(Opcion.LINK_MIS_ACTIVIDADES.xpath()).and().click();
    }

    public void misCuentas() {
        findBy(Opcion.LINK_MIS_CUENTAS.xpath()).and().click();
    }

    public void misEnvios(){
        findBy(Opcion.LINK_MIS_ENVIOS.xpath()).and().click();
    }

    public void misRenovaciones(){
        findBy(Opcion.LINK_MIS_RENOVACIONES.xpath()).and().click();
    }

    public void misOtrasTransaccionesDePoliza(){
        findBy(Opcion.LINK_MIS_OTRAS_TRANSACCIONES_DE_POLIZA.xpath()).and().click();
    }

    public void misColas(){
        findBy(Opcion.LINK_MIS_COLAS.xpath()).and().click();
    }
}
