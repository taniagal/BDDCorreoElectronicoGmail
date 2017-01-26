package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.OpcionesDeCierreSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class OpcionesDeCierreDefinitions {
    @Steps
    OpcionesDeCierreSteps opcionesDeCierreSteps;

    @When("ingrese a opciones de cierre")
    public void irAOpcionesDeCierre() {
        opcionesDeCierreSteps.irAOpcionesDeCierre();
    }

    @Then("deben aparecer todas las razones de declinar poliza $opcionesDeclinacion")
    public void validarInformacionDeclinar(ExamplesTable opcionesDeclinacion) {
        opcionesDeCierreSteps.validarInformacionDeclinar(opcionesDeclinacion);
    }
}
