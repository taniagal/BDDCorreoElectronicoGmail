package com.sura.guidewire.policycenter.steps.tarifacion;

import com.sura.guidewire.policycenter.pages.tarifacion.TarifaAutosPage;
import com.sura.guidewire.policycenter.pages.ValidacionesInformacionDeVehiculoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class TarifaAutosSteps extends ScenarioSteps {
    TarifaAutosPage tarifaAutosPage = new TarifaAutosPage(getDriver());
    ValidacionesInformacionDeVehiculoPage vehiculoPage =  new ValidacionesInformacionDeVehiculoPage(getDriver());
    public TarifaAutosSteps(Pages page) {
        super(page);
    }

    @Step
    public void agregarAsegurados(String tipoDocumento, String documento) {
        tarifaAutosPage.seleccionarAsegurado(tipoDocumento,documento);
        vehiculoPage.clickSiguiente();
    }

    @Step
    public void agregarVehiculo(ExamplesTable datosPoliza) {
        vehiculoPage.crearVehiculo();
        tarifaAutosPage.relacionarAsegurado();
        vehiculoPage.agregarVehiculo(datosPoliza);
        vehiculoPage.clickSiguiente();
    }

    @Step
    public void agregarCoberturas(ExamplesTable datosCoberturas) {
        tarifaAutosPage.seleccionarCoberturas(datosCoberturas);
        tarifaAutosPage.desMarcarCoberturas();
        tarifaAutosPage.cotizar();
    }

    @Step
    public void seleciconarCoberturas(ExamplesTable coberturas) {
        tarifaAutosPage.seleccionarCoberturas(coberturas);
        tarifaAutosPage.seleccionarCoberturas1(coberturas);
        tarifaAutosPage.seleccionarCoberturasDeDanios(coberturas);
        tarifaAutosPage.seleccionarCoberturas2(coberturas);
        tarifaAutosPage.seleccionarCoberturas3(coberturas);
        tarifaAutosPage.cotizar();
    }

    @Step
    public void agregarCoberturasRC(ExamplesTable coberturas){
        tarifaAutosPage.seleccionarCoberturasRC(coberturas);
    }

    @Step
    public void verificarTarifacion(String valor) {
        tarifaAutosPage.verificarTarifacion(valor);
    }

    @Step
    public void verificarTarifacionPorCoberturas(ExamplesTable valor) {
        tarifaAutosPage.verificarTarifacionPorCoberturas(valor);
    }

    @Step
    public void irACoverturas() {
        vehiculoPage.clickSiguiente();
    }
}
