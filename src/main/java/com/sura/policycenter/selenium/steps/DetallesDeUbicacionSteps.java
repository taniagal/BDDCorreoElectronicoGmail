package com.sura.policycenter.selenium.steps;
import com.sura.policycenter.selenium.pages.DetallesDeUbicacionPage;
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
    public void ir_a_nueva_poliza(ExamplesTable datosCotizacion){
        detallesDeUbicacionPage.irANuevaCotizacion();
        detallesDeUbicacionPage.setDatos(datosCotizacion);
    }

    @Step
    public void validarCamposnuevos(){
        detallesDeUbicacionPage.irAUbicacion();
        detallesDeUbicacionPage.validarCamposNuevos();
    }

    @Step
    public void agregar_ubicacion(String descripcion, String actividad){
       detallesDeUbicacionPage.setUbicacion(descripcion, actividad);
    }

    @Step
    public void agregar_direccion(String direccion, String departamento, String ciudad) {
        detallesDeUbicacionPage.setDireccion(direccion, departamento, ciudad);
    }

    @Step
    public void validar_campos_nuevos(){
        detallesDeUbicacionPage.irAUbicacion();
        detallesDeUbicacionPage.validarCamposNuevos();
    }

    @Step
    public void validar_ingreso_ubicacion(){
        detallesDeUbicacionPage.validarIngresoDeUbicacion();
    }

    @Step
    public void verificar_mensaje(String mensaje) {
        detallesDeUbicacionPage.verificarMensaje(mensaje);
    }
}
