package com.sura.guidewire.policycenter.steps.cuenta;

import com.sura.guidewire.policycenter.pages.cuenta.HistorialCuentaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class HistorialCuentaSteps  extends ScenarioSteps {

    private final HistorialCuentaPage historialCuentaPage = new HistorialCuentaPage(getDriver());

    public HistorialCuentaSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void seleccionarCuenta(String numCuenta) {
        historialCuentaPage.seleccionarCuenta(numCuenta);
    }

    @Step
    public void seleccionarHistorial() {
        historialCuentaPage.seleccionarHistorial();
    }

    @Step
    public void buscarCuentaRelacionadoCon() {
        historialCuentaPage.buscarCuentaRelacionadoCon();
    }

    @Step
    public void buscarCuentaProducto() {
        historialCuentaPage.buscarCuentaProducto();
    }

    @Step
    public void validarDatosOpcionesMultiples() {
        historialCuentaPage.validarDatosOpcionesMultiples();
    }

    @Step
    public void validarResultadoBusqueda () {
        historialCuentaPage.validarResultadoBusqueda();
    }

    @Step
    public void validarColumnasHistorialCuenta () {
        historialCuentaPage.validarColumnasHistorialCuenta();
    }

    @Step
    public void buscarCuentaConMultiplesOpciones(String usuario, String producto, String fechaDesde, String fechaHasta) {
        historialCuentaPage.buscarCuentaConMultiplesOpciones( usuario, producto, fechaDesde,  fechaHasta);
    }

    @Step
    public void validarResultadoProducto(){
        historialCuentaPage.validarResultadoProducto();
    }

}
