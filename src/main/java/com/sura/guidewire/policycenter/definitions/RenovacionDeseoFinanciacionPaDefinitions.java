package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.CotizacionRenovacionPaValidacionesSteps;
import com.sura.guidewire.policycenter.steps.RenovacionDeseoFinanciacionPaSteps;
import com.sura.guidewire.policycenter.steps.commons.NuevaCotizacionSteps;
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

    @Steps
    NuevaCotizacionSteps nuevaCotizacionSteps;

    @Given("la poliza tiene intencion de financiacion")
    public void seleccionarIntencionFinanciacionSi() {
        renovacionDeseoFinanciacionPaSteps.seleccionarDeseoFinanciacionSi();
    }

    @When("seleccione la opcion siguiente en la renovacion")
    public void seleccionarSiguiente() {
        renovacionDeseoFinanciacionPaSteps.seleccionarOpcionSiguiente();
    }

    @When("ingrese los datos de la cotizacion con intencion de financiacion: $datosCotizacion")
    public void validarIntencionFinanciacion(ExamplesTable datosCotizacion) {
        renovacionDeseoFinanciacionPaSteps.marcarDeseoDeFinanciacion();
        nuevaCotizacionSteps.cotizarEnvioCopiadoPa(datosCotizacion);
    }

    @When("comienzo una nueva renovacion")
    public void comenzarRenovacion() {
        renovacionDeseoFinanciacionPaSteps.comenzarRenovacion();
    }

    @When("realice la cotizacion de la renovacion con intencion de financiacion")
    public void cotizarRenovacion() {
        renovacionDeseoFinanciacionPaSteps.irARevisionDePoliza();
        renovacionDeseoFinanciacionPaSteps.cotizarRenovacionDePoliza();
    }

    @Then("trate de expedir la poliza")
    public void expedirPolizaRenovacion() {
        renovacionDeseoFinanciacionPaSteps.expedirPolizaDeRenovacion();
    }

    @Then("se debe mostrar un mensaje como advertencia $mensaje")
    public void validarMensajeDeseoFinanciacion(ExamplesTable mensaje) {
        renovacionDeseoFinanciacionPaSteps.validarQueSeMuestreMensajeDeseoFinanciacion(mensaje);
    }

    @Then("se debe mostrar una advertencia en la cotizacion $mensaje")
    public void validarMensajeCotizarRenovacion(ExamplesTable mensaje) {
        renovacionDeseoFinanciacionPaSteps.validarMensajeFinanciacionAlCotizarRenovacion(mensaje);
    }

    @Then("se debe mostrar el campo numero de cuotas, permitiendo seleccionar entre las opciones de 11 y 12 $numeroCuotas")
    public void mostrarNumeroCuotas(ExamplesTable numeroCuotas) {
        renovacionDeseoFinanciacionPaSteps.validarQueSeMuestreNumeroDeCuotas(numeroCuotas);
    }

    @Then("se debe mostrar en el detalle de la cotizacion el valor por cuota a pagar\n" +
            "y el numero de cotas indicadas en la informacion de la poliza $detalleCotizacion")
    public void mostrarValorCuota(ExamplesTable detalleCotizacion) {
        renovacionDeseoFinanciacionPaSteps.validarQueSeMuestreValorYNumeroDeCuotas(detalleCotizacion);
    }
}
