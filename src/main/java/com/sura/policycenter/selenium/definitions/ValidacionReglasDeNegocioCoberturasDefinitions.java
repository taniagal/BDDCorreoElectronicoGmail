package com.sura.policycenter.selenium.definitions;


import com.sura.policycenter.selenium.steps.ValidacionReglasDeNegocioCoberturasSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class ValidacionReglasDeNegocioCoberturasDefinitions {

    @Steps
    ValidacionReglasDeNegocioCoberturasSteps validacionReglasDeNegocioCoberturasSteps;

    @When("agregue cada una de las ubicaciones")
    public void whenAgregueCadaUnaDeLasUbicaciones() {
        validacionReglasDeNegocioCoberturasSteps.ingresa_primera_ubicacion();
    }

    @Then("se debe mostrar un mensaje <mensaje> de advertencia y pasar a la siguinete pagina")
    public void thendebePermitirPasarALaSiguinetePagina (@Named("mensaje") String mensaje){
        validacionReglasDeNegocioCoberturasSteps.valida_mensaje_pantalla(mensaje);
    }

    @Then("debe permitir pasar a la siguinete pagina")
    public void thendebePermitirPasarALaSiguinetePagina (){
        validacionReglasDeNegocioCoberturasSteps.valida_paso_a_siguinete_pantalla();
    }
}
