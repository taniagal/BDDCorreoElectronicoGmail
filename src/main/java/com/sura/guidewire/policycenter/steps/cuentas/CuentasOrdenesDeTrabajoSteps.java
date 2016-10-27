package com.sura.guidewire.policycenter.steps.cuentas;

import com.sura.guidewire.policycenter.pages.cuentas.CuentasOrdenesDeTrabajoPage;
import com.sura.guidewire.policycenter.pages.InicioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class CuentasOrdenesDeTrabajoSteps extends ScenarioSteps {

    private final CuentasOrdenesDeTrabajoPage cuentasOrdenesTrabajoPage = new CuentasOrdenesDeTrabajoPage(getDriver());

    public CuentasOrdenesDeTrabajoSteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
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
    }

    @Step
    public void validarTransaccionNoExistente(String transaccion) {
        cuentasOrdenesTrabajoPage.validarTransaccionNoExistentePolizaColectiva(transaccion);
    }
}
