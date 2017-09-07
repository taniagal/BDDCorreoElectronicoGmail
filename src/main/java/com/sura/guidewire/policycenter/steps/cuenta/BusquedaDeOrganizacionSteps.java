package com.sura.guidewire.policycenter.steps.cuenta;

import com.sura.guidewire.policycenter.pages.cuenta.BusquedaDeOrganizacionPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.fluentlenium.core.annotation.Page;

public class BusquedaDeOrganizacionSteps extends ScenarioSteps {

    @Page
    BusquedaDeOrganizacionPage busquedaDeOrganizacionPage;

    @Step
    public void ingresarRazonSocial(String razonSocial) {
        busquedaDeOrganizacionPage.ingresarRazonSocial(razonSocial);
    }

    @Step
    public void validaOrganizacion(String organizacion) {
        busquedaDeOrganizacionPage.validarOrganizacion(organizacion);
    }

    @Step
    public void irABuscarOrganizaciones() {
        busquedaDeOrganizacionPage.irABuscarOrganizaciones();
    }
}
