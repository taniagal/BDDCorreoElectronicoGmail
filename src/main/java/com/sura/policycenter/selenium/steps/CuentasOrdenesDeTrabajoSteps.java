package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.CuentasOrdenesDeTrabajoPage;
import com.sura.policycenter.selenium.pages.InicioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by brayruru on 2016/05/03.
 */
public class CuentasOrdenesDeTrabajoSteps extends ScenarioSteps {

    private CuentasOrdenesDeTrabajoPage cuentasOrdenesTrabajoPage = new CuentasOrdenesDeTrabajoPage(getDriver());
    private InicioPage inicioPage() { return getPages().currentPageAt(InicioPage.class); }
    public CuentasOrdenesDeTrabajoSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void verTransaccionesContacto() {
        cuentasOrdenesTrabajoPage.seleccionarTransacciones();
    }
    @Step
    public void filtrarPorEstado(String estado){
        cuentasOrdenesTrabajoPage.filtrarTransaccionesPorEstado(estado);
    }

    @Step
    public void validarMensaje(String mensaje) {
        cuentasOrdenesTrabajoPage.validarMensaje(mensaje);
    }

    @Step
    public void filtrarPorTransaccion(String filtroTransaccion) {
        cuentasOrdenesTrabajoPage.filtrarTransaccionesPorTransaccion(filtroTransaccion);
    }
    @Step
    public void filtrarPorProducto(String filtroProducto) {
        cuentasOrdenesTrabajoPage.filtrarTransaccionesPorProducto(filtroProducto);
    }

    @Step
    public void seleccionarCuenta(String numCuenta) {
        inicioPage().irACuentaBuscar(numCuenta);
        //cuentasOrdenesTrabajoPage.buscarCuenta(numCuenta);
    }


}
