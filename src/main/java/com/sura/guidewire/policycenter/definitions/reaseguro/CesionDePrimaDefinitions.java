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

    @When("quiera visualizar la informacion completa de las primas cedidas <nombreTarea> <estado> <procesoPoliza>")
    public void whenElUsuarioQuieraVisualizarLaInformacionCompletaDeLasPrimasCedidas(@Named("nombreTarea") String nombreTarea, @Named("estado") String estado, @Named("procesoPoliza") String procesoPoliza) {
        cesionDePrimaSteps.tomaYbuscaConNumeroDeEnvio();
        crearYEditarCumulosSteps.ingresar_a_opcion_reaseguro();
        cesionDePrimaSteps.ejecutaTareaPrimasCedidas(nombreTarea, estado);
        cesionDePrimaSteps.ingresarPrimasDespuesDeEjecutarTareaEnCedidas();
        cesionDePrimaSteps.ingresarATodasLasTransacciones(procesoPoliza);
    }

    @When("quiera visualizar la informacion de las primas cedidas nameTarea: $nameTarea, state: $state")
    public void visualizarLaInformacionCompletaDeLasPrimasCedidas(String nameTarea, String state) {
        crearYEditarCumulosSteps.clicMenuReaseguro();
        cesionDePrimaSteps.ejecutaTareaPrimasCedidas(nameTarea, state);
    }

    @Then("se debe verificar el consolidado de las primas cedidas con bandera: $bandera y data: $datos")
    public void verificarPrimasCedidas(ExamplesTable datos, String bandera) {
        cesionDePrimaSteps.verificarPrimasCedidas(datos, bandera);
    }

    @When("quiera ingresar al consolidado de primas cedidas")
    public void verConsolidadoPrimasCedidas() {
        cesionDePrimaSteps.verConsolidadoPrimasCedidas();
    }

    @When("quiera ingresar a ver primas cedidas: $processPoliza")
    public void ingresarAPrimasCedidas(String processPoliza) {
        cesionDePrimaSteps.ingresarAPrimasCedidas(processPoliza);
    }

    @When("de clic al link volver a reaseguro")
    public void volverAReaseguro() {
        cesionDePrimaSteps.volverAReaseguro();
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

    @Given("voy a buscar el numero de envio")
    public void buscarNumeroEnvio() {
        cesionDePrimaSteps.buscarNumeroEnvio();
    }
}
