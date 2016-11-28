package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.RevisionDePolizaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by juanzaag on 25/11/2016.
 */
public class RevisionDePolizaSteps extends ScenarioSteps {

    RevisionDePolizaPage revisionDePolizaPage;

    @Step
    public void ingresar_a_revision_de_poliza(){
        revisionDePolizaPage.ingresarALaOpcionRevisionPoliza();
    }


}


