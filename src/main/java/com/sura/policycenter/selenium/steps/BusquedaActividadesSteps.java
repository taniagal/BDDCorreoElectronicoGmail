package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.BusquedaActividadesPage;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class BusquedaActividadesSteps extends ScenarioSteps {

    BusquedaActividadesPage buscarActividadesPage = new BusquedaActividadesPage(getDriver());
    public BusquedaActividadesSteps(Pages pages) {
        super(pages);
    }

    public void buscarActividades() {
        buscarActividadesPage.buscarActividades();
    }

    public void filtrarPorAsignado(String usuario) {
        buscarActividadesPage.filtrarPorAsignado(usuario);
    }

    public void validarResultado(String prioridad, String estadoActividad,
                                 String asunto, String titularCuenta, String producto,
                                 String asignadoPor, String estado) {
        buscarActividadesPage.validarResultado(prioridad,estadoActividad,asunto,
                titularCuenta,producto,asignadoPor,estado);
    }

    public void filtrarPorNumeroDePoliza(String numeroPoliza) {
        buscarActividadesPage.filtrarPorNumeroDePoliza(numeroPoliza);
    }

    public void filtrarPorNumeroDeCuenta(String numeroCuenta) {
        buscarActividadesPage.filtrarPorNumeroDeCuenta(numeroCuenta);
    }
}
