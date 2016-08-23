package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.CuentasOrdenesDeTrabajoSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

@SuppressWarnings("WeakerAccess")
public class CuentasOrdenesDeTrabajoDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    private CuentasOrdenesDeTrabajoSteps cuentasOrdenesTrabajoSteps;

    @Given("Estoy buscando una cuenta <numCuenta>")
    public void givenEstoyEnUnaCuentanumCuenta(@Named("numCuenta") String numCuenta) {
        cuentasOrdenesTrabajoSteps.seleccionarCuenta(numCuenta);
    }

    @When("consulte las transacciones de poliza por estado <filtroEstado>")
    public void consultarTransacciones(@Named("filtroEstado") String filtroEstado) {
        cuentasOrdenesTrabajoSteps.verTransaccionesContacto();
        cuentasOrdenesTrabajoSteps.filtrarPorEstado(filtroEstado);
    }

    @When("consulte todas las transacciones de la cuenta")
    public void consultarTodasLasTransacciones() {
        cuentasOrdenesTrabajoSteps.verTransaccionesContacto();
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

    @Then("no debo ver la poliza <transaccion> asociada a una colectiva")
    public void validarTransaccionNoExistente(@Named("transaccion") String transaccion){
        cuentasOrdenesTrabajoSteps.validarTransaccionNoExistente(transaccion);
    }

}
