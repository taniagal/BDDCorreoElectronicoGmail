package com.sura.guidewire.policycenter.util.navegacion;

import java.io.Serializable;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.StepInterceptor;
import org.openqa.selenium.TimeoutException;
import org.slf4j.LoggerFactory;



public class PanelSuperiorElement extends PageObject implements Serializable {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    private static final long serialVersionUID = 1L;

    public static final String MENU_ESCRITORIO = "//a[@id='TabBar:DesktopTab']";

    public void irMenu(String opcion){
        try {
            findBy(opcion).waitUntilVisible();
            WebElementFacade menuEscritorio = findBy(opcion).waitUntilVisible();
            menuEscritorio.waitUntilClickable().click();

        } catch (TimeoutException e){
            LOGGER.info("Elemento del menú no encontrado | Elemento: " + opcion + "\n TRAZA: " + e);
        } catch (Exception e){
            LOGGER.info(e.toString());
        }
    }



}
