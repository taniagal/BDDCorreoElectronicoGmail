package com.sura.guidewire.policycenter.definitions.contacto;

import com.sura.guidewire.policycenter.steps.contacto.EdicionDeContactoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class EdicionDeContactoDefinitions {

    @Steps
    EdicionDeContactoSteps edicionDeContactoSteps;

    @When("edito los datos contacto ingresado y los guardo $datosContacto")
    public void editarDatosDelContactoYGuardar(ExamplesTable datosContacto){
        edicionDeContactoSteps.editarDatosDelContactoYGuardar(datosContacto);
    }
}
