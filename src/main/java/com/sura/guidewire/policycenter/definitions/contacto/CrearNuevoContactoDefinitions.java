package com.sura.guidewire.policycenter.definitions.contacto;

import com.sura.guidewire.policycenter.steps.contacto.CrearNuevoContactoSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

@SuppressWarnings("WeakerAccess")
public class CrearNuevoContactoDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    private CrearNuevoContactoSteps crearNuevoContactoSteps ;

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

    @When("ingreso la informacion de tipo de direccion <tipoDireccion>")
    public void whenIngresoLaInformacionDeTipoDeDirecciontipoDireccion(@Named("tipoDireccion") String tipoDireccion) {
        crearNuevoContactoSteps.seleccionarTipoDireccionPersonaNatural(tipoDireccion);
    }

    @When("ingreso la informacion de direccion <direccion>, <departamento>, y <ciudad>")
    public void whenIngresoLaInformacionDeDirecciondireccion(@Named("direccion") String direccion, @Named("departamento") String departamento, @Named("ciudad") String ciudad) {
        crearNuevoContactoSteps.ingresarDireccionPersonaNatural(direccion, departamento, ciudad);
    }

    @Then("se debe crear una persona tipo natural con primer nombre <primerNombre>")
    public void thenSeDebeCrearUnaPersonaTipoNatural(@Named("primerNombre") String primerNombre) {
        crearNuevoContactoSteps.actualizar(primerNombre);
    }

    @Then("se debe crear una persona natural con primer nombre <primerNombre>")
    public void thenSeDebeCrearUnaPersonaNatural(@Named("primerNombre") String primerNombre) {
        crearNuevoContactoSteps.actualizar(primerNombre);
    }

    @When("selecciono el tipo de telefono fijo <tipoTelefonoFijo> e ingreso el numero de telefono fijo <numeroTelefonoFijo>")
    public void whenIngresoElNumeroDeTelefonoFijotelefonoFijo(@Named("tipoTelefonoFijo") String tipoTelefonoFijo, @Named("numeroTelefonoFijo") String numeroTelefonoFijo) {
       crearNuevoContactoSteps.ingresarNumeroTelefonoFijo(tipoTelefonoFijo, numeroTelefonoFijo);
    }

    @Then("el campo de ciudad deben ser obligatorios")
    public void thenElCampoDePaispaisDepartamentodepartamentoYCiudadciudadDebenSerObligatorios() {
        crearNuevoContactoSteps.validarCampoPaisDepartamentoYCiudad();
    }

    /**
     * Escenario crear persona juridica
     */
    @Given("estoy en la pantalla de crear contacto persona juridica")
    public void givenEstoyEnLaPantallaDeCrearContactoPersonaJuridica() {
        crearNuevoContactoSteps.nuevoContactoPersonaJuridica();
    }

    @When("ingreso la informacion de razon social <razonSocial>")
    public void whenIngresoLaInformacionDeRazonSocial(@Named("razonSocial") String razonSocial) {
        crearNuevoContactoSteps.ingresarRazonSocial(razonSocial);
    }

    @Then("se debe crear una persona tipo juridica con razon social <razonSocial>")
    public void thenSeDebeCrearUnaPersonaTipoJuridica(@Named("razonSocial") String razonSocial) {
        crearNuevoContactoSteps.actualizar_juridica(razonSocial);
    }

    @Then("se debe crear una persona juridica con razon social <razonSocial>")
    public void thenSeDebeCrearUnaPersonaJuridica(@Named("razonSocial") String razonSocial) {
        crearNuevoContactoSteps.actualizar_juridica(razonSocial);
    }

    @Then("debe validar que el contacto ya existe")
    public void thenSeDebeValidarQueElContactoYaExiste() {
        crearNuevoContactoSteps.verificarContactoExistente();
    }

}
