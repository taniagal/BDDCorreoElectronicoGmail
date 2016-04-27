package com.sura.policycenter.selenium.definitions;

import com.google.inject.name.Named;
import com.sura.policycenter.selenium.steps.ContactoOrdenesDeTrabajoSteps;
import com.sura.policycenter.selenium.steps.CuentasAsociadasAContactoSteps;
import net.thucydides.core.annotations.Steps;
import org.bytedeco.javacpp.annotation.Name;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class ContactoOrdenesDeTrabajoDefinitions {

    @Steps
    CuentasAsociadasAContactoSteps contactoSteps;

    @Steps
    ContactoOrdenesDeTrabajoSteps ordenesTrabajoSteps;

    @Given("consulte  un contacto del tipo <tipoContacto> con transacciones como: <nombre> <apellido>")
    public void buscarContacto(@Named("tipoContacto") String tipoContacto,
                               @Named("nombre") String nombre,
                               @Named("apellido") String apellido) {
        contactoSteps.buscarContacto(tipoContacto, nombre, apellido);
    }

    @When("consulte las transacciones por estado <filtroEstado>")
    public void consultarTransacciones(@Named("filtroEstado") String filtroEstado) {
        ordenesTrabajoSteps.verTransaccionesContacto();
        ordenesTrabajoSteps.filtrarPorEstado(filtroEstado);
    }

    @Then("debe mostrarme el listado de transacciones con su respectiva informacion: Fecha de creacion <fechaCreacion> Poliza <poliza> producto <producto> Transaccion <transaccion> Tipo <tipo> Status <estado> Fecha fin transaccion <fechaFin> Participante <participante>")
    public void validarTransacciones(@Named("fechaCreacion") String fechaCreacion,
                                     @Named("poliza") String poliza,
                                     @Named("producto") String producto,
                                     @Named("transaccion") String transaccion,
                                     @Named("tipo") String tipo,
                                     @Named("estado") String estado,
                                     @Named("fechaFin") String fechaFin,
                                     @Named("participante") String participante) {
        ordenesTrabajoSteps.validarCamposTransacciones(fechaCreacion, poliza, producto, transaccion, tipo,
                estado, fechaFin, participante);
    }

    @Then("debe mostrarme el listado de transacciones filtradas por estado <filtroEstado>")
    public void validarTransacciones(@Named("filtroEstado") String filtroEstado) {
        ordenesTrabajoSteps.validarFiltroEstado(filtroEstado);
    }
}
