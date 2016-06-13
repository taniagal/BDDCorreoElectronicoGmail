package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.CotizacionPADetalleSteps;
import com.sura.policycenter.selenium.steps.HistorialCuentaSteps;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

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
        cotizacionPADetalleSteps.irABuscarSubPoliza(cotizacion);
    }

    @When("ingrese al detalle de la cotizacion")
    public void verDetalleCotizacion() {
        cotizacionPADetalleSteps.verDetalleCotizacion();
    }

    @Then("se debe mostrar la informacion del detalle de cotizacion por riesgo")
    public void thenMostrarInformacionDetalleCotizacion(){
        cotizacionPADetalleSteps.validarInformacionDetalleCotizacion(infoDetalleCotizacion);
    }

    @SuppressWarnings("EmptyMethod")
    @Then("se debe mostrar en la columna \"Termino\" el limite o deducible de la cobertura en el caso de que aplique")
    @Manual
    public void thenValidarTerminoCobertura(){
        //se ejecuta manualmente
        //cotizacionPADetalleSteps.validarTerminoCobertura();
    }

    @SuppressWarnings("EmptyMethod")
    @Then("se debe mostrar en la columna \"Termino\" el limite de la cobertura en el caso de que aplique")
    @Manual
    public void thenValidarLimiteCobertura(){
        //se ejecuta manualmente
        //cotizacionPADetalleSteps.validarTerminoCobertura();
    }

    @SuppressWarnings("EmptyMethod")
    @Then("se debe mostrar en la columna \"Termino\" el deducible de la cobertura en el caso de que aplique")
    @Manual
    public void thenValidarDeducibleCobertura(){
        //se ejecuta manualmente
        //cotizacionPADetalleSteps.validarTerminoCobertura();
    }
}
