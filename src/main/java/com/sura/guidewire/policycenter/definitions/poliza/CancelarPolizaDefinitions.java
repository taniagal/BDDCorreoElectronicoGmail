package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.pages.poliza.CancelarPolizaPage;
import com.sura.guidewire.policycenter.steps.poliza.CancelarPolizaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;

public class CancelarPolizaDefinitions {
    @Steps
    CancelarPolizaSteps cancelarPolizaSteps;
    @Given("voy a consultar una poliza para cancelarla")
    public void consultarPolizaACancelar(){
        cancelarPolizaSteps.consultarParaCancelar();
    }
    @Given("cancele la poliza con fecha")
    public void cancelarPolizas() throws InterruptedException {
        cancelarPolizaSteps.cancelarPoliza();
    }

}
