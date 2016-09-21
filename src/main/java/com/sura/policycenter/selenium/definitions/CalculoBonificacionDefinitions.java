package com.sura.policycenter.selenium.definitions;


import com.sura.policycenter.selenium.steps.CalculoBonificacionSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class CalculoBonificacionDefinitions {
    @Steps
    CalculoBonificacionSteps bonificacionSteps;


    @When("ingrese la placa <placa> en la informacion del vehiculo")
    public void agregraPlaca(@Named("placa") String placa){
        bonificacionSteps.agregar_placa_y_asegurado(placa);
    }

    @Then("se debe ver reflejada la bonificacion tecnica <bono> de esta placa")
    public void verificarBonoTecnico(@Named("bono")String bono){
        bonificacionSteps.verificar_bono_tecnico(bono);
    }

    @Then("se debe ver reflejada la bonificacion comercial <bono> de esta placa")
    public void verificarBonoComercial(@Named("bono")String bono){
        bonificacionSteps.verificar_bono_comercial(bono);
    }

}
