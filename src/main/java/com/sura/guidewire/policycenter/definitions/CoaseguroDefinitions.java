package com.sura.guidewire.policycenter.definitions;


import com.sura.guidewire.policycenter.steps.commons.SeusLoginSteps;
import com.sura.guidewire.policycenter.utils.model.Aseguradora;
import com.sura.guidewire.policycenter.steps.CoaseguroSteps;
import java.util.ArrayList;
import java.util.List;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


public class CoaseguroDefinitions {
    @Steps
    CoaseguroSteps coaseguroSteps;
    @Steps
    SeusLoginSteps seusLoginSteps;

    List<Aseguradora> aseguradoras = new ArrayList<>();
    Aseguradora aseguradora = null;


    /**
     * ESCENARIO 1
     */

    @When("puedo ingresar los datos del coaseguro")
    public void validarCampos(){
        coaseguroSteps.validarCampos();
    }

    @When("agregue las aseguradoras y su porcentaje de participacion")
    public void agregarCoaseguro(){
        agregarAseguradora("Sura","60");
        agregarAseguradora("ACE SEGUROS S.A.","40");
        coaseguroSteps.agregarCoaseguro(aseguradoras);
    }

    @Then("el proceso debe ser exitoso")
    public void verificarCoaseguro(){
        coaseguroSteps.verificarCoaseguro();
    }


    /**
     * ESCENARIO 2
     */
    @When("no agregue mas de una aseguradora y/o porcentaje de participacion")
    public void agregarCoaseguro2(){
        agregarAseguradora("Sura","60");
        coaseguroSteps.agregarCoaseguro2(aseguradoras);
    }

    @Then("debe aparecer el mensaje <mensaje> y/o mensaje <mensaje2>")
    public void verificarMensaje(@Named("mensaje")String mensaje,@Named("mensaje2")String mensaje2){
        coaseguroSteps.verificarMensaje(mensaje);
        coaseguroSteps.verificarMensaje(mensaje2);
    }

    /**
     * ESCENARIO 3
     */

    @When("el porcentaje de paticipacion total no sea 100%")
    public void agregarCoaseguroParticipantes(){
        agregarAseguradora("Sura","60");
        agregarAseguradora("ACE SEGUROS S.A.","38");
        coaseguroSteps.agregarCoaseguro2(aseguradoras);
    }

    @Then("debe aparecer el mensaje <mensaje>")
    public void verificarMensaje2(@Named("mensaje")String mensaje){
        coaseguroSteps.verificarMensaje(mensaje);
    }


    private void agregarAseguradora(String aseguradora, String participacion){
        this.aseguradora = new Aseguradora();
        this.aseguradora.setNombre(aseguradora);
        this.aseguradora.setParticipacion(participacion);
        aseguradoras.add(this.aseguradora);
    }
}
