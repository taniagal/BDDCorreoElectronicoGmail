package com.sura.policycenter.selenium.definitions;

import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.CrearNuevaCuentaSteps;
import net.thucydides.core.annotations.*;
import org.jbehave.core.annotations.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class CrearCuentaNuevaDefinitions {
    @Steps
    SeusLoginSteps seusLogin;

    @Steps
    CrearNuevaCuentaSteps cns;


    @Given("que me encuentro en el sistema de policy center")
    public void login() {
        seusLogin.login();
    }


    @When("Quiera crear una cuenta para un contacto persona natural e ingrese la informacion en los campos tipo de\n" +
            "documento <tipo_documento>, fecha de nacimiento <fecha_nacimiento> Primer nombre <primer_nombre>,\n" +
            "primer apellido <primer_apellido>, tipo de direccion <tipo_direccion>, direccion <direccion>,\n" +
            " codigo postal <codigo_postal> y nombre de organizacion <nombre_organizacion>")
    public void whenCrearNuevaCuentaPersonaNatural(@Named("tipo_documento")String tipoDocumento, @Named("fecha_nacimiento")String fechaNacimiento,
                            @Named("primer_nombre")String primerNombre, @Named("primer_apellido")String primerApellido,
                            @Named("tipo_direccion")String tipoDireccion, @Named("direccion")String direccion,
                            @Named("codigo_postal")String codigoPostal, @Named("nombre_organizacion")String nombreOrganizacion) {
        cns.abrirNuevaCuenta();
        cns.crearNuevaCuentaPersona ( tipoDocumento,fechaNacimiento, primerNombre, primerApellido, tipoDireccion,
                direccion,codigoPostal,nombreOrganizacion);
    }

    @Then("se debe crear la cuenta con el cliente <primer_nombre> <primer_apellido> persona natural")
    public void assertCrearNuevaCuentaPersonaNatural(@Named("primer_apellido")String primerApellido, @Named("primer_nombre")String primerNombre){
        cns.assertCrearCuenta(primerNombre+" "+primerApellido);
    }


    //------Escenario 2
    @Given("Me ecnuentro en Policy Center")
    public void assertPolicyCenterLogin(){
        cns.assertPolicyCenterLogin();
    }

    @When("Quiera crear una cuenta para una persona juridica e ingrese la informacion en los campos\n" +
            "nombre empresa <nombre_empresa>, tipo de documento <tipo_documento>,tipo de direccion <tipo_direccion>,\n" +
            " direccion <direccion>,codigo postal <codigo_postal> y nombre de organizacion <nombre_organizacion>")
    public void whenCrearNuevaCuentaPersonaJuridica(@Named("tipo_documento")String tipoDocumento, @Named("nombre_empresa")String nombreEmpresa,
                                                    @Named("tipo_direccion")String tipoDireccion, @Named("direccion")String direccion,
                                                    @Named("codigo_postal")String codigoPostal,@Named("nombre_organizacion")String nombreOrganizacion) {
        cns.abrirNuevaCuenta();
        cns.crearNuevaCuentaPersonaJuridica ( tipoDocumento,nombreEmpresa, tipoDireccion,
                direccion,codigoPostal,nombreOrganizacion);
    }

    @Then("se debe crear la cuenta con el cliente <nombre_empresa> persona juridica")
    public void assertCrearNuevaCuentaPersonaJuridica(@Named("nombre_empresa")String nombreEmpresa){
        cns.assertCrearCuenta(nombreEmpresa);
    }


    // ----- Escenario 3
    @Given("Que un cliente ya tiene una cuenta creada")
    public  void verificarCuentaCreada(){
        cns.assertPolicyCenterLogin();
    }

    @When("Quiero crear una cuenta adicional para alguno de los tipos de personas (natural) e ingrese la informacion en los campos tipo de\n" +
            "documento <tipo_documento>, fecha de nacimiento <fecha_nacimiento> Primer nombre <primer_nombre>,\n" +
            "primer apellido <primer_apellido>, tipo de direccion <tipo_direccion>, direccion <direccion>,\n" +
            "codigo postal <codigo_postal> y nombre de organizacion <nombre_organizacion>")
    public void entrarPaginaCrearNuevaCuentaNatural(@Named("tipo_documento")String tipoDocumento, @Named("fecha_nacimiento")String fechaNacimiento,
                                                    @Named("primer_nombre")String primerNombre, @Named("primer_apellido")String primerApellido,
                                                    @Named("tipo_direccion")String tipoDireccion, @Named("direccion")String direccion,
                                                    @Named("codigo_postal")String codigoPostal, @Named("nombre_organizacion")String nombreOrganizacion){
        cns.abrirNuevaCuenta();
        cns.crearNuevaCuentaPersona2(tipoDocumento, fechaNacimiento, primerNombre, primerApellido, tipoDireccion,direccion,
                codigoPostal,nombreOrganizacion);
    }

    @Then("No debe permitir crear una nueva cuenta y debe mostrar el mensaje <mensaje>")
    public void assertVerificarMensaje(@Named("mensaje")String mensaje){
        //cns.assertVerificarMensaje(mensaje);
    }


    // ------ Escenario 4
    @When("Quiera crear una cuenta para un contacto persona natural menor de edad con fecha de nacimiento <fecha_nacimineto>,\n" +
            "e ingrese la informacion en los campos tipo de documento <tipo_documento>,Primer nombre <primer_nombre>,\n" +
            "primer apellido <primer_apellido>, tipo de direccion <tipo_direccion> y direccion <direccion>. codigo postal\n" +
            " <codigo_postal> y nombre de organizacion <nombre_organizacion>")
    public void whenCrearNuevaPersonaMenor(@Named("codigo_postal")String codigoPostal,@Named("tipo_documento")String tipoDocumento,
                                           @Named("primer_nombre")String primerNombre,@Named("primer_apellido")String primerApellido,
                                           @Named("tipo_direccion")String tipoDireccion,@Named("direccion")String direccion,
                                           @Named("nombre_organizacion")String nombreOrganizacion){
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        String fechaActual = dateFormat.format(date);
        cns.abrirNuevaCuenta();
        cns.crearNuevaCuentaPersona2(tipoDocumento,fechaActual, primerNombre, primerApellido, tipoDireccion,direccion,codigoPostal,nombreOrganizacion);
    }

    @Then("No me debe permitir crear la cuenta y debe mostrar el mensaje <mensaje>")
    public void assertVerificarMenor(@Named("mensaje")String mensaje){
        //cns.assertVerificarMenor(mensaje);
    }
}
