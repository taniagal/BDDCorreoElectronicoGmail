package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.poliza.DetalleDeAseguradoDeCotizacionSteps;
import com.sura.guidewire.policycenter.steps.poliza.DisponibilidadDetalleProductoSteps;
import com.sura.guidewire.policycenter.steps.OpcionesDeCierreSteps;
import com.sura.guidewire.policycenter.steps.poliza.SolicitarRequisitoPaSteps;
import com.sura.guidewire.policycenter.steps.commons.NuevaCotizacionSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaAutosSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

public class OpcionesDeCierreDefinitions {

    @Steps
    DetalleDeAseguradoDeCotizacionSteps detalleDeAseguradoDeCotizacionSteps;

    @Steps
    DisponibilidadDetalleProductoSteps disponibilidadDetalleProductoSteps;

    @Steps
    NuevaCotizacionSteps nuevaCotizacionSteps;

    @Steps
    SolicitarRequisitoPaSteps solicitarRequisitoPaSteps;

    @Steps
    TarifaAutosSteps tarifaAutosSteps;

    @Steps
    OpcionesDeCierreSteps opcionesDeCierreSteps;

    @Given("voy a cotizar una poliza de autos con la cuenta, oficina, agente, producto, asegurado con tipo de documento y documento $datosCotizacion")
    public void cotizarPoliza(ExamplesTable datosCotizacion){
        Map<String, String> datos = datosCotizacion.getRows().get(0);
        detalleDeAseguradoDeCotizacionSteps.irACrearNuevaCotizacion();
        detalleDeAseguradoDeCotizacionSteps.ingresarCuenta(datos.get("cuenta"));
        disponibilidadDetalleProductoSteps.seleccionarAgente(datosCotizacion);
        nuevaCotizacionSteps.seleccionDeProducto(datos.get("producto"));
        solicitarRequisitoPaSteps.llenarInfoPoliza();
        tarifaAutosSteps.agregarAsegurados(datos.get("tipoDocumento"), datos.get("documento"));
    }

    @When("decline la transaccion")
    public void declinarTransaccion() {
        opcionesDeCierreSteps.irAOpcionesDeCierre();
        opcionesDeCierreSteps.declinarTransaccion();
    }

    @When("decida no tomar la poliza")
    public void noTomarPoliza(){
        opcionesDeCierreSteps.irAOpcionesDeCierre();
        opcionesDeCierreSteps.noTomarPoliza();
    }

    @Then("deben aparecer todas las razones de declinar poliza $opcionesDeclinacion")
    public void validarInformacionDeclinar(ExamplesTable opcionesDeclinacion) {
        opcionesDeCierreSteps.validarInformacionDeclinar(opcionesDeclinacion);
    }

    @Then("deben aparecer todas las razones para no tomar la poliza $opcionesNoTomar")
    public void validarInformacionNoTomar(ExamplesTable opcionesNoTomar){
        opcionesDeCierreSteps.validarInformacionNoTomar(opcionesNoTomar);
    }
}
