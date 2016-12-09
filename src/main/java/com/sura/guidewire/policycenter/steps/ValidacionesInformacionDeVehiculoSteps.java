package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.ValidacionesInformacionDeVehiculoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

import java.util.HashMap;
import java.util.Map;

public class ValidacionesInformacionDeVehiculoSteps extends ScenarioSteps{

    ValidacionesInformacionDeVehiculoPage vehiculoPage = new ValidacionesInformacionDeVehiculoPage(getDriver());

    public ValidacionesInformacionDeVehiculoSteps(Pages pages){
        super(pages);
    }


    @Step
    public void verificar_mensajes(ExamplesTable mensajes) {
        vehiculoPage.verificarMensajes(mensajes);
    }

    @Step
    public void ir_a_vehiculos() {
        vehiculoPage.irAVehiculos();
    }

    @Step
    public void crearVehiculo(){
        vehiculoPage.crearVehiculo();
    }

    @Step
    public void agregarCodigoFasecolda(String codigo) {
        vehiculoPage.agregarCodigoFasecolda(codigo);
    }

    @Step
    public void verificarEstadoDelCampoCodigo() {
        vehiculoPage.verificarEstadoDelCampoCodigo();
    }

    @Step
    public void agregarVehiculo(ExamplesTable datosVehiculo) {
        vehiculoPage.crearVehiculo();
        vehiculoPage.agregarVehiculo(datosVehiculo);
    }

    @Step
    public void siguiente(){
        vehiculoPage.clickSiguiente();
    }

    @Step
    public void validarAvanceSiguientePagina() {
        vehiculoPage.validarAvanceSiguientePagina();
    }

    @Step
    public void agregarPlaca() {
        HashMap<String, String> vehiculo = new HashMap<String, String>();
        vehiculo.put("placa", "random");
        vehiculo.put("modelo", "2010");
        vehiculoPage.irAVehiculos();
        vehiculoPage.ingresarPlacaConModelo2011(vehiculo);
        vehiculoPage.seleccionarComboBoxModelo(vehiculo);
        vehiculo.put("modelo", "2011");
        vehiculoPage.seleccionarComboBoxModelo(vehiculo);
    }
}
