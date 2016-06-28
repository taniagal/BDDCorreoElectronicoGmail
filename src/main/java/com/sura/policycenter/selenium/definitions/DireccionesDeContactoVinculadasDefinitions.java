package com.sura.policycenter.selenium.definitions;

import com.google.inject.name.Named;
import com.sura.policycenter.selenium.steps.DireccionesDeContactoVinculadasSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class DireccionesDeContactoVinculadasDefinitions {

    @Steps
    private DireccionesDeContactoVinculadasSteps direccionesDeContactoVinculadasSteps;

    @Given("que me encuentro en los contactos de una cuenta <numeroCuenta>")
    public void buscarCuenta(@Named("numeroCuenta") String numeroCuenta) {
        direccionesDeContactoVinculadasSteps.buscarCuenta(numeroCuenta);
    }

    @When("este en una direccion que esta asociada a otro contacto y la desee editar")
    public void filtrarPorNumeroCuenta() {
        direccionesDeContactoVinculadasSteps.vincularDirecciones();
    }

    @Then("me debe mostrar la siguiente informacion: $resultadoModificacionDireccion")
    public void validarInformacion(ExamplesTable resultadoModificacionDireccion){
        direccionesDeContactoVinculadasSteps.validarInformacion(resultadoModificacionDireccion);
    }

    @When("ingrese solo informacion obligatoria")
    public void filtrarPorInfoObligatoria() {
        direccionesDeContactoVinculadasSteps.filtrarPorInfoObligatoria();
    }

    @When("quiera actualizar la direccion de un contacto que tiene otros contactos que la usan")
    public void seleccionarContacto() {
        direccionesDeContactoVinculadasSteps.seleccionarContacto();
    }

    @When("ingrese a editar la direccion por <direccion>")
    public void editarDireccion(@Named("direccion") String direccion){
        direccionesDeContactoVinculadasSteps.editarDireccion(direccion);
    }

    @When("ingrese a editar la direccion por <direccion> en detalle contacto pestaña direcciones")
    public void editarDireccionEnPestañaDirecciones(@Named("direccion") String direccion){
        direccionesDeContactoVinculadasSteps.editarDireccionEnPestaniaDirecciones(direccion);
    }

    @Then("me debe mostrar esta informacion: $resultadoModificacionDireccion")
    public void validarInformacionContacto(ExamplesTable resultadoModificacionDireccion){
        direccionesDeContactoVinculadasSteps.validarInformacionContacto(resultadoModificacionDireccion);
    }

    @Then("me debe validar la informacion de los contactos que usan esa direccion: $contactosDireccionVinculada")
    public void validarInfoContactosAsociadosADireccion(ExamplesTable contactosDireccionVinculada){
        direccionesDeContactoVinculadasSteps.validarInfoContactosAsociadosADireccion(contactosDireccionVinculada);
    }

    @Then("el campo direccion no debe permitir ingresar mas de 200 caracteres <direccionOk>")
    public void validarLongitudDelCampoDireccion(@Named("direccionOk") String direccionOk){
        direccionesDeContactoVinculadasSteps.validarLongitudDelCampoDireccion(direccionOk);
    }

}
