package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.poliza.RevisionDePolizaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

/**
 * Created by juanzaag on 25/11/2016.
 */
public class RevisionDePolizaDefinitions {

    @Steps
    RevisionDePolizaSteps revisionDePolizaSteps;

    @When("ingrese a la opcion revision de la poliza")
    public void ingresarARevisionPoliza() {
        revisionDePolizaSteps.ingresar_a_revision_de_poliza();
    }

    @Then("en revision de poliza deben estar en estado <estadodos> las siguientes opciones $menusesperados")
    public void entoncesEnRevisionDePolizaDebenEstarEnEstado(@Named("estadouno") String estadouno, @Named("estadodos") String estadodos, ExamplesTable menusesperados) {
        revisionDePolizaSteps.validar_campos_revision_poliza(estadouno, estadodos, menusesperados);
    }
}

