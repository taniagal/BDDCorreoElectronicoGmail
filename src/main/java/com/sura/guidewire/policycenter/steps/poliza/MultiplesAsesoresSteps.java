package com.sura.guidewire.policycenter.steps.poliza;


import com.sura.guidewire.policycenter.pages.poliza.MultiplesAsesoresPage;
import com.sura.guidewire.policycenter.utils.Parametros;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MultiplesAsesoresSteps extends ScenarioSteps {
    private MultiplesAsesoresPage multiplesAsesoresPage;

    @Step
    public void verDetallesMultipleAsesores() {
        multiplesAsesoresPage.verDetalleMultipleAsesores();
    }
    @Step
    public void ingresarAsesores(Parametros parametros) {
       multiplesAsesoresPage.ingresarAsesores(parametros);
    }
}
