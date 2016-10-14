package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.InicioPage;
import com.sura.guidewire.policycenter.pages.SeleccionDeOfertasPage;
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
    public void ingresarDatosInicialesCotizacion(String cuenta) {
        seleccionDeOfertasPage.ingresarDatosInicialesCotizacion(cuenta);
    }

    @Step
    public void seleccionarLineaPA() {
        seleccionDeOfertasPage.seleccionarLineaPA();
    }

    @Step
    public void validarVisibilidadMenu() {
       seleccionDeOfertasPage.validarVisibilidadMenu();
    }

}
