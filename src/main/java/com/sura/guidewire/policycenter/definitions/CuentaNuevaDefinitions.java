package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.CuentaNuevaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

@SuppressWarnings("WeakerAccess")
public class CuentaNuevaDefinitions {
    @Steps
    private CuentaNuevaSteps cuentaNuevaSteps;


    /**
     * ESCENARIO 1
     */

    @When("quiera crear una cuenta para un contacto persona natural e ingrese documento, tipo de documento <tipo_documento>")
    public void crearCuentaNuevaPersonaNatural(@Named("tipo_documento")String tipoDocumento){
        cuentaNuevaSteps.abrir_nueva_cuenta();
        cuentaNuevaSteps.agregar_tipo_documento(tipoDocumento);
    }

    @When("fecha de nacimiento <fecha_nacimiento> Primer nombre <primer_nombre>,primer apellido <primer_apellido>")
    public void agregarNombres(@Named("fecha_nacimiento")String fechaNacimiento,@Named("primer_nombre")String primerNombre,
                                       @Named("primer_apellido")String primerApellido){
        cuentaNuevaSteps.agregar_nombre(primerNombre,primerApellido,fechaNacimiento);
    }

    @When("ingrese los datos de direccion: $datos")
    public void agregarDireccion(ExamplesTable datos){
        cuentaNuevaSteps.agregar_direccion(datos);
    }
    @When("nombre de organizacion <nombre_organizacion> <agente>")
    public void agregarOrganizacion( @Named("nombre_organizacion")String nombreOrganizacion, @Named("agente") String agente){
        cuentaNuevaSteps.agregar_organizacion(nombreOrganizacion,agente);
    }

    @Then("se debe crear la cuenta con el cliente <primer_nombre> <primer_apellido> persona natural")
    public void assertCrearNuevaCuentaPersonaNatural(@Named("primer_apellido")String primerApellido, @Named("primer_nombre")String primerNombre){
        cuentaNuevaSteps.verificar_cuenta(primerNombre);
    }


    /**
     * ESCENARIO 2
     */
    @When("quiera crear una cuenta para un contacto persona juridica e ingrese nit, tipo de documento <tipo_documento>")
    public void crearCuentaNuevaPersonaJuridica(@Named("tipo_documento")String tipoDocumento){
        cuentaNuevaSteps.abrir_nueva_cuenta();
        cuentaNuevaSteps.agregar_tipo_documento(tipoDocumento);
    }

    @When("nombre empresa <razon_social>")
    public void agregarRazonSocial(@Named("razon_social")String razonSocial){
        cuentaNuevaSteps.agregar_razon_social(razonSocial);
    }

    @Then("se debe crear la cuenta con el cliente <razon_social> persona juridica")
    public void assertCrearNuevaCuentaPersonaJuridica(@Named("razon_social")String razonSocial){
        cuentaNuevaSteps.verificar_cuenta(razonSocial);
    }

    /**
     * ESCENARIO 3
     */
    @Then("No debe permitir crear una nueva cuenta y debe mostrar el mensaje <mensaje> y <mensaje2>")
    public void verificarMensaje(@Named("mensaje")String mensaje){
        cuentaNuevaSteps.verificar_mensaje(mensaje);
        cuentaNuevaSteps.verificar_edad_menor(mensaje);
    }
}
