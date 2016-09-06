package com.sura.gw.navegacion.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class PolizaNavBarPages extends PageObject {
    private static String MENU_POLIZA = ".//a[contains(@id,'TabBar:PolicyTab')]";

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


    public PolizaNavBarPages seleccionarMenu() {
        waitFor(2).seconds();
        findBy(MENU_POLIZA).waitUntilVisible();

        WebElement menuBuscar = getDriver().findElement(By.xpath(MENU_POLIZA));
        element(menuBuscar).setWindowFocus();
        element(menuBuscar).sendKeys(Keys.ARROW_DOWN);
        waitFor(2).seconds();
        return switchToPage(PolizaNavBarPages.class);
    }


    public void _consultarNumeroDeSubscripcion(String numSubscripcion) {
        ingresarValorEnInputYTeclearEnter(Opcion.TXT_NUMERO_SUBSCRIPCION.xpath(), numSubscripcion);
    }

    public void consultarNumeroDePoliza(String numeroDepoliza) {
        ingresarValorEnInputYTeclearEnter(Opcion.TXT_NUMERO_POLIZA.xpath(), numeroDepoliza);
    }

    public void ingresarValorEnInputYTeclearEnter(String xpathInput, String valorInput) {
        findBy(xpathInput).waitUntilEnabled();
        enter(valorInput).into(element(xpathInput));
        getDriver().switchTo().activeElement().sendKeys(Keys.ENTER);
    }
}
