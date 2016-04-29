package com.sura.policycenter.selenium.definitions;

import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.BusquedaContactoSteps;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;

/**
 * Created by jhonvebz on 25/04/2016.
 */
public class BusquedaContactoDefinitions {

    @Steps
    SeusLoginSteps seusLoginSteps;

    @Steps
    BusquedaContactoSteps buscarContactoSteps;

    @Given("estoy en busqueda de contactos")
    public void givenEstoyEnBusquedaContactos() {
        buscarContactoSteps.accionarBuscarContacto();
    }

    @When("quiera consultar contacto de tipo persona natural por <primerNombre> y <primerApellido>")
    public void whenConsultoPorPrimerNombreYPrimerApellido(@Named("primerNombre") String primerNombre,
                                                                           @Named("primerApellido") String primerApellido) {
        buscarContactoSteps.buscarContactoPorPrimerNombreYPrimerApellidoSinVerDetalles(primerNombre, primerApellido);
    }

    @Then("debo ver la información del contacto de tipo persona natural <tipoIdentificacion>, <numeroIdentificacion>, <primerNombre>, <segundoNombre>, <primerApellido>, <segundoApellido>, <direccion>, <telefono>, <email>, <external>")
    @Pending
    public void thenVerResultadoTipoPersonaNatural() {

    }

    @When("quiera consultar contacto de tipo persona natural por <tipoIdentificacion> y <numeroIdentificacion>")
    @Pending
    public void whenIndiqueElCriterioDeBusquedaTipoYNroIdentificacion(@Named("tipoIdentificacion") String tipoIdentificacion,
                                                                      @Named("numeroIdentificacion") String numeroIdentificacion) {
        buscarContactoSteps.buscarContactoPorTipoYNroIdentificacion(tipoIdentificacion, numeroIdentificacion);
    }

    @When("quiera consultar contacto de tipo persona juridica por <razonSocial>")
    public void whenConsultarPersonaJuridaPorRazonSocial(@Named("razonSocial") String razonSocial) {
        buscarContactoSteps.consultarPersonaJuridaPorRazonSocial(razonSocial);
    }

    @Then("debo ver la informacion del contacto de tipo persona juridica <tipoIdentificacion>, <numeroIdentificacion>, <razonSocial>, <nombreComercial>, <direccion>, <telefono>, <email>, <external>")
    @Pending
    public void thenVerInformacionPersonaJuridica() {
        buscarContactoSteps.verInformacionPersonaJuridica();
    }
}