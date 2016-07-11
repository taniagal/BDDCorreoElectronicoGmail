package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.PolizasDePrimeraPerdidaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class PolizasDePrimeraPerdidaDefinitions {
    @Steps
    PolizasDePrimeraPerdidaSteps polizasDePrimeraPerdidaSteps;

    @When("ingrese un limite de cobertura inferior al valor asegurable del articulo $datos")
    public void ingresarDatos(ExamplesTable datos){
        polizasDePrimeraPerdidaSteps.ingresar_articulo(datos);
    }

    @When("seleccionde el tipo de primera perdida <tipo>")
    public void seleccionarTipoPrimeraPerdida(@Named("tipo") String tipoPrimeraPerdida){
        polizasDePrimeraPerdidaSteps.seleccionar_tipo_primera_perdida(tipoPrimeraPerdida);
    }

    @Then("se debe mostrar el mensaje <mensaje>")
    public void validarMensaje(@Named("mensaje") String mensaje){
        polizasDePrimeraPerdidaSteps.validar_mensaje(mensaje);
    }
}
