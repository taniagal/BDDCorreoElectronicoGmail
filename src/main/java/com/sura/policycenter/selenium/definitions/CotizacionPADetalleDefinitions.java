package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.pages.InicioPage;
import com.sura.policycenter.selenium.steps.CotizacionPADetalleSteps;
import com.sura.policycenter.selenium.steps.HistorialCuentaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;

import java.util.HashMap;
import java.util.Map;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;

public class CotizacionPADetalleDefinitions {

    @Steps
    CotizacionPADetalleSteps cotizacionPADetalleSteps;

    @Steps
    HistorialCuentaSteps historialCuentaSteps;

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

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
    public void irALaCotizacion(@Named("cotizacion") String cotizacion) {
        inicioPage().irABuscarSubPoliza(cotizacion);
    }

    @Then("se debe mostrar la informacion del detalle de cotizacion por riesgo")
    public void thenMostrarInformacionDetalleCotizacion(){
        cotizacionPADetalleSteps.validarInformacionDetalleCotizacion(infoDetalleCotizacion);
    }
}
