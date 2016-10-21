package com.sura.guidewire.policycenter.definitions;


import com.sura.guidewire.policycenter.steps.SeusLoginSteps;
import com.sura.guidewire.policycenter.steps.DetallesDeUbicacionSteps;
import com.sura.guidewire.policycenter.steps.ValidacionesInformacionDeVehiculoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class ValidacionesInformacionDeVehiculoDefinitions {
    @Steps
    SeusLoginSteps loginSteps;

    @Steps
    DetallesDeUbicacionSteps detallesDeUbicacionSteps;

    @Steps
    ValidacionesInformacionDeVehiculoSteps vehiculoSteps;

    @Given("estoy cotizando una poliza de PA en cuenta <cuenta>")
    public void agregarPoliza(@Named("cuenta") String cuenta) {
        //Metodo Vacio
    }

    @When("vaya al agregar un vehiculo con datos faltantes")
    public void irAVehiculos() {
        vehiculoSteps.crear_vehiculo();
    }

    @Then("deben aparecer los mensajes de validacion: $mensajes")
    public void validarMensajes(ExamplesTable mensajes) {
        vehiculoSteps.verificar_mensajes(mensajes);
    }

    @Then("debe permitir continuar la cotizacion")
    public void permitirContinuarCotizacion(){
        vehiculoSteps.siguiente();
        vehiculoSteps.validarAvanceSiguientePagina();
    }

    /**
     * ESCENARIO 2
     */
    @When("agrege un vehiculo con codigo fasecolda <codigo> que no existe")
    public void agregarCodigoFasecolda(@Named("codigo") String codigo) {
        vehiculoSteps.ir_a_vehiculos();
        vehiculoSteps.agregar_codigo_fasecolda(codigo);
    }

    @Then("debo ingresar un nuevo codigo")
    public void validarCampodeCodigo() {
        vehiculoSteps.verificar_estado_del_campo_codigo();
    }

    /**
     * ESCENARIO 3
     */
    @When("vaya a agregar un vehiculo con los datos: $datosVehiculo")
    public void agregarVehiculo(ExamplesTable datosVehiculo) {
        vehiculoSteps.ir_a_vehiculos();
        vehiculoSteps.agregar_vehiculo(datosVehiculo);
    }

    @When("voy a realizar el siguiente paso")
    public void siguiente(){
        vehiculoSteps.siguiente();
    }

}
