package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.poliza.InstruccionesPreviasPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

/**
 * Created by tanigral on 04/09/2017.
 */
public class InstruccionesPreviasSteps extends ScenarioSteps {
    @Page
    InstruccionesPreviasPage instruccionesPreviasPage;

    @Step
    public void marcarPolizaConInstruccionesPrevias() throws InterruptedException {
        instruccionesPreviasPage.marcarPoliza();
    }
@Step
    public void consultarPolizass() {
        instruccionesPreviasPage.consultarPoliza();

    }
}
