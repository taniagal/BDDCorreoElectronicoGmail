package com.sura.policycenter.selenium.definitions;

import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.CrearNuevaCuentaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;

/**
 * Created by criscaor on 2016/04/25.
 */
public class CreateNewAccountDefinitions {

    @Steps
    SeusLoginSteps seusLogin;

    @Steps
    CrearNuevaCuentaSteps cns;

    @Given("que me encuentro en el sistema de policy center como usuario <user> , contrasena <pass> y Pais <country>")
    public void login(@Named("user") String usuario, @Named("pass") String contrasenia, @Named("country")String pais) {
        seusLogin.login(pais,usuario,contrasenia);

    }

    @When("Quiera crear una cuenta para un contacto persona natural e ingrese la informacion en los campos tipo de documento <tipo_documento>, numero de documento <documento>, Primer nombre <primer_nombre>, primer apellido <primer_apellido>, tipo de direccion <tipo_direccion> y direccion <direccion>")
    public void abrirNuevaCuenta(@Named("tipo_documento")String tipoDocumento, @Named("documento")String documento,
                            @Named("primer_nombre")String primerNombre, @Named("primer_apellido")String primerApellido,
                            @Named("tipo_direccion")String tipoDireccion, @Named("direccion")String direccion) {
        cns.abrirNuevaCuenta();


        //cns.crearNuevaCuenta( tipoDocumento, documento,primerNombre,primerApellido,tipoDireccion,direccion);
    }

    @Then("se debe crear la cuenta con el cliente persona natural")
    @Pending
    public void asercion() {
        // PENDING
    }
}
