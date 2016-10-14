package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.ContactoOrdenesDeTrabajoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class ContactoOrdenesDeTrabajoSteps extends ScenarioSteps {

    private final ContactoOrdenesDeTrabajoPage ordenesTrabajoPage = new ContactoOrdenesDeTrabajoPage(getDriver());

    public ContactoOrdenesDeTrabajoSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void verTransaccionesContacto() {
        ordenesTrabajoPage.seleccionarTransacciones();
    }

    @Step
    public void filtrarPorEstado(String estado){
        ordenesTrabajoPage.filtrarTransaccionesPorEstado(estado);
    }

    @Step
    public void validarCamposTransacciones(String poliza, String producto, String numeroTransaccion,
                                           String tipo, String estado, String participante){
        ordenesTrabajoPage.validarCamposTransacciones(poliza, producto, numeroTransaccion, tipo,
                estado, participante);
    }

    @Step
    public void validarFiltroEstado(String filtroEstado) {
        ordenesTrabajoPage.validarFiltroEstado(filtroEstado);
    }

    @Step
    public void filtrarPorTransaccion(String filtroTransaccion) {
        ordenesTrabajoPage.filtrarTransaccionesPorTransaccion(filtroTransaccion);
    }

    @Step
    public void validarPorTransaccion(String filtroTransaccion) {
        ordenesTrabajoPage.validarTransaccionesPorTransaccion(filtroTransaccion);
    }

    @Step
    public void filtrarPorProducto(String filtroProducto) {
        ordenesTrabajoPage.filtrarTransaccionesPorProducto(filtroProducto);
    }

    @Step
    public void validarPorProducto(String filtroProducto) {
        ordenesTrabajoPage.validarTransaccionesPorProducto(filtroProducto);
    }

    @Step
    public void validarMensaje(String mensaje) {
        ordenesTrabajoPage.validarMensaje(mensaje);
    }

    @Step
    public void validarTransaccionNoExistentePolizaColectiva(String transaccion) {
        ordenesTrabajoPage.validarTransaccionNoExistentePolizaColectiva(transaccion);
    }
}
