package com.sura.guidewire.policycenter.utils.navegacion.steps;

import com.sura.guidewire.policycenter.utils.navegacion.pages.BuscarNavBarPages;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MenuBuscarSteps extends ScenarioSteps {

    BuscarNavBarPages buscarNavBarPages;

    @Step
    public void ingresarALaOpcionBuscar() {
        buscarNavBarPages.seleccionarOpcion();
     buscarNavBarPages.clicenOpcionCuentas();
    }

}
