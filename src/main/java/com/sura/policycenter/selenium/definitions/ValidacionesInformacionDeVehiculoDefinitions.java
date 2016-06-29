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
    public void agregarPoliza(@Named("cuenta")String cuenta, @Named("producto")String producto) {
        loginSteps.login();
        detallesDeUbicacionSteps.ir_a_nueva_poliza(cuenta,producto);
    }

    @When("vaya al agregar un vehiculo con datos faltantes")
    public void irAVehiculos(){
        vehiculoSteps.ir_a_vehiculos();
    }

    @Then("deben aparecer los mensajes de validacion: $mensajes")
    public void validarMensajes(ExamplesTable mensajes){
        vehiculoSteps.verificar_mensajes(mensajes);
    }

}
