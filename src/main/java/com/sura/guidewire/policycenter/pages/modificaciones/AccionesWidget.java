package com.sura.guidewire.policycenter.pages.modificaciones;


import net.serenitybdd.core.pages.PageObject;

public class AccionesWidget extends PageObject {

    private static final String LINK_OPCIONES_CAMBIAR_POLIZA = ".//*[@id='PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_NewWorkOrder:PolicyFileMenuActions_ChangePolicy-itemEl']";
    private static final String LINK_OPCIONES_RENOVAR_POLIZA = ".//a[@id='PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_NewWorkOrder:PolicyFileMenuActions_RenewPolicy-itemEl']";

    public void seleccionarOpcionCambioDePoliza() {
        findBy(LINK_OPCIONES_CAMBIAR_POLIZA).waitUntilVisible().waitUntilClickable().click();
    }
    public void seleccionarOpcionRenovarPoliza(){
        findBy(LINK_OPCIONES_RENOVAR_POLIZA).waitUntilVisible().waitUntilClickable().click();
    }


}
