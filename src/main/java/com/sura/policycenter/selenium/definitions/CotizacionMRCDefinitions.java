package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.CotizacionMRCSteps;
import com.sura.policycenter.selenium.steps.CotizacionPADetalleSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import java.util.HashMap;
import java.util.Map;

public class CotizacionMRCDefinitions {

    private final Map<String, String> labelsCotizacionPoliza = new HashMap<>();

    public CotizacionMRCDefinitions(){
        labelsCotizacionPoliza.put("numeroCotizacion", "Número de cotización");
        labelsCotizacionPoliza.put("vigenciaPoliza", "Vigencia de la póliza");
        labelsCotizacionPoliza.put("tomador", "Tomador");
        labelsCotizacionPoliza.put("tipoDocumento", "Tipo documento");
        labelsCotizacionPoliza.put("numeroDocumento", "Número documento");
        labelsCotizacionPoliza.put("direccion", "Dirección");
        labelsCotizacionPoliza.put("tipoDireccion", "Tipo de dirección");
        labelsCotizacionPoliza.put("descripcionDireccion", "Descripción de dirección");
        labelsCotizacionPoliza.put("empresaAseguradora", "Empresa aseguradora");
        labelsCotizacionPoliza.put("primaTotal", "Prima total");
        labelsCotizacionPoliza.put("impuestos", "Impuestos y cargos extra");
        labelsCotizacionPoliza.put("costoTotal", "Costo total");
    }

    @Steps
    CotizacionMRCSteps cotizacionMRCSteps;

    @Given("se ha realizado la cotizacion <cotizacion>")
    public void givenIrALaCotizacion(@Named("cotizacion") String cotizacion) {
        cotizacionMRCSteps.ir_A_Buscar_Cotizacion_Poliza(cotizacion);
    }

    @When("ingrese a consultar la cotizacion")
    public void consultarCotizacion(){
        cotizacionMRCSteps.ver_Detalle_Cotizacion();
    }

    @Then("debo ver la siguiente informacion de la cotizacion $informacionCotizacion")
    public void validarInformacionCotizacion(ExamplesTable informacionCotizacion){
        cotizacionMRCSteps.validar_Informacion_Cotizacion(labelsCotizacionPoliza, informacionCotizacion);
    }
}
