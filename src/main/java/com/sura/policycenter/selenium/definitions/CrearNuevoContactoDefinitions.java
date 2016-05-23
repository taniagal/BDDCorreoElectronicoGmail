package com.sura.policycenter.selenium.definitions;

import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.CrearNuevoContactoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by brayruru on 2016/04/25.
 */
@SuppressWarnings("WeakerAccess")
public class CrearNuevoContactoDefinitions {

    @Steps
    private CrearNuevoContactoSteps crearNuevoContactoSteps ;
    @Steps
    private SeusLoginSteps seusLoginSteps;

    @Given("estoy en la pantalla de crear contacto persona natural")
    public void givenEstoyEnLaPantallaDeCrearContactoPersonaNatural() {
        seusLoginSteps.login();
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

    @Then("se debe crear una persona tipo natural con primer nombre <primerNombre>")
    public void thenSeDebeCrearUnaPersonaTipoNatural(@Named("primerNombre") String primerNombre) {
        crearNuevoContactoSteps.actualizar(primerNombre);

//        crearNuevoContactoSteps.getDriver().close();
    }

    @When("selecciono el tipo de telefono fijo <tipoTelefonoFijo> e ingreso el numero de telefono fijo <numeroTelefonoFijo>")
    public void whenIngresoElNumeroDeTelefonoFijotelefonoFijo(@Named("tipoTelefonoFijo") String tipoTelefonoFijo, @Named("numeroTelefonoFijo") String numeroTelefonoFijo) {
       crearNuevoContactoSteps.ingresarNumeroTelefonoFijo(tipoTelefonoFijo, numeroTelefonoFijo);
    }

    @Then("el campo de ciudad deben ser obligatorios")
    public void thenElCampoDePaispaisDepartamentodepartamentoYCiudadciudadDebenSerObligatorios() {
        crearNuevoContactoSteps.validarCampoPaisDepartamentoYCiudad();
    }

    ////////////ESCENARIO CREAR PERSONA JURIDICA
    @Given("estoy en la pantalla de crear contacto persona juridica")
    public void givenEstoyEnLaPantallaDeCrearContactoPersonaJuridica() {
        seusLoginSteps.login();
        crearNuevoContactoSteps.nuevoContactoPersonaJuridica();
    }

    @When("ingreso la informacion de razon social <razonSocial>")
    public void whenIngresoLaInformacionDeRazonSocial(@Named("razonSocial") String razonSocial) {
        crearNuevoContactoSteps.ingresarRazonSocial(razonSocial);
    }

    @Then("se debe crear una persona tipo juridica con razon social <razonSocial>")
    public void thenSeDebeCrearUnaPersonaTipoJuridica(@Named("razonSocial") String razonSocial) {
        crearNuevoContactoSteps.actualizarJuridica(razonSocial);
    }

    @Then("debe validar que el contacto ya existe")
    public void thenSeDebeValidarQueElContactoYaExiste() {
        crearNuevoContactoSteps.verificarContactoExistente();
    }

}
