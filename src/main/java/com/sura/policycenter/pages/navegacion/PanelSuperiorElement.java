package com.sura.policycenter.pages.navegacion;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.steps.StepInterceptor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

public class PanelSuperiorElement extends PageObject implements Serializable {

    

    private static final long serialVersionUID = 1L;
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    public static final String MENU_ESCRITORIO = "//a[@id='TabBar:DesktopTab']";

    public void irMenu(String opcion){
        try {
            waitFor(opcion).shouldBeDisplayed();
            $(opcion).click();
        } catch (TimeoutException e){
            throw new NoSuchElementException("ERROR000: Elemento del menú no encontrado | Elemento: " + opcion);
        } catch (Exception e){
            LOGGER.error("ERROR: Error desconocido en: PanelSuperiorElement.irMenu");
        }
    }



}
