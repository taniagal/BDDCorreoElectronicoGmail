package com.sura.guidewire.policycenter.definitions.tarifacion;


import com.sura.guidewire.policycenter.steps.tarifacion.ModificadoresDeTarifaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class ModificadoresDeTarifaDefinitions {
    @Steps
    ModificadoresDeTarifaSteps modificadoresDeTarifaSteps;

    @When("seleccione algunas las coberturas: $coberturas")
    public void agregarCoberturas(ExamplesTable coberturas) {
        modificadoresDeTarifaSteps.seleciconarCoberturas(coberturas);
    }

    @When("ingrese los datos de vehiculo: $datosVehiculo")
    public void agregarVehiculo(ExamplesTable datosVehiculo) {
        modificadoresDeTarifaSteps.agregarVehiculo(datosVehiculo);
    }

    @When("ingrese la placa <placa> en la informacion del vehiculo")
    public void agregraPlacaDelVehiculo(@Named("placa") String placa) {
        modificadoresDeTarifaSteps.agregarPlacaYAsegurado(placa);
    }

    @When("ingrese los valores de los modificadores de la tarifa: $valores")
    public void agregraModificadoreDeTarifa(ExamplesTable valores) {
        modificadoresDeTarifaSteps.agregarModificadores(valores);
    }

    @Then("se debe ver reflejada la bonificacion <bonoComercial> <bonoTecnico> de esta placa")
    public void verificarBonoTecnico(@Named("bonoComercial") String bonoComercial, @Named("bonoTecnico") String bonoTecnico) {
        modificadoresDeTarifaSteps.verificarBonificacion(bonoComercial, bonoTecnico);
    }

    @Then("el valor del monto en cada cobertura debe ser: $valor")
    public void verificarResultado(ExamplesTable valor) {
        modificadoresDeTarifaSteps.verificarTarifacionPorCoberturas(valor);
    }

    @When("ingrese la bonificacion tecnica <bonoT> y la comercial <bonoC>")
    public void cambiarBonificacion(@Named("bonoT") String bonoT, @Named("bonoC") String bonoC) {
        modificadoresDeTarifaSteps.cambiarBonificacion(bonoC, bonoT);
    }

    @Then("se debe generar un UW con el mensaje <mensaje>")
    public void verificarUW(@Named("mensaje") String mensaje){
        modificadoresDeTarifaSteps.verificarUW(mensaje);
    }
}
