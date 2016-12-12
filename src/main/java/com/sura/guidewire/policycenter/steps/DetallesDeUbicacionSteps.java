package com.sura.guidewire.policycenter.steps;
import com.sura.guidewire.policycenter.pages.DetallesDeUbicacionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;


public class DetallesDeUbicacionSteps extends ScenarioSteps {

    private final DetallesDeUbicacionPage detallesDeUbicacionPage = new DetallesDeUbicacionPage(getDriver());
    public DetallesDeUbicacionSteps(Pages pages){
        super(pages);
    }

    @Step
    public void agregarUbicacion(String descripcion, String actividad){
       detallesDeUbicacionPage.setUbicacion(descripcion, actividad);
    }

    @Step
    public void agregarDireccion(String direccion, String departamento, String ciudad) {
        detallesDeUbicacionPage.setDireccion(direccion, departamento, ciudad);
    }

    @Step
    public void validarCamposNuevos(){
        detallesDeUbicacionPage.irAUbicacion();
        detallesDeUbicacionPage.validarCamposNuevos();
    }

    @Step
    public void validarIngresoUbicacion(){
        detallesDeUbicacionPage.validarIngresoDeUbicacion();
    }

    @Step
    public void verificarMensaje(String mensaje) {
        detallesDeUbicacionPage.verificarMensaje(mensaje);
    }
}
