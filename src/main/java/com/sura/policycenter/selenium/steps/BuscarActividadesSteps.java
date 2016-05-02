package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.BuscarActividadesPage;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class BuscarActividadesSteps extends ScenarioSteps {

    BuscarActividadesPage buscarActividadesPage = new BuscarActividadesPage(getDriver());
    public BuscarActividadesSteps(Pages pages) {
        super(pages);
    }

    public void buscarActividades() {
        buscarActividadesPage.buscarActividades();
    }

    public void filtrarPorAsignado(String usuario) {
        buscarActividadesPage.filtrarPorAsignado(usuario);
    }

    public void validarResultado(String icono, String fechaVencimiento, String prioridad, String estadoActividad,
                                 String asunto, String id, String titularCuenta, String producto,
                                 String asignadoPor, String estado) {
        buscarActividadesPage.validarResultado(icono,fechaVencimiento,prioridad,estadoActividad,asunto,id,
                titularCuenta,producto,asignadoPor,estado);
    }

    public void filtrarPorNumeroDePoliza(String numeroPoliza) {
        buscarActividadesPage.filtrarPorNumeroDePoliza(numeroPoliza);
    }

    public void filtrarPorNumeroDeCuenta(String numeroCuenta) {
        buscarActividadesPage.filtrarPorNumeroDeCuenta(numeroCuenta);
    }
}
