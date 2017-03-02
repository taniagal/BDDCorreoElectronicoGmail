package com.sura.guidewire.policycenter.definitions.poliza;


import com.sura.guidewire.policycenter.steps.poliza.CoaseguroSteps;
import com.sura.guidewire.policycenter.steps.commons.LoginSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;


public class CoaseguroDefinitions {
    @Steps
    CoaseguroSteps coaseguroSteps;
    @Steps
    LoginSteps loginSteps;


    @When("puedo ingresar los datos del coaseguro")
    public void validarCampos() {
        coaseguroSteps.validarCampos();
    }

    @When("agregue las aseguradoras y su porcentaje de participacion $datos")
    @Alias("agregue las aseguradoras y el porcentaje de participacion total no sea 100% $datos")
    public void agregarCoaseguro(ExamplesTable datos) {
        coaseguroSteps.agregarCoaseguro(datos);
    }

    @When("verifique el porcentaje de participacion")
    public void verificarPorcentajeDeParticipacion(){
        coaseguroSteps.verificarPorcentajeDeParticipacion();
    }

    @When("acepte el coaseguro")
    public void aceptarcoaseguro(){
        coaseguroSteps.guardarCoaseguro();
    }

    @Then("el proceso debe ser exitoso")
    public void verificarCoaseguro() {
        coaseguroSteps.verificarCoaseguro();
    }


    @Then("debe aparecer el mensaje <mensaje> y/o mensaje <mensaje2>")
    public void verificarMensaje(@Named("mensaje") String mensaje, @Named("mensaje2") String mensaje2) {
        coaseguroSteps.verificarMensaje(mensaje);
        coaseguroSteps.verificarMensaje(mensaje2);
    }

    @Then("debe aparecer el mensaje <mensaje>")
    public void verificarMensaje2(@Named("mensaje") String mensaje) {
        coaseguroSteps.verificarMensaje(mensaje);
    }
}
