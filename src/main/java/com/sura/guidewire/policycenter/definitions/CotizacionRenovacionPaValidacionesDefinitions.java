package com.sura.guidewire.policycenter.definitions;

import com.google.inject.name.Named;
import com.sura.guidewire.policycenter.steps.CotizacionMRCSteps;
import com.sura.guidewire.policycenter.steps.CotizacionRenovacionPaValidacionesSteps;
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
        cotizacionMRCSteps.irABuscarCotizacionPoliza(cotizacion);
    }

    @Given("estoy cotizando la renovacion de la poliza")
    public void ingresarARenovacionDeCotizacion(){
        //Empty Method
    }

    @When("cotice con algunas de las figuras que son Riesgo consultable bloqueante")
    public void validarFigurasRiesgoConsultable(){
        cotizacionRenovacionPaValidacionesSteps.irARevisionDePoliza();
        cotizacionRenovacionPaValidacionesSteps.seleccionarOpcionCotizar();
    }

    @When("cotice con algunas de las figuras que son Riesgo consultable bloqueante sin validar fecha")
    public void validarFigurasRiesgoConsultableSinValidaFecha(){
        cotizacionRenovacionPaValidacionesSteps.irARevisionDePolizaSinValidaFecha();
        cotizacionRenovacionPaValidacionesSteps.seleccionarOpcionCotizar();
    }


    @When("el motor, chasis y/o placa sean Riesgo consultable bloqueante")
    public void validarMotorChasisYPlaca(){
        cotizacionRenovacionPaValidacionesSteps.seleccionarOpcionCotizar();
    }

    @When("vaya a informacion de poliza en la renovacion")
    public void irAInformacionPolizaRenovacion(){
        cotizacionRenovacionPaValidacionesSteps.irAInformacionPolizaRenovacion();
    }

    @When("adicione un segundo tomador en la renovacion el cual es riesgo consultable $datosTomador")
    public void adicionarSegundoTomadorEnRenovacion(ExamplesTable datosTomador){
        cotizacionRenovacionPaValidacionesSteps.adicionarSegundoTomadorEnRenovacion(datosTomador);
    }

    @When("cotice la renovacion")
    public void cotizarRenovacion(){
        cotizacionRenovacionPaValidacionesSteps.realizarCotizacionDeRenovacion();
    }

    @Then("se debe bloquear la cotizacion y mostrar el mensaje que devuelve el servicio $mensajeRC")
    public void validarMensajeValidacionRC(ExamplesTable mensajeRC){
        cotizacionRenovacionPaValidacionesSteps.validarQueSeBloqueeCotizacionYMuestreMensaje(mensajeRC);
        cotizacionRenovacionPaValidacionesSteps.limpiarEspacioDeTrabajo();
    }
}
