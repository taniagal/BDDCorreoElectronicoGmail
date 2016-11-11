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

    @When("cotice el articulo")
    public void agregarArticulo(){
        tarifaMRCSteps.agregarArticulo();
    }

    @When("quiera ingresar modificadores de tarifa")
    public void irAModificadores(){
        tarifaMRCSteps.irAModificadores();
    }

    @Then("debo poder ver los modificadores definidos")
    public void verificarModificadores(){
        tarifaMRCSteps.verificarModificadores();
    }

    @Then("debo poder ver el valor de la tasa global")
    public void verificarTasaGlobal(){
        tarifaMRCSteps.verificarTasaGlobal();
    }

    @When("intente modificar la tasa global a un valor <valor> menor al del departamento")
    public void ingresarTasaGlobal(@Named("valor") String valor){
        tarifaMRCSteps.ingresarTasaGlobal(valor);
    }

    @Then("debo poder ver el mensaje de bloqueo <mensaje>")
    public void verificarMensaje(@Named("mensaje") String mensaje){
        tarifaMRCSteps.verificarMensaje(mensaje);
    }
}
