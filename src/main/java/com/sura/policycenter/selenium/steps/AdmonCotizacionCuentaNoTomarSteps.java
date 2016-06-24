package com.sura.policycenter.selenium.steps;


import com.sura.policycenter.selenium.pages.InicioPage;
import com.sura.policycenter.selenium.pages.menu.opciones.cuenta.OpcionesAdminitradorCotizaciones;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

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
        opcionesAdminitradorCotizaciones.noIngresaRechazoNoTomar();
    }

    @Step
    public void valida_mensaje(String mensaje) {
        opcionesAdminitradorCotizaciones.validaMensajeNoTomar(mensaje);
    }

    @Step
    public void valida_lista_de_razones(ExamplesTable listaRazones) throws Exception{
        opcionesAdminitradorCotizaciones.validarOpcionesDeAgregarNoTomar(listaRazones);
    }

    @Step
    public void ingresar_informacion_al_momento_de_rechazar(String razon) {
        opcionesAdminitradorCotizaciones.ingresaRechazoNoTomar(razon);
    }

    @Step
    public void valida_estado_de_la_cotizacion(String numCotizacion, String razon) {
        opcionesAdminitradorCotizaciones.validaEstado(numCotizacion, razon);
    }

    @Step
    public void inhabilita_acciones() {
        opcionesAdminitradorCotizaciones.validaAccionDesabilitaNoTomar();
    }



}