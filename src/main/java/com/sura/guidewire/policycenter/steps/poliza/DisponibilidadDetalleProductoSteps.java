package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.commons.NuevaCotizacionPage;
import com.sura.guidewire.policycenter.pages.poliza.DisponibilidadDetalleProductoPage;

import java.util.Map;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

public class DisponibilidadDetalleProductoSteps extends ScenarioSteps {

    @Page
    DisponibilidadDetalleProductoPage disponibilidadDetalleProductoPage;

    @Page
    NuevaCotizacionPage nuevaCotizacionPage;

    @Step
    public void accionarNuevoEnvio() {
        disponibilidadDetalleProductoPage.accionarNuevoEnvio();
    }

    @Step
    public void verInformacionPoliza() {
        disponibilidadDetalleProductoPage.verInformacionDePoliza();
    }

    @Step
    public void seleccionarAgente(ExamplesTable agente) {
        Map<String, String> datosAgente = agente.getRows().get(0);
        String oficina = datosAgente.get("oficina");
        String codigoAgente = datosAgente.get("agente_oficina");
        nuevaCotizacionPage.seleccionarOficinaDeRadicacionYAgente(oficina, codigoAgente);
    }
}