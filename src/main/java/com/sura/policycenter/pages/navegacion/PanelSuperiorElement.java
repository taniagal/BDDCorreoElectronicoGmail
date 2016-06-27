package com.sura.policycenter.pages.navegacion;

import java.io.Serializable;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;


public class PanelSuperiorElement extends PageObject implements Serializable {

    

    private static final long serialVersionUID = 1L;

    public static final String MENU_ESCRITORIO = "//a[@id='TabBar:DesktopTab']";

    public void irMenu(String opcion){
        try {
            waitFor(opcion).shouldBeDisplayed();
            $(opcion).click();
        } catch (TimeoutException e){
            throw new NoSuchElementException("ERROR000: Elemento del menú no encontrado | Elemento: " + opcion + "\n TRAZA: " + e);
        } catch (Exception e){
            throw e;
        }
    }



}
