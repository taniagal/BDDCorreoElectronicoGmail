package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.poliza.BusquedaDeTransaccionesSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;

public class BusquedaDeTransaccionesDefinitions {

    @Steps
    BusquedaDeTransaccionesSteps busquedaDeTransaccionesSteps;

    @Given("que me encuentro en la busqueda de transacciones")
    public void irABuscarTransacciones(){
        busquedaDeTransaccionesSteps.irABuscarTransacciones();
    }
}
