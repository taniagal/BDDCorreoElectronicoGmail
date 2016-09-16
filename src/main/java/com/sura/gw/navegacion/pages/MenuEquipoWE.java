package com.sura.gw.navegacion.pages;

import net.serenitybdd.core.pages.WebElementFacadeImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public class MenuEquipoWE extends WebElementFacadeImpl {
    public enum Opcion {
        BTN_NUEVA_COTIZACION(".//a[contains(@id,'TabBar:PolicyTab:PolicyTab_NewSubmission-textEl')]"),
        TXT_NUMERO_SUBSCRIPCION(".//input[contains(@name,'SubmissionNumberSearchItem')]"),
        TXT_NUMERO_POLIZA(".//input[contains(@name,'PolicyRetrievalItem')]");

        private String elemento;
        Opcion(String opcion) {
            this.elemento = opcion;
        }
        public String xpath() {
            return elemento;
        }
    }

    public MenuEquipoWE(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds) {
        super(driver, locator, implicitTimeoutInMilliseconds);
    }

    public void consultarNumeroDeSubscripcion(String numSubscripcion) {
        findBy(Opcion.TXT_NUMERO_SUBSCRIPCION.xpath()).and().typeAndEnter(numSubscripcion);
    }

    public void consultarNumeroDePoliza(String numeroDepoliza) {
        findBy(Opcion.TXT_NUMERO_POLIZA.xpath()).and().typeAndEnter(numeroDepoliza);
    }

    public void nuevaCotizacion(){
        findBy(Opcion.BTN_NUEVA_COTIZACION.xpath()).and().click();
    }
}
