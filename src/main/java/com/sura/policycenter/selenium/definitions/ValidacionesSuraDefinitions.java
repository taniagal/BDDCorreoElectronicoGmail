package com.sura.policycenter.selenium.definitions;


import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.CuentaNuevaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class ValidacionesSuraDefinitions {
    @Steps
    SeusLoginSteps seusLoginSteps;

    @Steps
    CuentaNuevaSteps cuentaNuevaSteps;

    @Given("que me encuentro en el sistema de policy center")
    public void login(){
        seusLoginSteps.login();
    }

    @When("quiera crear una cuenta para un contacto persona juridica e ingrese documento, tipo de documento <tipo_documento>")
    public void crearCuentaNuevaPersonaJuridica(@Named("tipo_documento")String tipoDocumento){
        cuentaNuevaSteps.abrir_nueva_cuenta();
        cuentaNuevaSteps.agregar_documento(tipoDocumento);
    }

    @When("quiera crear una cuenta para un contacto persona juridica e tipo de documento <tipo_documento>")
    public void crearCuentaNuevaJuridica(@Named("tipo_documento")String tipoDocumento){
        cuentaNuevaSteps.abrir_nueva_cuenta();
        cuentaNuevaSteps.agregar_tipo_documento2(tipoDocumento);
    }

    @When("nombre comercial <nombre_comercial>")
    public void agregarNombrecomercial(@Named("nombre_comercial")String nombreComercial){
        cuentaNuevaSteps.agregar_nombre_comecial(nombreComercial);
    }

    @When("telefono oficina <telefono_oficina>")
    public void agregarTelefonoOficina(@Named("telefono_oficina")String telefonoOficina){
        cuentaNuevaSteps.agregar_telefono_oficina(telefonoOficina);
    }

    @Then("no debe permitir crear una nueva cuenta y debe mostrar el mensaje <mensaje>")
    public void verificarMensaje(@Named("mensaje") String mensaje){
        cuentaNuevaSteps.verificar_mensaje(mensaje);
        seusLoginSteps.close();
    }
}
