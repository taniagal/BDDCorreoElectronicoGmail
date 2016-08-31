package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.InicioPage;
import com.sura.policycenter.selenium.pages.menu.opciones.cuenta.OpcionesInformacionPolizaPage;
import java.util.Map;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;


public class InformacionPolizaPASteps extends ScenarioSteps {

    OpcionesInformacionPolizaPage opcionesInformacionPoliza = new OpcionesInformacionPolizaPage(getDriver());

    public InformacionPolizaPASteps(Pages pages) {
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    @Step
    public void accionarNuevaCotizacion() {
        inicioPage().irANuevaCotizacion();
    }

    @Step
    public void seleccionarAgenteCotizacion() {
        opcionesInformacionPoliza.seleccionarAgenteCotizacion();
    }

    @Step
    public void visualizarInformacionPoliza(Map<String, String> infoPoliza) {
        opcionesInformacionPoliza.visualizarInformacionPoliza(infoPoliza);
    }

    @Step
    public void accionarInformacionPoliza() {
        inicioPage().irAInformacionDePoliza();
    }

    @Step
    public void modificarFechaVigencia(String tipoPlazo, String fechaInicioVigencia) {
        opcionesInformacionPoliza.modificarFechaVigencia(tipoPlazo, fechaInicioVigencia);
    }

    @Step
    public void calcularFechaFinVigencia(String fechaInicioVigencia) {
        opcionesInformacionPoliza.calcularFechaFinVigencia(fechaInicioVigencia);
    }

    @Step
    public void adicionarSegundoTomador(String tipoDocumento, String primerNombre, String primerApellido) {
        opcionesInformacionPoliza.adicionarSegundoTomador(tipoDocumento, primerNombre, primerApellido);
    }

    @Step
    public void validarRegistroSegundoTomador(Map<String, String> datosSegundoTomador) {
        opcionesInformacionPoliza.validarRegistroSegundoTomador(datosSegundoTomador);
    }

    @Step
    public void ingresarPorcentajeDescuentoPoliza(String porcentaje) {
        opcionesInformacionPoliza.ingresarPorcentajeDescuentoPoliza(porcentaje);
    }

    @Step
    public void validarMensajePorcentajePoliza(String mensaje) {
        opcionesInformacionPoliza.validarMensajePorcentajePoliza(mensaje);
    }

    public void validarDecimalesPorcentaje(String mensaje) {
        opcionesInformacionPoliza.validarDecimalesPorcentaje(mensaje);
    }

    @Step
    public void definirPolizaFinanciada(String organizacionDetalle, String canalDetalle, String tipoPoliza) {
        opcionesInformacionPoliza.definirPolizaFinanciada(organizacionDetalle, canalDetalle, tipoPoliza);
    }

    @Step
    public void ingresarNumeroCuotas() {
        opcionesInformacionPoliza.ingresarNumeroCuotas();
    }

    @Step
    public void validarRetroactividadPoliza(String mensaje) {
        opcionesInformacionPoliza.validarRetroactividadPoliza(mensaje);
    }

    @Step
    public void modificarFechaInicioVigencia(String organizacionDetalle, String canalDetalle, String tipoPoliza, String tipoPlazo, String fechaInicioVigencia) {
        opcionesInformacionPoliza.modificarFechaInicioVigencia(organizacionDetalle, canalDetalle, tipoPoliza, tipoPlazo, fechaInicioVigencia);
    }

    @Step
    public void seleccionarProducto() {
        opcionesInformacionPoliza.seleccionarProducto();
    }

    @Step
    public void pasar_A_Siguiente_Opcion() {
        opcionesInformacionPoliza.pasarASiguienteOpcion();
    }

    @Step
    public void identificar_Tipo_Y_Numero_De_Identificacion(String tipoDocumento, String numeroDocumento) {
        opcionesInformacionPoliza.identificarTipoYNumeroIdentificacion(tipoDocumento, numeroDocumento);
    }

    @Step
    public void validar_Mensaje_Bloqueo_PEP(String mensaje) {
        opcionesInformacionPoliza.validarMensajeBloqueoPEP(mensaje);
    }

    @Step
    public void permitir_Continuar_Cotizacion() {
        opcionesInformacionPoliza.permitirContinuarCotizacionAsegurados();
    }
}
