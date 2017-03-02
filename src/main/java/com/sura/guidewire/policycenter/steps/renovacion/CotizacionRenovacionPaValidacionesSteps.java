package com.sura.guidewire.policycenter.steps.renovacion;

import com.sura.guidewire.policycenter.pages.renovacion.CotizacionRenovacionPaValidacionesPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class CotizacionRenovacionPaValidacionesSteps extends ScenarioSteps {

    private CotizacionRenovacionPaValidacionesPage cotizacionRenovacionPAValidacionesPage;

    @Step
    public void irARevisionDePoliza() {
        cotizacionRenovacionPAValidacionesPage.irARevisionDePoliza();
    }

    @Step
    public void irARevisionDePolizaSinValidaFecha() {
        cotizacionRenovacionPAValidacionesPage.irAPantallairARevisionDePolizaSinValidacionFecha();
    }

    @Step
    public void seleccionarOpcionCotizar() {
        cotizacionRenovacionPAValidacionesPage.cotizarRenovacion();
    }

    @Step
    public void validarQueSeBloqueeCotizacionYMuestreMensaje(ExamplesTable mensajeRC) {
        cotizacionRenovacionPAValidacionesPage.validarBloqueoYMensajeRC(mensajeRC);
    }

    @Step
    public void limpiarEspacioDeTrabajo() {
        cotizacionRenovacionPAValidacionesPage.limpiarMensajes();
    }

    @Step
    public void irAInformacionPolizaRenovacion() {
        cotizacionRenovacionPAValidacionesPage.irAInformacionPolizaRenovacion();
    }

    @Step
    public void adicionarSegundoTomadorEnRenovacion(ExamplesTable datosTomador) {
        cotizacionRenovacionPAValidacionesPage.adicionarSegundoTomadorEnRenovacion(datosTomador);
    }

    @Step
    public void realizarCotizacionDeRenovacion() {
        cotizacionRenovacionPAValidacionesPage.realizarCotizacionDeRenovacion();
    }
}
