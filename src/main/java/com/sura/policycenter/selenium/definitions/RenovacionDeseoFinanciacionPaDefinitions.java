package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.CotizacionRenovacionPaValidacionesSteps;
import com.sura.policycenter.selenium.steps.RenovacionDeseoFinanciacionPaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class RenovacionDeseoFinanciacionPaDefinitions {

    @Steps
    RenovacionDeseoFinanciacionPaSteps renovacionDeseoFinanciacionPaSteps;

    @Steps
    CotizacionRenovacionPaValidacionesSteps cotizacionRenovacionPaValidacionesSteps;

    @Given("la poliza tiene intencion de financiacion")
    public void seleccionarIntencionFinanciacionSi(){
        renovacionDeseoFinanciacionPaSteps.seleccionar_Deseo_Financiacion_Si();
    }

    @When("seleccione la opcion siguiente en la renovacion")
    public void seleccionarSiguiente(){
        renovacionDeseoFinanciacionPaSteps.seleccionar_Opcion_Siguiente();
    }

    @When("la poliza tiene intencion de financiacion")
    public void validarIntencionFinanciacion(){
        renovacionDeseoFinanciacionPaSteps.seleccionar_Deseo_Financiacion_Si();
    }

    @When("realice la cotizacion de la renovacion con intencion de financiacion")
    public void cotizarRenovacion(){
        renovacionDeseoFinanciacionPaSteps.ir_A_Revision_De_Poliza();
        renovacionDeseoFinanciacionPaSteps.cotizar_Renovacion_De_Poliza();
    }

    @When("la cotizacion de renovacion tenga intencion de financiacion")
    public void validarCotizacionFinanciada(){
        renovacionDeseoFinanciacionPaSteps.validar_Que_La_Cotizacion_Tenga_Intencion_De_Financiacion();
    }

    @When("trate de expedir la poliza")
    public void expedirPolizaRenovacion(){
        renovacionDeseoFinanciacionPaSteps.expedir_Poliza_De_Renovacion();
    }

    @Then("se debe mostrar un mensaje como advertencia $mensaje")
    public void validarMensajeDeseoFinanciacion(ExamplesTable mensaje){
        renovacionDeseoFinanciacionPaSteps.validar_Que_Se_Muestre_Mensaje_Deseo_Financiacion(mensaje);
    }

    @Then("se debe mostrar una advertencia en la cotizacion $mensaje")
    public void validarMensajeCotizarRenovacion(ExamplesTable mensaje){
        renovacionDeseoFinanciacionPaSteps.validar_Mensaje_Financiacion_Al_Cotizar_Renovacion(mensaje);
        cotizacionRenovacionPaValidacionesSteps.limpiar_espacio_de_trabajo();
    }

    @Then("se debe mostrar el campo numero de cuotas, permitiendo seleccionar entre las opciones de 11 y 12 $numeroCuotas")
    public void mostrarNumeroCuotas(ExamplesTable numeroCuotas){
        renovacionDeseoFinanciacionPaSteps.validar_Que_Se_Muestre_Numero_De_Cuotas(numeroCuotas);
    }

    @Then("se debe mostrar en el detalle de la cotizacion el valor por cuota a pagar\n" +
            "y el numero de cotas indicadas en la informacion de la poliza $detalleCotizacion")
    public void mostrarValorCuota(ExamplesTable detalleCotizacion){
        renovacionDeseoFinanciacionPaSteps.validar_Que_Se_Muestre_Valor_Y_Numero_De_Cuotas(detalleCotizacion);
    }
}
