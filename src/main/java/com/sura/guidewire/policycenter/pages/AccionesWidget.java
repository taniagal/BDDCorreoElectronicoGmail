package com.sura.guidewire.policycenter.pages;


import net.serenitybdd.core.pages.PageObject;

public class AccionesWidget extends PageObject {

    private static final String LINK_OPCIONES_CAMBIAR_POLIZA = ".//*[@id='PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_NewWorkOrder:PolicyFileMenuActions_ChangePolicy-itemEl']";

    public void seleccionarOpcionCambioDePoliza() {
        findBy(LINK_OPCIONES_CAMBIAR_POLIZA).waitUntilVisible().waitUntilClickable().click();
    }


}
