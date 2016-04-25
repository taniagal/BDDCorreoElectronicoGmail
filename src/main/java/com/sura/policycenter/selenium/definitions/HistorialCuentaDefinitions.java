package com.sura.policycenter.selenium.definitions;

import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.HistorialCuentaSteps;
import com.sura.policycenter.selenium.steps.PolicySteps;
import net.thucydides.core.annotations.Pending;
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

    @Given("me encuentro autenticado en gw con un <country>, <user> y <password>")
    public void givenMeEncuentroAutenticadoEnGwConUnpaisusuarioYcontrasena(@Named("country") String country,
                                                                           @Named("user") String user,
                                                                           @Named("password") String password) {
        seusLoginSteps.login(country, user, password);
    }

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
