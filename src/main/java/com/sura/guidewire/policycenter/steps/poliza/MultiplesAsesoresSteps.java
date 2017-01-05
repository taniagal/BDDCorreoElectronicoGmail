package com.sura.guidewire.policycenter.steps.poliza;


import com.sura.guidewire.policycenter.pages.poliza.MultiplesAsesoresPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.List;

public class MultiplesAsesoresSteps extends ScenarioSteps {
    private MultiplesAsesoresPage multiplesAsesoresPage;

    @Step
    public void verDetallesMultipleAsesores() {
        multiplesAsesoresPage.verDetalleMultipleAsesores();
    }
    @Step
    public void ingresarAsesores(List<String> listaCodigAsesor,List<String> listaPorcentaje, List<String> listaRol) {
       multiplesAsesoresPage.ingresarAsesores(listaCodigAsesor,listaPorcentaje,listaRol);
    }
}
