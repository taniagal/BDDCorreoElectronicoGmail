package com.sura.guidewire.policycenter.steps.administracion;

import com.sura.guidewire.policycenter.pages.administracion.PantallasAdministrativasAutorizacionesPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;

public class PantallasAdministrativasAutorizacionesSteps extends ScenarioSteps {
    @Page
    PantallasAdministrativasAutorizacionesPage pantallasAdministrativasAutorizacionesPage;

    @Step
    public void irAlMenuAcciones() {
        pantallasAdministrativasAutorizacionesPage.irAlMenuAcciones();
    }

    @Step
    public void crearNuevaAutorizacion() {
        pantallasAdministrativasAutorizacionesPage.crearNuevaAutorizacion();
    }

    @Step
    public void agregarNuevaAutorizacion(ExamplesTable datosNuevaAutorizacion) {
        pantallasAdministrativasAutorizacionesPage.agregarNuevaAutorizacion(datosNuevaAutorizacion);
    }

    @Step
    public void actualizarInformacionDigitada() {
        pantallasAdministrativasAutorizacionesPage.actualizarInformacionIngresada();

    }

    @Step
    public void validarIngresoDeRegistro() {
        pantallasAdministrativasAutorizacionesPage.validarIngresoDeRegistro();
    }

    @Step
    public void validarMensajeRegistroDuplicado(ExamplesTable mensaje) {
        String mensajeRegistroDuplicado = mensaje.getRow(0).get("mensaje");
        MatcherAssert.assertThat("mensaje no encontrado", pantallasAdministrativasAutorizacionesPage.validarMensajeDuplicado(), Matchers.containsString(mensajeRegistroDuplicado));
    }

    @Step
    public void modificarInformacionDeAutorizacion() {
        pantallasAdministrativasAutorizacionesPage.modificarInformacionDeAutorizacion();
    }

    @Step
    public void validarEstadoDeCampos() {
        pantallasAdministrativasAutorizacionesPage.validarEstadoDeCampos();
    }

    @Step
    public void busquedaPorReglaDeValidacion(String reglaValidacion) {
        pantallasAdministrativasAutorizacionesPage.busquedaPorReglaDeValidacion(reglaValidacion);
    }

    @Step
    public void validarInformacionAutorizacion(ExamplesTable informacion) {
        String informacionAutorizacion = informacion.getRows().get(0).get("informacion");
        MatcherAssert.assertThat("Datos no encontrados", pantallasAdministrativasAutorizacionesPage.validarInformacionAutorizacion(), Matchers.containsString(informacionAutorizacion));
    }

    @Step
    public void modificarInformacionDeLaAutorizacion() {
        pantallasAdministrativasAutorizacionesPage.modificarInformacionDeAutorizacion();
    }


}

