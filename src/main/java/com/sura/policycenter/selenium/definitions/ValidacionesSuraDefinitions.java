package com.sura.policycenter.selenium.definitions;


import com.sura.policycenter.selenium.steps.CuentaNuevaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class ValidacionesSuraDefinitions {
    @Steps
    CuentaNuevaSteps cuentaNuevaSteps;

    @When("quiera crear una cuenta para un contacto e ingrese documento, tipo de documento <tipo_documento>")
    public void crearCuentaNuevaPersonaJuridica(@Named("tipo_documento")String tipoDocumento){
        cuentaNuevaSteps.abrir_nueva_cuenta();
        cuentaNuevaSteps.agregar_documento(tipoDocumento);
    }

    @When("quiera crear una cuenta para un contacto e ingrese documento <documento>, tipo de documento <tipo_documento>")
    public void crearCuentaNuevaPersonaJuridica(@Named("tipo_documento")String tipoDocumento,@Named("documento")String documento){
        cuentaNuevaSteps.abrir_nueva_cuenta();
        cuentaNuevaSteps.agregar_documento(tipoDocumento,documento);
    }

    @When("quiera crear una cuenta para un contacto persona juridica e tipo de documento <tipo_documento>")
    public void crearCuentaNuevaJuridica(@Named("tipo_documento")String tipoDocumento){
        cuentaNuevaSteps.abrir_nueva_cuenta();
        cuentaNuevaSteps.agregar_tipo_documento_b(tipoDocumento);
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
    }

    @Then("no debe permitir crear una nueva cuenta y no debe mostrar el mensaje <mensaje>")
    public void verificarEstadoDeMensaje(@Named("mensaje") String mensaje){
        cuentaNuevaSteps.verificar_estado_de_mensaje(mensaje);
    }
}
