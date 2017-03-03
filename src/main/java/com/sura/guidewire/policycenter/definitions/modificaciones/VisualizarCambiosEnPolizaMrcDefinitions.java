package com.sura.guidewire.policycenter.definitions.modificaciones;

import com.sura.guidewire.policycenter.steps.modificacion.VisualizarCambiosEnPolizaMrcSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;

public class VisualizarCambiosEnPolizaMrcDefinitions {

    @Steps
    VisualizarCambiosEnPolizaMrcSteps visualizarCambiosEnPolizaMrcSteps;

    @When("cambie el valor de la reconstruccion <valorReconstruccion>")
    public void cambiarValorReconstruccion(@Named("valorReconstruccion") String valorReconstruccion) {
        visualizarCambiosEnPolizaMrcSteps.cambiarValorReconstruccion(valorReconstruccion);
    }
}
