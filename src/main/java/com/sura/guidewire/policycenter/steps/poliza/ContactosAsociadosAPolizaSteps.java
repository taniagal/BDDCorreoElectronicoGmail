package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.poliza.ContactosAsociadosAPolizaPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;


public class ContactosAsociadosAPolizaSteps {

    @Page
    ContactosAsociadosAPolizaPage contactosAsociadosAPolizaPage;

    @Step
    public void validarOpcionesDeTablaContactos(ExamplesTable opciones) {
        contactosAsociadosAPolizaPage.validarOpcionesDeTablaContactos(opciones);
    }

    @Step
    public void validarPestañasEnContactos(ExamplesTable opciones) {
        contactosAsociadosAPolizaPage.validarPestanasDeOpcionContactos(opciones);
    }
}
