package com.sura.guidewire.policycenter.util.navegacion.pages;

import com.sura.guidewire.policycenter.util.navegacion.util.widget.MenuBarNavWidgetPage;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class BuscarNavBarPages extends PageObject {
    private static String MENU_BUSCAR = ".//a[contains(@id,'TabBar:SearchTab')]";

    public enum Opciones {
        POLIZA("Pólizas"),
        CUENTAS("Cuentas"),
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


    public MenuBarNavWidgetPage seleccionarOpcion() {
        findBy(MENU_BUSCAR).waitUntilVisible();

        WebElement menuBuscar = getDriver().findElement(By.xpath(MENU_BUSCAR));
        element(menuBuscar).setWindowFocus();
        element(menuBuscar).sendKeys(Keys.ARROW_DOWN);
        fluent().await().atMost(2, TimeUnit.SECONDS);
        return switchToPage(MenuBarNavWidgetPage.class);
    }




}
