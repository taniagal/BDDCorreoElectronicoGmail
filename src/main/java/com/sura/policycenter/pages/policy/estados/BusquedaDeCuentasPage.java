package com.sura.policycenter.pages.policy.estados;

import net.serenitybdd.core.pages.PageObject;


public class BusquedaDeCuentasPage extends PageObject{
    private static String TXT_NUMERO_DE_CUENTA = "//input[contains(@id,'AccountSearch:AccountSearchScreen:AccountSearchDV:AccountNumber-inputEl')]";
    private static String BTN_BUSCAR = "//a[contains(@id,'AccountSearch:AccountSearchScreen:AccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search')]";
    private static String PRIMER_REGISTRO = "//a[@id='AccountSearch:AccountSearchScreen:AccountSearchResultsLV:0:AccountNumber']";

    public BusquedaDeCuentasPage ingresar() {
        return this;
    }

    public BusquedaDeCuentasPage luego() {
        return this;
    }

    public BusquedaDeCuentasPage numeroDeCuenta(String numeroDeCuenta) {
        enter(numeroDeCuenta).into(element(TXT_NUMERO_DE_CUENTA));
        return this;
    }

    public BusquedaDeCuentasPage buscar() {
        element(BTN_BUSCAR).click();
        return this;
    }

    public ResumenCuentaPage seleccionarDichaCuenta() {
        element(PRIMER_REGISTRO).click();
        return switchToPage(ResumenCuentaPage.class);
    }


    public BusquedaDeCuentasPage por() {
        return this;
    }

    public BusquedaDeCuentasPage entonces() {
        return this;
    }
}
