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

    @Given("estoy en GW <usuario> <contrasena>")
    public void loginGW(@Named("usuario") String usuario, @Named("contrasena") String contrasena) {
        buscarContactoSteps.login(usuario, contrasena);
    }
    //////

    @Given("estoy en busqueda de contactos")
    public void givenEstoyEnBusquedaContactos() {
        buscarContactoSteps.navegarBarraSuperior("Buscar", "Contactos", "");
    }

    @Given("estoy en contactos para buscar")
    public void givenContactosBuscar(@Named("usuario") String usuario, @Named("contrasena") String contrasena){
        buscarContactoSteps.navegarBarraSuperior("Contacto", "Buscar", "");
    }

    @When("quiera consultar contacto de tipo persona natural <tipoDoc> por nombre <nombre> y apellido <apellido>")
    public void whenConsultoPorNombreYApellido(@Named("tipoDoc") String tipoDoc,
                                                           @Named("nombre") String nombre,
                                                           @Named("apellido") String apellido) {
        buscarContactoSteps.consultarContactoPorNombresYApellidos(tipoDoc, nombre, "", apellido, "");
    }

    @When("quiera consultar contacto de tipo persona juridica <tipoDoc> por razon social <razonSocial>")
    public void whenConsultarPersonaJuridaPorRazonSocial(@Named("tipoDoc") String tipoDoc, @Named("razonSocial") String razonSocial) {
        buscarContactoSteps.consultarPersonaJuridaPorRazonSocial(tipoDoc, razonSocial);
    }

    @When("quiera consultar contacto de tipo persona juridica <tipoDoc> sin ingresar ningun filtro")
    public void whenConsultarPersonaJuridicaSinFiltros(@Named("tipoDoc") String tipoDoc) {
        buscarContactoSteps.consultarContactoTipoDoc(tipoDoc);
    }

    @When("quiera consultar contacto de tipo persona juridica <tipoDoc> por numero de documento <numDoc>")
    public void whenConsultarPersonaJuridicaNumDoc(@Named("tipoDoc") String tipoDoc, @Named("numDoc") String numDoc){
        buscarContactoSteps.consultarContactoTipoNumDoc(tipoDoc, numDoc);
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

    @When("quiera consultar contacto de tipo persona natural <tipoDoc> por numero de documento <numDoc>")
    public void whenConsultarPersNatNumDoc(@Named("tipoDoc") String tipoDoc, @Named("numDoc") String numDoc) {
        buscarContactoSteps.consultarContactoTipoNumDoc(tipoDoc, numDoc);
    }

    @When("quiera consultar contacto de tipo persona natural <tipoDoc> por apellido <apellido>")
    public void whenConsultarContactoPrimerApellido(@Named("tipoDoc") String tipoDoc, @Named("apellido") String apellido) {
        buscarContactoSteps.consultarContactoPorNombresYApellidos(tipoDoc, "", "", apellido, "");
    }

    @When("quiera consultar contacto de tipo persona natural <tipoDoc> por primer nombre <primerNombre>")
    public void whenConsultarContactoPorPrimerNombre(@Named("tipoDoc") String tipoDoc,
                                                     @Named("primerNombre") String primerNombre) {
        buscarContactoSteps.consultarContactoPorNombresYApellidos(tipoDoc, primerNombre, "", "", "");
    }

    @When("quiera consultar contacto de tipo persona natural <tipoDoc> por segundo nombre <segundoNombre>")
    public void whenConsultarContactoPorSegundoNombre(@Named("tipoDoc") String tipoDoc,
                                                      @Named("segundoNombre") String segundoNombre) {
        buscarContactoSteps.consultarContactoPorNombresYApellidos(tipoDoc, "", segundoNombre, "", "");
    }

    @When("quiera consultar contacto de tipo persona natural <tipoDoc> por primer apellido <primerApellido>")
    public void whenConsultarContactoPorPrimerApellido(@Named("tipoDoc") String tipoDoc,
                                                       @Named("primerApellido") String primerApellido) {
        buscarContactoSteps.consultarContactoPorNombresYApellidos(tipoDoc, "", "", primerApellido, "");
    }

    @When("quiera consultar contacto de tipo persona natural <tipoDoc> por segundo apellido <segundoApellido>")
    public void whenConsultarContactoPorsegundoApellido(@Named("tipoDoc") String tipoDoc,
                                                        @Named("segundoApellido") String segundoApellido) {
        buscarContactoSteps.consultarContactoPorNombresYApellidos(tipoDoc, "", "", "", segundoApellido);
    }

    @When("quiera consultar contacto de tipo persona natural <tipoDoc> por primer nombre <primerNombre> y primer apellido <primerApellido>")
    public void whenConsultarContactoPorPrimerNombreYApellido(@Named("tipoDoc") String tipoDoc,
                                                              @Named("primerNombre") String primerNombre,
                                                              @Named("primerApellido") String primerApellido) {
        buscarContactoSteps.consultarContactoPorNombresYApellidos(tipoDoc, primerNombre, "", primerApellido, "");
    }

    @When("quiera consultar contacto de tipo persona natural <tipoDoc> por segundo nombre <segundoNombre> y segundo apellido <segundoApellido>")
    public void whenConsultarContactoPorSegundoNombreYApellido(@Named("tipoDoc") String tipoDoc,
                                                               @Named("segundoNombre") String segundoNombre,
                                                               @Named("segundoApellido") String segundoApellido) {
        buscarContactoSteps.consultarContactoPorNombresYApellidos(tipoDoc, "", segundoNombre, "", segundoApellido);
    }

    @When("quiera consultar contacto de tipo persona natural <tipoDoc> por primer nombre <primerNombre> y segundo apellido <segundoApellido>")
    public void whenConsultarContactoPorPrimerNombreYSegApellido(@Named("tipoDoc") String tipoDoc,
                                                                 @Named("primerNombre") String primerNombre,
                                                                 @Named("segundoApellido") String segundoApellido) {
        buscarContactoSteps.consultarContactoPorNombresYApellidos(tipoDoc, primerNombre, "", "", segundoApellido);
    }

    @When("quiera consultar contacto de tipo persona natural <tipoDoc> por segundo nombre <segundoNombre> y primer apellido <primerApellido>")
    public void whenConsultarContactoPorSegundoNombreYPrimerApellido(@Named("tipoDoc") String tipoDoc,
                                                                     @Named("segundoNombre") String segundoNombre,
                                                                     @Named("primerApellido") String primerApellido) {
        buscarContactoSteps.consultarContactoPorNombresYApellidos(tipoDoc, "", segundoNombre, primerApellido, "");
    }

    @When("quiera consultar contacto de tipo persona natural <tipoDo> sin ingresar ningun filtro")
    public void whenConsultarPersonaNaturalSinFiltros(@Named("tipoDoc") String tipoDoc) {
        buscarContactoSteps.consultarContactoTipoDoc(tipoDoc);
    }

    @When("la longitud de alguno de ellos <primerNombre> <primerApellido> sea inferior a dos caracteres")
    public void whenValidarLongitudNombresYApellidos(@Named("primerNombre") String primerNombre, @Named("primerApellido") String primerApellido){
        buscarContactoSteps.validarLongitudPersonaNatural(primerNombre, "", primerApellido, "");
    }

    @When("la longitud de esta <nombreComercial> sea inferior a cuatro caracteres")
    public void whenValidarLongitudNombreCcial(@Named("nombreComercial") String nombreComercial){
        buscarContactoSteps.validarLongitudPersonaJuridica("", nombreComercial);
    }

    @When("la longitud de esta <razonSocial> sea inferior a cuatro caracteres")
    public void whenValidarLongitudRazonSocial(@Named("razonSocial") String razonSocial){
        buscarContactoSteps.validarLongitudPersonaJuridica(razonSocial, "");
    }

    @Then("no debo ver la informacion del contacto de tipo persona juridica")
    public void thenValidarInformacionPersonaJuridica()
    {
        buscarContactoSteps.validarInformacionTipoId();
    }

    @Then("debo ver un <mensaje> de alerta indicando que es necesario ingresar algun criterio de busqueda")
    public void thenValidarMensaje(@Named("mensaje") String mensaje){
        //buscarContactoSteps.validarMensaje(mensaje);
        seusLoginSteps.logout();
        seusLoginSteps.close();
    }

    @Then("debo ver un <mensaje> de alerta indicando que es necesario ingresar tipo y numero de documento")
    public void thenValidarMensajeTipoNumDoc(@Named("mensaje") String mensaje) {
        buscarContactoSteps.validarMensaje(mensaje);
        seusLoginSteps.logout();
        seusLoginSteps.close();
    }

    @Then("no debo ver la informacion del contacto de tipo persona natural")
    public void thenValidarInfoPersonaNatural() {
        buscarContactoSteps.validarInformacionTipoId();
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

    @Then("debo ver la informacion del contacto de tipo persona natural <filtro>")
    public void thenVerInfoPersonaNatural(@Named("filtro") String filtro) {
        buscarContactoSteps.verInfoPersonaNatural(filtro);
        seusLoginSteps.logout();
        seusLoginSteps.close();
    }

    @Then("debo ver la informacion del contacto de tipo persona juridica <filtro>")
    public void thenVerInfoPersonaJuridica(@Named("filtro") String filtro){
        buscarContactoSteps.verInfoPersonaJuridica(filtro);
        seusLoginSteps.logout();
        seusLoginSteps.close();
    }

    @Then("debo ver un <mensaje> de alerta indicando que la longitud debe ser mayor o igual dos caracteres")
    public void validarMensajeLongitudPersNat(@Named("mensaje") String mensaje){
        buscarContactoSteps.validarMensaje(mensaje);
        seusLoginSteps.logout();
        seusLoginSteps.close();
    }

    @Then("debo ver un <mensaje> de alerta indicando que la longitud debe ser mayor o igual a cuatro caracteres")
    public void validarMensajeLongitudPersJurid(@Named("mensaje") String mensaje){
        buscarContactoSteps.validarMensaje(mensaje);
        seusLoginSteps.logout();
        seusLoginSteps.close();
    }

}