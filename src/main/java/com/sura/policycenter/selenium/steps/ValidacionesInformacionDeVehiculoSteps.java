package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.ValidacionesInformacionDeVehiculoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

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
    public void crear_vehiculo(){
        vehiculoPage.crearVehiculo();
    }

    @Step
    public void agregar_codigo_fasecolda(String codigo) {
        vehiculoPage.agregarCodigoFasecolda(codigo);
    }

    @Step
    public void verificar_estado_del_campo_codigo() {
        vehiculoPage.verificarEstadoDelCampoCodigo();
    }

    @Step
    public void agregar_vehiculo(ExamplesTable datosVehiculo) {
        vehiculoPage.agregarVehiculo(datosVehiculo);
        vehiculoPage.crearVehiculo();
    }
}
