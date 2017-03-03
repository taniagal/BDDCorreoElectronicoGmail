package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.poliza.PagoPolizaPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by juanzaag on 28/11/2016.
 */
public class PagoPolizaSteps extends ScenarioSteps {

   PagoPolizaPages pagoPolizaPages;

    public void validarCamposNoEditablesEnPagoDePoliza(){
        pagoPolizaPages.validarcamposNoEditablesEnPagoDePoliza();
    }
    @Step
    public void ingresar_a_la_opcion_de_pago(){
        pagoPolizaPages.ingresarALAOpcionDePagos();

    }

}
