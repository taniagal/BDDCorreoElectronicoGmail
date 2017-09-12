package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.poliza.InstruccionesPreviasSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;

/**
 * Created by tanigral on 04/09/2017.
 */
public class InstruccionesPreviasDefinitions {
    @Steps
    InstruccionesPreviasSteps instruccionesPreviasSteps;
    @Given("tengo una poliza a la cual voy a colocarle instrucciones previas a la renovacion")
    public void ponerAPolizaInstruccionesPrevias() throws InterruptedException {
        instruccionesPreviasSteps.marcarPolizaConInstruccionesPrevias();
    }
    @Given("voy a consultar una poliza")
    public void consultarPolizass(){
        instruccionesPreviasSteps.consultarPolizass();
    }

}
