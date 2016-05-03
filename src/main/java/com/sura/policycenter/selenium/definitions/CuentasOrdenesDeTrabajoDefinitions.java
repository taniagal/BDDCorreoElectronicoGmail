package com.sura.policycenter.selenium.definitions;

import com.google.inject.name.Named;
import com.sura.policycenter.selenium.steps.ContactoOrdenesDeTrabajoSteps;
import com.sura.policycenter.selenium.steps.CuentasOrdenesDeTrabajoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by brayruru on 2016/05/03.
 */
public class CuentasOrdenesDeTrabajoDefinitions {

    @Steps
    ContactoOrdenesDeTrabajoSteps ordenesTrabajoSteps;

    @Steps
    CuentasOrdenesDeTrabajoSteps cuentasOrdenesTrabajoSteps;

    @When("consulte las transacciones de poliza por estado <filtroEstado>")
    public void consultarTransacciones(@Named("filtroEstado") String filtroEstado) {
        cuentasOrdenesTrabajoSteps.verTransaccionesContacto();
        cuentasOrdenesTrabajoSteps.filtrarPorEstado(filtroEstado);
    }

    @When("consulte las transacciones de poliza y no encuentre registros")
    public void consultarTransaccionesVacias() {
        cuentasOrdenesTrabajoSteps.verTransaccionesContacto();
    }

    @Then("se muestra el mensaje informativo de transaccionde poliza no encontrada <mensaje>")
    public void validarMensajeInformativo(@Named("mensaje") String mensaje) {
        cuentasOrdenesTrabajoSteps.validarMensaje(mensaje);
    }

    @When("consulte las transacciones de poliza por tipo de transaccion <filtroTransaccion>")
    public void filtrarPorTransaccion(@Named("filtroTransaccion") String filtroTransaccion) {
        cuentasOrdenesTrabajoSteps.filtrarPorTransaccion(filtroTransaccion);
    }

    @When("consulte las transacciones de poliza por tipo de producto <filtroProducto>")
    public void filtrarPorProducto(@Named("filtroProducto") String filtroProducto) {
        cuentasOrdenesTrabajoSteps.filtrarPorProducto(filtroProducto);
    }




}
