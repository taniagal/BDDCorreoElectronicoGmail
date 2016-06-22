package com.sura.policycenter.selenium.steps;


import com.sura.policycenter.selenium.pages.CoberturaGlobalPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class CoberturaGlobalSteps extends ScenarioSteps {
    CoberturaGlobalPage coberturaGlobalPage = new CoberturaGlobalPage(getDriver());
    public CoberturaGlobalSteps(Pages pages){
        super(pages);
    }

    @Step
    public void ir_a_coberturas_globales(){
        coberturaGlobalPage.irACoberturasGlobales();
    }

    @Step
    public void agregar_coberturas_globales(String descripcion, String tipoCobertura, String valor, String nombreCobertura){
        coberturaGlobalPage.agregarCoberturasGlobales(descripcion, tipoCobertura, valor,nombreCobertura);
    }

    @Step
    public void verificar_coberturas_y_ubicaciones() {
        coberturaGlobalPage.verificarCoberturasIncluidas();
        coberturaGlobalPage.verificarUbicacionesCubiertas();
    }

    @Step
    public void seleccionar_cobertura_unica(String descripcion, String tipoCobertura, String nombreCobertura) {
        coberturaGlobalPage.seleccionarCoberturaUnica(descripcion,tipoCobertura,nombreCobertura);
    }

    @Step
    public void verificar_mensaje_error(String mensaje) {
        coberturaGlobalPage.verificarMensajeError(mensaje);
    }

}
