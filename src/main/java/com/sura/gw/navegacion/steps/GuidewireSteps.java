package com.sura.gw.navegacion.steps;

import com.sura.gw.inicio.guidewire.GuidewirePage;
import com.sura.gw.navegacion.webelement.MenuNavegacionSuperiorEnum;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class GuidewireSteps extends ScenarioSteps {

    private GuidewirePage guidewirePage;

    @Steps
    MenuPolizaSteps menuPolizaSteps;

    @Step
    public GuidewireSteps ir_a_navegacion_superior(){
        return this;
    }

    @Step
    public MenuPolizaSteps desplegar_menu_poliza(){
        guidewirePage.barraNavegacion().deplegarMenu(MenuNavegacionSuperiorEnum.POLIZA);
        return menuPolizaSteps;
    }



}
