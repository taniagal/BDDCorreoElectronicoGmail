package com.sura.guidewire.policycenter.definitions.cuenta;


import com.sura.guidewire.policycenter.steps.cuenta.CuentaNuevaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class ValidacionesMDMDefinitions {
    @Steps
    CuentaNuevaSteps cuentaNuevaSteps;

    @When("quiera crear una cuenta para un contacto e ingrese documento, tipo de documento <tipo_documento>")
    public void crearCuentaNuevaPersonaJuridica(@Named("tipo_documento")String tipoDocumento){
        cuentaNuevaSteps.abrirNuevaCuenta();
        cuentaNuevaSteps.agregarDocumento(tipoDocumento);
    }

    @When("quiera crear una cuenta para un contacto e ingrese documento <documento>, tipo de documento <tipo_documento>")
    public void crearCuentaNuevaPersonaJuridica(@Named("tipo_documento")String tipoDocumento,@Named("documento")String documento){
        cuentaNuevaSteps.abrirNuevaCuenta();
        cuentaNuevaSteps.agregarDocumento(tipoDocumento,documento);
    }

    @When("quiera crear una cuenta para un contacto persona juridica e tipo de documento <tipo_documento>")
    public void crearCuentaNuevaJuridica(@Named("tipo_documento")String tipoDocumento){
        cuentaNuevaSteps.abrirNuevaCuenta();
        cuentaNuevaSteps.agregarTipoDocumentoB(tipoDocumento);
    }

    @When("nombre comercial <nombre_comercial>")
    public void agregarNombrecomercial(@Named("nombre_comercial")String nombreComercial){
        cuentaNuevaSteps.agregarNombreComecial(nombreComercial);
    }

    @When("telefono oficina <telefono_oficina>")
    public void agregarTelefonoOficina(@Named("telefono_oficina")String telefonoOficina){
        cuentaNuevaSteps.agregarTelefonoOficina(telefonoOficina);
    }

    @Then("no debe permitir crear una nueva cuenta y debe mostrar el mensaje <mensaje>")
    public void verificarMensaje(@Named("mensaje") String mensaje){
        cuentaNuevaSteps.verificarMensaje(mensaje);
    }

    @Then("no debe permitir crear una nueva cuenta y no debe mostrar el mensaje <mensaje>")
    public void verificarEstadoDeMensaje(@Named("mensaje") String mensaje){
        cuentaNuevaSteps.verificarEstadoDeMensaje(mensaje);
    }
}
