package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.poliza.NuevaPolizaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class NuevaPolizaSteps extends ScenarioSteps{

    private NuevaPolizaPage nuevaPolizaPage;

    @Step
    public void validarListaDeOrganizaciones(ExamplesTable listaOrganizaciones) {
        nuevaPolizaPage.validarListaDeOrganizaciones(listaOrganizaciones);
    }

    @Step
    public void seleccionarElTipoDePoliza(ExamplesTable datosAutos) {
        nuevaPolizaPage.seleccionarElTipoDePoliza(datosAutos);
    }


    @Step
    public void validaListaCanalDeAcuerdoALaOrganizacion(String datosListaCanal) {
        nuevaPolizaPage.validaListaCanalDeAcuerdoALaOrganizacion(datosListaCanal);
    }

    @Step
    public void buscarCuenta(String numCuenta) {
        nuevaPolizaPage.buscarCuenta(numCuenta);
    }

    @Step
    public void validarBotonesDeLaTablaProductosHabilitados() {
        nuevaPolizaPage.validarBotonesHabilitadosPorProducto();
    }
}
