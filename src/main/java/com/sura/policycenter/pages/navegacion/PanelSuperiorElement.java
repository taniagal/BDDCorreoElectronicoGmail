package com.sura.policycenter.pages.navegacion;

import net.serenitybdd.core.pages.PageObject;

public class PanelSuperiorElement extends PageObject{

    public static final String MENU_ESCRITORIO = "//a[@id='TabBar:DesktopTab']";

    public void irMenu(String opcion){
        waitFor(opcion).shouldBeDisplayed();
        $(opcion).click();
    }

}
