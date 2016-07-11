package com.sura.gw.policy.runners.administracion.consulta.cuenta.definiciones.legacy;


import com.google.inject.name.Named;
import com.sura.gw.policy.runners.administracion.consulta.cuenta.steps.legacy.BusquedaDeCuentasSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


public class BusquedaDeCuentasDefinitions {

    @Steps
    private BusquedaDeCuentasSteps busquedaDeCuentasSteps;

    @Given("que me encuentro en la busqueda de cuentas")
    public void ingresarABuscarCuentas() {
        busquedaDeCuentasSteps.ingresarABuscarCuentas();
    }

    @When("seleccione el tipo de identificacion <tipoDocumento>")
    public void seleccionarIdentificacionNit(@Named("tipoDocumento") String tipoDocumento){
        busquedaDeCuentasSteps.seleccionarTipoDocumento(tipoDocumento);
    }

    @When("ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>")
    public void buscarCuentaPorNombreYApellido(@Named("primerNombre") String primerNombre,
                                               @Named("segundoNombre") String segundoNombre,
                                               @Named("primerApellido") String primerApellido,
                                               @Named("segundoApellido") String segundoApellido){
        busquedaDeCuentasSteps.buscarCuentaPorNombreYApellido(primerNombre, segundoNombre, primerApellido, segundoApellido);
    }

    @When("ingrese la informacion de tipo de documento <tipoDocumento> y numero de documento <numeroDocumento> del titular de la cuenta")
    public void buscarCuentaPorIdentificacion(@Named("tipoDocumento") String tipoDocumento,
                                              @Named("numeroDocumento") String numeroDocumento) {
        busquedaDeCuentasSteps.buscarCuentaPorIdentificacion(tipoDocumento, numeroDocumento);
    }

    @When("ingrese la informacion de tipo de razon social <razonSocial> del titular de la cuenta")
    public void buscarCuentaPorRazonSocial(@Named("razonSocial") String razonSocial){
        busquedaDeCuentasSteps.buscarCuentaPorRazonSocial(razonSocial);
    }

    @When("ingrese la informacion de nombre comercial <nombreComercial> del titular de la cuenta")
    public void buscarCuentaPorNombreComercial(@Named("nombreComercial") String nombreComercial){
        busquedaDeCuentasSteps.buscarCuentaPorNombreComercial(nombreComercial);
    }

    @When("quiera exportar o imprimir los resultados de la busqueda")
    public void exportarOImprimirResultados(){
        busquedaDeCuentasSteps.seleccionarImprimir();
    }

    @When("ingrese la informacion de tipo de razon social <razonSocial> del titular de la cuenta e ingrese informacion de tipo persona natural <primerNombre>")
    public void ingresarRazonSocialYPrimerNombre(@Named("razonSocial") String razonSocial,
                                                 @Named("primerNombre") String primerNombre){
        busquedaDeCuentasSteps.ingresarRazonSocialYPrimerNombre(razonSocial, primerNombre);
    }

    @When("ingrese la informacion de nombre comercial <nombreComercial> del titular de la cuenta e ingrese informacion de tipo persona natural <primerNombre>")
    public void ingresarNombreComercialYPrimerNombre(@Named("nombreComercial") String nombreComercial,
                                                     @Named("primerNombre") String primerNombre){
        busquedaDeCuentasSteps.ingresarNombreComercialYPrimerNombre(nombreComercial, primerNombre);
    }

    @When("ingrese la informacion de nombre comercial <nombreComercial> del titular de la cuenta e ingrese razon social <razonSocial>")
    public void ingresarRazonSocialYNombreComercial(@Named("nombreComercial") String nombreComercial,
                                                    @Named("razonSocial") String razonSocial){
        busquedaDeCuentasSteps.ingresarRazonSocialYNombreComercial(nombreComercial, razonSocial);
    }

    @Then("me debe mostrar los campos tipo identificacion, numero identificacion, primer nombre, segundo nombre, primer apellido, segundo apellido, razon social, nombre comercial, pais, departamento, ciudad, direccion, telefono")
    public void validarCamposParaIdentificacionNit(){
        busquedaDeCuentasSteps.validarCampos();
    }

    @Then("los label tipo identificacion, numero identificacion, razon social, nombre comercial, pais, departamento, ciudad, direccion, telefono")
    public void validarEtiquetasDeCamposParaIdentificacionNit(){
        busquedaDeCuentasSteps.validarEtiquetasDeCampos();
    }

    @Then("me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>")
    public void mostrarInformacionDeLaCuenta(@Named("numeroCuenta") String numeroCuenta,
                                             @Named("nombre") String nombre,
                                             @Named("direccion") String direccion) {
        busquedaDeCuentasSteps.mostrarInformacionDeLaCuenta(numeroCuenta, nombre, direccion);
    }

    @Then("me debe mostrar el mensaje <mensaje>")
    public void validarMensaje(@Named("mensaje") String mensaje) {
        busquedaDeCuentasSteps.validarMensaje(mensaje);
    }

    @Then("me debe mostrar las opciones permitidas Imprimir como pdf <imprimir>, Exportar como CSV <exportar>, Exportación personalizada como CSV <exportarPersonalizado>")
    public void validarOpcionesImprimirYExportar(@Named("imprimir") String imprimir,
                                                 @Named("exportar") String exportar,
                                                 @Named("exportarPersonalizado") String exportarPersonalizado){
        busquedaDeCuentasSteps.validarOpcionesDeImprimir(imprimir, exportar, exportarPersonalizado);
    }

}
