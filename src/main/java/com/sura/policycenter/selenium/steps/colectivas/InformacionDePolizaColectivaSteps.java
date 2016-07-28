package com.sura.policycenter.selenium.steps.colectivas;


import com.sura.policycenter.selenium.pages.colectivas.InformacionDePolizaColectivaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class InformacionDePolizaColectivaSteps extends ScenarioSteps{

    InformacionDePolizaColectivaPage informacionDePolizaColectivaPage;

    @Step
    public void validarInformacionDePolizaColectiva(ExamplesTable informacionPolizaColectiva) {
        informacionDePolizaColectivaPage.validarInformacionDePolizaColectiva(informacionPolizaColectiva);
    }

    @Step
    public void seleccionarProductoDePolizaColectiva(String producto) {
        informacionDePolizaColectivaPage.seleccionarProductoPolizaColectiva(producto);
    }

    @Step
    public void validarFechaFinVigencia(int cantidadAniosVigencia) {
        informacionDePolizaColectivaPage.validarFechaFinDeVigencia(cantidadAniosVigencia);
    }

    @Step
    public void seleccionarSegundoTomadorParaPolizaColectiva() {
        informacionDePolizaColectivaPage.seleccionarSegundoTomador();
    }

    @Step
    public void validarInformacionDelSegundoTomador(ExamplesTable informacionSegundoTomador) {
        informacionDePolizaColectivaPage.validarDatosDeSegundoTomador(informacionSegundoTomador);
    }

    @Step
    public void cambiarLaFechaDeInicioDeVigencia() {
        informacionDePolizaColectivaPage.cambiarFechaInicioVigencia();
    }

    @Step
    public void validarFechaDeFinDeVigenciaRecalculada(int aniosFinVigencia) {
        informacionDePolizaColectivaPage.validarFechaFinDeVigenciaCambiada(aniosFinVigencia);
    }

    @Step
    public void cambiarLaFechaDeInicioDeVigenciaSesentaDias(String sesentaDias) {
        informacionDePolizaColectivaPage.ingresarFechaInicioInvalidaParaRetroactividad(sesentaDias);
    }

    @Step
    public void darClicEnElBotonSiguiente() {
        informacionDePolizaColectivaPage.clicEnSiguiente();
    }

    @Step
    public void validarMensajeDeRetroactividad(String mensaje) {
        informacionDePolizaColectivaPage.validarMensajeRetroactividadInvalida(mensaje);
    }

    @Step
    public void ingresarPorcentajeDeDescuentoDeLaPoliza(String porcentaje) {
        informacionDePolizaColectivaPage.ingresarDescuentoPoliza(porcentaje);
    }

    @Step
    public void validarMensajeDeValidacionDelCampoDescuento(String mensaje) {
        informacionDePolizaColectivaPage.validarMensajeDescuentoInvalido(mensaje);
    }

    @Step
    public void darClicEnAgregarCoaseguro() {
        informacionDePolizaColectivaPage.clicEnAgregarCoaseguro();
    }

    @Step
    public void ingresarPorcentajeDeParticipacion() {
        informacionDePolizaColectivaPage.ingresarPorcentajeDeParticipacion();
    }

    @Step
    public void darClicEnAceptarDeCoaseuguro() {
        informacionDePolizaColectivaPage.darClicEnAceptarDeCoaseuguro();
    }

    @Step
    public void validarOpcionesDeEditarYEliminar() {
        informacionDePolizaColectivaPage.validarLinksDeCoaseguroVisiblesYHabilitados();
    }

    @Step
    public void darClicEnEditarDeCoaseuguro() {
        informacionDePolizaColectivaPage.clicEnEditarCoaseguro();
    }

    public void darClicEnCancelarDeCoaseuguro() {
        informacionDePolizaColectivaPage.clicEnCancelarDeCoaseguro();
    }

    public void darClicEnEliminarCoaseuguro() {
        informacionDePolizaColectivaPage.clicEnEliminarCoaseguro();
    }

    public void validarLaOpcionDeEditarCoaseguro() {
        informacionDePolizaColectivaPage.validarPantallaDeEdicion();
    }

    public void validarEliminacionDeCoaseguro() {
        informacionDePolizaColectivaPage.validarEliminacionDeCoaseguro();
    }
}
