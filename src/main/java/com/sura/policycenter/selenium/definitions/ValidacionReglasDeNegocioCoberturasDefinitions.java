package com.sura.policycenter.selenium.definitions;


import com.sura.policycenter.selenium.steps.ValidacionReglasDeNegocioCoberturasSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class ValidacionReglasDeNegocioCoberturasDefinitions {

    @Steps
    ValidacionReglasDeNegocioCoberturasSteps validacionReglasDeNegocioCoberturasSteps;

    @When("quiera mostrar los edificios y ubicaciones")
    public void whenAgregueCadaUnaDeLasUbicaciones() {
        validacionReglasDeNegocioCoberturasSteps.ingresa_edificios_y_ubicaciones();
    }

    @Then("se debe mostrar un mensaje <mensaje> de advertencia y pasar a la siguinete pagina")
    public void thendebePermitirPasarALaSiguinetePagina (@Named("mensaje") String mensaje){
        validacionReglasDeNegocioCoberturasSteps.valida_mensaje_pantalla(mensaje);
    }

    @Then("debe pasar a la siguinete pagina sin mostrar mensajes")
    public void validaPasoAAsiguinetePagina (){
        validacionReglasDeNegocioCoberturasSteps.valida_paso_a_pantalla_siguiente();
    }



}
