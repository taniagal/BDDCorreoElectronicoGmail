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
    }
}
