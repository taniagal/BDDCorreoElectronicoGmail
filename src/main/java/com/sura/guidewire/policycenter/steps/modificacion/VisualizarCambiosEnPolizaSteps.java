package com.sura.guidewire.policycenter.steps.modificacion;

import com.sura.guidewire.policycenter.pages.modificaciones.VisualizarCambiosEnPolizaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

public class VisualizarCambiosEnPolizaSteps extends ScenarioSteps {
    @Page
    VisualizarCambiosEnPolizaPage visualizarCambiosEnPolizaPage;

    @Step
    public void comparacionDePolizas() {
        visualizarCambiosEnPolizaPage.comparacionDePolizas();
    }

    @Step
    public void cambiarCobertura(String cobertura) {
        visualizarCambiosEnPolizaPage.cambiarCobertura(cobertura);
    }

    @Step
    public void comparacionCoberturas(String coberturaExistente, String coberturaNueva) {
        visualizarCambiosEnPolizaPage.comparacionCoberturas(coberturaExistente, coberturaNueva);
    }

    @Step
    public void opcionAsegurados() {
        visualizarCambiosEnPolizaPage.opcionAsegurados();
    }

    @Step
    public void cambiarCiudadCirculacion(String ciudad) {
        visualizarCambiosEnPolizaPage.cambiarCiudadCirculacion(ciudad);
    }
}
