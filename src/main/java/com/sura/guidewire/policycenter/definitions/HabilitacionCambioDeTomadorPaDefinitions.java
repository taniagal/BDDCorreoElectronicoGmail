package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.HabilitacionCambioDeTomadorPaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class HabilitacionCambioDeTomadorPaDefinitions {
    @Steps
    HabilitacionCambioDeTomadorPaSteps habilitacionCambioDeTomadorPaSteps;

    @Then("debe estar disposible el boton cambiar tomador con las opciones por las cuales puedo cambiarlo:$opciones")
    public void validarBotonCambiarTomador(ExamplesTable opciones) {
        habilitacionCambioDeTomadorPaSteps.validarPresenciaBotonCambiarTomadorPrincipal(opciones);
    }

    @When("quiera cambiar el tomador principal por uno existente que es pep con <numeroDocumento> y <tipoDocumento>")
    public void cambiarTomadorPrincipal(@Named("numeroDocumento") String numeroDocumento, @Named("tipoDocumento") String tipoDocumento) {
        habilitacionCambioDeTomadorPaSteps.cambiarTomadorPrincipal(numeroDocumento, tipoDocumento);
    }

    @Then("se debe mostrar un mensaje indicando que el tomador principal es peps $mensaje")
    public void validarMensajePeps(ExamplesTable mensaje) {
        habilitacionCambioDeTomadorPaSteps.validarMensajePeps(mensaje);
    }
}
