package com.sura.policycenter.pages.navegacion;

import net.serenitybdd.core.pages.PageObject;

public class PanelIzquierdoElement extends PageObject{

    public static final String LINK_ACCIONES = "//a[contains(@id,'Desktop:DesktopMenuActions')]";
    public static final String LINK_NUEVA_COTIZACION = ".//*[@id='Desktop:DesktopMenuActions:DesktopMenuActions_Create:DesktopMenuActions_NewSubmission-textEl']";

    public void opcion(String opcion){
        waitFor(opcion).shouldBeDisplayed();
        $(opcion).click();
    }
}
