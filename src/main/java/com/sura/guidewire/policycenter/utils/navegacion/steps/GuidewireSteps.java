package com.sura.guidewire.policycenter.utils.navegacion.steps;

import com.sura.guidewire.policycenter.pages.GuidewirePage;
import com.sura.guidewire.policycenter.utils.navegacion.widget.MenuNavegacionSuperiorEnum;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class GuidewireSteps extends ScenarioSteps {

    private GuidewirePage guidewirePage;

    @Steps MenuPolizaSteps menuPolizaSteps;

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
