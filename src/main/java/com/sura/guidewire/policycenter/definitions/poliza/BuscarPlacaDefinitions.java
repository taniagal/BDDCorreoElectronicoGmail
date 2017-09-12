package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.poliza.BuscarPlacaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;

public class BuscarPlacaDefinitions {

    @Steps
    BuscarPlacaSteps buscarPlacaSteps;

    @Given("buscar placa a polizas")
    public void buscarPlaca() {
        buscarPlacaSteps.buscarPlaca();
    }
}
