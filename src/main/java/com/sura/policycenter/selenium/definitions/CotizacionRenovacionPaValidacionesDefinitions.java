package com.sura.policycenter.selenium.definitions;

import com.google.inject.name.Named;
import com.sura.policycenter.selenium.steps.CotizacionMRCSteps;
import com.sura.policycenter.selenium.steps.CotizacionRenovacionPaValidacionesSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class CotizacionRenovacionPaValidacionesDefinitions {

    @Steps
    CotizacionMRCSteps cotizacionMRCSteps;

    @Steps
    CotizacionRenovacionPaValidacionesSteps cotizacionRenovacionPaValidacionesSteps;

    @Given("estoy cotizando la renovacion de la poliza <cotizacion>")
    public void ingresarARenovacionDeCotizacion(@Named("cotizacion") String cotizacion){
        cotizacionMRCSteps.ir_A_Buscar_Cotizacion_Poliza(cotizacion);
    }

    @When("cotice con algunas de las figuras que son Riesgo consultable bloqueante")
    public void validarFigurasRiesgoConsultable(){
        cotizacionRenovacionPaValidacionesSteps.ir_A_Revision_De_Poliza();
        cotizacionRenovacionPaValidacionesSteps.seleccionar_Opcion_Cotizar();
    }

    @When("cotice con algunas de las figuras que son Riesgo consultable bloqueante sin validar fecha")
    public void validarFigurasRiesgoConsultableSinValidaFecha(){
        cotizacionRenovacionPaValidacionesSteps.ir_A_Revision_De_Poliza_Sin_Valida_Fecha();
        cotizacionRenovacionPaValidacionesSteps.seleccionar_Opcion_Cotizar();
    }


    @When("el motor, chasis y/o placa sean Riesgo consultable bloqueante")
    public void validarMotorChasisYPlaca(){
        cotizacionRenovacionPaValidacionesSteps.seleccionar_Opcion_Cotizar();
    }

    @Then("se debe bloquear la cotizacion y mostrar el mensaje que devuelve el servicio $mensajeRC")
    public void validarMensajeValidacionRC(ExamplesTable mensajeRC){
        cotizacionRenovacionPaValidacionesSteps.validar_Que_Se_Bloquee_Cotizacion_Y_Muestre_Mensaje(mensajeRC);
        cotizacionRenovacionPaValidacionesSteps.limpiar_espacio_de_trabajo();
    }
}
