package com.sura.gw.navegacion.widget;

import com.sura.gw.navegacion.webelement.MenuNavegacionSuperiorEnum;
import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacadeImpl;
import net.serenitybdd.core.pages.WidgetObject;


@ImplementedBy(NavegacionSuperiorWidgetImpl.class)
public interface INavegacionSuperiorWidget extends WidgetObject {
    public WebElementFacadeImpl deplegarMenu(MenuNavegacionSuperiorEnum menu);
    public PageObject seleccionarMenu(MenuNavegacionSuperiorEnum menu);
}
