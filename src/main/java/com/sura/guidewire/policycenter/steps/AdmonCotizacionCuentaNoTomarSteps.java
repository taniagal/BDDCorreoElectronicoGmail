package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.utils.menu.opciones.cuenta.OpcionesAdminitradorCotizaciones;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class AdmonCotizacionCuentaNoTomarSteps extends ScenarioSteps {

    private final OpcionesAdminitradorCotizaciones opcionesAdminitradorCotizaciones = new OpcionesAdminitradorCotizaciones(getDriver());

    public AdmonCotizacionCuentaNoTomarSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void seleccionarOpcionEnAcciones() {
        opcionesAdminitradorCotizaciones.seleccionarAccionesNoTomar();
    }

    @Step
    public void declinarSinRazon() {
        opcionesAdminitradorCotizaciones.noIngresaRechazoNoTomar();
    }

    @Step
    public void validaMensaje(String mensaje) {
        opcionesAdminitradorCotizaciones.validaMensajeNoTomar(mensaje);
    }

    @Step
    public void validaListaDeRazones(ExamplesTable listaRazones){
        opcionesAdminitradorCotizaciones.validarOpcionesDeAgregarNoTomar(listaRazones);
    }

    @Step
    public void ingresarInformacionAlMomentoDeRechazar(String razon) {
        opcionesAdminitradorCotizaciones.ingresaRechazoNoTomar(razon);
    }

    @Step
    public void validaEstadoDeLaCotizacion(String numCotizacion, String razon) {
        opcionesAdminitradorCotizaciones.validaEstado(numCotizacion, razon);
    }

    @Step
    public void inhabilitaAcciones() {
        opcionesAdminitradorCotizaciones.validaAccionDesabilitaNoTomar();
    }


    @Step
    public void cotizarParaLaOpcionNoTomar() {
        opcionesAdminitradorCotizaciones.cotizarParaOpcionesDeclinarYNoTomar("no tomar");
    }
}