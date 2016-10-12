package com.sura.policycenter.selenium.steps;


import com.sura.policycenter.selenium.pages.ModificadoresDeTarifaPage;
import com.sura.policycenter.selenium.pages.TarifaAutosPage;
import com.sura.policycenter.selenium.pages.ValidacionesInformacionDeVehiculoPage;
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
    public void agregar_placa_y_asegurado(String placa) {
        vehiculoPage.crearVehiculo();
        tarifaAutosPage.relacionarAsegurado();
        vehiculoPage.agregarPlaca(placa);
    }

    @Step
    public void agregar_vehiculo(ExamplesTable datosPoliza) {
        vehiculoPage.crearVehiculo();
        tarifaAutosPage.relacionarAsegurado();
        vehiculoPage.agregarVehiculo(datosPoliza);
    }

    @Step
    public void agregar_modificadores(ExamplesTable valores) {
        modificadoresDeTarifaPage.agregarModificadores(valores);
    }

    @Step
    public void seleciconar_coberturas(ExamplesTable coberturas) {
        vehiculoPage.clickSiguiente();
        tarifaAutosPage.setCoberturas(coberturas);
        tarifaAutosPage.seleccionarCoberturas(coberturas);
        tarifaAutosPage.desMarcarCoberturaDanios();
        tarifaAutosPage.seleccionarCoberturasDeDanios(coberturas);
        tarifaAutosPage.cambiarTipoPlazo();
        tarifaAutosPage.cotizar();
    }


    @Step
    public void verificar_bonificacion(String bonoComercial, String bonoTecnico) {
        modificadoresDeTarifaPage.verificarBonoTecnico(bonoTecnico);
        modificadoresDeTarifaPage.verificarBonoComercial(bonoComercial);
    }

    @Step
    public void verificar_tarifacion_por_coberturas(ExamplesTable valor) {
        modificadoresDeTarifaPage.verificarTarifacionPorCoberturas(valor);
    }
}
