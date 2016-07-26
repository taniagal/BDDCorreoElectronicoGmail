package com.sura.policycenter.selenium.steps.colectivas;

import com.sura.policycenter.selenium.pages.colectivas.NuevaPolizaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class NuevaPolizaSteps extends ScenarioSteps{

    private NuevaPolizaPage nuevaPolizaPage;

    @Step
    public void desplegarListaDeOrganizaciones() {
        nuevaPolizaPage.desplegarListaDeOrganizaciones();
    }

    @Step
    public void validarListaDeOrganizaciones(ExamplesTable listaOrganizaciones) {
        nuevaPolizaPage.validarListaDeOrganizaciones(listaOrganizaciones);
    }

    @Step
    public void seleccionarOrganizacion(String organizacion) {
        nuevaPolizaPage.seleccionarOrganizacion(organizacion);
    }

    @Step
    public void desplegarListaCanal() {
        nuevaPolizaPage.desplegarListaCanal();
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
    public void validarCamposDeLaVentanaNuevaCotizacion() {
        nuevaPolizaPage.validarCamposDeLaVentanaNuevaCotizacion();
    }

    @Step
    public void validarBotonesDeLaTablaProductosDeshabilitados() {
        nuevaPolizaPage.validarBotonesDeshabilitadosPorProducto();
    }

    @Step
    public void seleccionarCanal(String canal) {
        nuevaPolizaPage.seleccionarCanal(canal);
    }

    @Step
    public void seleccionarElTipoDePoliza(String tipoPoliza) {
        nuevaPolizaPage.seleccionarElTipoDePoliza(tipoPoliza);
    }

    @Step
    public void validarProductos(String productos, String tipoPoliza) {
        nuevaPolizaPage.validarProductos(productos, tipoPoliza);
    }

    @Step
    public void validarBotonesHabilitados() {
        nuevaPolizaPage.validarBotonesHabilitados();
    }

    @Step
    public void validarNoSeListanProductos() {
        nuevaPolizaPage.validarNoSeListanProductos();
    }
}
