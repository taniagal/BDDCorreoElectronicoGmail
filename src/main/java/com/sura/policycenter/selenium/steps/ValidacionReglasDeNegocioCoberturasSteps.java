package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.menu.opciones.cuenta.ValidacionDelNegocioCoberturaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class ValidacionReglasDeNegocioCoberturasSteps extends ScenarioSteps {
     private final ValidacionDelNegocioCoberturaPage validacionDelNegocioCoberturaPage = new ValidacionDelNegocioCoberturaPage(getDriver());

    public ValidacionReglasDeNegocioCoberturasSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void ingresa_edificios_y_ubicaciones() {
        validacionDelNegocioCoberturaPage.irAEdificiosYUbicaciones();
    }

    public void valida_mensaje_pantalla(String mensaje) {
        validacionDelNegocioCoberturaPage.validaMensajeEnPantalla(mensaje);
    }

    public void valida_paso_a_pantalla_siguiente() {
        validacionDelNegocioCoberturaPage.validaPasoPantallaSiguinete();
    }
}
