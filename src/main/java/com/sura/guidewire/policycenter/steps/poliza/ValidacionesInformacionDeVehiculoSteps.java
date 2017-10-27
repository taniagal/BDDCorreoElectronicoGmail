package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.poliza.ValidacionesInformacionDeVehiculoPage;

import java.util.HashMap;
import java.util.Map;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import org.jbehave.core.model.ExamplesTable;

public class ValidacionesInformacionDeVehiculoSteps extends ScenarioSteps {

    ValidacionesInformacionDeVehiculoPage vehiculoPage = new ValidacionesInformacionDeVehiculoPage(getDriver());

    public ValidacionesInformacionDeVehiculoSteps(Pages pages) {
        super(pages);
    }


    @Step
    public void verificarMensajes(ExamplesTable mensajes) {
        vehiculoPage.verificarMensajes(mensajes);
    }

    @Step
    public void irAVehiculos() {
        vehiculoPage.irAVehiculos();
    }

    @Step
    public void crearVehiculo() {
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
    public void siguiente() {
        vehiculoPage.clickSiguiente();
    }

    @Step
    public void validarAvanceSiguientePagina() {
        vehiculoPage.validarAvanceSiguientePagina();
    }

    @Step
    public void agregarPlaca() {
        Map<String, String> vehiculo = new HashMap<>();
        vehiculo.put("placa", "random");
        vehiculo.put("modelo", "2010");
        vehiculo.put("ciudad_circulacion", "MEDELLIN");
        vehiculo.put("medioVenta", "Televentas");
        vehiculoPage.irAVehiculos();
        vehiculoPage.ingresarPlacaConModelo2011(vehiculo);
        vehiculoPage.seleccionarComboBoxModelo(vehiculo);
        vehiculo.put("modelo", "2011");
        vehiculoPage.seleccionarComboBoxModelo(vehiculo);
        vehiculoPage.seleccionarCiudadDeCirculacion(vehiculo);
    }

    @Step
    public void verficarOficinaRadicacion(String oficina){
        vehiculoPage.verificarOficinaRadicacion(oficina);
    }


    @Step
    public void validarMensajeConcesionario(){
        vehiculoPage.validarMensajeConcesionario();
    }


    public void validarMayusculaDeMotorYChasis() {
        vehiculoPage.validarMayusculaDeMotorYChasis();
    }
}
