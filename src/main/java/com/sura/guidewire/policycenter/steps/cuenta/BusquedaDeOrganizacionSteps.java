package com.sura.guidewire.policycenter.steps.cuenta;

import com.sura.guidewire.policycenter.util.Commons;
import com.sura.guidewire.policycenter.pages.cuenta.BusquedaDeOrganizacionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class BusquedaDeOrganizacionSteps extends ScenarioSteps {

    private final BusquedaDeOrganizacionPage busquedaDeOrganizacionPage = new BusquedaDeOrganizacionPage(getDriver());
    private final Commons commons = new Commons(getDriver());

    public BusquedaDeOrganizacionSteps(Pages pages) {
        super(pages);
    }


    @Step
    public void ingresarRazonSocial(String razonSocial) {
        busquedaDeOrganizacionPage.ingresarRazonSocial(razonSocial);
    }

    @Step
    public void validaOrganizacion(String organizacion) {
        busquedaDeOrganizacionPage.validarOrganizacion(organizacion);
    }

}
