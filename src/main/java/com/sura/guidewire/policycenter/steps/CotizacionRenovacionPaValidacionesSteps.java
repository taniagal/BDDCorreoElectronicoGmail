package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.renovacion.CotizacionRenovacionPaValidacionesPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class CotizacionRenovacionPaValidacionesSteps extends ScenarioSteps {

    private CotizacionRenovacionPaValidacionesPage cotizacionRenovacionPAValidacionesPage;

    @Step
    public void ir_A_Revision_De_Poliza() {
        cotizacionRenovacionPAValidacionesPage.irARevisionDePoliza();
    }

    @Step
    public void ir_A_Revision_De_Poliza_Sin_Valida_Fecha() {
        cotizacionRenovacionPAValidacionesPage.irAPantallairARevisionDePolizaSinValidacionFecha();
    }

    @Step
    public void seleccionar_Opcion_Cotizar() {
        cotizacionRenovacionPAValidacionesPage.cotizarRenovacion();
    }

    @Step
    public void validar_Que_Se_Bloquee_Cotizacion_Y_Muestre_Mensaje(ExamplesTable mensajeRC) {
        cotizacionRenovacionPAValidacionesPage.validarBloqueoYMensajeRC(mensajeRC);
    }

    @Step
    public void limpiar_espacio_de_trabajo() {
        cotizacionRenovacionPAValidacionesPage.limpiarMensajes();
    }


}
