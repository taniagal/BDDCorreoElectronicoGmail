package com.sura.gw.policy.runners.administracion.consulta.cuenta.pages;

import net.serenitybdd.core.pages.PageObject;


public class CuentaPages extends PageObject {

    private static String LINK_CONTACTOS = "//div[contains(.,'Contactos')]";

    public ContactosCuentaWidgetPage enContactos(){

        element(LINK_CONTACTOS).click();
        return switchToPage(ContactosCuentaWidgetPage.class);
    }

}
