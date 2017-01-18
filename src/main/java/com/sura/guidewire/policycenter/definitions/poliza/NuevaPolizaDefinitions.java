package com.sura.guidewire.policycenter.definitions.poliza;

import com.google.inject.name.Named;
import com.sura.guidewire.policycenter.steps.commons.NuevaCotizacionSteps;
import com.sura.guidewire.policycenter.steps.poliza.NuevaPolizaSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaAutosSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaTasaUnicaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

public class NuevaPolizaDefinitions {
    @Steps
    NuevaPolizaSteps nuevaPolizaSteps;

    @Steps
    NuevaCotizacionSteps nuevaCotizacionSteps;

    @Steps
    TarifaAutosSteps tarifaAutosSteps;

    @Steps
    TarifaTasaUnicaSteps tasaUnicaSteps;

    @Given("que voy a buscar la cuenta <numCuenta>")
    public void buscarCuenta(@Named("numCuenta") String numCuenta) {
        nuevaPolizaSteps.buscarCuenta(numCuenta);
    }

    @Given("tengo una poliza de PA con los siguientes datos: $datos")
    public void crearPoliza(ExamplesTable datos) {
        Map<String, String> dato = datos.getRow(0);
        nuevaCotizacionSteps.irANuevaCotizacion();
        nuevaCotizacionSteps.seleccionarProducto(datos);
        tarifaAutosSteps.agregarAsegurados(dato.get("tipo_documento"), dato.get("documento"));
        tarifaAutosSteps.agregarVehiculo(datos);
        tarifaAutosSteps.agregarCoberturas(datos);
        tasaUnicaSteps.expedirPoliza();
        tasaUnicaSteps.irAArchivoDePolizaExpedida();
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
