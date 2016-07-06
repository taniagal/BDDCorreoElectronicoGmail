package com.sura.policycenter.selenium.steps;


import com.sura.policycenter.selenium.pages.InicioPage;
import com.sura.policycenter.selenium.pages.menu.opciones.cuenta.OpcionesInformacionPolizaMrcPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;

public class InformacionDeVehiculoSteps extends ScenarioSteps {

    public InformacionDeVehiculoSteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

}
