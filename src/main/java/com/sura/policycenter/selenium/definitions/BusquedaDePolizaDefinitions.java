package com.sura.policycenter.selenium.definitions;

import com.google.inject.name.Named;
import com.sura.policycenter.selenium.steps.BusquedaDePolizaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class BusquedaDePolizaDefinitions {

    @Steps
    BusquedaDePolizaSteps busquedaDePolizaSteps;

    @Given("que existe una poliza")
    public void irABuscarPoliza(){
        busquedaDePolizaSteps.irABuscarPoliza();
    }

    @When("la busco por numero de poliza <buscarNumeroPoliza>")
    public void buscarPolizaPorNumeroDePoliza(@Named("buscarNumeroPoliza") String buscarNumeroPoliza){
        busquedaDePolizaSteps.buscarPolizaPorNumeroDePoliza(buscarNumeroPoliza);
    }

    @Then("se debe visualizar la siguiente información: $resultadoBusqueda")
    public void validarResultadosDeLaBusqueda(ExamplesTable resultadoBusqueda){
        busquedaDePolizaSteps.validarResultadosDeLaBusqueda(resultadoBusqueda);
    }
}
