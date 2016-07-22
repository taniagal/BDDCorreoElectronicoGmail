package com.sura.gw.policy.cuenta.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class BusquedaDeCuentasPage extends PageObject {
    private static String TXT_NUMERO_DE_CUENTA = "//input[contains(@id,'AccountSearch:AccountSearchScreen:AccountSearchDV:AccountNumber-inputEl')]";
    private static String BTN_BUSCAR = "//a[contains(@id,'AccountSearch:AccountSearchScreen:AccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search')]";
    private static String PRIMER_REGISTRO = "//a[@id='AccountSearch:AccountSearchScreen:AccountSearchResultsLV:0:AccountNumber']";

    public BusquedaDeCuentasPage(WebDriver driver) {
        super(driver);
    }

    public BusquedaDeCuentasPage ingresar() {
        return this;
    }

    public BusquedaDeCuentasPage luego() {
        return this;
    }

    public BusquedaDeCuentasPage numeroDeCuenta(String numeroDeCuenta) {
        waitForRenderedElementsToBePresent(By.xpath(TXT_NUMERO_DE_CUENTA));
        element(TXT_NUMERO_DE_CUENTA).waitUntilEnabled();
        enter(numeroDeCuenta).into(element(TXT_NUMERO_DE_CUENTA));

        return this;
    }

    public BusquedaDeCuentasPage buscar() {
        element(BTN_BUSCAR).click();
        return this;
    }

    public CuentaPages seleccionarCuenta(String numCuenta) {
        find(By.linkText(numCuenta)).waitUntilVisible();
        find(By.linkText(numCuenta)).waitUntilClickable();
        WebElementFacade enlaceNumCuenta = find(By.linkText(numCuenta)).waitUntilVisible();
        shouldBeVisible(enlaceNumCuenta);
        enlaceNumCuenta.click();
//        waitForTextToAppear("Resumen de la cuenta");
        fluent().await().atMost(5, TimeUnit.SECONDS);
        return switchToPage(CuentaPages.class);
    }


    public BusquedaDeCuentasPage por() {
        return this;
    }

    public BusquedaDeCuentasPage entonces() {
        return this;
    }
}
