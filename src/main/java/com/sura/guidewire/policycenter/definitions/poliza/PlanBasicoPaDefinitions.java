package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.InformacionDePolizaMrcSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaTasaUnicaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;

public class PlanBasicoPaDefinitions {

    @Steps
    InformacionDePolizaMrcSteps informacionDePolizaMrcSteps;

    @Steps
    TarifaTasaUnicaSteps tasaUnicaSteps;

    @Then("cotice y expida la poliza")
    public void cotizeYExpidaPoliza() {
        informacionDePolizaMrcSteps.seleccionarOpcionCotizar();
        tasaUnicaSteps.expedirPoliza();
    }


}
