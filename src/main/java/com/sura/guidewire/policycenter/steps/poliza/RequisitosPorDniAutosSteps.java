package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.poliza.RequisitosPorDniAutosPage;
import com.sura.guidewire.policycenter.pages.poliza.ValidacionesInformacionDeVehiculoPage;
import com.sura.guidewire.policycenter.pages.tarifacion.TarifaAutosPage;

import java.util.Map;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;


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
    public void irARequisitos() {
        requisitosPorDniAutosPage.irARequisitos();
    }

    @Step
    public void irARequisitosEnRehabilitacion() {
        requisitosPorDniAutosPage.irARequisitosEnRehabilitacion();
    }

    @Step
    public void diligenciarRequisitos() {
        requisitosPorDniAutosPage.diligenciarRequisitos();
    }

    @Step
    public void validarMensajeRequsiitosPendientes(ExamplesTable mensaje) {
        Map<String, String> asuntosBloquantes;
        String requisitosPorDni = requisitosPorDniAutosPage.validarItems();
        for (int i = 0; i < mensaje.getRowCount(); i++) {
            asuntosBloquantes = mensaje.getRows().get(i);
            MatcherAssert.assertThat("mensaje personalizado", requisitosPorDni, Matchers.containsString(asuntosBloquantes.get("mensaje")));
        }

    }

    @Step
    public void clicBotonExpedicion() {
        requisitosPorDniAutosPage.cotizarYExpedirPoliza();
    }

    @Step
    public void expedirPoliza() {
        requisitosPorDniAutosPage.expedirPoliza();
    }
    @Step
    public void diligenciarTodosLosRequisitos() {
        requisitosPorDniAutosPage.diligenciarTodosLosRequisitos();
    }
    @Step
    public void buscarUsuarioRegla(String[][] reglasEncontradas) {
    requisitosPorDniAutosPage.buscarUsuarioRegla(reglasEncontradas);
    }
    @Step
    public void validarAsignacionActividad() {
        requisitosPorDniAutosPage.validarAsignacionActividad();
    }
}


