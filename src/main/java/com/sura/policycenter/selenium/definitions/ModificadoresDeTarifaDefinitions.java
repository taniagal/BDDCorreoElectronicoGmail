package com.sura.policycenter.selenium.definitions;


import com.sura.policycenter.selenium.steps.ModificadoresDeTarifaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class ModificadoresDeTarifaDefinitions {
    @Steps
    ModificadoresDeTarifaSteps modificadoresDeTarifaSteps;

    @When("seleccione algunas las coberturas: $coberturas")
    public void agregarTodasLasCoberturas(ExamplesTable coberturas) {
        modificadoresDeTarifaSteps.seleciconar_coberturas(coberturas);
    }

    @When("ingrese los datos de vehiculo: $datosVehiculo")
    public void agregarVehiculo(ExamplesTable datosVehiculo) {
        modificadoresDeTarifaSteps.agregar_vehiculo(datosVehiculo);
    }

    @When("ingrese la placa <placa> en la informacion del vehiculo")
    public void agregraPlacaDelVehiculo(@Named("placa") String placa){
        modificadoresDeTarifaSteps.agregar_placa_y_asegurado(placa);
    }

    @When("ingrese los valores de los modificadores de la tarifa: $valores")
    public void agregraModificadoreDeTarifa(ExamplesTable valores){
        modificadoresDeTarifaSteps.agregar_modificadores(valores);
    }

    @Then("se debe ver reflejada la bonificacion tecnica <bono> de esta placa")
    public void verificarBonoTecnico(@Named("bono")String bono){
        modificadoresDeTarifaSteps.verificar_bono_tecnico(bono);
    }

    @Then("se debe ver reflejada la bonificacion comercial <bono> de esta placa")
    public void verificarBonoComercial(@Named("bono")String bono){
        modificadoresDeTarifaSteps.verificar_bono_comercial(bono);
    }

    @Then("el valor del monto en cada cobertura debe ser: $valor")
    public void verificarResultado(ExamplesTable valor){
        modificadoresDeTarifaSteps.verificar_tarifacion_por_coberturas(valor);
    }




}
