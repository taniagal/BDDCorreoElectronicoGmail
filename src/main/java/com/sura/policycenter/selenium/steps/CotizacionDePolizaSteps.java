package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.CotizacionDePolizaPage;
import java.util.Map;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;


public class CotizacionDePolizaSteps extends ScenarioSteps  {

    private final CotizacionDePolizaPage cotizacionDePolizaPage = new CotizacionDePolizaPage(getDriver());

    public CotizacionDePolizaSteps(Pages pages){
        super(pages);
    }

    @Step
    public void ingresarARevisionPoliza() {
        cotizacionDePolizaPage.ingresarARevisionPoliza();
    }

    @Step
    public void verDetalleCotizacion() {
        cotizacionDePolizaPage.verDetalleCotizacion();
    }

    @Step
    public void validarInformacionCotizacion(Map<String, String> infoCotizacionPoliza, ExamplesTable informacionCotizacion) {
        cotizacionDePolizaPage.validarInformacionCotizacion(infoCotizacionPoliza, informacionCotizacion);
    }

    @Step
    public void validarDireccion(String direccion) {
        cotizacionDePolizaPage.validarDireccion(direccion);
    }

    @Step
    public void validarBloqueoCotizacion(String mensaje) {
        cotizacionDePolizaPage.validarBloqueoCotizacion(mensaje);
    }

    @Step
    public void validarFigurasCotizacion() {
        cotizacionDePolizaPage.validarTipoRiesgo();
    }

    @Step
    public void validarDatosCotizacionPEP(String asegurado, String placa) {
        cotizacionDePolizaPage.validarDatosCotizacion(asegurado,placa);
    }

    @Step
    public void validarDireccionTomador(String direccion) {
        cotizacionDePolizaPage.validarDireccionTomador(direccion);
    }

    @Step
    public void ingresarACotizacion() {
        cotizacionDePolizaPage.ingresarACotizacion();
    }

    @Step
    public void validarTipoRiesgo() {
        cotizacionDePolizaPage.validarTipoRiesgo();
    }

    @Step
    public void validarBloqueoChasis(String mensaje) {
        cotizacionDePolizaPage.validarBloqueoCotizacion(mensaje);
    }

    @Step
    public void validarBloqueoPorExclusividad(String mensaje) {
        cotizacionDePolizaPage.validarBloqueoCotizacion(mensaje);
    }

    @Step
    public void mostrar_Valor_A_Pagar_Por_Cuota_Y_Numero_De_Cuotas(String valorCuota, String numeroCuotas) {
        cotizacionDePolizaPage.mostrarValorYCuotas(valorCuota, numeroCuotas);
    }
}
