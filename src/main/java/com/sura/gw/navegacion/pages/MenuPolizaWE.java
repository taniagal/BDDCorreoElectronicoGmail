package com.sura.gw.navegacion.pages;

import net.serenitybdd.core.pages.WebElementFacadeImpl;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public class MenuPolizaWE extends WebElementFacadeImpl {

    public MenuPolizaWE(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds) {
        super(driver, locator, implicitTimeoutInMilliseconds);
    }

    public void consultarNumeroDeSubscripcion(String numSubscripcion) {
        ingresarValorEnInputYTeclearEnter(PolizaNavBarPages.Opcion.TXT_NUMERO_SUBSCRIPCION.xpath(), numSubscripcion);
    }

    public void consultarNumeroDePoliza(String numeroDepoliza) {
        ingresarValorEnInputYTeclearEnter(PolizaNavBarPages.Opcion.TXT_NUMERO_POLIZA.xpath(), numeroDepoliza);
    }

    public void ingresarValorEnInputYTeclearEnter(String xpathInput, String valorInput) {
        findBy(xpathInput).waitUntilEnabled();
        enter(valorInput).into(element(xpathInput));
        getDriver().switchTo().activeElement().sendKeys(Keys.ENTER);
    }
}
