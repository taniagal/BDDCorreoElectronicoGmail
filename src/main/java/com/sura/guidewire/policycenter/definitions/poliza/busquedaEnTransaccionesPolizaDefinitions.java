package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.poliza.ingresoTransaccionesPolizaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class busquedaEnTransaccionesPolizaDefinitions {

    @Steps
    ingresoTransaccionesPolizaSteps ingresoTransaccionesPolizaSteps;


    @When("intente ingresar al modulo de transacciones de poliza")
    public void ingresarMenuTransaccionesPoliza(){
        ingresoTransaccionesPolizaSteps.ingresarMenuTransaciones();
    }

    @Then("se debe realizar busqueda por transaccion de poliza <numeroTransaccion> ")
    public void busquedaPorTransaccionPoliza(){
        ingresoTransaccionesPolizaSteps.busquedaTransaccionPoliza();
    }
}
