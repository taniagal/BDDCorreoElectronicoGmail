package com.sura.gw.navegacion.util.widget;


import com.sura.gw.policy.runners.administracion.consulta.cuenta.pages.BusquedaDeCuentasPage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.steps.StepInterceptor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.LoggerFactory;

import java.util.List;

public class MenuBarNavWidgetPage extends PageObject {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    private static String MENU_EMERGENTE = ".//*[contains(@id, 'menu') and contains(@id, 'innerCt')]";
    private static String OPCIONES = ".//*[contains(@id, 'menu') and contains(@id, 'targetEl')]/div";
    private List<WebElement> opciones;

    public MenuBarNavWidgetPage enMenuContextual() {
        findBy(MENU_EMERGENTE).waitUntilVisible();
        shouldBeVisible(By.xpath(MENU_EMERGENTE));
        this.opciones = getDriver().findElements(By.xpath(OPCIONES));
        return this;
    }

    public <T extends PageObject> T seleccionarOpcion(String nombreDeOpcionDeMenu) {
        LOGGER.info("MenuBarNavWidgetPage.seleccionar");
        String mensajeError = null;

        WebElement opcionASeleccionar = null;
        for (WebElement opcionMenu : opciones){
            try {
                opcionASeleccionar = opcionMenu.findElement(By.xpath(".//a[contains(., '" + nombreDeOpcionDeMenu  + "')]"));
            } catch (Exception e) {
                continue;
            }
        }

        T pageObject = null;

        if (opcionASeleccionar != null) {

            switch (nombreDeOpcionDeMenu){
                case "Póliza":
                    break;
                case "Cuentas":
                    opcionASeleccionar.click();
                    pageObject = (T) switchToPage(BusquedaDeCuentasPage.class);
                    break;
                case "Código de agente":
                    break;
                case "Actividades":
                    break;
                case "Contactos":
                    break;
                default:
                    mensajeError = "OPCION:" + nombreDeOpcionDeMenu + " DE MENU SIN DEFINIR PÁGINA DE RETORNO";
            }

        } else {
            LOGGER.error("OPCION:" + nombreDeOpcionDeMenu + " DE MENU NO EXISTENTE EN EL MENÚ CONTEXTUAL");
            Serenity.throwExceptionsImmediately();
            Serenity.shouldThrowErrorsImmediately();
        }

        if (mensajeError != null) {
            LOGGER.error(mensajeError);
        }

        return pageObject;

    }

}
