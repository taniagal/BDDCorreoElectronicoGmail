package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.poliza.BusquedaDePolizaPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

public class BusquedaDePolizaSteps extends ScenarioSteps {

    @Page
    private BusquedaDePolizaPage busquedaDePolizaPage;

    @Step
    public void irABuscarPoliza() {
        busquedaDePolizaPage.irABuscarPoliza();
    }

    @Step
    public void buscarPolizaPorNumeroDePoliza(String buscarNumeroPoliza) {
        busquedaDePolizaPage.buscarPolizaPorNumeroDePoliza(buscarNumeroPoliza);
    }

    @Step
    public void validarResultadosDeLaBusqueda(ExamplesTable resultadoBusqueda) {
        busquedaDePolizaPage.validarResultadosDeLaBusqueda(resultadoBusqueda);
    }

    @Step
    public void buscarPolizaPorNumeroDeCuenta(String numeroCuenta) {
        busquedaDePolizaPage.buscarPolizaPorNumeroDeCuenta(numeroCuenta);
    }

    @Step
    public void validarMensajeDeConsultaSinResultados(String mensaje) {
        busquedaDePolizaPage.validarMensajeDeConsultaSinResultados(mensaje);
    }

    @Step
    public void buscarPolizaPorProducto(String producto) {
        busquedaDePolizaPage.buscarPolizaPorProducto(producto);
    }

    @Step
    public void buscarPolizaPorAgente(String agente) {
        busquedaDePolizaPage.buscarPolizaPorAgente(agente);
    }

    @Step
    public void buscarPolizaPorCodigoAgente(String codigoAgente) {
        busquedaDePolizaPage.buscarPolizaPorCodigoAgente(codigoAgente);
    }

    @Step
    public void buscarPolizaPorNumeroCuentaYProducto(String numeroCuenta, String producto) {
        busquedaDePolizaPage.buscarPolizaPorNumeroCuentaYProducto(numeroCuenta, producto);
    }

    @Step
    public void buscarPorNumerocuentaYAgente(String numeroCuenta, String agente) {
        busquedaDePolizaPage.buscarPorNumerocuentaYAgente(numeroCuenta, agente);
    }

    @Step
    public void buscarPolizaPorNumeroCuentaYCodigoAgente(String numeroCuenta, String codigoAgente) {
        busquedaDePolizaPage.buscarPolizaPorNumeroCuentaYCodigoAgente(numeroCuenta, codigoAgente);
    }

    @Step
    public void buscarPolizaPorNumeroCuentaYDosOpcionales(String numeroCuenta, String producto, String codigoAgente) {
        busquedaDePolizaPage.buscarPolizaPorNumeroCuentaYDosOpcionales(numeroCuenta, producto, codigoAgente);
    }

    @Step
    public void buscarPolizaPorNumeroDeCuentaSeleccionar(String numeroCuenta) {
        busquedaDePolizaPage.buscarPolizaPorNumeroDeCuentaSeleccionar(numeroCuenta);
    }

    public void buscarNumeroDePoliza() {
        busquedaDePolizaPage.buscarNumeroDePoliza();

    }

    @Step
    public String capturarNumeroPoliza() {
        return busquedaDePolizaPage.capturarNumeroPoliza();
    }
}
