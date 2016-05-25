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
        inicioPage().irANuevoEnvio();
        detallesDeUbicacionPage.agregarDatos(cuenta,organizacion,agente);
        detallesDeUbicacionPage.irAUbicacion();
        detallesDeUbicacionPage.validarCamposNuevos();
    }

    @Step
    public void agregarUbicacion(String direccion, String departamento, String ciudad, String descrpcion){
        detallesDeUbicacionPage.agregarUbicacion(direccion, departamento, ciudad, descrpcion);
        waitABit(5000);
    }



}
