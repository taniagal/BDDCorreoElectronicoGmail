package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.InspeccionVehiculoSteps;
import com.sura.policycenter.selenium.steps.ValidacionesInformacionDeVehiculoSteps;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class InspeccionVehiculoDefinitions {

    @Steps
    ValidacionesInformacionDeVehiculoSteps vehiculoSteps;

    @Steps
    InspeccionVehiculoSteps inspeccionVehiculoSteps;

    @When("el vehiculo tenga inspeccion no valida")
    public void validarInspeccionVehiculo() {
        vehiculoSteps.ir_a_vehiculos();
    }

    @When("la placa <placa> estuvo vigente en la compañia")
    public void validarVigenciaPlaca(@Named("placa") String placa){
        inspeccionVehiculoSteps.validar_Vigencia_De_La_Placa(placa);
    }

    //TODO: Validar con los configuradores cómo se obtiene la fecha
    @When("la fecha de cancelacion o exclusion no sea mayor a 3 dias")
    @Pending
    public void validarFechaCancelacionOExclusion(){
        //inspeccionVehiculoSteps.validarFechaCancelacionOExclusion();
    }

    @Then("se debe recuperar los siguientes datos: $datosVehiculo")
    public void validarDatosVehiculo(ExamplesTable datosVehiculo){
        inspeccionVehiculoSteps.validar_Informacion_Del_Vehiculo(datosVehiculo);
    }

    @Then("el valor asegurado <valorAsegurado> se debe consultar y traer de la tabla fasecolda")
    public void validarValorAsegurado(@Named("valorAsegurado") String valorAsegurado){
        inspeccionVehiculoSteps.validar_Valor_Asegurado_Del_Vehiculo(valorAsegurado);
    }
}
