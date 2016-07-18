package com.sura.policycenter.selenium.steps.colectivas;

import com.sura.policycenter.selenium.pages.colectivas.NuevaPolizaPage;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class NuevaPolizaSteps extends ScenarioSteps{

    private NuevaPolizaPage nuevaPolizaPage;

    public void desplegarListaDeOrganizaciones() {
        nuevaPolizaPage.desplegarListaDeOrganizaciones();
    }

    public void validarListaDeOrganizaciones(ExamplesTable listaOrganizaciones) {
        nuevaPolizaPage.validarListaDeOrganizaciones(listaOrganizaciones);
    }

    public void seleccionarOrganizacion(String organizacion) {
        nuevaPolizaPage.seleccionarOrganizacion(organizacion);
    }

    public void desplegarListaCanal() {
        nuevaPolizaPage.desplegarListaCanal();
    }

    public void validaListaCanalDeAcuerdoALaOrganizacion(String datosListaCanal) {
        nuevaPolizaPage.validaListaCanalDeAcuerdoALaOrganizacion(datosListaCanal);
    }

    public void buscarCuenta(String numCuenta) {
        nuevaPolizaPage.buscarCuenta(numCuenta);
    }

    public void validarCamposDeLaVentanaNuevaCotizacion() {
        nuevaPolizaPage.validarCamposDeLaVentanaNuevaCotizacion();
    }

    public void validarBotonesDeLaTablaProductosDeshabilitados() {
        nuevaPolizaPage.validarBotonesDeshabilitadosPorProducto();
    }

    public void seleccionarCanal(String canal) {
        nuevaPolizaPage.seleccionarCanal(canal);
    }

    public void seleccionarElTipoDePoliza(String tipoPoliza) {
        nuevaPolizaPage.seleccionarElTipoDePoliza(tipoPoliza);
    }

    public void validarProductos(String productos, String tipoPoliza) {
        nuevaPolizaPage.validarProductos(productos, tipoPoliza);
    }

    public void validarBotonesHabilitados() {
        nuevaPolizaPage.validarBotonesHabilitados();
    }
}
