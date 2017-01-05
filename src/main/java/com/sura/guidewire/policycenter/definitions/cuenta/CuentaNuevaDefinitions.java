package com.sura.guidewire.policycenter.definitions.cuenta;

import com.sura.guidewire.policycenter.steps.cuenta.CuentaNuevaSteps;
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
        cuentaNuevaSteps.abrirNuevaCuenta();
        cuentaNuevaSteps.agregarTipoDocumento(tipoDocumento, "");
    }

    @When("fecha de nacimiento <fecha_nacimiento> Primer nombre <primer_nombre>,primer apellido <primer_apellido>")
    public void agregarNombres(@Named("fecha_nacimiento")String fechaNacimiento,@Named("primer_nombre")String primerNombre,
                                       @Named("primer_apellido")String primerApellido){
        cuentaNuevaSteps.agregarNombre(primerNombre,primerApellido,fechaNacimiento);
    }

    @When("ingrese los datos de direccion: $datos")
    public void agregarDireccion(ExamplesTable datos){
        cuentaNuevaSteps.agregarDireccion(datos);
    }
    @When("nombre de organizacion <nombre_organizacion> <agente>")
    public void agregarOrganizacion( @Named("nombre_organizacion")String nombreOrganizacion, @Named("agente") String agente){
        cuentaNuevaSteps.agregarOrganizacion(nombreOrganizacion,agente);
    }

    @Then("se debe crear la cuenta con el cliente <primer_nombre> <primer_apellido> persona natural")
    public void assertCrearNuevaCuentaPersonaNatural(@Named("primer_apellido")String primerApellido, @Named("primer_nombre")String primerNombre){
        cuentaNuevaSteps.verificarCuenta(primerNombre);
    }


    /**
     * ESCENARIO 2
     */
    @When("quiera crear una cuenta para un contacto persona juridica e ingrese nit, tipo de documento <tipo_documento>")
    public void crearCuentaNuevaPersonaJuridica(@Named("tipo_documento")String tipoDocumento){
        cuentaNuevaSteps.abrirNuevaCuenta();
        cuentaNuevaSteps.agregarTipoDocumento(tipoDocumento, "");
    }

    @When("nombre empresa <razon_social>")
    public void agregarRazonSocial(@Named("razon_social")String razonSocial){
        cuentaNuevaSteps.agregarRazonSocial(razonSocial);
    }

    @Then("se debe crear la cuenta con el cliente <razon_social> persona juridica")
    public void assertCrearNuevaCuentaPersonaJuridica(@Named("razon_social")String razonSocial){
        cuentaNuevaSteps.verificarCuenta(razonSocial);
    }

    /**
     * ESCENARIO 3
     */
    @Then("No debe permitir crear una nueva cuenta y debe mostrar el mensaje <mensaje>")
    public void verificarMensaje(@Named("mensaje")String mensaje){
        cuentaNuevaSteps.verificarMensaje(mensaje);
    }
}
