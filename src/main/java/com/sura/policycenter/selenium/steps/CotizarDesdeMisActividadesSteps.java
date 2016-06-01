package com.sura.policycenter.selenium.steps;


import com.sura.policycenter.pages.navegacion.PanelIzquierdoElement;
import com.sura.policycenter.pages.navegacion.PanelSuperiorElement;
import com.sura.policycenter.pages.policy_estados_de_poliza.cotizacion.NuevaCotizacionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CotizarDesdeMisActividadesSteps extends ScenarioSteps {

    PanelSuperiorElement panelSuperior;
    PanelIzquierdoElement panelIzquierdo;

    NuevaCotizacionPage cotizacionPage;

    @Step
    public void ir_al_menu_escritorio_del_panel_superior(){
        panelSuperior.irMenu(PanelSuperiorElement.MENU_ESCRITORIO);
    }

    @Step
    public void clic_en_la_opcion_acciones_del_panel_izquierdo(String btnAccion){
        panelIzquierdo.opcion(PanelIzquierdoElement.LINK_ACCIONES);
    }

    @Step
    public void clic_en_la_opcion_nueva_cotizacion(String opcion){

        panelIzquierdo.opcion(PanelIzquierdoElement.LINK_NUEVA_COTIZACION);
    }

    @Step
    public String validar_que_el_titulo_de_la_pagina_sea_nueva_cotizacion() {
        return cotizacionPage.obtenerTexto(cotizacionPage.TITULO_PAGINA);
    }
}
