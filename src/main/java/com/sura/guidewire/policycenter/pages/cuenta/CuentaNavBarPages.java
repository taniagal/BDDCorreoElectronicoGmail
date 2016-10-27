package com.sura.guidewire.policycenter.pages.cuenta;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class CuentaNavBarPages extends PageObject {
    private static String MENU_CUENTA = ".//a[contains(@id,'TabBar:AccountTab')]";

    public enum Opcion {
        BTN_NUEVA_CUENTA("//span[@id='TabBar:AccountTab:AccountTab_NewAccount-textEl']"),
        TXT_NUMERO_COTIZACION("//input[contains(@name,'AccountNumberSearchItem')]");

        private String elemento;
        Opcion(String opcion) {
            this.elemento = opcion;
        }
        public String xpath() {
            return elemento;
        }
    }


    public CuentaNavBarPages seleccionarMenu() {
        waitFor(5).seconds();
        findBy(MENU_CUENTA).waitUntilVisible();

        WebElement menuBuscar = getDriver().findElement(By.xpath(MENU_CUENTA));
        element(menuBuscar).setWindowFocus();
        element(menuBuscar).sendKeys(Keys.ARROW_DOWN);
        waitFor(2).seconds();
        return switchToPage(CuentaNavBarPages.class);
    }


    public void _consultarNumeroDeCuenta(String numCuenta) {
        ingresarValorEnInputYTeclearEnter(Opcion.TXT_NUMERO_COTIZACION.xpath(), numCuenta);
    }

    public void ingresarValorEnInputYTeclearEnter(String xpathInput, String valorInput) {
        findBy(xpathInput).waitUntilEnabled();
        enter(valorInput).into(element(xpathInput));
        getDriver().switchTo().activeElement().sendKeys(Keys.ENTER);
    }
}
