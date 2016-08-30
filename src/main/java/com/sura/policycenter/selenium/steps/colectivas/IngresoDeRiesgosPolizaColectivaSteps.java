package com.sura.policycenter.selenium.steps.colectivas;

import com.sura.policycenter.selenium.pages.*;
import com.sura.policycenter.selenium.pages.colectivas.IngresoDeRiesgosPolizaColectivaPages;
import com.sura.policycenter.selenium.pages.menu.opciones.cuenta.OpcionesInformacionPolizaPage;
import java.util.Map;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;


public class IngresoDeRiesgosPolizaColectivaSteps extends ScenarioSteps {

    IngresoDeRiesgosPolizaColectivaPages ingresoDeRiesgosPolizaColectivaPages;
    IngresarInformacionDeCuenta ingresarInformacionDeCuenta;
    CuentaPage cuentaPage;
    DetalleDeAseguradoDeCotizacionPage detalleDeAseguradoDeCotizacionPage;
    ValidacionesInformacionDeVehiculoPage validacionesInformacionDeVehiculoPage;
    IngresoDeCoberturasPage ingresoDeCoberturasPage;
    AprobacionDeAnalisisDeRiesgoPage aprobacionDeAnalisisDeRiesgoPage;
    ExpedicionDePolizaPage expedicionDePolizaPage;
    OpcionesInformacionPolizaPage opcionesInformacionPolizaPage;

    @Step
    public void clicEnAgregarRiesgoInfoPoliza() {
        ingresoDeRiesgosPolizaColectivaPages.clicEnAgregarRiesgoInfoPoliza();
    }

    @Step
    public void clicEnAgregarRiesgo() {
        ingresoDeRiesgosPolizaColectivaPages.clicEnAgregarRiesgo();
    }

    @Step
    public void ingresarDatosParaBuscarPersonalNatural(String nombre, String apellido) {
        ingresarInformacionDeCuenta.ingresarNombreYApellido(nombre, apellido);
        ingresarInformacionDeCuenta.clicEnBuscar();
        ingresarInformacionDeCuenta.crearCuentaNuevaPersonal();
    }

    @Step
    public void ingresarDatosParaBuscarRazonSocial(String razonSocial) {
        ingresarInformacionDeCuenta.ingresarRazonSocial(razonSocial);
        ingresarInformacionDeCuenta.clicEnBuscar();
    }

    @Step
    public void crearCuentaPersonaNatural(ExamplesTable cuentaNueva) {
        Map<String, String> riesgoColectivas = cuentaNueva.getRows().get(0);
        cuentaPage.agregarTipoDocumento(riesgoColectivas.get("tipoDocumento"),
                riesgoColectivas.get("numeroDocumento"));
        cuentaPage.agregarNombres(riesgoColectivas.get("nombre"), riesgoColectivas.get("apellido"),
                riesgoColectivas.get("fechaNacimiento"));
        cuentaPage.agregarDireccion(riesgoColectivas.get("tipoDireccion"), riesgoColectivas.get("direccion"),
                riesgoColectivas.get("departamento"), riesgoColectivas.get("ciudad"));
        cuentaPage.agregarOrganizacion(riesgoColectivas.get("organizacionCuenta"),
                riesgoColectivas.get("agenteCuenta"));
        cuentaPage.actualizar();
    }

    @Step
    public void validarAseguradoAgregado(ExamplesTable asegurados) {
        detalleDeAseguradoDeCotizacionPage.validarAseguradosAgregados(asegurados);
    }

    @Step
    public void relacionarAsegurado(String asegurado) {
        validacionesInformacionDeVehiculoPage.relacionarAseguradoDelVehiculo(asegurado);
    }

    @Step
    public void ingresarCoberturas() {
        ingresoDeCoberturasPage.ingresarLimite();
        ingresoDeCoberturasPage.ingresarDeducible();
        ingresoDeCoberturasPage.clickEnCheckHurto();
        ingresoDeCoberturasPage.cotizar();
    }

    @Step
    public void aprobarAnalisisDeRiesgo() {
        aprobacionDeAnalisisDeRiesgoPage.aprobarAnalisisDeRiesgo();
    }

    @Step
    public void expedirPoliza() {
        aprobacionDeAnalisisDeRiesgoPage.expedirPoliza();
    }

    @Step
    public void validarOpcionIrAPolizaColectiva() {
        expedicionDePolizaPage.irAPolizaColectiva();
    }

    @Step
    public void validarRiesgoIngresado(ExamplesTable riesgosColectiva) {
        ingresoDeRiesgosPolizaColectivaPages.clicEnAgregarRiesgoInfoPoliza();
        ingresoDeRiesgosPolizaColectivaPages.validarRiesgoIngresado(riesgosColectiva);
    }

    @Step
    public void seleccionarLaCuenta() {
        ingresarInformacionDeCuenta.seleccionarContactoExistente();
    }

    @Step
    public void validarInformacionDePolizaPA(ExamplesTable infoPoliza) {
        opcionesInformacionPolizaPage.irAInformacionDePoliza();
        opcionesInformacionPolizaPage.validarInfoPolizaPA(infoPoliza);
    }

    @Step
    public void irAInformacionDePoliza(){
        opcionesInformacionPolizaPage.irAInformacionDePoliza();
    }

    @Step
    public void seleccionarRiesgoAConsultar(String riesgo) {
        ingresoDeRiesgosPolizaColectivaPages.seleccionarRiesgoAConsultar(riesgo);
    }

    public void clicEnActualizarInformacionDePolizaColectiva() {
        ingresoDeRiesgosPolizaColectivaPages.clicEnActualizarInformacionDePolizaColectiva();
    }

    @Step
    public void validarFechaFinVigenciaPolizaColectivaAutos() {
        opcionesInformacionPolizaPage.validarFechaFinVigenciaPolizaColectivaAutos();
        opcionesInformacionPolizaPage.validarFechaInicioVigenciaPolizaColectiva();
    }

    @Step
    public void validarFechaFinVigenciaPolizaColectivaCommercial(int numeroDias) {
        opcionesInformacionPolizaPage.validarFechaFinVigenciaPolizaColectivaCommercial(numeroDias);
        opcionesInformacionPolizaPage.validarFechaInicioVigenciaPolizaColectiva();
    }

    @Step
    public void validarFechaInicioVigenciaMenorALaPolizaMadre(String mensaje) {
        opcionesInformacionPolizaPage.validarFechaInicioVigenciaMenorALaPolizaMadre(mensaje);
    }
}
