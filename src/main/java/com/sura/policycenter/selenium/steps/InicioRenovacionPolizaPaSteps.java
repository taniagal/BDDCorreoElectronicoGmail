package com.sura.policycenter.selenium.steps;


import com.sura.policycenter.selenium.pages.menu.opciones.poliza.InicioRenovacionPolizaPaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class InicioRenovacionPolizaPaSteps extends ScenarioSteps {

    public InicioRenovacionPolizaPaSteps(Pages pages) {
        super(pages);
    }

    InicioRenovacionPolizaPaPage inicioRenovacionPolizaPaPage;

    @Step
    public void navegar_barra_superior(String cotizacion) {
        inicioRenovacionPolizaPaPage.irABuscarCotizacion(cotizacion);
    }

    @Step
    public void navegar_por_renovacion() {
        inicioRenovacionPolizaPaPage.irARenovacion();
    }

    @Step
    public void validacion_de_mensaje_en_pantalla(String mensaje) {
        inicioRenovacionPolizaPaPage.validaMensajeEnPantalla(mensaje);
    }

    @Step
    public void cancela_operacion_de_renovacion() {
        inicioRenovacionPolizaPaPage.cancelaOperacionRenovacion();
    }

    @Step
    public void aceptar_operacion_de_renovacion() {
        inicioRenovacionPolizaPaPage.aceptaOperacionRenovacion();
    }

    @Step
    public void validacion_en_pantalla_tomador(ExamplesTable datosTomador) {
        inicioRenovacionPolizaPaPage.validacionesPantallaFormularios(datosTomador);
    }

    @Step
    public void validacion_en_pantalla_asegurado(ExamplesTable datosAsegurado) {
        inicioRenovacionPolizaPaPage.validacionesPantallaFormularios(datosAsegurado);
    }

    @Step
    public void validacion_en_pantalla_vehiculo(ExamplesTable datosVehiculo) {
        inicioRenovacionPolizaPaPage.validacionesPantallaFormularios(datosVehiculo);
    }

}
