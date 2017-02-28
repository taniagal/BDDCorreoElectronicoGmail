package com.sura.guidewire.policycenter.pages.cuenta;

import com.sura.guidewire.policycenter.pages.poliza.TransaccionesDePolizaWidgetObject;
import net.serenitybdd.core.pages.PageObject;


public class CuentaPages extends PageObject {

    private static String LINK_CONTACTOS = ".//*[@id='AccountFile:MenuLinks:AccountFile_AccountFile_Contacts']";
    private static String LINK_TRANSACCIONES_DE_POLIZA = ".//*[@id='AccountFile:MenuLinks:AccountFile_AccountFile_WorkOrders']";


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

    public TransaccionesDePolizaWidgetObject enTransaccionesDePoliza(){

        String tituloDePaginaPorDefectoCuenta = "Resumen de la cuenta";
        waitForTextToAppear(tituloDePaginaPorDefectoCuenta);
        shouldContainText(tituloDePaginaPorDefectoCuenta);

        element(LINK_TRANSACCIONES_DE_POLIZA).click();

        String tituloDePaginaContactos = "Transacciones de póliza del archivo de la cuenta";
        waitForTextToAppear(tituloDePaginaContactos);
        shouldContainText(tituloDePaginaContactos);

        return switchToPage(TransaccionesDePolizaWidgetObject.class);
    }

}
