package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.BusquedaDePolizaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class BusquedaDePolizaSteps extends ScenarioSteps{

    private BusquedaDePolizaPage busquedaDePolizaPage = new BusquedaDePolizaPage(getDriver());

    public BusquedaDePolizaSteps(Pages pages){
        super(pages);
    }

    @Step
    public void irABuscarPoliza() {
        busquedaDePolizaPage.irABuscarPoliza();
    }

    @Step
    public void buscarPolizaPorNumeroDePoliza(String buscarNumeroPoliza) {
        busquedaDePolizaPage.buscarPolizaPorNumeroDePoliza(buscarNumeroPoliza);
    }

    @Step
    public void validarResultadosDeLaBusqueda(ExamplesTable resultadoBusqueda){
        busquedaDePolizaPage.validarResultadosDeLaBusqueda(resultadoBusqueda);
    }

    @Step
    public void buscarPolizaPorNumeroDeCuenta(String numeroCuenta){
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
}
