package com.sura.policycenter.selenium.definitions;

import com.google.inject.name.Named;
import com.sura.policycenter.selenium.steps.DetalleRegistrosSuscripcionSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

public class DetalleRegistrosSuscripcionDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    DetalleRegistrosSuscripcionSteps detalleRegistrosSuscripcionSteps;


    @When("consulte los registros de suscripcion")
    public void buscarRegistrosDeSucripcion() {
        detalleRegistrosSuscripcionSteps.buscarRegistrosSucripcion();
    }

    @Then("los filtros deben ser <estado>, <transaccion>")
    public void validarNombresFiltros(@Named("estado") String estado,
                                      @Named("transaccion") String transaccion) {
        detalleRegistrosSuscripcionSteps.validarNombresFiltros(estado, transaccion);
    }

    @Then("debo ver la informacion del registro de suscripcion <nombre>, <tipoDeTransaccion>, <nroDeTransacciones>")
    public void validarCamposRegistros(@Named("nombre") String nombre,
                                       @Named("tipoDeTransaccion") String tipoDeTransaccion,
                                       @Named("nroDeTransacciones") String nroDeTransacciones) {
        detalleRegistrosSuscripcionSteps.validarCamposRegistros(nombre, tipoDeTransaccion, nroDeTransacciones);
    }

    @When("busque el de detalle de los registros de suscripcion")
    public void buscarDetalleDeRegistrosDeSuscripcion() {
        detalleRegistrosSuscripcionSteps.buscarDetalleRegistrosDeSuscripcion();
    }

    @Then("debo ver la informacion del registro de suscripcion producto <producto>, <nroEnvio>, <estado>, <nroPoliza>")
    public void validarCamposDetalle(@Named("producto") String producto,
                                     @Named("nroEnvio") String nroEnvio,
                                     @Named("estado") String estado,
                                     @Named("nroPoliza") String nroPoliza) {
        detalleRegistrosSuscripcionSteps.validarCamposDetalle(producto, nroEnvio, estado, nroPoliza);
    }

    @Then("debo ver el costo total <total> para las cotizaciones en estado cotizado")
    public void verTotal(@Named("total") String total) {
        detalleRegistrosSuscripcionSteps.validarTotal(total);
    }

    @Then("debo ver la sumatoria <suma> de todas las cotizaciones y renovaciones independiente de su estado")
    public void verSumaGrupo(@Named("suma") String suma) {
        detalleRegistrosSuscripcionSteps.validarSumaGrupo(suma);
    }

    @Then("no debe mostrar el menu actividades")
    public void validarVisibilidadMenuActividades() {
        detalleRegistrosSuscripcionSteps.validarVisibilidadMenuActividades();
    }

    @Then("no debe mostrar el menu analisis de riesgo")
    public void validarVisibilidadMenuAnalisisDeRiesgo() {
        detalleRegistrosSuscripcionSteps.validarVisibilidadMenuAnalisisDeRiesgo();
    }
    @Then("en la sumatoria de cotizaciones me debe mostrar el titulo de <titulo>")
    public void validarTituloSumatoriaDeCotizaciones(@Named("titulo") String titulo) {
        detalleRegistrosSuscripcionSteps.validarTituloSumatoriaDeCotizaciones(titulo);
    }

}
