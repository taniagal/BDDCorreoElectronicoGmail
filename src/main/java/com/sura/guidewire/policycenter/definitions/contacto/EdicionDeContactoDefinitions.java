package com.sura.guidewire.policycenter.definitions.contacto;

import com.sura.guidewire.policycenter.steps.contacto.EdicionDeContactoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class EdicionDeContactoDefinitions {

    @Steps
    EdicionDeContactoSteps edicionDeContactoSteps;

    @When("edito los datos contacto ingresado y los guardo $datosContacto")
    public void editarDatosDelContactoYGuardar(ExamplesTable datosContacto){
        edicionDeContactoSteps.editarDatosDelContactoYGuardar(datosContacto);
    }

    @When("edito los datos contacto tipo compania ingresado y los guardo $datosContacto")
    public void editarDatosDeLaCompaniaYGuardar(ExamplesTable datosContacto){
        edicionDeContactoSteps.editarDatosDeLaCompaniaYGuardar(datosContacto);
    }

    @Then("debo ver los datos actualizados del contacto persona natural $datosContacto")
    public void validarDatosEditadosDelContacto(ExamplesTable datosContacto){
        edicionDeContactoSteps.validarDatosEditadosDelContacto(datosContacto);
    }

    @Then("debo ver los datos actualizados del contacto compania $datosContacto")
    public void validarDatosEditadosDeLaCompania(ExamplesTable datosContacto){
        edicionDeContactoSteps.validarDatosDeLaCompaniaEditados(datosContacto);
    }
}
