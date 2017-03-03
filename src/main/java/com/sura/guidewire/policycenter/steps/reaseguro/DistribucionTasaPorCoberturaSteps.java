package com.sura.guidewire.policycenter.steps.reaseguro;


import com.sura.guidewire.policycenter.pages.reaseguro.CrearYEditarCumulosPage;
import com.sura.guidewire.policycenter.pages.reaseguro.DistribucionTasaPorCoberturaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class DistribucionTasaPorCoberturaSteps extends ScenarioSteps {

    DistribucionTasaPorCoberturaPage distribucionTasaPorCoberturaPage;
    CrearYEditarCumulosPage crearYEditarCumulosPage;


    @Step
    public void ingresarReaseguradores(ExamplesTable infoReasegurador) {
        distribucionTasaPorCoberturaPage.agregarReaseguradoresATabla(infoReasegurador);
    }
}
