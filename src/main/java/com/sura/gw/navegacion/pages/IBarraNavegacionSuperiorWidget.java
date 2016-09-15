package com.sura.gw.navegacion.pages;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WidgetObject;


@ImplementedBy(BarraNavegacionSuperiorWidgetImpl.class)
public interface IBarraNavegacionSuperiorWidget extends WidgetObject {
    public void deplegarMenu(String nombreMenu);
    public void seleccionarMenu(String nombreMenu);
}
