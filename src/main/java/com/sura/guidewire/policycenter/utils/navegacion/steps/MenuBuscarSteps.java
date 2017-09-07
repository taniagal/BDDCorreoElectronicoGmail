package com.sura.guidewire.policycenter.utils.navegacion.steps;

import com.sura.guidewire.policycenter.utils.navegacion.pages.BuscarNavBarPages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.fluentlenium.core.annotation.Page;

public class MenuBuscarSteps extends ScenarioSteps {

    @Page
    BuscarNavBarPages buscarNavBarPages;

    @Step
    public void ingresarALaOpcionBuscar() {
        buscarNavBarPages.seleccionarOpcion();
        buscarNavBarPages.clicenOpcionCuentas();
    }

}