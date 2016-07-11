package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.DetalleRegistrosSuscripcionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class DetalleRegistrosSuscripcionSteps extends ScenarioSteps{

    private DetalleRegistrosSuscripcionPage detalleRegistrosSuscripcionPage;

//    public DetalleRegistrosSuscripcionSteps(Pages pages){
//        super(pages);
//    }

    @Step
    public void validarCamposDetalle(String producto, String nroEnvio, String estado, String nroPoliza) {
        detalleRegistrosSuscripcionPage.validarCamposDetalle(producto, nroEnvio, estado, nroPoliza);
    }

    @Step
    public void buscarRegistrosSucripcion() {
        detalleRegistrosSuscripcionPage.buscarRegistrosSuscripcion();
    }

    @Step
    public void validarNombresFiltros(String estado, String transaccion) {
        detalleRegistrosSuscripcionPage.validarNombresFiltros(estado, transaccion);
    }

    @Step
    public void validarCamposRegistros(String nombre, String tipoDeTransaccion, String nroDeTransacciones) {
        detalleRegistrosSuscripcionPage.validarCamposRegistros(nombre, tipoDeTransaccion, nroDeTransacciones);
    }

    @Step
    public void buscarDetalleRegistrosDeSuscripcion() {
        detalleRegistrosSuscripcionPage.buscarDetalleRegistrosDeSuscripcion();
    }

    @Step
    public void validarTotal(String total) {
        detalleRegistrosSuscripcionPage.validarTotal(total);
    }

    @Step
    public void validarSumaGrupo(String suma) {
        detalleRegistrosSuscripcionPage.validarSumaGrupo(suma);
    }

    @Step
    public void validarVisibilidadMenuAnalisisDeRiesgo(){
        detalleRegistrosSuscripcionPage.validarVisibilidadMenuAnalisisDeRiesgo();
    }

    @Step
    public void validarVisibilidadMenuActividades(){
        detalleRegistrosSuscripcionPage.validarVisibilidadMenuActividades();
    }

    @Step
    public void validarTituloSumatoriaDeCotizaciones(String titulo) {
        detalleRegistrosSuscripcionPage.validarTituloSumatoriaDeCotizaciones(titulo);
    }

}
