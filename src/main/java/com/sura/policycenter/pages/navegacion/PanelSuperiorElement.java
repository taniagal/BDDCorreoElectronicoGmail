package com.sura.policycenter.pages.navegacion;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class PanelSuperiorElement extends PageObject{

    public static final String MENU_ESCRITORIO = "//a[@id='TabBar:DesktopTab']";

    public void irMenu(String opcion){
        if (find(By.xpath(opcion)).isPresent()){
            find(By.xpath(opcion)).click();
        }
    }

}
