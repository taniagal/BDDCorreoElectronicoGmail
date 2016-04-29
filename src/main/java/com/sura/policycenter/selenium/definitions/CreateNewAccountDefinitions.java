package com.sura.policycenter.selenium.definitions;

import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.CrearNuevaCuentaSteps;
import com.sura.policycenter.selenium.steps.PolicySteps;
import net.thucydides.core.annotations.*;
import org.jbehave.core.annotations.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by criscaor on 2016/04/25.
 */
public class CreateNewAccountDefinitions {

    @Steps
    SeusLoginSteps seusLogin;

    @Steps
    CrearNuevaCuentaSteps cns;

    @Steps
    PolicySteps pcs;



    @Given("que me encuentro en el sistema de policy center como usuario <user> , contrasena <pass> y Pais <country>")
    public void login(@Named("user") String usuario, @Named("pass") String contrasenia, @Named("country")String pais) {
        seusLogin.login();
        //pcs.login(usuario, contrasenia);
    }


    @When("Quiera crear una cuenta para un contacto persona natural e ingrese la informacion en los campos tipo de\n" +
            "documento <tipo_documento>, numero de documento <documento>, fecha de nacimiento <fecha_nacimiento> Primer nombre <primer_nombre>,\n" +
            "primer apellido <primer_apellido>, tipo de direccion <tipo_direccion>, direccion <direccion>, ciudad <ciudad>,\n" +
            "estado <estado>, codigo postal <codigo_postal> y nombre de organizacion <nombre_organizacion>")
    public void whenCrearNuevaCuentaPersonaNatural(@Named("tipo_documento")String tipoDocumento, @Named("documento")String documento, @Named("fecha_nacimiento")String fechaNacimiento,
                            @Named("primer_nombre")String primerNombre, @Named("primer_apellido")String primerApellido,
                            @Named("tipo_direccion")String tipoDireccion, @Named("direccion")String direccion,
                             @Named("ciudad")String ciudad,@Named("estado")String estado,
                             @Named("codigo_postal")String codigoPostal, @Named("nombre_organizacion")String nombreOrganizacion) {


        cns.abrirNuevaCuenta();
        cns.crearNuevaCuentaPersona ( tipoDocumento, documento, fechaNacimiento, primerNombre, primerApellido, tipoDireccion,
                direccion,ciudad,estado,codigoPostal,nombreOrganizacion);
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
            "nombre empresa <nombre_empresa>, tipo de documento <tipo_documento>, numero de documento <documento>,\n" +
            "tipo de direccion <tipo_direccion>, direccion <direccion>, ciudad <ciudad>, estado <estado>,\n" +
            "codigo postal <codigo_postal> y nombre de organizacion <nombre_organizacion>")
    public void whenCrearNuevaCuentaPersonaJuridica(@Named("tipo_documento")String tipoDocumento, @Named("documento")String documento,
                                 @Named("nombre_empresa")String nombreEmpresa, @Named("tipo_direccion")String tipoDireccion,
                                  @Named("direccion")String direccion, @Named("ciudad")String ciudad,
                                  @Named("estado")String estado, @Named("codigo_postal")String codigoPostal,
                                  @Named("nombre_organizacion")String nombreOrganizacion) {

        cns.abrirNuevaCuenta();
        cns.crearNuevaCuentaPersonaJuridica ( tipoDocumento, documento, nombreEmpresa, tipoDireccion,
                direccion,ciudad,estado,codigoPostal,nombreOrganizacion);
    }

    @Then("se debe crear la cuenta con el cliente <nombre_empresa> persona juridica")
    public void assertCrearNuevaCuentaPersonaJuridica(@Named("nombre_empresa")String nombreEmpresa){
        cns.assertCrearCuenta(nombreEmpresa);
    }


    // ----- Escenario 3
    @Given("Que un cliente ya tiene una cuenta creada con tipo de documento <tipo_documento> y documento <documento>")
    public  void verificarCuentaCreada(@Named("tipo_documento")String tipoDocumento, @Named("documento")String documento){
        cns.assertPolicyCenterLogin();
    }

    @When("Quiero crear una cuenta adicional para alguno de los tipos de personas (natural) e ingrese la informacion en los campos tipo de\n" +
            "documento <tipo_documento>, numero de documento <documento>, fecha de nacimiento <fecha_nacimiento> Primer nombre <primer_nombre>,\n" +
            "primer apellido <primer_apellido>, tipo de direccion <tipo_direccion>, direccion <direccion>, ciudad <ciudad>,\n" +
            "estado <estado>, codigo postal <codigo_postal> y nombre de organizacion <nombre_organizacion>")
    public void entrarPaginaCrearNuevaCuentaNatural(@Named("tipo_documento")String tipoDocumento, @Named("documento")String documento, @Named("fecha_nacimiento")String fechaNacimiento,
                                                    @Named("primer_nombre")String primerNombre, @Named("primer_apellido")String primerApellido,
                                                    @Named("tipo_direccion")String tipoDireccion, @Named("direccion")String direccion,
                                                    @Named("ciudad")String ciudad,@Named("estado")String estado,
                                                    @Named("codigo_postal")String codigoPostal, @Named("nombre_organizacion")String nombreOrganizacion){
        cns.abrirNuevaCuenta();
        cns.crearNuevaCuentaPersona2(tipoDocumento, documento, fechaNacimiento, primerNombre, primerApellido, tipoDireccion,
                direccion,ciudad,estado,codigoPostal,nombreOrganizacion);
    }

    @Then("No debe permitir crear una nueva cuenta y debe mostrar el mensaje <mensaje>")
    public void assertVerificarMensaje(@Named("mensaje")String mensaje){
        cns.assertVerificarMensaje(mensaje);
    }


    // ------ Escenario 4

    @When("Quiera crear una cuenta para un contacto persona natural menor de edad con fecha de nacimiento <fecha_nacimineto>,\n" +
            "e ingrese la informacion en los campos tipo de documento <tipo_documento>, numero de documento <documento>,\n" +
            "Primer nombre <primer_nombre>, primer apellido <primer_apellido>, tipo de direccion <tipo_direccion> y direccion <direccion>.\n" +
            "ciudad <ciudad>, estado <estado>, codigo postal <codigo_postal> y nombre de organizacion <nombre_organizacion>")
    public void whenCrearNuevaPersonaMenor(@Named("fecha_nacimiento")String fechaNacimiento, @Named("codigo_postal")String codigoPostal,
                                           @Named("tipo_documento")String tipoDocumento, @Named("documento")String documento,
                                           @Named("primer_nombre")String primerNombre, @Named("primer_apellido")String primerApellido,
                                           @Named("tipo_direccion")String tipoDireccion, @Named("direccion")String direccion,
                                           @Named("ciudad")String ciudad,@Named("estado")String estado,
                                           @Named("nombre_organizacion")String nombreOrganizacion){
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        String fechaActual = dateFormat.format(date);
        cns.abrirNuevaCuenta();
        cns.crearNuevaCuentaPersona2(tipoDocumento, documento, fechaActual, primerNombre, primerApellido, tipoDireccion,
                direccion,ciudad,estado,codigoPostal,nombreOrganizacion);

    }

    @Then("No me debe permitir crear la cuenta y debe mostrar el mensaje <mensaje>")
    public void assertVerificarMenor(@Named("mensaje")String mensaje){
        cns.assertVerificarMenor(mensaje);
    }

}
