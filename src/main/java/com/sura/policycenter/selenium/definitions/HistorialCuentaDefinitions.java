package com.sura.policycenter.selenium.definitions;

import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.HistorialCuentaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by jhonvebz on 25/04/2016.
 */
public class HistorialCuentaDefinitions {

    @Steps
    SeusLoginSteps seusLoginSteps;

    @Steps
    HistorialCuentaSteps historialCuentaSteps;

    @Given("Estoy en una cuenta <numCuenta>")
    public void givenEstoyEnUnaCuentanumCuenta(@Named("numCuenta") String numCuenta) {
        historialCuentaSteps.seleccionarCuenta(numCuenta);
    }

    @When("ingreso al historial")
    public void whenIngresoAlHistorial() {
        historialCuentaSteps.seleccionarHistorial();
    }

    @Then("solo se pueden visualizar las transacciones que esten asociadas a la cuenta")
    public void thenSoloSePuedenVisualizarLasTransaccionesQueEstenAsociadasALaCuenta() {
        // PENDING
    }


}
