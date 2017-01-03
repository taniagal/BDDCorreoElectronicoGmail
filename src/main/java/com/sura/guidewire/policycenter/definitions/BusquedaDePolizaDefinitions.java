package com.sura.guidewire.policycenter.definitions;

import com.google.inject.name.Named;
import com.sura.guidewire.policycenter.steps.BusquedaDePolizaSteps;
import com.sura.guidewire.policycenter.steps.CambioDePolizaSteps;
import com.sura.guidewire.policycenter.steps.commons.LoginSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

public class BusquedaDePolizaDefinitions {
    @Steps
    BusquedaDePolizaSteps busquedaDePolizaSteps;

    @Steps
    LoginSteps loginSteps;

    @Steps
    CambioDePolizaSteps cambioDePolizaSteps;

    @Given("que voy a buscar una poliza")
    public void irABuscarPoliza() {
        busquedaDePolizaSteps.irABuscarPoliza();
    }

    @When("la busco por numero de poliza <buscarNumeroPoliza>")
    public void buscarPolizaPorNumeroDePoliza(@Named("buscarNumeroPoliza") String buscarNumeroPoliza) {
        busquedaDePolizaSteps.buscarPolizaPorNumeroDePoliza(buscarNumeroPoliza);
    }

    @When("la busco por producto <producto>")
    public void buscarPolizaPorProducto(@Named("producto") String producto) {
        busquedaDePolizaSteps.buscarPolizaPorProducto(producto);
    }

    @When("la busco por agente <agente>")
    public void buscarPolizaPorAgente(@Named("agente") String agente) {
        busquedaDePolizaSteps.buscarPolizaPorAgente(agente);
    }

    @When("la busco por codigo de agente <codigoAgente>")
    public void buscarPolizaPorCodigoAgente(@Named("codigoAgente") String codigoAgente) {
        busquedaDePolizaSteps.buscarPolizaPorCodigoAgente(codigoAgente);
    }

    @Then("se debe visualizar la siguiente información: $resultadoBusqueda")
    public void validarResultadosDeLaBusqueda(ExamplesTable resultadoBusqueda) {
        busquedaDePolizaSteps.validarResultadosDeLaBusqueda(resultadoBusqueda);
    }

    @When("la busco por numero de cuenta <numeroCuenta>")
    public void buscarPolizaPorNumeroDeCuenta(@Named("numeroCuenta") String numeroCuenta) {
        busquedaDePolizaSteps.buscarPolizaPorNumeroDeCuenta(numeroCuenta);
    }

    @Then("debe mostrar el mensaje <mensaje>")
    public void validarMensajeDeConsultaSinResultados(@Named("mensaje") String mensaje) {
        busquedaDePolizaSteps.validarMensajeDeConsultaSinResultados(mensaje);
    }

    @When("la busco por numero de cuenta <numeroCuenta> y producto <producto>")
    public void buscarPolizaPorNumeroCuentaYProducto(@Named("numeroCuenta") String numeroCuenta,
                                                     @Named("producto") String producto) {
        busquedaDePolizaSteps.buscarPolizaPorNumeroCuentaYProducto(numeroCuenta, producto);
    }

    @When("la busco por numero de cuenta <numeroCuenta> y agente <agente>")
    public void buscarPolizaPorNumeroCuentaY(@Named("numeroCuenta") String numeroCuenta,
                                             @Named("agente") String agente) {
        busquedaDePolizaSteps.buscarPorNumerocuentaYAgente(numeroCuenta, agente);
    }


    @When("la busco por numero de cuenta <numeroCuenta> y codigo de agente <codigoAgente>")
    public void buscarPolizaPorNumeroCuentaYCodigoAgente(@Named("numeroCuenta") String numeroCuenta,
                                                         @Named("codigoAgente") String codigoAgente) {
        busquedaDePolizaSteps.buscarPolizaPorNumeroCuentaYCodigoAgente(numeroCuenta, codigoAgente);
    }

    @When("la busco por numero de cuenta <numeroCuenta>, producto <producto> y codigo de agente <codigoAgente>")
    public void buscarPolizaPorNumeroCuentaYDosOpcionales(@Named("numeroCuenta") String numeroCuenta,
                                                          @Named("producto") String producto,
                                                          @Named("numeroCuenta") String codigoAgente) {
        busquedaDePolizaSteps.buscarPolizaPorNumeroCuentaYDosOpcionales(numeroCuenta, producto, codigoAgente);
    }

    @Given("me encuentro logueado en policy center")
    public void ingresarAPolicyCenter() {
        loginSteps.login();
    }

    @When("busque la poliza <poliza>")
    public void buscarPoliza(@Named("poliza") String poliza) {
        cambioDePolizaSteps.irABuscarPoliza(poliza);
    }

    @Then("debo poder ver el resumen de la poliza <poliza>")
    public void verificarResumenDePoliza(@Named("poliza") String poliza) {
        busquedaDePolizaSteps.verificarResumenDePoliza(poliza);
    }
}
