package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.ModificacionInformacionPolizaPASteps;
import com.sura.guidewire.policycenter.steps.poliza.TransaccionesDePolizaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;


public class TransaccionesDePolizaDefinitions {

    @Steps
    TransaccionesDePolizaSteps transaccionesDePolizaSteps;

    @Steps
    ModificacionInformacionPolizaPASteps modificacionInformacionPolizaPASteps;

    @Given("se requiere comparar diferentes transacciones de una poliza <numeroPoliza>")
    public void buscarPoliza(@Named("numeroPoliza") String numeroPoliza){
        modificacionInformacionPolizaPASteps.ingresarPoliza(numeroPoliza);
    }

    @When("seleccione las transacciones a comparar")
    public void seleccionarTransacciones() {
        transaccionesDePolizaSteps.irATransaccionesDePoliza();
        transaccionesDePolizaSteps.seleccionarTransacciones();
        transaccionesDePolizaSteps.compararTransacciones();
    }

    @When("consulte las transacciones de la poliza por el numero de transaccion <numeroTransaccion>")
    public void consultarTransaccionesDePolizaPorNumero(@Named("numeroTransaccion") String numeroTransaccion) {
        transaccionesDePolizaSteps.irATransaccionesDePoliza();
        transaccionesDePolizaSteps.consultarTransaccionesDePolizaPorNumero(numeroTransaccion);
    }

    @Then("debo poder ver el detalle de esta transaccion")
    public void visualizarDetalleTransaccion() {
        transaccionesDePolizaSteps.validarDetalleTransaccion();
    }

    @Then("se deben poder visualizar las diferencias entre transacciones $diferenciasTransacciones")
    public void visualizarDiferenciasTransacciones(ExamplesTable diferenciasTransacciones){
        transaccionesDePolizaSteps.visualizarDiferenciasTransacciones(diferenciasTransacciones);
    }
}
