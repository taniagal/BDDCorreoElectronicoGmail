package com.sura.guidewire.policycenter.definitions.colectivas;


import com.sura.guidewire.policycenter.steps.colectivas.BusquedaDeRiesgosPASteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class BusquedaDeRiesgosPADefinitions {

    @Steps
    BusquedaDeRiesgosPASteps busquedaDeRiesgosPASteps;

    @Given("que voy a la busqueda de riesgos")
    public void irALaBusquedaDeRiesgos(){
        busquedaDeRiesgosPASteps.irALaBusquedaDeRiesgos();
    }

    @When("este buscando un riesgo por los filtros producto y placa del vehiculo $filtros")
    public void ingresarCriteriosDeBusqueda(ExamplesTable filtros){
        busquedaDeRiesgosPASteps.ingresarCriteriosDeBusqueda(filtros);
    }

    @Then("debo ver la informacion de los riesgos asociados $riesgos")
    public void validarResultadosDeLaConsulta(ExamplesTable riesgos){
        busquedaDeRiesgosPASteps.validarResultadosDeLaConsulta(riesgos);
    }
}
