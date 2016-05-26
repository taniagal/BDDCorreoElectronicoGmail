package com.sura.policycenter.pages.navegacion;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class PanelIzquierdoElement extends PageObject{

    public static final String LINK_ACCIONES = "//a[contains(@id,'Desktop:DesktopMenuActions')]";
    public static final String LINK_NUEVA_COTIZACION = "//a[contains(.,'Nueva cotización')]";

    public void opcion(String opcion){
        if (find(By.xpath(opcion)).isPresent()){
            find(By.xpath(opcion)).click();
        }
    }
}
