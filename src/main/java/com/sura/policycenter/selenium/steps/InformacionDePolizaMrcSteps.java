package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.InicioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class InformacionDePolizaMrcSteps extends ScenarioSteps {

    public InformacionDePolizaMrcSteps (Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    @Step
    public void navegar_barra_superior(String numCuenta) {
        inicioPage().irACuentaBuscar(numCuenta);
    }

}
