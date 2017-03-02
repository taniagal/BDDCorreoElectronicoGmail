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
    public void seleccion_opcion_analisis_de_riesgos() {
        waitFor(TIEMPO_2);
        obtenerRiesgosPage().ingresarAOpcionAnalisisdeRiesgo();

    }

    @Step
    public void se_muestra_compromiso_bloqueado(String mensaje) {

        MatcherAssert.assertThat(obtenerRiesgosPage().obtenerCompromisoBloqueado().getText(), Matchers.containsString(mensaje));

    }
    @Step
    public void seleccionar_opcion_analisis_de_riesgos_en_cotizacion(){
        obtenerRiesgosPage().ingresarAOpcionAnalisisdeRiesgoCotizacion();
    }
    @Step
    public void seleccionar_opcion_analisis_de_riesgo_en_cambio_poliza(){
        obtenerRiesgosPage().ingresarAOpcionAnalisisdeRiesgoEnCambioDePoliza();
    }
    @Step
    public void seleccionar_opcion_analisis_de_riesgo_en_renovacion_poliza(){
        obtenerRiesgosPage().ingresarAOpcionAnalisisdeRiesgoEnRenovacionDePoliza();
    }
    @Step
    public void solicitar_aprobacion(){
        obtenerRiesgosPage().seleccionarSolicitarAprobacion();
    }
}

