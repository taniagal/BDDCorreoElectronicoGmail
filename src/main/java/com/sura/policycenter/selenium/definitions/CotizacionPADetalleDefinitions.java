package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.CotizacionPADetalleSteps;
import com.sura.policycenter.selenium.steps.HistorialCuentaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;

import java.util.HashMap;
import java.util.Map;

public class CotizacionPADetalleDefinitions {

    private final Map<String, String> infoDetalleCotizacion = new HashMap<>();

    public CotizacionPADetalleDefinitions(){
        infoDetalleCotizacion.put("labelVehiculo", "Vehículo 1");
        infoDetalleCotizacion.put("placa", "Placa");
        infoDetalleCotizacion.put("codigoFasecolda", "Código fasecolda");
        infoDetalleCotizacion.put("marca", "Marca");
        infoDetalleCotizacion.put("modelo", "Modelo");
        infoDetalleCotizacion.put("linea", "Línea");
    }

    @Steps
    HistorialCuentaSteps historialCuentaSteps;

    @Given("estoy en una cuenta <numeroCuenta>")
    public void givenEstoyEnUnaCuentanumCuenta(@Named("numCuenta") String numCuenta) {
        historialCuentaSteps.seleccionarCuenta(numCuenta);
    }

    @Then("se debe mostrar la informacion del detalle de cotizacion por riesgo")
    public void thenMostrarInformacionDetalleCotizacion(){
        CotizacionPADetalleSteps.validarInformacionDetalleCotizacion(infoDetalleCotizacion);
    }
}
