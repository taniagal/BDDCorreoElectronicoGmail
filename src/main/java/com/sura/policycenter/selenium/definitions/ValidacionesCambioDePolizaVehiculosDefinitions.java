package com.sura.policycenter.selenium.definitions;


import com.google.inject.name.Named;
import com.sura.gw.navegacion.steps.GuidewireSteps;
import com.sura.policycenter.selenium.steps.ValidacionesCambioDePolizaVehiculosSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


public class ValidacionesCambioDePolizaVehiculosDefinitions {

    @Steps
    ValidacionesCambioDePolizaVehiculosSteps validacionesCambioDePolizaVehiculosSteps;


    @Steps
    GuidewireSteps guidewire;


    @Given("se ha realizado la cotizacion de la modificacion <cotizacion>")
    public void irALaCotizacion(@Named("cotizacion") String cotizacion) {
        guidewire.ir_a_navegacion_superior().desplegar_menu_poliza().consultar_numero_de_subscripcion(cotizacion);
    }

    @When("ingrese al detalle de la modificacion")
    public void verDetalleCotizacion() {
        validacionesCambioDePolizaVehiculosSteps.verDetalleCotizacion();
    }

    @When("presione el boton de emitir la poliza")
    public void emitirPoliza() {
        validacionesCambioDePolizaVehiculosSteps.emitirPoliza();
    }

    @Then("no se debe permitir continuar con la expedicion y debe mostrar el siguiente mensaje de error <mensaje>")
    public void validarMensaje(@Named("mensaje") String mensaje) {
        validacionesCambioDePolizaVehiculosSteps.validarMensaje(mensaje);
    }

}
