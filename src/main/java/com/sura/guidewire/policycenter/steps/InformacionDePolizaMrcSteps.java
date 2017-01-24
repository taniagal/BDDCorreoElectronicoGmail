package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.DisponibilidadDetalleProductoPage;
import com.sura.guidewire.policycenter.pages.commons.InicioPage;
import com.sura.guidewire.policycenter.pages.commons.NuevaCotizacionPage;
import com.sura.guidewire.policycenter.utils.menu.opciones.cuenta.OpcionesInformacionPolizaMrcPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

public class InformacionDePolizaMrcSteps extends ScenarioSteps {

    @Page
    DisponibilidadDetalleProductoPage disponibilidadDetalleProductoPage;
    @Page
    NuevaCotizacionPage nuevaCotizacionPage;
    @Page
    OpcionesInformacionPolizaMrcPage opcionesInformacionPolizaMrcPage;

    public InformacionDePolizaMrcSteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    @Step
    public void navegarBarraSuperior(String numCuenta) {
        inicioPage().irACuentaBuscar(numCuenta);
    }

    @Step
    public void navegarPorLasOpcionesDeAcciones() {
        inicioPage().irACuentaNuevoEnvioCuenta();
    }

    @Step
    public void seleccionaCotizacionParaProducto() {
        opcionesInformacionPolizaMrcPage.ingresaAgente();
    }

    @Step
    public void seleccionarProducto(String nomProducto) {
        opcionesInformacionPolizaMrcPage.seleccionarProducto(nomProducto);
    }

    @Step
    public void validaDatosDelTomador(String tomador) {
        opcionesInformacionPolizaMrcPage.validaNombreTomador(tomador);
        opcionesInformacionPolizaMrcPage.validarValoresDeCampos();
        opcionesInformacionPolizaMrcPage.validaCamposPoliza();
    }

    @Step
    public void ingresarFechaDeVigencia(String fechaInicioVigencia) {
        opcionesInformacionPolizaMrcPage.ingresarFechaVigencia(fechaInicioVigencia);
    }

    @Step
    public void validaMensajeEnPantalla(String mensaje) {
        opcionesInformacionPolizaMrcPage.validaMensajeEnPantalla(mensaje);

    }

    @Step
    public void ingresarTomadorAdicional(String tipoDocumento, String documento) {
        opcionesInformacionPolizaMrcPage.ingresarTomadorAdicional(tipoDocumento, documento);
    }

    @Step
    public void seleccionarSiEnReaseguro() {
        opcionesInformacionPolizaMrcPage.seleccionaRiesgoAceptado();
    }

    @Step
    public void validaOpcionesReaseguro() {
        opcionesInformacionPolizaMrcPage.validaReaseguro();
    }

    @Step
    public void eliminarDescripcionDeDireccionEnContacto() {
        opcionesInformacionPolizaMrcPage.editarDescripDireccionTomador();
    }

    @Step
    public void validarDescipcionDeDireccion() {
        opcionesInformacionPolizaMrcPage.validaFormularioDescripDireccion();
    }

    @Step
    public void ingresarNuevaCotizacion(String agente, String producto) {
        disponibilidadDetalleProductoPage.seleccionarAgente(agente);
        opcionesInformacionPolizaMrcPage.seleccionarProducto(producto);
    }

    @Step
    public void seleccionarOpcionCotizar() {
        opcionesInformacionPolizaMrcPage.seleccionarOpcionCotizar();
    }

    @Step
    public void seleccionarOpcionCotizarPolizaPrincipal() {
        opcionesInformacionPolizaMrcPage.seleccionarOpcionCotizarPolizaPrincipal();
    }

    @Step
    public void agrego_un_coaseguro(String tipoCo, ExamplesTable tablaaseguradoras) {
        opcionesInformacionPolizaMrcPage.agregarUnCoaseguro(tipoCo, tablaaseguradoras);
    }

    @Step
    public void validarMensajesCoaseguros(ExamplesTable mensajes) {
        opcionesInformacionPolizaMrcPage.validarMensajesCoaseguros(mensajes);
    }

    @Step
    public void validarCamposInhabilitados() {
        opcionesInformacionPolizaMrcPage.noHabilitarNumeroDocumentoCoaseguro();
    }

    public void validarCampos(String estadouno, String estadodos, ExamplesTable menusesperados) {
        opcionesInformacionPolizaMrcPage.validarCamposMenuLateral(estadouno, estadodos, menusesperados);
    }

    public void validarCamposInformacionPoliza(String estadouno, String estadodos, ExamplesTable menusesperados) {
        opcionesInformacionPolizaMrcPage.validarCamposInformacionPoliza(estadouno, estadodos, menusesperados);
    }

    @Step
    public void ingresarAEdificiosYUbicaciones() {
        opcionesInformacionPolizaMrcPage.seleccionBotonSiguiente();
    }

    @Step
    public void ingresarAEdificiosYUbicacionesEnCambioDePoliza() {
        opcionesInformacionPolizaMrcPage.seleccionBotonSiguienteenCambioDePoliza();
    }

    @Step
    public void ingresarAEdificiosYUbicacionesEnRenovacionDePoliza() {
        opcionesInformacionPolizaMrcPage.seleccionBotonSiguienteenRenovacionDePoliza();
    }

    @Step
    public void ingresarAInformacionDePoliza() {
        opcionesInformacionPolizaMrcPage.seleccionarInformacionDePoliza();
    }

    @Step
    public void ingresarAOpcionInformacionDePoliza() {
        opcionesInformacionPolizaMrcPage.ingresarAInformacionDePoliza();
    }

    @Step
    public void seleccionarPolizaTipoNoReaseguro() {
        opcionesInformacionPolizaMrcPage.seleccionarTipoNoReaseguro();
    }

    @Step
    public void darClicEnAceptarDeCoaseuguro() {
        opcionesInformacionPolizaMrcPage.darClicEnAceptarDeCoaseuguro();
    }

    public void validarCamposNoEditablesEnInformacionDePoliza() {
        opcionesInformacionPolizaMrcPage.validarcamposNoEditablesEnInformacionDePoliza();
    }

    @Step
    public void agregarOrganizacion(String organizacion) {
        nuevaCotizacionPage.llenarOrganizacion(organizacion);
    }
}

