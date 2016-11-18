package com.sura.guidewire.policycenter.definitions.poliza;

import com.google.inject.name.Named;
import com.sura.guidewire.policycenter.steps.poliza.NuevaPolizaSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

public class NuevaPolizaDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    NuevaPolizaSteps nuevaPolizaSteps;

    @Given("que voy a buscar la cuenta <numCuenta>")
    public void buscarCuenta(@Named("numCuenta") String numCuenta){
        nuevaPolizaSteps.buscarCuenta(numCuenta);
    }

    @When("seleccione la organizacion <organizacion>")
    public void seleccionarLaOrganizacion(@Named("organizacion") String organizacion){
        nuevaPolizaSteps.seleccionarOrganizacion(organizacion);
    }

    @When("seleccione el canal <canal>")
    public void seleccionarElCanal(@Named("canal") String canal){
        nuevaPolizaSteps.seleccionarCanal(canal);
    }

    @When("seleccione el tipo de poliza <tipoPoliza> para autos")
    public void seleccionarTipoDePoliza(@Named("tipoPoliza") String tipoPoliza){
        nuevaPolizaSteps.seleccionarElTipoDePoliza(tipoPoliza);
    }

    @Then("se debe visualizar la tabla de productos con los productos de Autos y Multiriesgo corporativo y los botones para elegir producto habilitados")
    public void validarLosBotonesDeLaTablaProductosHabilitados(){
        nuevaPolizaSteps.validarBotonesDeLaTablaProductosHabilitados();
    }

    @Then("me debe mostrar las organizaciones: $listaOrganizaciones")
    public void validarListaDeOrganizaciones(ExamplesTable listaOrganizaciones){
        nuevaPolizaSteps.validarListaDeOrganizaciones(listaOrganizaciones);
    }

    @Then("la lista de canal debe mostrar los siguientes datos <datosListaCanal>")
    public void validarListaCanalDeAcuerdoALaOrganizacion(@Named("datosListaCanal") String datosListaCanal){
        nuevaPolizaSteps.validaListaCanalDeAcuerdoALaOrganizacion(datosListaCanal);
    }

    @Then("los botones de elegir producto deben estar habilitados")
    public void validarBotonesParaElegirProductoHabilitados(){
        nuevaPolizaSteps.validarBotonesHabilitados();
    }

    @Then("no debe mostrar la lista de productos")
    public void validarQueNoSeListanProductos(){
        nuevaPolizaSteps.validarNoSeListanProductos();
    }
}
