package com.sura.gw.policy.poliza.pages;


import net.serenitybdd.core.pages.PageObject;

public class AccionesWidget extends PageObject {

    private final static String LINK_ACCIONES = "//span[contains(@id,'PolicyFile:PolicyFileMenuActions-btnInnerEl')]";
    private final static String LINK_OPCIONES_CAMBIAR_POLIZa = "//span[contains(@id,'PolicyFile:PolicyFileMenuActions-btnInnerEl')]";

    public void seleccionarBtnAcciones() throws Exception {
        findBy(LINK_ACCIONES).waitUntilVisible().waitUntilClickable().click();
    }

    public void seleccionarOpcionCambioDePoliza() throws Exception {
        findBy(LINK_OPCIONES_CAMBIAR_POLIZa).waitUntilVisible().waitUntilClickable().click();
    }


}
