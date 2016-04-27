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
    SeusLoginSteps seusLoginSteps;
    @Steps
    CrearNuevoContactoSteps crearNuevoContactoSteps ;


    @Given("estoy logueado con usuario <usr> y contrasenia <contrasenia> y pais <country>")
    public void givenEstoyLogueadoConUsuariousrYContraseniacontrasenia(@Named("country") String country, @Named("usr") String user, @Named("contrasenia") String password) {
        seusLoginSteps.login(country,user,password);
    }

    @Given("estoy en la pantalla de crear contacto persona natural")
    public void givenEstoyEnLaPantallaDeCrearContactoPersonaNatural() {
        crearNuevoContactoSteps.nuevoContactoPersona();
    }

    @When("ingreso la informacion del tipo de documento <tipoDocumento>")
    public void whenIngresoLaInformacionDelTipoDeDocumentotipoDocumento(@Named("tipoDocumento") String tipoDocumento) {
        // PENDING
    }

    @When("ingreso la informacion de numero de documento <numeroDeDocumento>")
    @Pending
    public void whenIngresoLaInformacionDeNumeroDeDocumentonumeroDeDocumento() {
        // PENDING
    }

    @When("ingreso la informacion de primer nombre <primerNombre>")
    @Pending
    public void whenIngresoLaInformacionDePrimerNombreprimerNombre() {
        // PENDING
    }

    @When("ingreso la informacion de primer apellido <primerApellido>")
    @Pending
    public void whenIngresoLaInformacionDePrimerApellidoprimerApellido() {
        // PENDING
    }

    @When("ingreso la informacion de tipo de dioreccion <tipoDireccion>")
    @Pending
    public void whenIngresoLaInformacionDeTipoDeDiorecciontipoDireccion() {
        // PENDING
    }

    @When("ingreso la informacion de direccion <direccion>")
    @Pending
    public void whenIngresoLaInformacionDeDirecciondireccion() {
        // PENDING
    }

    @Then("se debe crear una persona tipo natural")
    @Pending
    public void thenSeDebeCrearUnaPersonaTipoNatural() {
        // PENDING
    }

}
