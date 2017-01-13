package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.CambioDePlacaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;

public class CambioDePlacaSteps extends ScenarioSteps {
    @Page
    CambioDePlacaPage cambioDePlacaPage;

    @Step
    public void cambioDePlaca(String placa) {
        cambioDePlacaPage.cambiarPlaca(placa);
    }

    @Step
    public void clickCambiarPlaca() {
        cambioDePlacaPage.clickCambiarPlaca();
    }

    @Step
    public void datosDePlacaAnterior(ExamplesTable datosPlaca) {
        cambioDePlacaPage.datosPlacaAnterior(datosPlaca);
    }

    @Step
    public void cambioPlacaSegundaVez() {
        cambioDePlacaPage.deseleccionarCheckBoxDePlaca();
    }

    @Step
    public void placaAnterior(String placaInicial) {
        cambioDePlacaPage.mostrarPlacaInicial(placaInicial);
    }

    @Step
    public void placaVenezolana(String placaVenezolana) {
        cambioDePlacaPage.ingresarPlacaVenezolana(placaVenezolana);
    }

    @Step
    public void cambiarPorPlacaExistente(String placaExistente) {
        cambioDePlacaPage.cambiarPorPlacaExistente(placaExistente);
    }

    @Step
    public void mensajePlacaExistente(ExamplesTable mensaje) {
        cambioDePlacaPage.mensajePlacaExistente(mensaje);
    }

    @Step
    public void clickItemCambiarPlaca() {
        cambioDePlacaPage.clickItemCambiarPlaca();
    }

    @Step
    public void expedirCambioPoliza() {
        cambioDePlacaPage.expedirCambioPoliza();
    }

    @Step
    public void mensajeAutorizacion(ExamplesTable mensajeAutorizacion) {
        cambioDePlacaPage.mensajeAutorizacion(mensajeAutorizacion);
    }

    @Step
    public void editarCambioDePoliza() {
        cambioDePlacaPage.editarCambioPoliza();
    }

    @Step
    public void placaRiesgoConsultable(String placaRiesgoConsultable) {
        cambioDePlacaPage.ingresarPlacaRiesgoConsultable(placaRiesgoConsultable);
    }

    @Step
    public void mensajePlacaRiesgoConsultable(ExamplesTable mensajePlacaRiesgoConsultable) {
        cambioDePlacaPage.mensajePlacaRiesgoConsultable(mensajePlacaRiesgoConsultable);
    }

    @Step
    public void ingresarPlacaExtranjera(String venezolana, String ciudad) {
        cambioDePlacaPage.ingresarPlacaExtranjera(venezolana, ciudad);
    }

    @Step
    public void mensajeDeAutorizacion(ExamplesTable mensajeDeAutorizacion) {
        String mensajePlacaNoAutorizada = mensajeDeAutorizacion.getRow(0).get("mensajeDeAutorizacion");
        MatcherAssert.assertThat("mensaje personalizado", cambioDePlacaPage.validarMensajeAutorizacion(), Matchers.containsString(mensajePlacaNoAutorizada));
    }
}
