package com.sura.guidewire.policycenter.definitions.administracion;

import com.sura.guidewire.policycenter.steps.administracion.CapturaMedioDeVentasSteps;
import com.sura.guidewire.policycenter.steps.administracion.PantallasAdministrativasAutorizacionesSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class PantallasAdminAutorizaDefinitions {
    @Steps
    PantallasAdministrativasAutorizacionesSteps pantallasAdministrativasAutorizacionesSteps;

    @Steps
    CapturaMedioDeVentasSteps capturaMedioDeVentasSteps;

    @When("vaya al menu de acciones")
    public void irAlMenuDeAcciones() {
        pantallasAdministrativasAutorizacionesSteps.irAlMenuAcciones();
    }

    @When("vaya a crear una nueva autorizacion")
    public void crearNuevaAutorizacion() {
        pantallasAdministrativasAutorizacionesSteps.crearNuevaAutorizacion();
    }

    @When("deben aparecer los siguientes campos: $opciones")
    public void validarCamposNuevaAutorizacion(ExamplesTable opciones) {
        capturaMedioDeVentasSteps.validarOpcionesMedioDeVenta(opciones);
    }

    @When("cuando ingrese una nueva autorizacion con los datos: $datosNuevaAutorizacion")
    public void ingresarNuevaAutorizacion(ExamplesTable datosNuevaAutorizacion) {
        pantallasAdministrativasAutorizacionesSteps.agregarNuevaAutorizacion(datosNuevaAutorizacion);
        pantallasAdministrativasAutorizacionesSteps.actualizarInformacionDigitada();
    }

    @Then("se debe ingresar correctamente el registro")
    public void validarIngresoDeRegistro() {
        pantallasAdministrativasAutorizacionesSteps.validarIngresoDeRegistro();
    }

    @Then("debe salir un mensaje indicando que el registro esta duplicado $mensaje")
    public void validarMensajeRegistroDuplicado(ExamplesTable mensaje) {
        pantallasAdministrativasAutorizacionesSteps.validarMensajeRegistroDuplicado(mensaje);
    }

    @Then("solo deben estar habilitados los campos activo e inactivo y se debe poder actualizar")
    public void validarEstadoDeCampos() {
        pantallasAdministrativasAutorizacionesSteps.validarEstadoDeCampos();
    }

    @Then("vaya a modificar la informacion de la autorizacion")
    public void modificarInformacionDeLaAutorizacion() {
        pantallasAdministrativasAutorizacionesSteps.modificarInformacionDeAutorizacion();
    }

    @Then("se debe mostrar toda la informacion relacionada a la autorizacion $informacion")
    public void visualizarInformacionRelacionadaConLaAutorizacion(ExamplesTable informacion){
        pantallasAdministrativasAutorizacionesSteps.validarInformacionAutorizacion(informacion);
    }
    @When("vaya a buscar la autorizacion con regla de validacion <reglaValidacion>")
    public void buscarReglaDeValidacion(@Named("reglaValidacion") String reglaValidacion){
        pantallasAdministrativasAutorizacionesSteps.busquedaPorReglaDeValidacion(reglaValidacion);
    }

}
