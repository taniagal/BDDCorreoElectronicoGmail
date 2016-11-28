package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.RevisionDePolizaSteps;
import org.jbehave.core.annotations.When;

/**
 * Created by juanzaag on 25/11/2016.
 */
public class RevisionDePolizaDefinitions {

  RevisionDePolizaSteps revisionDePolizaSteps;

    @When("ingrese a la opcion revision de la poliza")
    public void ingresarARevisionPoliza(){
        revisionDePolizaSteps.ingresar_a_revision_de_poliza();
    }
}
