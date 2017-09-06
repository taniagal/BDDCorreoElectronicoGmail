package com.sura.guidewire.policycenter.steps.cuenta;

import com.sura.guidewire.policycenter.pages.cuenta.DetalleRegistrosSuscripcionPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

public class DetalleRegistrosSuscripcionSteps extends ScenarioSteps{

    @Page
    DetalleRegistrosSuscripcionPage detalleRegistrosSuscripcionPage;


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
