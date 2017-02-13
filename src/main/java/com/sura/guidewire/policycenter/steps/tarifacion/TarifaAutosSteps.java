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
    public void agregarAseguradosDelDirectorio(String tipoDocumento, String documento) {
        tarifaAutosPage.agregarAsegurado(tipoDocumento, documento);
        vehiculoPage.clickSiguiente();
    }

    @Step
    public void agregarAsegurados(String tipoDocumento, String documento) {
        tarifaAutosPage.agregarAsegurado(tipoDocumento, documento);
        vehiculoPage.clickSiguienteConMensaje();
    }

    @Step
    public void agregarVehiculo(ExamplesTable datosPoliza) {
        vehiculoPage.crearVehiculo();
        tarifaAutosPage.relacionarAsegurado();
        vehiculoPage.agregarVehiculo(datosPoliza);
        vehiculoPage.clickSiguiente();
        tarifaAutosPage.esperarPorPantallaCoberturas();
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
    public void seleccionarCoberturasComisionPactada(ExamplesTable coberturas){
        vehiculoPage.clickSiguiente();
        tarifaAutosPage.seleccionarCoberturasRC(coberturas);
        tarifaAutosPage.seleccionarPerdidasParcialesHurtoDanios(coberturas);
        tarifaAutosPage.cotizar();
    }

    @Step
    public void verificarTarifacionTotal(String primaTotal, String iva, String costoTotal) {
        tarifaAutosPage.verificarTarifacionTotal(primaTotal, iva, costoTotal);
    }

    @Step
    public void verificarNoDependenciaDeCobertura() {
        tarifaAutosPage.verificarDependenciaDeCobertura();
    }

    @Step
    public void verificarDependenciaDeCobertura() {
        tarifaAutosPage.marcharCoberturaAccidentes();
        tarifaAutosPage.verificarDependenciaDeCobertura();
        tarifaAutosPage.desMarcarCoberturas();
        tarifaAutosPage.verificarCoberturaAccidentes();
    }

    @Step
    public void ingresarComisionPactada(String estado, String valor) {
        tarifaAutosPage.ingresarComisionPactada(estado, valor);
    }
}
