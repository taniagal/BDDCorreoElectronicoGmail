package com.sura.policycenter.selenium.steps;
import com.sura.policycenter.selenium.pages.DetallesDeUbicacionPage;
import com.sura.policycenter.selenium.pages.InicioPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;


public class DetallesDeUbicacionSteps extends ScenarioSteps {

    private final DetallesDeUbicacionPage detallesDeUbicacionPage = new DetallesDeUbicacionPage(getDriver());
    public DetallesDeUbicacionSteps(Pages pages){
        super(pages);
    }

    private InicioPage inicioPage() {
        return getPages().currentPageAt(InicioPage.class);
    }

    @Step
    public void irANuevaPoliza(String cuenta, String organizacion, String agente){
        detallesDeUbicacionPage.irANuevaCotizacion();
        detallesDeUbicacionPage.agregarDatos(cuenta,organizacion,agente);
    }

    @Step
    public void validarCamposnuevos(){
        detallesDeUbicacionPage.irAUbicacion();
        detallesDeUbicacionPage.validarCamposNuevos();
    }

    @Step
    public void agregarUbicacion(String descripcion, String actividad){
       detallesDeUbicacionPage.agregarUbicacion(descripcion, actividad);
    }

    @Step
    public void agregarDireccion(String direccion, String departamento, String ciudad) {
        detallesDeUbicacionPage.agregarDireccion(direccion, departamento, ciudad);
    }

    @Step
    public void validarIngresoUbicacion(){
        detallesDeUbicacionPage.validarIngresoDeUbicacion();
    }

    @Step
    public void verificarMensaje(String mensaje) {
        detallesDeUbicacionPage.verificarMensaje(mensaje);
    }

    @Step
    public void verificarMensajeDireccion(String mensaje) {
        detallesDeUbicacionPage.verificarMensajeDireccion(mensaje);
    }
}
