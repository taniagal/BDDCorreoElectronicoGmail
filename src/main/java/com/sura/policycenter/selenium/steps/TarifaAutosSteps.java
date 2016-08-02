package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.TarifaAutosPage;
import com.sura.policycenter.selenium.pages.ValidacionesInformacionDeVehiculoPage;
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
    public void agregar_informacion_de_poliza(ExamplesTable datosPoliza) {
        vehiculoPage.clickSiguiente();
        tarifaAutosPage.setInformacionDePoliza(datosPoliza);
        vehiculoPage.clickSiguiente();
    }

    @Step
    public void agregar_asegurados() {
        tarifaAutosPage.setAsegurados();
        vehiculoPage.clickSiguiente();
    }

    @Step
    public void agregar_vehiculo(ExamplesTable datosPoliza) {
        vehiculoPage.agregarVehiculo(datosPoliza);
        tarifaAutosPage.relacionarAsegurado();
        vehiculoPage.clickSiguiente();
    }

    @Step
    public void agregar_coberturas(ExamplesTable datosCoberturas) {
        tarifaAutosPage.setCoberturas(datosCoberturas);
        tarifaAutosPage.desMarcarCoberturas();
        tarifaAutosPage.cotizar();
    }

    @Step
    public void seleciconar_coberturas(ExamplesTable coberturas) {
        tarifaAutosPage.setCoberturas(coberturas);
        tarifaAutosPage.selectCoberturas(coberturas);
        vehiculoPage.volver();
        vehiculoPage.clickSiguiente();
        tarifaAutosPage.selectCoberturas2(coberturas);
        tarifaAutosPage.cotizar();
    }

    @Step
    public void verificar_tarifacion(String valor) {
        tarifaAutosPage.verificarTarifacion(valor);
    }

    @Step
    public void verificar_tarifacion_por_coberturas(ExamplesTable valor) {
        tarifaAutosPage.verificarTarifacionPorCoberturas(valor);
    }
}
