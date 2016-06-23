package com.sura.policycenter.selenium.definitions;

import com.google.inject.name.Named;
import com.sura.policycenter.selenium.steps.DireccionesDeContactoVinculadasSteps;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class DireccionesDeContactoVinculadasDefinitions {

    @Steps
    private DireccionesDeContactoVinculadasSteps direccionesDeContactoVinculadasSteps;

    @Given("que me encuentro en las direcciones de un contacto asociado a una cuenta <numeroCuenta>")
    public void buscarCuenta(@Named("numeroCuenta") String numeroCuenta) {
        direccionesDeContactoVinculadasSteps.buscarCuenta(numeroCuenta);
    }

    @When("este en una direccion que esta asociada a otro contacto y la desee editar")
    public void filtrarPorNumeroCuenta() {
        direccionesDeContactoVinculadasSteps.vincularDirecciones();
    }
    @Pending
    @Then("me debe mostrar la siguiente informacion: $resultadoFiltroActividades")
    public void validarInformacion(ExamplesTable resultadoFiltroActividades){
        direccionesDeContactoVinculadasSteps.validarInformacion(resultadoFiltroActividades);
    }
}
