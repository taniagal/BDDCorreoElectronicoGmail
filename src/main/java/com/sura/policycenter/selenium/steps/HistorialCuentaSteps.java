package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.HistorialCuentaPage;
import com.sura.policycenter.selenium.pages.InicioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class HistorialCuentaSteps  extends ScenarioSteps {

    private final HistorialCuentaPage historialCuentaPage = new HistorialCuentaPage(getDriver());

    public HistorialCuentaSteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    @Step
    public void seleccionarCuenta(String numCuenta) {
        inicioPage().irACuentaBuscar(numCuenta);
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
    public void buscarCuentaConMultiplesOpciones(String usuario, String fechaDesde, String fechaHasta) {
        historialCuentaPage.buscarCuentaConMultiplesOpciones( usuario,  fechaDesde,  fechaHasta);
    }

    @Step
    public void validarResultadoProducto(){
        historialCuentaPage.validarResultadoProducto();
    }

}
