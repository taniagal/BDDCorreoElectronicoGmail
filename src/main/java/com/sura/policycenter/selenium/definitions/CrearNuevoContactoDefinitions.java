package com.sura.policycenter.selenium.definitions;

import com.sura.commons.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.CrearNuevoContactoSteps;
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
        crearNuevoContactoSteps.nuevo_contacto_persona();
    }

    @When("ingreso la informacion del tipo de documento <tipoDocumento>")
    public void whenIngresoLaInformacionDelTipoDeDocumentotipoDocumento(@Named("tipoDocumento") String tipoDocumento) {
        crearNuevoContactoSteps.seleccionar_tipo_documento_persona_natural(tipoDocumento);
    }

    @When("ingreso la informacion de numero de documento <numeroDeDocumento>")
    public void whenIngresoLaInformacionDeNumeroDeDocumentonumeroDeDocumento(@Named("numeroDeDocumento") String numeroDeDocumento) {
        crearNuevoContactoSteps.ingresar_numero_documento_persona_natural(numeroDeDocumento);
    }


    @When("ingreso la informacion de primer nombre <primerNombre>")
    public void whenIngresoLaInformacionDePrimerNombreprimerNombre(@Named("primerNombre") String primerNombre) {
        crearNuevoContactoSteps.ingresar_primer_nombre_persona_natural(primerNombre);
    }

    @When("ingreso la informacion de primer apellido <primerApellido>")
    public void whenIngresoLaInformacionDePrimerApellidoprimerApellido(@Named("primerApellido") String primerApellido) {
        crearNuevoContactoSteps.ingresar_primer_apellido_persona_natural(primerApellido);
    }

    @When("ingreso la informacion de tipo de direccion <tipoDireccion>")
    public void whenIngresoLaInformacionDeTipoDeDirecciontipoDireccion(@Named("tipoDireccion") String tipoDireccion) {
        crearNuevoContactoSteps.seleccionar_tipo_direccion_persona_natural(tipoDireccion);
    }

    @When("ingreso la informacion de direccion <direccion>, <departamento>, y <ciudad>")
    public void whenIngresoLaInformacionDeDirecciondireccion(@Named("direccion") String direccion, @Named("departamento") String departamento, @Named("ciudad") String ciudad) {
        crearNuevoContactoSteps.ingresar_direccion_persona_natural(direccion, departamento, ciudad);
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
       crearNuevoContactoSteps.ingresar_numero_telefono_fijo(tipoTelefonoFijo, numeroTelefonoFijo);
    }

    @Then("el campo de ciudad deben ser obligatorios")
    public void thenElCampoDePaispaisDepartamentodepartamentoYCiudadciudadDebenSerObligatorios() {
        crearNuevoContactoSteps.validar_campo_pais_departamento_y_ciudad();
    }

    /**
     * Escenario crear persona juridica
     */
    @Given("estoy en la pantalla de crear contacto persona juridica")
    public void givenEstoyEnLaPantallaDeCrearContactoPersonaJuridica() {
        crearNuevoContactoSteps.nuevo_contacto_persona_juridica();
    }

    @When("ingreso la informacion de razon social <razonSocial>")
    public void whenIngresoLaInformacionDeRazonSocial(@Named("razonSocial") String razonSocial) {
        crearNuevoContactoSteps.ingresar_razon_social(razonSocial);
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
        crearNuevoContactoSteps.verificar_contacto_existente();
    }

}
