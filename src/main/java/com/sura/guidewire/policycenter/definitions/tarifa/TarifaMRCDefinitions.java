package com.sura.guidewire.policycenter.definitions.tarifa;

import com.sura.guidewire.policycenter.steps.tarifa.TarifaMRCSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class TarifaMRCDefinitions {
    @Steps
    TarifaMRCSteps tarifaMRCSteps;

    @Then("debo poder ver el valor de la prima <prima> en la cotizacion")
    public void verificarTarifacion(@Named("prima")String prima){
        tarifaMRCSteps.verificarTarifacion(prima);
    }

    @When("seleccione la cobertura de terremoto: $datos")
    public void seleccionarCobertura(ExamplesTable datos){
        tarifaMRCSteps.seleccionarCobertura(datos);
    }

    @When("seleccione la opcion de deducible en si")
    public void seleccionarDeducibleSi(){
        tarifaMRCSteps.seleccionarDeducibleSi();
    }

    @When("seleccione la opcion de deducible en no")
    public void seleccionarDeducibleNo(){
        tarifaMRCSteps.seleccionarDeducibleNo();
    }

    @When("agregue el articulo")
    public void agregarArticulo(){
        tarifaMRCSteps.agregarArticulo();
    }
}
