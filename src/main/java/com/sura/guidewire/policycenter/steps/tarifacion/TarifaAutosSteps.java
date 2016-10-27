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
    public void agregar_asegurados() {
        tarifaAutosPage.setAsegurados();
        vehiculoPage.clickSiguiente();
    }

    @Step
    public void agregar_vehiculo(ExamplesTable datosPoliza) {
        vehiculoPage.crearVehiculo();
        tarifaAutosPage.relacionarAsegurado();
        vehiculoPage.agregarVehiculo(datosPoliza);
        vehiculoPage.clickSiguiente();
    }

    @Step
    public void agregar_coberturas(ExamplesTable datosCoberturas) {
        tarifaAutosPage.setCoberturas(datosCoberturas);
        tarifaAutosPage.desMarcarCoberturaHurto();
        tarifaAutosPage.cambiarTipoPlazo();
        tarifaAutosPage.cotizar();
    }

    @Step
    public void seleciconar_coberturas(ExamplesTable coberturas) {
        tarifaAutosPage.setCoberturas(coberturas);
        tarifaAutosPage.seleccionarCoberturas(coberturas);
        tarifaAutosPage.seleccionarCoberturasDeDanios(coberturas);
        vehiculoPage.clickVolver();
        vehiculoPage.clickSiguiente();
        tarifaAutosPage.seleccionarCoberturas2(coberturas);
        vehiculoPage.clickVolver();
        vehiculoPage.clickSiguiente();
        tarifaAutosPage.seleccionarCoberturas3(coberturas);
        tarifaAutosPage.cambiarTipoPlazo();
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
