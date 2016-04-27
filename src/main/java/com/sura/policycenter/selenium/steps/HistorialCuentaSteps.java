package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.EscritorioPage;
import com.sura.policycenter.selenium.pages.HistorialCuentaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by jhonvebz on 25/04/2016.
 */
public class HistorialCuentaSteps  extends ScenarioSteps {

    HistorialCuentaPage historialCuentaPage = new HistorialCuentaPage(getDriver());

    public HistorialCuentaSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void seleccionarCuenta(String numCuenta) {

        historialCuentaPage.buscarCuenta(numCuenta);
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
    public void buscarCuentaFecha(String fecha) {

        historialCuentaPage.buscarCuentaFecha(fecha);
    }

    @Step
    public void buscarCuentaFechaRango (String desde, String hasta) {
        historialCuentaPage.buscarCuentaFechaRango(desde, hasta);
    }

    @Step
    public void buscarCuentaUsuario (String usuario) {
        historialCuentaPage.buscarCuentaUsuario(usuario);
    }

    @Step
    public void validarResultadoBusqueda () {
        historialCuentaPage.validarResultadoBusqueda();
    }

    @Step
    public void validarColumnasHistorialCuenta (String tipo,
                                                String usuario,
                                                String fechaTransaccion,
                                                String descripcion,
                                                String producto,
                                                String poliza,
                                                String transaccionPoliza,
                                                String valorOriginal,
                                                String valorNuevo) {
        historialCuentaPage.validarColumnasHistorialCuenta(tipo, usuario, fechaTransaccion, descripcion, producto, poliza, transaccionPoliza, valorOriginal, valorNuevo);
    }
}
