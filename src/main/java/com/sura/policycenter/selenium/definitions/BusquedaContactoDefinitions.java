package com.sura.policycenter.selenium.definitions;

import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.BusquedaContactoSteps;
import com.sura.policycenter.selenium.steps.PolicySteps;
import net.thucydides.core.annotations.*;
import org.bytedeco.javacpp.annotation.Name;
import org.jbehave.core.annotations.*;
import org.jbehave.core.annotations.Pending;
import org.joda.time.chrono.StrictChronology;

/**
 * Created by jhonvebz on 25/04/2016.
 */
public class BusquedaContactoDefinitions {

    //DC
    @Steps
    PolicySteps pcs;

    @Steps
    SeusLoginSteps seusLoginSteps;

    @Steps
    BusquedaContactoSteps buscarContactoSteps;

    @Given("estoy en busqueda de contactos")
    public void givenEstoyEnBusquedaContactos() {
        buscarContactoSteps.accionarBuscarContacto();
    }

    @When("quiera consultar contacto de tipo persona natural <tipoDoc> por <primerNombre> y <primerApellido>")
    public void whenConsultoPorPrimerNombreYPrimerApellido(@Named("tipoDoc") String tipoDoc,
                                                           @Named("primerNombre") String primerNombre,
                                                           @Named("primerApellido") String primerApellido) {
        buscarContactoSteps.consultarContactoPorNombresYApellidos(tipoDoc, primerNombre, "", primerApellido, "");
    }

    @When("quiera consultar contacto de tipo persona juridica <tipoDoc> por <razonSocial>")
    public void whenConsultarPersonaJuridaPorRazonSocial(@Named("tipoDoc") String tipoDoc, @Named("razonSocial") String razonSocial) {
        buscarContactoSteps.consultarPersonaJuridaPorRazonSocial(tipoDoc, razonSocial);
    }

    @When("quiera consultar contacto de tipo persona juridica <tipoDoc> sin ingresar ningun filtro")
    public void whenConsultarPersonaJuridicaSinFiltros(@Named("tipoDoc") String tipoDoc) {
        buscarContactoSteps.consultarContactoTipoDoc(tipoDoc);
    }

    @Then("no debo ver la informacion del contacto de tipo persona juridica")
    public void thenValidarInformacionPersonaJuridica(){
        buscarContactoSteps.validarInformacionTipoId();
    }

    @Then("debo ver un <mensaje> de alerta indicando que es necesario ingresar algun criterio de busqueda")
    public void thenValidarMensaje(@Named("mensaje") String mensaje){

        buscarContactoSteps.validarMensaje(mensaje);
        seusLoginSteps.logout();
        seusLoginSteps.close();
    }

    @When("quiera consultar contacto de tipo persona juridica <tipoDoc> por numero de documento <numDoc>")
    public void whenConsultarPersonaJuridicaNumDoc(@Named("tipoDoc") String tipoDoc, @Named("numDoc") String numDoc){
        buscarContactoSteps.consultarContactoTipoNumDoc(tipoDoc, numDoc);
    }

    @Then("debo ver un <mensaje> de alerta indicando que es necesario ingresar tipo y numero de documento")
    public void thenValidarMensajeTipoNumDoc(@Named("mensaje") String mensaje) {
        buscarContactoSteps.validarMensaje(mensaje);
        seusLoginSteps.logout();
        seusLoginSteps.close();
    }

    @When("quiera consultar contacto de tipo persona juridica por tipo de documento <tipoDoc>")
    public void whenConsultarPersonaJuridicaTipoDoc(@Named("tipoDoc") String tipoDoc) {
        buscarContactoSteps.consultarContactoTipoNumDoc(tipoDoc, "");
    }

    @When("quiera consultar contacto de tipo persona juridica por tipo <tipoDoc> y numero de identificacion <numDoc>")
    public void whenConsultarPersonaJuridicaTipoNumDoc(@Named("tipoDoc") String tipoDoc, @Named("numDoc") String numDoc) {
        buscarContactoSteps.consultarContactoTipoNumDoc(tipoDoc, numDoc);
    }

    @When("quiera consultar contacto de tipo persona natural por tipo <tipoDoc> y numero de identificacion <numDoc>")
    public void whenConsultarPersNatTipoNumId(@Named("tipoDoc") String tipoDoc, @Named("numDoc") String numDoc) {
        buscarContactoSteps.consultarContactoTipoNumDoc(tipoDoc, numDoc);
    }

    @When("quiera consultar contacto de tipo persona natural por tipo de documento <tipoDoc>")
    public void whenConsultarPersNatTipoDoc(@Named("tipoDoc") String tipoDoc){
        buscarContactoSteps.consultarContactoTipoNumDoc(tipoDoc, "");
    }

    @Then("no debo ver la informacion del contacto de tipo persona natural")
    public void thenValidarInfoPersonaNatural() {
        buscarContactoSteps.validarInformacionTipoId();
    }

    @When("quiera consultar contacto de tipo persona natural <tipoDoc> por numero de documento <numDoc>")
    public void whenConsultarPersNatNumDoc(@Named("tipoDoc") String tipoDoc, @Named("numDoc") String numDoc) {
        buscarContactoSteps.consultarContactoTipoNumDoc(tipoDoc, numDoc);
    }

    @When("quiera consultar contacto de tipo persona natural <tipoDoc> por segundo nombre <segNombre> y segundo apellido <segApellido>")
    public void whenConsultarPersNatSegNombSegApel(@Named("tipoDoc") String tipoDoc,
                                                   @Named("seg_nombre") String segNombre,
                                                   @Named("seg_apellido") String segApellido) {
        buscarContactoSteps.consultarContactoPorNombresYApellidos(tipoDoc, "", segNombre, "", segApellido);
    }

    @When("quiera consultar contacto de tipo persona natural <tipoDoc> por segundo nombre <segundoNombre>")
    public void whenConsultarContactoSegundoNombre(@Named("tipoDoc") String tipoDoc, @Named("segundoNombre") String segundoNombre) {
        buscarContactoSteps.consultarContactoPorNombresYApellidos(tipoDoc, "", segundoNombre, "", "");
    }

    @When("quiera consultar contacto de tipo persona natural <tipoDoc> por primer apellido <primerApellido>")
    public void whenConsultarContactoPrimerApellido(@Named("tipoDoc") String tipoDoc, @Named("primerApellido") String primerApellido) {
        buscarContactoSteps.consultarContactoPorNombresYApellidos(tipoDoc, "", "", primerApellido, "");
    }

    @When("quiera consultar contacto de tipo persona natural <tipoDoc> por segundo apellido <segundoApellido>")
    public void whenConsultarContactoSegundoApellido(@Named("tipoDoc") String tipoDoc, @Named("segundoApellido") String segundoApellido) {
        buscarContactoSteps.consultarContactoPorNombresYApellidos(tipoDoc, "", "", "", segundoApellido);
    }

    @When("quiera consultar contacto de tipo persona natural <tipoDoc> por primer nombre <primerNombre>")
    public void whenConsultarContactoPrimerNombre(@Named("tipoDoc") String tipoDoc,
                                                  @Named("primerNombre") String primerNombre) {
        buscarContactoSteps.consultarContactoPorNombresYApellidos(tipoDoc, primerNombre, "", "", "");
    }

    @When("quiera consultar contacto de tipo persona natural <tipoDoc> por primer nombre <primerNombre> y segundo apellido <segundoApellido>")
    public void whenConsultarContactoPrimerNomSegApel(@Named("tipoDoc") String tipoDoc,
                                                      @Named("primerNombre") String primerNombre,
                                                      @Named("segundoApellido") String segundoApellido) {
        buscarContactoSteps.consultarContactoPorNombresYApellidos(tipoDoc, primerNombre, "", "", segundoApellido);
    }

    @When("quiera consultar contacto de tipo persona natural <tipoDoc> por segundo nombre <segundoNombre> y primer apellido <primerApellido>")
    public void whenConsultarContactoSegNomPrimerApel(@Named("tipoDoc") String tipoDoc,
                                                      @Named("segundoNombre") String segundoNombre,
                                                      @Named("primerApelludo") String primerApellido){
        buscarContactoSteps.consultarContactoPorNombresYApellidos(tipoDoc, "", segundoNombre, primerApellido, "");
    }

    @Then("debo ver un mensaje <mensaje> de alerta indicando que se debe ingresar al menos dos de los campos incluido un nombre")
    public void thenValidarMensajeNombre(@Named("mensaje") String mensaje) {
        buscarContactoSteps.validarMensaje(mensaje);
        seusLoginSteps.logout();
        seusLoginSteps.close();
    }

    @When("quiera consultar contacto de tipo persona juridica <tipoDoc> por nombre comercial <nombreComercial>")
    public void whenConsultarContactoNombreComercial(@Named("tipoDoc") String tipoDoc, @Named("nombreComercial") String nombreComercial) {
        buscarContactoSteps.consultarContactoNombreComercial(tipoDoc, nombreComercial);
    }

    @Then("debo ver la informacion del contacto de tipo persona natural")
    public void thenVerInfoPersonaNatural() {
        //buscarContactoSteps.verInfoPersonaNatural();
        seusLoginSteps.logout();
        seusLoginSteps.close();
    }

    @Then("debo ver la informacion del contacto de tipo persona juridica")
    public void thenVerInfoPersonaJuridica(){
        //buscarContactoSteps.verInfoPersonaJuridica();
        seusLoginSteps.logout();
        seusLoginSteps.close();
    }
}