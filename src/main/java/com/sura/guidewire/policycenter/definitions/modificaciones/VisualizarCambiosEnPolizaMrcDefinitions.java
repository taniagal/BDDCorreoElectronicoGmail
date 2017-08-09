package com.sura.guidewire.policycenter.definitions.modificaciones;

import com.sura.guidewire.policycenter.steps.modificacion.VisualizarCambiosEnPolizaMrcSteps;
import com.sura.guidewire.policycenter.steps.poliza.EdificiosUbicacionesSteps;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;

public class VisualizarCambiosEnPolizaMrcDefinitions {

    @Steps
    VisualizarCambiosEnPolizaMrcSteps visualizarCambiosEnPolizaMrcSteps;

    @Steps
    EdificiosUbicacionesSteps edificiosUbicacionesSteps;

    @When("cambie el valor de la reconstruccion <valorReconstruccion>")
    public void cambiarValorReconstruccion(@Named("valorReconstruccion") String valorReconstruccion) {
        visualizarCambiosEnPolizaMrcSteps.cambiarValorReconstruccion(valorReconstruccion);
        edificiosUbicacionesSteps.seleccionarBotonAceptarEnLaParteSuperiorIzquierda();
    }

    @When("cambie el valor de edificios para la cobertura de reconstruccion <valorReconstruccion>")
    public void cambiarValorReconstruccionSinAceptar(@Named("valorReconstruccion") String valorReconstruccion) {
        visualizarCambiosEnPolizaMrcSteps.cambiarValorReconstruccion(valorReconstruccion);
    }
}
