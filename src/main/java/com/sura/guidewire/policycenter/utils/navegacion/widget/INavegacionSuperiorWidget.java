package com.sura.guidewire.policycenter.utils.navegacion.widget;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WidgetObject;


@ImplementedBy(NavegacionSuperiorWidgetImpl.class)
public interface INavegacionSuperiorWidget extends WidgetObject {
    void deplegarMenu(MenuNavegacionSuperiorEnum menu);
    void seleccionarMenu(MenuNavegacionSuperiorEnum menu);
}
