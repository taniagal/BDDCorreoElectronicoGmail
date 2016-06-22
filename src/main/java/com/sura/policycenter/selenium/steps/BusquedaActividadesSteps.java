package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.BusquedaActividadesPage;
import com.sura.policycenter.selenium.pages.InicioPage;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class BusquedaActividadesSteps extends ScenarioSteps {

    private final BusquedaActividadesPage busquedaActividades = new BusquedaActividadesPage(getDriver());

    public BusquedaActividadesSteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }


    public void buscarActividades() {
        inicioPage().irABuscarActividades();
    }

    public void filtrarPorAsignado(String usuario) {
        busquedaActividades.filtrarPorAsignado(usuario);
    }

    public void validarResultado(ExamplesTable resultadoFiltroActividades) {
        busquedaActividades.validarResultado(resultadoFiltroActividades);
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
