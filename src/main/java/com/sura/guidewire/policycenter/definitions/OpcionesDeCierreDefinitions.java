package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.DetalleDeAseguradoDeCotizacionSteps;
import com.sura.guidewire.policycenter.steps.DisponibilidadDetalleProductoSteps;
import com.sura.guidewire.policycenter.steps.OpcionesDeCierreSteps;
import com.sura.guidewire.policycenter.steps.SolicitarRequisitoPaSteps;
import com.sura.guidewire.policycenter.steps.commons.NuevaCotizacionSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaAutosSteps;
import net.thucydides.core.annotations.Steps;
import org.eclipse.jetty.util.annotation.Name;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

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

    @Given("voy a cotizar una poliza de autos con la cuenta <cuenta>, agente <agente>, producto <producto>, \n" +
            "asegurado con tipo de documento <tipo_documento> y documento <documento>")
    public void cotizarPoliza(@Named("cuenta") String cuenta,
                              @Named("agente") String agente,
                              @Named("producto") String producto,
                              @Named("tipo_documento") String tipoDocumento,
                              @Named("documento") String documento){
        detalleDeAseguradoDeCotizacionSteps.irACrearNuevaCotizacion();
        detalleDeAseguradoDeCotizacionSteps.ingresarCuenta(cuenta);
        disponibilidadDetalleProductoSteps.seleccionarAgente(agente);
        nuevaCotizacionSteps.seleccionDeProducto(producto);
        solicitarRequisitoPaSteps.llenarInfoPoliza();
        tarifaAutosSteps.agregarAsegurados(tipoDocumento, documento);
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
