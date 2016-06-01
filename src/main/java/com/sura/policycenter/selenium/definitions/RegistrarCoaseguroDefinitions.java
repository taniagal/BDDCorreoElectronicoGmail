package com.sura.policycenter.selenium.definitions;


import com.sura.policycenter.selenium.steps.CoaseguroSteps;
import com.sura.policycenter.model.Aseguradora;
import java.util.ArrayList;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


public class RegistrarCoaseguroDefinitions {
    @Steps
    CoaseguroSteps coaseguroSteps;

    @Given("puedo ingresar los datos del coaseguro")
    public void validarCampos(){
        //coaseguroSteps.validarCampos();
    }

    @When("agregue las aseguradoras y su porcentaje de participacion")
    public void agregarCoaseguro(){
        ArrayList<Aseguradora> aseguradoras = new ArrayList<>();
        Aseguradora aseguradora = new Aseguradora();
        aseguradora.setAseguradora("Sura");
        aseguradora.setParticipacion("60");
        aseguradoras.add(aseguradora);
        aseguradora.setAseguradora("Fasecolda");
        aseguradora.setParticipacion("40");
        aseguradoras.add(aseguradora);
        coaseguroSteps.agregarCoaseguro(aseguradoras);
    }

    @Then("el proceso debe ser exitoso")
    public void verificarCoaseguro(){}

}
