package com.sura.guidewire.policycenter.steps;


import com.sura.guidewire.policycenter.pages.tarifacion.TarifaTasaUnicaPage;
import com.sura.guidewire.policycenter.utils.menu.Navegacion;
import com.sura.guidewire.policycenter.utils.menu.opciones.poliza.InicioRenovacionPolizaPaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

public class InicioRenovacionPolizaPaSteps extends ScenarioSteps {
    @Page
    InicioRenovacionPolizaPaPage inicioRenovacionPolizaPaPage;
    @Page
    Navegacion navegacion;
    @Page
    TarifaTasaUnicaPage tasaUnicaPage;

    public InicioRenovacionPolizaPaSteps(Pages pages) {
        super(pages);
    }


    @Step
    public void navegarBarraSuperior(String poliza) {
        navegacion.irABuscarPoliza(poliza);
    }

    @Step
    public void navegarPorRenovacion() {
        tasaUnicaPage.nuevaRenovacion();
    }

    @Step
    public void irARenovavion() {
        inicioRenovacionPolizaPaPage.irARenovacion();
    }

    @Step
    public void validacionDeMensajeEnPantalla(String mensaje) {
        inicioRenovacionPolizaPaPage.validaMensajeEnPantalla(mensaje);
    }

    @Step
    public void cancelaOperacionDeRenovacion() {
        inicioRenovacionPolizaPaPage.cancelaOperacionRenovacion();
    }

    @Step
    public void aceptarOperacionDeRenovacion() {
        inicioRenovacionPolizaPaPage.aceptaOperacionRenovacion();
    }

    @Step
    public void validacionEnPantallaTomador(ExamplesTable datosTomador) {
        inicioRenovacionPolizaPaPage.validacionesPantallaFormularios(datosTomador);
    }

    @Step
    public void validacionEnPantallaAsegurado(ExamplesTable datosAsegurado) {
        inicioRenovacionPolizaPaPage.validacionesPantallaFormularios(datosAsegurado);
    }

    @Step
    public void validacionEnPantallaVehiculo(ExamplesTable datosVehiculo) {
        inicioRenovacionPolizaPaPage.validacionesPantallaFormularios(datosVehiculo);
        inicioRenovacionPolizaPaPage.retirarTransaccion();
    }

    @Step
    public void opcionesDeCierre() {
        inicioRenovacionPolizaPaPage.retirarTransaccion();
    }

}
