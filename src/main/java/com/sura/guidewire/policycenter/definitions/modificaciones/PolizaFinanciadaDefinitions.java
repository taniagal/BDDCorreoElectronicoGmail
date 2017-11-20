package com.sura.guidewire.policycenter.definitions.modificaciones;

import com.sura.guidewire.policycenter.steps.PolizaFinanciadaSteps;
import com.sura.guidewire.policycenter.steps.commons.NuevaCotizacionSteps;
import com.sura.guidewire.policycenter.steps.poliza.ExpedicionDePolizaSteps;
import com.sura.guidewire.policycenter.steps.poliza.InformacionDePolizaMrcSteps;
import com.sura.guidewire.policycenter.steps.poliza.RequisitosPorDniAutosSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaAutosSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaTasaUnicaSteps;

import java.util.Map;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class PolizaFinanciadaDefinitions {
    @Steps
    PolizaFinanciadaSteps polizaFinanciadaSteps;

    @Steps
    RequisitosPorDniAutosSteps requisitosPorDniAutosSteps;

    @Steps
    NuevaCotizacionSteps nuevaCotizacionSteps;

    @Steps
    TarifaAutosSteps tarifaAutosSteps;

    @Steps
    TarifaTasaUnicaSteps tasaUnicaSteps;

    @Steps
    InformacionDePolizaMrcSteps informacionDePolizaMrcSteps;

    @Steps
    ExpedicionDePolizaSteps expedicionDePolizaSteps;

    @When("seleccione la opcion financiar poliza")
    public void seleccionarFinanciarPoliza() {
        polizaFinanciadaSteps.seleccionarOpcionFinanciarPoliza();
    }

    @When("ingrese el numero de cuotas <numeroCuotas> a financiar")
    public void ingresarNumeroDeCuotasAFinanciar(@Named("numeroCuotas") String numeroCuotas) {
        polizaFinanciadaSteps.ingresarNumeroDeCuotasAFinanciar(numeroCuotas);
    }

    @When("agregue un asegurado que es titular de la cuenta para la poliza financiera")
    public void ingresarAseguradoQueEsContactoDeLaCuenta() {
        polizaFinanciadaSteps.agregarAseguradoQueEsTitulardeLaCuenta();

    }

    @Then("se debe poder visualizar el valor de la cuota y el numero de cuotas a financiar $informacionFinanciacion")
    public void visualizarInformacionDePolizaFinanciada(ExamplesTable informacionFinanciacion) {
        polizaFinanciadaSteps.visualizarInformacionDePolizaFinanciada(informacionFinanciacion);
    }

    @When("seleccione la opcion no financiar poliza")
    public void seleccionarOpcionNoFinanciarPoliza() {
        polizaFinanciadaSteps.seleccionarOpcionNoFinanciarPoliza();
    }

    @Then("se debe ocultar el campo numero de cuotas")
    public void validarNoCampoNumeroDeCuotas() {
        polizaFinanciadaSteps.validarNoCampoNumeroDeCuotas();
    }

    @When("deben aparecer el numero de cuotas por las cuales puedo financiar la poliza $opcionesCuotas")
    public void validarNumeroCuotasAFinanciar(ExamplesTable opcionesCuotas) {
        polizaFinanciadaSteps.validarCuotasAFinanciar(opcionesCuotas);
    }

    @Given("tengo una poliza de autos financiada con los siguientes datos: $datos")
    public void crearPoliza(ExamplesTable datos) {
        Map<String, String> dato = datos.getRow(0);
        nuevaCotizacionSteps.irANuevaCotizacion();
        nuevaCotizacionSteps.seleccionarProducto(datos);
        polizaFinanciadaSteps.clickEnOpcionFinanciarPoliza(datos);
        tarifaAutosSteps.agregarAsegurados(dato.get("tipo_documento"), dato.get("documento"));
        tarifaAutosSteps.agregarVehiculo(datos);
        polizaFinanciadaSteps.agregarCoberturas(datos);
        informacionDePolizaMrcSteps.seleccionarOpcionCotizar();
        informacionDePolizaMrcSteps.seleccionarOpcionCotizar();
        expedicionDePolizaSteps.clicEnExpedirPoliza();
        requisitosPorDniAutosSteps.clicBotonExpedicion();
        expedicionDePolizaSteps.clicEnExpedirPoliza();
        requisitosPorDniAutosSteps.clicBotonExpedicion();
        tasaUnicaSteps.irAArchivoDePolizaExpedida();
    }
}
