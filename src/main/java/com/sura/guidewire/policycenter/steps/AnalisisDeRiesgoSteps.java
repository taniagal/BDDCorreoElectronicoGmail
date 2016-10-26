package com.sura.guidewire.policycenter.steps;


import com.sura.guidewire.policycenter.pages.AnalisisDeRiesgosPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.Matchers;
import org.hamcrest.MatcherAssert;


public class AnalisisDeRiesgoSteps extends ScenarioSteps {


    private AnalisisDeRiesgosPage analisisDeRiesgosPage;


    public AnalisisDeRiesgosPage obtenerRiesgosPage() {
        return this.analisisDeRiesgosPage;
    }


    @Step
    public void seleccion_opcion_analisis_de_riesgos() {
        waitFor(2);
        obtenerRiesgosPage().ingresarAOpcionAnalisisdeRiesgo();

    }

    @Step
    public void se_muestra_compromiso_bloqueado(String mensaje) {

        MatcherAssert.assertThat(obtenerRiesgosPage().obtenerCompromisoBloqueado().getText(), Matchers.containsString(mensaje));

    }
}
