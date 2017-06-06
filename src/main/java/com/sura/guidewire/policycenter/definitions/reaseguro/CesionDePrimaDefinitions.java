package com.sura.guidewire.policycenter.definitions.reaseguro;


import com.sura.guidewire.policycenter.steps.poliza.ExpedicionDePolizaSteps;
import com.sura.guidewire.policycenter.steps.poliza.InformacionDePolizaMrcSteps;
import com.sura.guidewire.policycenter.steps.reaseguro.CesionDePrimaSteps;
import com.sura.guidewire.policycenter.steps.reaseguro.CrearYEditarCumulosSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

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
    @When("cotice y expida una poliza")
    public void givenCoticeYExpidaUnaPoliza() {
        informacionDePolizaMrcSteps.seleccionarOpcionCotizar();
        expedicionDePolizaSteps.clicEnExpedirPoliza();
        expedicionDePolizaSteps.clicEnAceptarDelMensajeDeConfirmacion();
    }

    @When("El usuario quiera visualizar las primas cedidas")
    public void whenElUsuarioQuieraVisualizarLasPrimasCedidas() {
        cesionDePrimaSteps.ingresaAPolizaExpedida();
        crearYEditarCumulosSteps.ingresar_a_opcion_reaseguro();
        cesionDePrimaSteps.ingresarPrimasCedidas();
    }

    @Then("se debe mostrar la informacion de la cobertura y sus montos generales $informacionGeneralCobertura")
    public void thenSeDebeMostrarLaInformacionDeLaCoberturaYSusMontosGenerales(@Named("informacionGeneralCobertura") String informacionGeneralCobertura) {
        cesionDePrimaSteps.mostrarInformacionGeneralDeCobertura(informacionGeneralCobertura);
    }

    @When("quiera visualizar la informacion completa de las primas cedidas <nombreTarea> <estado>")
    public void whenElUsuarioQuieraVisualizarLaInformacionCompletaDeLasPrimasCedidas(@Named("nombreTarea") String nombreTarea, @Named("estado") String estado) {
        cesionDePrimaSteps.tomaYbuscaConNumeroDeEnvio();
        crearYEditarCumulosSteps.ingresar_a_opcion_reaseguro();
        cesionDePrimaSteps.ejecutaTareaPrimasCedidas(nombreTarea, estado);
        cesionDePrimaSteps.ingresarPrimasDespuesDeEjecutarTareaEnCedidas();
        cesionDePrimaSteps.ingresarATodasLasTransacciones();
    }

    @Then("se debe verificar el consolidado de las primas cedidas $datos")
    public void verificarPrimasCedidas(ExamplesTable datos) {
        cesionDePrimaSteps.verificarPrimasCedidas(datos);
    }

    @When("quiera ingresar al consolidado de primas cedidas")
    public void verConsolidadoPrimasCedidas() {
        cesionDePrimaSteps.verConsolidadoPrimasCedidas();
    }

    @Then("quiera ejecutar una tarea de proceso por lotes <nombreTarea> <estado>")
    public void ejecutarTareaProcesoPorLotes(@Named("nombreTarea") String nombreTarea, @Named("estado") String estado) {
        cesionDePrimaSteps.ejecutaTareaPrimasCedidas(nombreTarea, estado);
    }

    @When("quiera validar que el reaseguro para el contrato cuotaparte o excedente")
    public void whenQuieraValidarQueElReaseguroParaElContratoCotaparteOExcedenteSeRealice() {
        cesionDePrimaSteps.ingresaADetalleDeContratoExcedente();
    }

    @Then("se deben mostrar los valores correspondientes de primas de reasegurador")
    public void thenSeDebenMostrarLosValoresCorrespondientesDePrimasDeReasegurador() {
        cesionDePrimaSteps.validaCondicionesYValoresContratos();
    }
}
