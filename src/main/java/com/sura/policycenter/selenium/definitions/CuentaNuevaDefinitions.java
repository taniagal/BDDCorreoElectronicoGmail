package com.sura.policycenter.selenium.definitions;

import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.CuentaNuevaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

@SuppressWarnings("WeakerAccess")
public class CuentaNuevaDefinitions {
    @Steps
    private SeusLoginSteps seusLogin;
    @Steps
    private CuentaNuevaSteps cns;


    /**
     * ESCENARIO 1
     */
    @Given("que me encuentro en el sistema de policy center")
    public void login() {
        seusLogin.login();
    }

    @When("quiera crear una cuenta para un contacto persona natural e ingrese documento, tipo de documento <tipo_documento>")
    public void crearCuentaNuevaPersonaNatural(@Named("tipo_documento")String tipoDocumento){
        cns.abrir_nueva_cuenta();
        cns.agregar_tipo_documento(tipoDocumento);
    }

    @When("fecha de nacimiento <fecha_nacimiento> Primer nombre <primer_nombre>,primer apellido <primer_apellido>")
    public void agregarNombres(@Named("fecha_nacimiento")String fechaNacimiento,@Named("primer_nombre")String primerNombre,
                                       @Named("primer_apellido")String primerApellido){
        cns.agregar_nombre(primerNombre,primerApellido,fechaNacimiento);
    }

    @When("tipo de direccion <tipo_direccion>, direccion <direccion>, departamento <departamento>, ciudad <ciudad>")
    public void agregarDireccion( @Named("tipo_direccion")String tipoDireccion, @Named("direccion")String direccion,
                                  @Named("departamento")String departamento,@Named("ciudad")String ciudad){
        cns.agregar_direccion(tipoDireccion,direccion,departamento,ciudad);
    }
    @When("nombre de organizacion <nombre_organizacion> <agente>")
    public void agregarOrganizacion( @Named("nombre_organizacion")String nombreOrganizacion, @Named("agente") String agente){
        cns.agregar_organizacion(nombreOrganizacion,agente);
    }

    @Then("se debe crear la cuenta con el cliente <primer_nombre> <primer_apellido> persona natural")
    public void assertCrearNuevaCuentaPersonaNatural(@Named("primer_apellido")String primerApellido, @Named("primer_nombre")String primerNombre){
        cns.verificar_cuenta(primerNombre);
    }


    /**
     * ESCENARIO 2
     */
    @Given("me ecnuentro en Policy Center")
    public void validarLogeoPolicyCenter(){
        cns.validar_logeo_policyCenter();
    }

    @When("quiera crear una cuenta para un contacto persona juridica e ingrese nit, tipo de documento <tipo_documento>")
    public void crearCuentaNuevaPersonaJuridica(@Named("tipo_documento")String tipoDocumento){
        cns.abrir_nueva_cuenta();
        cns.agregar_tipo_documento(tipoDocumento);
    }

    @When("nombre empresa <razon_social>")
    public void agregarRazonSocial(@Named("razon_social")String razonSocial){
        cns.agregar_razon_social(razonSocial);
    }

    @Then("se debe crear la cuenta con el cliente <razon_social> persona juridica")
    public void assertCrearNuevaCuentaPersonaJuridica(@Named("razon_social")String razonSocial){
        cns.verificar_cuenta(razonSocial);
    }

    /**
     * ESCENARIO 3
     */
    @Given("que un contacto ya tiene una cuenta creada")
    public  void verificarCuentaCreada(){
        cns.validar_logeo_policyCenter();
    }

    @Then("No debe permitir crear una nueva cuenta y debe mostrar el mensaje <mensaje> y <mensaje2>")
    public void verificarMensaje(@Named("mensaje")String mensaje){
        cns.verificar_mensaje(mensaje);
        cns.verificar_edad_menor(mensaje);
    }
}
