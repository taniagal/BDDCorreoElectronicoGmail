package com.sura.policycenter.selenium.definitions;


import com.sura.policycenter.selenium.steps.ValidacionReglasDeNegocioCoberturasSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class ValidacionReglasDeNegocioCoberturasDefinitions {

    @Steps
    ValidacionReglasDeNegocioCoberturasSteps validacionReglasDeNegocioCoberturasSteps;

    @When("agregue cada una de las ubicaciones")
    public void whenAgregueCadaUnaDeLasUbicaciones() {
        validacionReglasDeNegocioCoberturasSteps.ingresa_primera_ubicacion();
    }

    @When("Agregue los articulos correspondientes a la ubicacion")
    public void whenAgregueLosArticulosCorrespondientesALaUbicacion() {

    }

    @Then("debe permitir pasar a la siguinete pagina")
    public void thendebePermitirPasarALaSiguinetePagina (){

    }
}
