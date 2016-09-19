package com.sura.gw.navegacion.webelement;


import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementFacadeImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public class MenuAdministracionWE extends WebElementFacadeImpl{

    private static final String XPATH_CONTENEDOR_SUBMENU_DESPLEGABLE = "//div[contains(@class, 'x-panel x-layer x-panel-default x-menu x-border-box')]";

    private static WebElementFacade subMenuDesplegado = null;

    public MenuAdministracionWE(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds) {
        super(driver, locator, implicitTimeoutInMilliseconds);
        subMenuDesplegado = findBy(XPATH_CONTENEDOR_SUBMENU_DESPLEGABLE);
    }

    public void consultarNumeroDeSubscripcion(String numSubscripcion) {
        String xpathTxtNumeroSubscripcion = ".//input[contains(@name,'SubmissionNumberSearchItem')]";
        subMenuDesplegado.findBy(xpathTxtNumeroSubscripcion).and().typeAndEnter(numSubscripcion);
    }

    public void consultarNumeroDePoliza(String numeroDepoliza) {
        String xpathTxtNumeroDePoliza = ".//input[contains(@name,'PolicyRetrievalItem')]";
        subMenuDesplegado.findBy(xpathTxtNumeroDePoliza).and().typeAndEnter(numeroDepoliza);
    }

    public void nuevaCotizacion(){
        String xpathBtnNuevaCotizacion = ".//a[contains(@id,'TabBar:PolicyTab:PolicyTab_NewSubmission-textEl')]";
        subMenuDesplegado.findBy(xpathBtnNuevaCotizacion).and().click();
    }
}
