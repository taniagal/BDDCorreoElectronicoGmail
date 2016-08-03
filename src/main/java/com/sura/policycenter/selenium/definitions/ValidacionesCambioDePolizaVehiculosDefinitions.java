package com.sura.policycenter.selenium.definitions;


import com.google.inject.name.Named;
import com.sura.gw.navegacion.definitions.Navegacion;
import com.sura.policycenter.selenium.steps.ModificacionCotizacionDePolizaSteps;
import com.sura.policycenter.selenium.steps.ValidacionesCambioDePolizaVehiculosSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


public class ValidacionesCambioDePolizaVehiculosDefinitions {

    @Steps
    ValidacionesCambioDePolizaVehiculosSteps validacionesCambioDePolizaVehiculosSteps;

    @Steps
    Navegacion navegacion;


    @Given("se ha realizado la cotizacion de la modificacion <cotizacion>")
    public void irALaCotizacion(@Named("cotizacion") String cotizacion) {
        navegacion.cuandoSeleccioneOpcionDesplegableDeMenuSuperiorPoliza();
        navegacion.cuandoBusquePorNumeroDeSubscripcionDePoliza(cotizacion);
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
