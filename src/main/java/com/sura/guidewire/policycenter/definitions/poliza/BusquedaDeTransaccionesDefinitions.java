package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.poliza.BusquedaDeTransaccionesSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class BusquedaDeTransaccionesDefinitions {

    @Steps
    BusquedaDeTransaccionesSteps busquedaDeTransaccionesSteps;

    @Given("que me encuentro en la busqueda de transacciones")
    public void irABuscarTransacciones() {
        busquedaDeTransaccionesSteps.irABuscarTransacciones();
    }

    @When("ingreso los siguientes datos para la busqueda: $filtro")
    public void ingresarLosDatosDeBusqueda(ExamplesTable filtro) {
        busquedaDeTransaccionesSteps.ingresarLosDatosDeBusqueda(filtro);
    }

    @Then("debo ver la informacion de las transacciones asociadas: $resultados")
    public void validarResultadosDeBusqueda(ExamplesTable resultados) {
        busquedaDeTransaccionesSteps.validarResultadosDeBusqueda(resultados);
    }

    @Then("debo ver la informacion de la transaccion enviada desde cotizador")
    public void verTransaccionCotizador() {
        busquedaDeTransaccionesSteps.verTransaccionCotizador();
    }
}
