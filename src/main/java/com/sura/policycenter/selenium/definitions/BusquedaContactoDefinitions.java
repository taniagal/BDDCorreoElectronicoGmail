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

    //DC!!!
    @Given("que estoy autenticado en GW con usuario <usuario> y contrasena <contrasena>")
    public void givenLogin(@Named("usuario") String usuario, @Named("contrasena") String contrasena){
        pcs.open();
        pcs.login(usuario,contrasena);
    }

    @Given("estoy en busqueda de contactos")
    public void givenEstoyEnBusquedaContactos() {
        buscarContactoSteps.navegarBarraSuperior();
    }

    @When("quiera consultar contacto de tipo persona natural <tipoDoc> por nombre <nombre> y apellido <apellido>")
    public void whenConsultoPorNombreYApellido(@Named("tipoDoc") String tipoDoc,
                                                           @Named("nombre") String nombre,
                                                           @Named("apellido") String apellido) {
        buscarContactoSteps.consultarContactoPorNombresYApellidos(tipoDoc, nombre, apellido);
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
        //buscarContactoSteps.validarMensaje(mensaje);
        seusLoginSteps.logout();
        seusLoginSteps.close();
    }

    @When("quiera consultar contacto de tipo persona juridica <tipoDoc> por numero de documento <numDoc>")
    public void whenConsultarPersonaJuridicaNumDoc(@Named("tipoDoc") String tipoDoc, @Named("numDoc") String numDoc){
        buscarContactoSteps.consultarContactoTipoNumDoc(tipoDoc, numDoc);
    }

    @Then("debo ver un <mensaje> de alerta indicando que es necesario ingresar tipo y numero de documento")
    public void thenValidarMensajeTipoNumDoc(@Named("mensaje") String mensaje) {
        //buscarContactoSteps.validarMensaje(mensaje);
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

    @When("quiera consultar contacto de tipo persona natural <tipoDoc> por apellido <apellido>")
    public void whenConsultarContactoPrimerApellido(@Named("tipoDoc") String tipoDoc, @Named("apellido") String apellido) {
        buscarContactoSteps.consultarContactoPorNombresYApellidos(tipoDoc, "", apellido);
    }

    @When("quiera consultar contacto de tipo persona natural <tipoDoc> por nombre <nombre>")
    public void whenConsultarContactoPorNombre(@Named("tipoDoc") String tipoDoc,
                                               @Named("nombre") String nombre) {
        buscarContactoSteps.consultarContactoPorNombresYApellidos(tipoDoc, nombre, "");
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
        buscarContactoSteps.verInfoPersonaNatural();
        seusLoginSteps.logout();
        seusLoginSteps.close();
    }

    @Then("debo ver la informacion del contacto de tipo persona juridica")
    public void thenVerInfoPersonaJuridica(){
        buscarContactoSteps.verInfoPersonaJuridica();
        seusLoginSteps.logout();
        seusLoginSteps.close();
    }
}