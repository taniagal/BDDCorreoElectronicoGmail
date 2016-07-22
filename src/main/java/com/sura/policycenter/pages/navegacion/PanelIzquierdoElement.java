package com.sura.policycenter.pages.navegacion;

import net.serenitybdd.core.pages.PageObject;

import java.io.Serializable;


public class PanelIzquierdoElement extends PageObject implements Serializable{

    private static final long serialVersionUID = 1L;

    public static final String LINK_ACCIONES = "//a[contains(@id,'Desktop:DesktopMenuActions')]";
    public static final String LINK_NUEVA_COTIZACION = ".//*[@id='Desktop:DesktopMenuActions:DesktopMenuActions_Create:DesktopMenuActions_NewSubmission-textEl']";

    public void opcion(String opcionXPath){
        try {
            waitFor(opcionXPath).shouldBeDisplayed();
            $(opcionXPath).waitUntilClickable().click();
        } catch (Exception e){
            throw e;
        }
    }
}
