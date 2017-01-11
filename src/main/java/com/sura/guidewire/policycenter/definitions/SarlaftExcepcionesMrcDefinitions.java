package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.SarlaftExcepcionesMrcSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;

public class SarlaftExcepcionesMrcDefinitions {

    @Steps
    SarlaftExcepcionesMrcSteps sarlaftExcepcionesMrcSteps;

    @When("adicione un segundo tomador que requiere sarlaft <tipoDocumento> <documento>")
    public void agregarSegundoTomador(@Named("tipoDocumento")String tipoDocumento, @Named("documento")String documento){
        sarlaftExcepcionesMrcSteps.agregarSegundoTomador(tipoDocumento,documento);
    }

}
