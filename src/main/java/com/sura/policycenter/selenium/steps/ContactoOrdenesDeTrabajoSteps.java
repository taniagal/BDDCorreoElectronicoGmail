package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.ContactoOrdenesDeTrabajoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class ContactoOrdenesDeTrabajoSteps extends ScenarioSteps {

    ContactoOrdenesDeTrabajoPage ordenesTrabajoPage = new ContactoOrdenesDeTrabajoPage(getDriver());

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
    public void validarCamposTransacciones(String fechaCreacion, String poliza, String producto, String numeroTransaccion,
                                           String tipo, String estado, String fechaFin, String participante){
        ordenesTrabajoPage.validarCamposTransacciones(fechaCreacion, poliza, producto, numeroTransaccion, tipo,
                estado, fechaFin, participante);
    }

    @Step
    public void validarFiltroEstado(String filtroEstado) {
        ordenesTrabajoPage.validarFiltroEstado(filtroEstado);
    }
}
