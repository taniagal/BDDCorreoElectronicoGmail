package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.DisponibilidadDetalleProductoPage;
import com.sura.guidewire.policycenter.pages.commons.NuevaCotizacionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

public class DisponibilidadDetalleProductoSteps extends ScenarioSteps {

    DisponibilidadDetalleProductoPage disponibilidadDetalleProductoPage;
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
        String codigoAgente = datosAgente.get("agente");
        nuevaCotizacionPage.seleccionarOficinaDeRadicacionYAgente(oficina, codigoAgente);
    }

    @Step
    public void validarLaOrganizacion(String organizacion) {
        disponibilidadDetalleProductoPage.validarLaOrganizacion(organizacion);
    }

    @Step
    public void validarElCanal(String canal) {
        disponibilidadDetalleProductoPage.validarElCanal(canal);
    }

    @Step
    public void validarElProducto(String producto) {
        disponibilidadDetalleProductoPage.validarElProducto(producto);
    }
}