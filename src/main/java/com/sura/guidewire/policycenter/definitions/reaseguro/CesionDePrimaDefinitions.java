package com.sura.guidewire.policycenter.definitions.reaseguro;


import com.sura.guidewire.policycenter.steps.ExpedicionDePolizaSteps;
import com.sura.guidewire.policycenter.steps.InformacionDePolizaMrcSteps;
import com.sura.guidewire.policycenter.steps.reaseguro.CesionDePrimaSteps;
import com.sura.guidewire.policycenter.steps.reaseguro.CrearYEditarCumulosSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class CesionDePrimaDefinitions {

    @Steps
    InformacionDePolizaMrcSteps informacionDePolizaMrcSteps;

    @Steps
    ExpedicionDePolizaSteps expedicionDePolizaSteps;

    @Steps
    CrearYEditarCumulosSteps crearYEditarCumulosSteps;

    @Steps
    CesionDePrimaSteps cesionDePrimaSteps;


    @Given("cotice y expida una poliza")
    public void givenCoticeYExpidaUnaPoliza() {
        informacionDePolizaMrcSteps.seleccionarOpcionCotizar();
        expedicionDePolizaSteps.clicEnExpedirPoliza();
        expedicionDePolizaSteps.clicEnAceptarDelMensajeDeConfirmacion();

    }

    @When("El usuario quiera visualizar las primas cedidas")
    public void whenElUsuarioQuieraVisualizarLasPrimasCedidas() {
        cesionDePrimaSteps.irAResumenDePoliza();
        crearYEditarCumulosSteps.ingresar_a_opcion_reaseguro();
        cesionDePrimaSteps.ingresarPrimasCedidas();
        cesionDePrimaSteps.ejecutaTareaPrimasCedidas();
        cesionDePrimaSteps.ingresarATodasLasTransacciones();
    }

    @Then("se debe mostrar la informacion de la cobertura y sus montos generales")
    public void thenSeDebeMostrarLaInformacionDeLaCoberturaYSusMontosGenerales() {
        // PENDING
    }
}
