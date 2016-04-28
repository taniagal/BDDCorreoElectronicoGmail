package com.sura.policycenter.selenium.definitions;

import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.CuentasAsociadasAContactoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;

public class CuentasAsociadasAContactoDefinitions {

    @Steps
    SeusLoginSteps seusSteps;

    @Steps
    CuentasAsociadasAContactoSteps contactoSteps;


    @When("consulte  un contacto con cuentas asociadas como: <nombre> <apellido>")
    public void consultarCuentasAsociadas(@Named("nombre") String nombre,
                                          @Named("apellido") String apellido) {
        contactoSteps.buscarContacto(nombre, apellido);
    }

    @Then("se muestra la lista de cuentas asociadas con nombre: <nombre>, direccion: <direccion>, tel: <telefono>, email: <email> y rol: <rol>")
    public void listarCuentasAsociadas  (@Named("nombre") String nombre,
                                         @Named("direccion") String direccion,
                                         @Named("telefono") String telefono,
                                         @Named("email") String email,
                                         @Named("rol") String rol) {
        contactoSteps.listarCuentasAsociadasAContacto(nombre, direccion, telefono, email, rol);
    }

    @When("consulte  un contacto sin cuentas asociadas como: <nombre> <apellido>")
    public void consultarCuentasAsociadasVacias(@Named("nombre") String nombre,
                                                @Named("apellido") String apellido) {
        contactoSteps.buscarContacto(nombre, apellido);
    }

    @Then("se muestra el mensaje informativo <mensaje>")
    public void validarMensajeInformativo(@Named("mensaje") String mensaje) {
        contactoSteps.validarMensajeCuenta(mensaje);
    }
}
