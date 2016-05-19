package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.CuentasAsociadasAContactoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class CuentasAsociadasAContactoDefinitions {

    @Steps
    CuentasAsociadasAContactoSteps contactoSteps;

    @Given("que voy a consultar un contacto")
    public void seleccionarOpcionBuscarContacto() {
        contactoSteps.navegarBarraSuperior();
    }

    @When("consulte  un contacto con cuentas asociadas como: <nombre> <apellido>")
    public void consultarCuentasAsociadas(@Named("nombre") String nombre,
                                          @Named("apellido") String apellido) {
        contactoSteps.buscarContactoPersona("CEDULA DE CIUDADANIA", nombre, apellido);
    }

    @Then("se muestra la lista de cuentas asociadas con nombre: <nombreConsulta>, direccion: <direccion>, tel: <telefono>, email: <email> y rol: <rol>")
    public void listarCuentasAsociadas  (@Named("nombreConsulta") String nombreConsulta,
                                         @Named("direccion") String direccion,
                                         @Named("telefono") String telefono,
                                         @Named("email") String email,
                                         @Named("rol") String rol) {
        contactoSteps.listarCuentasAsociadasAContacto(nombreConsulta, direccion, telefono, email, rol);
    }

    @When("consulte  un contacto sin cuentas asociadas como: <nombre> <apellido>")
    public void consultarCuentasAsociadasVacias(@Named("nombre") String nombre,
                                                @Named("apellido") String apellido) {
        contactoSteps.buscarContactoPersona("CEDULA DE CIUDADANIA", nombre, apellido);
    }

    @Then("se muestra el mensaje informativo <mensaje>")
    public void validarMensajeInformativo(@Named("mensaje") String mensaje) {
        contactoSteps.validarMensajeCuenta(mensaje);
    }
}