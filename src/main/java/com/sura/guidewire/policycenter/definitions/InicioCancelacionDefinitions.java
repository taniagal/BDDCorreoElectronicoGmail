package com.sura.guidewire.policycenter.definitions;


import com.sura.guidewire.policycenter.steps.InicioCancelacionSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class InicioCancelacionDefinitions {


    @Steps
    InicioCancelacionSteps inicioCancelacionSteps;


    @When("necesito iniciar la cancelacion")
    public void givenNecesitoIniciarLaCancelacionSinMotivo() {
        inicioCancelacionSteps.iniciar_cancelacion();
    }

    @Then("Se deben mostrar los campos motivo, metodo de reembolso, fecha vigente de cancelacion, iniciar cancelaci\u00F3n y cancelar transaccion.")
    public void thenSeDebenMostrarLosCampos() {
        inicioCancelacionSteps.validar_campos_en_pantalla();
    }

    @When("se ingrese la fecha con retroactividad menor a la politica")
    public void whenSeIngreseLaFechaVigenteDeCancelacion() {
        inicioCancelacionSteps.ingresar_fecha_retroactiva();
    }

    @When("se ingrese la fecha con emision anticipada mayor a la politica")
    public void whenSeIngreseLaFechaemisionAnticipadaMayor() {
        inicioCancelacionSteps.ingresar_fecha_emision_anticipada();
    }

    @Then("Se debe validar la retroactividad sino cumple con <mensaje>")
    @Alias("Se debe validar la emision anticipada con <mensaje>")
    public void thenSeDebeValidarLaRetroactividadSinoCumpleConmensaje(@Named("mensaje")String mensaje) {
        inicioCancelacionSteps.validar_mensaje_en_pantalla(mensaje);
    }

    @Then("Se debe validar en la lista cuando la poliza NO es de bancolombia: $listaMotivo")
    public void thenSeDebeValidarEnLaListaCuandoLaPolizaNOEsDeBancolombia(ExamplesTable listaMotivo) {
        inicioCancelacionSteps.valida_lista_de_motivos_diferente_bancolombia(listaMotivo);
    }


}
