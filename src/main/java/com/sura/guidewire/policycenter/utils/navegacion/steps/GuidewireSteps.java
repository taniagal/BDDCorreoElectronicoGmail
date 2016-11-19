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
    public GuidewireSteps irANavegacionSuperior(){
        return this;
    }

    @Step
    public MenuPolizaSteps desplegarMenuPoliza(){
        guidewirePage.barraNavegacion().deplegarMenu(MenuNavegacionSuperiorEnum.POLIZA);
        return menuPolizaSteps;
    }



}
