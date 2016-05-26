package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.BusquedaDePolizaPage;
import com.sura.policycenter.selenium.pages.InicioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class BusquedaDePolizaSteps extends ScenarioSteps{

    private final BusquedaDePolizaPage busquedaDePolizaPage = new BusquedaDePolizaPage(getDriver());

    public BusquedaDePolizaSteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    @Step
    public void irABuscarPoliza() {
        inicioPage().irABuscarPolizas();
    }

    @Step
    public void buscarPolizaPorNumeroDePoliza(String buscarNumeroPoliza) {
        busquedaDePolizaPage.buscarPolizaPorNumeroDePoliza(buscarNumeroPoliza);
    }

    @Step
    public void validarResultadosDeLaBusqueda(ExamplesTable resultadoBusqueda){
        busquedaDePolizaPage.validarResultadosDeLaBusqueda(resultadoBusqueda);
    }

    public void buscarPolizaPorNumeroDeCuenta(String numeroCuenta){
        busquedaDePolizaPage.buscarPolizaPorNumeroDeCuenta(numeroCuenta);
    }

    public void validarMensajeDeConsultaSinResultados(String mensaje) {
        busquedaDePolizaPage.validarMensajeDeConsultaSinResultados(mensaje);
    }

    public void buscarPolizaPorProducto(String producto) {
        busquedaDePolizaPage.buscarPolizaPorProducto(producto);
    }

    public void buscarPolizaPorAgente(String agente) {
        busquedaDePolizaPage.buscarPolizaPorAgente(agente);
    }

    public void buscarPolizaPorCodigoAgente(String codigoAgente) {
        busquedaDePolizaPage.buscarPolizaPorCodigoAgente(codigoAgente);
    }

    public void buscarPolizaPorNumeroCuentaYProducto(String numeroCuenta, String producto) {
        busquedaDePolizaPage.buscarPolizaPorNumeroCuentaYProducto(numeroCuenta, producto);
    }

    public void buscarPorNumerocuentaYAgente(String numeroCuenta, String agente) {
        busquedaDePolizaPage.buscarPorNumerocuentaYAgente(numeroCuenta, agente);
    }

    public void buscarPolizaPorNumeroCuentaYCodigoAgente(String numeroCuenta, String codigoAgente) {
        busquedaDePolizaPage.buscarPolizaPorNumeroCuentaYCodigoAgente(numeroCuenta, codigoAgente);
    }


    public void buscarPolizaPorNumeroCuentaYDosOpcionales(String numeroCuenta, String producto, String codigoAgente) {
        busquedaDePolizaPage.buscarPolizaPorNumeroCuentaYDosOpcionales(numeroCuenta, producto, codigoAgente);
    }
}
