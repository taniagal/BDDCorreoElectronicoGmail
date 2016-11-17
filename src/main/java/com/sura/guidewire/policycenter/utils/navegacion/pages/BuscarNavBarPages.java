package com.sura.guidewire.policycenter.utils.navegacion.pages;

import com.sura.guidewire.policycenter.utils.PageUtil;
import com.sura.guidewire.policycenter.utils.navegacion.util.widget.MenuBarNavWidgetPage;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BuscarNavBarPages extends PageObject {
    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:AccountNumber-inputEl']")
    private WebElementFacade lblCuenta;
    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade btnBuscaCuenta;
    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchResultsLV:0:AccountNumber']")
    private WebElementFacade linkCuenta;

    protected static final int WAIT_TIME_1000 = 1000;
    protected static final int WAIT_TIME_2 = 2;
    private static String MENU_BUSCAR = ".//a[contains(@id,'TabBar:SearchTab')]";

    public enum Opciones {
        POLIZA("Pólizas"),
        CUENTAS(".//a[contains(*,'Cuentas')]"),
        CODIGO_AGENTE("Código de agente"),
        ACTIVIDADES("Actividades"),
        CONTACTOS("Contactos");

        private String opcion;

        Opciones(String opcion) {
            this.opcion = opcion;
        }

        public String nombre() {
            return opcion;
        }
    }

    public void navegacionBuscarCuenta(String numCuenta) {
        lblCuenta.clear();
        lblCuenta.sendKeys(numCuenta);
        btnBuscaCuenta.click();
        PageUtil.waitUntil(WAIT_TIME_1000);
        linkCuenta.click();
    }


    public MenuBarNavWidgetPage seleccionarOpcion() {
        findBy(MENU_BUSCAR).waitUntilVisible();
        WebElement menuBuscar = getDriver().findElement(By.xpath(MENU_BUSCAR));
        element(menuBuscar).setWindowFocus();
        element(menuBuscar).sendKeys(Keys.ARROW_DOWN);
        fluent().await().atMost(WAIT_TIME_2, TimeUnit.SECONDS);
        return switchToPage(MenuBarNavWidgetPage.class);
    }

    public void clicenOpcionCuentas() {
        findBy(Opciones.CUENTAS.nombre()).waitUntilVisible().click();
    }
}
