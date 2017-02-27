package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.poliza.IngresoTransaccionesPolizaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class BusquedaEnTransaccionesPolizaDefinitions {

    @Steps
    IngresoTransaccionesPolizaSteps ingresoTransaccionesPolizaSteps;


    @When("intente ingresar al modulo de transacciones de poliza")
    public void ingresarMenuTransaccionesPoliza(){
        ingresoTransaccionesPolizaSteps.ingresarMenuTransaciones();
    }

    @Then("se debe realizar busqueda por transaccion de poliza <numeroTransaccion>")
    public void busquedaPorTransaccionPoliza(String numeroTransaccion){
        ingresoTransaccionesPolizaSteps.busquedaTransaccionPoliza(numeroTransaccion);
    }
}
