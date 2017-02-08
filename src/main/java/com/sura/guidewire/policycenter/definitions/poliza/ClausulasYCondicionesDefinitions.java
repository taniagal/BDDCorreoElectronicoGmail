package com.sura.guidewire.policycenter.definitions.poliza;


import com.google.inject.name.Named;
import com.sura.guidewire.policycenter.steps.poliza.ClausulasYCondicionesSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class ClausulasYCondicionesDefinitions {

    @Steps
    ClausulasYCondicionesSteps clausulasYCondicionesSteps;


    @When("ingrese a exclusiones y condiciones")
    public void cuandoIngreseAExclusionesYCondiciones() {
        clausulasYCondicionesSteps.ingresarAClausulasYCondiciones();
    }

    @Then("se deben mostrar las siguientes opciones en clausulas en <estadouno> $listaopciones")
        public void entoncesSeDebenMostrarLasSiguientesOpciones(ExamplesTable listaopciones, @Named("estadouno") String estadouno) {
        String estadodos ="";
        clausulasYCondicionesSteps.validarOpciones(listaopciones,estadouno,estadodos);
    }
}

