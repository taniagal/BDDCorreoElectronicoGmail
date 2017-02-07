package com.sura.guidewire.policycenter.definitions.reaseguro;


import com.sura.guidewire.policycenter.steps.reaseguro.CrearYEditarCumulosSteps;
import com.sura.guidewire.policycenter.steps.reaseguro.SobrescribirTasaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class SobrescribirTasaDefinitions {

    @Steps
    SobrescribirTasaSteps sobrescribirTasaSteps;

    @Steps
    CrearYEditarCumulosSteps crearYEditarCumulosSteps;

    @Given("Ingrese la información de un reasegurador $datosReaseguradores")
    public void ingresaInformacionEnTablaParaReasegurad(ExamplesTable datosReaseguradores) {
        crearYEditarCumulosSteps.ingresarModalidadDeTasaEnTabla(datosReaseguradores);
    }

    @When("ingrese los riesgos aplicables al acuerdo para cada una de las coberturas")
    public void whenIngreseLosRiesgosAplicablesAlAcuerdoParaCadaUnaDeLasCoberturas() {
        sobrescribirTasaSteps.ingresarRiesgosAplicablesEnTabla();
    }

    @When("quiera crear los acuerdos facultativos")
    public void whenQuieraCrearLosAcuerdosFacultativos() {

        sobrescribirTasaSteps.crearAcuerdoFacultativo();
    }

    @Then("se debe validar una restriccion al momento de tomar el reaseguro porque los riesgos no estan ingresados <mensaje>")
    public void thenSeDebeValidarUnaRestriccionAlMomentoDeTomarElReaseguroPorqueLosRiesgosNoEstanIngresados(@Named("mensaje") String mensaje) {
        sobrescribirTasaSteps.validaMensajeEnPantalla(mensaje);
    }

    @Then("se debe validar que algun objeto reasegurable tenga asociados los acuerdos facultativos <tipoContrato>")
    public void thenSeDebeValidarQueSiAlgunObjetoReasegurableTieneAsociadosAcuerdosFacultativos(@Named("tipoContrato")String tipoContrato) {
        sobrescribirTasaSteps.crearAcuerdoFacultativo();
        sobrescribirTasaSteps.aceptaAcuerdoFacultativo();
        sobrescribirTasaSteps.validaObjetoReasegurableSinAsociacionDeAcuerdosFacultativos(tipoContrato);
    }

    @Then("la poliza debe recotizarce automaticamente y la tasa bruta comercial debe sobreescribirce")
    public void thenLaPolizaDebeRecotizarceAutomaticamenteYLaTasaBrutaComercialDebeSobreescribirce() {

    }

}
