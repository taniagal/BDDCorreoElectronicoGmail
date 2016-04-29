package com.sura.policycenter.selenium.definitions;

import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.CrearNuevoContactoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;


/**
 * Created by brayruru on 2016/04/25.
 */
public class CrearNuevoContactoDefinitions {

    @Steps
    CrearNuevoContactoSteps crearNuevoContactoSteps ;

    @Given("estoy en la pantalla de crear contacto persona natural")
    public void givenEstoyEnLaPantallaDeCrearContactoPersonaNatural() {
        crearNuevoContactoSteps.nuevoContactoPersona();
    }

    @When("ingreso la informacion del tipo de documento <tipoDocumento>")
    public void whenIngresoLaInformacionDelTipoDeDocumentotipoDocumento(@Named("tipoDocumento") String tipoDocumento) {
        crearNuevoContactoSteps.seleccionarTipoDocumentoPersonaNatural(tipoDocumento);
    }

    @When("ingreso la informacion de numero de documento <numeroDeDocumento>")
    public void whenIngresoLaInformacionDeNumeroDeDocumentonumeroDeDocumento(@Named("numeroDeDocumento") String numeroDeDocumento) {
        crearNuevoContactoSteps.ingresarNumeroDocumentoPersonaNatural(numeroDeDocumento);
    }

    @When("ingreso la informacion de primer nombre <primerNombre>")
    public void whenIngresoLaInformacionDePrimerNombreprimerNombre(@Named("primerNombre") String primerNombre) {
        crearNuevoContactoSteps.ingresarPrimerNombrePersonaNatural(primerNombre);
    }

    @When("ingreso la informacion de primer apellido <primerApellido>")
    public void whenIngresoLaInformacionDePrimerApellidoprimerApellido(@Named("primerApellido") String primerApellido) {
        crearNuevoContactoSteps.ingresarPrimerApellidoPersonaNatural(primerApellido);
    }

    @When("ingreso la informacion de tipo de dioreccion <tipoDireccion>")
    public void whenIngresoLaInformacionDeTipoDeDiorecciontipoDireccion(@Named("tipoDireccion") String tipoDireccion) {
        crearNuevoContactoSteps.seleccionarTipoDireccionPersonaNatural(tipoDireccion);
    }

    @When("ingreso la informacion de direccion <direccion>")
    public void whenIngresoLaInformacionDeDirecciondireccion(@Named("direccion") String direccion) {
        crearNuevoContactoSteps.ingresarDireccionPersonaNatural(direccion);
    }

    @Then("se debe crear una persona tipo natural")
    public void thenSeDebeCrearUnaPersonaTipoNatural() {
        crearNuevoContactoSteps.actualizar();
    }

    ////////////ESCENARIO CREAR PERSONA JURIDICA

    @Given("estoy en la pantalla de crear contacto persona juridica")
    public void givenEstoyEnLaPantallaDeCrearContactoPersonaJuridica() {
        crearNuevoContactoSteps.nuevoContactoPersonaJuridica();
    }

    @When("ingreso la informacion de razon social <razonSocial>")
    public void whenIngresoLaInformacionDeRazonSocial(@Named("razonSocial") String razonSocial) {
        crearNuevoContactoSteps.ingresarRazonSocial(razonSocial);
    }

    @Then("se debe crear una persona tipo juridica")
    public void thenSeDebeCrearUnaPersonaTipoJuridica() {
        crearNuevoContactoSteps.actualizarJuridica();
    }

    @Then("debe validar que el contacto ya existe")
    public void thenSeDebeValidarQueElContactoYaExiste() {
        crearNuevoContactoSteps.verificarContactoExistente();
    }



}
