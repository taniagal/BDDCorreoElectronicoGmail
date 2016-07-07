package com.sura.policycenter.selenium.definitions;


import com.sura.policycenter.selenium.steps.CrearParticipantesCuentaSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

@SuppressWarnings("WeakerAccess")
public class CrearParticipanteCuentaDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    private CrearParticipantesCuentaSteps crearParticipantesCuentaSteps;


   @Given("que existe una cuenta <numCuenta>")
    public void givenQueExisteUnaCuentanumCuenta(@Named("numCuenta") String numCuenta){
        crearParticipantesCuentaSteps.navegaBuscarCuentaPar();
        crearParticipantesCuentaSteps.buscaCuenta(numCuenta);
    }

    @When("quiera crear participantes")
    public void whenQuieraCrearParticipantes() {
        crearParticipantesCuentaSteps.creaParticipante();
    }

    @Then("debo poder visualizar el participante asociado en el listado de\r\nparticipante de la cuenta")
    public void thenDeboPoderVisualizarElParticipanteAsociadoEnElListadoDeParticipanteDeLaCuenta() {
        crearParticipantesCuentaSteps.validaParticipante();
        crearParticipantesCuentaSteps.logout();
    }

}
