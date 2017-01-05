package com.sura.guidewire.policycenter.steps.tarifacion;


import com.sura.guidewire.policycenter.pages.tarifacion.ModificadoresDeTarifaPage;
import com.sura.guidewire.policycenter.pages.tarifacion.TarifaAutosPage;
import com.sura.guidewire.policycenter.pages.ValidacionesInformacionDeVehiculoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class ModificadoresDeTarifaSteps extends ScenarioSteps{
    ModificadoresDeTarifaPage modificadoresDeTarifaPage = new ModificadoresDeTarifaPage(getDriver());
    ValidacionesInformacionDeVehiculoPage vehiculoPage = new ValidacionesInformacionDeVehiculoPage(getDriver());
    TarifaAutosPage tarifaAutosPage = new TarifaAutosPage(getDriver());

    public ModificadoresDeTarifaSteps(Pages pages){
        super(pages);
    }

    @Step
    public void agregarPlacaYAsegurado(String placa) {
        vehiculoPage.crearVehiculo();
        tarifaAutosPage.relacionarAsegurado();
        vehiculoPage.agregarPlaca(placa);
    }

    @Step
    public void agregarVehiculo(ExamplesTable datosPoliza) {
        vehiculoPage.crearVehiculo();
        tarifaAutosPage.relacionarAsegurado();
        vehiculoPage.agregarVehiculo(datosPoliza);
    }

    @Step
    public void agregarModificadores(ExamplesTable valores) {
        modificadoresDeTarifaPage.agregarModificadores(valores);
    }

    @Step
    public void seleciconarCoberturas(ExamplesTable coberturas) {
        vehiculoPage.clickSiguiente();
        tarifaAutosPage.seleccionarCoberturasBasica(coberturas);
        tarifaAutosPage.seleccionarCoberturas1(coberturas);
        tarifaAutosPage.seleccionarCoberturasDanios(coberturas);
        tarifaAutosPage.seleccionarCoberturas2(coberturas);
        tarifaAutosPage.seleccionarCoberturas3(coberturas);
        tarifaAutosPage.cotizar();
    }


    @Step
    public void verificarBonificacion(String bonoComercial, String bonoTecnico) {
        modificadoresDeTarifaPage.verificarBonoTecnico(bonoTecnico);
        modificadoresDeTarifaPage.verificarBonoComercial(bonoComercial);
    }

    @Step
    public void verificarTarifacionPorCoberturas(ExamplesTable valor) {
        modificadoresDeTarifaPage.verificarTarifacionPorCoberturas(valor);
    }
}
