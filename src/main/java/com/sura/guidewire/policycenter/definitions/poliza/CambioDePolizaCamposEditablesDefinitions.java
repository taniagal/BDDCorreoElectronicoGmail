package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.modificacion.CambioDePlacaSteps;
import com.sura.guidewire.policycenter.steps.modificacion.CambioDePolizaCamposEditablesSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;
import org.jbehave.core.model.ExamplesTable;

public class CambioDePolizaCamposEditablesDefinitions {

    @Steps
    CambioDePolizaCamposEditablesSteps cambioDePolizaCamposEditablesSteps;

    @Steps
    CambioDePlacaSteps cambioDePlacaSteps;

    @When("cambie el plan del vehiculo <plan>")
    @Aliases(values = {"cambie el plan del vehiculo <plan> clasico",
                        "cambie el plan del vehiculo a basico <plan>"})
    public void cambiarPlanVehiculo(@Named("plan") String plan) {
        cambioDePolizaCamposEditablesSteps.cambiarPlanVehicular(plan);
    }

    @When("seleccione la opcion transporte de combustible")
    public void agregarTransporteDeCombustible() {
        cambioDePolizaCamposEditablesSteps.agregarTransporteDeCombustible();
    }

    @Then("debe mostrar un mensaje de autorizacion cuando voy a expedir $mensaje")
    public void mensajeAutorizacion(ExamplesTable mensaje) {
        cambioDePolizaCamposEditablesSteps.validarMensajeAutorizacion(mensaje);
    }

    @Then("expida el cambio de la poliza")
    public void expedirCambioPoliza() {
        cambioDePlacaSteps.expedirCambioPoliza();
    }

    @When("adicione un valor asegurado superior al permitido <valor>")
    public void valorAseguradoSuperior(@Named("valor") String valor) {
        cambioDePolizaCamposEditablesSteps.agregarValorAsegurado(valor);
    }

    @Then("debe salir el mensaje de autorizacion por valor superior al permitido $mensaje")
    public void validarMensajePlanBasico(ExamplesTable mensaje) {
        cambioDePolizaCamposEditablesSteps.validarMensajePlanBasico(mensaje);
    }

    @When("seleccione la opcion siguiente en modificacion")
    public void seleccionarSiguiente() {
        cambioDePolizaCamposEditablesSteps.seleccionarOpcionSiguiente();
    }

    @When("agrega cobertura asistencia <asistencia>")
    public void agregarCoberturaAsistencia(@Named("asistencia") String asistencia) {
        cambioDePolizaCamposEditablesSteps.seleccionarOpcionSiguiente();
        cambioDePolizaCamposEditablesSteps.seleccionarCoberturaAsistencia(asistencia);
    }
}
