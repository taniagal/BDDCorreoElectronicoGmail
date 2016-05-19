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

    @When("la busco por numero de cuenta <numeroCuenta>")
    public void buscarPolizaPorNumeroDeCuenta(@Named("numeroCuenta") String numeroCuenta){
        busquedaDePolizaSteps.buscarPolizaPorNumeroDeCuenta(numeroCuenta);
    }

    @When("la busco por numero de cuenta <numeroCuenta> y producto <producto>")
    public void buscarPolizaPorNumeroCuentaYProducto(@Named("numeroCuenta") String numeroCuenta,
                                                     @Named("producto") String producto){
        busquedaDePolizaSteps.buscarPolizaPorNumeroCuentaYProducto(numeroCuenta, producto);
    }

    @When("la busco por numero de cuenta <numeroCuenta> y agente <agente>")
    public void buscarPolizaPorNumeroCuentaY(@Named("numeroCuenta") String numeroCuenta,
                                             @Named("agente") String agente){
        busquedaDePolizaSteps.buscarPorNumerocuentaYAgente(numeroCuenta, agente);
    }


    @When("la busco por numero de cuenta <numeroCuenta> y codigo de agente <codigoAgente>")
    public void buscarPolizaPorNumeroCuentaYCodigoAgente(@Named("numeroCuenta") String numeroCuenta,
                                             @Named("codigoAgente") String codigoAgente){
        busquedaDePolizaSteps.buscarPolizaPorNumeroCuentaYCodigoAgente(numeroCuenta, codigoAgente);
    }

    @When("la busco por numero de cuenta <numeroCuenta>, producto <producto> y codigo de agente <codigoAgente>")
    public void buscarPolizaPorNumeroCuentaYDosOpcionales(@Named("numeroCuenta") String numeroCuenta,
                                                          @Named("producto") String producto,
                                                          @Named("numeroCuenta") String codigoAgente) {
        busquedaDePolizaSteps.buscarPolizaPorNumeroCuentaYDosOpcionales(numeroCuenta, producto, codigoAgente);
    }
}
