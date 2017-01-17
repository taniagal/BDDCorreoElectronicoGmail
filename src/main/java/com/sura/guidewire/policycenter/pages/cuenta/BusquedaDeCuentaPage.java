package com.sura.guidewire.policycenter.pages.cuenta;

import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class BusquedaDeCuentaPage extends PageObject {
    private static String TXT_NUMERO_DE_CUENTA = "//input[contains(@id,'AccountSearch:AccountSearchScreen:AccountSearchDV:AccountNumber-inputEl')]";
    private static String BTN_BUSCAR = "//a[contains(@id,'AccountSearch:AccountSearchScreen:AccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search')]";
    protected static final int TIEMPO_5 = 5;

    public BusquedaDeCuentaPage(WebDriver driver) {
        super(driver);
    }

    public BusquedaDeCuentaPage ingresar() {
        return this;
    }

    public BusquedaDeCuentaPage luego() {
        return this;
    }

    public BusquedaDeCuentaPage numeroDeCuenta(String numeroDeCuenta) {
        waitForRenderedElementsToBePresent(By.xpath(TXT_NUMERO_DE_CUENTA));
        element(TXT_NUMERO_DE_CUENTA).waitUntilEnabled();
        enter(numeroDeCuenta).into(element(TXT_NUMERO_DE_CUENTA));

        return this;
    }

    public BusquedaDeCuentaPage buscar() {
        element(BTN_BUSCAR).click();
        return this;
    }

    public CuentaPages seleccionarCuenta(String numCuenta) {
        find(By.linkText(numCuenta)).waitUntilVisible();
        find(By.linkText(numCuenta)).waitUntilClickable();
        WebElementFacade enlaceNumCuenta = find(By.linkText(numCuenta)).waitUntilVisible();
        shouldBeVisible(enlaceNumCuenta);
        enlaceNumCuenta.click();
        fluent().await().atMost(TIEMPO_5, TimeUnit.SECONDS);
        return switchToPage(CuentaPages.class);
    }
}
