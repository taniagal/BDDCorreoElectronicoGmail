package com.sura.policycenter.selenium.steps.colectivas;

import com.sura.policycenter.selenium.pages.CuentaPage;
import com.sura.policycenter.selenium.pages.DetalleDeAseguradoDeCotizacionPage;
import com.sura.policycenter.selenium.pages.IngresarInformacionDeCuenta;
import com.sura.policycenter.selenium.pages.ValidacionesInformacionDeVehiculoPage;
import com.sura.policycenter.selenium.pages.colectivas.AgregarRiesgosPolizaColectivaPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

public class AgregarRiesgosPolizaColectivaSteps extends ScenarioSteps {

    AgregarRiesgosPolizaColectivaPages agregarRiesgosPolizaColectivaPages;
    IngresarInformacionDeCuenta ingresarInformacionDeCuenta;
    CuentaPage cuentaPage;
    DetalleDeAseguradoDeCotizacionPage detalleDeAseguradoDeCotizacionPage;
    ValidacionesInformacionDeVehiculoPage validacionesInformacionDeVehiculoPage;

    @Step
    public void clicEnAgregarRiesgoInfoPoliza() {
        agregarRiesgosPolizaColectivaPages.clicEnAgregarRiesgoInfoPoliza();
    }

    @Step
    public void clicEnAgregarRiesgo() {
        agregarRiesgosPolizaColectivaPages.clicEnAgregarRiesgo();
    }

    @Step
    public void ingresarDatosParaBuscarPersonalNatural(String nombre, String apellido) {
        ingresarInformacionDeCuenta.ingresarNombreYApellido(nombre, apellido);
        ingresarInformacionDeCuenta.clicEnBuscar();
        ingresarInformacionDeCuenta.crearCuentaNuevaPersonal();
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
    public void relacionarAsegurado() {
        validacionesInformacionDeVehiculoPage.relacionarAseguradoDelVehiculo();
    }

    @Step
    public void ingresarCoberturas() {

    }
}
