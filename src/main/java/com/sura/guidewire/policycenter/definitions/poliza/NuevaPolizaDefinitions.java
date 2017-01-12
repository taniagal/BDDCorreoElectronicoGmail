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
    public void buscarCuenta(@Named("numCuenta") String numCuenta) {
        nuevaPolizaSteps.buscarCuenta(numCuenta);
    }

    @When("seleccione la organizacion, el canal y el tipo de poliza: $datosAutos")
    public void seleccionarLaOrganizacion(ExamplesTable datosAutos) {
        nuevaPolizaSteps.seleccionarOrganizacion(datosAutos);
    }

    @Then("se debe visualizar la tabla de productos con los productos de Autos y Multiriesgo corporativo y los botones para elegir producto habilitados")
    public void validarLosBotonesDeLaTablaProductosHabilitados() {
        nuevaPolizaSteps.validarBotonesDeLaTablaProductosHabilitados();
    }

    @Then("me debe mostrar las organizaciones: $listaOrganizaciones")
    public void validarListaDeOrganizaciones(ExamplesTable listaOrganizaciones) {
        nuevaPolizaSteps.validarListaDeOrganizaciones(listaOrganizaciones);
    }

    @Then("la lista de canal debe mostrar los siguientes datos <datosListaCanal>")
    public void validarListaCanalDeAcuerdoALaOrganizacion(@Named("datosListaCanal") String datosListaCanal) {
        nuevaPolizaSteps.validaListaCanalDeAcuerdoALaOrganizacion(datosListaCanal);
    }
}
