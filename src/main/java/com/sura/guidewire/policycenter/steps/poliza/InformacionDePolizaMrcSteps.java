package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.commons.InicioPage;
import com.sura.guidewire.policycenter.utils.menu.opciones.cuenta.OpcionesInformacionPolizaMrcPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

public class InformacionDePolizaMrcSteps extends ScenarioSteps {

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
    public void ingresarFechaFinVigencia() {
        opcionesInformacionPolizaMrcPage.ingresarFechaFinVigencia();
    }

    @Step
    public void ingresarTipoVigencia(String tipoVigencia) {
        opcionesInformacionPolizaMrcPage.ingresarTipoDeVigencia(tipoVigencia);
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
    public void seleccionarOpcionCotizar() {
        opcionesInformacionPolizaMrcPage.seleccionarOpcionCotizar();
    }

    @Step
    public void seleccionarOpcionCotizarPolizaPrincipal() {
        opcionesInformacionPolizaMrcPage.seleccionarOpcionCotizarPolizaPrincipal();
    }

    @Step
    public void agregarCoaseguro(String tipoCo, String polizaRef, String documento, ExamplesTable tablaaseguradoras) {
        opcionesInformacionPolizaMrcPage.agregarUnCoaseguro(tipoCo, polizaRef, documento, tablaaseguradoras);
    }

    @Step
    public void validarMensajesCoaseguros(ExamplesTable mensajes) {
        opcionesInformacionPolizaMrcPage.validarMensajesCoaseguros(mensajes);
    }

    @Step
    public void validarCamposInhabilitados() {
        opcionesInformacionPolizaMrcPage.noHabilitarNumeroDocumentoCoaseguro();
    }

    public void validarCampos(String estadouno,ExamplesTable menusesperados) {
        opcionesInformacionPolizaMrcPage.validarCamposMenuLateral(estadouno, menusesperados);
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
}

