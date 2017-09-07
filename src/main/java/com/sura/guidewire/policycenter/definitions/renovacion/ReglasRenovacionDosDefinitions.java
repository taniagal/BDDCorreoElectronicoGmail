package com.sura.guidewire.policycenter.definitions.renovacion;


import com.sura.guidewire.policycenter.steps.renovacion.ReglasRenovacionDosSteps;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class ReglasRenovacionDosDefinitions {


    @Steps
    ReglasRenovacionDosSteps reglasRenovacionDosSteps;


    @When("edite la renovacion")
    public void whenQuieraEditarLaTransaccion() {
        reglasRenovacionDosSteps.editarTransaccion();
    }

    @When("ingrese a la pantalla de vehiculos")
    public void whenQuieraIngresarAVehiculos() {
        reglasRenovacionDosSteps.clicSiguienteHastaVehiculos();
    }

    @When("se ingrese el valor de los accesorios es superior al 20% del valor asegurado del vehiculo")
    public void whenSeIdentifiqueQueElValorDeLosAccesoriosEsSuperiorAl20DelValorAseguradoDelVehiculo() {
        reglasRenovacionDosSteps.ingresarValorMayorEnAccesorios();
    }

    @When("Se ingrese el valor de los accesorios especiales es superior al 100% del valor asegurado del vehículo")
    public void whenSeIdentifiqueQueElValorDeLosAccesoriosEsespeciales() {
        reglasRenovacionDosSteps.ingresarValorMayorDelVehiculoEnAcceEspeciales();
    }

    @Then("se debe mostrar los <mensaje1> <mensaje2> de alerta")
    public void thenSeDebeMostrarElMensaje(@Named("mensaje1") String mensaje1,
                                           @Named("mensaje2") String mensaje2) {
        reglasRenovacionDosSteps.validaMensajesEnPantalla(mensaje1, mensaje2);
    }

}
