package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.InicioPage;
import com.sura.policycenter.selenium.pages.SeleccionDeOfertasPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class SeleccionDeOfertasSteps extends ScenarioSteps {

    private final SeleccionDeOfertasPage seleccionDeOfertasPage = new SeleccionDeOfertasPage(getDriver());

    public SeleccionDeOfertasSteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    @Step
    public void iniciarCotizacion() {
        inicioPage().irAEscritorioNuevoEnvio();
    }

    @Step
    public void ingresarDatosInicialesCotizacion(String cuenta, String organizacion, String agente) {
        seleccionDeOfertasPage.ingresarDatosInicialesCotizacion(cuenta, organizacion, agente);
    }

    @Step
    public void seleccionarLineaPA() {
        seleccionDeOfertasPage.seleccionarLineaPA();
    }

    @Step
    public void validarVisibilidadMenu(String menu) {
       seleccionDeOfertasPage.validarVisibilidadMenu(menu);
    }

}
