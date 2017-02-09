package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.CambioDePolizaCamposEditablesPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;

public class CambioDePolizaCamposEditablesSteps extends ScenarioSteps {
    @Page
    CambioDePolizaCamposEditablesPage cambioDePolizaCamposEditablesPage;

    @Step
    public void cambiarPlanVehicular(String plan) {
        cambioDePolizaCamposEditablesPage.cambiarPlanVehicular(plan);

    }

    @Step
    public void agregarTransporteDeCombustible() {
        cambioDePolizaCamposEditablesPage.agregarTransporteCombustible();
    }

    @Step
    public void validarMensajeAutorizacion(ExamplesTable mensaje) {
        String mensajeCombustible = mensaje.getRow(0).get("mensaje");
        MatcherAssert.assertThat("mensaje personalizado", cambioDePolizaCamposEditablesPage.validarMensajeCombustible(), Matchers.containsString(mensajeCombustible));
    }

    @Step
    public void agregarValorAsegurado(String valor) {
        cambioDePolizaCamposEditablesPage.agregarValorAsegurado(valor);
    }

    @Step
    public void validarMensajePlanBasico(ExamplesTable mensaje) {
        String mensajeValorAsegurado = mensaje.getRow(0).get("mensaje");
        MatcherAssert.assertThat("mensaje personalizado", cambioDePolizaCamposEditablesPage.validarMensajeValorAsegurado(), Matchers.containsString(mensajeValorAsegurado));
    }

    @Step
    public void seleccionarOpcionSiguiente() {
        cambioDePolizaCamposEditablesPage.seleccionarOpcionSiguiente();
    }

    @Step

    public void cambiarPlanABasico(String plan) {
        cambioDePolizaCamposEditablesPage.cambiarAPlanBasico(plan);
    }

    public void cambiarPlanAClasico(String planBasico) {
        cambioDePolizaCamposEditablesPage.cambiarAPlanClasico(planBasico);
    }
}
