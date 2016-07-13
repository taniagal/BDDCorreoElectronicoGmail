package com.sura.gw.policy.administracion.consulta.cuenta.pages;

import com.sura.gw.policy.administracion.consulta.contactos.pages.ContactosAsociadosACuentaWidgetPage;
import net.serenitybdd.core.pages.PageObject;


public class CuentaPages extends PageObject {

    private static String LINK_CONTACTOS = ".//*[@id='AccountFile:MenuLinks:AccountFile_AccountFile_Contacts']";

    public ContactosAsociadosACuentaWidgetPage enContactos(){

        String tituloDePaginaPorDefectoCuenta = "Resumen de la cuenta";
        waitForTextToAppear(tituloDePaginaPorDefectoCuenta);
        shouldContainText(tituloDePaginaPorDefectoCuenta);

        element(LINK_CONTACTOS).click();

        String tituloDePaginaContactos = "Contactos de archivo de cuenta";
        waitForTextToAppear(tituloDePaginaContactos);
        shouldContainText(tituloDePaginaContactos);

        return switchToPage(ContactosAsociadosACuentaWidgetPage.class);
    }

}
