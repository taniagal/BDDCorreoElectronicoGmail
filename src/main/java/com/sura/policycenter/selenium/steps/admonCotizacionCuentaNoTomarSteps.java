package com.sura.policycenter.selenium.steps;


import com.sura.policycenter.selenium.pages.InicioPage;
import com.sura.policycenter.selenium.pages.menu.opciones.cuenta.OpcionesAdminitradorCotizaciones;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class AdmonCotizacionCuentaNoTomarSteps extends ScenarioSteps {

    public AdmonCotizacionCuentaNoTomarSteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    private OpcionesAdminitradorCotizaciones opcionesAdminitradorCotizaciones = new OpcionesAdminitradorCotizaciones(getDriver());

    @Step
    public void seleccionar_opcion_en_acciones() {
        opcionesAdminitradorCotizaciones.seleccionarAccionesNoTomar();
    }

    @Step
    public void declinar_sin_razon() {
        opcionesAdminitradorCotizaciones.noIngresaRechazo();
    }

    @Step
    public void valida_mensaje(String mensaje) {
        opcionesAdminitradorCotizaciones.validaMensaje(mensaje);
    }

}
