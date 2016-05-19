package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.BusquedaDePolizaPage;
import com.sura.policycenter.selenium.pages.InicioPage;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class BusquedaDePolizaSteps extends ScenarioSteps{

    BusquedaDePolizaPage busquedaDePolizaPage = new BusquedaDePolizaPage(getDriver());
    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }


    public void irABuscarPoliza() {
        inicioPage().irABuscarPolizas();
    }

    public void buscarPolizaPorNumeroDePoliza(String buscarNumeroPoliza) {
        busquedaDePolizaPage.buscarPolizaPorNumeroDePoliza(buscarNumeroPoliza);
    }

    public void validarResultadosDeLaBusqueda(ExamplesTable resultadoBusqueda) throws Exception{
        busquedaDePolizaPage.validarResultadosDeLaBusqueda(resultadoBusqueda);
    }

    public void buscarPolizaPorNumeroDeCuenta(String numeroCuenta){
        busquedaDePolizaPage.buscarPolizaPorNumeroDeCuenta(numeroCuenta);
    }

}
