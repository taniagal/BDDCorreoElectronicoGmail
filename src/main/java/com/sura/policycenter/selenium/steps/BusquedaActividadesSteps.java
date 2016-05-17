package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.BusquedaActividadesPage;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class BusquedaActividadesSteps extends ScenarioSteps {

    BusquedaActividadesPage busquedaActividades = new BusquedaActividadesPage(getDriver());
    public BusquedaActividadesSteps(Pages pages) {
        super(pages);
    }

    public void buscarActividades() {
        busquedaActividades.buscarActividades();
    }

    public void filtrarPorAsignado(String usuario) {
        busquedaActividades.filtrarPorAsignado(usuario);
    }

    public void validarResultado(String prioridad, String estadoActividad,
                                 String asunto, String id, String titularCuenta, String producto,
                                 String asignadoPor, String estado) {
        busquedaActividades.validarResultado(prioridad,estadoActividad,asunto, id,
                titularCuenta,producto,asignadoPor,estado);
    }

    public void filtrarPorNumeroDePoliza(String numeroPoliza) {
        busquedaActividades.filtrarPorNumeroDePoliza(numeroPoliza);
    }

    public void filtrarPorNumeroDeCuenta(String numeroCuenta) {
        busquedaActividades.filtrarPorNumeroDeCuenta(numeroCuenta);
    }

    public void buscarSinFiltro() {
        busquedaActividades.buscarSinFiltro();
    }

    public void validarMensajeFiltroRequerido(String mensaje) {
        busquedaActividades.validarMensjeFiltroRequerido(mensaje);
    }

    public void buscarPorFiltrosUsuarioYPrioridad(String usuario, String prioridad) {
        busquedaActividades.buscarPorFiltrosUsuarioYPrioridad(usuario, prioridad);
    }

    public void buscarPorFiltrosUsuarioYEstadoDeActividad(String usuario, String actividad) {
        busquedaActividades.buscarPorFiltrosUsuarioYEstadoDeActividad(usuario, actividad);
    }
    public void buscarPorFiltrosUsuarioYVencida(String usuario, String vencida) {
        busquedaActividades.buscarPorFiltrosUsuarioYVencida(usuario, vencida);
    }

    public void buscarPorFiltroOpcional(String estadoActividad) {
        busquedaActividades.buscarPorFiltroOpcional(estadoActividad);
}
}
