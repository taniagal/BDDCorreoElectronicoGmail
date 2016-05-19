package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.BusquedaDePolizaPage;
import com.sura.policycenter.selenium.pages.InicioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class BusquedaDePolizaSteps extends ScenarioSteps{

    BusquedaDePolizaPage busquedaDePolizaPage = new BusquedaDePolizaPage(getDriver());
    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }
    public BusquedaDePolizaSteps(Pages pages){super(pages);}

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
}
