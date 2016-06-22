package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.DireccionesDeContactoVinculadasPage;
import com.sura.policycenter.selenium.pages.InicioPage;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class DireccionesDeContactoVinculadasSteps extends ScenarioSteps {

    private final DireccionesDeContactoVinculadasPage direccionesDeContactoVinculadas = new DireccionesDeContactoVinculadasPage(getDriver());

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    public DireccionesDeContactoVinculadasSteps(Pages pages) {
        super(pages);
    }

    public void buscarCuenta(String numeroCuenta) {

    }
}
