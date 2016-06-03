package com.sura.policycenter.selenium.steps;

import com.sura.guidewire.selenium.Guidewire;
import com.sura.policycenter.selenium.pages.BusquedaDeOrganizacionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class BusquedaDeOrganizacionSteps extends ScenarioSteps {

    private final BusquedaDeOrganizacionPage busquedaDeOrganizacionPage = new BusquedaDeOrganizacionPage(getDriver());
    private final Guidewire guidewire = new Guidewire(getDriver());

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
        guidewire.logout();
    }

}
