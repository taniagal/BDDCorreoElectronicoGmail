package com.sura.policycenter.selenium.definitions;


import com.sura.policycenter.selenium.steps.CoaseguroSteps;
import com.sura.policycenter.model.Aseguradora;
import java.util.ArrayList;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


public class CoaseguroDefinitions {
    @Steps
    CoaseguroSteps coaseguroSteps;

    ArrayList<Aseguradora> aseguradoras = new ArrayList<>();
    Aseguradora aseguradora = null;

    @Given("puedo ingresar los datos del coaseguro")
    public void validarCampos(){
        coaseguroSteps.validarCampos();
    }

    @When("agregue las aseguradoras y su porcentaje de participacion")
    public void agregarCoaseguro(){
        agregarAseguradora("Sura","60");
        agregarAseguradora("Axxa","40");
        coaseguroSteps.agregarCoaseguro(aseguradoras);
    }

    @Then("el proceso debe ser exitoso")
    public void verificarCoaseguro(){
        coaseguroSteps.verificarCoaseguro();
    }

    private void agregarAseguradora(String aseguradora, String participacion){
        this.aseguradora = new Aseguradora();
        this.aseguradora.setAseguradora(aseguradora);
        this.aseguradora.setParticipacion(participacion);
        aseguradoras.add(this.aseguradora);
    }
}
