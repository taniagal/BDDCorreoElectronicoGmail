package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.InicioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AdmonCotizacionCuentaSteps extends ScenarioSteps{

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }


    @Step
    public void seleccionar_cotizaciones_de_la_cuenta() {
        inicioPage().irAOpcionesAdministradorCotizaciones();
    }

}
