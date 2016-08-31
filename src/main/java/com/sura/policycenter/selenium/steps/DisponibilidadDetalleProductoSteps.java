package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.DisponibilidadDetalleProductoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DisponibilidadDetalleProductoSteps extends ScenarioSteps {

    DisponibilidadDetalleProductoPage disponibilidadDetalleProductoPage;

    @Step
    public void accionarNuevoEnvio() {
        disponibilidadDetalleProductoPage.accionarNuevoEnvio();
    }

    @Step
    public void verInformacionPoliza() {
        disponibilidadDetalleProductoPage.verInformacionDePoliza();
    }

    @Step
    public void seleccionarAgente(String agente) {
        disponibilidadDetalleProductoPage.seleccionarAgente(agente);
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