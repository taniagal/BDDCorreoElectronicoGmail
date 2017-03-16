package com.sura.guidewire.policycenter.steps.reaseguro;


import com.sura.guidewire.policycenter.pages.reaseguro.DistribucionTasaPorCoberturaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class DistribucionTasaPorCoberturaSteps extends ScenarioSteps {

    DistribucionTasaPorCoberturaPage distribucionTasaPorCoberturaPage;
    protected ExamplesTable tablaReaseguradores;


    @Step
    public void ingresarReaseguradores(ExamplesTable infoReasegurador) {
        distribucionTasaPorCoberturaPage.agregarReaseguradoresATabla(infoReasegurador);

    }

    @Step
    public void ingresarTasaComercialDeseada() {
        distribucionTasaPorCoberturaPage.ingresarTasaComercialDeseada();
    }

    @Step
    public void ingresaARiesgosPorCobertura(ExamplesTable tablaRiesgosReasegurables) {
        distribucionTasaPorCoberturaPage.ingresoAUnRiesgoPorEvaluar(tablaRiesgosReasegurables);
        distribucionTasaPorCoberturaPage.validarDatosMedioDeVentaPorCanal(tablaRiesgosReasegurables);
    }

    @Step
    public void seleccionarSiEnReaseguro() {
        distribucionTasaPorCoberturaPage.seleccionaRiesgoAceptado();
    }

    @Step
    public void agregarArticulo() {
        distribucionTasaPorCoberturaPage.cotizarPoliza();
    }
}
