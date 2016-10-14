package com.sura.policycenter.selenium.definitions;


import com.sura.policycenter.selenium.steps.ReglasRenovacionDosSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class ReglasRenovacionDosDefinitions {


    @Steps
    ReglasRenovacionDosSteps reglasRenovacionDosSteps;


    @When("edite la renovacion")
    public void whenQuieraEditarLaTransaccion() {
        reglasRenovacionDosSteps.editar_transaccion();
    }

    @When("ingrese a la pantalla de vehiculos")
    public void whenQuieraIngresarAVehiculos() {
        reglasRenovacionDosSteps.clic_siguiente_hasta_vehiculos();
    }

    @When("se ingrese el valor de los accesorios es superior al 20% del valor asegurado del vehiculo")
    public void whenSeIdentifiqueQueElValorDeLosAccesoriosEsSuperiorAl20DelValorAseguradoDelVehículo() {
        reglasRenovacionDosSteps.ingresar_valor_mayor_en_accesorios();
    }

    @When("Se ingrese el valor de los accesorios especiales es superior al 100% del valor asegurado del vehículo")
    public void whenSeIdentifiqueQueElValorDeLosAccesoriosEsespeciales() {
        reglasRenovacionDosSteps.ingresar_valor_mayor_del_vehiculo_en_acce_especiales();
    }

    @Then("se debe mostrar los <mensaje1> <mensaje2> de alerta")
    public void thenSeDebeMostrarElMensaje(@Named("mensaje1")String mensaje1,
                                           @Named("mensaje2")String mensaje2) {
        reglasRenovacionDosSteps.valida_mensajes_en_pantalla(mensaje1, mensaje2);
    }

}
