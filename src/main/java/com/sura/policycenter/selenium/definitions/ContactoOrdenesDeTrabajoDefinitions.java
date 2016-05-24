package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.ContactoOrdenesDeTrabajoSteps;
import com.sura.policycenter.selenium.steps.CuentasAsociadasAContactoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

@SuppressWarnings("WeakerAccess")
public class ContactoOrdenesDeTrabajoDefinitions {

    @Steps
    private CuentasAsociadasAContactoSteps contactoSteps;

    @Steps
    private ContactoOrdenesDeTrabajoSteps ordenesTrabajoSteps;

    @Given("consulte  un contacto del tipo <tipoContacto> con transacciones como: <nombre> <apellido>")
    public void buscarContactoPersona(@Named("tipoContacto") String tipoContacto,
                               @Named("nombre") String nombre,
                               @Named("apellido") String apellido) {
        contactoSteps.buscarContactoPersona(tipoContacto, nombre, apellido);
    }

    @Given("consulte  un contacto del tipo <tipoContacto> con transacciones como: <razonSocial>")
    public void buscarContactoEmpresa(@Named("tipoContacto") String tipoContacto,
                                      @Named("razonSocial") String razonSocial){
        contactoSteps.buscarContactoEmpresa(tipoContacto,razonSocial);
    }

    @Given("consulte  un contacto del tipo <tipoContacto> con transacciones como: <nombre> <apellido> y seleccione el registro <numero>")
    public void buscarContactoSel(@Named("tipoContacto") String tipoContacto,
                               @Named("nombre") String nombre,
                               @Named("apellido") String apellido,
                               @Named("numero") String numero) {
        contactoSteps.buscarContactoSel(tipoContacto, nombre, apellido, numero);
    }

    @When("consulte las transacciones por estado <filtroEstado>")
    public void consultarTransacciones(@Named("filtroEstado") String filtroEstado) {
        ordenesTrabajoSteps.verTransaccionesContacto();
        ordenesTrabajoSteps.filtrarPorEstado(filtroEstado);
    }

    @Then("debe mostrarme el listado de transacciones con su respectiva informacion: numero de poliza <poliza>, producto <producto>, transaccion <transaccion>, tipo <tipo>, estado <estado>, participante <participante>")
    public void validarTransacciones(@Named("poliza") String poliza,
                                     @Named("producto") String producto,
                                     @Named("transaccion") String transaccion,
                                     @Named("tipo") String tipo,
                                     @Named("estado") String estado,
                                     @Named("participante") String participante) {
        ordenesTrabajoSteps.validarCamposTransacciones(poliza, producto, transaccion, tipo,
                estado, participante);
    }

    @Then("debe mostrarme el listado de transacciones filtradas por estado <filtroEstado>")
    public void validarTransacciones(@Named("filtroEstado") String filtroEstado) {
        ordenesTrabajoSteps.validarFiltroEstado(filtroEstado);
    }

    @When("consulte las transacciones por tipo de transaccion <filtroTransaccion>")
    public void filtrarPorTransaccion(@Named("filtroTransaccion") String filtroTransaccion) {
        ordenesTrabajoSteps.filtrarPorTransaccion(filtroTransaccion);
    }

    @Then("debe mostrarme el listado de transacciones filtradas por tipo de transaccion <filtroTransaccion>")
    public void validarPorTransaccion(@Named("filtroTransaccion") String filtroTransaccion) {
        ordenesTrabajoSteps.validarPorTransaccion(filtroTransaccion);
    }

    @When("consulte las transacciones por tipo de transaccion <filtroProducto>")
    public void filtrarPorProducto(@Named("filtroProducto") String filtroProducto) {
        ordenesTrabajoSteps.filtrarPorProducto(filtroProducto);
    }

    @Then("debe mostrarme el listado de transacciones filtradas por tipo de transaccion <filtroProducto>")
    public void validarPorProducto(@Named("filtroProducto") String filtroProducto) {
        ordenesTrabajoSteps.validarPorProducto(filtroProducto);
    }

    @When("consulte las transacciones y no encuentre registros")
    public void consultarTransaccionesVacias() {
        ordenesTrabajoSteps.verTransaccionesContacto();
    }

    @Then("se muestra el mensaje informativo de transaccion no encontrada <mensaje>")
    public void validarMensajeInformativo(@Named("mensaje") String mensaje) {
        ordenesTrabajoSteps.validarMensaje(mensaje);
    }

}
