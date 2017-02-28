package com.sura.guidewire.policycenter.steps.modificacion;

import com.sura.guidewire.policycenter.pages.modificaciones.VisualizarCambiosEnPolizaMrcPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

public class VisualizarCambiosEnPolizaMrcSteps extends ScenarioSteps {
    @Page
    VisualizarCambiosEnPolizaMrcPage visualizarCambiosEnPolizaMrcPage;

    @Step
    public void cambiarValorReconstruccion(String valorReconstruccion) {
        visualizarCambiosEnPolizaMrcPage.cambiarValorReconstruccion(valorReconstruccion);
    }
}
