package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.poliza.TransaccionesDePolizaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


public class TransaccionesDePolizaDefinitions {

    @Steps
    TransaccionesDePolizaSteps transaccionesDePolizaSteps;

    @When("consulte las transacciones de la poliza por el numero de transaccion <numeroTransaccion>")
    public void consultarTransaccionesDePolizaPorNumero(@Named("numeroTransaccion") String numeroTransaccion) {
        transaccionesDePolizaSteps.irATransaccionesDePoliza();
        transaccionesDePolizaSteps.consultarTransaccionesDePolizaPorNumero(numeroTransaccion);
    }

    @Then("debo poder ver los detalles de esta transaccion")
    public void thenDeboPoderVerLosDetallesDeEstaTransaccion() {
        // PENDING
    }
}
