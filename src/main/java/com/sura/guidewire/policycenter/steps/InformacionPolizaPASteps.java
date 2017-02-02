package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.commons.InicioPage;
import com.sura.guidewire.policycenter.pages.commons.NuevaCotizacionPage;
import com.sura.guidewire.policycenter.utils.menu.opciones.cuenta.OpcionesInformacionPolizaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

import java.util.Map;


public class InformacionPolizaPASteps extends ScenarioSteps {

    @Page
    NuevaCotizacionPage nuevaCotizacionPage;

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
    public void accionarInformacionPoliza() {
        inicioPage().irAInformacionDePoliza();
        nuevaCotizacionPage.llenarInfoPoliza();
    }

    @Step
    public void modificarFechaVigencia(String tipoPlazo, String fechaInicioVigencia) {
        opcionesInformacionPoliza.modificarFechaVigencia(tipoPlazo, fechaInicioVigencia);
    }

    @Step
    public void calcularFechaFinVigencia(String fechaFinVigencia) {
        opcionesInformacionPoliza.calcularFechaFinVigencia(fechaFinVigencia);
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
    public void definirPolizaFinanciada() {
        opcionesInformacionPoliza.definirPolizaFinanciada();
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

    @Step
    public void no_Indicar_Poliza_Financiada() {
        opcionesInformacionPoliza.noIndicarPolizaFinanciada();
    }

    @Step
    public void no_Habilitar_Numero_De_Cuotas() {
        opcionesInformacionPoliza.noHabilitarNumeroCuotas();
    }

    @Step
    public void seleccionar_Opcion_Siguiente() {
        opcionesInformacionPoliza.seleccionarOpcionSiguiente();
    }

    @Step
    public void mostrar_Mensaje_Advertencia_Financiacion(String mensaje) {
        opcionesInformacionPoliza.validarMensajeFinanciacion(mensaje);
    }
}
