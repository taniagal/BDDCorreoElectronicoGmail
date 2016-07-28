package com.sura.gw.policy.poliza.pages;


import net.serenitybdd.core.pages.PageObject;

public class AccionesWidget extends PageObject {

    private final static String LINK_ACCIONES = "//span[contains(@id,'PolicyFile:PolicyFileMenuActions-btnInnerEl')]";
    private final static String LINK_OPCIONES_CAMBIAR_POLIZA = ".//*[@id='PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_NewWorkOrder:PolicyFileMenuActions_ChangePolicy-itemEl']";

    public void seleccionarBtnAcciones() {
        findBy(LINK_ACCIONES).waitUntilVisible().waitUntilClickable().click();
    }

    public void seleccionarOpcionCambioDePoliza() {
        findBy(LINK_OPCIONES_CAMBIAR_POLIZA).waitUntilVisible().waitUntilClickable().click();
    }


}
