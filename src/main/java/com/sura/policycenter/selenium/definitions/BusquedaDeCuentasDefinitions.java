package com.sura.policycenter.selenium.definitions;

import com.google.inject.name.Named;
import com.sura.policycenter.selenium.steps.BusquedaDeCuentasSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class BusquedaDeCuentasDefinitions {

    @Steps
    BusquedaDeCuentasSteps busquedDeCuentasSteps;

    @Given("que me encuentro en la busqueda de cuentas")
    public void ingresarABuscarCuentas() {
        busquedDeCuentasSteps.ingresarABuscarCuentas();
    }

    @When("ingrese la informacion de primer nombre <primerNombre> y primer apellido <primerApellido>")
    public void buscarCuentaPorNombreYApellido(@Named("primerNombre") String primerNombre,
                                               @Named("primerApellido") String primerApellido) {
        busquedDeCuentasSteps.buscarCuentaPorNombreYApellido(primerNombre, primerApellido);
    }

    @When("ingrese la informacion de tipo de documento <tipoDocumento> y numero de documento <numeroDocumento> del titular de la cuenta")
    public void buscarCuentaPorIdentificacion(@Named("tipoDocumento") String tipoDocumento,
                                               @Named("numeroDocumento") String numeroDocumento) {
        busquedDeCuentasSteps.buscarCuentaPorIdentificacion(tipoDocumento, numeroDocumento);
    }

    @Then("me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>")
    public void mostrarInformacionDeLaCuenta(@Named("numeroCuenta") String numeroCuenta,
                                             @Named("nombre") String nombre,
                                             @Named("direccion") String direccion) {
        busquedDeCuentasSteps.mostrarInformacionDeLaCuenta(numeroCuenta, nombre, direccion);
    }

    @Then("me debe mostrar el mensaje <mensaje>")
    public void validarMensaje(@Named("mensaje") String mensaje) {
        busquedDeCuentasSteps.validarMensaje(mensaje);
    }

}
