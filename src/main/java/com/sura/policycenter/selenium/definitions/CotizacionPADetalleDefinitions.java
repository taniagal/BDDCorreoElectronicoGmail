package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.CotizacionPADetalleSteps;
import com.sura.policycenter.selenium.steps.HistorialCuentaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;

import java.util.HashMap;
import java.util.Map;

public class CotizacionPADetalleDefinitions {

    @Steps
    CotizacionPADetalleSteps cotizacionPADetalleSteps;

    @Steps
    HistorialCuentaSteps historialCuentaSteps;

    private final Map<String, String> infoDetalleCotizacion = new HashMap<>();

    public CotizacionPADetalleDefinitions(){
        infoDetalleCotizacion.put("labelVehiculo", "Vehículo 1");
        infoDetalleCotizacion.put("placa", "Placa");
        infoDetalleCotizacion.put("codigoFasecolda", "Código fasecolda");
        infoDetalleCotizacion.put("marca", "Marca");
        infoDetalleCotizacion.put("modelo", "Modelo");
        infoDetalleCotizacion.put("linea", "Línea");
        infoDetalleCotizacion.put("descripcion", "Descripción");
        infoDetalleCotizacion.put("valorTermino", "Valor término");
        infoDetalleCotizacion.put("prima", "Prima");
        infoDetalleCotizacion.put("subtotal", "Subtotal");
        infoDetalleCotizacion.put("subtotalPrimas", "Subtotal de primas");
        infoDetalleCotizacion.put("impuesto", "Impuesto");
    }

    @Given("he realizado la cotizacion <cotizacion>")
    public void givenIrALaCotizacion(@Named("cotizacion") String cotizacion) {
        cotizacionPADetalleSteps.ir_A_Buscar_Cotizacion_Poliza(cotizacion);
    }

    @When("ingrese al detalle de la cotizacion")
    public void verDetalleCotizacion() {
        cotizacionPADetalleSteps.ver_Detalle_Cotizacion();
    }

    @Then("se debe mostrar la informacion del detalle de cotizacion por riesgo")
    public void thenMostrarInformacionDetalleCotizacion(){
        cotizacionPADetalleSteps.validar_Informacion_Detalle_Cotizacion(infoDetalleCotizacion);
    }

    @Then("se debe mostrar en la columna \"Termino\" el limite o deducible de la cobertura en el caso de que aplique")
    @Pending
    public void thenValidarTerminoCobertura(){
        //se ejecuta manualmente hasta que se realice la configuracion de rating
        cotizacionPADetalleSteps.validarTerminoCobertura();
    }

    @Then("se debe mostrar en la columna \"Termino\" el limite de la cobertura en el caso de que aplique")
    @Pending
    public void thenValidarLimiteCobertura(){
        //se ejecuta manualmente hasta que se realice la configuracion de rating
        cotizacionPADetalleSteps.validarTerminoCobertura();
    }

    @Then("se debe mostrar en la columna \"Termino\" el deducible de la cobertura en el caso de que aplique")
    @Pending
    public void thenValidarDeducibleCobertura(){
        //se ejecuta manualmente hasta que se realice la configuracion de rating
        cotizacionPADetalleSteps.validarTerminoCobertura();
    }
}