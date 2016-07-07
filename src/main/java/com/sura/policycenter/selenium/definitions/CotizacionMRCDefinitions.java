package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.CotizacionMRCSteps;
import com.sura.policycenter.selenium.steps.CotizacionPADetalleSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;

import java.util.HashMap;
import java.util.Map;

public class CotizacionMRCDefinitions {

    private final Map<String, String> infoCotizacionPoliza = new HashMap<>();

    public CotizacionMRCDefinitions(){
        infoCotizacionPoliza.put("numeroCotizacion", "Número de cotización");
        infoCotizacionPoliza.put("vigenciaPoliza", "Vigencia de la póliza");
        infoCotizacionPoliza.put("tomador", "Tomador");
        infoCotizacionPoliza.put("tipoDocumento", "Tipo documento");
        infoCotizacionPoliza.put("numeroDocumento", "Número documento");
        infoCotizacionPoliza.put("direccion", "Dirección");
        infoCotizacionPoliza.put("tipoDireccion", "Tipo de dirección");
        infoCotizacionPoliza.put("descripcionDireccion", "Descripción de dirección");
        infoCotizacionPoliza.put("empresaAseguradora", "Empresa aseguradora");
        infoCotizacionPoliza.put("primaTotal", "Prima total");
        infoCotizacionPoliza.put("impuestos", "Impuestos y cargos extra");
        infoCotizacionPoliza.put("costoTotal", "Costo total");
    }

    @Steps
    CotizacionMRCSteps cotizacionMRCSteps;

    @Given("se ha realizado la cotizacion <cotizacion>")
    public void givenIrALaCotizacion(@Named("cotizacion") String cotizacion) {
        cotizacionMRCSteps.ir_A_Buscar_Cotizacion_Poliza(cotizacion);
    }
}
