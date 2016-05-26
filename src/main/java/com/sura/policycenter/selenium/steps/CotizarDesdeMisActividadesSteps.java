package com.sura.policycenter.selenium.steps;


import com.sura.policycenter.pages.navegacion.PanelIzquierdoElement;
import com.sura.policycenter.pages.navegacion.PanelSuperiorElement;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static com.sura.policycenter.pages.navegacion.PanelIzquierdoElement.LINK_ACCIONES;
import static com.sura.policycenter.pages.navegacion.PanelIzquierdoElement.LINK_NUEVA_COTIZACION;
import static com.sura.policycenter.pages.navegacion.PanelSuperiorElement.MENU_ESCRITORIO;

public class CotizarDesdeMisActividadesSteps extends ScenarioSteps {

    PanelSuperiorElement panelSuperior;
    PanelIzquierdoElement panelIzquierdo;

    @Step
    public void ir_al_menu_escritorio_del_panel_superior(){
        panelSuperior.irMenu(MENU_ESCRITORIO);
    }

    @Step
    public void clic_en_la_opcion_acciones_del_panel_izquierdo(){
        panelIzquierdo.opcion(LINK_ACCIONES);
    }

    @Step
    public void clic_en_la_opcion_nueva_cotizacion(){
        panelIzquierdo.opcion(LINK_NUEVA_COTIZACION);
    }
}
