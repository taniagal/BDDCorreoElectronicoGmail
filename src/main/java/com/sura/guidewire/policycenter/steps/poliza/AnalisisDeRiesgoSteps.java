package com.sura.guidewire.policycenter.steps.poliza;


import com.sura.guidewire.policycenter.pages.poliza.AnalisisDeRiesgosPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;


public class AnalisisDeRiesgoSteps extends ScenarioSteps {


    private AnalisisDeRiesgosPage analisisDeRiesgosPage;
    protected static final int TIEMPO_2 = 2;


    public AnalisisDeRiesgosPage obtenerRiesgosPage() {
        return this.analisisDeRiesgosPage;
    }


    @Step
    public void seleccionOpcionAnalisisDeRiesgos() {
        waitFor(TIEMPO_2);
        obtenerRiesgosPage().ingresarAOpcionAnalisisdeRiesgo();

    }

    @Step
    public void seMuestraCompromisoBloqueado(String mensaje) {

        MatcherAssert.assertThat(obtenerRiesgosPage().obtenerCompromisoBloqueado().getText(), Matchers.containsString(mensaje));

    }
    @Step
    public void seleccionarOpcionAnalisisDeRiesgosEnCotizacion(){
        obtenerRiesgosPage().ingresarAOpcionAnalisisdeRiesgoCotizacion();
    }
    @Step
    public void seleccionarOpcionAnalisisDeRiesgoEnCambioPoliza(){
        obtenerRiesgosPage().ingresarAOpcionAnalisisdeRiesgoEnCambioDePoliza();
    }
    @Step
    public void seleccionarOpcionAnalisisDeRiesgoEnRenovacionPoliza(){
        obtenerRiesgosPage().ingresarAOpcionAnalisisdeRiesgoEnRenovacionDePoliza();
    }
    @Step
    public void solicitarAprobacion(){
        obtenerRiesgosPage().seleccionarSolicitarAprobacion();
    }
}

