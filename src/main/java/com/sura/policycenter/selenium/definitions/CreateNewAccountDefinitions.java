package com.sura.policycenter.selenium.definitions;

import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.CrearNuevaCuentaSteps;
import com.sura.policycenter.selenium.steps.PolicySteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;

/**
 * Created by criscaor on 2016/04/25.
 */
public class CreateNewAccountDefinitions {

    /*@Steps
    SeusLoginSteps seusLogin;*/

    @Steps
    CrearNuevaCuentaSteps cns;

    @Steps
    PolicySteps pcs;


    @Given("que me encuentro en el sistema de policy center como usuario <user> , contrasena <pass> y Pais <country>")
    public void login(@Named("user") String usuario, @Named("pass") String contrasenia, @Named("country")String pais) {
        //seusLogin.login(usuario,contrasenia);
        pcs.login(usuario, contrasenia);
    }

    @When("Quiera crear una cuenta para un contacto persona natural e ingrese la informacion en los campos tipo de\n" +
            "documento <tipo_documento>, numero de documento <documento>, Primer nombre <primer_nombre>,\n" +
            "primer apellido <primer_apellido>, tipo de direccion <tipo_direccion>, direccion <direccion>, ciudad <ciudad>,\n" +
            "estado <estado>, codigo postal <codigo_postal> y nombre de organizacion <nombre_organizacion>")
    public void abrirNuevaCuenta(@Named("tipo_documento")String tipoDocumento, @Named("documento")String documento,
                            @Named("primer_nombre")String primerNombre, @Named("primer_apellido")String primerApellido,
                            @Named("tipo_direccion")String tipoDireccion, @Named("direccion")String direccion,
                             @Named("ciudad")String ciudad,@Named("estado")String estado,
                             @Named("codigo_postal")String codigoPostal, @Named("nombre_organizacion")String nombreOrganizacion) {

        cns.abrirNuevaCuenta();
        cns.crearNuevaCuentaPersona ( tipoDocumento, documento, primerNombre, primerApellido, tipoDireccion,
                direccion,ciudad,estado,codigoPostal,nombreOrganizacion);
    }

    @Then("se debe crear la cuenta con el cliente persona natural")
    @Pending
    public void asercion() {
        // PENDING
    }
}
