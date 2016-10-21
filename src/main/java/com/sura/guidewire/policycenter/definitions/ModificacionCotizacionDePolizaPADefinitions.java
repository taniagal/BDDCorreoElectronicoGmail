package com.sura.guidewire.policycenter.definitions;


import com.google.inject.name.Named;
import com.sura.guidewire.policycenter.steps.CotizacionPADetalleSteps;
import com.sura.guidewire.policycenter.steps.ModificacionCotizacionDePolizaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import java.util.HashMap;
import java.util.Map;


public class ModificacionCotizacionDePolizaPADefinitions {
    private final Map<String, String> infoCotizacionPoliza = new HashMap<>();

    @Steps
    ModificacionCotizacionDePolizaSteps cotizacionDePolizaSteps;

    @Steps
    CotizacionPADetalleSteps cotizacionPADetalleSteps;

    public ModificacionCotizacionDePolizaPADefinitions(){
        infoCotizacionPoliza.put("numeroPoliza", "Número de póliza");
        infoCotizacionPoliza.put("numeroCotizacion", "Número de cotización");
        infoCotizacionPoliza.put("vigenciaPoliza", "Vigencia de la póliza");
        infoCotizacionPoliza.put("tomador", "Tomador");
        infoCotizacionPoliza.put("tipoDocumento", "Tipo documento");
        infoCotizacionPoliza.put("numeroDocumento", "Número documento");
        infoCotizacionPoliza.put("direccion", "Dirección");
        infoCotizacionPoliza.put("tipoDireccion", "Tipo de dirección");
        infoCotizacionPoliza.put("descripcionDireccion", "Descripción de la dirección");
        infoCotizacionPoliza.put("empresaAseguradora", "Empresa aseguradora");
        infoCotizacionPoliza.put("primaTotal", "Prima total");
        infoCotizacionPoliza.put("iva", "Iva");
        infoCotizacionPoliza.put("costoTotal", "Costo total");

        infoCotizacionPoliza.put("labelVehiculo", "Vehículo 3");
        infoCotizacionPoliza.put("placa", "Placa");
        infoCotizacionPoliza.put("codigoFasecolda", "Código fasecolda");
        infoCotizacionPoliza.put("marca", "Marca");
        infoCotizacionPoliza.put("modelo", "Modelo");
        infoCotizacionPoliza.put("linea", "Línea");
        infoCotizacionPoliza.put("descripcion", "Descripción");
        infoCotizacionPoliza.put("valorTermino", "Valor término");
        infoCotizacionPoliza.put("prima", "Prima");
        infoCotizacionPoliza.put("subtotal", "Subtotal");
        infoCotizacionPoliza.put("subtotalPrimas", "Subtotal de primas");
        infoCotizacionPoliza.put("iva", "Iva");

        infoCotizacionPoliza.put("DC_labelVehiculo", "Vehículo 1");
        infoCotizacionPoliza.put("DC_placa", "Placa");
        infoCotizacionPoliza.put("DC_codigoFasecolda", "Código fasecolda");
        infoCotizacionPoliza.put("DC_marca", "Marca");
        infoCotizacionPoliza.put("DC_modelo", "Modelo");
        infoCotizacionPoliza.put("DC_linea", "Línea");
        infoCotizacionPoliza.put("DC_descripcion", "Descripción");
        infoCotizacionPoliza.put("DC_valorTermino", "Valor término");
        infoCotizacionPoliza.put("DC_prima", "Prima");
        infoCotizacionPoliza.put("DC_subtotal", "Subtotal");
        infoCotizacionPoliza.put("DC_subtotalPrimas", "Subtotal de primas");
        infoCotizacionPoliza.put("DC_iva", "Iva");
    }

    @Given("se ha realizado la cotizacion de la modificacion <cotizacion>")
    public void irALaCotizacion(@Named("cotizacion") String cotizacion) {
        cotizacionPADetalleSteps.ir_A_Buscar_Cotizacion_Poliza(cotizacion);
    }

    @When("ingrese al detalle de la modificacion")
    public void verDetalleCotizacion() {
        cotizacionDePolizaSteps.verDetalleCotizacion();
    }

    @Then("debo ver de la cotizacion la siguiente informacion $informacionCotizacion")
    public void validarInformacionCotizacion(ExamplesTable informacionCotizacion) {
        cotizacionDePolizaSteps.validarInformacionCotizacion(infoCotizacionPoliza, informacionCotizacion);
    }

    @Then("debo poder ver la direccion del tomador de la modificacion <direccion>, la cual se indico como principal")
    public void validarDireccion(@Named("direccion") String direccion){
        cotizacionDePolizaSteps.validarDireccionTomador(direccion);
    }

    @Then("se debe mostrar la informacion del detalle de modificacion por riesgo")
    public void thenMostrarInformacionDetalleCotizacion(){
        cotizacionDePolizaSteps.validarInformacionDetalleCotizacion(infoCotizacionPoliza);
    }

    @Then("se debe mostrar en la columna \"Termino\" de la modificacion el limite o deducible de la cobertura en el caso de que aplique")
    public void thenValidarTerminoCobertura(){
        cotizacionDePolizaSteps.validarTerminoCobertura();
    }

    @Then("se debe mostrar en la columna \"Termino\" de la modificacion el limite de la cobertura en el caso de que aplique")
    public void thenValidarLimiteCobertura(){
        cotizacionDePolizaSteps.validarTerminoCobertura();
    }

    @Then("se debe mostrar en la columna \"Termino\" de la modificacion el deducible de la cobertura en el caso de que aplique")
    public void thenValidarDeducibleCobertura(){
        cotizacionDePolizaSteps.validarTerminoCobertura();
    }

    @Then("debo ver los detalles del cambio del costo de la modificacion")
    public void thenValidarDetallesCosto(){
        cotizacionDePolizaSteps.validarDetallesCosto(infoCotizacionPoliza);
    }
}
