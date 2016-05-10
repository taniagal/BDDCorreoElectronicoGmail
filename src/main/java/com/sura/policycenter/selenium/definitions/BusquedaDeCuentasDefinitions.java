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
        busquedDeCuentasSteps.ingresarABuscarCuentas("Buscar", "Cuentas");
    }

    @When("seleccione el tipo de identificacion <tipoDocumento>")
    public void seleccionarIdentificacionNit(@Named("tipoDocumento") String tipoDocumento){
        busquedDeCuentasSteps.seleccionarTipoDocumento(tipoDocumento);
    }

    @When("ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>")
    public void buscarCuentaPorNombreYApellido(@Named("primerNombre") String primerNombre,
                                               @Named("segundoNombre") String segundoNombre,
                                               @Named("primerApellido") String primerApellido,
                                               @Named("segundoApellido") String segundoApellido){
        busquedDeCuentasSteps.buscarCuentaPorNombreYApellido(primerNombre, segundoNombre, primerApellido, segundoApellido);
    }

    @When("ingrese la informacion de tipo de documento <tipoDocumento> y numero de documento <numeroDocumento> del titular de la cuenta")
    public void buscarCuentaPorIdentificacion(@Named("tipoDocumento") String tipoDocumento,
                                               @Named("numeroDocumento") String numeroDocumento) {
        busquedDeCuentasSteps.buscarCuentaPorIdentificacion(tipoDocumento, numeroDocumento);
    }

    @When("ingrese la informacion de tipo de razon social <razonSocial> del titular de la cuenta")
    public void buscarCuentaPorRazonSocial(@Named("razonSocial") String razonSocial){
        busquedDeCuentasSteps.buscarCuentaPorRazonSocial(razonSocial);
    }

    @When("ingrese la informacion de nombre comercial <nombreComercial> del titular de la cuenta")
    public void buscarCuentaPorNombreComercial(@Named("nombreComercial") String nombreComercial){
        busquedDeCuentasSteps.buscarCuentaPorNombreComercial(nombreComercial);
    }

    @Then("me debe mostrar los campos tipo identificacion, numero identificacion, primer nombre, segundo nombre, primer apellido, segundo apellido, razon social, nombre comercial, pais, departamento, ciudad, direccion, telefono")
    public void validarCamposParaIdentificacionNit(){
        busquedDeCuentasSteps.validarCampos();
    }

    @Then("los label tipo identificacion, numero identificacion, razon social, nombre comercial, pais, departamento, ciudad, direccion, telefono")
    public void validarEtiquetasDeCamposParaIdentificacionNit(){
        busquedDeCuentasSteps.validarEtiquetasDeCampos();
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