package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.CambioDePlacaPage;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;

public class CambioDePlacaSteps extends ScenarioSteps {

    CambioDePlacaPage cambioDePlacaPage;

    public void cambioDePlaca(String placa) {
        cambioDePlacaPage.cambiarPlaca(placa);
    }

    public void clickCambiarPlaca() {
        cambioDePlacaPage.clickCambiarPlaca();
    }

    public void datosDePlacaAnterior(ExamplesTable datosPlaca) {
        cambioDePlacaPage.datosPlacaAnterior(datosPlaca);
    }

    public void cambioPlacaSegundaVez() {
        cambioDePlacaPage.deseleccionarCheckBoxDePlaca();
    }

    public void placaAnterior(String placaInicial) {
        cambioDePlacaPage.mostrarPlacaInicial(placaInicial);
    }

    public void placaVenezolana(String placaVenezolana) {
        cambioDePlacaPage.ingresarPlacaVenezolana(placaVenezolana);
    }

    public void cambiarPorPlacaExistente(String placaExistente) {
        cambioDePlacaPage.cambiarPorPlacaExistente(placaExistente);
    }

    public void mensajePlacaExistente(ExamplesTable mensaje) {
        cambioDePlacaPage.mensajePlacaExistente(mensaje);
    }

    public void clickItemCambiarPlaca() {
        cambioDePlacaPage.clickItemCambiarPlaca();
    }

    public void expedirCambioPoliza() {
        cambioDePlacaPage.expedirCambioPoliza();
    }


    public void mensajeAutorizacion(ExamplesTable mensajeAutorizacion) {
        cambioDePlacaPage.mensajeAutorizacion(mensajeAutorizacion);
    }

    public void clickSiguiente() {
        cambioDePlacaPage.clickSiguiente();
    }

    public void clickAgregarVehiculo() {
        cambioDePlacaPage.clickAgregarVehiculo();
    }

    public void editarCambioDePoliza() {
        cambioDePlacaPage.editarCambioPoliza();
    }

    public void placaRiesgoConsultable(String placaRiesgoConsultable) {
        cambioDePlacaPage.ingresarPlacaRiesgoConsultable(placaRiesgoConsultable);
    }

    public void mensajePlacaRiesgoConsultable(ExamplesTable mensajePlacaRiesgoConsultable) {
        cambioDePlacaPage.mensajePlacaRiesgoConsultable(mensajePlacaRiesgoConsultable);
    }

    public void ingresarPlacaExtranjera(String venezolana, String ciudad) {
        cambioDePlacaPage.ingresarPlacaExtranjera(venezolana, ciudad);
    }

    public void mensajeDeAutorizacion(ExamplesTable mensajeDeAutorizacion) {
        String mensajePlacaNoAutorizada = mensajeDeAutorizacion.getRow(0).get("mensajeDeAutorizacion");
        MatcherAssert.assertThat("mensaje personalizado", cambioDePlacaPage.validarMensajeAutorizacion(), Matchers.containsString(mensajePlacaNoAutorizada));
    }

}
