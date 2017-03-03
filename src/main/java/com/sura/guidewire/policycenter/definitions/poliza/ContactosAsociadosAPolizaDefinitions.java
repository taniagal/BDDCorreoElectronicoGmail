package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.poliza.ContactosAsociadosAPolizaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.model.ExamplesTable;

public class ContactosAsociadosAPolizaDefinitions {

    @Steps
    ContactosAsociadosAPolizaSteps contactosAsociadosAPolizaSteps;

    @Then("se deben mostrar los siguientes campos en la tabla $opciones")
    public void entoncesSeDebenMostrarLosSiguientesCamposEnLaTabla(ExamplesTable opciones) {
        contactosAsociadosAPolizaSteps.validarOpcionesDeTablaContactos(opciones);

    }

    @Then("se debe mostrar las siguientes opciones en cada contacto $opciones")
    public void entoncesSeDebenMostrarLosSiguientesOpcionesEnCadaContacto(ExamplesTable opciones) {
        contactosAsociadosAPolizaSteps.validarPestañasEnContactos(opciones);

    }


}
