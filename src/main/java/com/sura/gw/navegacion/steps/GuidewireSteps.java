package com.sura.gw.navegacion.steps;

import com.sura.gw.inicio.guidewire.GuidewirePage;
import com.sura.gw.navegacion.webelement.MenuNavegacionSuperiorEnum;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacadeImpl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class GuidewireSteps extends ScenarioSteps {

    private GuidewirePage guidewirePage;

    @Step
    public GuidewireSteps ir_a_navegacion_superior(){
        return this;
    }

    @Step
    public WebElementFacadeImpl desplegar_menu(MenuNavegacionSuperiorEnum menu){
        return guidewirePage.barraNavegacion().deplegarMenu(menu);
    }

    @Step
    public PageObject seleccionar_menu(MenuNavegacionSuperiorEnum menu){
        return guidewirePage.barraNavegacion().seleccionarMenu(menu);
    }

}
