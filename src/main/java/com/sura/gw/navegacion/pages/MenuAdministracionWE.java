package com.sura.gw.navegacion.pages;


import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementFacadeImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public class MenuAdministracionWE extends WebElementFacadeImpl{

    private static final String XPATH_CONTENEDOR_SUBMENU_DESPLEGABLE = "//div[contains(@class, 'x-panel x-layer x-panel-default x-menu x-border-box')]";

    WebElementFacade subMenuDesplegado = null;

    public MenuAdministracionWE(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds) {
        super(driver, locator, implicitTimeoutInMilliseconds);
        subMenuDesplegado = findBy(XPATH_CONTENEDOR_SUBMENU_DESPLEGABLE);
    }
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

    public void consultarNumeroDeSubscripcion(String numSubscripcion) {
        subMenuDesplegado.findBy(Opcion.TXT_NUMERO_SUBSCRIPCION.xpath()).and().typeAndEnter(numSubscripcion);
    }

    public void consultarNumeroDePoliza(String numeroDepoliza) {
        subMenuDesplegado.findBy(Opcion.TXT_NUMERO_POLIZA.xpath()).and().typeAndEnter(numeroDepoliza);
    }

    public void nuevaCotizacion(){
        subMenuDesplegado.findBy(Opcion.BTN_NUEVA_COTIZACION.xpath()).and().click();
    }
}
