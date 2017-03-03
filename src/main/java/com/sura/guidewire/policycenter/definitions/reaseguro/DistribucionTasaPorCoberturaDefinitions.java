package com.sura.guidewire.policycenter.definitions.reaseguro;

import com.sura.guidewire.policycenter.steps.reaseguro.CrearYEditarCumulosSteps;
import com.sura.guidewire.policycenter.steps.reaseguro.DistribucionTasaPorCoberturaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class DistribucionTasaPorCoberturaDefinitions {

    @Steps
    CrearYEditarCumulosSteps crearYEditarCumulosSteps;

    @Steps
    DistribucionTasaPorCoberturaSteps distribucionTasaPorCoberturaSteps;

    @When("Ingrese la información de los reaseguradores $infoReasegurador")
    public void whenIngreseLaInformaciónDeLosReaseguradores(ExamplesTable infoReasegurador) {
        //distribucionTasaPorCoberturaSteps.ingresaPrimerReaseguradorEnTabla(infoReasegurador);
        distribucionTasaPorCoberturaSteps.ingresarReaseguradores(infoReasegurador);
    }

}
