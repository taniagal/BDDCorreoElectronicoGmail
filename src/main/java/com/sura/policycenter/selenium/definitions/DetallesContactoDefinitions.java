package com.sura.policycenter.selenium.definitions;

import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.CrearNuevoContactoSteps;
import com.sura.policycenter.selenium.steps.DetallesContactoSteps;
import com.sura.policycenter.selenium.steps.PolicySteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;

/**
 * Created by hectsaga on 2016/04/29.
 */
public class DetallesContactoDefinitions {

    @Steps
    SeusLoginSteps seusLogin;

    @Steps
    DetallesContactoSteps dcs;

    @Steps
    PolicySteps pcs;

    @Steps
    CrearNuevoContactoSteps ncs;

    /**
     * Escenario 1
     */

    @Given("Se tiene y se ha consultado la informacion detallada de un contacto tipo persona natural con nombre\n" +
            "<primer_nombre> y apellido <primer_apellido>, tipo direccion <tipo_direccion>, direccion <direccion>,\n" +
            "tipo documento <tipo_documento>, documento <documento>, y con el usuario <user>, con contrasenia <pass> y pais <country>")
    public void login(@Named("user") String usuario, @Named("pass") String contrasenia, @Named("country")String pais,
                      @Named("primer_nombre")String primerNombre, @Named("primer_apellido")String primerApellido,
                      @Named("tipo_documento")String tipoDocumento,@Named("documento")String documento,
                      @Named("tipo_direccion")String tipoDireccion,@Named("direccion")String direccion) {
        seusLogin.login();
        ncs.nuevoContactoPersona();
        ncs.seleccionarTipoDocumentoPersonaNatural(tipoDocumento);
        ncs.ingresarNumeroDocumentoPersonaNatural(documento);
        ncs.ingresarPrimerNombrePersonaNatural(primerNombre);
        ncs.ingresarPrimerApellidoPersonaNatural(primerApellido);
        ncs.seleccionarTipoDireccionPersonaNatural(tipoDireccion);
        ncs.ingresarDireccionPersonaNatural(direccion);
        ncs.btnCrearPersona();
    }

    @When("quiera ver informacion detallada del contacto  con nombre <primer_nombre> y con apellido <primer_apellido>")
    public void whenConsultarDetallePersonaNatural(@Named("primer_nombre") String primerNombre, @Named("primer_apellido") String primerApellido) {
        dcs.abrirDetallesContactoPersona(primerNombre,primerApellido);
    }

    @Then("se debe ver minimo la siguiente informacion: Primer nombre, Segundo nombre, Primer apellido, Segundo apellido,\r\nTipo de documento, Numero de documento, Sexo,Fecha de nacimiento, Fecha de fallecimiento, Causa de fallecimiento,\r\nProfesion, Estado civil, Tipo familia,  Telefono primario, Telefono celular y Correo electronico primario")
    public void assertConsultarDetallePersonaNatural() {
        dcs.verificarCamposPersonaNatural();
    }

    /**
     * Escenario 2
     */


    @Given("Se ha consultado la informacion detallada de un contacto tipo persona juridica con nombre <nombre_empresa>,\n" +
            "      tipo de direccion <tipo_direccion> y direccion <direccion>, con el usuario <user>, con contrasenia <pass> y pais <country>")
    public void loginPersonaJuridica(@Named("user") String usuario, @Named("pass") String contrasenia, @Named("country")String pais,
                                     @Named("nombre_empresa")String razonSocial,@Named("tipo_direccion")String tipoDireccion,
                                     @Named("direccion")String direccion) {
        //seusLogin.login();
        ncs.nuevoContactoPersonaJuridica();
        ncs.seleccionarTipoDocumentoPersonaNatural("NIT");
        ncs.ingresarRazonSocial(razonSocial);
        ncs.seleccionarTipoDireccionPersonaNatural(tipoDireccion);
        ncs.ingresarDireccionPersonaNatural(direccion);
        ncs.ingresarNumeroDocumentoPersonaNatural("");
        ncs.btnCrearPersona();

    }

    @When("quiera ver informacion detallada del contacto con nombre empresa <nombre_empresa>")
    public void whenConsultarDetallePersonaJuridica (@Named("nombre_empresa") String nombre_empresa) {
        dcs.abrirDetallesContactoEmpresa(nombre_empresa);

    }

    @Then("se debe ver minimo la siguiente informacion: Razon social, Nombre comercial, Tipo de documento, N\u00FAmero de\r\ndocumento, Actividad economica, Numero de empleados, Valor de activos, ventas anuales, Telefono de la oficina, Fax,\r\nCorreo electronico primario")
    public void assertConsultarDetallePersonaJuridica() {
        dcs.verificarCamposPersonaJuridica();
    }

}
