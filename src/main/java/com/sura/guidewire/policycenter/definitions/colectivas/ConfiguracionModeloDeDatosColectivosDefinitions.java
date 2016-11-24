package com.sura.guidewire.policycenter.definitions.colectivas;

import com.sura.guidewire.policycenter.steps.colectivas.ConfiguracionModeloDeDatosColectivosSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class ConfiguracionModeloDeDatosColectivosDefinitions {
    @Steps
    ConfiguracionModeloDeDatosColectivosSteps datosColectivosSteps;

    @When("ingrese a la informacion de la poliza")
    public void igresarAPolicy(){
        datosColectivosSteps.ingresarAPolicyInfo();
    }

    @Then("se deben ver los nuevos campos agregados con sus estados iniciales respectivos")
    public void verificarestadoDeCamposNuevos(){
        datosColectivosSteps.verificarEstadoDeCamposNuevos();
    }
}
