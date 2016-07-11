package com.sura.policycenter.selenium.definitions;


import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.DetallesDeUbicacionSteps;
import com.sura.policycenter.selenium.steps.ValidacionesInformacionDeVehiculoSteps;
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

    @Given("estoy cotizando una poliza de PA en cuenta <cuenta> y producto <producto>")
    public void agregarPoliza(@Named("cuenta") String cuenta, @Named("producto") String producto) {
        detallesDeUbicacionSteps.ir_a_nueva_poliza(cuenta, producto);
        vehiculoSteps.ir_a_vehiculos();
    }

    @When("vaya al agregar un vehiculo con datos faltantes")
    public void irAVehiculos() {
        vehiculoSteps.crear_vehiculo();
    }

    @Then("deben aparecer los mensajes de validacion: $mensajes")
    public void validarMensajes(ExamplesTable mensajes) {
        vehiculoSteps.verificar_mensajes(mensajes);
    }


    /**
     * ESCENARIO 2
     */
    @When("agrege un vehiculo con codigo fasecolda <codigo> que no existe")
    public void agregarCodigoFasecolda(@Named("codigo") String codigo) {
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
        vehiculoSteps.agregar_vehiculo(datosVehiculo);
    }


}
