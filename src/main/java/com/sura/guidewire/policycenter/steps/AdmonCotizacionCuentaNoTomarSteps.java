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
    public void valida_lista_de_razones(ExamplesTable listaRazones){
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


    @Step
    public void cotizarParaLaOpcionNoTomar() {
        opcionesAdminitradorCotizaciones.cotizarParaOpcionesDeclinarYNoTomar("no tomar");
    }
}