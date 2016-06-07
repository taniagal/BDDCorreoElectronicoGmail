package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.InicioPage;
import com.sura.policycenter.selenium.pages.menu.opciones.cuenta.OpcionesInformacionPolizaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.Map;

public class InformacionPolizaPASteps extends ScenarioSteps {

    OpcionesInformacionPolizaPage opcionesInformacionPoliza = new OpcionesInformacionPolizaPage(getDriver());

    private InicioPage inicioPage() { return getPages().currentPageAt(InicioPage.class); }
    public InformacionPolizaPASteps(Pages pages) {
        super(pages);
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
    public void seleccionarOficinaRadicacion(String oficinaRadicacion) {
        opcionesInformacionPoliza.seleccionarOficinaRadicacion(oficinaRadicacion);
    }

    @Step
    public void validarSeleccionOficinaRadicacion(String oficinaRadicacion) {
        opcionesInformacionPoliza.validarSeleccionOficinaRadicacion(oficinaRadicacion);
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
    public void validarRetroactividadPoliza(String fechaInicioVigencia, String mensaje) {
        opcionesInformacionPoliza.validarRetroactividadPoliza(fechaInicioVigencia, mensaje);
    }
}
