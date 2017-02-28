package com.sura.guidewire.policycenter.steps.actividades;

import com.sura.guidewire.policycenter.pages.IngresoDeActividadAPolizaPage;
import com.sura.guidewire.policycenter.pages.actividades.BusquedaActividadesPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class BusquedaActividadesSteps extends ScenarioSteps {

    BusquedaActividadesPage busquedaActividades;
    IngresoDeActividadAPolizaPage ingresoDeActividadAPolizaPage;

    @Step
    public void buscarActividades() {
        busquedaActividades.irABuscarActividades();
    }

    @Step
    public void filtrarPorAsignado(String usuario) {
        busquedaActividades.filtrarPorAsignado(usuario);
    }

    @Step
    public void validarResultado(ExamplesTable resultadoFiltroActividades) {
        busquedaActividades.validarResultado(resultadoFiltroActividades);
    }

    @Step
    public void filtrarPorNumeroDePoliza(String numeroPoliza) {
        busquedaActividades.filtrarPorNumeroDePoliza(numeroPoliza);
    }

    @Step
    public void filtrarPorNumeroDeCuenta(String numeroCuenta) {
        busquedaActividades.filtrarPorNumeroDeCuenta(numeroCuenta);
    }

    @Step
    public void buscarSinFiltro() {
        busquedaActividades.buscarSinFiltro();
    }

    @Step
    public void validarMensajeFiltroRequerido(String mensaje) {
        busquedaActividades.validarMensjeFiltroRequerido(mensaje);
    }

    @Step
    public void buscarPorFiltrosUsuarioYPrioridad(String usuario, String prioridad) {
        busquedaActividades.buscarPorFiltrosUsuarioYPrioridad(usuario, prioridad);
    }

    @Step
    public void buscarPorFiltrosUsuarioYEstadoDeActividad(String usuario, String actividad) {
        busquedaActividades.buscarPorFiltrosUsuarioYEstadoDeActividad(usuario, actividad);
    }

    @Step
    public void buscarPorFiltrosUsuarioYVencida(String usuario, String vencida) {
        busquedaActividades.buscarPorFiltrosUsuarioYVencida(usuario, vencida);
    }

    @Step
    public void buscarPorFiltroOpcional(String estadoActividad) {
        busquedaActividades.buscarPorFiltroOpcional(estadoActividad);
    }

    @Step
    public void agregarActividadALaPoliza() {
        ingresoDeActividadAPolizaPage.irALaOpcionNuevaActividadDeLaPoliza();
    }

    @Step
    public void asignarActividadAPoliza() {
        ingresoDeActividadAPolizaPage.crearUnaActividadPorDefectoALaPoliza();
    }
}
