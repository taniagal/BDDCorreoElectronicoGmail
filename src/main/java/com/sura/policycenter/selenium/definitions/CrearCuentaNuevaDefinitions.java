package com.sura.policycenter.selenium.definitions;

import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.CrearNuevaCuentaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

@SuppressWarnings("WeakerAccess")
public class CrearCuentaNuevaDefinitions {
    @Steps
    private SeusLoginSteps seusLogin;

    @Steps
    private CrearNuevaCuentaSteps cns;


    @Given("que me encuentro en el sistema de policy center")
    public void login() {
        seusLogin.login();
    }

    @When("quiera crear una cuenta para un contacto persona natural e ingrese documento, tipo de documento <tipo_documento>")
    public void crearCuentaNuevaPersonaNatural(@Named("tipo_documento")String tipoDocumento){
        cns.abrirNuevaCuenta();
        cns.agregarTipoDocumento(tipoDocumento);
    }

    @When("fecha de nacimiento <fecha_nacimiento> Primer nombre <primer_nombre>,primer apellido <primer_apellido>")
    public void agregarNombres(@Named("fecha_nacimiento")String fechaNacimiento,@Named("primer_nombre")String primerNombre,
                                       @Named("primer_apellido")String primerApellido){
        cns.agregarNombre(primerNombre,primerApellido,fechaNacimiento);
    }

    @When("tipo de direccion <tipo_direccion>, direccion <direccion>, departamento <departamento>, ciudad <ciudad>")
    public void agregarDireccion( @Named("tipo_direccion")String tipoDireccion, @Named("direccion")String direccion,
                                  @Named("departamento")String departamento,@Named("ciudad")String ciudad){
        cns.agregarDireccion(tipoDireccion,direccion,departamento,ciudad);
    }
    @When("nombre de organizacion <nombre_organizacion> <agente>")
    public void agregarOrganizacion( @Named("nombre_organizacion")String nombreOrganizacion, @Named("agente") String agente){
        cns.agregarOrganizacion(nombreOrganizacion,agente);
    }

    @Then("se debe crear la cuenta con el cliente <primer_nombre> <primer_apellido> persona natural")
    public void assertCrearNuevaCuentaPersonaNatural(@Named("primer_apellido")String primerApellido, @Named("primer_nombre")String primerNombre){
        cns.verificarCrearCuenta(primerNombre+" "+primerApellido);
    }

    /**
     * Escenario 2
     */
    @Given("me ecnuentro en Policy Center")
    public void validarLogeoPolicyCenter(){
        cns.validarLogeoPolicyCenter();
    }

    @When("quiera crear una cuenta para un contacto persona juridica e ingrese nit, tipo de documento <tipo_documento>")
    public void crearCuentaNuevaPersonaJuridica(@Named("tipo_documento")String tipoDocumento){
        cns.abrirNuevaCuenta();
        cns.agregarTipoDocumento(tipoDocumento);
    }

    @When("nombre empresa <razon_social>")
    public void agregarRazonSocial(@Named("razon_social")String razonSocial){
        cns.agregarRazonSocial(razonSocial);
    }

    @Then("se debe crear la cuenta con el cliente <razon_social> persona juridica")
    public void assertCrearNuevaCuentaPersonaJuridica(@Named("razon_social")String razonSocial){
        cns.verificarCrearCuenta(razonSocial);
    }

    /**
     * Escenario 3
     */
    @Given("que un contacto ya tiene una cuenta creada")
    public  void verificarCuentaCreada(){
        cns.validarLogeoPolicyCenter();
    }

    @Then("No debe permitir crear una nueva cuenta y debe mostrar el mensaje <mensaje> y <mensaje2>")
    public void assertVerificarMensaje(@Named("mensaje")String mensaje){
        cns.verificarMensaje(mensaje);
        cns.verificarEdadMenor(mensaje);
    }
}
