package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.poliza.DetallesDeUbicacionPage;
import com.sura.guidewire.policycenter.pages.poliza.EdificiosyUbicacionesWidget;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;


public class DetallesDeUbicacionSteps extends ScenarioSteps {


    private static EdificiosyUbicacionesWidget edificiosyUbicacionesWidget;
    private final DetallesDeUbicacionPage detallesDeUbicacionPage = new DetallesDeUbicacionPage(getDriver());

    public DetallesDeUbicacionSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void agregarUbicacion(String descripcion, String actividad) {
        detallesDeUbicacionPage.setUbicacion(descripcion, actividad);
    }

    @Step
    public void agregarDireccion(String direccion, String departamento, String ciudad) {
        detallesDeUbicacionPage.setDireccion(direccion, departamento, ciudad);
    }

    @Step
    public void validarCamposNuevos() {
        detallesDeUbicacionPage.irAUbicacion();
        detallesDeUbicacionPage.validarCamposNuevos();
    }

    @Step
    public void validarIngresoUbicacion() {
        detallesDeUbicacionPage.validarIngresoDeUbicacion();
    }

    @Step
    public void verificarMensaje(String mensaje) {
        detallesDeUbicacionPage.verificarMensaje(mensaje);
    }

    @Step
    public void agregarMedioDeVenta(String medioVenta) {
        edificiosyUbicacionesWidget.ingresarMedioDeVenta(medioVenta);
    }
}
