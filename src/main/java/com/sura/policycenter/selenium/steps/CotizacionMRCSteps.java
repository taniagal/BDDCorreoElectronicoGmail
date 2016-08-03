package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.CotizacionMRCPage;
import com.sura.policycenter.selenium.pages.InicioPage;
import java.util.Map;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;


public class CotizacionMRCSteps extends ScenarioSteps {

    private final CotizacionMRCPage cotizacionMRCPage = new CotizacionMRCPage(getDriver());

    public CotizacionMRCSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void ir_A_Buscar_Cotizacion_Poliza(String cotizacion) {
        cotizacionMRCPage.irABuscarCotizacion(cotizacion);
    }

    @Step
    public void ver_Detalle_Cotizacion() {
        cotizacionMRCPage.verDetalleCotizacion();
    }

    @Step
    public void validar_Informacion_Cotizacion(Map<String, String> labelsCotizacionPoliza, ExamplesTable informacionCotizacion) {
        cotizacionMRCPage.validarInformacionCotizacion(labelsCotizacionPoliza, informacionCotizacion);
    }

    @Step
    public void validar_Prima(String primaTotal) {
        cotizacionMRCPage.validarPrima(primaTotal);
    }

    @Step
    public void mostrar_Detalle_Prima_Por_Riesgo(Map<String, String> labelsCotizacionPoliza) {
        cotizacionMRCPage.mostrarDetallePrima(labelsCotizacionPoliza);
    }

    @Step
    public void validar_Bloqueo_Cotizacion(String mensaje) {
        cotizacionMRCPage.validarBloqueoCotizacion(mensaje);
    }

    @Step
    public void ingresar_A_Cotizacion() {
        cotizacionMRCPage.ingresarACotizacion();
    }

    @Step
    public void validar_Tipo_Riesgo() {
        cotizacionMRCPage.validarTipoRiesgo();
    }
}