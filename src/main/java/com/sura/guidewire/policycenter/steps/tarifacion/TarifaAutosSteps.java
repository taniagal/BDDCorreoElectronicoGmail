package com.sura.guidewire.policycenter.steps.tarifacion;

import com.sura.guidewire.policycenter.pages.ValidacionesInformacionDeVehiculoPage;
import com.sura.guidewire.policycenter.pages.tarifacion.TarifaAutosPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class TarifaAutosSteps extends ScenarioSteps {
    TarifaAutosPage tarifaAutosPage = new TarifaAutosPage(getDriver());
    ValidacionesInformacionDeVehiculoPage vehiculoPage = new ValidacionesInformacionDeVehiculoPage(getDriver());

    public TarifaAutosSteps(Pages page) {
        super(page);
    }

    @Step
    public void agregarAsegurados(String tipoDocumento, String documento) {
        tarifaAutosPage.seleccionarAsegurado(tipoDocumento, documento);
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
    public void agregarVehiculoDos(ExamplesTable datosPoliza) {
        vehiculoPage.crearVehiculo();
        tarifaAutosPage.relacionarAsegurado();
        vehiculoPage.agregarVehiculo(datosPoliza);
    }

    @Step
    public void agregarCoberturas(ExamplesTable datosCoberturas) {
        tarifaAutosPage.seleccionarCoberturasBasica(datosCoberturas);
        tarifaAutosPage.desMarcarCoberturas();
        tarifaAutosPage.cotizar();
    }

    @Step
    public void seleciconarCoberturas(ExamplesTable coberturas) {
        tarifaAutosPage.seleccionarCoberturasBasica(coberturas);
        tarifaAutosPage.seleccionarCoberturas1(coberturas);
        tarifaAutosPage.seleccionarCoberturasDanios(coberturas);
        tarifaAutosPage.seleccionarCoberturas2(coberturas);
        tarifaAutosPage.seleccionarCoberturas3(coberturas);
        tarifaAutosPage.cotizar();
    }

    @Step
    public void agregarCoberturasRC(ExamplesTable coberturas) {
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
    public void seleccionarBotonSiguiente() {
        vehiculoPage.clickSiguiente();
    }

    @Step
    public void agregarValorAsegurado(String valorAsegurado) {
        vehiculoPage.irAVehiculos();
        vehiculoPage.agregarValorAsegurado(valorAsegurado);
        tarifaAutosPage.intentarCotizar();
    }

    @Step
    public void seleciconarCoberturasCorbeta(ExamplesTable coberturas) {
        tarifaAutosPage.seleccionarCoberturasRC(coberturas);
        tarifaAutosPage.seleccionarCoberturasCorbeta(coberturas);
    }

    @Step
    public void verificarTarifacionTotal(String primaTotal, String iva, String costoTotal) {
        tarifaAutosPage.verificarTarifacionTotal(primaTotal, iva, costoTotal);
    }
}
