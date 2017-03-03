package com.sura.guidewire.policycenter.steps.tarifacion;


import com.sura.guidewire.policycenter.pages.poliza.ValidacionesInformacionDeVehiculoPage;
import com.sura.guidewire.policycenter.pages.tarifacion.ModificadoresDeTarifaPage;
import com.sura.guidewire.policycenter.pages.tarifacion.TarifaAutosPage;
import com.sura.guidewire.policycenter.pages.tarifacion.TarifaTasaUnicaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

public class ModificadoresDeTarifaSteps extends ScenarioSteps {
    @Page
    ModificadoresDeTarifaPage modificadoresDeTarifaPage;
    @Page
    ValidacionesInformacionDeVehiculoPage vehiculoPage;
    @Page
    TarifaAutosPage tarifaAutosPage;
    @Page
    TarifaTasaUnicaPage tasaUnicaPage;

    public ModificadoresDeTarifaSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void agregarPlacaYAsegurado(String placa) {
        vehiculoPage.crearVehiculo();
        vehiculoPage.agregarPlaca(placa);
        tarifaAutosPage.relacionarAsegurado();
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
    public void verificarTarifacionPorCoberturas(ExamplesTable datos) {
        modificadoresDeTarifaPage.verificarTarifacionPorCoberturas(datos);
    }

    @Step
    public void cambiarBonificacion(String bonoC, String bonoT) {
        modificadoresDeTarifaPage.cambiarBonificacion(bonoC, bonoT);
        vehiculoPage.clickSiguiente();
    }

    @Step
    public void cambiarFechaDeVigencia() {
        tasaUnicaPage.cambiarFechaDeVigencia();
    }

    @Step
    public void cambiarBonificacionTecnicaYValidarCampos(String bonoT) {
        modificadoresDeTarifaPage.cambiarBonificacionTecnica(bonoT);
        modificadoresDeTarifaPage.verificarModificadoresHabilitados();
    }

    @Step
    public void comenzarCambioDePoliza() {
        tasaUnicaPage.nuevoCambioDePoliza();
    }

    @Step
    public void comenzarSustitucion() {
        tasaUnicaPage.comenzarSustitucion();
    }

    @Step
    public void verificarPermanenciaDeBonificacion(ExamplesTable planes, String bonoC) {
        modificadoresDeTarifaPage.verificarPermanenciaDeBonificacion(planes, bonoC);
    }

    @Step
    public void verificarUW(String mensaje) {
        modificadoresDeTarifaPage.verificarUW(mensaje);
    }

    @Step
    public void verificarRecalculoDeBonificacion(String plan, String placa, String bonoC) {
        modificadoresDeTarifaPage.verificarRecalculoDeBonificacion(plan, placa, bonoC);
    }

    @Step
    public void verificarBonificacionAlCambiarAsegurado(ExamplesTable datos) {
        Map<String, String> dato = datos.getRow(0);
        tarifaAutosPage.agregarAsegurado(dato.get("tipo_documento"), dato.get("documento"));
        modificadoresDeTarifaPage.irAVehiculos();
        modificadoresDeTarifaPage.verificarBonificacionDeNuevoAsegurado(dato);
    }

    @Step
    public void cambiarBonificacionTecnica(String bonoT) {
        modificadoresDeTarifaPage.cambiarBonificacionTecnica(bonoT);
    }
}
