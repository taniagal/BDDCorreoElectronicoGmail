package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.RequisitosPorDniAutosPage;
import com.sura.guidewire.policycenter.pages.ValidacionesInformacionDeVehiculoPage;
import com.sura.guidewire.policycenter.pages.tarifacion.TarifaAutosPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;


public class RequisitosPorDniAutosSteps extends ScenarioSteps {
    @Page
    TarifaAutosPage tarifaAutosPage;

    @Page
    RequisitosPorDniAutosPage requisitosPorDniAutosPage;

    @Page
    ValidacionesInformacionDeVehiculoPage vehiculoPage;

    @Step
    public void agregarBeneficiarioAutos(String tipoDocumento, String numeroDocumento, String tipoBeneficiario) {
        requisitosPorDniAutosPage.agregarBeneficiarioAutos(tipoDocumento, numeroDocumento, tipoBeneficiario);
    }

    @Step
    public void agregarVehiculo(ExamplesTable datosPoliza) {
        vehiculoPage.crearVehiculo();
        tarifaAutosPage.relacionarAsegurado();
        vehiculoPage.agregarVehiculo(datosPoliza);
    }

    @Step
    public void cambiarFechaCancelacion(String fecha) {
        requisitosPorDniAutosPage.cambiarFechaCancelacion(fecha);
    }

    @Step
    public void irARequisitos() {
        requisitosPorDniAutosPage.irARequisitos();
    }

    @Step
    public void validarDniRequisitos(ExamplesTable mensaje) {
        requisitosPorDniAutosPage.nombresDni(mensaje);
    }

    public void validarMensajeRequsiitosPendientes(ExamplesTable mensaje) {
        Map<String, String> asuntosBloquantes;
        for (int i = 0; i < mensaje.getRowCount(); i++) {
            asuntosBloquantes = mensaje.getRows().get(i);
            MatcherAssert.assertThat("mensaje personalizado", requisitosPorDniAutosPage.validarMensajeRequisitosPendientes(), Matchers.containsString(String.valueOf(asuntosBloquantes)));
        }

    }
}


