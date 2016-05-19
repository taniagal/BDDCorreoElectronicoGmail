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

    @Given("que voy a buscar una poliza")
    public void irABuscarPoliza(){
        busquedaDePolizaSteps.irABuscarPoliza();
    }

    @When("la busco por numero de poliza <buscarNumeroPoliza>")
    public void buscarPolizaPorNumeroDePoliza(@Named("buscarNumeroPoliza") String buscarNumeroPoliza){
        busquedaDePolizaSteps.buscarPolizaPorNumeroDePoliza(buscarNumeroPoliza);
    }

    @When("la busco por producto <producto>")
    public void buscarPolizaPorProducto(@Named("producto") String producto){
        busquedaDePolizaSteps.buscarPolizaPorProducto(producto);
    }

    @When("la busco por agente <agente>")
    public void buscarPolizaPorAgente(@Named("agente") String agente){
        busquedaDePolizaSteps.buscarPolizaPorAgente(agente);
    }

    @When("la busco por codigo de agente <codigoAgente>")
    public void buscarPolizaPorCodigoAgente(@Named("codigoAgente") String codigoAgente){
        busquedaDePolizaSteps.buscarPolizaPorCodigoAgente(codigoAgente);
    }

    @Then("se debe visualizar la siguiente información: $resultadoBusqueda")
    public void validarResultadosDeLaBusqueda(ExamplesTable resultadoBusqueda){
        busquedaDePolizaSteps.validarResultadosDeLaBusqueda(resultadoBusqueda);
    }

    @When("la busco por numero de cuenta <numeroCuenta>")
    public void buscarPolizaPorNumeroDeCuenta(@Named("numeroCuenta") String numeroCuenta){
        busquedaDePolizaSteps.buscarPolizaPorNumeroDeCuenta(numeroCuenta);
    }

    @Then("debe mostrar el mensaje <mensaje>")
    public void validarMensajeDeConsultaSinResultados(@Named("mensaje") String mensaje){
        busquedaDePolizaSteps.validarMensajeDeConsultaSinResultados(mensaje);
    }
}
