package com.sura.gw.navegacion.webelement;

import net.serenitybdd.core.pages.WebElementFacadeImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public class MenuPolizaWE extends WebElementFacadeImpl {

    public MenuPolizaWE(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds) {
        super(driver, locator, implicitTimeoutInMilliseconds);
    }

    public void consultarNumeroDeSubscripcion(String numSubscripcion) {
        String xpathTxtNumeroSubscripcion = ".//input[contains(@name,'SubmissionNumberSearchItem')]";
        findBy(xpathTxtNumeroSubscripcion).and().typeAndEnter(numSubscripcion);
    }

    public void consultarNumeroDePoliza(String numeroDePoliza) {
        String xpathTxtNumeroPoliza = ".//input[contains(@name,'PolicyRetrievalItem')]";
        findBy(xpathTxtNumeroPoliza).and().typeAndEnter(numeroDePoliza);
    }

    public void nuevaCotizacion(){
        String xpathBtnNuevaCotizacion = ".//a[contains(@id,'TabBar:PolicyTab:PolicyTab_NewSubmission-textEl')]";
        findBy(xpathBtnNuevaCotizacion).and().click();
    }
}
