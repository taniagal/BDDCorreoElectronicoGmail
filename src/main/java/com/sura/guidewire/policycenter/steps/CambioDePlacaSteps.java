package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.CambioDePlacaPage;
import net.thucydides.core.steps.ScenarioSteps;
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
        cambioDePlacaPage.clickItemCambiarPlaca();
    }

    public void placaAnterior(String placaInicial) {
        cambioDePlacaPage.mostrarPlacaInicial(placaInicial);
    }

    public void placaVenezolana(String placaVenezolana, String ciudad) {
        cambioDePlacaPage.ingresarPlacaVenezolana(placaVenezolana, ciudad);
    }

    public void cambiarPorPlacaExistente(String placaExistente) {
        cambioDePlacaPage.cambiarPorPlacaExistente(placaExistente);
    }

    public void mensajePlacaExistente(String mensaje) {
        cambioDePlacaPage.mensajePlacaExistente(mensaje);
    }

    public void clickItemCambiarPlaca() {
        cambioDePlacaPage.clickItemCambiarPlaca();
    }

    public void expedirCambioPoliza() {
        cambioDePlacaPage.expedirCambioPoliza();
    }
}
