package com.sura.guidewire.policycenter.steps.commons;


import com.sura.guidewire.policycenter.pages.commons.InicioPage;
import com.sura.guidewire.policycenter.pages.commons.NuevaCotizacionPage;
import com.sura.guidewire.policycenter.pages.poliza.ValidacionesInformacionDeVehiculoPage;
import com.sura.guidewire.policycenter.pages.tarifacion.TarifaAutosPage;
import com.sura.guidewire.policycenter.steps.poliza.ValidacionesInformacionDeVehiculoSteps;
import com.sura.guidewire.policycenter.utils.menu.opciones.cuenta.OpcionesInformacionPolizaMrcPage;

import java.util.Map;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

public class NuevaCotizacionSteps extends ScenarioSteps {
    NuevaCotizacionPage nuevaCotizacionPage = new NuevaCotizacionPage(getDriver());
    ValidacionesInformacionDeVehiculoPage vehiculoPage = new ValidacionesInformacionDeVehiculoPage(getDriver());
    TarifaAutosPage tarifaAutosPage = new TarifaAutosPage(getDriver());
    @Page
    OpcionesInformacionPolizaMrcPage opcionesInformacionPolizaMrcPage;

    @Steps
    ValidacionesInformacionDeVehiculoSteps vehiculoSteps;

    public NuevaCotizacionSteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    @Step
    public void copiarEnvio() {
        nuevaCotizacionPage.copiarEnvio();
    }

    @Step
    public void irANuevaCotizacion() {
        nuevaCotizacionPage.irANuevaCotizacion();
    }

    @Step
    public void nuevaCotizacionenCuenta() {
        nuevaCotizacionPage.nuevaCotizacionEnCuenta();
    }

    @Step
    public void seleccionarProducto(ExamplesTable datosCotizacion) {
        nuevaCotizacionPage.seleccionarProducto(datosCotizacion);
    }

    @Step
    public void seleccionarProductoDesdeCuenta(ExamplesTable datosCotizacion) {
        nuevaCotizacionPage.seleccionarProductoDesdeCuenta(datosCotizacion);
    }

    @Step
    public void seleccionarAgente(String cuenta, String agente) {
        nuevaCotizacionPage.seleccionarAgente(cuenta, agente);
    }

    @Step
    public void seleccionDeProducto(String producto) {
        nuevaCotizacionPage.seleccionDeProducto(producto);
    }

    @Step
    public void irABuscarCotizacion(String cotizacion) {
        inicioPage().irABuscarSubPoliza(cotizacion);
    }

    @Step
    public void cotizarEnvioCopiadoPa(ExamplesTable datosCotizacion) {
        vehiculoPage.irAVehiculos();
        vehiculoSteps.agregarPlaca();
        vehiculoPage.agregarCiudadDeCirculacion(datosCotizacion);
        vehiculoPage.validarQueNoPermiteAgregarMasDeUnAuto();
        vehiculoPage.clickSiguiente();
        tarifaAutosPage.seleccionarCoberturasRC(datosCotizacion);
        tarifaAutosPage.seleccionarCoberturasHurto(datosCotizacion);
        tarifaAutosPage.seleccionarCoberturasHurto1(datosCotizacion);
        tarifaAutosPage.seleccionarCoberturasDanios(datosCotizacion);
        tarifaAutosPage.seleccionarCoberturasDanios1(datosCotizacion);
        tarifaAutosPage.seleccionarAsistenciaYCarroDeReemplazo(datosCotizacion);
        tarifaAutosPage.intentarCotizar();
    }

    @Step
    public void intentarCotizar() {
        tarifaAutosPage.intentarCotizar();
    }

    @Step
    public void seleccionarCoberturaBasicas(ExamplesTable datosCotizacion) {
        tarifaAutosPage.seleccionarCoberturasBasica(datosCotizacion);
        tarifaAutosPage.desMarcarCoberturas();
    }

    @Step
    public void seleccionarReaseguroEspecialNo() {
        nuevaCotizacionPage.seleccionarReaseguroEspecialNo();
    }

    @Step
    public void cotizarLaPolizaRiesgoConTasaUnica(ExamplesTable datos) {
        Map<String, String> datosAsegurado = datos.getRows().get(0);
        tarifaAutosPage.agregarAsegurado(datosAsegurado.get("tipoDocumento"), datosAsegurado.get("documento"));
        vehiculoPage.clickSiguiente();
        vehiculoPage.crearVehiculo();
        tarifaAutosPage.relacionarAsegurado();
        vehiculoPage.agregarVehiculo(datos);
        vehiculoPage.clickSiguiente();
        this.coberturasPlanGlobal(datos);
    }

    public void coberturasPlanGlobal(ExamplesTable datos) {
        Map<String, String> datosAsegurado = datos.getRows().get(0);
        tarifaAutosPage.seleccionarCoberturasBasica(datos);
        tarifaAutosPage.seleccionarCoberturasHurto(datos);
        tarifaAutosPage.seleccionarCoberturasHurto1(datos);
        tarifaAutosPage.seleccionarCoberturasDanios(datos);
        tarifaAutosPage.seleccionarCoberturasDanios1(datos);
        tarifaAutosPage.seleccionarCoberturaAsistencia(datosAsegurado.get("AS"));
        tarifaAutosPage.seleccionarCoberturaCarroDeReemplazo(datosAsegurado.get("CRPT"), datosAsegurado.get("CRPP"));
        opcionesInformacionPolizaMrcPage.seleccionarOpcionCotizarPolizaPrincipal();
    }

    @Step
    public void verificarFechaEfectivaDeCotizacion() {
        nuevaCotizacionPage.verificarFechaEfectivaDeCotizacion();
    }

    @Step
    public void copiarEnvioRiesgo() {
        nuevaCotizacionPage.copiarEnvioRiesgo();
    }

    public void capturarParametros(ExamplesTable datosParametros) {
        nuevaCotizacionPage.datosParametros(datosParametros);
    }
}