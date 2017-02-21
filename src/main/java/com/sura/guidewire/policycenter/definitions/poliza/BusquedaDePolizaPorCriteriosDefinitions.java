package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.poliza.BusquedaDePolizaPorCriteriosSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class BusquedaDePolizaPorCriteriosDefinitions {

    @Steps
    public BusquedaDePolizaPorCriteriosSteps busquedaDePolizaPorCriteriosSteps;

    @When("seleccione el producto en criterio opcional <criterio>")
    public void seleccionarProducto(@Named("criterio") String criterio) {
        busquedaDePolizaPorCriteriosSteps.seleccionDeProducto(criterio);
    }

    @When("ingreso la placa del auto <placa>")
    public void ingresoPlaca(@Named("placa") String placa) {
        busquedaDePolizaPorCriteriosSteps.ingresarPlacaAuto(placa);
    }

    @When("busco poliza mediante el criterio seleccionado anteriormente")
    public void buscarPoliza() {
        busquedaDePolizaPorCriteriosSteps.clickBuscarPoliza();
    }

    @Then("se visualiza la informacion de la poliza relacionada $verificar")
    public void visualizarInformacionPoliza(ExamplesTable verificar) {
        busquedaDePolizaPorCriteriosSteps.verificarInformacionPoliza(verificar);
    }

    @Given("limpioCampos")
    @When("limpioCampos")
    public void limpiarCampos() {
        busquedaDePolizaPorCriteriosSteps.limpiarCampos();
    }

    @When("selecione la opcion tipo de documento <tipoDocumento>")
    public void seleccioneTipoDocumento(@Named("tipoDocumento") String tipoDocumento) {
        busquedaDePolizaPorCriteriosSteps.seleccionarTipoDocumento(tipoDocumento);
    }

    @When("ingreso la identificacion  <identificacion>")
    public void ingresarIdentificacion(@Named("identificacion") String identificacion) {
        busquedaDePolizaPorCriteriosSteps.ingresarIdentificacion(identificacion);
    }

    @When("seleccione el criterio de busqueda <criterioBusqueda>")
    public void seleccionarCriterioBusqueda(@Named("criterioBusqueda") String criterioBusqueda) {
        busquedaDePolizaPorCriteriosSteps.seleccionarCriteriosBusqueda(criterioBusqueda);
    }

    @When("diligencio el campo de criterio de busqueda <contenidoCampoCriterio>")
    public void diligenciarCampoCriterio(@Named("contenidoCampoCriterio") String contenido) {
        busquedaDePolizaPorCriteriosSteps.diligenciarCampoCriterioBusqueda(contenido);
    }
}



