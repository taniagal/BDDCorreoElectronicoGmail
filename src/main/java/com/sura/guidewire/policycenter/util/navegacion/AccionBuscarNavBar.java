package com.sura.guidewire.policycenter.util.navegacion;

import com.sura.guidewire.policycenter.pages.cuentas.BusquedaDeCuentasPage;
import net.serenitybdd.core.pages.PageObject;

public class AccionBuscarNavBar extends PageObject{
    private static String MENU_BUSCAR = "//a[contains(@id,'TabBar:SearchTab-btnInnerEl')]";
    private static String OPCION_CUENTAS = "//a[contains(.,'Cuentas')]";

    public AccionBuscarNavBar buscar() {
        findBy(MENU_BUSCAR).click();
        return this;
    }

    public BusquedaDeCuentasPage cuenta() {
        findBy(OPCION_CUENTAS).click();
        return switchToPage(BusquedaDeCuentasPage.class);
    }




}
