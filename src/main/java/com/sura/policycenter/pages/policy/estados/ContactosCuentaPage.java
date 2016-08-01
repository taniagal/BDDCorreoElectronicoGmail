package com.sura.policycenter.pages.policy.estados;

import net.serenitybdd.core.pages.PageObject;

public class ContactosCuentaPage extends PageObject{

    private static String LINK_CONTACTOS = "//div[contains(.,'Contactos')]";

    public ContactosCuentaPage deseoVerLosContactosAsociados(){
        element(LINK_CONTACTOS).click();
        return this;
    }

    public void deberiaVerLosContactosAsociados() {
        //Empty method
    }
}


